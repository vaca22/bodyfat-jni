package com.vaca.bodyfat;
import com.holtek.libHTBodyfat.HTBodyResultTwoLegs;

public class C0051c  {


    public double f678b;


    public double f679c;


    public int f680d;


    public double f681e;


    public double f682f;


    public double f683g;


    private boolean f687k;


    private boolean f688l;


    private boolean f689m;


    public ScaleInfo f691o;


    private boolean f684h = false;


    private boolean f685i = false;


    private boolean f686j = false;


    private boolean f690n = false;


    private double[][] f692p = {new double[]{10.2d, 11.1d, 14.8d, 16.3d, 18.1d}, new double[]{11.3d, 12.4d, 16.3d, 17.8d, 19.4d}, new double[]{12.5d, 13.7d, 17.8d, 19.4d, 21.1d}, new double[]{13.1d, 14.3d, 18.4d, 20.0d, 21.8d}, new double[]{13.4d, 14.5d, 18.7d, 20.3d, 22.1d}, new double[]{13.5d, 14.7d, 18.8d, 20.5d, 22.3d}, new double[]{13.6d, 14.7d, 18.8d, 20.5d, 22.3d}, new double[]{13.7d, 14.8d, 18.8d, 20.5d, 22.3d}, new double[]{13.6d, 14.7d, 18.7d, 20.4d, 22.2d}, new double[]{13.6d, 14.7d, 18.6d, 20.3d, 22.1d}, new double[]{13.5d, 14.6d, 18.5d, 20.1d, 22.0d}, new double[]{13.4d, 14.5d, 18.4d, 20.0d, 21.8d}, new double[]{13.4d, 14.4d, 18.2d, 19.8d, 21.6d}, new double[]{13.3d, 14.3d, 18.1d, 19.7d, 21.5d}, new double[]{13.2d, 14.2d, 18.0d, 19.6d, 21.3d}, new double[]{13.1d, 14.1d, 17.8d, 19.4d, 21.2d}, new double[]{13.1d, 14.0d, 17.7d, 19.3d, 21.0d}, new double[]{13.0d, 13.9d, 17.6d, 19.1d, 20.9d}, new double[]{12.9d, 13.9d, 17.5d, 19.0d, 20.8d}, new double[]{12.9d, 13.8d, 17.4d, 18.9d, 20.7d}, new double[]{12.8d, 13.7d, 17.3d, 18.8d, 20.6d}, new double[]{12.8d, 13.7d, 17.2d, 18.7d, 20.5d}, new double[]{12.7d, 13.6d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.1d, 18.6d, 20.3d}, new double[]{12.7d, 13.6d, 17.0d, 18.5d, 20.3d}, new double[]{12.8d, 13.8d, 17.3d, 18.8d, 20.5d}, new double[]{12.8d, 13.7d, 17.3d, 18.8d, 20.5d}, new double[]{12.7d, 13.7d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.2d, 18.7d, 20.4d}, new double[]{12.7d, 13.6d, 17.1d, 18.6d, 20.3d}, new double[]{12.6d, 13.6d, 17.1d, 18.6d, 20.2d}, new double[]{12.6d, 13.5d, 17.1d, 18.5d, 20.2d}, new double[]{12.5d, 13.5d, 17.0d, 18.5d, 20.1d}, new double[]{12.5d, 13.5d, 17.0d, 18.5d, 20.1d}, new double[]{12.5d, 13.4d, 17.0d, 18.4d, 20.0d}, new double[]{12.4d, 13.4d, 16.9d, 18.4d, 20.0d}, new double[]{12.4d, 13.4d, 16.9d, 18.4d, 20.0d}, new double[]{12.4d, 13.3d, 16.9d, 18.3d, 19.9d}, new double[]{12.3d, 13.3d, 16.8d, 18.3d, 19.9d}, new double[]{12.3d, 13.3d, 16.8d, 18.3d, 19.9d}, new double[]{12.3d, 13.2d, 16.8d, 18.2d, 19.9d}, new double[]{12.2d, 13.2d, 16.8d, 18.2d, 19.9d}, new double[]{12.2d, 13.2d, 16.8d, 18.2d, 19.8d}};


