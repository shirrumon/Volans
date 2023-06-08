package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.Companion.INTEGER
import androidx.room.ColumnInfo.Companion.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "airport")
data class Airport(
    @ColumnInfo(name = "airport_code", typeAffinity = INTEGER) @PrimaryKey val airportCode: Int,
    @ColumnInfo(name = "airport_name", typeAffinity = TEXT) val airportName: String,
    @ColumnInfo(name = "airport_country", typeAffinity = TEXT) val airportCountry: String,
    @ColumnInfo(name = "airport_city", typeAffinity = TEXT) val airportCity: String
)
