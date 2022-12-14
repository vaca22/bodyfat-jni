package com.vaca.bodyfat;


import org.json.JSONException;
import org.json.JSONObject;


public class ScaleInfo {

    /* renamed from: a */
    private int f268a;

    /* renamed from: b */
    private int f269b;

    /* renamed from: c */
    private byte[] f270c;

    /* renamed from: d */
    private double f271d;

    /* renamed from: e */
    private int f272e;

    /* renamed from: f */
    private int f273f;

    /* renamed from: g */
    private JSONObject f274g;

    /* renamed from: h */
    private double f275h;

    /* renamed from: i */
    private double[] f276i;

    /* renamed from: j */
    private double[] f277j;

    /* renamed from: k */
    private double f278k;

    /* renamed from: l */
    private double[] f279l;

    /* renamed from: m */
    private double[] f280m;

    /* renamed from: n */
    private double f281n;

    /* renamed from: o */
    private double f282o;

    /* renamed from: p */
    private double[] f283p;

    /* renamed from: q */
    private double f284q;

    /* renamed from: r */
    private double[] f285r;

    /* renamed from: s */
    private double f286s;

    /* renamed from: t */
    private double[] f287t;

    /* renamed from: u */
    private double f288u;

    /* renamed from: v */
    private double[] f289v;

    /* renamed from: w */
    private double f290w;

    /* renamed from: x */
    private double f291x;

    /* renamed from: y */
    private double[] f292y;

    /* renamed from: z */
    private double[] f293z;

    /* renamed from: A */
    private double f294A;

    /* renamed from: B */
    private double[] f295B;

    /* renamed from: C */
    private double f296C;

    /* renamed from: D */
    private double[] f297D;

    /* renamed from: E */
    private double f298E;

    /* renamed from: F */
    private double[] f299F;

    /* renamed from: G */
    private double f300G;

    /* renamed from: H */
    private double[] f301H;

    /* renamed from: I */
    private int f302I;

    /* renamed from: J */
    private double[] f303J;

    /* renamed from: K */
    private int f304K;

    /* renamed from: L */
    private double[] f305L;

    /* renamed from: M */
    private int f306M;

    /* renamed from: N */
    private double[] f307N;

    /* renamed from: O */
    private int f308O;

    /* renamed from: P */
    private double f309P;

    /* renamed from: Q */
    private double[] f310Q;

    /* renamed from: R */
    private double f311R;

    /* renamed from: S */
    private double f312S;

    /* renamed from: T */
    private double f313T;

    /* renamed from: U */
    private double[] f314U;

    /* renamed from: V */
    private double f315V;

    /* renamed from: W */
    private double[] f316W;

    /* renamed from: X */
    private double f317X;

    /* renamed from: Y */
    private double f318Y;

    /* renamed from: Z */
    private double f319Z;

    /* renamed from: aa */
    private int f320aa;

    /* renamed from: ba */
    private int f321ba;

    /* renamed from: ca */
    private int f322ca;

    /* renamed from: da */
    private int[] f323da;



    /* renamed from: fa */
    private int f325fa;

    /* renamed from: ga */
    private String f326ga;

    /* renamed from: ha */
    private double[] f327ha;

    /* renamed from: ia */
    private double f328ia;

    /* renamed from: ja */
    private double f329ja;

    /* renamed from: ka */
    private double f330ka;

    /* renamed from: la */
    private double f331la;

    /* renamed from: ma */
    private double f332ma;

    /* renamed from: na */
    private double f333na;

    /* renamed from: oa */
    private double f334oa;

    /* renamed from: pa */
    private double f335pa;

    /* renamed from: qa */
    private double f336qa;

    /* renamed from: ra */
    private double f337ra;

    /* renamed from: sa */
    private double f338sa;

    /* renamed from: ta */
    private double f339ta;

    /* renamed from: ua */
    private double f340ua;

    /* renamed from: va */
    private double f341va;


    public enum VTUnit {
        VTUnitKg(0),
        VTUnitPound(1),
        VTUnitJin(2),
        VTUnitStonePound(3),
        VTUnitStone(4);

