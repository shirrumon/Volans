package com.polodarb.volans.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.polodarb.volans.R
import com.polodarb.volans.databinding.FragmentFilterBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class FilterFragments : Fragment() {

    private val binding: FragmentFilterBinding by lazy { FragmentFilterBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.window?.statusBarColor = resources.getColor(R.color.white, null)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnDate1.text = SimpleDateFormat("dd.MM.yy", Locale.getDefault()).format(Date())
        binding.btnDate2.text = "--.--.--"

        val constraintsBuilder =
            CalendarConstraints.Builder()
                .setValidator(DateValidatorPointForward.now())

        val dateRangePicker =
            MaterialDatePicker.Builder.dateRangePicker()
                .setTitleText("Select dates")
                .setCalendarConstraints(constraintsBuilder.build())
                .build()

        dateRangePicker.addOnPositiveButtonClickListener {

            val date1 = Date(dateRangePicker.selection?.first ?: 0)
            val date2 = Date(dateRangePicker.selection?.second ?: 0)
            val dateFormat1 = SimpleDateFormat("dd.MM.yy", Locale.getDefault())
            val dateFormat2 = SimpleDateFormat("dd.MM.yy", Locale.getDefault())
            val formattedDate1 = dateFormat1.format(date1)
            val formattedDate2 = dateFormat2.format(date2)

            binding.btnDate1.text = formattedDate1.toString()
            binding.btnDate2.text = formattedDate2.toString()
        }

        binding.btnChooseDate.setOnClickListener {
            dateRangePicker.show(childFragmentManager, "tag")
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}