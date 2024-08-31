package com.example.fragmenttraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmenttraining.databinding.FragmentPageBBinding
import com.example.fragmenttraining.databinding.FragmentPageBottomBinding


class PageBottomFragment : Fragment() {

    private lateinit var binding: FragmentPageBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageBottomBinding.inflate(inflater, container, false)

        binding.pageBottomToLastButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomToLast)
        }
        return binding.root
    }


}