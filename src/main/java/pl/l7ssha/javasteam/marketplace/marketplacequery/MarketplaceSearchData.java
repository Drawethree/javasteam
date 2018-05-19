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

    /**
     * True if searching in items descriptions.
     * @return Boolean
     */
    public boolean isSearchDescription() {
        return searchDescription;
    }

    /**
     * Total amount of results
     * @return Integer
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Size of single page of results
     * @return Integer
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Internal steam variable. Undocumented
     * @return String
     */
    public String getPrefix() {
        return prefix;
    }
    /**
     * Internal steam variable. Undocumented
     * @return String
     */
    public String getClassPrefix() {
        return classPrefix;
    }
}
