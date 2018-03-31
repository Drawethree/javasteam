package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test.csgotest
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.csgo.csgoAPI;
import pl.l7ssha.javasteam.csgo.models.ServerStatus;

public class CsgoStatustest {
    @Test
    void Test2() throws Exception {
        csgoAPI api = new csgoAPI("FEE74063B07F8D2076DA550901BD29E6");

        ServerStatus stat = api.getStatus();

        Assertions.assertNotNull(stat.getApp().getTimestamp());
        Assertions.assertNotNull(stat.getDatacenters().getChinaTianjin().getLoad());
        Assertions.assertNotNull(stat.getMatchmaking().getSearching_players());
        Assertions.assertNotNull(stat.getPerfectWorld().getPurchase().getLatency());
        Assertions.assertNotNull(stat.getServices().getSessionsLogon());
    }
}
