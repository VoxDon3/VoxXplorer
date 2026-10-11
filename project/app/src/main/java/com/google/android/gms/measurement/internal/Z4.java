/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.Y4;
import com.google.android.gms.measurement.internal.f3;

final class Z4 {
    private Y4 a;
    final V4 b;

    Z4(V4 v42) {
        this.b = v42;
    }

    final void a() {
        ((f3)this.b).n();
        if (this.a != null) {
            V4.B(this.b).removeCallbacks((Runnable)this.a);
        }
        ((f3)this.b).h().u.a(false);
        this.b.D(false);
    }

    final void b(long l8) {
        this.a = new Y4(this, ((f3)this.b).b().a(), l8);
        V4.B(this.b).postDelayed((Runnable)this.a, 2000L);
    }
}

