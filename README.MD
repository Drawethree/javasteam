# javaSteam [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)

javaSteam is full-featured SteamAPI wrapper fo JVM. For now it cover about 70-80% of public steamAPI endpoint, and provides easy access to it.
It provides also marketplace tool for fetching and querying data from steam marketplace.

#### Architecure

Library for now has 2 elements: [API](https://github.com/l7ssha/javasteam/tree/master/api) and [reflector](https://github.com/l7ssha/javasteam/tree/master/reflector):
 * `API` is main module which contains SteamAPI wrapper
 * `reflector` is additional extension for library that wraps data classes and simplifies library consuming

#### Pre-Release

Library for now is in pre-release stage. Why? All implementations are not finished yet. There is lack of unit tests (some test you can find, howover few of them)

But library is working and usable!

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

#### [Wiki [TODO]](https://github.com/l7ssha/javasteam/wiki)

[Javadoc API [TODO]](https://l7ssha.pl/javasteam/) <br />
[Javadoc Reflector [TODO]](https://l7ssha.pl/reflector/)

## Download

* [Jitpack](https://jitpack.io/#l7ssha/javasteam/https://jitpack.io/#l7ssha/javasteam/) [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)
* [Latest Release](https://github.com/l7ssha/javasteam/releases/tag/1.3.2-PRE)
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
    compile 'com.github.l7ssha.javasteam:api:1.3.2-PRE'

    // Optional
    compile 'com.github.l7ssha.javasteam:reflector:1.3.2-PRE'
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
    <artifactId>api</artifactId>
    <version>1.3.2-PRE</version>
</dependency>

<dependency>
    <groupId>com.github.l7ssha.javasteam</groupId>
    <artifactId>reflector</artifactId>
    <version>1.3.2-PRE</version>
</dependency>
```

### sbt
```scala
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.l7ssha" % "javasteam" % "1.3.2-PRE"
libraryDependencies += "com.github.l7ssha.javasteam" % "reflector" % "1.3.2-PRE"
```

## Roadmap

### [TODO]()

## Endpoints

### [Documented here](https://github.com/l7ssha/javasteam/wiki/Endpoints)
