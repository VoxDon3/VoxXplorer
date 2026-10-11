package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3722p4 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ E5 d0;
    private final /* synthetic */ boolean e0;
    private final /* synthetic */ ax.b6.M0 f0;
    private final /* synthetic */ C3689k4 g0;
    private final /* synthetic */ String q;

    RunnableC3722p4(C3689k4 c3689k4, String str, String str2, E5 e5, boolean z, ax.b6.M0 m0) {
        this.q = str;
        this.c0 = str2;
        this.d0 = e5;
        this.e0 = z;
        this.f0 = m0;
        this.g0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        Bundle bundle = new Bundle();
        try {
            interfaceC2057e = this.g0.d;
            if (interfaceC2057e == null) {
                this.g0.k().G().c("Failed to get user properties; not connected to service", this.q, this.c0);
                return;
            }
            C0821p.l(this.d0);
            Bundle G = B5.G(interfaceC2057e.u1(this.q, this.c0, this.e0, this.d0));
            this.g0.l0();
            this.g0.i().R(this.f0, G);
        } catch (RemoteException e) {
            this.g0.k().G().c("Failed to get user properties; remote exception", this.q, e);
        } finally {
            this.g0.i().R(this.f0, bundle);
        }
    }
}
