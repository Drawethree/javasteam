package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.StoreFront;
import pl.l7ssha.javasteam.storefront.models.BaseSteamGame;
import pl.l7ssha.javasteam.storefront.models.RichSteamGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StoreTests {
    static StoreFront storeFront;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        storeFront = new SteamAPI(token).getStoreFront();
    }

    @Test
    void getRichGameInfo() {
        RichSteamGame csgo = storeFront.getFullInfoOfApp("730");

        assertNotNull(csgo);
        assertNotNull(csgo.getAppId());
        assertNotNull(csgo.getGenres().get(0).getDescription());
    }

    @Test
    void getBaseGameInfo() {
        BaseSteamGame csgo = storeFront.getBaseInfoOfApp("730");

        assertNotNull(csgo);
        assertNotNull(csgo.getType());
        assertNotNull(csgo.getPublishers().get(0));
    }
}
