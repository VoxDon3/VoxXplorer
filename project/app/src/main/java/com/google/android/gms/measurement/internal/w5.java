/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.p;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.t5;

final class w5
implements Runnable {
    private final String c0;
    private final Bundle d0;
    private final t5 e0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    w5(t5 t52, String string, String string2, Bundle bundle) {
        this.q = string;
        this.c0 = string2;
        this.d0 = bundle;
        this.e0 = t52;
    }

    @Override
    public final void run() {
        D d8 = this.e0.a.t0().H(this.q, this.c0, this.d0, "auto", this.e0.a.b().a(), false, true);
        this.e0.a.w(p.l(d8), this.q);
    }
}

