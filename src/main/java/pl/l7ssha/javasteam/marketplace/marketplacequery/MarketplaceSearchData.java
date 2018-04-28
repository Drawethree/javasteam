package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class MarketplaceSearchData {
    private String query;

    @SerializedName("search_descriptions")
    private boolean searchDescription;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("pagesize")
    private int pageSize;

    private String prefix;

    @SerializedName("class_prefix")
    private String classPrefix;

    public MarketplaceSearchData() { }

    public String getQuery() {
        return query;
    }

    public boolean isSearchDescription() {
        return searchDescription;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getClassPrefix() {
        return classPrefix;
    }
}
