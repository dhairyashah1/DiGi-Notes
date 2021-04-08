package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.diginotes.databinding.FragmentFolderOptionsBinding

class FolderOptionsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFolderOptionsBinding>(
            inflater, R.layout.fragment_folder_options, container, false)

        binding.buttonScan.setOnClickListener {
            findNavController().navigate(R.id.action_folderOptionsFragment_to_cameraFragment)
        }

//        on click listener for speech to text part
        binding.buttonSpeechToText.setOnClickListener {
            findNavController().navigate(R.id.action_folderOptionsFragment_to_speechToTextFragment)
        }
        return binding.root
    }

}