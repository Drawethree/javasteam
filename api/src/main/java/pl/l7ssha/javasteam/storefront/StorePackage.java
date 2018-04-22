package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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
    //private ControllerSupport controllerSupport;

    @SerializedName("release_date")
    private ReleaseDate releaseDate;

    public StorePackage() { }

    public String getName() {
        return name;
    }

    public String getPageImage() {
        return pageImage;
    }

    public String getLogoSmall() {
        return logoSmall;
    }

    public List<NamedSteamGame> getApps() {
        return apps;
    }

    public PriceOverview getPrice() {
        return price;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    /*
    public ControllerSupport getControllerSupport() {
        return controllerSupport;
    }
    */
    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }
}
