/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final class n
implements Runnable {
    public final p.b c0;
    public final Callable q;

    public /* synthetic */ n(Callable callable, p.b b8) {
        this.q = callable;
        this.c0 = b8;
    }

    @Override
    public final void run() {
        o.e(this.q, this.c0);
    }
}

