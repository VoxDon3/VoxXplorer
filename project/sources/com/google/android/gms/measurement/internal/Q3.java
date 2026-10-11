package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class Q3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ AtomicReference q;

    Q3(C3688k3 c3688k3, AtomicReference atomicReference) {
        this.q = atomicReference;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.q) {
            try {
                try {
                    this.q.set(Double.valueOf(this.c0.d().o(this.c0.p().F(), F.P)));
                } finally {
                    this.q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
