package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.steamstats.badges.Badges;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public abstract class AbstractSteamUser implements ISteamUser {
    protected Long steamId;

    public Long getSteamId() {
        return steamId;
    }

    protected AbstractSteamUser(Long steamId) {
        this.steamId = steamId;
    }

    /**
     * Player's game stats data.
     * @param appId Game id to get data
     * @return Game stats and statistics
     */
    @Override
    public PlayerStats getStats(String appId) {
        return getGenericResponse(String.format(playerStatsUrl, steamId, appId), PlayerStats.class);
    }

    /**
     * Player's game stats data.
     * @param appId Game id to get data
     * @return Game stats and statistics
     */
    @Override
    public CompletableFuture<PlayerStats> getStatsAsync(String appId) {
        return CompletableFuture.supplyAsync(() -> getStats(appId));
    }

    /**
     * Player's achievements of game
     * @param appId Game id to get data
     * @return Game achievements
     */
    @Override
    public PlayerAchievements getAchievements(String appId) {
        return getGenericResponse(String.format(playerAchievementsUrl, steamId, appId), PlayerAchievements.class);
    }

    /**
     * Player's achievements of game
     * @param appId Game id to get data
     * @return Game achievements
     */
    @Override
    public CompletableFuture<PlayerAchievements> getAchievementsAsync(String appId) {
       return CompletableFuture.supplyAsync(() -> getAchievements(appId));
    }

    /**
     * Player's friends list
     * @return Friends list
     */
    @Override
    public FriendList getFriendList() {
        return getGenericResponse(String.format(friendListUrl, steamId), FriendList.class);
    }

    /**
     * Player's friends list
     * @return Friends list
     */
    @Override
    public CompletableFuture<FriendList> getFriendListAsync() {
        return CompletableFuture.supplyAsync(this::getFriendList);
    }

    /**
     * Player's bans
     * @return Bans
     */
    @Override
    public UserBans getBans() {
        return getGenericResponse(String.format(userBansUrl, steamId), UserBans.class);
    }

    /**
     * Player's bans
     * @return Bans
     */
    @Override
    public CompletableFuture<UserBans> getBansAsync() {
        return CompletableFuture.supplyAsync(() -> (getBans()));
    }

    /**
     * Summary of account
     * @return Summary object
     */
    @Override
    public UserSummary getSummary() {
        return getGenericResponse(String.format(userSummaryUrl, steamId), UserSummary.class);
    }

    /**
     * Summary of account
     * @return Summary object
     */
    @Override
    public CompletableFuture<UserSummary> getSummaryAsync() {
        return CompletableFuture.supplyAsync(this::getSummary);
    }

    /**
     * List of recently played games by user
     * @return List of recent games
     */
    @Override
    public RecentGames getRecentGames() {
        return getGenericResponse(String.format(userRecentGamesUrl, steamId), RecentGames.class);
    }

    /**
     * List of recently played games by user
     * @return List of recent games
     */
    @Override
    public CompletableFuture<RecentGames> getRecentGamesAsync() {
        return CompletableFuture.supplyAsync(this::getRecentGames);
    }

    /**
     * List of all user's games
     * @return game list
     */
    @Override
    public UserGames getOwnedGames() {
        return getGenericResponse(String.format(userGamesUrl, steamId), UserGames.class);
    }

    /**
     * List of all user's games
     * @return game list
     */
    @Override
    public CompletableFuture<UserGames> getOwnedGamesAsync() {
        return CompletableFuture.supplyAsync(this::getOwnedGames);
    }

    /**
     * Badges and user level
     * @return Badges list and user account level
     */
    @Override
    public Badges getBadges() {
        return getGenericResponse(String.format(userGetBadgesurl, steamId), Badges.class);
    }

    /**
     * Badges and user level
     * @return Badges list and user account level
     */
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
