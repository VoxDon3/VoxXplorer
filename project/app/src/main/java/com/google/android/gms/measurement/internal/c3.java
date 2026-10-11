/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.I2;
import java.util.List;
import java.util.concurrent.Callable;

final class c3
implements Callable<List<C5>> {
    private final String a;
    private final I2 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c3(I2 i22, String string) {
        this.a = string;
        this.b = i22;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        I2.w(this.b).u0();
        return I2.w(this.b).h0().S0(this.a);
    }
}

