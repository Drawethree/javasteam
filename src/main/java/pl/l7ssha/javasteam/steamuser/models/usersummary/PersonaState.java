package pl.l7ssha.javasteam.steamuser.models.usersummary;

// pl.l7ssha.javasteam.steamuser.models.usersummary
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public enum PersonaState {
    Offline(0), Online(1), Busy(2), Away(3), Snooze(4), LookingForTrade(5), LookingForPlay(6);

    private int value;

    PersonaState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
