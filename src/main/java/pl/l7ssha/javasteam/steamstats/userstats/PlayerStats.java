package pl.l7ssha.javasteam.steamstats.userstats;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// pl.l7ssha.javasteam.steamstats.userstats
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class PlayerStats {
    @SerializedName("steamID")
    private String steamId;
    private String gameName;

    @SerializedName("stats")
    private List<PlayerStat> playerStats;

    public PlayerStats() { }

    public String getSteamId() {
        return steamId;
    }

    public String getGameName() {
        return gameName;
    }

    public List<PlayerStat> getPlayerStats() {
        return playerStats;
    }
}
