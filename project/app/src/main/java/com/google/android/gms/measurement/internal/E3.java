/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

final class E3
implements Runnable {
    private final String c0;
    private final Object d0;
    private final long e0;
    private final k3 f0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    E3(k3 k32, String string, String string2, Object object, long l8) {
        this.q = string;
        this.c0 = string2;
        this.d0 = object;
        this.e0 = l8;
        this.f0 = k32;
    }

    @Override
    public final void run() {
        this.f0.j0(this.q, this.c0, this.d0, this.e0);
    }
}

