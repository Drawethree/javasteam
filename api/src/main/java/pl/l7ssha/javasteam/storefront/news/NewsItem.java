package pl.l7ssha.javasteam.storefront.news;

// pl.l7ssha.javasteam.storefront.models.news
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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

    public Date getDate() {
        return date;
    }

    public long getGid() {
        return gid;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public boolean isExternalUrl() {
        return isExternalUrl;
    }

    public String getAuthor() {
        return author;
    }

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
