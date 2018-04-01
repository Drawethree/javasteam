package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class Links {
    public static final String friendListUrl = "https://api.steampowered.com/ISteamUser/getFriendList/v1/?steamid=%s&key=";
    public static final String userBansurl = "https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/?format=json&steamids=%s&key=";
    public static final String userSummaryUrl = "https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/?format=json&steamids=%s&key=";

}
