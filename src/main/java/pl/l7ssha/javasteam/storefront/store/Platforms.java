package pl.l7ssha.javasteam.storefront.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Platforms {
    private boolean windows;
    private boolean mac;
    private boolean linux;

    public Platforms() { }

    public boolean isWindows() {
        return windows;
    }

    public boolean isMac() {
        return mac;
    }

    public boolean isLinux() {
        return linux;
    }
}
