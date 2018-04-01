package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.storefront
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.storefront.models.BaseSteamGame;
import pl.l7ssha.javasteam.storefront.models.RichSteamGame;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.Responser;

public class StoreFrontService {
    StoreFrontService() { }

    public RichSteamGame getFullInfoOfApp(String id) {
        return (RichSteamGame) Responser.getResponse(String.format(Links.shopGetAppUrl, id), RichSteamGame.class);
    }

    public BaseSteamGame getBaseInfoOfApp(String id) {
        return (BaseSteamGame) Responser.getResponse(String.format(Links.shopGetAppUrl, id), RichSteamGame.class);
    }
}
