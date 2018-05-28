package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.Gameable;
import pl.l7ssha.javasteam.storefront.SteamGame;

public class DailyDealItem implements Gameable {
    private int id;
    private int type;
    private String name;
    private boolean discounted;

    @SerializedName("discount_percent")
    private double discountPercent;

    @SerializedName("original_price")
    private int originalPrice;

    @SerializedName("final_price")
    private int finalPrice;

    private String currency;

    @SerializedName("header_image")
    private String headerImage;

    @SerializedName("purchase_package")
    private String purchasePackage;

    public DailyDealItem() { }

    /**
     * Undocumented. Probably game id
     * @return Id
     */
    public int getId() {
        return id;
    }

    /**
     * Undocumented
     * @return Type as int
     */
    public int getType() {
        return type;
    }

    /**
     * Name of deal/game
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * True if discounted
     * @return Boolean
     */
    public boolean isDiscounted() {
        return discounted;
    }

    /**
     * Discount percent
     * @return Percent as double
     */
    public double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Original app price in euros/dollars
     * @return Price as double
     */
    public double getOriginalPrice() {
        return originalPrice / 100;
    }

    /**
     * Price after discounts of app
     * @return Price as double
     */
    public double getFinalPrice() {
        return finalPrice / 100;
    }

    /**
     * Currency of price
     * @return
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Promo image
     * @return
     */
    public String getHeaderImage() {
        return headerImage;
    }

    /**
     * Purchase package id if available
     * @return
     */
    public String getPurchasePackage() {
        return purchasePackage;
    }

    @Override
    public SteamGame toSteamGame() {
        return new SteamGame(id);
    }
}
