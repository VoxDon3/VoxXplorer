package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class T2 implements Runnable {
    private final /* synthetic */ I2 c0;
    private final /* synthetic */ E5 q;

    T2(I2 i2, E5 e5) {
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
        q5Var2.e0(this.q);
    }
}
