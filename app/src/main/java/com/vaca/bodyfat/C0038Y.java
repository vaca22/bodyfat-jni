package com.vaca.bodyfat;



import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vtrump.vtble.Y */
/* loaded from: vtble-sdk-android-v3.7.3.aar:classes.jar:com/vtrump/vtble/Y.class */
public class C0038Y {
    /* renamed from: b */
    public static String m181b(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < str.length() - 1) {
            int i2 = i;
            int i3 = i2 + 2;
            i = i3;
            int parseInt = Integer.parseInt(str.substring(i2, i3), 16);
            sb.append((char) parseInt);
            sb2.append(parseInt);
        }
        System.out.println("hex2string, Decimal : " + sb2.toString());
        return sb.toString();
    }

    /* renamed from: b */
    public static String m180b(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m177c(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString).append("-");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m176d(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m175e(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString).append(":");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static byte[] m178c(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m198a(charArray[i2]) << 4) | m198a(charArray[i2 + 1]));
        }
        return bArr;
    }

    /* renamed from: a */
    private static byte m198a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /* renamed from: f */
    public static String m174f(byte[] bArr) {
        if (bArr == null || bArr.length != 6) {
            return null;
        }
        return String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]));
    }

    /* renamed from: a */
    public static byte[] m191a(String str) {
        int i = 0;
        byte[] bArr = new byte[6];
        int i2 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) != ':') {
                int i3 = i2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
                i++;
                i2++;
            }
            i2++;
        }
        return bArr;
    }

    /* renamed from: b */
    public static double m183b(double d, int i) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            Log.d("VTUtils", "getDoubleValue: " + d);
            return 0.0d;
        }
        return new BigDecimal(String.valueOf(d)).setScale(i, RoundingMode.HALF_UP).doubleValue();
    }

    /* renamed from: a */
    public static double m196a(float f, int i) {
        double d = f;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            Log.d("VTUtils", "getDoubleValue: " + f);
            return 0.0d;
        }
        return new BigDecimal(String.valueOf(f)).setScale(i, RoundingMode.HALF_UP).doubleValue();
    }



    /* renamed from: a */
    public static String m190a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                sb.append("-");
            }
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static byte[] m182b(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: a */
    public static byte[] m195a(int i) {
        return new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: b */
    public static byte m179b(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        while (true) {
            byte b2 = b;
            i++;
            if (i > i2) {
                return b2;
            }
            b = (byte) (b2 ^ bArr[i]);
        }
    }


    /* renamed from: a */
    public static String m194a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: a */
    public static byte[] m189a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[bArr.length - ((i2 - i) + 1)];
        int i3 = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (i4 < i) {
                bArr2[i3] = bArr[i4];
                i3++;
            }
            if (i4 > i2) {
                bArr2[i3] = bArr[i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m188a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        byte[] bArr4 = bArr;
        System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        System.arraycopy(bArr2, 0, bArr3, bArr4.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: a */
    public static double[] m185a(double[] dArr, int i, double d) {
        double[] dArr2 = new double[dArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < dArr2.length; i3++) {
            if (i3 != i) {
                dArr2[i2] = dArr[i3];
            } else {
                dArr2[i2] = d;
            }
            i2++;
        }
        return dArr2;
    }



    /* renamed from: a */
    public static boolean m199a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public static boolean m184b() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: a */
    public static double[] m187a(double[] dArr) {
        if (dArr == null) {
            return new double[0];
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (dArr[i2] == 0.0d) {
                i++;
            }
        }
        return i == dArr.length ? new double[0] : dArr;
    }

    /* renamed from: a */
    public static int m197a(double d, int i) {
        return new BigDecimal(d + "").multiply(new BigDecimal(i + "")).intValue();
    }

    public static JSONArray m186a(double[] dArr, int i) {
        JSONArray jSONArray = new JSONArray();
        if (dArr == null || dArr.length == 0) {
            return jSONArray;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= dArr.length) {
                return jSONArray;
            }
            try {
                 jSONArray.put(m183b(dArr[i2], i));
            } catch (JSONException unused) {

            }
            i2++;
        }
    }

}