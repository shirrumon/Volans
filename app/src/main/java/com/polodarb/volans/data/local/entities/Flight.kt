package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Types.DATE
import java.sql.Types.TIME

@Entity(
    tableName = "flight",
    foreignKeys = [
//        ForeignKey(
//            entity = Flight::class,
//            parentColumns = ["airport_code"],
//            childColumns = ["departure_code"]
//        ),
//        ForeignKey(
//            entity = Client::class,
//            parentColumns = ["airport_code"],
//            childColumns = ["arrival_code"]
//        )
    ])
data class Flight(
    @PrimaryKey @ColumnInfo(name = "flight_code") val flightCode: Int,
    @ColumnInfo(name = "departure_code") val departureCode: Int, //foreign key (airport_code)
    @ColumnInfo(name = "arrival_code") val arrivalCode: Int, //foreign key (airport_code)
    @ColumnInfo(name = "departure_date", typeAffinity = DATE) val departureDate: String,
    @ColumnInfo(name = "departure_time", typeAffinity = TIME) val departureTime: String,
    @ColumnInfo(name = "arrival_time", typeAffinity = TIME) val arrivalTime: String,
    @ColumnInfo(name = "price") val price: Float
)
