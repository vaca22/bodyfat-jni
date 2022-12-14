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


        //男是0， 女是1
        val gender=0;



        /*  int i3 = (bArr[11] >> 4) & 15;
                double d2 = ((bArr[12] & 255) << 8) | (bArr[13] & 255);
                if (i3 == 1) {
                    d2 /= 10.0d;
                } else if (i3 == 2) {
                    d2 /= 100.0d;
                }
*/
        val weight=69.2


        val height=175

        val age=25

        val hTBodyBasicInfo =
            HTBodyBasicInfo((gender+1)%2, height, weight, age)
        //可能是阻抗
        //(((bArr[14] & 255) << 24) | ((bArr[15] & 255) << 16) | ((bArr[16] & 255) << 8) | (bArr[17] & 255));
        hTBodyBasicInfo.f88e = 3818525
        val m546a = f669t.m546a(hTBodyBasicInfo)
        Log.e("1004Calc", "execue1004:666 $m546a")
        val re1=f669t.f147C
        Log.e("gaga",re1.toString())

        val result=C0051c().setGender(gender);
        result.f669t=f669t
        result.f691o= ScaleInfo()
        result.f691o.m478A(re1)
        result.f691o.m393k(0.0)
        result.f691o.m389l(0.0)
        result.f691o.m385m(0.0)
        result.f691o.m355x(0.0)
        result.f691o.m353y(0.0)
        result.f691o.m351z(0.0)
        result.f691o.m405h(0.0)
        result.f691o.m401i(0.0)
        result.f691o.m397j(0.0)
        result.f691o.m361u(0.0)
        result.f691o.m359v(0.0)
        result.f691o.m357w(0.0)

        if (m546a == 0) {
            result.f691o.m388l(0);
        } else if (m546a == 1 || m546a == 4 || m546a == 8) {
            result.f691o.m388l(4006);
        } else if (m546a == 16 || m546a == 32 || m546a == 64 || m546a == 128 || m546a == 256) {
            result.f691o.m388l(4008);
        }

        result.loadNativeData();
        result.f691o.apply {
            m442a(age.toDouble());
            m416e(gender);
            m408g(height);
        }


        val gg=result.f691o.m440a().toString()
        Log.e("good",gg.toString())



    }
}