package com.example.daggerviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

     private lateinit var activityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


////        //First way - Deprecated
//         activityViewModel =
//            ViewModelProvider(this).get(MainActivityViewModel::class.java)
//
//        Log.d("abc", activityViewModel.toString())

        //Second way of creating ViewModel
        val activityViewModel:MainActivityViewModel by viewModels()






    }


}