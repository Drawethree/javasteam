package pl.l7ssha.javasteam.marketplace.itemprice;

// pl.l7ssha.javasteam.marketplace.itemprice
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class MarketplaceItemPrice {
    private double lowestPrice;
    private int volume;
    private double medianPrice;

    public MarketplaceItemPrice(double lowestPrice, int volume, double medianPrice) {
        this.lowestPrice = lowestPrice;
        this.volume = volume;
        this.medianPrice = medianPrice;
    }

    /**
     * Actual lowest price
     * @return Price in dollars
     */
    public double getLowestPrice() {
        return lowestPrice;
    }

    /**
     * Number of items in marketplace
     * @return Number of items in marketplace
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Actual lowest price
     * @return Price in dollars
     */
    public double getMedianPrice() {
        return medianPrice;
    }
}
