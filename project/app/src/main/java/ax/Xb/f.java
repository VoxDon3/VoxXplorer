/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Qb.i0;
import ax.Xb.a;
import ax.Xb.i;

public class f
extends i0 {
    private final int e0;
    private final int f0;
    private final long g0;
    private final String h0;
    private a i0;

    public f(int n8, int n9, long l8, String string) {
        this.e0 = n8;
        this.f0 = n9;
        this.g0 = l8;
        this.h0 = string;
        this.i0 = this.Z0();
    }

    private final a Z0() {
        return new a(this.e0, this.f0, this.g0, this.h0);
    }

    public final void a1(Runnable runnable2, i i8, boolean bl) {
        this.i0.g(runnable2, i8, bl);
    }

    @Override
    public void b(ax.wb.i i8, Runnable runnable2) {
        a.m(this.i0, runnable2, null, false, 6, null);
    }
}

