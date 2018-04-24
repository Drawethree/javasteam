package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test
//
// Date created: 21 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.StoreFrontService;
import pl.l7ssha.javasteam.reflector.StoreFeaturedReflector;
import pl.l7ssha.javasteam.storefront.StoreFeatured;
import pl.l7ssha.javasteam.storefront.featured.FeaturedItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreFeaturedReflectorTests {
    static StoreFeaturedReflector reflector;

    @BeforeAll
    static void before() throws IOException {
        SteamAPI.initialize(String.valueOf(Files.readAllLines(Paths.get("token.txt"))));

        StoreFeatured featured = new StoreFrontService().getStoreFeatured();

        reflector = new StoreFeaturedReflector(featured);
    }

    @Test
    void findsTest() {
        List<FeaturedItem> items = reflector.filterWin(s -> s.getName().contains("g"));

        assertNotNull(items);
        assertTrue(items.size() > 0);
    }
}
