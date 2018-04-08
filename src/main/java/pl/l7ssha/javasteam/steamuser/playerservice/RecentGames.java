package pl.l7ssha.javasteam.steamuser.playerservice;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class RecentGames {
    @SerializedName("total_count")
    private int totalRecentGames;

    private List<UserGame> games;

    public RecentGames() { }

    public int getTotalRecentGames() {
        return totalRecentGames;
    }

    public List<UserGame> getGames() {
        return games;
    }
}
