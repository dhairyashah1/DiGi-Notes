package com.example.diginotes

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
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
                R.layout.fragment_login_page, container, false)
        auth = FirebaseAuth.getInstance()

        binding.newUser.setOnClickListener {
            binding.loginButton.findNavController().navigate(R.id.action_loginPage_to_signUp)
        }
        binding.forgotPassword.setOnClickListener{
            val builder = AlertDialog.Builder(requireActivity())
            builder.setTitle("Forgot Password")
            val view = layoutInflater.inflate(R.layout.dailog_forgot_password,null)
            val username = view.findViewById<EditText>(R.id.forgot_password_text)
            builder.setView(view)
            builder.setPositiveButton("Reset", DialogInterface.OnClickListener { _, _ ->
                if (username.text.toString().isEmpty()) {
                    return@OnClickListener
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(username.text.toString()).matches()) {
                    return@OnClickListener
                }

                auth.sendPasswordResetEmail(username.text.toString())
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                Toast.makeText(requireActivity(),"Email sent.",Toast.LENGTH_SHORT).show()
                            }
                        }
            })
            builder.setNegativeButton("close", DialogInterface.OnClickListener { _, _ ->  })
            builder.show()
        }
        binding.loginButton.setOnClickListener {
            if (binding.usernameOrEmail.text.toString().isEmpty()) {
                binding.usernameOrEmail.error = "Please Enter  Email id"
                binding.usernameOrEmail.requestFocus()
                return@setOnClickListener
            }
            if (binding.passwordText.text.toString().isEmpty()) {
                binding.passwordText.error = "Please Enter the password"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(binding.usernameOrEmail.text.toString(), binding.passwordText.text.toString())
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            if (user != null) {
                                if (user.isEmailVerified) {
                                    Toast.makeText(requireActivity(), "Login Successfully!", Toast.LENGTH_SHORT).show()
                                    binding.loginButton.findNavController().navigate(R.id.action_loginPage_to_main_home_page)

                                } else {
                                    Toast.makeText(requireActivity(), "Please verify your email address.", Toast.LENGTH_SHORT).show()
                                }
                            }
                        } else {
                            Toast.makeText(requireActivity(), "Login failed.", Toast.LENGTH_SHORT).show()
                        }
                    }
        }
        return binding.root
    }

}


