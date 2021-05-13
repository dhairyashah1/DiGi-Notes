package com.example.diginotes

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diginotes.databinding.FragmentCameraBinding
import com.scanlibrary.ScanActivity
import com.scanlibrary.ScanConstants
import java.io.IOException


open class CameraFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentCameraBinding>(
            inflater, R.layout.fragment_camera, container, false
        )
        binding.buttonCamera.setOnClickListener {
            openCamera()
        }
        binding.buttonGallery.setOnClickListener {
            openGallery()
        }

        return binding.root
    }
    private fun openCamera() {
        val requestCode = 99
        val preference: Int = ScanConstants.OPEN_CAMERA
        val intent = Intent(requireActivity(), ScanActivity::class.java)
        intent.putExtra(ScanConstants.OPEN_INTENT_PREFERENCE, preference)
        startActivityForResult(intent, requestCode)

    }

    private fun openGallery() {
        val requestCode = 100
        val preference: Int = ScanConstants.OPEN_MEDIA
        val intent = Intent(requireActivity(), ScanActivity::class.java)
        intent.putExtra(ScanConstants.OPEN_INTENT_PREFERENCE, preference)
        startActivityForResult(intent, requestCode)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 99 && resultCode == Activity.RESULT_OK) {
            val uri: Uri? = data?.extras!!.getParcelable(ScanConstants.SCANNED_RESULT)
            var bitmap: Bitmap? = null
            try {
                bitmap = MediaStore.Images.Media.getBitmap(context?.contentResolver, uri)
                if (uri != null) {
                    context?.contentResolver?.delete(uri, null, null)
                }
                /* scannedImageView.setImageBitmap(bitmap) */
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }


}