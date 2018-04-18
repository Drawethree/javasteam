package pl.l7ssha.javasteam.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.MarketplaceService;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

// pl.l7ssha.javasteam.test
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class MarketplaceTests {
    static MarketplaceService marketplaceService;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        marketplaceService = new SteamAPI(token).getService(MarketplaceService.class);
    }

    @Test
    void getDotaItem() {
        MarketplaceItemPrice item = marketplaceService.getItemPrices(570L, "Exalted Feast of Abscession Bundle");

        assertTrue(item.getLowestPrice() > 0);
        assertTrue(item.getMedianPrice() > 0);
        assertTrue(item.getVolume() > 0);
    }
}
