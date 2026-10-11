package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
final class B4 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ ax.b6.M0 d0;
    private final /* synthetic */ C3689k4 e0;
    private final /* synthetic */ D q;

    B4(C3689k4 c3689k4, D d, String str, ax.b6.M0 m0) {
        this.q = d;
        this.c0 = str;
        this.d0 = m0;
        this.e0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        try {
            interfaceC2057e = this.e0.d;
            if (interfaceC2057e == null) {
                this.e0.k().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] h1 = interfaceC2057e.h1(this.q, this.c0);
            this.e0.l0();
            this.e0.i().V(this.d0, h1);
        } catch (RemoteException e) {
            this.e0.k().G().b("Failed to send event to the service to bundle", e);
        } finally {
            this.e0.i().V(this.d0, null);
        }
    }
}
