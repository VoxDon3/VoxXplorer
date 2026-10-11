package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class O2 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ String d0;
    private final /* synthetic */ long e0;
    private final /* synthetic */ I2 f0;
    private final /* synthetic */ String q;

    O2(I2 i2, String str, String str2, String str3, long j) {
        this.q = str;
        this.c0 = str2;
        this.d0 = str3;
        this.e0 = j;
        this.f0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5 q5Var2;
        String str = this.q;
        if (str == null) {
            q5Var2 = this.f0.e;
            q5Var2.F(this.c0, null);
        } else {
            C3640d4 c3640d4 = new C3640d4(this.d0, str, this.e0);
            q5Var = this.f0.e;
            q5Var.F(this.c0, c3640d4);
        }
    }
}
