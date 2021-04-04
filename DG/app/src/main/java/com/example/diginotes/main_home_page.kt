package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.diginotes.databinding.FragmentMainHomePageBinding
import com.google.firebase.auth.FirebaseAuth


class main_home_page : Fragment() {
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainHomePageBinding>(
            inflater,
            R.layout.fragment_main_home_page, container, false
        )
        binding.logout.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            view?.findNavController()?.navigate(R.id.action_main_home_page_to_loginPage)
        }
        return binding.root
    }
}