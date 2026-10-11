/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.u;

final class S3
implements Runnable {
    private final k3 c0;
    private final u q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    S3(k3 k32, u u8) {
        this.q = u8;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        if (((f3)this.c0).h().A(this.q)) {
            ((f3)this.c0).k().K().b("Setting DMA consent(FE)", this.q);
            if (((C1)this.c0).t().i0()) {
                ((C1)this.c0).t().d0();
                return;
            }
            ((C1)this.c0).t().U(false);
            return;
        }
        ((f3)this.c0).k().J().b("Lower precedence consent source ignored, proposed source", this.q.a());
    }
}

