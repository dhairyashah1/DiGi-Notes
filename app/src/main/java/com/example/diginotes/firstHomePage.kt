package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.diginotes.databinding.FragmentFirstHomePageBinding


class First_home_page : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentFirstHomePageBinding>(
            inflater,
            R.layout.fragment_first_home_page, container, false
        )

        binding.continueButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_first_home_page_to_signUp)
        }
        return binding.root
    }
}