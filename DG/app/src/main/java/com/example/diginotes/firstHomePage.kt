package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.diginotes.databinding.FragmentFirstHomePageBinding
import com.google.firebase.auth.FirebaseAuth


class First_home_page : Fragment() {
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFirstHomePageBinding>(
            inflater,
            R.layout.fragment_first_home_page, container, false
        )
        auth = FirebaseAuth.getInstance()
        binding.continueButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_first_home_page_to_loginPage2)
        }
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if (currentUser != null) {
            if (currentUser.isEmailVerified) {
                view?.findNavController()?.navigate(R.id.action_first_home_page_to_main_home_page2)
            }
        }
    }
}