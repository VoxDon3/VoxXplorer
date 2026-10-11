package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class W4 implements Runnable {
    private final /* synthetic */ V4 c0;
    private final /* synthetic */ long q;

    W4(V4 v4, long j) {
        this.q = j;
        this.c0 = v4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V4.C(this.c0, this.q);
    }
}
