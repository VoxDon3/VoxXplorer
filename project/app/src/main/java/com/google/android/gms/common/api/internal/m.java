/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;

final class m
implements Runnable {
    final n q;

    m(n n8) {
        this.q = n8;
    }

    @Override
    public final void run() {
        o o8 = this.q.a;
        o.t(o8).e(o.t(o8).getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

