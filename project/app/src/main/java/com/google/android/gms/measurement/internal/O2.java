/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.d4;

final class O2
implements Runnable {
    private final String c0;
    private final String d0;
    private final long e0;
    private final I2 f0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    O2(I2 i22, String string, String string2, String string3, long l8) {
        this.q = string;
        this.c0 = string2;
        this.d0 = string3;
        this.e0 = l8;
        this.f0 = i22;
    }

    @Override
    public final void run() {
        Object object = this.q;
        if (object == null) {
            I2.w(this.f0).F(this.c0, null);
            return;
        }
        object = new d4(this.d0, (String)object, this.e0);
        I2.w(this.f0).F(this.c0, (d4)object);
    }
}

