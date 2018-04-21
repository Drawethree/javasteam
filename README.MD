# javaSteam

javaSteam is full-featured SteamAPI wrapper fo JVM. For now it cover about 70-80% of public steamAPI endpoint, and provides easy access to it.
It provides also marketplace tool for fetching and querying data from steam marketplace.

#### Architecure

Library for now has 2 elements: [API](https://github.com/l7ssha/javasteam/tree/master/api) and [reflector](https://github.com/l7ssha/javasteam/tree/master/reflector):
 * `API` is main module which contains SteamAPI wrapper
 * `reflector` is additional extension for library that wraps data classes and simplifies library consuming

#### Pre-Release

Library for now is in pre-release stage. Why? All implementations are not finished yet. There is lack of unit tests (some test you can find, howover few of them)

But library is working and usable!

## Download [![](https://jitpack.io/v/l7ssha/javasteam.svg)](https://jitpack.io/#l7ssha/javasteam)

* [Jitpack](https://jitpack.io/#l7ssha/javasteam/https://jitpack.io/#l7ssha/javasteam/)
* [Latest Release](https://github.com/l7ssha/javasteam/releases/tag/1.3.1-PRE)
* [Github Releases](https://github.com/l7ssha/javasteam/releases)

#### Gradle

```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    // Main API library
    compile 'com.github.l7ssha.javasteam:api:1.3.1-PRE'

    // Optional
    compile 'com.github.l7ssha.javasteam:reflector:1.3.1-PRE'
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
    <groupId>com.github.l7ssha.javasteam</groupId>
    <artifactId>api</artifactId>
    <version>1.3.1-PRE</version>
</dependency>

<dependency>
    <groupId>com.github.l7ssha.javasteam</groupId>
    <artifactId>reflector</artifactId>
    <version>1.3.1-PRE</version>
</dependency>
```

#### sbt
```scala
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.l7ssha" % "javasteam" % "1.3.1-PRE"
libraryDependencies += "com.github.l7ssha.javasteam" % "reflector" % "1.3.1-PRE"
```

## Roadmap

[TODO]()

## Documentation

[Javadoc [TODO]](https://l7ssha.pl/javasteam/)

[Wiki [TODO]](https://github.com/l7ssha/javasteam/wiki)

## Endpoints

[Documented here](https://github.com/l7ssha/javasteam/wiki/Endpoints)
