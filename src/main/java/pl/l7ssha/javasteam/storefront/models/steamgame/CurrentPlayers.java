package pl.l7ssha.javasteam.storefront.models.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 04 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class CurrentPlayers {
    @SerializedName("player_count")
    private int count;

    @SerializedName("result")
    private int success;

    public CurrentPlayers() { }

    public int getCount() {
        return count;
    }

    public int getSuccess() {
        return success;
    }
}
