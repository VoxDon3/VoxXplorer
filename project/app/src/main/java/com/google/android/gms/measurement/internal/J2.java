/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.I2;

public final class J2
implements Runnable {
    private String c0;
    private Bundle d0;
    private I2 q;

    public /* synthetic */ J2(I2 i22, String string, Bundle bundle) {
        this.q = i22;
        this.c0 = string;
        this.d0 = bundle;
    }

    @Override
    public final void run() {
        this.q.a2(this.c0, this.d0);
    }
}

