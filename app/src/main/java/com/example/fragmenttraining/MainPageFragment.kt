package com.example.fragmenttraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmenttraining.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment() {


    private lateinit var binding: FragmentMainPageBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{
        binding =FragmentMainPageBinding.inflate(inflater, container, false)

        binding.mainPageGoAButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.mainToA)

        }
        binding.mainPageGoBottomButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.mainToBottom)

        }


        return binding.root

    }


}