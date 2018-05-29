package pl.l7ssha.javasteam.storefront.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.utils.annotation.Html;

public class Requirements {
    private String minimum;
    private String recommended;

    public Requirements() { }

    /**
     * Minimum app requirements as HTML String
     * @return HTML
     */
    @Html
    public String getMinimum() {
        return minimum;
    }

    /**
     * Recommended app requirements as HTML String
     * @return HTML
     */
    @Html
    public String getRecommended() {
        return recommended;
    }
}
