package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class H4 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ E5 d0;
    private final /* synthetic */ ax.b6.M0 e0;
    private final /* synthetic */ C3689k4 f0;
    private final /* synthetic */ String q;

    H4(C3689k4 c3689k4, String str, String str2, E5 e5, ax.b6.M0 m0) {
        this.q = str;
        this.c0 = str2;
        this.d0 = e5;
        this.e0 = m0;
        this.f0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            interfaceC2057e = this.f0.d;
            if (interfaceC2057e == null) {
                this.f0.k().G().c("Failed to get conditional properties; not connected to service", this.q, this.c0);
                return;
            }
            C0821p.l(this.d0);
            ArrayList<Bundle> t0 = B5.t0(interfaceC2057e.F(this.q, this.c0, this.d0));
            this.f0.l0();
            this.f0.i().T(this.e0, t0);
        } catch (RemoteException e) {
            this.f0.k().G().d("Failed to get conditional properties; remote exception", this.q, this.c0, e);
        } finally {
            this.f0.i().T(this.e0, arrayList);
        }
    }
}
