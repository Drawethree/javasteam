package pl.l7ssha.javasteam.storefront.featured;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class Special extends ShopNode {
    @SerializedName("items")
    private List<FeaturedItem> featuredItems;

    public Special() { }

    // Expiration date to fill
    public List<FeaturedItem> getFeaturedItems() {
        return featuredItems;
    }
}
