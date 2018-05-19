package javasteam.example;

// javasteam.example
//
// Date created: 19 May 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.MarketplaceService;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.marketplace.marketplacequery.MarketplaceListings;
import pl.l7ssha.javasteam.marketplace.marketplacequery.MarketplaceSearchResult;

public class Main {

    // For this example I didn't place key in special file or environment variable
    private static String key = "";

    public static void main(String[] args) {

        // Initializing javasteam with your key
        SteamAPI.initialize(key);

        // Get Marketplace Service instance
        MarketplaceService marketplaceService = new MarketplaceService();

        // Get data
        MarketplaceListings searchResults = marketplaceService.searchInMarketplace("ancient", 10);

        for(MarketplaceSearchResult listing : searchResults)
            System.out.println(listing.getName() + " : " + listing.getSellPriceText());
    }
}
