package com.example.diginotes

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.diginotes.databinding.FragmentMainHomePageBinding
import com.google.firebase.auth.FirebaseAuth
import java.io.File


class main_home_page : Fragment() {
    lateinit var linear: GridLayout;
    lateinit var addFolder: ImageButton;
    lateinit var folder1: ImageButton
    lateinit var folder2: ImageButton
    lateinit var folder3: ImageButton
    lateinit var folder4: ImageButton
    lateinit var folder5: ImageButton
    lateinit var folder6: ImageButton
    lateinit var folder7: ImageButton
    lateinit var folder8: ImageButton
    lateinit var folder9: ImageButton
    lateinit var folder10: ImageButton
    lateinit var folder11: ImageButton
    lateinit var folder12: ImageButton
    lateinit var folder13: ImageButton
    lateinit var folder14: ImageButton
    lateinit var folder15: ImageButton
    lateinit var folder16: ImageButton
    lateinit var folder17: ImageButton
    lateinit var folder18: ImageButton
    var no: Int = 1
    lateinit var storage: File
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainHomePageBinding>(
            inflater,
            R.layout.fragment_main_home_page, container, false
        )
        binding.logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            view?.findNavController()?.navigate(R.id.action_main_home_page_to_loginPage)
        }

        addFolder = binding.add
        linear = binding.Grid
        folder1 = binding.Folder1
        folder2 = binding.Folder2
        folder3 = binding.Folder3
        folder4 = binding.Folder4
        folder5 = binding.Folder5
        folder6 = binding.Folder6
        folder7 = binding.Folder7
        folder8 = binding.Folder8
        folder9 = binding.Folder9
        folder10 = binding.Folder10
        folder11 = binding.Folder11
        folder12 = binding.Folder12
        folder13 = binding.Folder13
        folder14 = binding.Folder14
        folder15 = binding.Folder15
        folder16 = binding.Folder16
        folder17 = binding.Folder17
        folder18 = binding.Folder18

        storage = File(context?.getExternalFilesDir(null), "Storage-1")
        storage.mkdirs()
        addFolder.setOnClickListener(View.OnClickListener
        {
            addView(storage)
        })
        folder1.setOnClickListener {
            findNavController().navigate(R.id.action_main_home_page_to_folderOptionsFragment)
        }
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        visibility(storage)
    }

    private fun visibility(storage: File) {
        var count = storage.listFiles().size
        val list = listOf(
            folder1,
            folder2,
            folder3,
            folder4,
            folder5,
            folder6,
            folder7,
            folder8,
            folder9,
            folder10,
            folder11,
            folder12,
            folder13,
            folder14,
            folder15,
            folder16,
            folder17,
            folder18
        )
        for (j in list) {
            j.visibility = View.INVISIBLE
        }
        for (i in list) {
            if (count > 0) {
                i.visibility = View.VISIBLE
                count--
            }
        }
    }


    fun addView(storage: File) {
        if (folder18.visibility == View.VISIBLE) {
            Toast.makeText(requireContext(),"Maximium limit reached. No more folders can be created.",Toast.LENGTH_LONG).show()
            val intent = Intent(requireContext(), FolderOptionsFragment::class.java).apply {

            }
            startActivity(intent)
        } else {
            val mediaStorageDir: File =
                File(context?.getExternalFilesDir("Storage-1"), "/Folder${no}")
            mediaStorageDir.mkdirs()
            if (no == 1) folder1.visibility = View.VISIBLE
            if (no == 2) folder2.visibility = View.VISIBLE
            if (no == 3) folder3.visibility = View.VISIBLE
            if (no == 4) folder4.visibility = View.VISIBLE
            if (no == 5) folder5.visibility = View.VISIBLE
            if (no == 6) folder6.visibility = View.VISIBLE
            if (no == 7) folder7.visibility = View.VISIBLE
            if (no == 8) folder8.visibility = View.VISIBLE
            if (no == 9) folder9.visibility = View.VISIBLE
            if (no == 10) folder10.visibility = View.VISIBLE
            if (no == 11) folder11.visibility = View.VISIBLE
            if (no == 12) folder12.visibility = View.VISIBLE
            if (no == 13) folder13.visibility = View.VISIBLE
            if (no == 14) folder14.visibility = View.VISIBLE
            if (no == 15) folder15.visibility = View.VISIBLE
            if (no == 16) folder16.visibility = View.VISIBLE
            if (no == 17) folder17.visibility = View.VISIBLE
            if (no == 18) folder18.visibility = View.VISIBLE
            no++
        }
    }

}
