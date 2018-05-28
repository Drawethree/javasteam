package pl.l7ssha.javasteam.storefront.featured;

// pl.l7ssha.javasteam.storefront.models.featured
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public abstract class ShopNode {
    protected String id;
    protected String name;

    /**
     * Id of deal/promo
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Name of deal/promo
     * @return String
     */
    public String getName() {
        return name;
    }
}
