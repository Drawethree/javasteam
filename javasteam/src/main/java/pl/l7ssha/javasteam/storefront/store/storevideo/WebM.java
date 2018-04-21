package pl.l7ssha.javasteam.storefront.store.storevideo;

// pl.l7ssha.javasteam.storefront.models.store.storevideo
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class WebM {

    @SerializedName("480")
    private String _480;

    private String max;

    public WebM() { }

    public String get_480() {
        return _480;
    }

    public String getMax() {
        return max;
    }
}
