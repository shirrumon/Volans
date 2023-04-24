package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "airport")
data class Airport(
    @PrimaryKey @ColumnInfo(name = "airport_code") val airportCode: Int,
    @ColumnInfo(name = "airport_name") val airportName: String,
    @ColumnInfo(name = "airport_country") val airportCountry: String,
    @ColumnInfo(name = "airport_city") val airportCity: String
)
