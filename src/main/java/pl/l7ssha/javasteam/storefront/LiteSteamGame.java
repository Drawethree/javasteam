package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

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

    /**
     * Type of store application
     * @return GameType
     */
    public GameType getType() {
        return type;
    }

    /**
     * List of developers
     * @return List of String
     */
    public List<String> getDevelopers() {
        return developers;
    }

    /**
     * List of publishers
     * @return List of String
     */
    public List<String> getPublishers() {
        return publishers;
    }

    /**
     * Price overview
     * @return PriceOverview
     */
    public PriceOverview getPriceOverview() {
        return priceOverview;
    }

    /**
     * Compatibility of game
     * @return Platforms
     */
    public Platforms getPlatforms() {
        return platforms;
    }

    /**
     * App release date
     * @return Release date
     */
    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }
}
