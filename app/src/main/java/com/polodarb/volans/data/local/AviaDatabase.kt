package com.polodarb.volans.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.polodarb.volans.data.local.entities.Airport
import com.polodarb.volans.data.local.entities.Client
import com.polodarb.volans.data.local.entities.Employee
import com.polodarb.volans.data.local.entities.Flight
import com.polodarb.volans.data.local.entities.Place
import com.polodarb.volans.data.local.entities.Ticket

@Database(
    entities = [
        Airport::class,
        Client::class,
        Employee::class,
        Flight::class,
        Place::class,
        Ticket::class
    ],
    version = 1
) // exportSchema = false?
abstract class AviaDatabase : RoomDatabase() {

    abstract fun aviaDao(): AviaDao

}