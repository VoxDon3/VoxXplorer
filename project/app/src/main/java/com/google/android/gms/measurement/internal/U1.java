/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.k2;

final class U1
implements Runnable {
    private final String c0;
    private final Object d0;
    private final Object e0;
    private final Object f0;
    private final V1 g0;
    private final int q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    U1(V1 v12, int n8, String string, Object object, Object object2, Object object3) {
        this.q = n8;
        this.c0 = string;
        this.d0 = object;
        this.e0 = object2;
        this.f0 = object3;
        this.g0 = v12;
    }

    @Override
    public final void run() {
        g2 g22 = this.g0.a.F();
        if (!g22.s()) {
            this.g0.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (V1.u(this.g0) == '\u0000') {
            if (((f3)this.g0).d().W()) {
                V1.A(this.g0, 'C');
            } else {
                V1.A(this.g0, 'c');
            }
        }
        if (V1.D(this.g0) < 0L) {
            V1.B(this.g0, 97001L);
        }
        char c8 = "01VDIWEA?".charAt(this.q);
        char c9 = V1.u(this.g0);
        long l8 = V1.D(this.g0);
        CharSequence charSequence = V1.x(true, this.c0, this.d0, this.e0, this.f0);
        Object object = new StringBuilder("2");
        ((StringBuilder)object).append(c8);
        ((StringBuilder)object).append(c9);
        ((StringBuilder)object).append(l8);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append((String)charSequence);
        object = ((StringBuilder)object).toString();
        charSequence = object;
        if (((String)object).length() > 1024) {
            charSequence = this.c0.substring(0, 1024);
        }
        if ((object = g22.f) != null) {
            ((k2)object).b((String)charSequence, 1L);
        }
    }
}

