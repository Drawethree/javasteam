package pl.l7ssha.javasteam.marketplace.ingame;

// pl.l7ssha.javasteam.marketplace.ingame
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Date;
import java.util.List;

public class InGameItem {
    private int price;
    private String name;
    private Date date;
    private List<InGameItemClass> classes;
    private long classId;

    public InGameItem(int price, String name, Date date, List<InGameItemClass> classes, long classId) {
        this.price = price;
        this.name = name;
        this.date = date;
        this.classes = classes;
        this.classId = classId;
    }

    /**
     * Price in USD cents.
     * @return Integer with price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Item name
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Item add date
     * @return Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Undocumented
     * @return List of objects. In most cases there is only one item
     */
    public List<InGameItemClass> getClasses() {
        return classes;
    }

    /**
     * Internal classId
     * @return Long
     */
    public long getClassId() {
        return classId;
    }
}
