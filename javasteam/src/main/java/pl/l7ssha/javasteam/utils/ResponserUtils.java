package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.utils.deserializers.MapsPlaytimeDeserializer;
import pl.l7ssha.javasteam.utils.deserializers.ServerStatusDeserializer;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;
import pl.l7ssha.javasteam.utils.deserializers.MarketplaceItemPriceDeserializer;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.utils.deserializers.GameSchemaDeserializer;
import pl.l7ssha.javasteam.steamstats.badges.Badges;
import pl.l7ssha.javasteam.utils.deserializers.BadgesDeserializer;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.utils.deserializers.AchievementsGlobalPercentagesDeserializer;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.utils.deserializers.PlayerAchievementsDeserializer;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.utils.deserializers.PlayerStatsDeserializer;
import pl.l7ssha.javasteam.steamuser.*;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;
import pl.l7ssha.javasteam.storefront.RichSteamGame;
import pl.l7ssha.javasteam.utils.deserializers.*;
import pl.l7ssha.javasteam.storefront.StorePackage;
import pl.l7ssha.javasteam.storefront.gamelist.GameList;
import pl.l7ssha.javasteam.storefront.gameuptodate.IGameVersion;
import pl.l7ssha.javasteam.storefront.news.News;
import pl.l7ssha.javasteam.storefront.steamgame.CurrentPlayers;
import pl.l7ssha.javasteam.utils.exceptions.SteamApiNotInitializedException;
import pl.l7ssha.javasteam.vanity.VanityUrl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

public class ResponserUtils {
    private static Gson gson = new GsonBuilder()
            .registerTypeAdapter(ServerStatus.class, new ServerStatusDeserializer())
            .registerTypeAdapter(MapPlaytime.class, new MapsPlaytimeDeserializer())
            .registerTypeAdapter(new TypeToken<List<FriendListNode>>() { }.getType(), new FriendListDeserializer())
            .registerTypeAdapter(UserBans.class, new UserBansDeserializer())
            .registerTypeAdapter(UserSummary.class, new UserSumaryDeserializer())
            .registerTypeAdapter(RichSteamGame.class, new SteamGameDeserializer())
            .registerTypeAdapter(StorePackage.class, new StorePackageDeserializer())
            .registerTypeAdapter(VanityUrl.class, new SimpleDeserializer<>(VanityUrl.class))
            .registerTypeAdapter(GameList.class, new GameListDeserializer())
            .registerTypeAdapter(News.class, new NewsDeserializer())
            .registerTypeAdapter(CurrentPlayers.class, new SimpleDeserializer<>(CurrentPlayers.class))
            .registerTypeAdapter(GameSchema.class, new GameSchemaDeserializer())
            .registerTypeAdapter(AchievementsGlobalPercentages.class, new AchievementsGlobalPercentagesDeserializer())
            .registerTypeAdapter(PlayerAchievements.class, new PlayerAchievementsDeserializer())
            .registerTypeAdapter(PlayerStats.class, new PlayerStatsDeserializer())
            .registerTypeAdapter(RecentGames.class, new SimpleDeserializer<>(RecentGames.class))
            .registerTypeAdapter(UserGames.class, new SimpleDeserializer<>(UserGames.class))
            .registerTypeAdapter(Badges.class, new BadgesDeserializer())
            .registerTypeAdapter(IGameVersion.class, new IGameVersionDeserializer())
            .registerTypeAdapter(MarketplaceItemPrice.class, new MarketplaceItemPriceDeserializer())
            .create();

    private static String token = "";

    public static void setToken(String token) {
        ResponserUtils.token = token;
    }

    private static String getResponseString(String url) {
        if(token.equals(""))
            throw new SteamApiNotInitializedException("Can't get response from server without token. Initialize SteamAPI fist");

        HttpRequest req = HttpRequest.get(getRequestUrl(url));

        if(req.code() != 200)
            throw new HttpRequest.HttpRequestException(new IOException("Server returned with code " + req.code() + ", with message: "+ req.body() + "at endpoint: " + (url+token)));

        return req.body();
    }

    private static String getRequestUrl(String url) {
        if(url.endsWith("key="))
           return (url + token);

        return url;
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        }
        catch(UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object getResponse(String url, Type type) {
        return gson.fromJson(getResponseString(url), type);
    }

    public static <T> T getGenericResponse(String url, Class<T> type) {
        return gson.fromJson(getResponseString(url), type);
    }

    public static <T> T getXMLResponse(String url, Class<T> type) {
        JAXBContext jaxbContext;
        try {
           jaxbContext = JAXBContext.newInstance(type);
        } catch(JAXBException e) {
            throw new RuntimeException(e);
        }

        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch(JAXBException e) {
            throw new RuntimeException(e);
        }

        try {
            return (T) unmarshaller.unmarshal(new URL(url));
        } catch(JAXBException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