    private double[][] f693q = {new double[]{10.1d, 11.1d, 14.6d, 16.1d, 17.7d}, new double[]{10.8d, 12.0d, 16.0d, 17.5d, 19.1d}, new double[]{11.8d, 13.0d, 17.3d, 19.0d, 20.7d}, new double[]{12.4d, 13.6d, 17.9d, 19.7d, 21.5d}, new double[]{12.7d, 13.9d, 18.3d, 20.0d, 22.0d}, new double[]{12.9d, 14.1d, 18.4d, 20.2d, 22.2d}, new double[]{13.0d, 14.1d, 18.5d, 20.3d, 22.3d}, new double[]{13.0d, 14.2d, 18.5d, 20.3d, 22.3d}, new double[]{13.0d, 14.1d, 18.4d, 20.2d, 22.2d}, new double[]{12.9d, 14.1d, 18.3d, 20.1d, 22.1d}, new double[]{12.9d, 14.0d, 18.2d, 19.9d, 21.9d}, new double[]{12.8d, 13.9d, 18.0d, 19.8d, 21.8d}, new double[]{12.7d, 13.8d, 17.9d, 19.6d, 21.6d}, new double[]{12.6d, 13.7d, 17.7d, 19.5d, 21.4d}, new double[]{12.6d, 13.6d, 17.6d, 19.3d, 21.3d}, new double[]{12.5d, 13.5d, 17.5d, 19.2d, 21.1d}, new double[]{12.4d, 13.5d, 17.4d, 19.1d, 21.0d}, new double[]{12.4d, 13.4d, 17.3d, 18.9d, 20.9d}, new double[]{12.3d, 13.3d, 17.2d, 18.8d, 20.8d}, new double[]{12.3d, 13.3d, 17.1d, 18.8d, 20.7d}, new double[]{12.2d, 13.2d, 17.0d, 18.7d, 20.6d}, new double[]{12.2d, 13.2d, 17.0d, 18.6d, 20.5d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.4d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.4d, 13.3d, 17.1d, 18.7d, 20.6d}, new double[]{12.3d, 13.3d, 17.0d, 18.7d, 20.6d}, new double[]{12.3d, 13.3d, 17.0d, 18.6d, 20.5d}, new double[]{12.3d, 13.3d, 17.0d, 18.6d, 20.5d}, new double[]{12.3d, 13.2d, 17.0d, 18.6d, 20.4d}, new double[]{12.3d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.2d, 16.9d, 18.5d, 20.4d}, new double[]{12.2d, 13.1d, 16.9d, 18.5d, 20.3d}, new double[]{12.2d, 13.1d, 16.8d, 18.5d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.1d, 16.8d, 18.4d, 20.3d}, new double[]{12.1d, 13.0d, 16.8d, 18.4d, 20.3d}, new double[]{12.0d, 13.0d, 16.8d, 18.4d, 20.3d}, new double[]{12.0d, 13.0d, 16.8d, 18.2d, 19.9d}, new double[]{12.0d, 13.0d, 16.8d, 18.4d, 20.4d}, new double[]{12.0d, 12.9d, 16.8d, 18.4d, 20.4d}};




    public static C0051c f667r;




    public HTBodyResultTwoLegs f669t;




    private int f671v;


    



