package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class E3 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ Object d0;
    private final /* synthetic */ long e0;
    private final /* synthetic */ C3688k3 f0;
    private final /* synthetic */ String q;

    E3(C3688k3 c3688k3, String str, String str2, Object obj, long j) {
        this.q = str;
        this.c0 = str2;
        this.d0 = obj;
        this.e0 = j;
        this.f0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f0.j0(this.q, this.c0, this.d0, this.e0);
    }
}
