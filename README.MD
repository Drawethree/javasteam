# javaSteam

~~(Almost)~~ complete Steam API wrapper for JVM

## Download

#### Package isn't published to jCenter() yet!

POM:
```xml
<profiles>
        <profile>
            <repositories>
                <repository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>bintray-l7ssha-javasteam</id>
                    <name>bintray</name>
                    <url>https://dl.bintray.com/l7ssha/javasteam</url>
                </repository>
            </repositories>
            <pluginRepositories>
                <pluginRepository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>bintray-l7ssha-javasteam</id>
                    <name>bintray-plugins</name>
                    <url>https://dl.bintray.com/l7ssha/javasteam</url>
                </pluginRepository>
            </pluginRepositories>
            <id>bintray</id>
        </profile>
    </profiles>
```

```xml
<dependency>
  <groupId>pl.l7ssha</groupId>
  <artifactId>javasteam</artifactId>
  <version>1.0-PRE</version>
  <type>pom</type>
</dependency>
```

GRADLE:
```grooovy
repositories {
    maven {
        url  "https://dl.bintray.com/l7ssha/javasteam"
    }
}
```

```groovy
compile 'pl.l7ssha:javasteam:1.0-PRE'
```

## Documentation

[Javadoc (Not ready)]()

[Wiki (Work in progress)](https://github.com/l7ssha/javasteam/wiki)

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
