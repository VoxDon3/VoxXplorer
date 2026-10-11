/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import ax.S.b;
import ax.S.l;

public class a {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a = f8;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f13;
        this.g = f14;
        this.h = f15;
        this.i = f16;
    }

    private static a b(float f8, float f9, float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        a a8 = null;
        float f13 = 1000.0f;
        float f14 = 0.0f;
        while (Math.abs(f14 - f11) > 0.01f) {
            float f15 = (f11 - f14) / 2.0f + f14;
            int n8 = ax.S.a.e(f15, f9, f8).p();
            float f16 = ax.S.b.b(n8);
            float f17 = Math.abs(f10 - f16);
            float f18 = f12;
            float f19 = f13;
            a a9 = a8;
            if (f17 < 0.2f) {
                a a10 = ax.S.a.c(n8);
                float f20 = a10.a(ax.S.a.e(a10.k(), a10.i(), f8));
                f18 = f12;
                f19 = f13;
                a9 = a8;
                if (f20 <= 1.0f) {
                    a9 = a10;
                    f18 = f17;
                    f19 = f20;
                }
            }
            if (f18 == 0.0f && f19 == 0.0f) {
                return a9;
            }
            if (f16 < f10) {
                f14 = f15;
                f12 = f18;
                f13 = f19;
                a8 = a9;
                continue;
            }
            f11 = f15;
            f12 = f18;
            f13 = f19;
            a8 = a9;
        }
        return a8;
    }

    static a c(int n8) {
        float[] fArray = new float[7];
        float[] fArray2 = new float[3];
        ax.S.a.d(n8, l.k, fArray, fArray2);
        return new a(fArray2[0], fArray2[1], fArray[0], fArray[1], fArray[2], fArray[3], fArray[4], fArray[5], fArray[6]);
    }

    static void d(int n8, l l8, float[] fArray, float[] fArray2) {
        ax.S.b.f(n8, fArray2);
        Object object = ax.S.b.a;
        float f8 = fArray2[0];
        float[] fArray3 = object[0];
        float f9 = fArray3[0];
        float f10 = fArray2[1];
        float f11 = fArray3[1];
        float f12 = fArray2[2];
        Object object2 = fArray3[2];
        fArray3 = object[1];
        float f13 = fArray3[0];
        float f14 = fArray3[1];
        float f15 = fArray3[2];
        object = object[2];
        Object object3 = object[0];
        Object object4 = object[1];
        Object object5 = object[2];
        object2 = l8.i()[0] * (f9 * f8 + f11 * f10 + object2 * f12);
        f14 = l8.i()[1] * (f13 * f8 + f14 * f10 + f15 * f12);
        object5 = l8.i()[2] * (f8 * object3 + f10 * object4 + f12 * object5);
        f12 = (float)Math.pow((double)(l8.c() * Math.abs(object2)) / 100.0, 0.42);
        object4 = (float)Math.pow((double)(l8.c() * Math.abs(f14)) / 100.0, 0.42);
        f8 = (float)Math.pow((double)(l8.c() * Math.abs((float)object5)) / 100.0, 0.42);
        object2 = Math.signum(object2) * 400.0f * f12 / (f12 + 27.13f);
        object4 = Math.signum(f14) * 400.0f * object4 / (object4 + 27.13f);
        object5 = Math.signum((float)object5) * 400.0f * f8 / (f8 + 27.13f);
        double d8 = object2;
        double d9 = (double)object4;
        double d10 = (double)object5;
        f13 = (float)(d8 * 11.0 + d9 * -12.0 + d10) / 11.0f;
        f14 = (float)((double)(object2 + object4) - d10 * 2.0) / 9.0f;
        f8 = (float)(object4 * 20.0f);
        f9 = (object2 * 20.0f + f8 + 21.0f * object5) / 20.0f;
        f8 = (object2 * 40.0f + f8 + object5) / 20.0f;
        object5 = (float)Math.atan2(f14, f13) * 180.0f / (float)Math.PI;
        if (object5 < 0.0f) {
            object2 = object5 + 360.0f;
        } else {
            object2 = object5;
            if (object5 >= 360.0f) {
                object2 = object5 - 360.0f;
            }
        }
        f15 = (float)Math.PI * object2 / 180.0f;
        object3 = (float)Math.pow(f8 * l8.f() / l8.a(), l8.b() * l8.j()) * 100.0f;
        f8 = 4.0f / l8.b();
        object4 = (float)Math.sqrt((double)(object3 / 100.0f));
        f12 = l8.a();
        f10 = l8.d();
        object5 = (double)object2 < 20.14 ? (Object)(360.0f + object2) : (Object)object2;
        object5 = (float)(Math.cos((double)object5 * Math.PI / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f * l8.g() * l8.h() * (float)Math.sqrt(f13 * f13 + f14 * f14) / (f9 + 0.305f);
        f13 = (float)Math.pow(1.64 - Math.pow(0.29, l8.e()), 0.73) * (float)Math.pow((double)object5, 0.9);
        f14 = (float)Math.sqrt((double)object3 / 100.0) * f13;
        object5 = l8.d() * f14;
        f9 = (float)Math.sqrt(f13 * l8.b() / (l8.a() + 4.0f));
        f13 = 1.7f * object3 / (0.007f * object3 + 1.0f);
        f11 = (float)Math.log(0.0228f * object5 + 1.0f) * 43.85965f;
        d10 = f15;
        float f16 = (float)Math.cos(d10);
        f15 = (float)Math.sin(d10);
        fArray2[0] = object2;
        fArray2[1] = f14;
        if (fArray != null) {
            fArray[0] = (float)object3;
            fArray[1] = f8 * object4 * (f12 + 4.0f) * f10;
            fArray[2] = (float)object5;
            fArray[3] = f9 * 50.0f;
            fArray[4] = f13;
            fArray[5] = f16 * f11;
            fArray[6] = f11 * f15;
        }
    }

    private static a e(float f8, float f9, float f10) {
        return ax.S.a.f(f8, f9, f10, l.k);
    }

    private static a f(float f8, float f9, float f10, l l8) {
        float f11 = 4.0f / l8.b();
        double d8 = (double)f8 / 100.0;
        float f12 = (float)Math.sqrt(d8);
        float f13 = l8.a();
        float f14 = l8.d();
        float f15 = l8.d() * f9;
        float f16 = (float)Math.sqrt(f9 / (float)Math.sqrt(d8) * l8.b() / (l8.a() + 4.0f));
        float f17 = (float)Math.PI * f10 / 180.0f;
        float f18 = 1.7f * f8 / (0.007f * f8 + 1.0f);
        float f19 = (float)Math.log((double)f15 * 0.0228 + 1.0) * 43.85965f;
        d8 = f17;
        return new a(f10, f9, f8, f11 * f12 * (f13 + 4.0f) * f14, f15, f16 * 50.0f, f18, (float)Math.cos(d8) * f19, f19 * (float)Math.sin(d8));
    }

    public static int m(float f8, float f9, float f10) {
        return ax.S.a.n(f8, f9, f10, l.k);
    }

    static int n(float f8, float f9, float f10, l l8) {
        if (!((double)f9 < 1.0 || (double)Math.round(f10) <= 0.0 || (double)Math.round(f10) >= 100.0)) {
            float f11 = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
            f8 = f9;
            a a8 = null;
            float f12 = 0.0f;
            boolean bl = true;
            float f13 = f9;
            f9 = f12;
            while (Math.abs(f9 - f13) >= 0.4f) {
                a a9 = ax.S.a.b(f11, f8, f10);
                if (bl) {
                    if (a9 != null) {
                        return a9.o(l8);
                    }
                    f8 = (f13 - f9) / 2.0f + f9;
                    bl = false;
                    continue;
                }
                if (a9 == null) {
                    f13 = f8;
                } else {
                    a8 = a9;
                    f9 = f8;
                }
                f8 = (f13 - f9) / 2.0f + f9;
            }
            if (a8 == null) {
                return ax.S.b.a(f10);
            }
            return a8.o(l8);
        }
        return ax.S.b.a(f10);
    }

    float a(a a8) {
        float f8 = this.l() - a8.l();
        float f9 = this.g() - a8.g();
        float f10 = this.h() - a8.h();
        return (float)(Math.pow(Math.sqrt(f8 * f8 + f9 * f9 + f10 * f10), 0.63) * 1.41);
    }

    float g() {
        return this.h;
    }

    float h() {
        return this.i;
    }

    float i() {
        return this.b;
    }

    float j() {
        return this.a;
    }

    float k() {
        return this.c;
    }

    float l() {
        return this.g;
    }

    int o(l object) {
        float f8 = (double)this.i() != 0.0 && (double)this.k() != 0.0 ? this.i() / (float)Math.sqrt((double)this.k() / 100.0) : 0.0f;
        Object object2 = (float)Math.pow((double)f8 / Math.pow(1.64 - Math.pow(0.29, ((l)object).e()), 0.73), 1.1111111111111112);
        double d8 = this.j() * (float)Math.PI / 180.0f;
        Object object3 = (float)(Math.cos(2.0 + d8) + 3.8);
        f8 = ((l)object).a();
        Object object4 = (float)Math.pow((double)this.k() / 100.0, 1.0 / (double)((l)object).b() / (double)((l)object).j());
        float f9 = ((l)object).g();
        Object object5 = ((l)object).h();
        f8 = f8 * object4 / ((l)object).f();
        object4 = (float)Math.sin(d8);
        Object object6 = (float)Math.cos(d8);
        object5 = (0.305f + f8) * 23.0f * object2 / (object3 * 0.25f * 3846.1538f * f9 * object5 * 23.0f + 11.0f * object2 * object6 + object2 * 108.0f * object4);
        f9 = object6 * object5;
        object4 = object5 * object4;
        object2 = f8 * 460.0f;
        f8 = (451.0f * f9 + object2 + 288.0f * object4) / 1403.0f;
        object5 = (object2 - 891.0f * f9 - 261.0f * object4) / 1403.0f;
        object3 = (object2 - f9 * 220.0f - object4 * 6300.0f) / 1403.0f;
        object4 = (float)Math.max(0.0, (double)Math.abs(f8) * 27.13 / (400.0 - (double)Math.abs(f8)));
        f9 = Math.signum(f8);
        f8 = 100.0f / ((l)object).c();
        object2 = (float)Math.pow(object4, 2.380952380952381);
        object6 = (float)Math.max(0.0, (double)Math.abs(object5) * 27.13 / (400.0 - (double)Math.abs(object5)));
        object4 = Math.signum(object5);
        object5 = 100.0f / ((l)object).c();
        object6 = (float)Math.pow(object6, 2.380952380952381);
        Object object7 = (float)Math.max(0.0, (double)Math.abs(object3) * 27.13 / (400.0 - (double)Math.abs(object3)));
        object3 = Math.signum(object3);
        Object object8 = 100.0f / ((l)object).c();
        object7 = (float)Math.pow(object7, 2.380952380952381);
        f8 = f9 * f8 * object2 / ((l)object).i()[0];
        f9 = object4 * object5 * object6 / ((l)object).i()[1];
        float f10 = object3 * object8 * object7 / ((l)object).i()[2];
        object = ax.S.b.b;
        Object object9 = object[0];
        object7 = object9[0];
        object5 = object9[1];
        Object object10 = object9[2];
        object9 = object[1];
        object6 = object9[0];
        object4 = object9[1];
        object8 = object9[2];
        object = object[2];
        Object object11 = object[0];
        object2 = object[1];
        object3 = object[2];
        return ax.T.a.b(object7 * f8 + object5 * f9 + object10 * f10, object6 * f8 + object4 * f9 + object8 * f10, f8 * object11 + f9 * object2 + f10 * object3);
    }

    int p() {
        return this.o(l.k);
    }
}

