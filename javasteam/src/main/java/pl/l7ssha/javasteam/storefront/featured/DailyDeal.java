package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyDeal extends ShopNode {
    @SerializedName("items")
    private List<DailyDealItem> dailyDealItems;

    public DailyDeal() { }

    public List<DailyDealItem> getDailyDealItems() {
        return dailyDealItems;
    }
}
