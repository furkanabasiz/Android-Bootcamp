package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw4.databinding.FragmentPageyBinding

class PageyFragment : Fragment() {

    private lateinit var binding: FragmentPageyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageyBinding.inflate(inflater, container, false)

        return binding.root
    }
}