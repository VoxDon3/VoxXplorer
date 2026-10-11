/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import ax.b6.E0;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.Z4;
import com.google.android.gms.measurement.internal.a5;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.c5;
import com.google.android.gms.measurement.internal.f3;

public final class V4
extends b1 {
    private Handler c;
    private boolean d = true;
    protected final c5 e = new c5(this);
    protected final a5 f = new a5(this);
    private final Z4 g = new Z4(this);

    V4(E2 e22) {
        super(e22);
    }

    static /* bridge */ /* synthetic */ Handler B(V4 v42) {
        return v42.c;
    }

    static /* synthetic */ void C(V4 v42, long l8) {
        ((f3)v42).n();
        v42.G();
        ((f3)v42).k().K().b("Activity paused, time", l8);
        v42.g.b(l8);
        if (((f3)v42).d().T()) {
            v42.f.e(l8);
        }
    }

    private final void G() {
        ((f3)this).n();
        if (this.c == null) {
            this.c = new E0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void H(V4 v42) {
        v42.G();
    }

    static /* synthetic */ void I(V4 object, long l8) {
        ((f3)object).n();
        ((V4)object).G();
        ((f3)object).k().K().b("Activity resumed, time", l8);
        if (((f3)object).d().t(F.H0)) {
            if (((f3)object).d().T() || ((V4)object).d) {
                ((V4)object).f.f(l8);
            }
        } else if (((f3)object).d().T() || ((f3)object).h().u.b()) {
            ((V4)object).f.f(l8);
        }
        ((V4)object).g.a();
        object = ((V4)object).e;
        ((f3)((c5)object).a).n();
        if (((c5)object).a.a.p()) {
            ((c5)object).b(((f3)((c5)object).a).b().a(), false);
        }
    }

    @Override
    protected final boolean A() {
        return false;
    }

    final void D(boolean bl) {
        ((f3)this).n();
        this.d = bl;
    }

    public final boolean E(boolean bl, boolean bl2, long l8) {
        return this.f.d(bl, bl2, l8);
    }

    final boolean F() {
        ((f3)this).n();
        return this.d;
    }
}

