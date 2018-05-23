package pl.l7ssha.javasteam.steamuser.playerservice;

// pl.l7ssha.javasteam.steamuser.playerservice
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;


// I left [has_community_visible_stats], because I think i isn't that need.
public class UserGames implements Iterable<UserGame> {
    @SerializedName("game_count")
    private int gameCount;

    private List<UserGame> games;

    public UserGames() { }

    /**
     * Number of recently played games
     * @return Number of recently played games
     */
    public int getGameCount() {
        return gameCount;
    }

    /**
     * Recently played games
     * @return List of recently played games
     */
    public List<UserGame> getGames() {
        return games;
    }

    @Override
    public Iterator<UserGame> iterator() {
        return games.iterator();
    }
}
