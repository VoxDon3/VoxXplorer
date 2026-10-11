/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.j;
import ax.b5.g;

public final class e
extends Enum<e>
implements g {
    public static final /* enum */ e e0;
    public static final /* enum */ e f0;
    public static final /* enum */ e g0;
    public static final /* enum */ e h0;
    public static final /* enum */ e i0;
    public static final /* enum */ e j0;
    public static final /* enum */ e k0;
    public static final /* enum */ e l0;
    public static final /* enum */ e m0;
    public static final /* enum */ e n0;
    public static final /* enum */ e o0;
    public static final /* enum */ e p0;
    public static final /* enum */ e q0;
    private static final e[] r0;
    private final int c0;
    private final j.a d0;
    private final boolean q;

    static {
        e e8;
        e e9;
        e e10;
        e e11;
        e e12;
        e e13;
        e e14;
        e e15;
        e e16;
        e e17;
        e e18;
        e e19;
        e e20;
        e0 = e20 = new e(false, j.a.e0);
        f0 = e19 = new e(false, j.a.f0);
        g0 = e18 = new e(false, j.a.h0);
        h0 = e17 = new e(false, j.a.g0);
        i0 = e16 = new e(false, j.a.i0);
        j0 = e15 = new e(false, j.a.j0);
        k0 = e14 = new e(false, j.a.k0);
        l0 = e13 = new e(false, j.a.l0);
        m0 = e12 = new e(false, j.a.m0);
        n0 = e11 = new e(false, j.a.n0);
        o0 = e10 = new e(false, j.a.o0);
        p0 = e9 = new e(false, j.a.p0);
        q0 = e8 = new e(false, j.a.q0);
        r0 = new e[]{e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8};
    }

    private e(boolean bl, j.a a8) {
        this.q = bl;
        this.c0 = 1 << this.ordinal();
        this.d0 = a8;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])r0.clone();
    }

    @Override
    public boolean d() {
        return this.q;
    }

    @Override
    public int h() {
        return this.c0;
    }

    public j.a j() {
        return this.d0;
    }
}

