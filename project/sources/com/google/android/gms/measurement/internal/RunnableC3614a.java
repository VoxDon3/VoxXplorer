package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3614a implements Runnable {
    private final /* synthetic */ long c0;
    private final /* synthetic */ C3776z d0;
    private final /* synthetic */ String q;

    RunnableC3614a(C3776z c3776z, String str, long j) {
        this.q = str;
        this.c0 = j;
        this.d0 = c3776z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3776z.y(this.d0, this.q, this.c0);
    }
}
