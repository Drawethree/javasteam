package pl.l7ssha.javasteam.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.MarketplaceService;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItem;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItemTf2;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItems;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;
import pl.l7ssha.javasteam.marketplace.marketplacequery.MarketplaceListings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

// pl.l7ssha.javasteam.test
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class MarketplaceTests {
    static MarketplaceService marketplaceService;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        marketplaceService = new SteamAPI(token).getService(MarketplaceService.class);
    }

    @Test
    void getDotaItem() {
        MarketplaceItemPrice item = marketplaceService.getItemPrices(570L, "Exalted Feast of Abscession Bundle", true);

        assertTrue(item.getLowestPrice() > 0);
        assertTrue(item.getMedianPrice() > 0);
        assertTrue(item.getVolume() > 0);
    }

    @Test
    void searchInMarketplace() {
        MarketplaceListings search = marketplaceService.searchInMarketplace("csgo", 5);

        assertEquals(5, search.getPageSize());
        assertEquals(search.getStart(), 0);
        assertNotNull(search.getSearchResults().get(3).getName());
        assertNotNull(search.getSearchResults().get(2).getItemDetails().getIconUrl());

        MarketplaceListings next = search.getNext();

        assertEquals(5, next.getPageSize());
        assertEquals(6, next.getStart());
        assertNotNull(next.getSearchResults().get(1).getName());
        assertNotNull(next.getSearchResults().get(1).getItemDetails().getIconUrl());
    }

    @Test
    void getInGameItems() {
        InGameItems items = marketplaceService.getCSGOItemsInGameItems();
        InGameItems tf2Items = marketplaceService.getTf2InGameItems();

        for(InGameItem item: tf2Items.getGameItems()) {
            InGameItemTf2 it = (InGameItemTf2) item;

            assertNotNull(it.getTags().get(0));
        }

        for(InGameItem item: items.getGameItems())
            assertTrue(item.getClassId() > 0);
    }
}
