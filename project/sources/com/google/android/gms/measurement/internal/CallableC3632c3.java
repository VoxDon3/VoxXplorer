package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC3632c3 implements Callable<List<C5>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ I2 b;

    CallableC3632c3(I2 i2, String str) {
        this.a = str;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5> call() throws Exception {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.b.e;
        q5Var.u0();
        q5Var2 = this.b.e;
        return q5Var2.h0().S0(this.a);
    }
}
