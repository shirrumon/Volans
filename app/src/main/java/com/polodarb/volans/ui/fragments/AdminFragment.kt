package com.polodarb.volans.ui.fragments

import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.polodarb.volans.R
import com.polodarb.volans.databinding.FragmentAdminBinding

class AdminFragment : Fragment() {

    private val binding: FragmentAdminBinding by lazy { FragmentAdminBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.window?.statusBarColor = resources.getColor(R.color.white, null)

        val picker =
            MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .setHour(12)
                .setMinute(10)
                .setTitleText("Select Appointment time")
                .build()

        binding.etDepartureTime.setOnClickListener {
            picker.show(childFragmentManager, "etDepartureTime")
        }

        binding.etLandingTime.setOnClickListener {
            picker.show(childFragmentManager, "etLandingTime")
            Toast.makeText(requireContext(), "h - ${picker.hour}\nm - ${picker.minute}", Toast.LENGTH_SHORT).show()
        }
    }

}