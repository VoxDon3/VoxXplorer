package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;

/* loaded from: classes3.dex */
final class M2 implements Runnable {
    private final /* synthetic */ I2 c0;
    private final /* synthetic */ E5 q;

    M2(I2 i2, E5 e5) {
        this.q = e5;
        this.c0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.c0.e;
        q5Var.u0();
        q5Var2 = this.c0.e;
        E5 e5 = this.q;
        q5Var2.l().n();
        q5Var2.v0();
        C0821p.f(e5.q);
        q5Var2.h(e5);
    }
}
