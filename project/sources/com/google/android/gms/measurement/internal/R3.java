package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class R3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ AtomicReference q;

    R3(C3688k3 c3688k3, AtomicReference atomicReference) {
        this.q = atomicReference;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.q) {
            try {
                try {
                    this.q.set(Integer.valueOf(this.c0.d().v(this.c0.p().F(), F.O)));
                } finally {
                    this.q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
