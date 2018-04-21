# javaSteam

javaSteam is full-featured SteamAPI wrapper fo JVM. For now it cover about 70-80% of public steamAPI endpoint, and provides easy access to it.
It provides also marketplace tool for fetching and querying data from steam marketplace.

## Download [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)

[Github Releases](https://github.com/l7ssha/javasteam/releases)

#### Gradle

```groovy
repositories { 
    maven { 
        url 'https://jitpack.io' 
    }
}

dependencies {
    compile 'com.github.l7ssha:javasteam:v1.2-PRE'
}
```

#### Maven

```xml 
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.l7ssha</groupId>
    <artifactId>javasteam</artifactId>
    <version>v1.2-PRE</version>
</dependency>
```

#### sbt
```scala
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.l7ssha" % "javasteam" % "v1.2-PRE"
```

## Roadmap

[TODO]()

## Documentation

[Javadoc [TODO]](https://l7ssha.pl/javasteam/)

[Wiki [TODO]](https://github.com/l7ssha/javasteam/wiki)

## Endpoints covered

### CS:GO

| Name | Endpoint |
| ---- | -------- |
| CS:GO Server status | `https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/`
| Map playtime | `https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/`

### USER

| Name | Endpoint |
| ---- | -------- |
| Friend List Endpoint | `https://api.steampowered.com/ISteamUser/getFriendList/v1/` |
| User Ban Data | `https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/` |
| User Summary | `https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/` |
| VanityUrl Resolver | `https://api.steampowered.com/ISteamUser/ResolveVanityURL/v1/` |
| Group Info | `https://steamcommunity.com/gid/{ID}/memberslistxml/`

### STEAM STORE

| Name | Endpoint |
| ---- | -------- |
| Apps Info | `https://store.steampowered.com/api/appdetails/` |
| Featured Apps | `https://store.steampowered.com/api/featured/` |
| Featured apps (featuredcategories ) | `https://store.steampowered.com/api/featuredcategories/` |
| Packages & Bundles | `https://store.steampowered.com/api/packagedetails/` |
| Searching Store | `https://api.steampowered.com/IStoreService/GetAppList/v1/`
| News | `https://api.steampowered.com/ISteamNews/GetNewsForApp/v2/` |
| Game Version | `https://api.steampowered.com/ISteamApps/UpToDateCheck/v1/` |

### STATS

| Name | Endpoint |
| ---- | -------- |
| CurrentPlayers | `https://api.steampowered.com/ISteamUserStats/GetNumberOfCurrentPlayers/v1/` |
| App schema | `https://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/` |
| Global achievements| `https://api.steampowered.com/ISteamUserStats/GetGlobalAchievementPercentagesForApp/v2/` |
| Player Achievements | `https://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v1/` |
| Recent Games | `https://api.steampowered.com/IPlayerService/GetRecentlyPlayedGames/v1/` |
| Owned Games | `https://api.steampowered.com/IPlayerService/GetOwnedGames/v1/` |
| User Badges | `https://api.steampowered.com/IPlayerService/GetBadges/v1/` |

### MARKETPLACE

| Name | Endpoint |
| ---- | -------- |
| Item Price | `https://steamcommunity.com/market/priceoverview/` |
| Searching | `https://steamcommunity.com/market/search/render/` |
