package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.steamgame.ReleaseDate;
import pl.l7ssha.javasteam.storefront.store.Platforms;
import pl.l7ssha.javasteam.storefront.store.PriceOverview;

import java.util.List;

public class StorePackage {
    private String name;

    @SerializedName("page_image")
    private String pageImage;

    @SerializedName("small_logo")
    private String logoSmall;

    List<NamedSteamGame> apps;
    private PriceOverview price;
    private Platforms platforms;

    // This is broken for now. Have to fix.
    // private ControllerSupport controllerSupport;

    @SerializedName("release_date")
    private ReleaseDate releaseDate;

    public StorePackage() {}

    /**
     * Name of pakcage name
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Url to main image
     * @return Url as String
     */
    public String getPageImage() {
        return pageImage;
    }

    /**
     * Url to small package logo
     * @return Url as String
     */
    public String getLogoSmall() {
        return logoSmall;
    }

    /**
     * List of apps(games) in package
     * @return List of SteamGame
     */
    public List<NamedSteamGame> getApps() {
        return apps;
    }

    /**
     * Price of package/bundle
     * @return Price overview
     */
    public PriceOverview getPrice() {
        return price;
    }

    /**
     * Data about platform availbility
     * @return Platform availbility data
     */
    public Platforms getPlatforms() {
        return platforms;
    }

    /* public ControllerSupport getControllerSupport() { return controllerSupport; } */

    /**
     * Release date
     * @return Release date
     */
    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }
}
