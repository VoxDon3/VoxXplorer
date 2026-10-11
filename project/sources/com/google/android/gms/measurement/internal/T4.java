package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class T4 implements Runnable {
    private final /* synthetic */ Runnable c0;
    private final /* synthetic */ q5 q;

    T4(S4 s4, q5 q5Var, Runnable runnable) {
        this.q = q5Var;
        this.c0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.u0();
        this.q.A(this.c0);
        this.q.z0();
    }
}
