package com.example.diginotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.diginotes.databinding.FragmentSignUpBinding
import com.google.firebase.auth.FirebaseAuth


class signUp : Fragment() {
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSignUpBinding>(inflater,
                R.layout.fragment_sign_up,container,false)

        auth = FirebaseAuth.getInstance()

        binding.alreadyUser.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_signUp_to_loginPage2)
        }

        binding.signUpButton.setOnClickListener {
            if (binding.username.text.toString().isEmpty()) {
              binding.username.error="Please Enter the Username"
                binding.username.requestFocus()
                return@setOnClickListener
            }
            if (binding.email.text.toString().isEmpty()) {
                binding.email.error="Please Enter the Email id"
                binding.email.requestFocus()
                return@setOnClickListener
            }
            if (binding.passwordText.text.toString().isEmpty()) {
                binding.passwordText.error="Please Enter the password"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }
            if (binding.passwordText.length()<6) {
                binding.passwordText.error="Length must be atleast 6 characters"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }
            if (binding.confirmPasswordText.text.toString().isEmpty()) {
                binding.confirmPasswordText.error="Please re-enter the password "
                binding.confirmPasswordText.requestFocus()
                return@setOnClickListener
            }
            if (binding.passwordText.text.toString()!=binding.confirmPasswordText.text.toString()) {
                binding.confirmPasswordText.error="Please re-enter correct password"
                binding.confirmPasswordText.requestFocus()
                return@setOnClickListener
            }

            auth.createUserWithEmailAndPassword(binding.email.text.toString(), binding.passwordText.text.toString())
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            user?.sendEmailVerification()
                                    ?.addOnCompleteListener { task ->
                                        if (task.isSuccessful) {
                                            Toast.makeText(requireActivity(), "Registered Successfully!",
                                                    Toast.LENGTH_SHORT).show()
                                            view?.findNavController()?.navigate(R.id.action_signUp_to_loginPage2)
                                        }
                                    }
                        } else {
                            Toast.makeText(requireActivity(), "Sign Up failed. Try again after some time.",
                                    Toast.LENGTH_SHORT).show()
                        }
                    }
        }
        return binding.root
    }
}






