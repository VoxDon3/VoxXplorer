package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3682j4 implements Runnable {
    private final /* synthetic */ C3654f4 c0;
    private final /* synthetic */ long q;

    RunnableC3682j4(C3654f4 c3654f4, long j) {
        this.q = j;
        this.c0 = c3654f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.o().v(this.q);
        this.c0.e = null;
    }
}
