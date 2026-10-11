package com.pcloud.sdk.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.pcloud.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class RunnableC3783b implements ax.la.r, Runnable {
    private final Executor c0;
    private volatile boolean d0;
    private volatile long e0;
    private volatile long f0;
    private final ax.la.r q;

    RunnableC3783b(ax.la.r rVar, Executor executor) {
        this.q = rVar;
        this.c0 = executor;
    }

    @Override // ax.la.r
    public void a(long j, long j2) {
        if (!this.d0 || j == j2) {
            this.e0 = j;
            this.f0 = j2;
            try {
                this.d0 = true;
                this.c0.execute(this);
            } catch (RejectedExecutionException unused) {
                this.d0 = false;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.q.a(this.e0, this.f0);
        this.d0 = false;
    }
}
