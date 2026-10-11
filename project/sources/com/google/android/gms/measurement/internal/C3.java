package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class C3 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ long d0;
    private final /* synthetic */ Bundle e0;
    private final /* synthetic */ boolean f0;
    private final /* synthetic */ boolean g0;
    private final /* synthetic */ boolean h0;
    private final /* synthetic */ String i0;
    private final /* synthetic */ C3688k3 j0;
    private final /* synthetic */ String q;

    C3(C3688k3 c3688k3, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.q = str;
        this.c0 = str2;
        this.d0 = j;
        this.e0 = bundle;
        this.f0 = z;
        this.g0 = z2;
        this.h0 = z3;
        this.i0 = str3;
        this.j0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j0.e0(this.q, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0);
    }
}
