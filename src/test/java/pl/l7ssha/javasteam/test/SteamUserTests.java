package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SteamUserTests {
    static SteamUserService api;
    Long l7sshaId = 76561198122791844L;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);

        api = new SteamAPI(token).getSteamUserService();

        System.out.println("[LOG] SteamUserTests Starting");
    }

    @Test
    void friendListTest() {
        ISteamUser l7ssha = api.getSteamUser(l7sshaId);
        List<FriendListNode> friendOfl7ssha = l7ssha.getFriendList();

        Assertions.assertNotNull(l7ssha);
        Assertions.assertNotNull(friendOfl7ssha.get(10).getFriendSince());
        Assertions.assertNotNull(friendOfl7ssha.get(1).getRelationship());
    }

    @Test
    void friendGetNextFriendTest() {
        ISteamUser l7ssha = api.getSteamUser(l7sshaId);
        List<FriendListNode> friendOfl7ssha = l7ssha.getFriendList();

        ISteamUser someUser = friendOfl7ssha.get(13).getSteamUser();
        List<FriendListNode> someUserFriends = someUser.getFriendList();

        Assertions.assertNotNull(someUser);
        Assertions.assertNotNull(someUserFriends.get(10).getFriendSince());
        Assertions.assertNotNull(someUserFriends.get(1).getRelationship());
    }

    @Test
    void userBansTest() {
        ISteamUser l7ssha = api.getSteamUser(l7sshaId);
        UserBans userBans = l7ssha.getUserBans();

        System.out.println(userBans.DaysSinceLastBanAsDate());

        Assertions.assertNotNull(userBans.DaysSinceLastBanAsDate());
        Assertions.assertNotNull(userBans.getNumberOfGameBans());
    }
}
