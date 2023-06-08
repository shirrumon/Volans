package com.polodarb.volans.data.repo

import com.polodarb.volans.data.local.AviaDao
import com.polodarb.volans.data.local.entities.Airport
import com.polodarb.volans.data.local.entities.Flight
import com.polodarb.volans.data.local.entities.Ticket
import javax.inject.Inject

class Repository @Inject constructor(val db: AviaDao) {

    fun getAllTickets() = db.getAllTickets()

    fun getAirports() = db.getAirports()

    suspend fun addAirport(airport: Airport) = db.addAirport(airport)

    suspend fun addFlight(flight: Flight) = db.addFlight(flight)

}