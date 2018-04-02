package pl.l7ssha.javasteam.storefront.models.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public enum GameType {
    @SerializedName("game")
    GAME,
    @SerializedName("dlc")
    DLC,
    @SerializedName("demo")
    DEMO,
    @SerializedName("advertising")
    ADVERTISING,
    @SerializedName("mod")
    MOD,
    @SerializedName("video")
    VIDEO
}
