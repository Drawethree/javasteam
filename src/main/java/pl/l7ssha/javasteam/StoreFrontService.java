package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.storefront
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.storefront.*;
import pl.l7ssha.javasteam.storefront.models.gamelist.GameList;
import pl.l7ssha.javasteam.storefront.models.gamelist.GameListQuery;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class StoreFrontService {
    StoreFrontService() { }

    public RichSteamGame getFullInfoOfApp(String id) {
        return (RichSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public CompletableFuture<RichSteamGame> getFullInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> (RichSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class));
    }

    public LiteSteamGame getBaseInfoOfApp(String id) {
        return (LiteSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public CompletableFuture<LiteSteamGame> getBaseInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> (LiteSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class));
    }

    public StoreFeatured getStoreFeatured() {
        return (StoreFeatured) getResponse(shopFeaturedAppsUrl, StoreFeatured.class);
    }

    public CompletableFuture<StoreFeatured> getStoreFeaturedAsync(String id) {
        return CompletableFuture.supplyAsync(() -> (StoreFeatured) getResponse(shopFeaturedAppsUrl, StoreFeatured.class));
    }

    public StoreFeaturedCategories getStoreFeaturedCategories() {
        return (StoreFeaturedCategories) getResponse(shopFeaturedCategoriesUrl, StoreFeaturedCategories.class);
    }

    public CompletableFuture<StoreFeaturedCategories> getStoreFeaturedCategoriesAsync(String id) {
        return CompletableFuture.supplyAsync(() -> (StoreFeaturedCategories) getResponse(shopFeaturedCategoriesUrl, StoreFeaturedCategories.class));
    }

    public StorePackage getStorePackageInfo(String id) {
        return (StorePackage) getResponse(String.format(shopPackageDetailsUrl, id), StorePackage.class);
    }

    public CompletableFuture<StorePackage> getStorePackageInfoAsync(String id) {
        return CompletableFuture.supplyAsync(() -> (StorePackage) getResponse(String.format(shopPackageDetailsUrl, id), StorePackage.class));
    }

    public GameList searchStore(GameListQuery query) {
        GameList tmp = (GameList) getResponse(query.toString(), GameList.class);

        return tmp.setQuery(query);
    }

    public CompletableFuture<GameList> searchStoreAsync(GameListQuery query) {
        return CompletableFuture.supplyAsync(() -> {
            GameList tmp = (GameList) getResponse(query.toString(), GameList.class);

            return tmp.setQuery(query);
        });
    }
}
