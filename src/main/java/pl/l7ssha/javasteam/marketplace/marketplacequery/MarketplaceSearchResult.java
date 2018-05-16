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

    /**
     * Name of item in store
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Hashed name which can be used in searching for price
     * @return String with hashed name
     */
    public String getHashName() {
        return hashName;
    }

    /**
     * Number of listings of item.
     * @return Integer
     */
    public int getSellListings() {
        return sellListings;
    }

    /**
     * Price in cents of item of local currency
     * @return Integer
     */
    public int getSellPrice() {
        return sellPrice;
    }

    /**
     * Text representing price
     * @return String with price
     */
    public String getSellPriceText() {
        return sellPriceText;
    }

    /**
     * Url to item icon
     * @return String with url
     */
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * Application name
     * @return String with name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Details about marketplace item
     * @return Object with detailed info about marketplace item
     */
    public MarketPlaceItemDetails getItemDetails() {
        return itemDetails;
    }
}
