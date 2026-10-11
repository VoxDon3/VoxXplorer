package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3618a3 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ I2 d0;
    private final /* synthetic */ A5 q;

    RunnableC3618a3(I2 i2, A5 a5, E5 e5) {
        this.q = a5;
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
        if (this.q.k() == null) {
            q5Var3 = this.d0.e;
            q5Var3.G(this.q.c0, this.c0);
        } else {
            q5Var2 = this.d0.e;
            q5Var2.z(this.q, this.c0);
        }
    }
}
