package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.storefront
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.storefront.*;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class StoreFrontService {
    StoreFrontService() { }

    public RichSteamGame getFullInfoOfApp(String id) {
        return (RichSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public LiteSteamGame getBaseInfoOfApp(String id) {
        return (LiteSteamGame) getResponse(String.format(shopGetAppUrl, id), RichSteamGame.class);
    }

    public StoreFeatured getStoreFeatured() {
        return (StoreFeatured) getResponse(shopFeaturedAppsUrl, StoreFeatured.class);
    }

    public StoreFeaturedCategories getStoreFeaturedCategories() {
        return (StoreFeaturedCategories) getResponse(shopFeaturedCategoriesUrl, StoreFeaturedCategories.class);
    }

    public StorePackage getStorePackageInfo(String id) {
        return (StorePackage) getResponse(String.format(shopPackageDetailsUrl, id), StorePackage.class);
    }
}
