/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k3;
import java.util.concurrent.Executor;

final class x3
implements Executor {
    private final k3 q;

    x3(k3 k32) {
        this.q = k32;
    }

    @Override
    public final void execute(Runnable runnable2) {
        ((f3)this.q).l().D(runnable2);
    }
}

