package pl.l7ssha.javasteam.steamuser.playerservice;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.List;


// I left [has_community_visible_stats], because I think i isn't that need.
public class UserGames {
    @SerializedName("game_count")
    private int gameCount;

    private List<UserGame> games;

    public UserGames() { }

    public int getGameCount() {
        return gameCount;
    }

    public List<UserGame> getGames() {
        return games;
    }
}
