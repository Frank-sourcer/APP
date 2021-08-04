package com.example.smoothie.logIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smoothie.R
import com.example.smoothie.databinding.FragmentRegisterLoginBinding

class RegisterLoginFragment : Fragment() {

    private lateinit var binding: FragmentRegisterLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterLoginBinding.bind(view)

        binding.Login.setOnClickListener{
            val action = RegisterLoginFragmentDirections.actionRegisterLoginFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }

}