package pl.l7ssha.javasteam.storefront.store.storevideo;

// pl.l7ssha.javasteam.storefront.models.store.storevideo
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class StoreVideo {
    private String id;
    private String name;
    private String thumbnail;

    private WebM webm;

    private boolean highlight;

    public StoreVideo() { }

    /**
     * Id of video
     * @return String with id
     */
    public String getId() {
        return id;
    }

    /**
     * Video name
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Thumbnail URL
     * @return URL as String
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Video object
     * @return Video object
     */
    public WebM getWebm() {
        return webm;
    }

    /**
     * True if video is highlighted
     * @return Boolean
     */
    public boolean isHighlight() {
        return highlight;
    }
}
