package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.hw4.databinding.FragmentPagexBinding

class PagexFragment : Fragment() {
    private lateinit var binding: FragmentPagexBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagexBinding.inflate(inflater, container, false)

        binding.button5.setOnClickListener {
            it.findNavController().navigate(R.id.gecis_x_y)
        }

        return binding.root
    }
}