    public ScaleInfo.EnumC0019a mo55j() {
        this.f671v = this.f669t.f110q;
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


    public static class C0057a {

        /* renamed from: a */
        private int f694a;

        /* renamed from: b */
        private int f695b;

        public C0057a(int i, int i2) {
            this.f694a = i;
            this.f695b = i2;
        }

        /* renamed from: b */
        public int m119b() {
            return this.f694a;
        }

        /* renamed from: a */
        public int m120a() {
            return this.f695b;
        }
    }
    protected C0057a mo103r() {
        double d = this.f681e;
        return new C0057a((int) ((220.0d - d) * 0.6d), (int) ((220.0d - d) * 0.8d));
    }

    private void m128aa() {
        this.f691o.m363t(mo106Y());

        this.f691o.m430b(mo74c());
        this.f691o.m366s(mo79W());
        this.f691o.m425c(mo100d());
        this.f691o.m407g(mo87K());
        this.f691o.m381n(mo95T());
        this.f691o.m387l(mo84O());
        this.f691o.m369r(mo77Z());
        this.f691o.m403h(mo86L());
        this.f691o.m378o(mo81U());
        this.f691o.m399i(mo85M());
        this.f691o.m375p(mo80V());
        this.f691o.m384m(mo68f());
        this.f691o.m411f(mo82S());
        this.f691o.m391k(mo102R());
        this.f691o.m395j(mo96N());
        this.f691o.m372q(mo78X());
        this.f691o.m420d(mo70e());
        this.f691o.m415e(m143H());
        this.f691o.m436a(mo118a());
        this.f691o.m435a(mo83Q());
    }


    public void loadNativeData(){
        m128aa();

        this.f691o.m439a(mo103r());
        this.f691o.m460J(this.f682f);


        this.f691o.m409g(mo52n());
        this.f691o.m400i(mo51o().f373i);
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















    /* renamed from: W */
    protected double[] mo79W() {
        double pow = Math.pow(this.f679c / 100.0d, 2.0d) * 24.0d;
        return new double[]{0.0d, StringUtils.m183b(Math.pow(this.f679c / 100.0d, 2.0d) * 18.5d, 1), StringUtils.m183b(pow, 1), StringUtils.m183b(pow * 1.5d, 1)};
    }

    /* renamed from: Y */
    protected double[] mo106Y() {
        double pow = Math.pow(this.f679c / 100.0d, 2.0d) * 25.0d;
        return new double[]{0.0d, StringUtils.m183b(Math.pow(this.f679c / 100.0d, 2.0d) * 18.5d, 1), StringUtils.m183b(pow, 1), StringUtils.m183b(pow * 1.5d, 1)};
    }

    /* renamed from: c */
    protected double[] mo74c() {
        return new double[]{0.0d, 18.5d, 24.0d, 28.0d, 42.0d};
    }

    /* renamed from: b */
    protected double[] m127b() {
        double[] dArr = new double[5];
        int i = (int) (this.f681e * 100.0d);
        if (i < 0 || i > 42) {
            dArr[0] = -10000.0d;
            dArr[1] = -10000.0d;
            dArr[2] = -10000.0d;
            dArr[3] = -10000.0d;
            dArr[4] = -10000.0d;
        } else {
            if (this.f680d == 4) {
                dArr = this.f692p[i];
            }
            if (this.f680d == 5) {
                dArr = this.f693q[i];
            }
            double[] m185a = StringUtils.m185a(dArr, 0, 0.0d);
            dArr = StringUtils.m185a(m185a, m185a.length - 1, m185a[m185a.length - 1] * 1.5d);
        }
        return dArr;
    }

    /* renamed from: d */
    protected double[] mo100d() {
        return new double[]{0.0d, 18.5d, 25.0d, 30.0d, 45.0d};
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
        	at java.base/java.util.BitSet.get(Unknown Source)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    /* renamed from: K */
    protected double[] mo87K() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vtrump.vtble.p002c.C0056h.mo87K():double[]");
    }

    /* renamed from: S */
    protected double[] mo82S() {
        return new double[]{0.0d, 10.0d, 15.0d, 23.0d};
    }

    /* renamed from: R */
    protected double[] mo102R() {
        return new double[]{0.0d, 10.0d, 15.0d, 22.5d};
    }

    /* renamed from: T */
    protected double[] mo95T() {
        double d;
        double d2;
        double d3;
        if (m141J()) {
            double d4 = this.f681e;
            if (d4 < 19.0d) {
                double d5 = this.f678b;
                d = d5 * 0.09000000357627869d;
                d2 = d5 * 0.20000000298023224d;
                d3 = d5 * 0.25d;
            } else if (d4 < 41.0d) {
                double d6 = this.f678b;
                d = d6 * 0.10000000149011612d;
                d2 = d6 * 0.20999999344348907d;
                d3 = d6 * 0.25999999046325684d;
            } else if (d4 < 61.0d) {
                double d7 = this.f678b;
                d = d7 * 0.10999999940395355d;
                d2 = d7 * 0.2199999988079071d;
                d3 = d7 * 0.27000001072883606d;
            } else {
                double d8 = this.f678b;
                d = d8 * 0.12999999523162842d;
                d2 = d8 * 0.23000000417232513d;
                d3 = d8 * 0.28999999165534973d;
            }
        } else {
            double d9 = this.f681e;
            if (d9 < 19.0d) {
                double d10 = this.f678b;
                d = d10 * 0.1899999976158142d;
                d2 = d10 * 0.33000001311302185d;
                d3 = d10 * 0.3799999952316284d;
            } else if (d9 < 41.0d) {
                double d11 = this.f678b;
                d = d11 * 0.20000000298023224d;
                d2 = d11 * 0.3400000035762787d;
                d3 = d11 * 0.38999998569488525d;
            } else if (d9 < 61.0d) {
                double d12 = this.f678b;
                d = d12 * 0.20999999344348907d;
                d2 = d12 * 0.3499999940395355d;
                d3 = d12 * 0.4000000059604645d;
            } else {
                double d13 = this.f678b;
                d = d13 * 0.2199999988079071d;
                d2 = d13 * 0.36000001430511475d;
                d3 = d13 * 0.4099999964237213d;
            }
        }
        return new double[]{0.0d, StringUtils.m183b(d, 1), StringUtils.m183b(d2, 1), StringUtils.m183b(d3, 1), StringUtils.m183b(d3 * 1.5d, 1)};
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: ?: MOVE  (r0 I:??) = (r2 I:??), block:B:17:0x006d */
    /* renamed from: O */
    protected double[] mo84O() {
        double d;
        if (m141J()) {
            double d2 = this.f681e;
            return d2 < 19.0d ? m123c(57.0d, 62.0d) : d2 < 31.0d ? m123c(56.5d, 61.5d) : d2 < 41.0d ? m123c(56.0d, 61.0d) : d2 < 61.0d ? m123c(55.5d, 60.5d) : m123c(55.0d, 60.0d);
        }
        double d3 = this.f681e;
        return d < 19.0d ? m123c(54.0d, 60.0d) : d3 < 31.0d ? m123c(53.5d, 59.5d) : d3 < 41.0d ? m123c(53.0d, 59.0d) : d3 < 61.0d ? m123c(52.5d, 58.5d) : m123c(52.0d, 58.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: ?: MOVE  (r0 I:??) = (r2 I:??), block:B:17:0x009a */
    /* JADX WARN: Type inference failed for: r1v30, types: [double, com.vtrump.vtble.c.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [double, com.vtrump.vtble.c.h] */
    /* renamed from: Z */
    protected double[] mo77Z() {
        double d;
        if (m141J()) {
            double d2 = this.f681e;
            if (d2 < 19.0d) {
                return m123c(this * 0.5699999928474426d, this.f678b * 0.6200000047683716d);
            }
            if (d2 < 31.0d) {
                double d3 = this.f678b;
                return m123c(d3 * 0.5649999976158142d, d3 * 0.6150000095367432d);
            } else if (d2 < 41.0d) {
                double d4 = this.f678b;
                return m123c(d4 * 0.5600000023841858d, d4 * 0.6100000143051147d);
            } else if (d2 < 61.0d) {
                double d5 = this.f678b;
                return m123c(d5 * 0.5550000071525574d, d5 * 0.6050000190734863d);
            } else {
                ?? r1 = this.f678b;
                return r1.m123c(r1 * 0.550000011920929d, r1 * 0.6000000238418579d);
            }
        }
        double d6 = this.f681e;
        if (d < 19.0d) {
            double d7 = this.f678b;
            return m123c(d7 * 0.5400000214576721d, d7 * 0.6000000238418579d);
        } else if (d6 < 31.0d) {
            double d8 = this.f678b;
            return m123c(d8 * 0.5350000262260437d, d8 * 0.5950000286102295d);
        } else if (d6 < 41.0d) {
            double d9 = this.f678b;
            return m123c(d9 * 0.5299999713897705d, d9 * 0.5899999737739563d);
        } else if (d6 < 61.0d) {
            double d10 = this.f678b;
            return m123c(d10 * 0.5249999761581421d, d10 * 0.5849999785423279d);
        } else {
            ?? r12 = this.f678b;
            return r12.m123c(r12 * 0.5199999809265137d, r12 * 0.5799999833106995d);
        }
    }

    /* renamed from: L */
    protected double[] mo86L() {
        return m141J() ? this.f681e < 19.0d ? m126b(30.0d, 75.0d) : m126b(25.0d, 55.0d) : this.f681e < 19.0d ? m126b(25.0d, 65.0d) : m126b(20.0d, 55.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [double, com.vtrump.vtble.c.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [double, com.vtrump.vtble.c.h] */
    /* renamed from: U */
    protected double[] mo81U() {
        if (m141J()) {
            if (this.f681e < 19.0d) {
                return m126b(this * 0.30000001192092896d, this.f678b * 0.75d);
            }
            ?? r1 = this.f678b;
            return r1.m126b(r1 * 0.25d, r1 * 0.550000011920929d);
        } else if (this.f681e < 19.0d) {
            double d = this.f678b;
            return m126b(d * 0.25d, d * 0.6499999761581421d);
        } else {
            ?? r12 = this.f678b;
            return r12.m126b(r12 * 0.20000000298023224d, r12 * 0.550000011920929d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [double, com.vtrump.vtble.c.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [double, com.vtrump.vtble.c.h] */
    /* renamed from: X */
    protected double[] mo78X() {
        if (m141J()) {
            if (this.f681e < 19.0d) {
                return m126b(this * 0.21299999952316284d, this.f678b * 0.5325000286102295d);
            }
            ?? r1 = this.f678b;
            return r1.m126b(r1 * 0.17749999463558197d, r1 * 0.390500009059906d);
        } else if (this.f681e < 19.0d) {
            double d = this.f678b;
            return m126b(d * 0.17749999463558197d, d * 0.46149998903274536d);
        } else {
            ?? r12 = this.f678b;
            return r12.m126b(r12 * 0.1420000046491623d, r12 * 0.390500009059906d);
        }
    }

    int gender=0;
    public C0051c setGender(int g){
        this.gender=g;
        return this;
    }

    boolean m141J(){
        return gender==0;
    }
    /* renamed from: N */
    protected double[] mo96N() {
        double[] dArr;
        if (m141J()) {
            dArr = r0;
            double[] dArr2 = {0.0d, 49.0d, 59.0d, 88.5d};
        } else {
            dArr = r0;
            double[] dArr3 = {0.0d, 40.0d, 50.0d, 75.0d};
        }
        return dArr;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: ?: MOVE  (r0 I:??) = (r2 I:??), block:B:11:0x0043 */
    /* renamed from: f */
    protected double[] mo68f() {
        double d;
        if (!m141J()) {
            return d < 45.0d ? m138a(0.5d, 3.0d) : this.f678b < 60.0d ? m138a(1.7999999523162842d, 4.199999809265137d) : m138a(2.0d, 6.5d);
        }
        double d2 = this.f678b;
        return d2 < 60.0d ? m138a(0.5d, 4.5d) : d2 < 75.0d ? m138a(2.0d, 6.0d) : m138a(2.5d, 7.5d);
    }

    /* renamed from: e */
    protected double[] mo70e() {
        int i;
        if (m141J()) {
            double d = this.f681e;
            i = d < 19.0d ? 1620 : d < 30.0d ? 1560 : d < 50.0d ? 1561 : d < 70.0d ? 1501 : 1398;
        } else {
            double d2 = this.f681e;
            i = d2 < 19.0d ? 1265 : d2 < 30.0d ? 1298 : d2 < 50.0d ? 1302 : d2 < 70.0d ? 1242 : 1035;
        }
        double d3 = i;
        return new double[]{0.0d, d3, d3 * 1.5d};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: ?: MOVE  (r0 I:??) = (r2 I:??), block:B:17:0x00b3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [double, com.vtrump.vtble.c.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [double, com.vtrump.vtble.c.h] */
    /* renamed from: H */
    protected double[] m143H() {
        double d;
        if (m141J()) {
            double d2 = this.f681e;
            if (d2 < 19.0d) {
                double d3 = this.f678b;
                return m137a(this * 0.8799999952316284d, d3 * 0.8299999833106995d, d3 * 0.7799999713897705d);
            } else if (d2 < 31.0d) {
                double d4 = this.f678b;
                return m137a(d4 * 0.8759999871253967d, d4 * 0.8199999928474426d, d4 * 0.7699999809265137d);
            } else if (d2 < 41.0d) {
                double d5 = this.f678b;
                return m137a(d5 * 0.8700000047683716d, d5 * 0.8159999847412109d, d5 * 0.7699999809265137d);
            } else if (d2 < 61.0d) {
                double d6 = this.f678b;
                return m137a(d6 * 0.8659999966621399d, d6 * 0.8100000023841858d, d6 * 0.7660000324249268d);
            } else {
                ?? r1 = this.f678b;
                return r1.m137a(r1 * 0.8600000143051147d, r1 * 0.8059999942779541d, r1 * 0.7599999904632568d);
            }
        }
        double d7 = this.f681e;
        if (d < 19.0d) {
            double d8 = this.f678b;
            return m137a(d8 * 0.8500000238418579d, d8 * 0.7799999713897705d, d8 * 0.7360000014305115d);
        } else if (d7 < 31.0d) {
            double d9 = this.f678b;
            return m137a(d9 * 0.8460000157356262d, d9 * 0.7699999809265137d, d9 * 0.7300000190734863d);
        } else if (d7 < 41.0d) {
            double d10 = this.f678b;
            return m137a(d10 * 0.8400000333786011d, d10 * 0.7660000324249268d, d10 * 0.7260000109672546d);
        } else if (d7 < 61.0d) {
            double d11 = this.f678b;
            return m137a(d11 * 0.8359999656677246d, d11 * 0.7599999904632568d, d11 * 0.7200000286102295d);
        } else {
            ?? r12 = this.f678b;
            return r12.m137a(r12 * 0.8299999833106995d, r12 * 0.7559999823570251d, r12 * 0.715999960899353d);
        }
    }

    /* renamed from: M */
    protected double[] mo85M() {
        return m141J() ? this.f681e < 19.0d ? m126b(10.75d, 46.875d) : m126b(15.625d, 34.375d) : this.f681e < 19.0d ? m126b(15.625d, 40.625d) : m126b(12.5d, 34.375d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [double, com.vtrump.vtble.c.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [double, com.vtrump.vtble.c.h] */
    /* renamed from: V */
    protected double[] mo80V() {
        if (m141J()) {
            if (this.f681e < 19.0d) {
                return m126b(this * 0.10750000178813934d, this.f678b * 0.46875d);
            }
            ?? r1 = this.f678b;
            return r1.m126b(r1 * 0.15625d, r1 * 0.34375d);
        } else if (this.f681e < 19.0d) {
            double d = this.f678b;
            return m126b(d * 0.15625d, d * 0.40625d);
        } else {
            ?? r12 = this.f678b;
            return r12.m126b(r12 * 0.125d, r12 * 0.34375d);
        }
    }

    /* renamed from: a */
    protected double[] mo118a() {
        double d = this.f681e;
        return new double[]{0.0d, d, d * 1.5d};
    }

    /* renamed from: Q */
    protected int[] mo83Q() {
        return new int[]{0, 60, 70, 80, 90, 100};
    }

    /* renamed from: a */
    public double[] m137a(double d, double d2, double d3) {
        return new double[]{0.0d, StringUtils.m183b(d, 1), StringUtils.m183b(d2, 1), StringUtils.m183b(d3, 1), StringUtils.m183b(d3 * 1.5d, 1)};
    }

    /* renamed from: a */
    public double[] m138a(double d, double d2) {
        return new double[]{0.0d, d, d2, StringUtils.m183b(d2 * 1.5d, 1)};
    }

    /* renamed from: b */
    public double[] m126b(double d, double d2) {
        return new double[]{0.0d, StringUtils.m183b(d, 1), StringUtils.m183b(d2, 1), StringUtils.m183b(d2 * 1.5d, 1)};
    }

    /* renamed from: c */
    public double[] m123c(double d, double d2) {
        return new double[]{0.0d, StringUtils.m183b(d, 1), StringUtils.m183b(d2, 1), StringUtils.m183b(d2 * 1.5d, 1)};
    }


    public double[] m129a(double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = (dArr[i] * this.f678b) / 100.0d;
        }
        return dArr2;
    }


    public double[] m125b(double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = (dArr[i] * 100.0d) / this.f678b;
        }
        return dArr2;
    }




}