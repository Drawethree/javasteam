package pl.l7ssha.javasteam.storefront.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public enum ControllerSupport {
    @SerializedName("partial")
    PARTIAL,
    @SerializedName("full")
    FULL
}
