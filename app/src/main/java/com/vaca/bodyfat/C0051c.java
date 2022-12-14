package com.vaca.bodyfat;



import com.holtek.libHTBodyfat.HTBodyBasicInfo;
import com.holtek.libHTBodyfat.HTBodyResultAllBody;
import com.holtek.libHTBodyfat.HTBodyResultTwoLegs;


public class C0051c  {

     /* renamed from: b */
    public double f678b;

    /* renamed from: c */
    public double f679c;

    /* renamed from: d */
    public int f680d;

    /* renamed from: e */
    public double f681e;

    /* renamed from: f */
    public double f682f;

    /* renamed from: g */
    public double f683g;

    /* renamed from: k */
    private boolean f687k;

    /* renamed from: l */
    private boolean f688l;

    /* renamed from: m */
    private boolean f689m;

    /* renamed from: o */
    public ScaleInfo f691o;

    /* renamed from: h */
    private boolean f684h = false;

    /* renamed from: i */
    private boolean f685i = false;

    /* renamed from: j */
    private boolean f686j = false;

    /* renamed from: n */
    private boolean f690n = false;

    /* renamed from: p */
    private double[][] f692p = {new double[]{10.2d, 11.1d, 14.8d, 16.3d, 18.1d}, new double[]{11.3d, 12.4d, 16.3d, 17.8d, 19.4d}, new double[]{12.5d, 13.7d, 17.8d, 19.4d, 21.1d}, new double[]{13.1d, 14.3d, 18.4d, 20.0d, 21.8d}, new double[]{13.4d, 14.5d, 18.7d, 20.3d, 22.1d}, new double[]{13.5d, 14.7d, 18.8d, 20.5d, 22.3d}, new double[]{13.6d, 14.7d, 18.8d, 20.5d, 22.3d}, new double[]{13.7d, 14.8d, 18.8d, 20.5d, 22.3d}, new double[]{13.6d, 14.7d, 18.7d, 20.4d, 22.2d}, new double[]{13.6d, 14.7d, 18.6d, 20.3d, 22.1d}, new double[]{13.5d, 14.6d, 18.5d, 20.1d, 22.0d}, new double[]{13.4d, 14.5d, 18.4d, 20.0d, 21.8d}, new double[]{13.4d, 14.4d, 18.2d, 19.8d, 21.6d}, new double[]{13.3d, 14.3d, 18.1d, 19.7d, 21.5d}, new double[]{13.2d, 14.2d, 18.0d, 19.6d, 21.3d}, new double[]{13.1d, 14.1d, 17.8d, 19.4d, 21.2d}, new double[]{13.1d, 14.0d, 17.7d, 19.3d, 21.0d}, new double[]{13.0d, 13.9d, 17.6d, 19.1d, 20.9d}, new double[]{12.9d, 13.9d, 17.5d, 19.0d, 20.8d}, new double[]{12.9d, 13.8d, 17.4d, 18.9d, 20.7d}, new double[]{12.8d, 13.7d, 17.3d, 18.8d, 20.6d}, new double[]{12.8d, 13.7d, 17.2d, 18.7d, 20.5d}, new double[]{12.7d, 13.6d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.1d, 18.6d, 20.3d}, new double[]{12.7d, 13.6d, 17.0d, 18.5d, 20.3d}, new double[]{12.8d, 13.8d, 17.3d, 18.8d, 20.5d}, new double[]{12.8d, 13.7d, 17.3d, 18.8d, 20.5d}, new double[]{12.7d, 13.7d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.1d, 18.6d, 20.3d}, new double[]{12.6d, 13.6d, 17.1d, 18.6d, 20.2d}, new double[]{12.6d, 13.5d, 17.1d, 18.5d, 20.2d}, new double[]{12.5d, 13.5d, 17.0d, 18.5d, 20.1d}, new double[]{12.5d, 13.5d, 17.0d, 18.5d, 20.1d}, new double[]{12.5d, 13.4d, 17.0d, 18.4d, 20.0d}, new double[]{12.4d, 13.4d, 16.9d, 18.4d, 20.0d}, new double[]{12.4d, 13.4d, 16.9d, 18.4d, 20.0d}, new double[]{12.4d, 13.3d, 16.9d, 18.3d, 19.9d}, new double[]{12.3d, 13.3d, 16.8d, 18.3d, 19.9d}, new double[]{12.3d, 13.3d, 16.8d, 18.3d, 19.9d}, new double[]{12.3d, 13.2d, 16.8d, 18.2d, 19.9d}, new double[]{12.2d, 13.2d, 16.8d, 18.2d, 19.9d}, new double[]{12.2d, 13.2d, 16.8d, 18.2d, 19.8d}};

