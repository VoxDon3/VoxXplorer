/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.s;

final class F3
extends s {
    private final k3 e;

    F3(k3 k32, g3 g32) {
        this.e = k32;
        super(g32);
    }

    @Override
    public final void d() {
        if (this.e.a.u()) {
            k3.I0(this.e).b(2000L);
        }
    }
}

