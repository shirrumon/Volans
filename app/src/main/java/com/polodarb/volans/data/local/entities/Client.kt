package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.Companion.INTEGER
import androidx.room.ColumnInfo.Companion.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "client")
data class Client(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "client_code", typeAffinity = INTEGER) val clientCode: Int,
    @ColumnInfo(name = "client_pib", typeAffinity = TEXT) val clientPIB: String,
    @ColumnInfo(name = "client_passport", typeAffinity = TEXT) val clientPassport: String,
    @ColumnInfo(name = "client_phone", typeAffinity = TEXT) val clientPhone: String
)