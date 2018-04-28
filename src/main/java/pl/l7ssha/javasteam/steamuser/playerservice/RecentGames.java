package pl.l7ssha.javasteam.steamuser.playerservice;

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class RecentGames implements Iterable<UserGame> {
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

    @Override
    public Iterator<UserGame> iterator() {
        return games.iterator();
    }
}
