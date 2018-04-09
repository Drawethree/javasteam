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
    public static final String playerAchievementsUrl = "https://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v1/?steamid=%s&appid=%s&l=ENG&key=";
    public static final String userRecentGamesUrl = "https://api.steampowered.com/IPlayerService/GetRecentlyPlayedGames/v1/?format=json&steamid=%s&key=";
    public static final String userGamesUrl = "https://api.steampowered.com/IPlayerService/GetOwnedGames/v1/?format=json&steamid=%s&include_appinfo=1&include_played_free_games=1&key=";
    public static final String userGetBadgesurl = "https://api.steampowered.com/IPlayerService/GetBadges/v1/?steamid=%s&key=";

    // CSGO
    public static final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/?key=";
    public static final String mapPlaytimeUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/?format=json&interval=%s&gamemode=%s&mapgroup=operation&key=";

    // STORE
    public static final String shopGetAppUrl = "https://store.steampowered.com/api/appdetails/?appids=%s&key=";
    public static final String shopFeaturedAppsUrl = "https://store.steampowered.com/api/featured/?key=";
    public static final String shopFeaturedCategoriesUrl = "https://store.steampowered.com/api/featuredcategories/?key=";
    public static final String shopPackageDetailsUrl = "https://store.steampowered.com/api/packagedetails/?packageids=%s&key=";
    public static final String storeSearching = "https://api.steampowered.com/IStoreService/GetAppList/v1/?format=json&if_modified_since=%s&have_description_language=%s&include_games=%s&include_dlc=%s&include_hardware=%s&include_software=%s&include_videos=%s&last_appid=%s&max_results=%s&key=";
    public static final String newsForApp = "https://api.steampowered.com/ISteamNews/GetNewsForApp/v2/?format=json&appid=%s&count=%s&key=";

    // Stats
    public static final String appSchemaUrl = "https://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/?appid=%s&l=%s&key=";
    public static final String globalAchievementsUrl = "https://api.steampowered.com/ISteamUserStats/GetGlobalAchievementPercentagesForApp/v2/?gameid=%s&format=json&key=";
    public static final String currentPlayersUrl = "https://api.steampowered.com/ISteamUserStats/GetNumberOfCurrentPlayers/v1/?appid=%s&format=json&key=";
    public static final String playerStatsUrl = "https://api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v2/?format=json&steamid=%s&appid=%s&key=";

    // RESOLVE VANITY URL
    public static final String vanityUrl = "https://api.steampowered.com/ISteamUser/ResolveVanityURL/v1/?format=json&vanityurl=%s&url_type=%s&key=";
}
