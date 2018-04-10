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

    /**
     * Returns full set of data about app.
     * @param id Id of app
     * @return RichSteamGame
     */
    public RichSteamGame getFullInfoOfApp(String id) {
        return getGenericResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    /**
     * Asynchronously returns full set of data about app.
     * @param id Id of app
     * @return CompletableFuture
     */
    public CompletableFuture<RichSteamGame> getFullInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getFullInfoOfApp(id));
    }

    /**
     * Returns basic info about game
     * @param id Id of app
     * @return LiteSteamGame
     */
    public LiteSteamGame getBaseInfoOfApp(String id) {
        return getGenericResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    /**
     * Asynchronously returns basic info about game
     * @param id Id of app
     * @return CompletableFuture
     */
    public CompletableFuture<LiteSteamGame> getBaseInfoOfAppAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getBaseInfoOfApp(id));
    }

    /**
     * Fetches current featured games in steam store
     * @return StoreFeatured
     */
    public StoreFeatured getStoreFeatured() {
        return getGenericResponse(shopFeaturedAppsUrl, StoreFeatured.class);
    }

    /**
     * Asynchronously fetches current featured games in steam store.
     * @return CompletableFuture
     */
    public CompletableFuture<StoreFeatured> getStoreFeaturedAsync() {
        return CompletableFuture.supplyAsync(this::getStoreFeatured);
    }

    /**
     * Fetches current featured games in steam store.
     * @return StoreFeaturedCategories
     */
    public StoreFeaturedCategories getStoreFeaturedCategories() {
        return getGenericResponse(shopFeaturedCategoriesUrl, StoreFeaturedCategories.class);
    }

    /**
     * Asynchronously fetches current featured games in steam store.
     * @return StoreFeaturedCategories
     */
    public CompletableFuture<StoreFeaturedCategories> getStoreFeaturedCategoriesAsync() {
        return CompletableFuture.supplyAsync(this::getStoreFeaturedCategories);
    }

    /**
     * Gets info about bundle(package)
     * @param id Bundle ID
     * @return StorePackage
     */
    public StorePackage getStorePackageInfo(String id) {
        return getGenericResponse(String.format(shopPackageDetailsUrl, id), StorePackage.class);
    }

    /**
     * Asynchronously gets info about bundle(package)
     * @param id Bundle ID
     * @return CompletableFuture
     */
    public CompletableFuture<StorePackage> getStorePackageInfoAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getStorePackageInfo(id));
    }

    /**
     * Searches store for apps with query.
     * @param query Query object
     * @return GameList
     */
    public GameList searchStore(GameListQuery query) {
        GameList tmp = getGenericResponse(query.toString(), GameList.class);

        return tmp.setQuery(query);
    }

    /**
     * Asynchronously searches store for games with query.
     * @param query Query object
     * @return GameList
     */
    public CompletableFuture<GameList> searchStoreAsync(GameListQuery query) {
        return CompletableFuture.supplyAsync(() -> searchStore(query));
    }

    /**
     * Gets news for app.
     * @param id Id of app
     * @param count Count of results to return
     * @return News
     */
    public News getNewsForApp(String id, int count) {
        return getGenericResponse(String.format(newsForApp, id, count), News.class);
    }

    /**
     * Asynchronously gets news for app.
     * @param id Id of app
     * @param count Count of results to return
     * @return News
     */
    public CompletableFuture<News> getNewsForAppAsync(String id, int count) {
        return CompletableFuture.supplyAsync(() -> getNewsForApp(id, count));
    }

    /**
     * Checks given game version is newest one.
     * @param id If of app
     * @param version Version string
     * @return IGameVersion
     */
    public IGameVersion checkGameVersion(String id, String version) {
        return getGenericResponse(String.format(shopGameUpToDateUrl, id, version), IGameVersion.class);
    }

    /**
     * Asynchronously checks given game version is newest one.
     * @param id If of app
     * @param version Version string
     * @return IGameVersion
     */
    public CompletableFuture<IGameVersion> checkGameVersionAsync(String id, String version) {
        return CompletableFuture.supplyAsync(() -> checkGameVersion(id, version));
    }
}
