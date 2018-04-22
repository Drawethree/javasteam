package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.steamgame.GameType;
import pl.l7ssha.javasteam.storefront.steamgame.ReleaseDate;
import pl.l7ssha.javasteam.storefront.store.Platforms;
import pl.l7ssha.javasteam.storefront.store.PriceOverview;

import java.util.List;

public class LiteSteamGame extends NamedSteamGame {
    private GameType type;

    private List<String> developers;
    private List<String> publishers;

    @SerializedName("price_overview")
    private PriceOverview priceOverview;

    private Platforms platforms;

    @SerializedName("release_date")
    private ReleaseDate releaseDate;

    public LiteSteamGame() { }

    public GameType getType() {
        return type;
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
}
