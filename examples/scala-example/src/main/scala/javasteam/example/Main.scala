package javasteam.example

import pl.l7ssha.javasteam.SteamAPI
import pl.l7ssha.javasteam.CsgoService

// javasteam.example
//
// Date created: 19 May 2018
// Author: Szymon 'l7ssha' Uglis

object Main extends App {
  // Initializing javasteam
  SteamAPI.initialize("A38B4740725EFC276E960A5748DDD41B")

  // Get CSGO Service instance
  val csgoService = new CsgoService()

  // Get all datacenters as map
  val datacenters = csgoService.getGameServerStatus.getDatacenters.getCentersAsMap

  // Print each datacentre
  datacenters.forEach({(k, v) =>
    println(s"$k -> ${v.getLoad}")
  })
}
