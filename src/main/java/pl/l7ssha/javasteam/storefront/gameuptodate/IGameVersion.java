package pl.l7ssha.javasteam.storefront.gameuptodate;

// pl.l7ssha.javasteam.storefront.gameuptodate
//
// Date created: 10 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.utils.annotation.Nullable;

public interface IGameVersion {
    boolean isUpToDate();
    @Nullable
    String getMessage();
}
