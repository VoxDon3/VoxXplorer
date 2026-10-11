package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3769x4 implements Runnable {
    private final /* synthetic */ C3689k4 c0;
    private final /* synthetic */ E5 q;

    RunnableC3769x4(C3689k4 c3689k4, E5 e5) {
        this.q = e5;
        this.c0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.c0.d;
        if (interfaceC2057e == null) {
            this.c0.k().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C0821p.l(this.q);
            interfaceC2057e.I0(this.q);
            this.c0.q().J();
            this.c0.I(interfaceC2057e, null, this.q);
            this.c0.l0();
        } catch (RemoteException e) {
            this.c0.k().G().b("Failed to send app launch to the service", e);
        }
    }
}
