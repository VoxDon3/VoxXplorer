/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.d5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.s;

final class a5 {
    private long a;
    protected long b;
    private final s c;
    final V4 d;

    public a5(V4 v42) {
        long l8;
        this.d = v42;
        this.c = new d5(this, v42.a);
        this.a = l8 = ((f3)v42).b().b();
        this.b = l8;
    }

    static /* synthetic */ void c(a5 a52) {
        ((f3)a52.d).n();
        a52.d(false, false, ((f3)a52.d).b().b());
        ((C1)a52.d).o().v(((f3)a52.d).b().b());
    }

    final long a(long l8) {
        long l9 = this.b;
        this.b = l8;
        return l8 - l9;
    }

    final void b() {
        this.c.a();
        this.a = ((f3)this.d).d().t(F.Z0) ? ((f3)this.d).b().b() : 0L;
        this.b = this.a;
    }

    public final boolean d(boolean bl, boolean bl2, long l8) {
        ((f3)this.d).n();
        this.d.v();
        if (this.d.a.p()) {
            ((f3)this.d).h().r.b(((f3)this.d).b().a());
        }
        long l9 = l8 - this.a;
        if (!bl && l9 < 1000L) {
            ((f3)this.d).k().K().b("Screen exposed for less than 1000 ms. Event not sent. time", l9);
            return false;
        }
        if (!bl2) {
            l9 = this.a(l8);
        }
        ((f3)this.d).k().K().b("Recording user engagement, ms", l9);
        Bundle bundle = new Bundle();
        bundle.putLong("_et", l9);
        bl = ((f3)this.d).d().T();
        B5.X(((C1)this.d).s().C(bl ^ true), bundle, true);
        if (!bl2) {
            ((C1)this.d).r().Y0("auto", "_e", bundle);
        }
        this.a = l8;
        this.c.a();
        this.c.b((Long)F.b0.a(null));
        return true;
    }

    final void e(long l8) {
        this.c.a();
    }

    final void f(long l8) {
        ((f3)this.d).n();
        this.c.a();
        this.a = l8;
        this.b = l8;
    }
}

