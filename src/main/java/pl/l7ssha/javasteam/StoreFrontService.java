package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.storefront
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.storefront.*;
import pl.l7ssha.javasteam.storefront.gamelist.GameList;
import pl.l7ssha.javasteam.storefront.gamelist.GameListQuery;
import pl.l7ssha.javasteam.storefront.gameuptodate.IGameVersion;
import pl.l7ssha.javasteam.storefront.news.News;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class StoreFrontService {
    StoreFrontService() { }

    public RichSteamGame getFullInfoOfApp(String id) {
        return getGenericResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public CompletableFuture<RichSteamGame> getFullInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getFullInfoOfApp(id));
    }

    public LiteSteamGame getBaseInfoOfApp(String id) {
        return getGenericResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public CompletableFuture<LiteSteamGame> getBaseInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getBaseInfoOfApp(id));
    }

    public StoreFeatured getStoreFeatured() {
        return getGenericResponse(shopFeaturedAppsUrl, StoreFeatured.class);
    }

    public CompletableFuture<StoreFeatured> getStoreFeaturedAsync() {
        return CompletableFuture.supplyAsync(this::getStoreFeatured);
    }

    public StoreFeaturedCategories getStoreFeaturedCategories() {
        return getGenericResponse(shopFeaturedCategoriesUrl, StoreFeaturedCategories.class);
    }

    public CompletableFuture<StoreFeaturedCategories> getStoreFeaturedCategoriesAsync() {
        return CompletableFuture.supplyAsync(this::getStoreFeaturedCategories);
    }

    public StorePackage getStorePackageInfo(String id) {
        return getGenericResponse(String.format(shopPackageDetailsUrl, id), StorePackage.class);
    }

    public CompletableFuture<StorePackage> getStorePackageInfoAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getStorePackageInfo(id));
    }

    public GameList searchStore(GameListQuery query) {
        GameList tmp = getGenericResponse(query.toString(), GameList.class);

        return tmp.setQuery(query);
    }

    public CompletableFuture<GameList> searchStoreAsync(GameListQuery query) {
        return CompletableFuture.supplyAsync(() -> searchStore(query));
    }

    public News getNewsForApp(String id, int count) {
        return getGenericResponse(String.format(newsForApp, id, count), News.class);
    }

    public CompletableFuture<News> getNewsForAppAsync(String id, int count) {
        return CompletableFuture.supplyAsync(() -> getNewsForApp(id, count));
    }

    public IGameVersion checkGameVersion(String id, String version) {
        return getGenericResponse(String.format(shopGameUpToDateUrl, id, version), IGameVersion.class);
    }

    public CompletableFuture<IGameVersion> checkGameVersionAsync(String id, String version) {
        return CompletableFuture.supplyAsync(() -> checkGameVersion(id, version));
    }
}
