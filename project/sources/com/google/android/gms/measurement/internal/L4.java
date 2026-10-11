package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class L4 implements Runnable {
    private final /* synthetic */ J4 c0;
    private final /* synthetic */ ComponentName q;

    L4(J4 j4, ComponentName componentName) {
        this.q = componentName;
        this.c0 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3689k4.M(this.c0.d0, this.q);
    }
}
