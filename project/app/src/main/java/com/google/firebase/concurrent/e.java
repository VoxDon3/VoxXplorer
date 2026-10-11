/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;

public final class e
implements Runnable {
    public final p.b c0;
    public final Runnable q;

    public /* synthetic */ e(Runnable runnable2, p.b b8) {
        this.q = runnable2;
        this.c0 = b8;
    }

    @Override
    public final void run() {
        o.o(this.q, this.c0);
    }
}

