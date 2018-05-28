package pl.l7ssha.javasteam.storefront.gamelist;

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.Queryable;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class GameList implements Iterable<GameListNode>, Queryable<GameList> {
    private List<GameListNode> apps;

    @SerializedName("have_more_results")
    private boolean haveMoreResults;

    @SerializedName("last_appid")
    private long lastAppId;

    private GameListQuery query;

    public GameList() { }

    /**
     * List of games
     * @return List of games
     */
    public List<GameListNode> getApps() {
        return apps;
    }

    public boolean isHaveMoreResults() {
        return haveMoreResults;
    }

    /**
     * Id of last game
     * @return App id as long
     */
    public long getLastAppId() {
        return lastAppId;
    }

    /**
     * Optional if want to change search query
     * @param query Gamelist query
     * @return Game list
     */
    public GameList setQuery(GameListQuery query) {
        this.query = query;

        return this;
    }

    public GameList getNext() {
        GameList tmp = getGenericResponse(query.setAppid((int)lastAppId).toString(), GameList.class);
        return tmp.setQuery(query);
    }

    @Override
    public GameList getNext(int num) {
        GameList tmp = getGenericResponse(query.setAppid((int)lastAppId).setMaxResults(num).toString(), GameList.class);
        return tmp.setQuery(query);
    }

    public CompletableFuture<GameList> getNextAsync() {
        return CompletableFuture.supplyAsync(this::getNext);
    }

    @Override
    public CompletableFuture<GameList> getNextAsync(int num) {
        return CompletableFuture.supplyAsync(() -> getNext(num));
    }

    @Override
    public Iterator<GameListNode> iterator() {
        return apps.iterator();
    }
}
