package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 24 Apr 2018
// Author: Szymon 'l7ssha' Uglis


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.reflector.FriendListReflector;
import pl.l7ssha.javasteam.steamuser.FriendList;
import pl.l7ssha.javasteam.steamuser.FriendListNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FriendsReflectorTests {
    static FriendListReflector reflector;

    @BeforeAll
    static void before() throws IOException {

        //wat
        SteamAPI.initialize(String.valueOf(Files.readAllLines(Paths.get("token.txt"))).replace("[", ""). replace("]", ""));

        FriendList friends = new SteamUserService().getSteamUser(76561198122791844L).getFriendList();

        reflector = new FriendListReflector(friends);
    }


    @Test
    void iteratorTest() {
        for(FriendListNode friend: reflector) {
            Assertions.assertNotNull(friend.getSteamId());
        }
    }

    @Test
    void getTest() {
        FriendList friends = reflector.get();

        assertTrue(friends.getFriends().size() > 0);
    }
}
