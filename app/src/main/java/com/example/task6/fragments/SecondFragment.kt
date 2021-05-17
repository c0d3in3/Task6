package com.example.task6.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.task6.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments
            ?.takeIf { j -> j.containsKey("STRING") }
            ?.apply {
                view.findViewById<TextView>(R.id.textView).text = getString("STRING")
            }
    }
}