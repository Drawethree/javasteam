package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.steamuser.ISteamUser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VanityUrlResolverTests {
    static SteamUserService usrApi;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);

        usrApi = new SteamAPI(token).getService(SteamUserService.class);
    }

    @Test
    void vanityResolvTest() {
        ISteamUser user = usrApi.getSteamUser("l7ssha");

        assertNotNull(user.getBans().getDaysSinceLastBan());
    }
}
