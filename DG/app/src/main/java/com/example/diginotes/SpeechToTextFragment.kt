package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diginotes.databinding.FragmentSpeechToTextBinding

class SpeechToTextFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSpeechToTextBinding>(  inflater,
            R.layout.fragment_speech_to_text, container, false)


        return binding.root
    }

}