package com.dorukbatur.kotlindemo

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(){
        var a = 5;
        var b = 4;
        var c = b+a;
        c = c*2;
    }
}