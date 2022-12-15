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




        /*  int i3 = (bArr[11] >> 4) & 15;
                double d2 = ((bArr[12] & 255) << 8) | (bArr[13] & 255);
                if (i3 == 1) {
                    d2 /= 10.0d;
                } else if (i3 == 2) {
                    d2 /= 100.0d;
                }
*/
        val weight=69.4
        val height=175
        val age=25
        //男是0， 女是1
        val gender=0;
        val result=AnalysisFat()
        result.initScaleInfo(gender,age, height, weight)
        val gg=result.fatResult
        Log.e("good",gg)



    }
}