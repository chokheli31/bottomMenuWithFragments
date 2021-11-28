package com.example.fragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RatingBar
import androidx.fragment.app.Fragment
import com.example.fragments.R


class fragmentTwo: Fragment(R.layout.fragment_two) {

    private lateinit var nameText: EditText
    private lateinit var surnameText: EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameText = view.findViewById(R.id.nameText)
        surnameText = view.findViewById(R.id.surnameText)


    }


}