        public final int nativeInt;

        VTUnit(int i) {
            this.nativeInt = i;
        }
    }


    public enum EnumC0019a {
        VT_BODY_SHAPE_INVALID(-10000),
        VT_BODY_SHAPE_ERROR(0),
        VT_BODY_SHAPE_HIDDEN_FAT(1),
        VT_BODY_SHAPE_CHUBBY(2),
        VT_BODY_SHAPE_BEEFY(3),
        VT_BODY_SHAPE_SLIM(4),
        VT_BODY_SHAPE_FIT(5),
        VT_BODY_SHAPE_ATHLETIC(6),
        VT_BODY_SHAPE_SLENDER(7),
        VT_BODY_SHAPE_LEAN(8),
        VT_BODY_SHAPE_WELL_BUILT(9);


        /* renamed from: m */
        public final int f354m;

        EnumC0019a(int i) {
            this.f354m = i;
        }
    }


    public enum EnumC0020b {
        VT_NUTRITRUE_STATE_INVALID(-10000),
        VT_NUTRITRUE_STATE_ERROR(0),
        VT_NUTRITRUE_STATE_SEVERELY_MALNUTRITION(1),
        VT_NUTRITRUE_STATE_MODERATE_MALNUTRITION(2),
        VT_NUTRITRUE_STATE_MALNUTRITION(3),
        VT_NUTRITRUE_STATE_NORMAL(4),
        VT_NUTRITRUE_STATE_OVERNUTRITION(5),
        VT_NUTRITRUE_STATE_SEVERLY_OVERNUTRITION(6);


        /* renamed from: j */
        public final int f364j;

        EnumC0020b(int i) {
            this.f364j = i;
        }
    }

    /* renamed from: com.vtrump.vtble.Scale.ScaleInfo$c */
    /* loaded from: vtble-sdk-android-v3.7.3.aar:classes.jar:com/vtrump/vtble/Scale/ScaleInfo$c.class */
    public enum EnumC0021c {
        VT_OBESITY_LEVEL_INVALID(-10000),
        VT_OBESITY_LEVEL_LIGHT(0),
        VT_OBESITY_LEVEL_NORMAL(1),
        VT_OBESITY_LEVEL_OVERWEIGHT(2),
        VT_OBESITY_LEVEL_MILD(3),
        VT_OBESITY_LEVEL_MODERATE(4),
        VT_OBESITY_LEVEL_SEVERE(5);


        /* renamed from: i */
        public final int f373i;

        EnumC0021c(int i) {
            this.f373i = i;
        }
    }


    public ScaleInfo() {

        this.f275h = 0.0d;
        this.f278k = 0.0d;
        this.f282o = 0.0d;
        this.f284q = 0.0d;
        this.f286s = 0.0d;
        this.f290w = -10000.0d;
        this.f291x = -10000.0d;
        this.f288u = 0.0d;
        this.f294A = 0.0d;
        this.f296C = 0.0d;
        this.f298E = 0.0d;
        this.f300G = 0.0d;
        this.f302I = 0;
        this.f304K = 0;
        this.f306M = 0;
        this.f308O = EnumC0021c.VT_OBESITY_LEVEL_INVALID.f373i;
        this.f309P = 0.0d;
        this.f311R = 0.0d;
        this.f312S = 0.0d;
        this.f313T = 0.0d;
        this.f315V = 0.0d;
        this.f291x = 0.0d;
        this.f317X = 0.0d;
        this.f318Y = 0.0d;
        this.f319Z = 0.0d;
        this.f322ca = 0;
        this.f326ga = "";
        this.f320aa = EnumC0019a.VT_BODY_SHAPE_ERROR.f354m;
        this.f321ba = EnumC0020b.VT_NUTRITRUE_STATE_ERROR.f364j;
        this.f328ia = -10000.0d;
        this.f329ja = -10000.0d;
        this.f330ka = -10000.0d;
        this.f331la = -10000.0d;
        this.f332ma = -10000.0d;
        this.f333na = -10000.0d;
        this.f334oa = -10000.0d;
        this.f335pa = -10000.0d;
        this.f336qa = -10000.0d;
        this.f337ra = -10000.0d;
        this.f338sa = -10000.0d;
        this.f339ta = -10000.0d;
        this.f340ua = -10000.0d;
        this.f341va = -10000.0d;
    }

