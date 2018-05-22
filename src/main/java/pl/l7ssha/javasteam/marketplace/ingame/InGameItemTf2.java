package pl.l7ssha.javasteam.marketplace.ingame;

// pl.l7ssha.javasteam.marketplace.ingame
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class InGameItemTf2 extends InGameItem {
    private List<String> tags;
    private List<Long> tagIds;

    public InGameItemTf2(int price, String game, Date date, List<InGameItemClass> classes, long classId, List<String> tags, List<Long> tagIds) {
        super(price, game, date, classes, classId);
        this.tags = tags;
        this.tagIds = tagIds;
    }

    /**
     * Game tags
     * @return String List containing tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * Ids of tags
     * @return Long
     */
    public List<Long> getTagIds() {
        return tagIds;
    }

    /**
     * List of paired tags and ids. Can be slow, because of loop implementation.
     * @return List of tags
     */
    public List<Tag> getAsPairs() {
        // Length should be the same. But this api is very weird so better to check.
        int len = tags.size() > tagIds.size() ? tagIds.size() : tags.size();

        // WHERE IS MY YIELD
        List<Tag> tmp = new ArrayList<>();

        for(int i = 0; i <= len; i++) {
            tmp.add(new Tag(tagIds.get(i), tags.get(i)));
        }

        return tmp;
    }

    /**
     * Asynchronously returns list of paired tags and ids.
     * @return Future with List of tags
     */
    public CompletableFuture<List<Tag>> getAsPairsAsync() {
        return CompletableFuture.supplyAsync(this::getAsPairs);
    }

    public class Tag {
        private Long id;
        private String name;

        public Tag(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
