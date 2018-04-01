package pl.l7ssha.javasteam.storefront.models.store;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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
