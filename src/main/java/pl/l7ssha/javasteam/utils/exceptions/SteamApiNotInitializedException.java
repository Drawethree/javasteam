package pl.l7ssha.javasteam.utils.exceptions;

// pl.l7ssha.javasteam.utils.exceptions
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class SteamApiNotInitializedException extends RuntimeException {
    public SteamApiNotInitializedException() {
        super();
    }
    public SteamApiNotInitializedException(String s) {
        super(s);
    }
    public SteamApiNotInitializedException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public SteamApiNotInitializedException(Throwable throwable) {
        super(throwable);
    }
}
