package pl.l7ssha.javasteam.csgo.serverstatus;

import com.google.gson.annotations.SerializedName;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class Matchmaking {
    private String scheduler;

    @SerializedName("online_servers")
    private int onlineServers;

    @SerializedName("online_players")
    private int onlinePlayers;

    @SerializedName("searching_players")
    private int searchingPlayers;

    @SerializedName("search_seconds_avg")
    private int searchSecondsAvg;

    public Matchmaking() { }

    /**
     * Status of scheduler service.
     * @return String with status
     */
    public String getScheduler() {
        return scheduler;
    }

    /**
     * Amount of actual online servers
     * @return Integer value
     */
    public int getOnlineServers() {
        return onlineServers;
    }

    /**
     * Total online players
     * @return Amount of players as Integer
     */
    public int getOnlinePlayers() {
        return onlinePlayers;
    }

    /**
     * Actual amount of players in matchmaking queue
     * @return Amount of Searching Players as Integer
     */
    public int getSearchingPlayers() {
        return searchingPlayers;
    }

    /**
     * Average time in second to find a match
     * @return Time in seconds as Integer
     */
    public int getSearchSecondsAvg() {
        return searchSecondsAvg;
    }
}
