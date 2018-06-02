package pl.l7ssha.javasteam.vanity;

// pl.l7ssha.javasteam.vanity
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class VanityUrl {
  private Long steamid;
  private int success;

  /**
   * Steam Id of specified vanity Url
   *
   * @return Id as long
   */
  public Long getSteamId() {
    return steamid;
  }

  /**
   * Integer containing action code
   *
   * @return Action success code
   */
  public int getSuccess() {
    return success;
  }
}
