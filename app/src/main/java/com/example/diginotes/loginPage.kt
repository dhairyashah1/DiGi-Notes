package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.diginotes.databinding.FragmentLoginPageBinding
import com.google.firebase.auth.FirebaseAuth


class loginPage : Fragment() {
    private lateinit var binding: FragmentLoginPageBinding

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginPageBinding>(inflater,
            R.layout.fragment_login_page,container,false)
        auth = FirebaseAuth.getInstance()

        binding.newUser.setOnClickListener {
            binding.loginButton.findNavController().navigate(R.id. action_loginPage_to_signUp)
        }
        binding.loginButton.setOnClickListener {
            if (binding.usernameOrEmail.text.toString().isEmpty()) {
                binding.usernameOrEmail.error="Please Enter  Email id"
                binding.usernameOrEmail.requestFocus()
                return@setOnClickListener
            }
            if (binding.passwordText.text.toString().isEmpty()) {
                binding.passwordText.error="Please Enter the password"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(binding.usernameOrEmail.text.toString(), binding.passwordText.text.toString())
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            if (user != null) {
                                Toast.makeText(requireActivity(), "Login Successfully!", Toast.LENGTH_SHORT).show()
                                binding.loginButton.findNavController().navigate(R.id.action_loginPage_to_main_home_page)

                            }
                        } else {
                            Toast.makeText(requireActivity(), "Login failed.", Toast.LENGTH_SHORT).show()
                        }
                    }
        }

        return binding.root

    }

}




