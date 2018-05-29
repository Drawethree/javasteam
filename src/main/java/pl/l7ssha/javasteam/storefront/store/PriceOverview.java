package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

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

    /**
     * Currency code
     * @return Currency code in 'xxx' format: PLN, USD
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Initial price of app
     * @return Price
     */
    public double getInitialPrice() {
        return initialPrice / 100;
    }

    /**
     * Price after discounts
     * @return Price
     */
    public double getFinalPrice() {
        return finalPrice / 100;
    }

    /**
     * Percent of discount
     * @return Percent
     */
    public double getDiscountPercent() {
        return discountPercent;
    }
}
