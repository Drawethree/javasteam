package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ISteamUser {
    List<FriendListNode> getFriendList();
    CompletableFuture<List<FriendListNode>> getFriendListAsync();

    UserBans getBans();
    CompletableFuture<UserBans> getBansAsync();

    UserSummary getSummary();
    CompletableFuture<UserSummary> getSummaryAsync();

    PlayerAchievements getAchievements(String appId);
    CompletableFuture<PlayerAchievements> getAchievementsAsync(String appId);

    PlayerStats getStats(String appId);
    CompletableFuture<PlayerStats> getStatsAsync(String appId);

    RecentGames getRecentGames();
    CompletableFuture<RecentGames> getRecentGamesAsync();

    UserGames getOwnedGames();
    CompletableFuture<UserGames> getOwnedGamesAsync();
}
