package com.polodarb.volans.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.polodarb.volans.R
import com.polodarb.volans.databinding.FragmentMyTicketsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyTicketsFragment : Fragment() {

    private val binding: FragmentMyTicketsBinding by lazy { FragmentMyTicketsBinding.inflate(layoutInflater) }

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

    }

}