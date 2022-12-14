package com.vaca.bodyfat

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.holtek.libHTBodyfat.HTBodyBasicInfo
import com.holtek.libHTBodyfat.HTBodyResultTwoLegs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var f669t: HTBodyResultTwoLegs=HTBodyResultTwoLegs()


        //男是1， 女是0
        val gender=1;



        /*  int i3 = (bArr[11] >> 4) & 15;
                double d2 = ((bArr[12] & 255) << 8) | (bArr[13] & 255);
                if (i3 == 1) {
                    d2 /= 10.0d;
                } else if (i3 == 2) {
                    d2 /= 100.0d;
                }
*/
        val weight=69.5


        val height=176

        val age=25

        val hTBodyBasicInfo =
            HTBodyBasicInfo(gender, height, weight, age)
        //可能是阻抗
        //(((bArr[14] & 255) << 24) | ((bArr[15] & 255) << 16) | ((bArr[16] & 255) << 8) | (bArr[17] & 255));
        hTBodyBasicInfo.f88e = 3518525
        val m546a = f669t.m546a(hTBodyBasicInfo)
        Log.e("1004Calc", "execue1004:666 $m546a")
        val re1=f669t.f147C
        Log.e("gaga",re1.toString())



    }
}