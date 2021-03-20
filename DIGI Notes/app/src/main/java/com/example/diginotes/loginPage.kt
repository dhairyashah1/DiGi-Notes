package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diginotes.databinding.FragmentLoginPageBinding


class loginPage : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginPageBinding>(inflater,
            R.layout.fragment_login_page,container,false)
        return binding.root
    }

}