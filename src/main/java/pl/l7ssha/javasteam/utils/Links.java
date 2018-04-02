package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class Links {

    // USER
    public static final String friendListUrl = "https://api.steampowered.com/ISteamUser/getFriendList/v1/?steamid=%s&key=";
    public static final String userBansurl = "https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/?format=json&steamids=%s&key=";
    public static final String userSummaryUrl = "https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/?format=json&steamids=%s&key=";

    // CSGO
    public static final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/?key=";
    public static final String mapPlaytimeUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/?format=json&interval=%s&gamemode=%s&mapgroup=operation&key=";

    // STORE
    public static final String shopGetAppUrl = "https://store.steampowered.com/api/appdetails/?appids=%s&key=";
    public static final String shopFeaturedApps = "https://store.steampowered.com/api/featured/?key=";
    public static final String shopFeaturedCategories = "https://store.steampowered.com/api/featuredcategories/?key=";
}
