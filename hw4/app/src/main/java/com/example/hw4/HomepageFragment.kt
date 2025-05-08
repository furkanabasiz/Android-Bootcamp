package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.hw4.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {
    private lateinit var binding: FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(inflater, container, false)

        binding.buttonGita.setOnClickListener {
            it.findNavController().navigate(R.id.gecis_a)
        }
        binding.buttonGitx.setOnClickListener {
            it.findNavController().navigate(R.id.gecis_x)
        }

        return binding.root
    }
}