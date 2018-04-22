package pl.l7ssha.javasteam.steamuser.playerservice;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.Gameable;
import pl.l7ssha.javasteam.storefront.SteamGame;

public class UserGame implements Gameable {
    @SerializedName("appid")
    protected long appId;

    @SerializedName("playtime_2weeks")
    private int playtimeIn2Weeks;

    @SerializedName("playtime_forever")
    private int playtimeForever;

    @SerializedName("img_icon_url")
    private String iconUrl;

    @SerializedName("img_logo_url")
    private String logoUrl;

    public UserGame() { }

    public int getPlaytimeIn2Weeks() {
        return playtimeIn2Weeks;
    }

    public int getPlaytimeForever() {
        return playtimeForever;
    }

    public String getIconUrl() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, iconUrl);
    }

    public String getLogoUrl() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, logoUrl);
    }

    @Override
    public SteamGame toSteamGame() {
       return new SteamGame(appId);
    }
}