    /* renamed from: q */
    private double[][] f693q = {new double[]{10.1d, 11.1d, 14.6d, 16.1d, 17.7d}, new double[]{10.8d, 12.0d, 16.0d, 17.5d, 19.1d}, new double[]{11.8d, 13.0d, 17.3d, 19.0d, 20.7d}, new double[]{12.4d, 13.6d, 17.9d, 19.7d, 21.5d}, new double[]{12.7d, 13.9d, 18.3d, 20.0d, 22.0d}, new double[]{12.9d, 14.1d, 18.4d, 20.2d, 22.2d}, new double[]{13.0d, 14.1d, 18.5d, 20.3d, 22.3d}, new double[]{13.0d, 14.2d, 18.5d, 20.3d, 22.3d}, new double[]{13.0d, 14.1d, 18.4d, 20.2d, 22.2d}, new double[]{12.9d, 14.1d, 18.3d, 20.1d, 22.1d}, new double[]{12.9d, 14.0d, 18.2d, 19.9d, 21.9d}, new double[]{12.8d, 13.9d, 18.0d, 19.8d, 21.8d}, new double[]{12.7d, 13.8d, 17.9d, 19.6d, 21.6d}, new double[]{12.6d, 13.7d, 17.7d, 19.5d, 21.4d}, new double[]{12.6d, 13.6d, 17.6d, 19.3d, 21.3d}, new double[]{12.5d, 13.5d, 17.5d, 19.2d, 21.1d}, new double[]{12.4d, 13.5d, 17.4d, 19.1d, 21.0d}, new double[]{12.4d, 13.4d, 17.3d, 18.9d, 20.9d}, new double[]{12.3d, 13.3d, 17.2d, 18.8d, 20.8d}, new double[]{12.3d, 13.3d, 17.1d, 18.8d, 20.7d}, new double[]{12.2d, 13.2d, 17.0d, 18.7d, 20.6d}, new double[]{12.2d, 13.2d, 17.0d, 18.6d, 20.5d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.4d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.4d, 13.3d, 17.1d, 18.7d, 20.6d}, new double[]{12.3d, 13.3d, 17.0d, 18.7d, 20.6d}, new double[]{12.3d, 13.3d, 17.0d, 18.6d, 20.5d}, new double[]{12.3d, 13.3d, 17.0d, 18.6d, 20.5d}, new double[]{12.3d, 13.2d, 17.0d, 18.6d, 20.4d}, new double[]{12.3d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.3d}, new double[]{12.2d, 13.1d, 16.8d, 18.5d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.0d, 16.8d, 18.4d, 20.3d}, new double[]{12.0d, 13.0d, 16.8d, 18.4d, 20.3d}, new double[]{12.0d, 13.0d, 16.8d, 18.2d, 19.9d}, new double[]{12.0d, 13.0d, 16.8d, 18.4d, 20.4d}, new double[]{12.0d, 12.9d, 16.8d, 18.4d, 20.4d}};



    /* renamed from: r */
    public static C0051c f667r;

    /* renamed from: s */
    HTBodyResultAllBody f668s;

    /* renamed from: t */
    public HTBodyResultTwoLegs f669t;

