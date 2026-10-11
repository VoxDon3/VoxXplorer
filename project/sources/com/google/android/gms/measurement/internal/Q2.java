package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Q2 implements Runnable {
    private final /* synthetic */ I2 c0;
    private final /* synthetic */ C3649f q;

    Q2(I2 i2, C3649f c3649f) {
        this.q = c3649f;
        this.c0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5 q5Var2;
        q5 q5Var3;
        q5Var = this.c0.e;
        q5Var.u0();
        if (this.q.d0.k() == null) {
            q5Var3 = this.c0.e;
            q5Var3.t(this.q);
        } else {
            q5Var2 = this.c0.e;
            q5Var2.U(this.q);
        }
    }
}
