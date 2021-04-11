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
    lateinit var folder19 : ImageButton
    lateinit var folder20 : ImageButton
    lateinit var folder21 : ImageButton
    lateinit var folder22 : ImageButton
    lateinit var folder23 : ImageButton
    lateinit var folder24 : ImageButton
    lateinit var folder25 : ImageButton
    lateinit var folder26 : ImageButton
    lateinit var folder27 : ImageButton
    lateinit var folder28 : ImageButton
    lateinit var folder29 : ImageButton
    lateinit var folder30 : ImageButton
    lateinit var folder31 : ImageButton
    lateinit var folder32 : ImageButton
    lateinit var folder33 : ImageButton
    lateinit var folder34 : ImageButton
    lateinit var folder35 : ImageButton
    lateinit var folder36 : ImageButton
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var text3 : TextView
    lateinit var text4 : TextView
    lateinit var text5 : TextView
    lateinit var text6 : TextView
    lateinit var text7 : TextView
    lateinit var text8 : TextView
    lateinit var text9 : TextView
    lateinit var text10 : TextView
    lateinit var text11 : TextView
    lateinit var text12 : TextView
    lateinit var text13 : TextView
    lateinit var text14 : TextView
    lateinit var text15 : TextView
    lateinit var text16 : TextView
    lateinit var text17 : TextView
    lateinit var text18 : TextView
    lateinit var text19 : TextView
    lateinit var text20 : TextView
    lateinit var text21 : TextView
    lateinit var text22 : TextView
    lateinit var text23 : TextView
    lateinit var text24 : TextView
    lateinit var text25 : TextView
    lateinit var text26 : TextView
    lateinit var text27 : TextView
    lateinit var text28 : TextView
    lateinit var text29 : TextView
    lateinit var text30 : TextView
    lateinit var text31 : TextView
    lateinit var text32 : TextView
    lateinit var text33 : TextView
    lateinit var text34 : TextView
    lateinit var text35 : TextView
    lateinit var text36 : TextView

    lateinit var dialogBuilder: AlertDialog.Builder
    lateinit var dialog: AlertDialog
    lateinit var nameOfFolder: EditText
    lateinit var click: Button
    var no : Int = 1
    lateinit var storage : File
    lateinit var list: List<ImageButton>
    var s1 = "shared1" ;var T1 = "text1" ;var s2 = "shared2" ;var T2 = "text2";var s3 = "shared3" ;var T3 = "text3" ;var s4 = "shared4" ;var T4 = "text4";var s5 = "shared5" ;var T5 = "text5" ;var s6 = "shared6" ;var T6 = "text6";var s7 = "shared7" ;var T7 = "text7" ;var s8 = "shared8" ;var T8 = "text8";var s9 = "shared9" ;var T9 = "text9" ;var s10 = "shared10" ;var T10 = "text10";var s11 = "shared11" ;var T11 = "text11" ;var s12 = "shared12" ;var T12 = "text12";var s13 = "shared13" ;var T13 = "text13" ;var s14 = "shared14" ;var T14 = "text14";var s15 = "shared15" ;var T15 = "text15" ;var s16 = "shared16" ;var T16 = "text16";var s17 = "shared17" ;var T17 = "text17" ;var s18 = "shared18" ;var T18 = "text18";var s19 = "shared19" ;var T19 = "text19" ;var s20 = "shared20" ;var T20 = "text20";var s21 = "shared21" ;var T21 = "text21" ;var s22 = "shared22" ;var T22 = "text22";var s23 = "shared23" ;var T23 = "text23";var s24 = "shared24" ;var T24 = "text24" ;var s25 = "shared25" ;var T25 = "text25";var s26 = "shared26" ;var T26 = "text26" ;var s27 = "shared27" ;var T27 = "text27";var s28 = "shared28" ;var T28 = "text28" ;var s29 = "shared29" ;var T29 = "text29";var s30 = "shared30" ;var T30 = "text30" ;var s31 = "shared31" ;var T31 = "text31";var s32 = "shared32" ;var T32 = "text32";var s33 = "shared33" ;var T33 = "text33" ;var s34 = "shared34" ;var T34 = "text34";var s35 = "shared35" ;var T35 = "text35" ;var s36 = "shared36" ;var T36 = "text36";
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
        folder19 = binding.Folder19
        folder20 = binding.Folder20
        folder21 = binding.Folder21
        folder22 = binding.Folder22
        folder23 = binding.Folder23
        folder24 = binding.Folder24
        folder25 = binding.Folder25
        folder26 = binding.Folder26
        folder27 = binding.Folder27
        folder28 = binding.Folder28
        folder29 = binding.Folder29
        folder30 = binding.Folder30
        folder31 = binding.Folder31
        folder32 = binding.Folder32
        folder33 = binding.Folder33
        folder34 = binding.Folder34
        folder35 = binding.Folder35
        folder36 = binding.Folder36
        text1 = binding.text1
        text2 = binding.text2
        text3 = binding.text3
        text4 = binding.text4
        text5 = binding.text5
        text6 = binding.text6
        text7 = binding.text7
        text8 = binding.text8
        text9 = binding.text9
        text10 = binding.text10
        text11 = binding.text11
        text12 = binding.text12
        text13 = binding.text13
        text14 = binding.text14
        text15 = binding.text15
        text16 = binding.text16
        text17 = binding.text17
        text18 = binding.text18
        text19 = binding.text19
        text20 = binding.text20
        text21 = binding.text21
        text22 = binding.text22
        text23 = binding.text23
        text24 = binding.text24
        text25 = binding.text25
        text26 = binding.text26
        text27 = binding.text27
        text28 = binding.text28
        text29 = binding.text29
        text30 = binding.text30
        text31 = binding.text31
        text32 = binding.text32
        text33 = binding.text33
        text34 = binding.text34
        text35 = binding.text35
        text36 = binding.text36

        storage = File(context?.getExternalFilesDir(null), "Storage-1")
        storage.mkdirs()
        addFolder.setOnClickListener(View.OnClickListener
        {
            dialogBuilder = AlertDialog.Builder(this)
            val contactPopUpView: View = layoutInflater.inflate(R.layout.popup, null)
            nameOfFolder = contactPopUpView.findViewById(R.id.nameOfFolder)
            click = contactPopUpView.findViewById(R.id.click)
            dialogBuilder.setView(contactPopUpView)
            dialog = dialogBuilder.create()
            dialog.show()

            click.setOnClickListener() {
                if (nameOfFolder.text.toString().isEmpty() || nameOfFolder.text.toString().isBlank()) {
                    Toast.makeText(this, "Please provide a Folder name", Toast.LENGTH_SHORT).show()
                } else {
                    createFolder()
                }
            }
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
            folder18,
            Folder19,
            Folder20,
            Folder21,
            Folder22,
            Folder23,
            Folder24,
            Folder25,
            Folder26,
            Folder27,
            Folder28,
            Folder29,
            Folder30,
            Folder31,
            Folder32,
            Folder33,
            Folder34,
            Folder35,
            Folder36
        )
        var ct = storage.listFiles().size
        var list2 = mutableListOf<Triple<TextView,String,String>>(Triple(text1,s1,T1),Triple(text2,s2,T2),Triple(text3,s3,T3),Triple(text3,s3,T3),Triple(text4,s4,T4),Triple(text5,s5,T5),Triple(text6,s6,T6),Triple(text7,s7,T7),Triple(text8,s8,T8),Triple(text9,s9,T9),Triple(text10,s10,T10),Triple(text11,s11,T11),Triple(text12,s12,T12),Triple(text13,s13,T13),Triple(text14,s15,T15),Triple(text16,s16,T16),Triple(text17,s17,T17),Triple(text18,s18,T18),Triple(text19,s19,T19),Triple(text20,s20,T20),Triple(text21,s21,T21),Triple(text22,s22,T22),Triple(text23,s23,T23),Triple(text24,s24,T24),Triple(text25,s25,T25),Triple(text26,s26,T26),Triple(text27,s27,T27),Triple(text28,s28,T28),Triple(text29,s29,T29),Triple(text30,s30,T30),Triple(text31,s31,T31),Triple(text32,s32,T32),Triple(text33,s33,T33),Triple(text34,s34,T34),Triple(text35,s35,T35),Triple(text36,s36,T36))
        for(x in list2){
            if(ct >0){
                var y = update(x.first,x.second,x.third)
                y.setVisibility(View.VISIBLE)
                println("sahbcjksnhcldo")
                ct--
            }
        }
        for (i in list) {
            if (count > 0) {
                i.visibility = View.VISIBLE
                count--
            }
        }
    }


    private fun createFolder() {
        if(Folder36.isVisible) {
            Toast.makeText(
                    this,
                    "Maximum limit reached. No more folders can be created!",
                    Toast.LENGTH_SHORT
            ).show()
        }
        else{
            no = storage.listFiles().size+1
            val mediaStorageDir: File = File(
                    applicationContext.getExternalFilesDir("Storage-1"),
                    "/${nameOfFolder.text}"
            )
            mediaStorageDir.mkdirs()
            if(no==1){
                Folder1.setVisibility(View.VISIBLE)
                text1.text="${nameOfFolder.text}"
                text1.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s1, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T1, text1.text.toString())
                editor.apply()
                update(text1,s1,T1)
            }

            if(no==2){
                Folder2.setVisibility(View.VISIBLE)
                text2.text = "${nameOfFolder.text}"
                text2.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s2, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T2, text2.text.toString())
                editor.apply()
                update(text2,s2,T2)
            }
            if(no==3){
                Folder3.setVisibility(View.VISIBLE)
                text3.text = "${nameOfFolder.text}"
                text3.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s3, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T3, text3.text.toString())
                editor.apply()
                update(text3,s3,T3)
            }
            if(no==4){
                Folder4.setVisibility(View.VISIBLE)
                text4.text = "${nameOfFolder.text}"
                text4.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s4, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T4, text4.text.toString())
                editor.apply()
                update(text4,s4,T4)
            }
            if(no==5){
                Folder5.setVisibility(View.VISIBLE)
                text5.text = "${nameOfFolder.text}"
                text5.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s5, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T5, text5.text.toString())
                editor.apply()
                update(text5,s5,T5)
            }
            if(no==6) {
                Folder6.setVisibility(View.VISIBLE)
                text6.text = "${nameOfFolder.text}"
                text6.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s6, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T6, text6.text.toString())
                editor.apply()
                update(text6,s6,T6)
            }
            if(no==7){
                Folder7.setVisibility(View.VISIBLE)
                text7.text = "${nameOfFolder.text}"
                text7.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s7, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T7, text7.text.toString())
                editor.apply()
                update(text7,s7,T7)
            }
            if(no==8){
                Folder8.setVisibility(View.VISIBLE)
                text8.text = "${nameOfFolder.text}"
                text8.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s8, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T8, text8.text.toString())
                editor.apply()
                update(text8,s8,T8)
            }
            if(no==9){
                Folder9.setVisibility(View.VISIBLE)
                text9.text = "${nameOfFolder.text}"
                text9.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s9, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T9, text9.text.toString())
                editor.apply()
                update(text9,s9,T9)
            }
            if(no==10){
                Folder10.setVisibility(View.VISIBLE)
                text10.text = "${nameOfFolder.text}"
                text10.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s10, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T10, text10.text.toString())
                editor.apply()
                update(text10,s10,T10)
            }
            if(no==11){
                Folder11.setVisibility(View.VISIBLE)
                text11.text = "${nameOfFolder.text}"
                text11.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s11, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T11, text11.text.toString())
                editor.apply()
                update(text11,s11,T11)
            }
            if(no==12){
                Folder12.setVisibility(View.VISIBLE)
                text12.text = "${nameOfFolder.text}"
                text12.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s12, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T12, text12.text.toString())
                editor.apply()
                update(text12,s12,T12)
            }
            if(no==13){
                Folder13.setVisibility(View.VISIBLE)
                text13.text = "${nameOfFolder.text}"
                text13.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s13, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T13, text13.text.toString())
                editor.apply()
                update(text13,s13,T13)
            }
            if(no==14){
                Folder14.setVisibility(View.VISIBLE)
                text14.text = "${nameOfFolder.text}"
                text14.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s14, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T14, text14.text.toString())
                editor.apply()
                update(text14,s14,T14)
            }
            if(no==15){
                Folder15.setVisibility(View.VISIBLE)
                text15.text = "${nameOfFolder.text}"
                text15.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s15, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T15, text15.text.toString())
                editor.apply()
                update(text15,s15,T15)
            }
            if(no==16){
                Folder16.setVisibility(View.VISIBLE)
                text16.text = "${nameOfFolder.text}"
                text16.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s16, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T16, text16.text.toString())
                editor.apply()
                update(text16,s16,T16)
            }
            if(no==17){
                Folder17.setVisibility(View.VISIBLE)
                text17.text = "${nameOfFolder.text}"
                text17.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s17, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T17, text17.text.toString())
                editor.apply()
                update(text17,s17,T17)
            }
            if(no==18){
                Folder18.setVisibility(View.VISIBLE)
                text18.text = "${nameOfFolder.text}"
                text18.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s18, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T18, text18.text.toString())
                editor.apply()
                update(text18,s18,T18)
            }
            if(no==19){
                Folder19.setVisibility(View.VISIBLE)
                text19.text = "${nameOfFolder.text}"
                text19.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s19, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T19, text19.text.toString())
                editor.apply()
                update(text19,s19,T19)
            }
            if(no==20){
                Folder20.setVisibility(View.VISIBLE)
                text20.text = "${nameOfFolder.text}"
                text20.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s20, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T20, text20.text.toString())
                editor.apply()
                update(text20,s20,T20)
            }
            if(no==21){
                Folder21.setVisibility(View.VISIBLE)
                text21.text = "${nameOfFolder.text}"
                text21.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s21, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T21, text21.text.toString())
                editor.apply()
                update(text21,s21,T21)
            }
            if(no==22){
                Folder22.setVisibility(View.VISIBLE)
                text22.text = "${nameOfFolder.text}"
                text22.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s22, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T22, text22.text.toString())
                editor.apply()
                update(text22,s22,T22)
            }
            if(no==23){
                Folder23.setVisibility(View.VISIBLE)
                text23.text = "${nameOfFolder.text}"
                text23.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s23, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T23, text23.text.toString())
                editor.apply()
                update(text23,s23,T23)
            }
            if(no==24){
                Folder24.setVisibility(View.VISIBLE)
                text24.text = "${nameOfFolder.text}"
                text24.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s24, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T24, text24.text.toString())
                editor.apply()
                update(text24,s24,T24)
            }
            if(no==25){
                Folder25.setVisibility(View.VISIBLE)
                text25.text = "${nameOfFolder.text}"
                text25.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s25, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T25, text25.text.toString())
                editor.apply()
                update(text25,s25,T25)
            }
            if(no==26){
                Folder26.setVisibility(View.VISIBLE)
                text26.text = "${nameOfFolder.text}"
                text26.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s26, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T26, text26.text.toString())
                editor.apply()
                update(text26,s26,T26)
            }
            if(no==27){
                Folder27.setVisibility(View.VISIBLE)
                text27.text = "${nameOfFolder.text}"
                text27.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s27, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T27, text27.text.toString())
                editor.apply()
                update(text27,s27,T27)
            }
            if(no==28){
                Folder28.setVisibility(View.VISIBLE)
                text28.text = "${nameOfFolder.text}"
                text28.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s28, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T28, text28.text.toString())
                editor.apply()
                update(text28,s28,T28)
            }
            if(no==29){
                Folder29.setVisibility(View.VISIBLE)
                text29.text = "${nameOfFolder.text}"
                text29.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s29, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T29, text29.text.toString())
                editor.apply()
                update(text29,s29,T29)
            }
            if(no==30){
                Folder30.setVisibility(View.VISIBLE)
                text30.text = "${nameOfFolder.text}"
                text30.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s31, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T31, text31.text.toString())
                editor.apply()
                update(text31,s30,T30)
            }
            if(no==31){
                Folder31.setVisibility(View.VISIBLE)
                text31.text = "${nameOfFolder.text}"
                text31.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s31, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T31, text31.text.toString())
                editor.apply()
                update(text31,s31,T31)
            }
            if(no==32){
                Folder32.setVisibility(View.VISIBLE)
                text32.text = "${nameOfFolder.text}"
                text32.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s32, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T32, text32.text.toString())
                editor.apply()
                update(text32,s32,T32)
            }
            if(no==33){
                Folder33.setVisibility(View.VISIBLE)
                text33.text = "${nameOfFolder.text}"
                text33.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s33, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T33, text33.text.toString())
                editor.apply()
                update(text33,s33,T33)
            }
            if(no==34){
                Folder34.setVisibility(View.VISIBLE)
                text34.text = "${nameOfFolder.text}"
                text34.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s34, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T34, text34.text.toString())
                editor.apply()
                update(text34,s34,T34)
            }
            if(no==35){
                Folder35.setVisibility(View.VISIBLE)
                text35.text = "${nameOfFolder.text}"
                text35.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s35, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T35, text35.text.toString())
                editor.apply()
                update(text35,s35,T35)
            }
            if(no==36){
                Folder36.setVisibility(View.VISIBLE)
                text36.text = "${nameOfFolder.text}"
                text36.setVisibility(View.VISIBLE)
                val sharedPreferences = getSharedPreferences(s36, MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(T36, text36.text.toString())
                editor.apply()
                update(text36,s36,T36)
            }
    }

        dialog.dismiss()
}
    fun update(text : TextView,s : String, T : String ): TextView {
        val sharedPreferences = getSharedPreferences(s, MODE_PRIVATE)
        text.setText(sharedPreferences.getString(T,""))
        text.setVisibility(View.VISIBLE)
        return text
    }


}
