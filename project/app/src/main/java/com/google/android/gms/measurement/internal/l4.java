/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f4;

final class l4
implements Runnable {
    private final f4 q;

    l4(f4 f42) {
        this.q = f42;
    }

    @Override
    public final void run() {
        f4.M(this.q, null);
    }
}

