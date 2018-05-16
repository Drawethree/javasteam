package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.marketplace.Priceable;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;
import pl.l7ssha.javasteam.storefront.Gameable;
import pl.l7ssha.javasteam.storefront.SteamGame;
import pl.l7ssha.javasteam.utils.Links;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.encodeString;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class MarketPlaceItemDetails implements Priceable, Gameable {
    private String imgUrlBase = "https://steamcommunity-a.akamaihd.net/economy/image/class/730/%s/150fx125f";

    @SerializedName("appid")
    private long appId;

    @SerializedName("classid")
    private long classId;

    @SerializedName("instanceid")
    private long instanceId;

    @SerializedName("background_color")
    private String backgroundColor;

    @SerializedName("icon_url")
    private String iconUrl;

    private int tradeable;

    private String name;

    @SerializedName("name_color")
    private String nameColor;

    private String type;

    @SerializedName("market_name")
    private String marketName;

    @SerializedName("market_hash_name")
    private String marketHashName;

    public MarketPlaceItemDetails() { }

    /**
     * Id of game which belongs item
     * @return SteamID
     */
    public long getAppId() {
        return appId;
    }

    /**
     * Internal id of item
     * @return classID
     */
    public long getClassId() {
        return classId;
    }

    /**
     * Undocumented
     * @return Long
     */
    public long getInstanceId() {
        return instanceId;
    }

    /**
     * Undocumented.
     * @return String with color RRGGBB. Very often this field is empty - ""
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Url of item's icon
     * @return String with Url
     */
    public String getIconUrl() {
        return String.format(imgUrlBase, iconUrl);
    }

    /**
     * Indicates if item is tradeable. 1 if it's true.
     * @return Boolean as int
     */
    public int getTradeable() {
        return tradeable;
    }

    /**
     * Undocumented
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Undocumented.
     * @return String with color RRGGBB. Very often this field is empty - ""
     */
    public String getNameColor() {
        return nameColor;
    }

    /**
     * Undocumented. Seems like kind of description.
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Undocumented
     * @return String
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Undocumented
     * @return String
     */
    public String getMarketHashName() {
        return marketHashName;
    }

    @Override
    public MarketplaceItemPrice getPrice() {
        return getGenericResponse(String.format(Links.storePricesUrl, appId, encodeString(marketHashName)), MarketplaceItemPrice.class);
    }

    @Override
    public CompletableFuture<MarketplaceItemPrice> getPriceAsync() {
        return CompletableFuture.supplyAsync(this::getPrice);
    }

    @Override
    public SteamGame toSteamGame() {
        return new SteamGame(appId);
    }
}
