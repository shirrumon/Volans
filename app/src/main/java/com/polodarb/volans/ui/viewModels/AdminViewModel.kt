package com.polodarb.volans.ui.viewModels

import androidx.lifecycle.ViewModel
import com.polodarb.volans.data.local.entities.Airport
import com.polodarb.volans.data.local.entities.Flight
import com.polodarb.volans.data.local.entities.Ticket
import com.polodarb.volans.data.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class AdminViewModel @Inject constructor(
    private val repo: Repository
) : ViewModel() {

    suspend fun addAirport(airport: Airport) {
        repo.addAirport(airport)
    }


    suspend fun addFlight(flight: Flight) {
        repo.addFlight(flight)
    }

}