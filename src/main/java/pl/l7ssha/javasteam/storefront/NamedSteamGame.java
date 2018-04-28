package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class NamedSteamGame extends SteamGame {
    protected String name;

    public NamedSteamGame() { }

    public NamedSteamGame(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
