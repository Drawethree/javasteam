package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

import java.awt.*;

public class MarketPlaceItemDetails {
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

    public long getAppId() {
        return appId;
    }

    public long getClassId() {
        return classId;
    }

    public long getInstanceId() {
        return instanceId;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getIconUrl() {
        return String.format(imgUrlBase, iconUrl);
    }

    public int getTradeable() {
        return tradeable;
    }

    public String getName() {
        return name;
    }

    public String getNameColor() {
        return nameColor;
    }

    public Color getNameColorAsColor() {
        String[] strCol = nameColor.split("(..)");
        return new Color(Integer.parseInt(strCol[0], 16), Integer.parseInt(strCol[1], 16), Integer.parseInt(strCol[1], 16));
    }

    public String getType() {
        return type;
    }

    public String getMarketName() {
        return marketName;
    }

    public String getMarketHashName() {
        return marketHashName;
    }
}