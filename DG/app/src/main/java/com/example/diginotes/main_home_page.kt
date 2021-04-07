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
     lateinit open var linear: GridLayout;
    lateinit open var addFolder: ImageButton;
    lateinit var Folder1 : ImageButton
    lateinit var Folder2 : ImageButton
    lateinit var Folder3 : ImageButton
    lateinit var Folder4 : ImageButton
  lateinit var Folder5 : ImageButton
  lateinit var Folder6 : ImageButton
  lateinit var Folder7 : ImageButton
  lateinit var Folder8 : ImageButton
  lateinit var Folder9 : ImageButton
    lateinit var Folder10 : ImageButton
    lateinit var Folder11 : ImageButton
    lateinit var Folder12 : ImageButton
    lateinit var Folder13 : ImageButton
    lateinit var Folder14 : ImageButton
    lateinit var Folder15 : ImageButton
    lateinit var Folder16 : ImageButton
    lateinit var Folder17 : ImageButton
    lateinit var Folder18 : ImageButton
    var no : Int = 1
    lateinit var storage : File
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
        addFolder = findViewById(R.id.add)
        linear = findViewById(R.id.Grid)
        Folder1 = findViewById(R.id.Folder1)
        Folder2 = findViewById(R.id.Folder2)
        Folder3 = findViewById(R.id.Folder3)
        Folder4 = findViewById(R.id.Folder4)
        Folder5 = findViewById(R.id.Folder5)
        Folder6 = findViewById(R.id.Folder6)
        Folder7 = findViewById(R.id.Folder7)
        Folder8 = findViewById(R.id.Folder8)
        Folder9 = findViewById(R.id.Folder9)
        Folder10 = findViewById(R.id.Folder10)
        Folder11 = findViewById(R.id.Folder11)
        Folder12 = findViewById(R.id.Folder12)
        Folder13 = findViewById(R.id.Folder13)
        Folder14 = findViewById(R.id.Folder14)
        Folder15 = findViewById(R.id.Folder15)
        Folder16 = findViewById(R.id.Folder16)
        Folder17 = findViewById(R.id.Folder17)
        Folder18 = findViewById(R.id.Folder18)

        storage  = File(applicationContext.getExternalFilesDir(null),"Storage-1")
        storage.mkdirs()
        addFolder.setOnClickListener(View.OnClickListener
        {
            addView(storage)
        })
    }
    }
override fun onStart() {
        super.onStart()
        visibility(storage)
    }
    private fun visibility(storage: File) {
        Folder1.setVisibility(View.INVISIBLE)
        Folder2.setVisibility(View.INVISIBLE)
        Folder3.setVisibility(View.INVISIBLE)
        Folder4.setVisibility(View.INVISIBLE)
        Folder5.setVisibility(View.INVISIBLE)
        Folder6.setVisibility(View.INVISIBLE)
        Folder7.setVisibility(View.INVISIBLE)
        Folder8.setVisibility(View.INVISIBLE)
        Folder9.setVisibility(View.INVISIBLE)
        Folder10.setVisibility(View.INVISIBLE)
        Folder11.setVisibility(View.INVISIBLE)
        Folder12.setVisibility(View.INVISIBLE)
        Folder13.setVisibility(View.INVISIBLE)
        Folder14.setVisibility(View.INVISIBLE)
        Folder15.setVisibility(View.INVISIBLE)
        Folder16.setVisibility(View.INVISIBLE)
        Folder17.setVisibility(View.INVISIBLE)
        Folder18.setVisibility(View.INVISIBLE)
        var count =  storage.listFiles().size
        if(count==1) Folder1.setVisibility(View.VISIBLE)
        if(count==2){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
        }
        if (count==3){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
        }
        if(count==4){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
        }
        if(count==5){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
        }
        if(count==6){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
        }
        if(count==7){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
        }
        if(count==8){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
        }
        if(count==9){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
        }
        if(count==10){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
        }
        if(count==11){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
        }
        if(count==12){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
        }
        if(count==13){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
        }
        if(count==14){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
            Folder14.setVisibility(View.VISIBLE)
        }
        if(count==15){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
            Folder14.setVisibility(View.VISIBLE)
            Folder15.setVisibility(View.VISIBLE)
        }
        if(count==16){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
            Folder14.setVisibility(View.VISIBLE)
            Folder15.setVisibility(View.VISIBLE)
            Folder16.setVisibility(View.VISIBLE)
        }
        if(count==17){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
            Folder14.setVisibility(View.VISIBLE)
            Folder15.setVisibility(View.VISIBLE)
            Folder16.setVisibility(View.VISIBLE)
            Folder17.setVisibility(View.VISIBLE)
        }
        if(count==18){
            Folder1.setVisibility(View.VISIBLE)
            Folder2.setVisibility(View.VISIBLE)
            Folder3.setVisibility(View.VISIBLE)
            Folder4.setVisibility(View.VISIBLE)
            Folder5.setVisibility(View.VISIBLE)
            Folder6.setVisibility(View.VISIBLE)
            Folder7.setVisibility(View.VISIBLE)
            Folder8.setVisibility(View.VISIBLE)
            Folder9.setVisibility(View.VISIBLE)
            Folder10.setVisibility(View.VISIBLE)
            Folder11.setVisibility(View.VISIBLE)
            Folder12.setVisibility(View.VISIBLE)
            Folder13.setVisibility(View.VISIBLE)
            Folder14.setVisibility(View.VISIBLE)
            Folder15.setVisibility(View.VISIBLE)
            Folder16.setVisibility(View.VISIBLE)
            Folder17.setVisibility(View.VISIBLE)
            Folder18.setVisibility(View.VISIBLE)
        }
    }


    fun addView(storage:File) {
        if(Folder18.isVisible) {
//            Toast.makeText(this,"Maximium limit reached. No more folders can be created.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, FolderPage2::class.java).apply {

            }
            startActivity(intent)
        }
        else{
            val mediaStorageDir: File = File(applicationContext.getExternalFilesDir("Storage-1"), "/Folder${no}")
            mediaStorageDir.mkdirs()
            if(no==1) Folder1.setVisibility(View.VISIBLE)
            if(no==2) Folder2.setVisibility(View.VISIBLE)
            if(no==3) Folder3.setVisibility(View.VISIBLE)
            if(no==4) Folder4.setVisibility(View.VISIBLE)
            if(no==5) Folder5.setVisibility(View.VISIBLE)
            if(no==6) Folder6.setVisibility(View.VISIBLE)
            if(no==7) Folder7.setVisibility(View.VISIBLE)
            if(no==8) Folder8.setVisibility(View.VISIBLE)
            if(no==9) Folder9.setVisibility(View.VISIBLE)
            if(no==10) Folder10.setVisibility(View.VISIBLE)
            if(no==11) Folder11.setVisibility(View.VISIBLE)
            if(no==12) Folder12.setVisibility(View.VISIBLE)
            if(no==13) Folder13.setVisibility(View.VISIBLE)
            if(no==14) Folder14.setVisibility(View.VISIBLE)
            if(no==15) Folder15.setVisibility(View.VISIBLE)
            if(no==16) Folder16.setVisibility(View.VISIBLE)
            if(no==17) Folder17.setVisibility(View.VISIBLE)
            if(no==18) Folder18.setVisibility(View.VISIBLE)
            no++
        }
    }



}
