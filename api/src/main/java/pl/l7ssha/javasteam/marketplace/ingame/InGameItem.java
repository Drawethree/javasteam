package pl.l7ssha.javasteam.marketplace.ingame;

// pl.l7ssha.javasteam.marketplace.ingame
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Date;
import java.util.List;

public class InGameItem implements GameItem {
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

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public List<InGameItemClass> getClasses() {
        return classes;
    }

    public long getClassId() {
        return classId;
    }
}
