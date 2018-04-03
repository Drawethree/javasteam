package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class Links {

    // USER
    public static final String friendListUrl = "https://api.steampowered.com/ISteamUser/getFriendList/v1/?steamid=%s&key=";
    public static final String userBansUrl = "https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/?format=json&steamids=%s&key=";
    public static final String userSummaryUrl = "https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/?format=json&steamids=%s&key=";

    // CSGO
    public static final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/?key=";
    public static final String mapPlaytimeUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/?format=json&interval=%s&gamemode=%s&mapgroup=operation&key=";

    // STORE
    public static final String shopGetAppUrl = "https://store.steampowered.com/api/appdetails/?appids=%s&key=";
    public static final String shopFeaturedAppsUrl = "https://store.steampowered.com/api/featured/?key=";
    public static final String shopFeaturedCategoriesUrl = "https://store.steampowered.com/api/featuredcategories/?key=";
    public static final String shopPackageDetailsUrl = "https://store.steampowered.com/api/packagedetails/?packageids=%s&key=";

    // RESOLVE VANITY URL
    public static final String vanityUrl = "https://api.steampowered.com/ISteamUser/ResolveVanityURL/v1/?format=json&vanityurl=%s&url_type=%s&key=";

    // Store
    public static final String storeSearching =
            "https://api.steampowered.com/IStoreService/GetAppList/v1/?format=json&if_modified_since=%s&have_description_language=%s&include_games=%s&include_dlc=%s&include_hardware=%s&include_software=%s&include_videos=%s&last_appid=%s&max_results=%s&key=";

}
