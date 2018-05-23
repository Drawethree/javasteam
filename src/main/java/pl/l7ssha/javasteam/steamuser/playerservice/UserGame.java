package pl.l7ssha.javasteam.steamuser.playerservice;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis

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

    /**
     * Time of total playtime in 2 weeks in minutes
     * @return Time in minutes
     */
    public int getPlaytimeIn2Weeks() {
        return playtimeIn2Weeks;
    }

    /**
     * Total time in game in minutes
     * @return Time in minutes
     */
    public int getPlaytimeForever() {
        return playtimeForever;
    }

    /**
     * Url to game icon
     * @return Url as String
     */
    public String getIconUrl() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, iconUrl);
    }

    /**
     * Url to game logo
     * @return Url as String
     */
    public String getLogoUrl() {
        return String.format("http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg", appId, logoUrl);
    }

    @Override
    public SteamGame toSteamGame() {
       return new SteamGame(appId);
    }
}
