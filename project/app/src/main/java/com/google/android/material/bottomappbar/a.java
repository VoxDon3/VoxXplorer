/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import ax.O6.g;
import ax.O6.n;

public class a
extends g
implements Cloneable {
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float q;

    @Override
    public void c(float f8, float f9, float f10, n n8) {
        float f11 = this.d0;
        if (f11 == 0.0f) {
            n8.m(f8, 0.0f);
            return;
        }
        float f12 = (this.c0 * 2.0f + f11) / 2.0f;
        float f13 = f10 * this.q;
        float f14 = f9 + this.f0;
        f9 = this.e0 * f10 + (1.0f - f10) * f12;
        if (f9 / f12 >= 1.0f) {
            n8.m(f8, 0.0f);
            return;
        }
        float f15 = this.g0;
        float f16 = f15 * f10;
        boolean bl = f15 == -1.0f || Math.abs(f15 * 2.0f - f11) < 0.1f;
        if (!bl) {
            f10 = 1.75f;
            f9 = 0.0f;
        } else {
            f10 = 0.0f;
        }
        f11 = f12 + f13;
        f15 = f9 + f13;
        float f17 = (float)Math.sqrt(f11 * f11 - f15 * f15);
        float f18 = f14 - f17;
        f11 = f14 + f17;
        f15 = (float)Math.toDegrees(Math.atan(f17 / f15));
        f10 = 90.0f - f15 + f10;
        n8.m(f18, 0.0f);
        f17 = f13 * 2.0f;
        n8.a(f18 - f13, 0.0f, f18 + f13, f17, 270.0f, f15);
        if (bl) {
            n8.a(f14 - f12, -f12 - f9, f14 + f12, f12 - f9, 180.0f - f10, f10 * 2.0f - 180.0f);
        } else {
            f18 = this.c0;
            f9 = f16 * 2.0f;
            float f19 = f14 - f12;
            n8.a(f19, -(f16 + f18), f18 + f9 + f19, f18 + f16, 180.0f - f10, (f10 * 2.0f - 180.0f) / 2.0f);
            f12 = f14 + f12;
            f14 = this.c0;
            n8.m(f12 - (f14 / 2.0f + f16), f14 + f16);
            f14 = this.c0;
            n8.a(f12 - (f9 + f14), -(f16 + f14), f12, f14 + f16, 90.0f, f10 - 90.0f);
        }
        n8.a(f11 - f13, 0.0f, f11 + f13, f17, 270.0f - f15, f15);
        n8.m(f8, 0.0f);
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

    void k(float f8) {
        if (!(f8 < 0.0f)) {
            this.e0 = f8;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void l(float f8) {
        this.g0 = f8;
    }

    void m(float f8) {
        this.c0 = f8;
    }

    void n(float f8) {
        this.q = f8;
    }

    public void o(float f8) {
        this.d0 = f8;
    }

    void r(float f8) {
        this.f0 = f8;
    }
}

