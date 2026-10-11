package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3757v4 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ C3689k4 d0;
    private final /* synthetic */ AtomicReference q;

    RunnableC3757v4(C3689k4 c3689k4, AtomicReference atomicReference, E5 e5) {
        this.q = atomicReference;
        this.c0 = e5;
        this.d0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        synchronized (this.q) {
            try {
                try {
                } catch (RemoteException e) {
                    this.d0.k().G().b("Failed to get app instance id", e);
                }
                if (!this.d0.h().M().B()) {
                    this.d0.k().M().a("Analytics storage consent denied; will not get app instance id");
                    this.d0.r().X0(null);
                    this.d0.h().i.b(null);
                    this.q.set(null);
                    return;
                }
                interfaceC2057e = this.d0.d;
                if (interfaceC2057e == null) {
                    this.d0.k().G().a("Failed to get app instance id");
                    return;
                }
                C0821p.l(this.c0);
                this.q.set(interfaceC2057e.p0(this.c0));
                String str = (String) this.q.get();
                if (str != null) {
                    this.d0.r().X0(str);
                    this.d0.h().i.b(str);
                }
                this.d0.l0();
                this.q.notify();
            } finally {
                this.q.notify();
            }
        }
    }
}
