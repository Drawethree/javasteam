package pl.l7ssha.javasteam.csgo.models;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class  Centre {
    private String capacity;
    private String load;

    public Centre(String capacity, String load) {
        this.capacity = capacity;
        this.load = load;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getLoad() {
        return load;
    }
}
