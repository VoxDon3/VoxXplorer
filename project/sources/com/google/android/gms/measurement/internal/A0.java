package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class A0 implements Runnable {
    private final /* synthetic */ long c0;
    private final /* synthetic */ C3776z d0;
    private final /* synthetic */ String q;

    A0(C3776z c3776z, String str, long j) {
        this.q = str;
        this.c0 = j;
        this.d0 = c3776z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3776z.C(this.d0, this.q, this.c0);
    }
}
