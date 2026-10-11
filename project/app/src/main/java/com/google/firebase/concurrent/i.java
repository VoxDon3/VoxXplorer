/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;

public final class i
implements Runnable {
    public final Runnable c0;
    public final p.b d0;
    public final o q;

    public /* synthetic */ i(o o8, Runnable runnable2, p.b b8) {
        this.q = o8;
        this.c0 = runnable2;
        this.d0 = b8;
    }

    @Override
    public final void run() {
        o.g(this.q, this.c0, this.d0);
    }
}

