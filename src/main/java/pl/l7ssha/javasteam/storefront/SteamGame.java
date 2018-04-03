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

    @Override
    public boolean equals(Object o) {
        if(o instanceof SteamGame)
            return this.getAppId() == ((SteamGame)o).getAppId();

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.appId, this.name);
    }
}
