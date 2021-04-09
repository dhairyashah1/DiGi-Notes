package com.example.diginotes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.speech.RecognizerIntent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diginotes.databinding.FragmentSpeechToTextBinding
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

class SpeechToTextFragment : Fragment() {
    private val filepath = "Storage-1/Folder1"
    private var myExternalFile: File? = null
    private val isExternalStorageReadOnly: Boolean
        get() {
            val extStorageState = Environment.getExternalStorageState()
            return Environment.MEDIA_MOUNTED_READ_ONLY == extStorageState
        }
    private val isExternalStorageAvailable: Boolean
        get() {
            val extStorageState = Environment.getExternalStorageState()
            return Environment.MEDIA_MOUNTED == extStorageState
        }

    private val requestCode = 100
    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSpeechToTextBinding>(
            inflater,
            R.layout.fragment_speech_to_text, container, false
        )

//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)

        val fileName = binding.fileNameEditText
        val fileData = binding.fileContentEditText
        val saveButton = binding.saveButton

        textView = binding.fileContentEditText
        val recordButton: Button = binding.recordButton
        recordButton.setOnClickListener {
            val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
            intent.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "DigiNotes : Start Speaking")
            startActivityForResult(intent, requestCode)
            Toast.makeText(
                requireActivity(),
                "Sorry your device not supported",
                Toast.LENGTH_SHORT
            ).show()
        }

        saveButton.setOnClickListener(View.OnClickListener {
            myExternalFile = File(context?.getExternalFilesDir(filepath), fileName.text.toString())
            try {
                val fileOutPutStream = FileOutputStream(myExternalFile)
                fileOutPutStream.write(fileData.text.toString().toByteArray())
                fileOutPutStream.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            Toast.makeText(requireActivity(), "File Saved", Toast.LENGTH_SHORT).show()
        })
        if (!isExternalStorageAvailable || isExternalStorageReadOnly) {
            saveButton.isEnabled = false
        }
//        }
        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && null != data) {
            val result: ArrayList<String> =
                data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS) as ArrayList<String>
            textView.text = result[0]
        }
    }
}
