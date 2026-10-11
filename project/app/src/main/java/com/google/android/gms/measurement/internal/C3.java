/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.k3;

final class C3
implements Runnable {
    private final String c0;
    private final long d0;
    private final Bundle e0;
    private final boolean f0;
    private final boolean g0;
    private final boolean h0;
    private final String i0;
    private final k3 j0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    C3(k3 k32, String string, String string2, long l8, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string3) {
        this.q = string;
        this.c0 = string2;
        this.d0 = l8;
        this.e0 = bundle;
        this.f0 = bl;
        this.g0 = bl2;
        this.h0 = bl3;
        this.i0 = string3;
        this.j0 = k32;
    }

    @Override
    public final void run() {
        this.j0.e0(this.q, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0);
    }
}

