package com.google.android.gms.measurement.internal;

import android.os.Handler;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3734s {
    private static volatile Handler d;
    private final InterfaceC3660g3 a;
    private final Runnable b;
    private volatile long c;

    AbstractC3734s(InterfaceC3660g3 interfaceC3660g3) {
        C0821p.l(interfaceC3660g3);
        this.a = interfaceC3660g3;
        this.b = new RunnableC3752v(this, interfaceC3660g3);
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (AbstractC3734s.class) {
            try {
                if (d == null) {
                    d = new ax.b6.E0(this.a.a().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().a();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.k().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.c != 0;
    }
}
