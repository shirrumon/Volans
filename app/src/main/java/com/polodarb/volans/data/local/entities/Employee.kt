package com.polodarb.volans.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee")
data class Employee(
    @PrimaryKey @ColumnInfo(name = "employee_code") val employeeCode: Int,
    @ColumnInfo(name = "employee_pib") val employeePIB: String,
    @ColumnInfo(name = "employee_position") val employeePosition: Int,
)