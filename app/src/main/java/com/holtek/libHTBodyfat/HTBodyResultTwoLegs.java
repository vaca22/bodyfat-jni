package com.holtek.libHTBodyfat;

import android.util.Log;

import java.util.Hashtable;

/* loaded from: vtble-sdk-android-v3.7.3.aar:classes.jar:com/holtek/libHTBodyfat/HTBodyResultTwoLegs.class */
public class HTBodyResultTwoLegs extends HTBodyResult {

    /* renamed from: C */
    public double f147C;

    private native int native_checkbody(double d, double d2, int i, int i2);

    private native int native_getbodyfat(int i, boolean z);

    private native double native_z_twolegs();

    private native int[] native_exercise_plannerlist();

    private native double native_bodyfat_freemass();

    private native double native_protein_percentage();

    private native double[] native_protein_ratinglist();

    private native double native_bmi();

    private native double[] native_bmi_ratinglist();

    private native int native_vfal();

    private native int[] native_vfal_ratinglist();

    private native double native_bone_kg();

    private native double[] native_bone_ratinglist();

    private native double native_bodyfat_kg();

    private native double native_bodyfat_percentage();

    private native double[] native_bodyfat_ratinglist();

    private native double native_water_percentage();

    private native double[] native_water_ratinglist();

    private native double native_muscle_kg();

    private native double native_muscle_percentage();

    private native double[] native_muscle_ratinglist();

    private native int native_body_age();

    private native double native_ideal_weight();

    private native int native_body_type();

    private native int native_body_score();

    private native double native_bodyfat_subcut();

    private native double native_bodyfat_subcutkg();

    private native double[] native_bodyfat_subcut_ratinglist();

    static {
        System.loadLibrary("Bodyfat_SDK");
    }

