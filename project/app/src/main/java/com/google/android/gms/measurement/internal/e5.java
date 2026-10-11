/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.R5.e;

final class e5 {
    private final e a;
    private long b;

    public e5(e e8) {
        p.l(e8);
        this.a = e8;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long l8) {
        if (this.b == 0L) {
            return true;
        }
        return this.a.b() - this.b >= 3600000L;
    }

    public final void c() {
        this.b = this.a.b();
    }
}

