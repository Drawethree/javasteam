package pl.l7ssha.javasteam.storefront.featured;

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Special extends ShopNode implements Iterable<FeaturedItem> {
    @SerializedName("items")
    private List<FeaturedItem> featuredItems;

    public Special() { }

    // Expiration date to fill
    public List<FeaturedItem> getFeaturedItems() {
        return featuredItems;
    }

    @Override
    public Iterator<FeaturedItem> iterator() {
        return featuredItems.iterator();
    }
}
