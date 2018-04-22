package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.featured.FeaturedItem;

import java.util.List;

public class StoreFeatured {

    @SerializedName("large_capsules")
    private List<FeaturedItem> LargeCapsules;

    @SerializedName("featured_win")
    private List<FeaturedItem> featuredWin;

    @SerializedName("featured_mac")
    private List<FeaturedItem> featuredMac;

    @SerializedName("featured_linux")
    private List<FeaturedItem> featuredLinux;

    private String layout;
    private String status;

    public StoreFeatured() { }

    public List<FeaturedItem> getLargeCapsules() {
        return LargeCapsules;
    }

    public List<FeaturedItem> getFeaturedWin() {
        return featuredWin;
    }

    public List<FeaturedItem> getFeaturedMac() {
        return featuredMac;
    }

    public List<FeaturedItem> getFeaturedLinux() {
        return featuredLinux;
    }

    public String getLayout() {
        return layout;
    }

    public String getStatus() {
        return status;
    }
}
