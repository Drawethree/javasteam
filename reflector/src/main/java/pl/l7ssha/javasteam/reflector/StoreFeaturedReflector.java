package pl.l7ssha.javasteam.reflector;

// pl.l7ssha.javasteam.reflector
//
// Date created: 21 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.storefront.StoreFeatured;
import pl.l7ssha.javasteam.storefront.featured.FeaturedItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Allows to easy query and consume StoreFeatured items. Wraps StoreFeatured and extends it's functionality.
 */
public class StoreFeaturedReflector extends Reflector<StoreFeatured> {
    public StoreFeaturedReflector(StoreFeatured storeFeatured) {
        super(storeFeatured);
    }

    public FeaturedItem findOneInCapsules(Predicate<FeaturedItem> query) {
        return data.getLargeCapsules().stream().filter(query).findAny().get();
    }

    public List<FeaturedItem> filterCapsules(Predicate<FeaturedItem> query) {
        return data.getLargeCapsules().stream().filter(query).collect(Collectors.toList());
    }

    public FeaturedItem findOneInWin(Predicate<FeaturedItem> query) {
        return data.getFeaturedWin().stream().filter(query).findAny().get();
    }

    public List<FeaturedItem> filterWin(Predicate<FeaturedItem> query) {
        return data.getFeaturedWin().stream().filter(query).collect(Collectors.toList());
    }

    public FeaturedItem findOneInLinux(Predicate<FeaturedItem> query) {
        return data.getFeaturedLinux().stream().filter(query).findAny().get();
    }

    public List<FeaturedItem> filterLinux(Predicate<FeaturedItem> query) {
        return data.getFeaturedLinux().stream().filter(query).collect(Collectors.toList());
    }

    public FeaturedItem findOneInMac(Predicate<FeaturedItem> query) {
        return data.getFeaturedMac().stream().filter(query).findAny().get();
    }

    public List<FeaturedItem> filterMac(Predicate<FeaturedItem> query) {
        return data.getFeaturedMac().stream().filter(query).collect(Collectors.toList());
    }

    public Stream<FeaturedItem> getCapsulesStream() {
        return data.getLargeCapsules().stream();
    }

    public Stream<FeaturedItem> getWinStream() {
        return data.getFeaturedWin().stream();
    }

    public Stream<FeaturedItem> getLinuxStream() {
        return data.getFeaturedLinux().stream();
    }

    public Stream<FeaturedItem> getMacStream() {
        return data.getFeaturedMac().stream();
    }

    /**
     * Returns combined list of all featured
     * @return List
     */
    public List<FeaturedItem> getCombined() {
        List<FeaturedItem> me =  new ArrayList<>(data.getFeaturedLinux());
        me.addAll(data.getFeaturedMac());
        me.addAll(data.getLargeCapsules());
        me.addAll(data.getFeaturedWin());

        return me;
    }
}
