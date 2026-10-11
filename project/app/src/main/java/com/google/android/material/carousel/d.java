/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.a;
import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;

final class d {
    static float a(float f8, float f9, int n8) {
        return f8 + (float)Math.max(0, n8 - 1) * f9;
    }

    static float b(float f8, float f9, int n8) {
        float f10 = f8;
        if (n8 > 0) {
            f10 = f8 + f9 / 2.0f;
        }
        return f10;
    }

    static e c(Context object, float f8, int n8, a a8) {
        float f9 = Math.min(d.f((Context)object) + f8, a8.f);
        float f10 = f9 / 2.0f;
        float f11 = d.b(0.0f, a8.b, a8.c);
        float f12 = d.j(0.0f, d.a(f11, a8.b, (int)Math.floor((float)a8.c / 2.0f)), a8.b, a8.c);
        float f13 = d.b(f12, a8.e, a8.d);
        float f14 = d.j(f12, d.a(f13, a8.e, (int)Math.floor((float)a8.d / 2.0f)), a8.e, a8.d);
        f12 = d.b(f14, a8.f, a8.g);
        float f15 = d.j(f14, d.a(f12, a8.f, a8.g), a8.f, a8.g);
        f14 = d.b(f15, a8.e, a8.d);
        f15 = d.b(d.j(f15, d.a(f14, a8.e, (int)Math.ceil((float)a8.d / 2.0f)), a8.e, a8.d), a8.b, a8.c);
        float f16 = n8;
        float f17 = c.b(f9, a8.f, f8);
        float f18 = c.b(a8.b, a8.f, f8);
        f8 = c.b(a8.e, a8.f, f8);
        object = new e.b(a8.f, n8).a(0.0f - f10, f17, f9);
        n8 = a8.c;
        if (n8 > 0) {
            ((e.b)object).g(f11, f18, a8.b, (int)Math.floor((float)n8 / 2.0f));
        }
        if ((n8 = a8.d) > 0) {
            ((e.b)object).g(f13, f8, a8.e, (int)Math.floor((float)n8 / 2.0f));
        }
        ((e.b)object).h(f12, 0.0f, a8.f, a8.g, true);
        n8 = a8.d;
        if (n8 > 0) {
            ((e.b)object).g(f14, f8, a8.e, (int)Math.ceil((float)n8 / 2.0f));
        }
        if ((n8 = a8.c) > 0) {
            ((e.b)object).g(f15, f18, a8.b, (int)Math.ceil((float)n8 / 2.0f));
        }
        ((e.b)object).a(f16 + f10, f17, f9);
        return ((e.b)object).i();
    }

    static e d(Context context, float f8, int n8, a a8, int n9) {
        if (n9 == 1) {
            return d.c(context, f8, n8, a8);
        }
        return d.e(context, f8, n8, a8);
    }

    static e e(Context object, float f8, int n8, a a8) {
        float f9 = Math.min(d.f((Context)object) + f8, a8.f);
        float f10 = f9 / 2.0f;
        float f11 = d.b(0.0f, a8.f, a8.g);
        float f12 = d.j(0.0f, d.a(f11, a8.f, a8.g), a8.f, a8.g);
        float f13 = d.b(f12, a8.e, a8.d);
        float f14 = d.b(d.j(f12, f13, a8.e, a8.d), a8.b, a8.c);
        f12 = n8;
        float f15 = c.b(f9, a8.f, f8);
        float f16 = c.b(a8.b, a8.f, f8);
        f8 = c.b(a8.e, a8.f, f8);
        object = new e.b(a8.f, n8).a(0.0f - f10, f15, f9).h(f11, 0.0f, a8.f, a8.g, true);
        if (a8.d > 0) {
            ((e.b)object).b(f13, f8, a8.e);
        }
        if ((n8 = a8.c) > 0) {
            ((e.b)object).g(f14, f16, a8.b, n8);
        }
        ((e.b)object).a(f12 + f10, f15, f9);
        return ((e.b)object).i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(ax.k6.e.t);
    }

    static float g(Context context) {
        return context.getResources().getDimension(ax.k6.e.u);
    }

    static float h(Context context) {
        return context.getResources().getDimension(ax.k6.e.v);
    }

    static int i(int[] nArray) {
        int n8 = nArray.length;
        int n9 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = nArray[i8];
            int n11 = n9;
            if (n10 > n9) {
                n11 = n10;
            }
            n9 = n11;
        }
        return n9;
    }

    static float j(float f8, float f9, float f10, int n8) {
        if (n8 > 0) {
            return f9 + f10 / 2.0f;
        }
        return f8;
    }
}

