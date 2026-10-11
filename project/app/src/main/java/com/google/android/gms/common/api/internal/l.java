/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.o;

final class l
implements Runnable {
    final o c0;
    final int q;

    l(o o8, int n8) {
        this.c0 = o8;
        this.q = n8;
    }

    @Override
    public final void run() {
        o.A(this.c0, this.q);
    }
}

