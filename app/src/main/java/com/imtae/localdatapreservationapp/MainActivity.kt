package com.imtae.localdatapreservationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imtae.localdatapreservation.LocalDataPreservation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            LocalDataPreservation.setData["int"] = 7
            LocalDataPreservation.setData["double"] = 7.0
            LocalDataPreservation.setData["boolean"] = true
            LocalDataPreservation.setData["string"] = "리프"
            LocalDataPreservation.setData["char"] = 'T'

            val user = User("임리프", 19)
            LocalDataPreservation.setData["user"] = user

            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}