/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Handler;
import ax.M5.p;
import ax.b6.E0;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.v;

abstract class s {
    private static volatile Handler d;
    private final g3 a;
    private final Runnable b;
    private volatile long c;

    s(g3 g32) {
        p.l(g32);
        this.a = g32;
        this.b = new v(this, g32);
    }

    static /* bridge */ /* synthetic */ void c(s s8, long l8) {
        s8.c = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Handler f() {
        if (d != null) {
            return d;
        }
        synchronized (s.class) {
            try {
                if (d != null) return d;
                E0 e02 = new E0(this.a.a().getMainLooper());
                d = e02;
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    final void a() {
        this.c = 0L;
        this.f().removeCallbacks(this.b);
    }

    public final void b(long l8) {
        this.a();
        if (l8 >= 0L) {
            this.c = this.a.b().a();
            if (!this.f().postDelayed(this.b, l8)) {
                this.a.k().G().b("Failed to schedule delayed post. time", l8);
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.c != 0L;
    }
}

