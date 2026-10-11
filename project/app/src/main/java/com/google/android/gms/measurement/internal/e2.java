/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f2;

final class e2
implements Runnable {
    private final f2 c0;
    private final boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    e2(f2 f22, boolean bl) {
        this.q = bl;
        this.c0 = f22;
    }

    @Override
    public final void run() {
        f2.a(this.c0).J(this.q);
    }
}

