package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("SteamUserService endpoint tests")
public class SteamUserTests {
    static SteamUserService api;
    static ISteamUser l7ssha;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        api = new SteamAPI(token).getSteamUserService();
        l7ssha = new SteamUser(76561198122791844L);
    }

    @Test
    @DisplayName("Get friends")
    void friendListTest() {
        List<FriendListNode> friendOfl7ssha = l7ssha.getFriendList();

        assertNotNull(l7ssha);
        assertNotNull(friendOfl7ssha.get(10).getFriendSince());
        assertNotNull(friendOfl7ssha.get(1).getRelationship());
    }

    @Test
    @DisplayName("Get friends of friend")
    void friendGetNextFriendTest() {
        List<FriendListNode> friendOfl7ssha = l7ssha.getFriendList();
        ISteamUser someUser = friendOfl7ssha.get(13).getSteamUser();
        List<FriendListNode> someUserFriends = someUser.getFriendList();

        assertNotNull(someUser);
        assertNotNull(someUserFriends.get(10).getFriendSince());
        assertNotNull(someUserFriends.get(1).getRelationship());
    }

    @Test
    @DisplayName("Get user bans")
    void userBansTest() {
        UserBans userBans = l7ssha.getUserBans();

        assertNotNull(userBans.DaysSinceLastBanAsDate());
        assertNotNull(userBans.getNumberOfGameBans());
    }

    @Test
    @DisplayName("User summary check")
    void userSummaryTest() {
        UserSummary l7sshaSummary = l7ssha.getUserSummary();

        assertNotNull(l7sshaSummary.getPersonaState());
        assertNotNull(l7sshaSummary.getProfileUrl());
    }

    @Test
    @DisplayName("User summary get user check")
    void userSummaryGetUserTest() {
        UserSummary l7sshaSummary = l7ssha.getUserSummary();
        ISteamUser l7sshaAgain = l7sshaSummary.getSteamUser();

        assertTrue(l7sshaAgain instanceof SteamUser);
        assertNotNull(l7sshaAgain.getUserBans().getNumberOfGameBans());
    }
}
