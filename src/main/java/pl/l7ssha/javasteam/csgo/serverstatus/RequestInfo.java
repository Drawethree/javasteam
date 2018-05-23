package pl.l7ssha.javasteam.csgo.serverstatus;

import pl.l7ssha.javasteam.utils.Utils;

import java.util.Date;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class RequestInfo {
    private int version;
    private long timestamp;
    private Date time;

    public RequestInfo() { }

    /**
     * Undocumented.
     * @return Integer
     */
    public int getVersion() {
        return version;
    }

    /**
     * Undocumented.
     * @return Integer
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Undocumented.
     * @return Integer
     */
    public Date getTimestampAsDate() {
        return Utils.timestampToDate(timestamp);
    }

    /**
     * Undocumented.
     * @return Integer
     */
    public Date getTime() {
        return time;
    }
}
