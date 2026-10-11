package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3668h4 implements Runnable {
    private final /* synthetic */ C3640d4 c0;
    private final /* synthetic */ long d0;
    private final /* synthetic */ boolean e0;
    private final /* synthetic */ C3654f4 f0;
    private final /* synthetic */ C3640d4 q;

    RunnableC3668h4(C3654f4 c3654f4, C3640d4 c3640d4, C3640d4 c3640d42, long j, boolean z) {
        this.q = c3640d4;
        this.c0 = c3640d42;
        this.d0 = j;
        this.e0 = z;
        this.f0 = c3654f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f0.J(this.q, this.c0, this.d0, this.e0, null);
    }
}
