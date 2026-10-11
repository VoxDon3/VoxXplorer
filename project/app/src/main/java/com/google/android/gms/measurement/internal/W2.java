/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.f6.a;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;
import java.util.concurrent.Callable;

final class W2
implements Callable<a> {
    private final E5 a;
    private final I2 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    W2(I2 i22, E5 e52) {
        this.a = e52;
        this.b = i22;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        I2.w(this.b).u0();
        return new a(I2.w(this.b).f(this.a.q));
    }
}

