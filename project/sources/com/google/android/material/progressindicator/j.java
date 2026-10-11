package com.google.android.material.progressindicator;

import android.animation.Animator;
import ax.w2.AbstractC3330b;
import com.google.android.material.progressindicator.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
abstract class j<T extends Animator> {
    protected k a;
    protected final List<i.a> b = new ArrayList();

    protected j(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new i.a());
        }
    }

    abstract void a();

    protected float b(int i, int i2, int i3) {
        return ax.W.a.a((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void c();

    public abstract void d(AbstractC3330b abstractC3330b);

    protected void e(k kVar) {
        this.a = kVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
