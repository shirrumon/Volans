package com.polodarb.volans.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import com.polodarb.volans.R
import com.polodarb.volans.databinding.FragmentHomeBinding
import com.polodarb.volans.ui.recyclers.HomeFlightCardAdapter

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.window?.statusBarColor = resources.getColor(R.color.background_btn_card, null)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbar.outlineProvider = null

        binding.rvFlightCardHome.layoutManager = LinearLayoutManager(requireContext())
        val adapter = HomeFlightCardAdapter(listOf(1, 2, 3, 4, 5))
        binding.rvFlightCardHome.adapter = adapter
    }

}