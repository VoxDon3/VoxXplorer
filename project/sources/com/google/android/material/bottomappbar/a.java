package com.google.android.material.bottomappbar;

import ax.O6.g;
import ax.O6.n;

/* loaded from: classes3.dex */
public class a extends g implements Cloneable {
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float q;

    @Override // ax.O6.g
    public void c(float f, float f2, float f3, n nVar) {
        float f4;
        float f5;
        float f6 = this.d0;
        if (f6 == 0.0f) {
            nVar.m(f, 0.0f);
            return;
        }
        float f7 = ((this.c0 * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.q;
        float f9 = f2 + this.f0;
        float f10 = (this.e0 * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            nVar.m(f, 0.0f);
            return;
        }
        float f11 = this.g0;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        nVar.m(f15, 0.0f);
        float f18 = f15 - f8;
        float f19 = f15 + f8;
        float f20 = f8 * 2.0f;
        nVar.a(f18, 0.0f, f19, f20, 270.0f, degrees);
        if (z) {
            nVar.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f21 = this.c0;
            float f22 = f12 * 2.0f;
            float f23 = f21 + f22;
            float f24 = f9 - f7;
            nVar.a(f24, -(f12 + f21), f23 + f24, f21 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f9 + f7;
            float f26 = this.c0;
            nVar.m(f25 - ((f26 / 2.0f) + f12), f26 + f12);
            float f27 = this.c0;
            nVar.a(f25 - (f22 + f27), -(f12 + f27), f25, f27 + f12, 90.0f, f17 - 90.0f);
        }
        nVar.a(f16 - f8, 0.0f, f16 + f8, f20, 270.0f - degrees, degrees);
        nVar.m(f, 0.0f);
    }

    float d() {
        return this.e0;
    }

    public float f() {
        return this.g0;
    }

    float h() {
        return this.c0;
    }

    float i() {
        return this.q;
    }

    public float j() {
        return this.d0;
    }

    void k(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.e0 = f;
    }

    public void l(float f) {
        this.g0 = f;
    }

    void m(float f) {
        this.c0 = f;
    }

    void n(float f) {
        this.q = f;
    }

    public void o(float f) {
        this.d0 = f;
    }

    void r(float f) {
        this.f0 = f;
    }
}