    /* renamed from: M */
    public int m457M() {
        return this.f268a;
    }

    /* renamed from: d */
    public byte[] m423d() {
        return this.f270c;
    }

    /* renamed from: d */
    public void m421d(int i) {
        this.f269b = i;
    }

    /* renamed from: a */
    public double m443a() {
        return this.f271d;
    }

    /* renamed from: a */
    public void m442a(double d) {
        this.f271d = d;
    }

    /* renamed from: o */
    public int m380o() {
        return this.f272e;
    }

    /* renamed from: e */
    public void m416e(int i) {
        this.f272e = i;
    }

    /* renamed from: q */
    public int m374q() {
        return this.f273f;
    }

    /* renamed from: g */
    public void m408g(int i) {
        this.f273f = i;
    }

    /* renamed from: l */
    public JSONObject m390l() {
        return this.f274g;
    }

    /* renamed from: a */
    public void m437a(JSONObject jSONObject) {
        this.f274g = jSONObject;
    }

    /* renamed from: l */
    public void m388l(int i) {
        this.f268a = i;
    }

    /* renamed from: N */
    public double m456N() {
        return this.f275h;
    }

    /* renamed from: B */
    public void m476B(double d) {
        this.f275h = d;
    }

    /* renamed from: e */
    public double m418e() {
        return this.f278k;
    }

    /* renamed from: c */
    public void m427c(double d) {
        this.f278k = d;
    }

    /* renamed from: da */
    public double m419da() {
        return this.f281n;
    }

    /* renamed from: J */
    public void m460J(double d) {
        this.f281n = d;
    }

    /* renamed from: w */
    public double m358w() {
        return this.f282o;
    }

    /* renamed from: o */
    public void m379o(double d) {
        this.f282o = d;
    }

    /* renamed from: Q */
    public double m453Q() {
        return this.f284q;
    }

    /* renamed from: D */
    public void m472D(double d) {
        this.f284q = d;
    }

    /* renamed from: z */
    public double m352z() {
        return this.f286s;
    }

    /* renamed from: p */
    public void m376p(double d) {
        this.f286s = d;
    }

    /* renamed from: I */
    public double m463I() {
        return this.f290w;
    }

    /* renamed from: t */
    public void m364t(double d) {
        this.f290w = d;
    }

    /* renamed from: S */
    public double m451S() {
        return this.f288u;
    }

    /* renamed from: E */
    public void m470E(double d) {
        this.f288u = d;
    }

    /* renamed from: G */
    public double m467G() {
        return this.f294A;
    }

    /* renamed from: s */
    public void m367s(double d) {
        this.f294A = d;
    }

    /* renamed from: Y */
    public double m445Y() {
        return this.f296C;
    }

    /* renamed from: H */
    public void m464H(double d) {
        this.f296C = d;
    }

    /* renamed from: B */
    public double m477B() {
        return this.f298E;
    }

    /* renamed from: q */
    public void m373q(double d) {
        this.f298E = d;
    }

    /* renamed from: U */
    public double m449U() {
        return this.f300G;
    }

    /* renamed from: F */
    public void m468F(double d) {
        this.f300G = d;
    }

    /* renamed from: h */
    public int m406h() {
        return this.f302I;
    }

    /* renamed from: b */
    public void m431b(int i) {
        this.f302I = i;
    }

    /* renamed from: b */
    public int m433b() {
        return this.f304K;
    }

    /* renamed from: a */
    public void m441a(int i) {
        this.f304K = i;
    }

    /* renamed from: c */
    public double[] m428c() {
        return this.f305L;
    }

    /* renamed from: a */
    public void m436a(double[] dArr) {
        this.f305L = dArr;
    }

