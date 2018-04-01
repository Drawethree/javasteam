package pl.l7ssha.javasteam.steamuser.models.usersummary;

// pl.l7ssha.javasteam.steamuser.models.usersummary
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public enum  ProfileVisibilityState {
    Private(0), Dunno(1), Null(2), Public(3);

    private int value;

    ProfileVisibilityState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
