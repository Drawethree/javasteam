package pl.l7ssha.javasteam.storefront.news;

// pl.l7ssha.javasteam.storefront.models.news
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Date;

public class NewsItem {
    private long gid;
    private String title;
    private String url;
    private boolean isExternalUrl;
    private String author;
    private String contents;
    private String feedLabel;
    private String feedName;
    private int feedType;
    private Date date;

    public NewsItem(long gid, String title, String url, boolean isExternalUrl, String author, String contents, String feedLabel, String feedname, int feedType, Date date) {
        this.gid = gid;
        this.title = title;
        this.url = url;
        this.isExternalUrl = isExternalUrl;
        this.author = author;
        this.contents = contents;
        this.feedLabel = feedLabel;
        this.feedName = feedname;
        this.feedType = feedType;
        this.date = date;
    }

    /**
     * Date of publish
     * @return Date of publish
     */
    public Date getDate() {
        return date;
    }

    /**
     * News id
     * @return News id as long
     */
    public long getGid() {
        return gid;
    }

    /**
     * News title
     * @return String with title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Url to full article
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * Indicates if link points to external page
     * @return
     */
    public boolean isExternalUrl() {
        return isExternalUrl;
    }

    /**
     * Author nick/name
     * @return String with author nick/name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Full contents of article
     * @return
     */
    public String getContents() {
        return contents;
    }

    public String getFeedLabel() {
        return feedLabel;
    }

    public String getFeedName() {
        return feedName;
    }

    public int getFeedType() {
        return feedType;
    }
}
