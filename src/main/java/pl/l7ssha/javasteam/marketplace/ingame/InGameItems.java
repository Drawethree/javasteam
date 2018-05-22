package pl.l7ssha.javasteam.marketplace.ingame;

// pl.l7ssha.javasteam.marketplace.ingame
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.List;

public class InGameItems {
    private List<InGameItem> gameItems;

    public InGameItems(List<InGameItem> gameItems) {
        this.gameItems = gameItems;
    }

    /**
     * It fetches items which appears to be in-game items. (To confirm)
     * @return List of Items
     */
    public List<InGameItem> getGameItems() {
        return gameItems;
    }
}
