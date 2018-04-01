package pl.l7ssha.javasteam.storefront.models.store.storevideo;

// pl.l7ssha.javasteam.storefront.models.store.storevideo
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class StoreVideo {
    private String id;
    private String name;
    private String thumbnail;

    private WebM webm;

    private boolean highlight;

    public StoreVideo() { }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public WebM getWebm() {
        return webm;
    }

    public boolean isHighlight() {
        return highlight;
    }
}
