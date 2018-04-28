package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

// To fill some properties
public class FeaturedItem extends DailyDealItem {
    @SerializedName("large_capsule_image")
    private String largeImage;

    @SerializedName("small_capsule_image")
    private String smallImage;

    @SerializedName("windows_available")
    private boolean isWindows;

    @SerializedName("mac_available")
    private boolean isMac;

    @SerializedName("linux_available")
    private boolean isLinux;

    public FeaturedItem() { }

    public String getLargeImage() {
        return largeImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public boolean isWindows() {
        return isWindows;
    }

    public boolean isMac() {
        return isMac;
    }

    public boolean isLinux() {
        return isLinux;
    }
}