    /* renamed from: s */
    public int m368s() {
        return this.f306M;
    }

    /* renamed from: h */
    public void m404h(int i) {
        this.f306M = i;
    }

    /* renamed from: v */
    public int m360v() {
        return this.f308O;
    }

    /* renamed from: i */
    public void m400i(int i) {
        this.f308O = i;
    }

    /* renamed from: E */
    public double m471E() {
        return this.f309P;
    }

    /* renamed from: r */
    public void m370r(double d) {
        this.f309P = d;
    }

    /* renamed from: k */
    public double m394k() {
        return this.f311R;
    }

    /* renamed from: d */
    public void m422d(double d) {
        this.f311R = d;
    }

    /* renamed from: r */
    public double m371r() {
        return this.f312S;
    }

    /* renamed from: g */
    public void m409g(double d) {
        this.f312S = d;
    }

    /* renamed from: O */
    public double m455O() {
        return this.f313T;
    }

    /* renamed from: C */
    public void m474C(double d) {
        this.f313T = d;
    }

    /* renamed from: m */
    public double m386m() {
        return this.f315V;
    }

    /* renamed from: e */
    public void m417e(double d) {
        this.f315V = d;
    }

    /* renamed from: e */
    public void m415e(double[] dArr) {
        this.f316W = dArr;
    }

    /* renamed from: W */
    public double m447W() {
        return this.f291x;
    }

    /* renamed from: G */
    public void m466G(double d) {
        this.f291x = d;
    }

    /* renamed from: ba */
    public double m429ba() {
        return this.f317X;
    }

    /* renamed from: I */
    public void m462I(double d) {
        this.f317X = d;
    }

    /* renamed from: n */
    public double m383n() {
        return this.f318Y;
    }

    /* renamed from: f */
    public void m413f(double d) {
        this.f318Y = d;
    }

    /* renamed from: u */
    public double m362u() {
        return this.f319Z;
    }

    /* renamed from: n */
    public void m382n(double d) {
        this.f319Z = d;
    }

    /* renamed from: j */
    public int m398j() {
        return this.f320aa;
    }

    /* renamed from: c */
    public void m426c(int i) {
        this.f320aa = i;
    }

    /* renamed from: L */
    public int m458L() {
        return this.f321ba;
    }

    /* renamed from: k */
    public void m392k(int i) {
        this.f321ba = i;
    }

    /* renamed from: J */
    public int m461J() {
        return this.f322ca;
    }

    /* renamed from: j */
    public void m396j(int i) {
        this.f322ca = i;
    }

    /* renamed from: a */
    public void m435a(int[] iArr) {
        this.f323da = iArr;
    }



    /* renamed from: p */
    public int m377p() {
        return this.f325fa;
    }

    /* renamed from: f */
    public void m412f(int i) {
        this.f325fa = i;
    }

    /* renamed from: k */
    public void m393k(double d) {
        this.f328ia = d;
    }

    /* renamed from: l */
    public void m389l(double d) {
        this.f329ja = d;
    }

    /* renamed from: m */
    public void m385m(double d) {
        this.f330ka = d;
    }

    /* renamed from: x */
    public void m355x(double d) {
        this.f331la = d;
    }

    /* renamed from: y */
    public void m353y(double d) {
        this.f332ma = d;
    }

    /* renamed from: z */
    public void m351z(double d) {
        this.f333na = d;
    }

    /* renamed from: b */
    public void m432b(double d) {
        this.f340ua = d;
    }

    /* renamed from: A */
    public void m478A(double d) {
        this.f341va = d;
    }

    /* renamed from: h */
    public void m405h(double d) {
        this.f334oa = d;
    }

    /* renamed from: i */
    public void m401i(double d) {
        this.f335pa = d;
    }

    /* renamed from: j */
    public void m397j(double d) {
        this.f336qa = d;
    }

    /* renamed from: u */
    public void m361u(double d) {
        this.f337ra = d;
    }

    /* renamed from: v */
    public void m359v(double d) {
        this.f338sa = d;
    }

    /* renamed from: w */
    public void m357w(double d) {
        this.f339ta = d;
    }

