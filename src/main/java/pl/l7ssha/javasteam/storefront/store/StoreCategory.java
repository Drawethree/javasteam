package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class StoreCategory {
    private int id;
    private String description;

    public StoreCategory() { }

    /**
     * Id of category
     * @return Integer id
     */
    public int getId() {
        return id;
    }

    /**
     * Category description
     * @return
     */
    public String getDescription() {
        return description;
    }
}
