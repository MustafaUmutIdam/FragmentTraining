package com.example.fragmenttraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmenttraining.databinding.FragmentPageLastBinding


class PageLastFragment : Fragment() {

    private lateinit var binding: FragmentPageLastBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageLastBinding.inflate(inflater, container, false)

        binding.pageLasttoMainButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.lastToMain)
        }

        return binding.root
    }




}