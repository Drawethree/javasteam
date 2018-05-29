package pl.l7ssha.javasteam.storefront.store.storevideo;

// pl.l7ssha.javasteam.storefront.models.store.storevideo
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class WebM {

    @SerializedName("480")
    private String _480;

    private String max;

    public WebM() { }

    /**
     * URL to video in 480p
     * @return Url as String
     */
    public String get_480() {
        return _480;
    }

    /**
     * Url to video in max resolution
     * @return Url as String
     */
    public String getMax() {
        return max;
    }
}
