package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class E4 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ String d0;
    private final /* synthetic */ String e0;
    private final /* synthetic */ E5 f0;
    private final /* synthetic */ C3689k4 g0;
    private final /* synthetic */ AtomicReference q;

    E4(C3689k4 c3689k4, AtomicReference atomicReference, String str, String str2, String str3, E5 e5) {
        this.q = atomicReference;
        this.c0 = str;
        this.d0 = str2;
        this.e0 = str3;
        this.f0 = e5;
        this.g0 = c3689k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2057e interfaceC2057e;
        synchronized (this.q) {
            try {
                try {
                    interfaceC2057e = this.g0.d;
                } catch (RemoteException e) {
                    this.g0.k().G().d("(legacy) Failed to get conditional properties; remote exception", V1.v(this.c0), this.d0, e);
                    this.q.set(Collections.EMPTY_LIST);
                }
                if (interfaceC2057e == null) {
                    this.g0.k().G().d("(legacy) Failed to get conditional properties; not connected to service", V1.v(this.c0), this.d0, this.e0);
                    this.q.set(Collections.EMPTY_LIST);
                    return;
                }
                if (TextUtils.isEmpty(this.c0)) {
                    C0821p.l(this.f0);
                    this.q.set(interfaceC2057e.F(this.d0, this.e0, this.f0));
                } else {
                    this.q.set(interfaceC2057e.J0(this.c0, this.d0, this.e0));
                }
                this.g0.l0();
                this.q.notify();
            } finally {
                this.q.notify();
            }
        }
    }
}
