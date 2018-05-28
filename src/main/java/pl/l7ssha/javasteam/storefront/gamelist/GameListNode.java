package pl.l7ssha.javasteam.storefront.gamelist;

import pl.l7ssha.javasteam.storefront.NamedSteamGame;

import java.util.Date;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class GameListNode extends NamedSteamGame {
    private Date lastModified;
    private int priceChangeNumber;

    public GameListNode(String name, long appId, Date lastModified, int priceChanageNumber) {
        this.appId = appId;
        this.name = name;
        this.lastModified = lastModified;
        this.priceChangeNumber = priceChanageNumber;
    }

    /**
     * Undocumented
     * @return Date
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Number of price changes
     * @return Int
     */
    public int getPriceChangeNumber() {
        return priceChangeNumber;
    }
}
