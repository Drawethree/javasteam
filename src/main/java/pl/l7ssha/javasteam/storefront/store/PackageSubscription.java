package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class PackageSubscription {

    @SerializedName("packaageid")
    private long packageId;

    @SerializedName("percent_savings_text")
    private String percentSavingsText;

    @SerializedName("percent_savings")
    private double percentSavings;

    @SerializedName("option_text")
    private String optionText;

    @SerializedName("option_description")
    private String optionDescription;

    @SerializedName("can_get_free_license")
    private String canGetFreeLicense;

    @SerializedName("is_free_license")
    private boolean isFreeLicense;

    @SerializedName("price_in_cents_with_discount")
    private long PriceWithDiscount;

    public PackageSubscription() { }

    public long getPackageId() {
        return packageId;
    }

    public String getPercentSavingsText() {
        return percentSavingsText;
    }

    public double getPercentSavings() {
        return percentSavings;
    }

    public String getOptionText() {
        return optionText;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public String getCanGetFreeLicense() {
        return canGetFreeLicense;
    }

    public boolean isFreeLicense() {
        return isFreeLicense;
    }

    public long getPriceWithDiscount() {
        return PriceWithDiscount;
    }
}