    /* renamed from: K */
    public String m459K() {
        return this.f326ga;
    }

    /* renamed from: a */
    public void m438a(String str) {
        this.f326ga = str;
    }

    /* renamed from: aa */
    public double[] m434aa() {
        return this.f276i;
    }

    /* renamed from: s */
    public void m366s(double[] dArr) {
        this.f276i = dArr;
    }

    /* renamed from: ca */
    public double[] m424ca() {
        return this.f277j;
    }

    /* renamed from: t */
    public void m363t(double[] dArr) {
        this.f277j = dArr;
    }

    /* renamed from: g */
    public double[] m410g() {
        return this.f280m;
    }

    /* renamed from: c */
    public void m425c(double[] dArr) {
        this.f280m = dArr;
    }

    /* renamed from: f */
    public double[] m414f() {
        return this.f279l;
    }

    /* renamed from: b */
    public void m430b(double[] dArr) {
        this.f279l = dArr;
    }

    /* renamed from: x */
    public double[] m356x() {
        return this.f283p;
    }

    /* renamed from: g */
    public void m407g(double[] dArr) {
        this.f283p = dArr;
    }

    /* renamed from: R */
    public double[] m452R() {
        return this.f285r;
    }

    /* renamed from: n */
    public void m381n(double[] dArr) {
        this.f285r = dArr;
    }

    /* renamed from: A */
    public double[] m479A() {
        return this.f287t;
    }

    /* renamed from: h */
    public void m403h(double[] dArr) {
        this.f287t = dArr;
    }

    /* renamed from: D */
    public double[] m473D() {
        return this.f292y;
    }

    /* renamed from: j */
    public void m395j(double[] dArr) {
        this.f292y = dArr;
    }

    /* renamed from: X */
    public double[] m446X() {
        return this.f293z;
    }

    /* renamed from: q */
    public void m372q(double[] dArr) {
        this.f293z = dArr;
    }

    /* renamed from: T */
    public double[] m450T() {
        return this.f289v;
    }

    /* renamed from: o */
    public void m378o(double[] dArr) {
        this.f289v = dArr;
    }

    /* renamed from: H */
    public double[] m465H() {
        return this.f295B;
    }

    /* renamed from: l */
    public void m387l(double[] dArr) {
        this.f295B = dArr;
    }

    /* renamed from: Z */
    public double[] m444Z() {
        return this.f297D;
    }

    /* renamed from: r */
    public void m369r(double[] dArr) {
        this.f297D = dArr;
    }

    /* renamed from: C */
    public double[] m475C() {
        return this.f299F;
    }

    /* renamed from: i */
    public void m399i(double[] dArr) {
        this.f299F = dArr;
    }

    /* renamed from: V */
    public double[] m448V() {
        return this.f301H;
    }

    /* renamed from: p */
    public void m375p(double[] dArr) {
        this.f301H = dArr;
    }

    /* renamed from: i */
    public double[] m402i() {
        return this.f303J;
    }

    /* renamed from: d */
    public void m420d(double[] dArr) {
        this.f303J = dArr;
    }

    /* renamed from: F */
    public double[] m469F() {
        return this.f310Q;
    }

    /* renamed from: k */
    public void m391k(double[] dArr) {
        this.f310Q = dArr;
    }

    /* renamed from: t */
    public double[] m365t() {
        return this.f307N;
    }

    /* renamed from: f */
    public void m411f(double[] dArr) {
        this.f307N = dArr;
    }

    /* renamed from: P */
    public double[] m454P() {
        return this.f314U;
    }

    /* renamed from: m */
    public void m384m(double[] dArr) {
        this.f314U = dArr;
    }

    /* renamed from: y */
    public double[] m354y() {
        return this.f327ha;
    }


