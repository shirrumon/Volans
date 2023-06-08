package com.polodarb.volans.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.polodarb.volans.data.local.entities.Airport
import com.polodarb.volans.data.local.entities.Flight
import com.polodarb.volans.data.local.entities.Ticket

@Dao
interface AviaDao {

    @Query("SELECT * FROM ticket")
    fun getAllTickets(): List<Ticket>

    @Query("SELECT * FROM airport WHERE airport_city = 'Kharviv'")
    fun getAirports(): List<Airport>

    @Insert
    suspend fun addAirport(airport: Airport)

    @Insert
    suspend fun addFlight(flight: Flight)

}