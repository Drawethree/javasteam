package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.marketplace.ingame.InGameItems;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;
import pl.l7ssha.javasteam.marketplace.marketplacequery.MarketplaceListings;
import pl.l7ssha.javasteam.utils.InGameItemsDeserializer;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.ResponserUtils;
import pl.l7ssha.javasteam.utils.deserializers.IngameItemTf2Deserializer;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.*;

public class MarketplaceService implements ISteamService {

    /**
     * Returns object with item prices
     * @param gameId Id of game
     * @param itemId Name of store item - encoded or bare
     * @param encode Set to true if you have bare name of item
     * @return MarketplaceItemPrice
     */
    public MarketplaceItemPrice getItemPrices(long gameId, String itemId, boolean encode) {
        if(encode)
            itemId = encodeString(itemId);

        return getGenericResponse(String.format(Links.storePricesUrl, gameId, itemId), MarketplaceItemPrice.class);
    }

    /**
     * Asynchronously returns object with item prices
     * @param gameId Id of game
     * @param itemId Name of store item - encoded or bare
     * @param encode Set to true if you have bare name of item
     * @return MarketplaceItemPrice
     */
    public CompletableFuture<MarketplaceItemPrice> getItemPricesAsync(long gameId, String itemId, boolean encode) {
        return CompletableFuture.supplyAsync(() -> getItemPrices(gameId, itemId, encode));
    }

    /**
     * Performs searching in steam marketplace with query
     * @param query String to search with
     * @param pageSize Number of items in single response
     * @return MarketplaceListings
     */
    public MarketplaceListings searchInMarketplace(String query, int pageSize) {
        return ResponserUtils.getGenericResponse(String.format(Links.searchMarketplaceUrl, query, 0, pageSize), MarketplaceListings.class);
    }

    /**
     * Asynchronously performs searching in steam marketplace with query
     * @param query String to search with
     * @param pageSize Number of items in single response
     * @return MarketplaceListings
     */
    public CompletableFuture<MarketplaceListings> searchInMarketAsync(String query, int pageSize) {
        return CompletableFuture.supplyAsync(() -> searchInMarketplace(query, pageSize));
    }

    /**
     * Gets InGameItems for CS:GO
     * @return InGameItems
     */
    public InGameItems getCSGOItemsInGameItems() {
        return getCustomResponse(730L, InGameItems.class, new InGameItemsDeserializer());
    }

    /**
     * Asynchronously gets InGameItems for CS:GO
     * @return InGameItems
     */
    public CompletableFuture<InGameItems> getCSGOItemsInGameItemsAsync() {
        return CompletableFuture.supplyAsync(this::getCSGOItemsInGameItems);
    }

    /**
     * Gets InGameItems for Team Fortress 2
     * @return InGameItems
     */
    public InGameItems getTf2InGameItems() {
        return getCustomResponse(440L, InGameItems.class, new IngameItemTf2Deserializer());
    }

    /**
     * Asynchronously gets InGameItems for Team Fortress 2
     * @return InGameItems
     */
    public CompletableFuture<InGameItems> getTf2ItemsInGameItemsAsync() {
        return CompletableFuture.supplyAsync(this::getTf2InGameItems);
    }

    /**
     * Gets InGameItems for any game. Use this only when response is generic (like dota or csgo).
     * @param gameId Game to get items
     * @return InGameItems
     */
    public InGameItems getInGameItems(long gameId) {
        return getCustomResponse(gameId, InGameItems.class, new InGameItemsDeserializer());
    }

    public CompletableFuture<InGameItems> getInGameItemsAsync(long gameId) {
        return CompletableFuture.supplyAsync(() -> getInGameItems(gameId));
    }
}
