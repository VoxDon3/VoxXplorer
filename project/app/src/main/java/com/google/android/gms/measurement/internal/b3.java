/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.I2;
import java.util.concurrent.Callable;

final class b3
implements Callable<byte[]> {
    private final D a;
    private final String b;
    private final I2 c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    b3(I2 i22, D d8, String string) {
        this.a = d8;
        this.b = string;
        this.c = i22;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        I2.w(this.c).u0();
        return I2.w(this.c).p0().y(this.a, this.b);
    }
}

