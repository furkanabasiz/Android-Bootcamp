package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.hw4.databinding.FragmentPagebBinding

class PagebFragment : Fragment() {
    private lateinit var binding: FragmentPagebBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagebBinding.inflate(inflater, container, false)

        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.gecis_b_y)
        }

        return binding.root
    }
}