package pl.l7ssha.javasteam.marketplace.ingame;

// pl.l7ssha.javasteam.marketplace.ingame
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Date;
import java.util.List;

public class InGameItemTf2 extends InGameItem {
    private List<String> tags;
    private List<Long> tagIds;

    public InGameItemTf2(int price, String game, Date date, List<InGameItemClass> classes, long classId, List<String> tags, List<Long> tagIds) {
        super(price, game, date, classes, classId);
        this.tags = tags;
        this.tagIds = tagIds;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }
}
