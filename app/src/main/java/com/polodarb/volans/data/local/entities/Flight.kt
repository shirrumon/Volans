package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Types.DATE
import java.sql.Types.TIME

@Entity(
    tableName = "flight",
    foreignKeys = [ForeignKey(
        entity = Airport::class,
        parentColumns = arrayOf("airport_code"),
        childColumns = arrayOf("departure_code"),
        onDelete = ForeignKey.CASCADE
    ), ForeignKey(
        entity = Airport::class,
        parentColumns = arrayOf("airport_code"),
        childColumns = arrayOf("arrival_code"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Flight(
    @ColumnInfo(name = "flight_code") @PrimaryKey(autoGenerate = true) val flightCode: Int,
    @ColumnInfo(name = "departure_code") val departureCode: Int, //foreign key (airport_code)
    @ColumnInfo(name = "arrival_code") val arrivalCode: Int, //foreign key (airport_code)
    @ColumnInfo(name = "departure_date", typeAffinity = DATE) val departureDate: String,
    @ColumnInfo(name = "departure_time", typeAffinity = TIME) val departureTime: String,
    @ColumnInfo(name = "arrival_time", typeAffinity = TIME) val arrivalTime: String,
    @ColumnInfo(name = "price") val price: Float,

    @ColumnInfo(name = "airport_code") val airportCode: Int,
)
