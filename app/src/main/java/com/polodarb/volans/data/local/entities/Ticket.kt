package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.Companion.INTEGER
import androidx.room.ColumnInfo.Companion.TEXT
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Types.DATE

@Entity(
    tableName = "ticket",
    foreignKeys = [
        ForeignKey(
            entity = Flight::class,
            parentColumns = ["flight_code"],
            childColumns = ["flight_code"]
        ),
        ForeignKey(
            entity = Client::class,
            parentColumns = ["client_code"],
            childColumns = ["client_code"]
        ),
        ForeignKey(
            entity = Place::class,
            parentColumns = ["place_code"],
            childColumns = ["place_number"]
        )
    ]
)
data class Ticket(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "ticket_number", typeAffinity = INTEGER) val ticketNumber: Int,
    @ColumnInfo(name = "flight_code", typeAffinity = INTEGER) val flightCode: Int, //foreign key (flight_code)
    @ColumnInfo(name = "client_code", typeAffinity = INTEGER) val clientCode: Int, //foreign key (client_code)
    @ColumnInfo(name = "ticket_buy_date", typeAffinity = TEXT) val ticketBuyDate: String,
    @ColumnInfo(name = "place_number", typeAffinity = INTEGER) val placeNumber: Int,
    @ColumnInfo(name = "ticket_insurance", typeAffinity = INTEGER) val ticketInsurance: Boolean
)