    public JSONObject m440a() {
        //表示保留整数
        int i=2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("age", m443a());
            jSONObject2.put("gender", m380o());
            jSONObject2.put("height", m374q());
            jSONObject.put("user", jSONObject2);
            jSONObject.put("ageOfBody", m433b());

            jSONObject.put("obesityLevel", m360v());
            double[] dArr = new double[6];
            dArr[0] = 0.0d;
            dArr[1] = 1.0d;
            dArr[2] = 2.0d;
            dArr[3] = 3.0d;
            dArr[4] = 4.0d;
            dArr[5] = 5.0d;
            jSONObject.put("obesityLevelList ", StringUtils.m186a(dArr, 0));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("rateOfBurnFat", jSONObject3);
            jSONObject.put("ratioOfFat", StringUtils.m183b(m358w(), i));
            jSONObject.put("ratioOfMuscle", StringUtils.m183b(m352z(), i));
            jSONObject.put("ratioOfFatRange", StringUtils.m186a(StringUtils.m187a(m356x()), i));
            jSONObject.put("ratioOfMuscleRange", StringUtils.m186a(StringUtils.m187a(m479A()), i));
            jSONObject.put("ratioOfWater", StringUtils.m183b(m467G(), i));
            jSONObject.put("ratioOfWaterRange", StringUtils.m186a(StringUtils.m187a(m465H()), i));
            jSONObject.put("ratioOfProtein", StringUtils.m183b(m477B(), i));
            jSONObject.put("ratioOfProteinRange", StringUtils.m186a(StringUtils.m187a(m475C()), i));
            jSONObject.put("ratioOfSubcutaneousFat", StringUtils.m183b(m471E(), i));
            jSONObject.put("ratioOfSubcutaneousFatRange", StringUtils.m186a(StringUtils.m187a(m469F()), i));
            jSONObject.put("ratioOfSkeletalMuscle", StringUtils.m183b(m463I(), i));
            jSONObject.put("ratioOfSkeletalMuscleRange", StringUtils.m186a(StringUtils.m187a(m473D()), i));
            jSONObject.put("rValue", m419da());
            jSONObject.put("weight", StringUtils.m183b(m456N(), i));
            jSONObject.put("weightRange", StringUtils.m186a(StringUtils.m187a(m434aa()), i));
            jSONObject.put("weightWHORange", StringUtils.m186a(StringUtils.m187a(m424ca()), i));
            jSONObject.put("weightOfFat", StringUtils.m183b(m453Q(), i));
            jSONObject.put("weightOfFatRange", StringUtils.m186a(StringUtils.m187a(m452R()), i));
            jSONObject.put("weightOfMuscle", StringUtils.m183b(m451S(), i));
            jSONObject.put("weightOfMuscleRange", StringUtils.m186a(StringUtils.m187a(m450T()), i));
            jSONObject.put("weightOfWater", StringUtils.m183b(m445Y(), i));
            jSONObject.put("weightOfWaterRange", StringUtils.m186a(StringUtils.m187a(m444Z()), i));
            jSONObject.put("weightOfProtein", StringUtils.m183b(m449U(), i));
            jSONObject.put("weightOfProteinRange", StringUtils.m186a(StringUtils.m187a(m448V()), i));
            jSONObject.put("weightOfBone", StringUtils.m183b(m455O(), i));
            jSONObject.put("weightOfBoneRange", StringUtils.m186a(StringUtils.m187a(m454P()), i));
            jSONObject.put("weightOfSkeletalMuscle", StringUtils.m183b(m447W(), i));
            jSONObject.put("weightOfSkeletalMuscleRange", StringUtils.m186a(StringUtils.m187a(m446X()), i));
            jSONObject.put("weightToControl", StringUtils.m183b(m429ba(), i));
            jSONObject.put("muscleToControl", StringUtils.m183b(m362u(), i));
            jSONObject.put("stateOfNutrition", m458L());
            jSONObject.put("sn", m459K());

            jSONObject.put("ratioOfHipRange", StringUtils.m186a(StringUtils.m187a(m354y()), i));
            jSONObject.put("score", m461J());
            jSONObject.put("deviceInfo", m390l());


            jSONObject.put("rValue", StringUtils.m183b(this.f341va, i));


        } catch (JSONException unused) {

        }
        return jSONObject;
    }
}