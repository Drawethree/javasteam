package pl.l7ssha.javasteam.steamuser.usersummary;

// pl.l7ssha.javasteam.steamuser.models.usersummary
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public enum ProfileVisibilityState {
    PRIVATE(0),
    PUBLIC(3);

    private int value;

    ProfileVisibilityState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ProfileVisibilityState of(int value) {
        switch(value) {
            case 0:
                return ProfileVisibilityState.PRIVATE;
            case 3:
                return ProfileVisibilityState.PUBLIC;
            default:
                return ProfileVisibilityState.PRIVATE;
        }
    }
}
