package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class  Centre {
    private String capacity;
    private String load;

    public Centre() { }

    /**
     * Describes total amount of throughput server can handle
     * @return String with capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Actual load of server.
     * @return String with value. Possible values: idle, low, medium, high
     */
    public String getLoad() {
        return load;
    }
}
