package com.google.android.gms.measurement.internal;

import ax.f6.C2053a;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class W2 implements Callable<C2053a> {
    private final /* synthetic */ E5 a;
    private final /* synthetic */ I2 b;

    W2(I2 i2, E5 e5) {
        this.a = e5;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C2053a call() throws Exception {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.b.e;
        q5Var.u0();
        q5Var2 = this.b.e;
        return new C2053a(q5Var2.f(this.a.q));
    }
}
