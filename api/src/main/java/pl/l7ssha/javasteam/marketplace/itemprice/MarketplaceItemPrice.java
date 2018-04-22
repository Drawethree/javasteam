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

    public double getLowestPrice() {
        return lowestPrice;
    }

    public int getVolume() {
        return volume;
    }

    public double getMedianPrice() {
        return medianPrice;
    }
}