    /* renamed from: a */
    public int m546a(HTBodyBasicInfo hTBodyBasicInfo) {
        native_checkbody(hTBodyBasicInfo.f84a, hTBodyBasicInfo.f85b, hTBodyBasicInfo.f86c, hTBodyBasicInfo.f87d);
        int native_getbodyfat = native_getbodyfat(hTBodyBasicInfo.f88e, true);
        if (native_getbodyfat == 0) {
            this.f100g = native_bodyfat_percentage();
            this.f101h = native_water_percentage();
            this.f98e = native_bone_kg();
            this.f103j = native_muscle_kg();
            this.f97d = native_vfal();
            this.f96c = native_bmr();
            this.f95b = native_bmi();
            this.f109p = native_ideal_weight();
            this.f108o = native_body_age();
            this.f102i = native_protein_percentage();
            this.f105l = native_bodyfat_subcut();
            this.f106m = native_bodyfat_subcutkg();
            int[] native_exercise_plannerlist = native_exercise_plannerlist();
            this.f121B.put("walking", String.valueOf(native_exercise_plannerlist[0]));
            this.f121B.put("jogging", String.valueOf(native_exercise_plannerlist[1]));
            this.f121B.put("bicycle", String.valueOf(native_exercise_plannerlist[2]));
            this.f121B.put("swim", String.valueOf(native_exercise_plannerlist[3]));
            this.f121B.put("mountain_climbing", String.valueOf(native_exercise_plannerlist[4]));
            this.f121B.put("aerobic", String.valueOf(native_exercise_plannerlist[5]));
            this.f121B.put("tabletennis", String.valueOf(native_exercise_plannerlist[6]));
            this.f121B.put("tennis", String.valueOf(native_exercise_plannerlist[7]));
            this.f121B.put("football", String.valueOf(native_exercise_plannerlist[8]));
            this.f121B.put("oriental_fencing", String.valueOf(native_exercise_plannerlist[9]));
            this.f121B.put("gateball", String.valueOf(native_exercise_plannerlist[10]));
            this.f121B.put("badminton", String.valueOf(native_exercise_plannerlist[11]));
            this.f121B.put("racketball", String.valueOf(native_exercise_plannerlist[12]));
            this.f121B.put("tae_kwon_do", String.valueOf(native_exercise_plannerlist[13]));
            this.f121B.put("squash", String.valueOf(native_exercise_plannerlist[14]));
            this.f121B.put("basketball", String.valueOf(native_exercise_plannerlist[15]));
            this.f121B.put("ropejumping", String.valueOf(native_exercise_plannerlist[16]));
            this.f121B.put("golf", String.valueOf(native_exercise_plannerlist[17]));
            double[] native_bmi_ratinglist = native_bmi_ratinglist();
            this.f112s.put("瘦-普通", String.valueOf(native_bmi_ratinglist[0]));
            this.f112s.put("普通-偏胖", String.valueOf(native_bmi_ratinglist[1]));
            this.f112s.put("偏胖-肥胖", String.valueOf(native_bmi_ratinglist[2]));
            int[] native_bmr_ratinglist = native_bmr_ratinglist();
            this.f113t = new Hashtable<>();
            this.f113t.put("偏低-达标", String.valueOf(native_bmr_ratinglist[0]));
            double[] native_bodyfat_ratinglist = native_bodyfat_ratinglist();
            this.f116w.put("偏瘦-标准", String.valueOf(native_bodyfat_ratinglist[0]));
            this.f116w.put("标准-警惕", String.valueOf(native_bodyfat_ratinglist[1]));
            this.f116w.put("警惕-偏胖", String.valueOf(native_bodyfat_ratinglist[2]));
            this.f116w.put("偏胖-肥胖", String.valueOf(native_bodyfat_ratinglist[3]));
            double[] native_bone_ratinglist = native_bone_ratinglist();
            this.f115v.put("不足-标准", String.valueOf(native_bone_ratinglist[0]));
            this.f115v.put("标准-优秀", String.valueOf(native_bone_ratinglist[1]));
            double[] native_muscle_ratinglist = native_muscle_ratinglist();
            this.f118y.put("不足-标准", String.valueOf(native_muscle_ratinglist[0]));
            this.f118y.put("标准-优秀", String.valueOf(native_muscle_ratinglist[1]));
            int[] native_vfal_ratinglist = native_vfal_ratinglist();
            this.f114u.put("标准-警惕", String.valueOf(native_vfal_ratinglist[0]));
            this.f114u.put("警惕-危险", String.valueOf(native_vfal_ratinglist[1]));
            double[] native_water_ratinglist = native_water_ratinglist();
            this.f117x.put("不足-标准", String.valueOf(native_water_ratinglist[0]));
            this.f117x.put("标准-优秀", String.valueOf(native_water_ratinglist[1]));
            double[] native_bodyfat_subcut_ratinglist = native_bodyfat_subcut_ratinglist();
            this.f120A.put("低-标准", String.valueOf(native_bodyfat_subcut_ratinglist[0]));
            this.f120A.put("标准-高", String.valueOf(native_bodyfat_subcut_ratinglist[1]));
            double[] native_protein_ratinglist = native_protein_ratinglist();
            this.f119z.put("不足-标准", String.valueOf(native_protein_ratinglist[0]));
            this.f119z.put("标准-优秀", String.valueOf(native_protein_ratinglist[1]));
            this.f110q = native_body_type();
            this.f111r = native_body_score();
            this.f104k = native_muscle_percentage();
            this.f99f = native_bodyfat_kg();
            this.f107n = native_bodyfat_freemass();
        } else {
            if ((native_getbodyfat & 4) == 4 || (native_getbodyfat & 2) == 2) {
                this.f95b = 0.0d;
                this.f109p = 0.0d;
            } else {
                this.f95b = native_bmi();
                this.f109p = native_ideal_weight();
            }
            this.f97d = 0;
            this.f100g = 0.0d;
            this.f101h = 0.0d;
            this.f103j = 0.0d;
            this.f98e = 0.0d;
            this.f96c = 0;
            this.f108o = 0;
            this.f102i = 0.0d;
            this.f110q = 0;
            this.f111r = 0;
            this.f104k = 0.0d;
            this.f99f = 0.0d;
            this.f107n = 0.0d;
            this.f105l = 0.0d;
            this.f106m = 0.0d;
        }
        this.f147C = native_z_twolegs();
        this.f94a = native_getbodyfat;
        return native_getbodyfat;
    }

    public native int native_bmr();

    public native int[] native_bmr_ratinglist();
}
