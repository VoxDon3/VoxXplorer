/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import ax.W.a;
import ax.w2.b;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.k;
import java.util.ArrayList;
import java.util.List;

abstract class j<T extends Animator> {
    protected k a;
    protected final List<i.a> b = new ArrayList<i.a>();

    protected j(int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            this.b.add(new i.a());
        }
    }

    abstract void a();

    protected float b(int n8, int n9, int n10) {
        return ax.W.a.a((float)(n8 - n9) / (float)n10, 0.0f, 1.0f);
    }

    public abstract void c();

    public abstract void d(b var1);

    protected void e(k k8) {
        this.a = k8;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}

