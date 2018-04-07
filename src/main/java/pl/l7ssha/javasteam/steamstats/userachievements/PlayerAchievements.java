package pl.l7ssha.javasteam.steamstats.userachievements;

// pl.l7ssha.javasteam.steamstats.userachievements
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;
import pl.l7ssha.javasteam.steamuser.Userable;

import java.util.List;

public class PlayerAchievements implements Userable {
    private long steamID;
    private String gameName;

    private List<PlayerAchievement> achievements;

    public PlayerAchievements() { }

    public long getSteamID() {
        return steamID;
    }

    public String getGameName() {
        return gameName;
    }

    public List<PlayerAchievement> getAchievements() {
        return achievements;
    }

    @Override
    public ISteamUser getSteamUser() {
        return new SteamUser(steamID);
    }
}
