package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class N3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ AtomicReference q;

    N3(C3688k3 c3688k3, AtomicReference atomicReference) {
        this.q = atomicReference;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.q) {
            try {
                try {
                    this.q.set(Long.valueOf(this.c0.d().z(this.c0.p().F(), F.N)));
                } finally {
                    this.q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
