package pl.l7ssha.javasteam.storefront.models.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class ReleaseDate {
    @SerializedName("comming_soon")
    private boolean commingSoon;

    private String date;
    //private Date date;

    public ReleaseDate() { }

    public boolean isCommingSoon() {
        return commingSoon;
    }

    public String getDate() {
        return date;
    }
}
