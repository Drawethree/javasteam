package pl.l7ssha.javasteam.storefront.steamgame.achievements;

import java.util.Iterator;
import java.util.List;

// pl.l7ssha.javasteam.storefront.models.steamgame.achievements
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Achievements implements Iterable<Achievement> {
    private int total;
    private List<Achievement> highlighted;

    public Achievements() { }

    /**
     * Total number of game achievements
     * @return Number of achievements
     */
    public int getTotal() {
        return total;
    }

    /**
     * List of Achievements
     * @return List of achievements
     */
    public List<Achievement> getHighlighted() {
        return highlighted;
    }

    @Override
    public Iterator<Achievement> iterator() {
        return highlighted.iterator();
    }
}
