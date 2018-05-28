package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

public class DailyDeal extends ShopNode implements Iterable<DailyDealItem> {
    @SerializedName("items")
    private List<DailyDealItem> dailyDealItems;

    public DailyDeal() { }

    /**
     * List of apps advertised as 'Daily deal'
     * @return List of deals
     */
    public List<DailyDealItem> getDailyDealItems() {
        return dailyDealItems;
    }

    @Override
    public Iterator<DailyDealItem> iterator() {
        return dailyDealItems.iterator();
    }
}
