package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class M3 implements Runnable {
    private final /* synthetic */ String c0 = null;
    private final /* synthetic */ String d0;
    private final /* synthetic */ String e0;
    private final /* synthetic */ boolean f0;
    private final /* synthetic */ C3688k3 g0;
    private final /* synthetic */ AtomicReference q;

    M3(C3688k3 c3688k3, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.q = atomicReference;
        this.d0 = str2;
        this.e0 = str3;
        this.f0 = z;
        this.g0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g0.a.J().T(this.q, null, this.d0, this.e0, this.f0);
    }
}
