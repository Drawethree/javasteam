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

    /**
     * Id of screenshot
     * @return Id as Integer
     */
    public int getId() {
        return id;
    }

    /**
     * Url to thumbnail
     * @return Url as String
     */
    public String getThumbnalPath() {
        return thumbnalPath;
    }

    /**
     * Url to full resolution photo
     * @return Url as String
     */
    public String getFullPath() {
        return fullPath;
    }
}
