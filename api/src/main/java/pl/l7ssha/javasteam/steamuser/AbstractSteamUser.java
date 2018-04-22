package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.badges.Badges;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getResponse;
import static pl.l7ssha.javasteam.utils.Utils.completePlayerStats;

public abstract class AbstractSteamUser implements ISteamUser {
    protected Long steamId;

    public Long getSteamId() {
        return steamId;
    }

    protected AbstractSteamUser(Long steamId) {
        this.steamId = steamId;
    }

    @Override
    public PlayerStats getStats(String appId) {
        GameSchema schema = getGenericResponse(String.format(appSchemaUrl, appId, "ENG"), GameSchema.class);
        PlayerStats playerStats = getGenericResponse(String.format(playerStatsUrl, steamId, appId), PlayerStats.class);

        return completePlayerStats(playerStats, schema);
    }

    @Override
    public CompletableFuture<PlayerStats> getStatsAsync(String appId) {
        return CompletableFuture.supplyAsync(() -> getStats(appId));
    }

    @Override
    public PlayerAchievements getAchievements(String appId) {
        return getGenericResponse(String.format(playerAchievementsUrl, steamId, appId), PlayerAchievements.class);
    }

    @Override
    public CompletableFuture<PlayerAchievements> getAchievementsAsync(String appId) {
       return CompletableFuture.supplyAsync(() -> getAchievements(appId));
    }

    // TO REWORK PROBABLY
    @Override
    public List<FriendListNode> getFriendList() {
        return (List<FriendListNode>) getResponse(String.format(friendListUrl, steamId), new TypeToken<List<FriendListNode>>() { }.getType());
    }

    @Override
    public CompletableFuture<List<FriendListNode>> getFriendListAsync() {
        return CompletableFuture.supplyAsync(this::getFriendList);
    }

    @Override
    public UserBans getBans() {
        return getGenericResponse(String.format(userBansUrl, steamId), UserBans.class);
    }

    @Override
    public CompletableFuture<UserBans> getBansAsync() {
        return CompletableFuture.supplyAsync(() -> (getBans()));
    }

    @Override
    public UserSummary getSummary() {
        return getGenericResponse(String.format(userSummaryUrl, steamId), UserSummary.class);
    }

    @Override
    public CompletableFuture<UserSummary> getSummaryAsync() {
        return CompletableFuture.supplyAsync(this::getSummary);
    }

    @Override
    public RecentGames getRecentGames() {
        return getGenericResponse(String.format(userRecentGamesUrl, steamId), RecentGames.class);
    }

    @Override
    public CompletableFuture<RecentGames> getRecentGamesAsync() {
        return CompletableFuture.supplyAsync(this::getRecentGames);
    }

    @Override
    public UserGames getOwnedGames() {
        return getGenericResponse(String.format(userGamesUrl, steamId), UserGames.class);
    }

    @Override
    public CompletableFuture<UserGames> getOwnedGamesAsync() {
        return CompletableFuture.supplyAsync(this::getOwnedGames);
    }

    @Override
    public Badges getBadges() {
        return getGenericResponse(String.format(userGetBadgesurl, steamId), Badges.class);
    }

    @Override
    public CompletableFuture<Badges> getBadgesAsync() {
        return CompletableFuture.supplyAsync(this::getBadges);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof AbstractSteamUser)
            return this.steamId.equals(((AbstractSteamUser)o).getSteamId());

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s", this.steamId);
    }
}
