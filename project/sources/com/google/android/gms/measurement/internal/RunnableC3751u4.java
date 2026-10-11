package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3751u4 implements Runnable {
    private final /* synthetic */ ax.b6.M0 c0;
    private final /* synthetic */ C3689k4 d0;
    private final /* synthetic */ E5 q;

    RunnableC3751u4(C3689k4 c3689k4, E5 e5, ax.b6.M0 m0) {
        this.q = e5;
        this.c0 = m0;
        this.d0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        try {
            if (!this.d0.h().M().B()) {
                this.d0.k().M().a("Analytics storage consent denied; will not get app instance id");
                this.d0.r().X0(null);
                this.d0.h().i.b(null);
                return;
            }
            interfaceC2057e = this.d0.d;
            if (interfaceC2057e == null) {
                this.d0.k().G().a("Failed to get app instance id");
                return;
            }
            C0821p.l(this.q);
            String p0 = interfaceC2057e.p0(this.q);
            if (p0 != null) {
                this.d0.r().X0(p0);
                this.d0.h().i.b(p0);
            }
            this.d0.l0();
            this.d0.i().S(this.c0, p0);
        } catch (RemoteException e) {
            this.d0.k().G().b("Failed to get app instance id", e);
        } finally {
            this.d0.i().S(this.c0, null);
        }
    }
}
