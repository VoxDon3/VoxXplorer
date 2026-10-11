/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.I2;
import java.util.List;
import java.util.concurrent.Callable;

final class P2
implements Callable<List<C5>> {
    private final String a;
    private final String b;
    private final String c;
    private final I2 d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    P2(I2 i22, String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = i22;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        I2.w(this.d).u0();
        return I2.w(this.d).h0().z0(this.a, this.b, this.c);
    }
}

