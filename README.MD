# javaSteam

~~(Almost)~~ complete Steam API wrapper for JVM

## Endpoints covered

### CS:GO

| Name | Endpoint |
| ---- | -------- |
| Friend List Endpoint | `https://api.steampowered.com/ISteamUser/getFriendList/v1/` |
| User Ban Data | `https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/` |
| User Summary | `https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/` |

### USER

| Name | Endpoint |
| ---- | -------- |
| CS:GO Server status | `https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/`
| Map playtime | `https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/`
| VanityUrl Resolver | `https://api.steampowered.com/ISteamUser/ResolveVanityURL/v1/` |

### STEAM STORE

| Name | Endpoint |
| ---- | -------- |
| Apps Info | `https://store.steampowered.com/api/appdetails/` |
| Featured Apps | `https://store.steampowered.com/api/featured/` |
| Featured apps (featuredcategories ) | `https://store.steampowered.com/api/featuredcategories/` |
| Packages & Bundles | `https://store.steampowered.com/api/packagedetails/` |
| Searching Store | `https://api.steampowered.com/IStoreService/GetAppList/v1/`
| News | `https://api.steampowered.com/ISteamNews/GetNewsForApp/v2/` |
| CurrentPlayers | `https://api.steampowered.com/ISteamUserStats/GetNumberOfCurrentPlayers/v1/` |
| App schema | `https://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/` |