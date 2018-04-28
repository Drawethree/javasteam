package pl.l7ssha.javasteam.marketplace.ingame.iteminfo;

// pl.l7ssha.javasteam.marketplace.ingame.iteminfo
//
// Date created: 27 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class InGameItemTag {
    private String internalName;
    private String name;
    private String category;
    private String color;
    private String categoryName;

    public InGameItemTag(String internalName, String name, String category, String color, String categoryName) {
        this.internalName = internalName;
        this.name = name;
        this.category = category;
        this.color = color;
        this.categoryName = categoryName;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
