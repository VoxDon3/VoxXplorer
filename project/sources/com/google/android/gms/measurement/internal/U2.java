package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class U2 implements Callable<List<C3649f>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ I2 d;

    U2(I2 i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C3649f> call() throws Exception {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.d.e;
        q5Var.u0();
        q5Var2 = this.d.e;
        return q5Var2.h0().R(this.a, this.b, this.c);
    }
}
