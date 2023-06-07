package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "place")
data class Place(
    @PrimaryKey(autoGenerate = true) val id: Int,@ColumnInfo(name = "place_code") val placeCode: Int,
    @ColumnInfo(name = "place_number") val placeNumber: Int
)
