package com.example.smoothie.logIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smoothie.R
import com.example.smoothie.databinding.FragmentAccountSetupBinding


class AccountSetupFragment : Fragment() {

    private lateinit var binding: FragmentAccountSetupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_setup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAccountSetupBinding.bind(view)

        binding.createAccount.setOnClickListener {
            val action = AccountSetupFragmentDirections.actionAccountSetupFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

}