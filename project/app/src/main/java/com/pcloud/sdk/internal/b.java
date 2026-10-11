/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.r;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class b
implements r,
Runnable {
    private final Executor c0;
    private volatile boolean d0;
    private volatile long e0;
    private volatile long f0;
    private final r q;

    b(r r8, Executor executor) {
        this.q = r8;
        this.c0 = executor;
    }

    @Override
    public void a(long l8, long l9) {
        if (!this.d0 || l8 == l9) {
            this.e0 = l8;
            this.f0 = l9;
            try {
                this.d0 = true;
                this.c0.execute(this);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                this.d0 = false;
            }
        }
    }

    @Override
    public void run() {
        this.q.a(this.e0, this.f0);
        this.d0 = false;
    }
}

