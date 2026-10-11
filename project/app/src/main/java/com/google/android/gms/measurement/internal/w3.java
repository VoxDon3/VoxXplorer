/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.v7.b;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.k3;

final class w3
implements b<Object> {
    private final h5 a;
    private final k3 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    w3(k3 k32, h5 h52) {
        this.a = h52;
        this.b = k32;
    }

    @Override
    public final void a(Object sparseArray) {
        ((f3)this.b).n();
        if (((f3)this.b).d().t(F.G0)) {
            sparseArray = ((f3)this.b).h().K();
            h5 h52 = this.a;
            sparseArray.put(h52.d0, (Object)h52.c0);
            ((f3)this.b).h().v(sparseArray);
            k3.Z(this.b, false);
            k3.U(this.b, 1);
            ((f3)this.b).k().F().b("Successfully registered trigger URI", this.a.q);
            this.b.F0();
            return;
        }
        k3.Z(this.b, false);
        this.b.F0();
        ((f3)this.b).k().F().b("registerTriggerAsync ran. uri", this.a.q);
    }

    @Override
    public final void b(Throwable object) {
        ((f3)this.b).n();
        k3.Z(this.b, false);
        if (!((f3)this.b).d().t(F.G0)) {
            this.b.F0();
            ((f3)this.b).k().G().b("registerTriggerAsync failed with throwable", object);
            return;
        }
        this.b.z0().add(this.a);
        if (k3.B(this.b) > 64) {
            k3.U(this.b, 1);
            ((f3)this.b).k().L().c("registerTriggerAsync failed. May try later. App ID, throwable", V1.v(((C1)this.b).p().F()), V1.v(((Throwable)object).toString()));
            return;
        }
        ((f3)this.b).k().L().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", V1.v(((C1)this.b).p().F()), V1.v(String.valueOf(k3.B(this.b))), V1.v(((Throwable)object).toString()));
        object = this.b;
        k3.N0((k3)object, k3.B((k3)object));
        object = this.b;
        k3.U((k3)object, k3.B((k3)object) << 1);
    }
}

