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
import pl.l7ssha.javasteam.csgo.MapsPlaytimeDeserializer;
import pl.l7ssha.javasteam.csgo.ServerStatusDeserializer;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.schema.GameSchemaDeserializer;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentagesDeserializer;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievementsDeserializer;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStatsDeserializer;
import pl.l7ssha.javasteam.steamuser.*;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;
import pl.l7ssha.javasteam.storefront.RichSteamGame;
import pl.l7ssha.javasteam.storefront.SteamGameDeserializer;
import pl.l7ssha.javasteam.storefront.StorePackage;
import pl.l7ssha.javasteam.storefront.StorePackageDeserializer;
import pl.l7ssha.javasteam.storefront.gamelist.GameList;
import pl.l7ssha.javasteam.storefront.gamelist.GameListDeserializer;
import pl.l7ssha.javasteam.storefront.news.News;
import pl.l7ssha.javasteam.storefront.news.NewsDeserializer;
import pl.l7ssha.javasteam.storefront.steamgame.CurrentPlayers;
import pl.l7ssha.javasteam.utils.exceptions.SteamApiNotInitializedException;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlDeserializer;

import java.io.IOException;
import java.lang.reflect.Type;
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
            .registerTypeAdapter(VanityUrl.class, new VanityUrlDeserializer())
            .registerTypeAdapter(GameList.class, new GameListDeserializer())
            .registerTypeAdapter(News.class, new NewsDeserializer())
            .registerTypeAdapter(CurrentPlayers.class, new SimpleDeserializer<CurrentPlayers>(CurrentPlayers.class))
            .registerTypeAdapter(GameSchema.class, new GameSchemaDeserializer())
            .registerTypeAdapter(AchievementsGlobalPercentages.class, new AchievementsGlobalPercentagesDeserializer())
            .registerTypeAdapter(PlayerAchievements.class, new PlayerAchievementsDeserializer())
            .registerTypeAdapter(PlayerStats.class, new PlayerStatsDeserializer())
            .registerTypeAdapter(RecentGames.class, new SimpleDeserializer<RecentGames>(RecentGames.class))
            .registerTypeAdapter(UserGames.class, new SimpleDeserializer<UserGames>(UserGames.class))
            .create();

    private static String token = "";

    public static void setToken(String token) {
        ResponserUtils.token = token;
    }

    public static Object getResponse(String url, Type type) {
        if(token.equals(""))
            throw new SteamApiNotInitializedException("Can't get response from server without token. Initialize SteamAPI fist");

        HttpRequest req = HttpRequest.get((url + token));

        if(req.code() != 200)
            throw new HttpRequest.HttpRequestException(new IOException("Server returned with code " + req.code() + ", with message: "+ req.body()));

        return gson.fromJson(req.body(), type);
    }
}
