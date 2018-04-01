package pl.l7ssha.javasteam.storefront.models;

// pl.l7ssha.javasteam.storefront.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.models.steamgame.GameType;
import pl.l7ssha.javasteam.storefront.models.steamgame.ReleaseDate;
import pl.l7ssha.javasteam.storefront.models.store.Platforms;
import pl.l7ssha.javasteam.storefront.models.store.PriceOverview;

import java.util.List;

public class BaseSteamGame {
    private GameType type;
    private String name;

    @SerializedName("steam_appid")
    private long appId;

    private List<String> developers;
    private List<String> publishers;

    @SerializedName("price_overview")
    private PriceOverview priceOverview;

    private Platforms platforms;

    @SerializedName("release_date")
    private ReleaseDate releaseDate;

    public BaseSteamGame() { }

    public GameType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public long getAppId() {
        return appId;
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public PriceOverview getPriceOverview() {
        return priceOverview;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof BaseSteamGame)
            return this.getAppId() == ((BaseSteamGame)o).getAppId();

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.appId, this.name);
    }
}
