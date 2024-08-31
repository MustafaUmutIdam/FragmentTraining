package com.example.fragmenttraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmenttraining.databinding.FragmentPageBBinding


class PageBFragment : Fragment() {

    private  lateinit var binding: FragmentPageBBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.pageBtoLastButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bToLast)
        }


        return binding.root
    }


}