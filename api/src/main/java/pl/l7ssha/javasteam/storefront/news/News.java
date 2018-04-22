package pl.l7ssha.javasteam.storefront.news;

// pl.l7ssha.javasteam.storefront.models.news
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {
    @SerializedName("appid")
    private long appId;

    @SerializedName("count")
    private int totalNews;

    @SerializedName("newsitems")
    private List<NewsItem> news;

    public News() { }

    public long getAppId() {
        return appId;
    }

    public int getTotalNews() {
        return totalNews;
    }

    public List<NewsItem> getNews() {
        return news;
    }
}
