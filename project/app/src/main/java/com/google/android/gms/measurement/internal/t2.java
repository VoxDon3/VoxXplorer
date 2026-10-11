/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.C7;
import com.google.android.gms.measurement.internal.q2;
import java.util.concurrent.Callable;

public final class t2
implements Callable {
    private q2 a;

    public /* synthetic */ t2(q2 q22) {
        this.a = q22;
    }

    public final Object call() {
        return new C7(this.a.k);
    }
}

