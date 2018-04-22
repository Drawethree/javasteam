package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.Gameable;
import pl.l7ssha.javasteam.storefront.NamedSteamGame;
import pl.l7ssha.javasteam.storefront.SteamGame;

public class MarketplaceSearchResult implements Gameable {

    private String name;

    @SerializedName("hash_name")
    private String hashName;

    @SerializedName("sell_listings")
    private int sellListings;

    @SerializedName("sell_price")
    private int sellPrice;

    @SerializedName("sell_price_text")
    private String sellPriceText;

    @SerializedName("app_icon")
    private String appIcon;

    @SerializedName("app_name")
    private String appName;

    @SerializedName("asset_description")
    private MarketPlaceItemDetails itemDetails;

    @SerializedName("sale_price_text")
    private String salePriceText;

    public MarketplaceSearchResult() { }

    @Override
    public SteamGame toSteamGame() {
       return new NamedSteamGame(itemDetails.getAppId(), appName);
    }

    public String getName() {
        return name;
    }

    public String getHashName() {
        return hashName;
    }

    public int getSellListings() {
        return sellListings;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getSellPriceText() {
        return sellPriceText;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public String getAppName() {
        return appName;
    }

    public MarketPlaceItemDetails getItemDetails() {
        return itemDetails;
    }

    public String getSalePriceText() {
        return salePriceText;
    }
}
