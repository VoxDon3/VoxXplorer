/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.C1;
import ax.b6.E1;
import ax.b6.F6;
import ax.b6.i2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.J5;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.x5;

final class d
extends M5 {
    private E1 g;
    private final J5 h;

    d(J5 j52, String string, int n8, E1 e12) {
        this.h = j52;
        super(string, n8);
        this.g = e12;
    }

    @Override
    final int a() {
        return this.g.n();
    }

    @Override
    final boolean i() {
        return false;
    }

    @Override
    final boolean j() {
        return true;
    }

    final boolean k(Long object, Long object2, i2 i22, boolean bl) {
        int n8 = F6.a() && this.h.d().G(this.a, F.j0) ? 1 : 0;
        boolean bl2 = this.g.O();
        boolean bl3 = this.g.P();
        boolean bl4 = this.g.Q();
        boolean bl5 = bl2 || bl3 || bl4;
        Object object3 = null;
        Object object4 = null;
        if (bl && !bl5) {
            object2 = this.h.k().K();
            n8 = this.b;
            object = object4;
            if (this.g.R()) {
                object = this.g.n();
            }
            ((X1)object2).c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", n8, object);
            return true;
        }
        object4 = this.g.K();
        bl2 = ((C1)object4).P();
        if (i22.g0()) {
            if (!((C1)object4).R()) {
                this.h.k().L().b("No number filter for long property. property", this.h.g().g(i22.c0()));
                object4 = object3;
            } else {
                object4 = M5.d(M5.c(i22.X(), ((C1)object4).M()), bl2);
            }
        } else if (i22.e0()) {
            if (!((C1)object4).R()) {
                this.h.k().L().b("No number filter for double property. property", this.h.g().g(i22.c0()));
                object4 = object3;
            } else {
                object4 = M5.d(M5.b(i22.I(), ((C1)object4).M()), bl2);
            }
        } else if (i22.i0()) {
            if (!((C1)object4).T()) {
                if (!((C1)object4).R()) {
                    this.h.k().L().b("No string or number filter defined. property", this.h.g().g(i22.c0()));
                    object4 = object3;
                } else if (x5.h0(i22.d0())) {
                    object4 = M5.d(M5.e(i22.d0(), ((C1)object4).M()), bl2);
                } else {
                    this.h.k().L().c("Invalid user property value for Numeric number filter. property, value", this.h.g().g(i22.c0()), i22.d0());
                    object4 = object3;
                }
            } else {
                object4 = M5.d(M5.g(i22.d0(), ((C1)object4).N(), this.h.k()), bl2);
            }
        } else {
            this.h.k().L().b("User property has no value, property", this.h.g().g(i22.c0()));
            object4 = object3;
        }
        X1 x12 = this.h.k().K();
        object3 = object4 == null ? "null" : object4;
        x12.b("Property filter result", object3);
        if (object4 == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (bl4 && !((Boolean)object4).booleanValue()) {
            return true;
        }
        if (!bl || this.g.O()) {
            this.d = object4;
        }
        if (((Boolean)object4).booleanValue() && bl5 && i22.h0()) {
            long l8 = i22.Z();
            if (object != null) {
                l8 = (Long)object;
            }
            long l9 = l8;
            if (n8 != 0) {
                l9 = l8;
                if (this.g.O()) {
                    l9 = l8;
                    if (!this.g.P()) {
                        l9 = l8;
                        if (object2 != null) {
                            l9 = (Long)object2;
                        }
                    }
                }
            }
            if (this.g.P()) {
                this.f = l9;
            } else {
                this.e = l9;
            }
        }
        return true;
    }
}

