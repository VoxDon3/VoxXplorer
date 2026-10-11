package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
final class F4 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ boolean d0;
    private final /* synthetic */ C3649f e0;
    private final /* synthetic */ C3649f f0;
    private final /* synthetic */ C3689k4 g0;
    private final /* synthetic */ boolean q = true;

    F4(C3689k4 c3689k4, boolean z, E5 e5, boolean z2, C3649f c3649f, C3649f c3649f2) {
        this.c0 = e5;
        this.d0 = z2;
        this.e0 = c3649f;
        this.f0 = c3649f2;
        this.g0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.g0.d;
        if (interfaceC2057e == null) {
            this.g0.k().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.q) {
            C0821p.l(this.c0);
            this.g0.I(interfaceC2057e, this.d0 ? null : this.e0, this.c0);
        } else {
            try {
                if (TextUtils.isEmpty(this.f0.q)) {
                    C0821p.l(this.c0);
                    interfaceC2057e.y0(this.e0, this.c0);
                } else {
                    interfaceC2057e.M0(this.e0);
                }
            } catch (RemoteException e) {
                this.g0.k().G().b("Failed to send conditional user property to the service", e);
            }
        }
        this.g0.l0();
    }
}
