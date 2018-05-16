package pl.l7ssha.javasteam.marketplace;

import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;

import java.util.concurrent.CompletableFuture;

// pl.l7ssha.javasteam.marketplace
//
// Date created: 21 Apr 2018
// Author: Szymon 'l7ssha' Uglis

/**
 * Provides abstraction for getting store prices
 */
public interface Priceable {
    MarketplaceItemPrice getPrice();
    CompletableFuture<MarketplaceItemPrice> getPriceAsync();
}
