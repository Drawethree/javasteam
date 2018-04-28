package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class StoreScreenshot {
    private int id;

    @SerializedName("path_thumbnail")
    private String thumbnalPath;

    @SerializedName("path_full")
    private String fullPath;

    public StoreScreenshot() { }

    public int getId() {
        return id;
    }

    public String getThumbnalPath() {
        return thumbnalPath;
    }

    public String getFullPath() {
        return fullPath;
    }
}
