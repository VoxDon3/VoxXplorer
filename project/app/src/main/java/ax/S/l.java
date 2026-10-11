/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import ax.S.b;

final class l {
    static final l k = l.k(ax.S.b.c, (float)((double)ax.S.b.h(50.0f) * 63.66197723675813 / 100.0), 50.0f, 2.0f, false);
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float[] g;
    private final float h;
    private final float i;
    private final float j;

    private l(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArray, float f14, float f15, float f16) {
        this.f = f8;
        this.a = f9;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.g = fArray;
        this.h = f14;
        this.i = f15;
        this.j = f16;
    }

    static l k(float[] fArray, float f8, float f9, float f10, boolean bl) {
        Object object = ax.S.b.a;
        float f11 = fArray[0];
        float[] fArray2 = object[0];
        float f12 = fArray2[0];
        float f13 = fArray[1];
        float f14 = fArray2[1];
        float f15 = fArray[2];
        f14 = f12 * f11 + f14 * f13 + fArray2[2] * f15;
        fArray2 = object[1];
        f12 = fArray2[0] * f11 + fArray2[1] * f13 + fArray2[2] * f15;
        object = object[2];
        f13 = f11 * object[0] + f13 * object[1] + f15 * object[2];
        f15 = f10 / 10.0f + 0.8f;
        f11 = (double)f15 >= 0.9 ? ax.S.b.d(0.59f, 0.69f, (f15 - 0.9f) * 10.0f) : ax.S.b.d(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        f10 = bl ? 1.0f : (1.0f - (float)Math.exp((-f8 - 42.0f) / 92.0f) * 0.2777778f) * f15;
        double d8 = f10;
        if (d8 > 1.0) {
            f10 = 1.0f;
        } else if (d8 < 0.0) {
            f10 = 0.0f;
        }
        float f16 = 100.0f / f14;
        float f17 = 100.0f / f12;
        float f18 = 100.0f / f13;
        object = new float[3];
        object[0] = (float[])(f16 * f10 + 1.0f - f10);
        object[1] = (float[])(f17 * f10 + 1.0f - f10);
        object[2] = (float[])(f18 * f10 + 1.0f - f10);
        f10 = 1.0f / (5.0f * f8 + 1.0f);
        f17 = f10 * f10 * f10 * f10;
        f10 = 1.0f - f17;
        f8 = f17 * f8 + 0.1f * f10 * f10 * (float)Math.cbrt((double)f8 * 5.0);
        f10 = ax.S.b.h(f9) / fArray[1];
        d8 = f10;
        f9 = (float)Math.sqrt(d8);
        f17 = 0.725f / (float)Math.pow(d8, 0.2);
        f14 = (float)Math.pow((double)(object[0] * f8 * f14) / 100.0, 0.42);
        f12 = (float)Math.pow((double)(object[1] * f8 * f12) / 100.0, 0.42);
        f13 = (float)Math.pow((double)(object[2] * f8 * f13) / 100.0, 0.42);
        fArray = new float[]{f14, f12, f13};
        f12 = fArray[0];
        f12 = f12 * 400.0f / (f12 + 27.13f);
        f14 = fArray[1];
        f14 = f14 * 400.0f / (f14 + 27.13f);
        f13 = fArray[2];
        f13 = 400.0f * f13 / (f13 + 27.13f);
        fArray = new float[]{f12, f14, f13};
        return new l(f10, (fArray[0] * 2.0f + fArray[1] + fArray[2] * 0.05f) * f17, f17, f17, f11, f15, (float[])object, f8, (float)Math.pow(f8, 0.25), f9 + 1.48f);
    }

    float a() {
        return this.a;
    }

    float b() {
        return this.d;
    }

    float c() {
        return this.h;
    }

    float d() {
        return this.i;
    }

    float e() {
        return this.f;
    }

    float f() {
        return this.b;
    }

    float g() {
        return this.e;
    }

    float h() {
        return this.c;
    }

    float[] i() {
        return this.g;
    }

    float j() {
        return this.j;
    }
}

