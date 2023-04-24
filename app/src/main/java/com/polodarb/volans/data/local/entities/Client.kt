package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "client")
data class Client(
    @PrimaryKey @ColumnInfo(name = "client_code") val clientCode: Int,
    @ColumnInfo(name = "client_pib") val clientPIB: String,
    @ColumnInfo(name = "client_passport") val clientPassport: Int,
    @ColumnInfo(name = "client_phone") val clientPhone: Int
)