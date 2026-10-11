package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3647e4 implements Runnable {
    private final /* synthetic */ C3640d4 c0;
    private final /* synthetic */ C3640d4 d0;
    private final /* synthetic */ long e0;
    private final /* synthetic */ C3654f4 f0;
    private final /* synthetic */ Bundle q;

    RunnableC3647e4(C3654f4 c3654f4, Bundle bundle, C3640d4 c3640d4, C3640d4 c3640d42, long j) {
        this.q = bundle;
        this.c0 = c3640d4;
        this.d0 = c3640d42;
        this.e0 = j;
        this.f0 = c3654f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3654f4.L(this.f0, this.q, this.c0, this.d0, this.e0);
    }
}
