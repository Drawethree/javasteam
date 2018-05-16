package pl.l7ssha.javasteam.marketplace.marketplacequery;

// pl.l7ssha.javasteam.marketplace.marketplacequery
//
// Date created: 19 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.Queryable;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.ResponserUtils;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MarketplaceListings implements Queryable<MarketplaceListings>, Iterable<MarketplaceSearchResult> {
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

    /**
     * Index of first element
     * @return Integer
     */
    public int getStart() {
        return start;
    }

    /**
     * Number of total items returned by request.
     * @return Integer
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Total amount of results
     * @return Integer
     */
    public int getTotalResultsCount() {
        return totalResultsCount;
    }

    /**
     * Specific info about request and query
     * @return Object with informations about request and query
     */
    public MarketplaceSearchData getSearchData() {
        return searchData;
    }

    /**
     * Collection with results
     * @return List of searching results
     */
    public List<MarketplaceSearchResult> getSearchResults() {
        return searchResults;
    }

    /**
     * Returns next n results, where n is page size defined in first request
     * @return Object with next query results
     */
    @Override
    public MarketplaceListings getNext() {
        return ResponserUtils.getGenericResponse(String.format(Links.searchMarketplaceUrl, searchData.getQuery(), (start + pageSize +1), pageSize), MarketplaceListings.class);
    }

    /**
     * Fetches next results.
     * @param num Number of results in page - pagesize
     * @return  Object with next query results
     */
    @Override
    public MarketplaceListings getNext(int num) {
        return ResponserUtils.getGenericResponse(String.format(Links.searchMarketplaceUrl, searchData.getQuery(), (start + pageSize +1), num), MarketplaceListings.class);
    }

    /**
     * Returns next n results, where n is page size defined in first request
     * @return Object with next query results
     */
    @Override
    public CompletableFuture<MarketplaceListings> getNextAsync() {
        return CompletableFuture.supplyAsync(this::getNext);
    }

    /**
     * Fetches next results.
     * @param num Number of results in page - pagesize
     * @return  Object with next query results
     */
    @Override
    public CompletableFuture<MarketplaceListings> getNextAsync(int num) {
        return CompletableFuture.supplyAsync(() -> getNext(num));
    }

    @Override
    public Iterator<MarketplaceSearchResult> iterator() {
        return searchResults.iterator();
    }
}
