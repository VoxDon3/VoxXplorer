/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import com.google.android.material.carousel.d;
import com.google.android.material.carousel.e;

public abstract class c {
    private float a;
    private float b;

    static int[] a(int[] nArray) {
        int n8 = nArray.length;
        int[] nArray2 = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            nArray2[i8] = nArray[i8] * 2;
        }
        return nArray2;
    }

    public static float b(float f8, float f9, float f10) {
        return 1.0f - (f8 - f10) / (f9 - f10);
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    a e() {
        return com.google.android.material.carousel.c$a.q;
    }

    void f(Context context) {
        float f8 = this.a;
        if (!(f8 > 0.0f)) {
            f8 = d.h(context);
        }
        this.a = f8;
        f8 = this.b;
        if (!(f8 > 0.0f)) {
            f8 = d.g(context);
        }
        this.b = f8;
    }

    public abstract e g(ax.u6.a var1, View var2);

    public abstract boolean h(ax.u6.a var1, int var2);

    static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = com.google.android.material.carousel.c$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

