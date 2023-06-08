package com.polodarb.volans.data.local

import android.content.ContentValues
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
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
    version = 7
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
                    //.createFromAsset("database/myapp.db")
                    .build()

            return instance!!

        }

        private val roomCallback = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)

                val clinetCV = ContentValues()
                clinetCV.put("client_pib", "sdsd")
                clinetCV.put("client_passport", "cds")
                clinetCV.put("client_phone", "dasdsad")
                db.insert(
                    "client",
                    1,
                    clinetCV
                )
                clinetCV.clear()
            }
        }
    }

}