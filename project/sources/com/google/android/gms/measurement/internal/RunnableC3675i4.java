package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3675i4 implements Runnable {
    private final /* synthetic */ long c0;
    private final /* synthetic */ C3654f4 d0;
    private final /* synthetic */ C3640d4 q;

    RunnableC3675i4(C3654f4 c3654f4, C3640d4 c3640d4, long j) {
        this.q = c3640d4;
        this.c0 = j;
        this.d0 = c3654f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d0.K(this.q, false, this.c0);
        C3654f4 c3654f4 = this.d0;
        c3654f4.e = null;
        c3654f4.t().L(null);
    }
}
