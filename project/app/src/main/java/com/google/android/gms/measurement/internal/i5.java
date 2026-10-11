/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.j5;
import com.google.android.gms.measurement.internal.s;

final class i5
extends s {
    private final j5 e;

    i5(j5 j52, g3 g32) {
        this.e = j52;
        super(g32);
    }

    @Override
    public final void d() {
        this.e.z();
        ((f3)this.e).k().K().a("Starting upload from DelayedRunnable");
        this.e.b.z0();
    }
}

