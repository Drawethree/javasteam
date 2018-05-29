package pl.l7ssha.javasteam.storefront.steamgame.achievements;

// pl.l7ssha.javasteam.storefront.models.steamgame.achievements
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Achievement {
    private String name;
    private String path;

    public Achievement() { }

    /**
     * Name of achievement
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Undocumented
     * @return String
     */
    public String getPath() {
        return path;
    }
}
