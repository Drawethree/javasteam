package pl.l7ssha.javasteam.steamuser.usersummary;

// pl.l7ssha.javasteam.steamuser.models.usersummary
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public enum PersonaState {
    OFFLINE(0),
    ONLINE(1),
    BUSY(2),
    AWAY(3),
    SNOOZE(4),
    LOOKING_FOR_TRADE(5),
    LOOKING_TO_PLAY(6);

    private int value;

    PersonaState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
