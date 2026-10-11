package com.google.android.gms.measurement.internal;

import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
final class I4 implements Runnable {
    private final /* synthetic */ J4 c0;
    private final /* synthetic */ InterfaceC2057e q;

    I4(J4 j4, InterfaceC2057e interfaceC2057e) {
        this.q = interfaceC2057e;
        this.c0 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c0) {
            try {
                this.c0.q = false;
                if (!this.c0.d0.f0()) {
                    this.c0.d0.k().K().a("Connected to service");
                    this.c0.d0.H(this.q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
