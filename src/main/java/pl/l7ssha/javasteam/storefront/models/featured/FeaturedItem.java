package pl.l7ssha.javasteam.storefront.models.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

// To fill some properties
public class FeaturedItem {
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

    @SerializedName("large_capsule_image")
    private String largeImage;

    @SerializedName("small_capsule_image")
    private String smallImage;

    @SerializedName("windows_available")
    private boolean isWindows;

    @SerializedName("mac_available")
    private boolean isMac;

    @SerializedName("linux_available")
    private boolean isLinux;

    @SerializedName("header_image")
    private String headerImage;


    public FeaturedItem() { }

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

    public String getLargeImage() {
        return largeImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public boolean isWindows() {
        return isWindows;
    }

    public boolean isMac() {
        return isMac;
    }

    public boolean isLinux() {
        return isLinux;
    }

    public String getHeaderImage() {
        return headerImage;
    }
}
