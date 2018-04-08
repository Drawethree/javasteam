package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class PriceOverview {
    private String currency;

    @SerializedName("initial")
    private int initialPrice;

    @SerializedName("final")
    private int finalPrice;

    @SerializedName("discount_percent")
    private double discountPercent;

    public PriceOverview() { }

    public String getCurrency() {
        return currency;
    }

    public double getInitialPrice() {
        return initialPrice / 100;
    }

    public double getFinalPrice() {
        return finalPrice / 100;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }
}
