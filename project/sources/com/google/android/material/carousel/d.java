package com.google.android.material.carousel;

import android.content.Context;
import ax.k6.C2404e;
import com.google.android.material.carousel.e;

/* loaded from: classes3.dex */
final class d {
    static float a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    static float b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    static e c(Context context, float f, int i, a aVar) {
        float f2;
        float f3;
        float min = Math.min(f(context) + f, aVar.f);
        float f4 = min / 2.0f;
        float f5 = 0.0f - f4;
        float b = b(0.0f, aVar.b, aVar.c);
        float j = j(0.0f, a(b, aVar.b, (int) Math.floor(aVar.c / 2.0f)), aVar.b, aVar.c);
        float b2 = b(j, aVar.e, aVar.d);
        float j2 = j(j, a(b2, aVar.e, (int) Math.floor(aVar.d / 2.0f)), aVar.e, aVar.d);
        float b3 = b(j2, aVar.f, aVar.g);
        float j3 = j(j2, a(b3, aVar.f, aVar.g), aVar.f, aVar.g);
        float b4 = b(j3, aVar.e, aVar.d);
        float b5 = b(j(j3, a(b4, aVar.e, (int) Math.ceil(aVar.d / 2.0f)), aVar.e, aVar.d), aVar.b, aVar.c);
        float f6 = i + f4;
        float b6 = c.b(min, aVar.f, f);
        float b7 = c.b(aVar.b, aVar.f, f);
        float b8 = c.b(aVar.e, aVar.f, f);
        e.b a = new e.b(aVar.f, i).a(f5, b6, min);
        if (aVar.c > 0) {
            f2 = b6;
            f3 = 2.0f;
            a.g(b, b7, aVar.b, (int) Math.floor(r7 / 2.0f));
        } else {
            f2 = b6;
            f3 = 2.0f;
        }
        if (aVar.d > 0) {
            a.g(b2, b8, aVar.e, (int) Math.floor(r4 / f3));
        }
        a.h(b3, 0.0f, aVar.f, aVar.g, true);
        if (aVar.d > 0) {
            a.g(b4, b8, aVar.e, (int) Math.ceil(r4 / f3));
        }
        if (aVar.c > 0) {
            a.g(b5, b7, aVar.b, (int) Math.ceil(r0 / f3));
        }
        a.a(f6, f2, min);
        return a.i();
    }

    static e d(Context context, float f, int i, a aVar, int i2) {
        return i2 == 1 ? c(context, f, i, aVar) : e(context, f, i, aVar);
    }

    static e e(Context context, float f, int i, a aVar) {
        float min = Math.min(f(context) + f, aVar.f);
        float f2 = min / 2.0f;
        float f3 = 0.0f - f2;
        float b = b(0.0f, aVar.f, aVar.g);
        float j = j(0.0f, a(b, aVar.f, aVar.g), aVar.f, aVar.g);
        float b2 = b(j, aVar.e, aVar.d);
        float b3 = b(j(j, b2, aVar.e, aVar.d), aVar.b, aVar.c);
        float f4 = i + f2;
        float b4 = c.b(min, aVar.f, f);
        float b5 = c.b(aVar.b, aVar.f, f);
        float b6 = c.b(aVar.e, aVar.f, f);
        e.b h = new e.b(aVar.f, i).a(f3, b4, min).h(b, 0.0f, aVar.f, aVar.g, true);
        if (aVar.d > 0) {
            h.b(b2, b6, aVar.e);
        }
        int i2 = aVar.c;
        if (i2 > 0) {
            h.g(b3, b5, aVar.b, i2);
        }
        h.a(f4, b4, min);
        return h.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(C2404e.t);
    }

    static float g(Context context) {
        return context.getResources().getDimension(C2404e.u);
    }

    static float h(Context context) {
        return context.getResources().getDimension(C2404e.v);
    }

    static int i(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    static float j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
