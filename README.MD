# javaSteam [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)

javaSteam is full-featured SteamAPI wrapper fo JVM. For now it cover about 70-80% of public steamAPI endpoint, and provides easy access to it.
It provides also marketplace tool for fetching and querying data from steam marketplace.

#### Features

 * Check csgo server status ([Example](https://github.com/l7ssha/javasteam/tree/master/examples/scala-example))
 * Fetch detailed steam store data
 * Search in marketplace ([Example](https://github.com/l7ssha/javasteam/tree/master/examples/marketplace-example))
 * Get data abount achievements and game stats
 * Get steam users data
 * ~~(Soon) Dota 2 data~~

#### Pre-Release

Library for now is in pre-release stage. Why? All implementations are not finished yet. There is lack of unit tests (some test you can find, howover few of them)

But library is working and usable!

#### Asynchronous

All methods have it's own asynchronous counterpart. Library handles async by Java 8 `CompletableFuture<>`.

## Quick peek

```java
class Main {
    public static void Main(String[] args) {

        // Initialize SteamAPI. There is more ways to do this!
        SteamAPI.initialize("Your api key");

        // Expolore api
        // Returns MarketplaceService which privides access to steam marketplace, obviously
        MarketplaceService marketplace = new SteamMarketplace();

        // Fetch data
        // It basically searches marketplace for query.
        MarketplaceListings query = marketplace.searchInMarketplace("ancient", 100);
    }
}
```

## Documentation

#### [Wiki](https://github.com/l7ssha/javasteam/wiki)

[Javadoc](https://l7ssha.pl/javasteam/)

## Download

* [Jitpack](https://jitpack.io/#l7ssha/javasteam/https://jitpack.io/#l7ssha/javasteam/) [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)
* [Latest Release](https://github.com/l7ssha/javasteam/releases/tag/1.5.5-PRE)
* [Github Releases](https://github.com/l7ssha/javasteam/releases)

### Gradle

```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    // Main API library
    compile 'com.github.l7ssha:javasteam:1.5.5-PRE'
}
```

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.l7ssha.javasteam</groupId>
    <artifactId>javasteam</artifactId>
	<version>1.5.5-PRE</version>
</dependency>
```

### sbt
```scala
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.l7ssha" % "javasteam" % "1.5.5-PRE"
```

## Roadmap

1. Document all data classes properties (nearly done)
2. Implement Dota 2 endpoints
3. Extend wiki

## Endpoints

### [Documented here](https://github.com/l7ssha/javasteam/wiki/Endpoints)
