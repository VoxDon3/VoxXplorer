package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC3625b3 implements Callable<byte[]> {
    private final /* synthetic */ D a;
    private final /* synthetic */ String b;
    private final /* synthetic */ I2 c;

    CallableC3625b3(I2 i2, D d, String str) {
        this.a = d;
        this.b = str;
        this.c = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.c.e;
        q5Var.u0();
        q5Var2 = this.c.e;
        return q5Var2.p0().y(this.a, this.b);
    }
}
