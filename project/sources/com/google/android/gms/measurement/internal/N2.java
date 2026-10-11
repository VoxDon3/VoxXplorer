package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class N2 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ I2 d0;
    private final /* synthetic */ C3649f q;

    N2(I2 i2, C3649f c3649f, E5 e5) {
        this.q = c3649f;
        this.c0 = e5;
        this.d0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5 q5Var2;
        q5 q5Var3;
        q5Var = this.d0.e;
        q5Var.u0();
        if (this.q.d0.k() == null) {
            q5Var3 = this.d0.e;
            q5Var3.u(this.q, this.c0);
        } else {
            q5Var2 = this.d0.e;
            q5Var2.V(this.q, this.c0);
        }
    }
}
