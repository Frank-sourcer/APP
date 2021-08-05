package com.example.smoothie.logIn

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smoothie.R


class SplashFragment : Fragment() {
    private val timeOut = 3000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler(Looper.getMainLooper()).postDelayed(

            {
               val action = SplashFragmentDirections.actionSplashFragmentToExpFragment()
                findNavController().navigate(action)
            }, timeOut.toLong()
        )

        return view
    }

}