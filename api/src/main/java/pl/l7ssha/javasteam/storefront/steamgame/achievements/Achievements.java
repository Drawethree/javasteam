package pl.l7ssha.javasteam.storefront.steamgame.achievements;

import java.util.List;

// pl.l7ssha.javasteam.storefront.models.steamgame.achievements
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Achievements {
    private int total;
    private List<Achievement> highlighted;

    public Achievements() { }

    public int getTotal() {
        return total;
    }

    public List<Achievement> getHighlighted() {
        return highlighted;
    }
}
