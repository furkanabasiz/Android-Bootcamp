package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.hw4.databinding.FragmentPageaBinding
import com.example.hw4.databinding.FragmentPagebBinding

class PageaFragment : Fragment() {
    private lateinit var binding: FragmentPageaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageaBinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.gecis_b)
        }

        return binding.root
    }
}