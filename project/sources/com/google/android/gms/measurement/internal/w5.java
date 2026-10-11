package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.C0821p;

/* loaded from: classes3.dex */
final class w5 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ Bundle d0;
    private final /* synthetic */ t5 e0;
    private final /* synthetic */ String q;

    w5(t5 t5Var, String str, String str2, Bundle bundle) {
        this.q = str;
        this.c0 = str2;
        this.d0 = bundle;
        this.e0 = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e0.a.w((D) C0821p.l(this.e0.a.t0().H(this.q, this.c0, this.d0, "auto", this.e0.a.b().a(), false, true)), this.q);
    }
}
