package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.featured.DailyDeal;
import pl.l7ssha.javasteam.storefront.featured.Special;
import pl.l7ssha.javasteam.storefront.featured.Spotlight;
import pl.l7ssha.javasteam.utils.annotation.Nullable;

public class StoreFeaturedCategories {

    @Nullable
    @SerializedName("0")
    private Spotlight first;

    @Nullable
    @SerializedName("1")
    private Spotlight second;

    @Nullable
    @SerializedName("2")
    private Spotlight third;

    @Nullable
    @SerializedName("3")
    private DailyDeal dailyDeal;

    @SerializedName("specials")
    private Special specials;

    @SerializedName("comming_soon")
    private Special commingSoon;

    @SerializedName("top_sellers")
    private Special topSellers;

    @SerializedName("new_releases")
    private Special newReleases;

    // There is 2 more, but empty, I dunno what to do

    public StoreFeaturedCategories() { }

    public Spotlight getFirst() {
        return first;
    }

    public Spotlight getSecond() {
        return second;
    }

    public Spotlight getThird() {
        return third;
    }

    public DailyDeal getDailyDeal() {
        return dailyDeal;
    }

    public Special getSpecials() {
        return specials;
    }

    public Special getCommingSoon() {
        return commingSoon;
    }

    public Special getTopSellers() {
        return topSellers;
    }

    public Special getNewReleases() {
        return newReleases;
    }
}
