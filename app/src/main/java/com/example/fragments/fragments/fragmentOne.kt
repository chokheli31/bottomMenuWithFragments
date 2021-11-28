package com.example.fragments.fragments

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.fragments.R
import java.sql.Ref

class fragmentOne : Fragment (R.layout.fragment_one){

    private lateinit var editTextAmmount: EditText
    private lateinit var sendButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextAmmount = view.findViewById(R.id.editTextAmmount)
        sendButton = view.findViewById(R.id.sendbutton)

        sendButton.setOnClickListener{

        }

    }

}