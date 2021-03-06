package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.steamstats.badges.Badges;
import pl.l7ssha.javasteam.steamstats.badges.GameBadge;
import pl.l7ssha.javasteam.steamstats.userachievements.PlayerAchievements;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStat;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;
import pl.l7ssha.javasteam.steamuser.*;
import pl.l7ssha.javasteam.steamuser.groups.GroupInfo;
import pl.l7ssha.javasteam.steamuser.playerservice.RecentGames;
import pl.l7ssha.javasteam.steamuser.playerservice.UserGames;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SteamUserService endpoint tests")
public class SteamUserTests {
    static SteamUserService api;
    static ISteamUser l7ssha;

    @BeforeAll
    static void getToken() throws IOException {
        String token = System.getenv("STEAM_TOKEN");
        api = new SteamAPI(token).getService(SteamUserService.class);
        l7ssha = new SteamUser(76561198122791844L);
    }

    @Test
    @DisplayName("Get friends")
    void friendListTest() {
        FriendList friendOfl7ssha = l7ssha.getFriendList();

        assertNotNull(l7ssha);
        assertNotNull(friendOfl7ssha.getFriends().get(10).getFriendSince());
        assertNotNull(friendOfl7ssha.getFriends().get(1).getRelationship());
    }

    @Test
    @DisplayName("Get friends of friend")
    void friendGetNextFriendTest() {
        FriendList friendOfl7ssha = l7ssha.getFriendList();
        ISteamUser someUser = friendOfl7ssha.getFriends().get(13).getSteamUser();
        FriendList someUserFriends = someUser.getFriendList();

        assertNotNull(someUser);
        assertNotNull(someUserFriends.getFriends().get(10).getFriendSince());
        assertNotNull(someUserFriends.getFriends().get(1).getRelationship());
    }

    @Test
    @DisplayName("Get user bans")
    void userBansTest() {
        UserBans userBans = l7ssha.getBans();

        assertNotNull(userBans.DaysSinceLastBanAsDate());
        assertNotNull(userBans.getNumberOfGameBans());
    }

    @Test
    @DisplayName("User summary check")
    void userSummaryTest() {
        UserSummary l7sshaSummary = l7ssha.getSummary();

        assertNotNull(l7sshaSummary.getPersonaState());
        assertNotNull(l7sshaSummary.getProfileUrl());
        assertNotNull(l7sshaSummary.getRealname());
        assertNotNull(l7sshaSummary.getAvatarFull());
    }

    @Test
    @DisplayName("User summary get user check")
    void userSummaryGetUserTest() {
        UserSummary l7sshaSummary = l7ssha.getSummary();
        ISteamUser l7sshaAgain = l7sshaSummary.getSteamUser();

        assertTrue(l7sshaAgain instanceof SteamUser);
        assertFalse(l7ssha instanceof NamedSteamUser);

        assertEquals(l7ssha, l7sshaAgain);
        assertNotNull(l7ssha.getBans().getEconomyBan());

        assertNotNull(l7sshaAgain.getFriendList().getFriends().get(3).getRelationship());
        assertNotNull(l7sshaAgain.getBans().getEconomyBan());
    }

    @Test
    void playerAcheivementsTest() {
        PlayerAchievements achievements = l7ssha.getAchievements("730");

        assertNotNull(achievements.getAchievements().get(1).getUnlockTime());
        assertNotNull(achievements.getAchievements().get(1).getApiName());
        assertNotNull(achievements.getAchievements().get(1).getDescription());
    }

    @Test
    void playerStatsTest() {
        PlayerStats stats = l7ssha.getStats("730");

        assertNotNull(stats.getGameName());
        assertNotNull(stats.getSteamId());
        assertNull(stats.getPlayerStats().get(1).getDescription());

        List<PlayerStat> playerStatsWithDescription = stats.getPlayerStatsWithDescription(730L);
        assertNotNull(playerStatsWithDescription.get(0).getDescription());
    }

    @Test
    void recentGamesTest() {
        RecentGames games = l7ssha.getRecentGames();

        assertTrue(games.getTotalRecentGames() > 0);
        assertNotNull(games.getGames().get(0).getIconUrl());
        assertTrue(games.getTotalRecentGames() > 0);
    }

    @Test
    void ownedGames() {
        UserGames games = l7ssha.getOwnedGames();

        assertNotNull(games.getGames().get(10).getIconUrl());
        assertTrue(games.getGameCount() > 0);
        assertNotNull(games.getGames().get(1).getLogoUrl());
    }

    @Test
    void getBadgesTest() {
        Badges badges = l7ssha.getBadges();

        assertTrue(badges.getBadges().size() > 0);
        assertTrue(badges.getPlayerXpCurrent() > 0);

        assertNotNull(badges.getBadges().get(1).getCompletionTime());
        assertTrue(badges.getBadges().get(3).getLevel() > 0);

        assertTrue(badges.getBadges().get(6) instanceof GameBadge);

        GameBadge special = (GameBadge) badges.getBadges().get(6);
        assertEquals(0, special.getBorderColor());
    }

    @Test
    void XMLgroupsTest() {
        GroupInfo info = api.getGroupInfo(103582791429521412L);

        assertNotNull(info.getDetails());
        assertNotNull(info.getDetails().getAvatarIcon());
        assertNotNull(info.getMembersIds().get(40));
    }
}
