package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import ax.u6.InterfaceC3212a;

/* loaded from: classes3.dex */
public abstract class c {
    private float a;
    private float b;

    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float f = this.a;
        if (f <= 0.0f) {
            f = d.h(context);
        }
        this.a = f;
        float f2 = this.b;
        if (f2 <= 0.0f) {
            f2 = d.g(context);
        }
        this.b = f2;
    }

    public abstract e g(InterfaceC3212a interfaceC3212a, View view);

    public abstract boolean h(InterfaceC3212a interfaceC3212a, int i);
}
