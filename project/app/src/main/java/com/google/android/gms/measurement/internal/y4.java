/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.s;

final class y4
extends s {
    private final k4 e;

    y4(k4 k42, g3 g32) {
        this.e = k42;
        super(g32);
    }

    @Override
    public final void d() {
        ((f3)this.e).k().L().a("Tasks have been queued for a long time");
    }
}

