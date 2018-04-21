package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class DailyDealItem {
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

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getOriginalPrice() {
        return originalPrice / 100;
    }

    public double getFinalPrice() {
        return finalPrice / 100;
    }

    public String getCurrency() {
        return currency;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public String getPurchasePackage() {
        return purchasePackage;
    }
}
