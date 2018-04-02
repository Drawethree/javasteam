package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class SteamGame {
    protected String name;

    @SerializedName("steam_appid")
    protected long appId;

    public SteamGame() { }

    public String getName() {
        return name;
    }

    public long getAppId() {
        return appId;
    }
}
