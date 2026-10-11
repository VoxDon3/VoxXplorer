package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class O4 implements Runnable {
    private final /* synthetic */ J4 q;

    O4(J4 j4) {
        this.q = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3689k4.M(this.q.d0, new ComponentName(this.q.d0.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
