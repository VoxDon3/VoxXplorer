package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.f6.InterfaceC2057e;

/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3763w4 implements Runnable {
    private final /* synthetic */ C3689k4 c0;
    private final /* synthetic */ C3640d4 q;

    RunnableC3763w4(C3689k4 c3689k4, C3640d4 c3640d4) {
        this.q = c3640d4;
        this.c0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        interfaceC2057e = this.c0.d;
        if (interfaceC2057e == null) {
            this.c0.k().G().a("Failed to send current screen to service");
            return;
        }
        try {
            C3640d4 c3640d4 = this.q;
            if (c3640d4 == null) {
                interfaceC2057e.F0(0L, null, null, this.c0.a().getPackageName());
            } else {
                interfaceC2057e.F0(c3640d4.c, c3640d4.a, c3640d4.b, this.c0.a().getPackageName());
            }
            this.c0.l0();
        } catch (RemoteException e) {
            this.c0.k().G().b("Failed to send current screen to the service", e);
        }
    }
}
