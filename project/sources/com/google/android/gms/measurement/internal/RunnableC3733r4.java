package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3733r4 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ Bundle d0;
    private final /* synthetic */ C3689k4 e0;
    private final /* synthetic */ AtomicReference q;

    RunnableC3733r4(C3689k4 c3689k4, AtomicReference atomicReference, E5 e5, Bundle bundle) {
        this.q = atomicReference;
        this.c0 = e5;
        this.d0 = bundle;
        this.e0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        synchronized (this.q) {
            try {
                try {
                    interfaceC2057e = this.e0.d;
                } catch (RemoteException e) {
                    this.e0.k().G().b("Failed to get trigger URIs; remote exception", e);
                }
                if (interfaceC2057e == null) {
                    this.e0.k().G().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                C0821p.l(this.c0);
                this.q.set(interfaceC2057e.B1(this.c0, this.d0));
                this.e0.l0();
                this.q.notify();
            } finally {
                this.q.notify();
            }
        }
    }
}
