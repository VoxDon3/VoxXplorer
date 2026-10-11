package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3745t4 implements Runnable {
    private final /* synthetic */ boolean c0;
    private final /* synthetic */ A5 d0;
    private final /* synthetic */ C3689k4 e0;
    private final /* synthetic */ E5 q;

    RunnableC3745t4(C3689k4 c3689k4, E5 e5, boolean z, A5 a5) {
        this.q = e5;
        this.c0 = z;
        this.d0 = a5;
        this.e0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.e0.d;
        if (interfaceC2057e == null) {
            this.e0.k().G().a("Discarding data. Failed to set user property");
            return;
        }
        C0821p.l(this.q);
        this.e0.I(interfaceC2057e, this.c0 ? null : this.d0, this.q);
        this.e0.l0();
    }
}
