/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.q5;
import java.util.concurrent.Callable;

final class u5
implements Callable<String> {
    private final E5 a;
    private final q5 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    u5(q5 q52, E5 e52) {
        this.a = e52;
        this.b = q52;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        if (this.b.S(p.l(this.a.q)).B() && h3.q(this.a.w0).B()) {
            Z1 z12 = this.b.h(this.a);
            if (z12 == null) {
                this.b.k().L().a("App info was null when attempting to get app instance id");
                return null;
            }
            return z12.m();
        }
        this.b.k().K().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

