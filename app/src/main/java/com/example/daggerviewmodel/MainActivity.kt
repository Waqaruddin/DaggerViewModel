package com.example.daggerviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
     lateinit var activityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).applicationComponent.inject(this)


////        //First way - Deprecated
//         activityViewModel =
//            ViewModelProvider(this).get(MainActivityViewModel::class.java)
//
//        Log.d("abc", activityViewModel.toString())

//        //Second way of creating ViewModel
//        val activityViewModel:MainActivityViewModel by viewModels()


        // inject ViewModel into Main Activity
        // dependency
        //@Inject for ViewModel
        //




    }


}