package com.vaca.bodyfat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.holtek.libHTBodyfat.HTBodyResultTwoLegs


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var f669t: HTBodyResultTwoLegs=HTBodyResultTwoLegs()

    }
}