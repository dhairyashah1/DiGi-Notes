package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diginotes.databinding.FragmentCameraBinding

class CameraFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentCameraBinding>(
            inflater, R.layout.fragment_camera, container, false)
 
        return binding.root
    }
    public fun openCamera(view: View){
//        val requestCode = 99
//        val preference: Int =  CameraManager.
//        val intent = Intent()
//        intent.putExtra(ScanConstants.OPEN_INTENT_PREFERENCE, preference)
//        startActivityForResult(intent, requestCode)
    }
    public fun openGallery(view: View){
//        val requestCode = 100
//        val preference: Int = ScanConstants.OPEN_MEDIA
//        val intent = Intent(this, ScanActivity::class.java)
//        intent.putExtra(ScanConstants.OPEN_INTENT_PREFERENCE, preference)
//        startActivityForResult(intent, requestCode)
    }
}