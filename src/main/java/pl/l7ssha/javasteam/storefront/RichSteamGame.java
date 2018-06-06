package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.steamgame.ControllerSupport;
import pl.l7ssha.javasteam.storefront.steamgame.Requirements;
import pl.l7ssha.javasteam.storefront.steamgame.SupportInfo;
import pl.l7ssha.javasteam.storefront.steamgame.achievements.Achievements;
import pl.l7ssha.javasteam.storefront.store.*;
import pl.l7ssha.javasteam.storefront.store.storevideo.StoreVideo;

import java.util.List;

public class RichSteamGame extends LiteSteamGame {
    @SerializedName("required_age")
    private int RequiredAge;

    @SerializedName("is_free")
    private boolean isFree;

    @SerializedName("controller_support")
    private ControllerSupport controllerSupport;

    @SerializedName("detailed_description")
    private String detailedDescription;

    @SerializedName("about_the_game")
    private String aboutTheGame;

    @SerializedName("short_description")
    private String shortDescription;

    @SerializedName("supported_languages")
    private String supportedLanguages;

    @SerializedName("header_image")
    private String headerImage;

    private String website;

    @SerializedName("pc_requirements")
    private Requirements pcRequirements;

    @SerializedName("mac_requirements")
    private Requirements macRequirements;

    @SerializedName("linux_requirements")
    private Requirements linuxRequirements;

    private List<Integer> packages;

    @SerializedName("package_groups")
    private List<PackageGroup> packageGroups;

    private Metacritic metacritic;
    private List<StoreCategory> categories;
    private List<StoreGenre> genres;

    private List<StoreScreenshot> screenshots;
    private List<StoreVideo> movies;
    private Recommendations recommendations;
    private Achievements achievements;

    @SerializedName("support_info")
    private SupportInfo supportInfo;

    private String background;

    public RichSteamGame() { }

    /**
     * Required age to play game (PEGI)
     * @return Int
     */
    public int getRequiredAge() {
        return RequiredAge;
    }

    /**
     * True if game is free
     * @return Boolean
     */
    public boolean isFree() {
        return isFree;
    }

    /**
     * Controller support data
     * @return Controller support data
     */
    public ControllerSupport getControllerSupport() {
        return controllerSupport;
    }

    /**
     * Detailed descripton section on store
     * @return Description as HTML String
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * About game section in store
     * @return String with game description
     */
    public String getAboutTheGame() {
        return aboutTheGame;
    }

    /**
     * Short Game Description
     * @return Short game description as String
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Supported languages list
     * @return String with list of supported languages
     */
    public String getSupportedLanguages() {
        return supportedLanguages;
    }

    /**
     * Url of main app pictrue
     * @return Url as String
     */
    public String getHeaderImage() {
        return headerImage;
    }

    /**
     * Game main website url
     * @return Url as String
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Requirments of game for PC (aka Windows)
     * @return Requirments data
     */
    public Requirements getPcRequirements() {
        return pcRequirements;
    }
    
    /**
     * Requirments of game for Mac
     * @return Requirments data
     */
    public Requirements getMacRequirements() {
        return macRequirements;
    }
    
    /**
     * Requirments of game for Linux
     * @return Requirments data
     */
    public Requirements getLinuxRequirements() {
        return linuxRequirements;
    }

    public List<Integer> getPackages() {
        return packages;
    }

    public List<PackageGroup> getPackageGroups() {
        return packageGroups;
    }

    /**
     * Metacritic game score
     * @return Metacritic score data
     */
    public Metacritic getMetacritic() {
        return metacritic;
    }

    /**
     * Categories assgned to game
     * @return List of Categories 
     */
    public List<StoreCategory> getCategories() {
        return categories;
    }

    /**
     * Genres assigned to game
     * @return List of genres
     */
    public List<StoreGenre> getGenres() {
        return genres;
    }

    /**
     * Game's Spotlight screenshots 
     * @return List of screenshots
     */
    public List<StoreScreenshot> getScreenshots() {
        return screenshots;
    }

    /**
     * Game's spotlight movies
     * @return List of videos
     */
    public List<StoreVideo> getMovies() {
        return movies;
    }

    /**
     * Recommendations for game
     * @return Recommendations
     */
    public Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Game's Achievements list
     * @return Achievement's list
     */
    public Achievements getAchievements() {
        return achievements;
    }

    /**
     * Game support info
     * @return Support info object
     */
    public SupportInfo getSupportInfo() {
        return supportInfo;
    }
    
    public String getBackground() {
        return background;
    }
}
