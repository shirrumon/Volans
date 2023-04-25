package com.polodarb.volans.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.polodarb.volans.databinding.FragmentHomeBinding
import com.polodarb.volans.ui.recyclers.HomeFlightCardAdapter

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvFlightCardHome.layoutManager = LinearLayoutManager(requireContext())
        val adapter = HomeFlightCardAdapter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        binding.rvFlightCardHome.adapter = adapter
    }

}