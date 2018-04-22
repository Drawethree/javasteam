package pl.l7ssha.javasteam.vanity;

// pl.l7ssha.javasteam.vanity
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public enum VanityUrlType {
    PROFILE(1),
    GROUP(2),
    GAME_GROUP(3);

    private int value;

    VanityUrlType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
