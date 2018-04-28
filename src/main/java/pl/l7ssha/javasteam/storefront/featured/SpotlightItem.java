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

    public String getName() {
        return name;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public String getBody() {
        return body;
    }

    public String getUrl() {
        return url;
    }
}
