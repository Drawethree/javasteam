package pl.l7ssha.javasteam.marketplace;

import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;

import java.util.concurrent.CompletableFuture;

// pl.l7ssha.javasteam.marketplace
//
// Date created: 21 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public interface Priceable {
    MarketplaceItemPrice getPrice();
    CompletableFuture<MarketplaceItemPrice> getPriceAsync();
}
