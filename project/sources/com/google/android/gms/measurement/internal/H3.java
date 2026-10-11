package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class H3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ Bundle q;

    H3(C3688k3 c3688k3, Bundle bundle) {
        this.q = bundle;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3688k3.O0(this.c0, this.q);
    }
}
