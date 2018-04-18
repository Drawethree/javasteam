package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;
import pl.l7ssha.javasteam.utils.Links;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.encodeString;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

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
}
