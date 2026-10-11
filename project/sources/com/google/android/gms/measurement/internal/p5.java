package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class p5 implements Runnable {
    private final /* synthetic */ q5 c0;
    private final /* synthetic */ y5 q;

    p5(q5 q5Var, y5 y5Var) {
        this.q = y5Var;
        this.c0 = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5.y(this.c0, this.q);
        this.c0.y0();
    }
}
