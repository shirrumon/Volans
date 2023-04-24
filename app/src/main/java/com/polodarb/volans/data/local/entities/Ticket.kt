package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Types.DATE

@Entity(tableName = "ticket")
data class Ticket(
    @PrimaryKey @ColumnInfo(name = "ticket_number") val ticketNumber: Int,
    @ColumnInfo(name = "flight_code") val flightCode: Int, //foreign key (flight_code)
    @ColumnInfo(name = "client_code") val clientCode: Int, //foreign key (client_code)
    @ColumnInfo(name = "ticket_buy_date", typeAffinity = DATE) val ticketBuyDate: String,
    @ColumnInfo(name = "place_number") val placeNumber: Int, //foreign key (place_code)
    @ColumnInfo(name = "ticket_insurance") val ticketInsurance: Boolean
)
