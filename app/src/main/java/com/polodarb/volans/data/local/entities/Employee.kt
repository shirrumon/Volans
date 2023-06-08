package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.Companion.INTEGER
import androidx.room.ColumnInfo.Companion.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee")
data class Employee(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "employee_code", typeAffinity = INTEGER) val employeeCode: Int,
    @ColumnInfo(name = "employee_pib", typeAffinity = TEXT) val employeePIB: String,
    @ColumnInfo(name = "employee_position", typeAffinity = TEXT) val employeePosition: String,
)