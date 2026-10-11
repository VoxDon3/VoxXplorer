package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
final class D4 implements Runnable {
    private final /* synthetic */ C3689k4 c0;
    private final /* synthetic */ E5 q;

    D4(C3689k4 c3689k4, E5 e5) {
        this.q = e5;
        this.c0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.c0.d;
        if (interfaceC2057e == null) {
            this.c0.k().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            C0821p.l(this.q);
            interfaceC2057e.f0(this.q);
            this.c0.l0();
        } catch (RemoteException e) {
            this.c0.k().G().b("Failed to send consent settings to the service", e);
        }
    }
}
