package com.polodarb.volans.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.polodarb.volans.data.local.entities.Airport
import com.polodarb.volans.data.local.entities.Client
import com.polodarb.volans.data.local.entities.Employee
import com.polodarb.volans.data.local.entities.Flight
import com.polodarb.volans.data.local.entities.Place
import com.polodarb.volans.data.local.entities.Ticket
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.random.Random

@Database(
    entities = [
        Airport::class,
        Client::class,
        Employee::class,
        Flight::class,
        Place::class,
        Ticket::class
    ],
    version = 2
)
abstract class AviaDatabase : RoomDatabase() {
    abstract fun aviaDao(): AviaDao

    companion object {
        private var instance: AviaDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): AviaDatabase {
            if(instance == null)
                instance = Room.databaseBuilder(ctx.applicationContext, AviaDatabase::class.java,
                    "avia_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build()

            return instance!!

        }

        private val roomCallback = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                populateDatabase(instance!!)
            }
        }

        @OptIn(DelicateCoroutinesApi::class)
        private fun populateDatabase(db: AviaDatabase) {
            val dataBase = db.aviaDao()

            val airPortsData: ArrayList<Airport> = arrayListOf()
            for(i in 0..10){
                airPortsData.plus(
                    Airport(
                        airportCode = Random.nextInt(0,100),
                        airportCity = "city-$i",
                        airportCountry = "country-$i",
                        airportName = "airport_name-$i"
                    )
                )
            }

            val airPortsFlight: ArrayList<Flight> = arrayListOf()
            for(i in 0..15){
                airPortsFlight.plus(
                    Flight(
                        flightCode = Random.nextInt(0,100),
                        departureCode = Random.nextInt(0,100),
                        arrivalCode = Random.nextInt(0,100),
                        price = Random.nextFloat(),
                        departureDate = "2020-01-01",
                        departureTime = "00:00",
                        arrivalTime = "00:00"
                    )
                )
            }

            GlobalScope.launch {
                airPortsData.forEach { airPortBeCreated ->
                    dataBase.addAirport(airPortBeCreated)
                }

                airPortsFlight.forEach { flightBeCreated ->
                    dataBase.addFlight(flightBeCreated)
                }
            }
        }
    }

}