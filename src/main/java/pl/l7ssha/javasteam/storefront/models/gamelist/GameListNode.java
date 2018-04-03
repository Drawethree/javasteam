package pl.l7ssha.javasteam.storefront.models.gamelist;

import pl.l7ssha.javasteam.storefront.SteamGame;

import java.util.Date;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class GameListNode extends SteamGame {
    private Date lastModified;
    private int priceChangeNumber;

    public GameListNode(String name, long appId, Date lastModified, int priceChanageNumber) {
        this.appId = appId;
        this.name = name;
        this.lastModified = lastModified;
        this.priceChangeNumber = priceChanageNumber;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public int getPriceChangeNumber() {
        return priceChangeNumber;
    }
}