    /* renamed from: u */
    private boolean f670u = false;

    /* renamed from: v */
    private int f671v;

    /* renamed from: aa */
    public static C0051c m152aa() {
        C0051c c0051c = f667r;
        if (c0051c == null) {
            C0051c c0051c2 = new C0051c();
            f667r = c0051c2;
            return c0051c2;
        }
        return c0051c;
    }
    
    



    public ScaleInfo.EnumC0019a mo55j() {
        this.f671v = this.f670u ? this.f668s.f110q : this.f669t.f110q;
        switch (this.f671v) {
            case 0:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_SLENDER;
            case 1:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_LEAN;
            case 2:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_WELL_BUILT;
            case 3:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_SLIM;
            case 4:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_FIT;
            case 5:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_ATHLETIC;
            case 6:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_HIDDEN_FAT;
            case 7:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_CHUBBY;
            case 8:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_BEEFY;
            default:
                return ScaleInfo.EnumC0019a.VT_BODY_SHAPE_ERROR;
        }
    }


    public int mo56i() {
        return this.f669t.f96c;
    }


    public int mo50p() {
        int i = this.f669t.f97d;
        if (i < 1) {
            i = 1;
        }
        return i;
    }


    public double mo64A() {
        return this.f669t.f98e;
    }


    public double mo48s() {
        double d =  this.f669t.f100g;
        if (d <= 0.0d) {
            d = 0.0d;
        }
        return d;
    }


    public double mo63B() {
        return  this.f669t.f99f;
    }


    public double mo43x() {
        return this.f669t.f101h;
    }


    public double mo62C() {
        return this.f669t.f103j;
    }


    public double mo47t() {
        return this.f669t.f104k;
    }


    public int mo57g() {
        return this.f669t.f108o;
    }


    public double mo46u() {
        return this.f669t.f102i;
    }


    public double mo52n() {
        return this.f669t.f109p;
    }


    public int mo42y() {
        return this.f669t.f111r;
    }


    public double mo61D() {
        return -10000.0d;
    }


    public double mo59G() {
        return this.f678b - mo52n();
    }


    public ScaleInfo.EnumC0021c mo51o() {
        double mo52n = ((this.f678b - mo52n()) / mo52n()) * 100.0d;
        return mo52n < -15.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_LIGHT : mo52n <= 15.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_NORMAL : mo52n <= 32.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_OVERWEIGHT : mo52n <= 52.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_MILD : mo52n <= 74.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_MODERATE : mo52n > 74.0d ? ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_SEVERE : ScaleInfo.EnumC0021c.VT_OBESITY_LEVEL_INVALID;
    }


    public double mo60F() {
        return (this.f678b * mo43x()) / 100.0d;
    }


    public double mo44w() {
        return (1.0f - (mo50p() * 0.0267f)) * mo48s();
    }


    public double mo54l() {
        return (this.f678b * (100.0d - mo48s())) / 100.0d;
    }


    public double mo88E() {
        return mo62C() * 0.6800000071525574d;
    }


    public double mo45v() {
        return mo47t() * 0.6800000071525574d;
    }




    public void yes(){
        this.f691o.m379o(mo48s());
        this.f691o.m472D(mo63B());
        this.f691o.m367s(mo43x());
        this.f691o.m464H(mo60F());
        this.f691o.m474C(mo64A());
        this.f691o.m376p(mo47t());
        this.f691o.m470E(mo62C());
        this.f691o.m468F(mo61D());
        this.f691o.m373q(mo46u());
        this.f691o.m431b(mo56i());
        this.f691o.m441a(mo57g());
        this.f691o.m404h(mo50p());
        this.f691o.m370r(mo44w());
        this.f691o.m417e(mo54l());
        this.f691o.m364t(mo45v());
        this.f691o.m466G(mo88E());
        this.f691o.m462I(mo59G());
        this.f691o.m426c(mo55j().f354m);
        this.f691o.m396j(mo42y());
    }

}