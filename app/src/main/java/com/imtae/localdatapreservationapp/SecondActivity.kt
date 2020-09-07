package com.imtae.localdatapreservationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.imtae.localdatapreservation.LocalDataPreservation
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("LocalDataPreservation", LocalDataPreservation.getData("int").toString())
        Log.d("LocalDataPreservation", LocalDataPreservation.getData("double").toString())
        Log.d("LocalDataPreservation", LocalDataPreservation.getData("boolean").toString())
        Log.d("LocalDataPreservation", LocalDataPreservation.getData("string").toString())
        Log.d("LocalDataPreservation", LocalDataPreservation.getData("char").toString())

        // java.lang.Exception: LocalDataPreservation | 존재하지 않는 Key 입니다.
        // Log.d("LocalDataPreservation", LocalDataPreservation.getData("error").toString())

        val user = LocalDataPreservation.getData("user") as User

        name.text = user.name
        age.text = user.age.toString()
    }
}