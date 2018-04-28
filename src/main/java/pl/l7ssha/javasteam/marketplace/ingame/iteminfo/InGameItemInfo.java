package pl.l7ssha.javasteam.marketplace.ingame.iteminfo;

// pl.l7ssha.javasteam.marketplace.ingame.iteminfo
//
// Date created: 27 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.List;

public class InGameItemInfo {
    private String iconUrl;
    private String iconUrlLarge;
    private String iconDragUrl;
    private String name;
    private String marketHashName;
    private String marketName;
    private String nameColor;
    private String backgroundColor;
    private String type;
    private boolean tradeable;
    private boolean marketable;
    private int comodity;
    private int marketTradeableRestriction;
    private int marketMarketableRestriction;
    private String fraudwarnings;
    private List<InGameItemDescription> descriptions;
    private String ownerDescriptions;
    private List<InGameItemTag> tags;
    private long classId;

    public InGameItemInfo(String iconUrl, String iconUrlLarge, String iconDragUrl, String name, String marketHashName, String marketName, String nameColor, String backgroundColor, String type, boolean tradeable, boolean marketable, int comodity, int marketTradeableRestriction, int marketMarketableRestriction, String fraudwarnings, List<InGameItemDescription> descriptions, String ownerDescriptions, List<InGameItemTag> tags, long classId) {
        this.iconUrl = iconUrl;
        this.iconUrlLarge = iconUrlLarge;
        this.iconDragUrl = iconDragUrl;
        this.name = name;
        this.marketHashName = marketHashName;
        this.marketName = marketName;
        this.nameColor = nameColor;
        this.backgroundColor = backgroundColor;
        this.type = type;
        this.tradeable = tradeable;
        this.marketable = marketable;
        this.comodity = comodity;
        this.marketTradeableRestriction = marketTradeableRestriction;
        this.marketMarketableRestriction = marketMarketableRestriction;
        this.fraudwarnings = fraudwarnings;
        this.descriptions = descriptions;
        this.ownerDescriptions = ownerDescriptions;
        this.tags = tags;
        this.classId = classId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getIconUrlLarge() {
        return iconUrlLarge;
    }

    public String getIconDragUrl() {
        return iconDragUrl;
    }

    public String getName() {
        return name;
    }

    public String getMarketHashName() {
        return marketHashName;
    }

    public String getMarketName() {
        return marketName;
    }

    public String getNameColor() {
        return nameColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getType() {
        return type;
    }

    public boolean isTradeable() {
        return tradeable;
    }

    public boolean isMarketable() {
        return marketable;
    }

    public int getComodity() {
        return comodity;
    }

    public int getMarketTradeableRestriction() {
        return marketTradeableRestriction;
    }

    public int getMarketMarketableRestriction() {
        return marketMarketableRestriction;
    }

    public String getFraudwarnings() {
        return fraudwarnings;
    }

    public List<InGameItemDescription> getDescriptions() {
        return descriptions;
    }

    public String getOwnerDescriptions() {
        return ownerDescriptions;
    }

    public List<InGameItemTag> getTags() {
        return tags;
    }

    public long getClassId() {
        return classId;
    }
}
