/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.b;

public final class a
implements Runnable {
    public final Runnable c0;
    public final b q;

    public /* synthetic */ a(b b8, Runnable runnable2) {
        this.q = b8;
        this.c0 = runnable2;
    }

    @Override
    public final void run() {
        b.a(this.q, this.c0);
    }
}

