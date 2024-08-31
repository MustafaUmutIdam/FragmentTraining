package com.example.fragmenttraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmenttraining.databinding.FragmentMainPageBinding
import com.example.fragmenttraining.databinding.FragmentPageABinding

class PageAFragment : Fragment() {

    private lateinit var binding: FragmentPageABinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.pageAtoBButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.aToB)
        }


        return binding.root
    }



}