package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
final class C4 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ boolean d0;
    private final /* synthetic */ D e0;
    private final /* synthetic */ String f0;
    private final /* synthetic */ C3689k4 g0;
    private final /* synthetic */ boolean q;

    C4(C3689k4 c3689k4, boolean z, E5 e5, boolean z2, D d, String str) {
        this.q = z;
        this.c0 = e5;
        this.d0 = z2;
        this.e0 = d;
        this.f0 = str;
        this.g0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.g0.d;
        if (interfaceC2057e == null) {
            this.g0.k().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.q) {
            C0821p.l(this.c0);
            this.g0.I(interfaceC2057e, this.d0 ? null : this.e0, this.c0);
        } else {
            try {
                if (TextUtils.isEmpty(this.f0)) {
                    C0821p.l(this.c0);
                    interfaceC2057e.w1(this.e0, this.c0);
                } else {
                    interfaceC2057e.N(this.e0, this.f0, this.g0.k().O());
                }
            } catch (RemoteException e) {
                this.g0.k().G().b("Failed to send event to the service", e);
            }
        }
        this.g0.l0();
    }
}
