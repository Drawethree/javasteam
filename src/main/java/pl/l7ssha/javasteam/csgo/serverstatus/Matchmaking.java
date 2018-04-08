package pl.l7ssha.javasteam.csgo.serverstatus;

import com.google.gson.annotations.SerializedName;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class Matchmaking {
    private String scheduler;

    @SerializedName("online_servers")
    private int onlineServers;

    @SerializedName("online_players")
    private int onlinePlayers;

    @SerializedName("searching_players")
    private int searching_players;

    @SerializedName("search_seconds_avg")
    private int searchSecondsAvg;

    public Matchmaking() { }

    public String getScheduler() {
        return scheduler;
    }

    public int getOnlineServers() {
        return onlineServers;
    }

    public int getOnlinePlayers() {
        return onlinePlayers;
    }

    public int getSearching_players() {
        return searching_players;
    }

    public int getSearchSecondsAvg() {
        return searchSecondsAvg;
    }
}
