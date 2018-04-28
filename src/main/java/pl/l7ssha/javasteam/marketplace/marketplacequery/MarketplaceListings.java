package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.Queryable;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.ResponserUtils;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MarketplaceListings implements Queryable<MarketplaceListings> {
    private int start;

    @SerializedName("pagesize")
    private int pageSize;

    @SerializedName("total_count")
    private int totalResultsCount;

    @SerializedName("searchdata")
    private MarketplaceSearchData searchData;

    @SerializedName("results")
    private List<MarketplaceSearchResult> searchResults;

    public MarketplaceListings() { }

    public int getStart() {
        return start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalResultsCount() {
        return totalResultsCount;
    }

    public MarketplaceSearchData getSearchData() {
        return searchData;
    }

    public List<MarketplaceSearchResult> getSearchResults() {
        return searchResults;
    }

    @Override
    public MarketplaceListings getNext() {
        return ResponserUtils.getGenericResponse(String.format(Links.searchMarketplaceUrl, searchData.getQuery(), (start + pageSize +1), pageSize), MarketplaceListings.class);
    }

    @Override
    public MarketplaceListings getNext(int num) {
        return ResponserUtils.getGenericResponse(String.format(Links.searchMarketplaceUrl, searchData.getQuery(), (start + pageSize +1), num), MarketplaceListings.class);
    }

    @Override
    public CompletableFuture<MarketplaceListings> getNextAsync() {
        return CompletableFuture.supplyAsync(this::getNext);
    }

    @Override
    public CompletableFuture<MarketplaceListings> getNextAsync(int num) {
        return CompletableFuture.supplyAsync(() -> getNext(num));
    }
}
