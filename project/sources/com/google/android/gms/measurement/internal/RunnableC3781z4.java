package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3781z4 implements Runnable {
    private final /* synthetic */ Bundle c0;
    private final /* synthetic */ C3689k4 d0;
    private final /* synthetic */ E5 q;

    RunnableC3781z4(C3689k4 c3689k4, E5 e5, Bundle bundle) {
        this.q = e5;
        this.c0 = bundle;
        this.d0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.d0.d;
        if (interfaceC2057e == null) {
            this.d0.k().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            C0821p.l(this.q);
            interfaceC2057e.g0(this.c0, this.q);
        } catch (RemoteException e) {
            this.d0.k().G().b("Failed to send default event parameters to service", e);
        }
    }
}
