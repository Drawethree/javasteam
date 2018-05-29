package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Metacritic {
    private int score;
    private String url;

    public Metacritic() { }

    /**
     * Metacritic score
     * @return Metacritic score
     */
    public int getScore() {
        return score;
    }

    /**
     * Url to article at metacritic
     * @return Url as String
     */
    public String getUrl() {
        return url;
    }
}
