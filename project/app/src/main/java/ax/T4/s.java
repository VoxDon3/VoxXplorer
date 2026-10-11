/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.j;
import ax.b5.g;

public final class s
extends Enum<s>
implements g {
    public static final /* enum */ s e0;
    public static final /* enum */ s f0;
    public static final /* enum */ s g0;
    public static final /* enum */ s h0;
    public static final /* enum */ s i0;
    public static final /* enum */ s j0;
    private static final s[] k0;
    private final int c0;
    private final j.a d0;
    private final boolean q;

    static {
        s s8;
        s s9;
        s s10;
        s s11;
        s s12;
        s s13;
        e0 = s13 = new s(j.a.d0);
        f0 = s12 = new s(j.a.r0);
        g0 = s11 = new s(j.a.s0);
        h0 = s10 = new s(j.a.t0);
        i0 = s9 = new s(j.a.u0);
        j0 = s8 = new s(j.a.v0);
        k0 = new s[]{s13, s12, s11, s10, s9, s8};
    }

    private s(j.a a8) {
        this.d0 = a8;
        this.c0 = a8.l();
        this.q = a8.h();
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    public static s[] values() {
        return (s[])k0.clone();
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

