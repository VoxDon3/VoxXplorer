package com.google.android.gms.measurement.internal;

import ax.b6.C1579i2;
import ax.b6.F6;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3635d extends M5 {
    private ax.b6.E1 g;
    private final /* synthetic */ J5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3635d(J5 j5, String str, int i, ax.b6.E1 e1) {
        super(str, i);
        this.h = j5;
        this.g = e1;
    }

    @Override // com.google.android.gms.measurement.internal.M5
    final int a() {
        return this.g.n();
    }

    @Override // com.google.android.gms.measurement.internal.M5
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.M5
    final boolean j() {
        return true;
    }

    final boolean k(Long l, Long l2, C1579i2 c1579i2, boolean z) {
        boolean z2 = F6.a() && this.h.d().G(this.a, F.j0);
        boolean O = this.g.O();
        boolean P = this.g.P();
        boolean Q = this.g.Q();
        boolean z3 = O || P || Q;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z3) {
            this.h.k().K().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.R() ? Integer.valueOf(this.g.n()) : null);
            return true;
        }
        ax.b6.C1 K = this.g.K();
        boolean P2 = K.P();
        if (c1579i2.g0()) {
            if (K.R()) {
                bool = M5.d(M5.c(c1579i2.X(), K.M()), P2);
            } else {
                this.h.k().L().b("No number filter for long property. property", this.h.g().g(c1579i2.c0()));
            }
        } else if (c1579i2.e0()) {
            if (K.R()) {
                bool = M5.d(M5.b(c1579i2.I(), K.M()), P2);
            } else {
                this.h.k().L().b("No number filter for double property. property", this.h.g().g(c1579i2.c0()));
            }
        } else if (!c1579i2.i0()) {
            this.h.k().L().b("User property has no value, property", this.h.g().g(c1579i2.c0()));
        } else if (K.T()) {
            bool = M5.d(M5.g(c1579i2.d0(), K.N(), this.h.k()), P2);
        } else if (!K.R()) {
            this.h.k().L().b("No string or number filter defined. property", this.h.g().g(c1579i2.c0()));
        } else if (x5.h0(c1579i2.d0())) {
            bool = M5.d(M5.e(c1579i2.d0(), K.M()), P2);
        } else {
            this.h.k().L().c("Invalid user property value for Numeric number filter. property, value", this.h.g().g(c1579i2.c0()), c1579i2.d0());
        }
        this.h.k().K().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (Q && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.g.O()) {
            this.d = bool;
        }
        if (bool.booleanValue() && z3 && c1579i2.h0()) {
            long Z = c1579i2.Z();
            if (l != null) {
                Z = l.longValue();
            }
            if (z2 && this.g.O() && !this.g.P() && l2 != null) {
                Z = l2.longValue();
            }
            if (this.g.P()) {
                this.f = Long.valueOf(Z);
            } else {
                this.e = Long.valueOf(Z);
            }
        }
        return true;
    }
}
