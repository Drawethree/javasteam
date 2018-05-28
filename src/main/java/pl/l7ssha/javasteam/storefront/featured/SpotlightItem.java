package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class SpotlightItem {
    private String name;

    @SerializedName("header_image")
    private String headerImage;

    private String body;
    private String url;

    public SpotlightItem() { }

    /**
     * Name of spotlight
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Spotlight front image
     * @return Url as String
     */
    public String getHeaderImage() {
        return headerImage;
    }

    /**
     * Short description of promo
     * @return Description as String
     */
    public String getBody() {
        return body;
    }

    /**
     * Url to sale page
     * @return url as String
     */
    public String getUrl() {
        return url;
    }
}
