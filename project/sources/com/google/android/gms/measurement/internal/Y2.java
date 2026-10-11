package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Y2 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ I2 d0;
    private final /* synthetic */ D q;

    Y2(I2 i2, D d, String str) {
        this.q = d;
        this.c0 = str;
        this.d0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.d0.e;
        q5Var.u0();
        q5Var2 = this.d0.e;
        q5Var2.w(this.q, this.c0);
    }
}
