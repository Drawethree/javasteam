package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ISteamUser {
    List<FriendListNode> getFriendList();
    CompletableFuture<List<FriendListNode>> getFriendListAsync();

    UserBans getUserBans();
    CompletableFuture<UserBans> getUserBansAsync();

    UserSummary getUserSummary();
    CompletableFuture<UserSummary> getUserSummaryAsync();

    PlayerAchievements getUserAchievements(String appId);
    CompletableFuture<PlayerAchievements> getUserAchievementsAsync(String appId);

    PlayerStats getUserStats(String appId);
    CompletableFuture<PlayerStats> getUserStatsAsync(String appId);
}
