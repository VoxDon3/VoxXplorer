/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

public final class m
extends Enum<m> {
    public static final /* enum */ m k0;
    public static final /* enum */ m l0;
    public static final /* enum */ m m0;
    public static final /* enum */ m n0;
    public static final /* enum */ m o0;
    public static final /* enum */ m p0;
    public static final /* enum */ m q0;
    public static final /* enum */ m r0;
    public static final /* enum */ m s0;
    public static final /* enum */ m t0;
    public static final /* enum */ m u0;
    public static final /* enum */ m v0;
    public static final /* enum */ m w0;
    private static final m[] x0;
    final char[] c0;
    final byte[] d0;
    final int e0;
    final boolean f0;
    final boolean g0;
    final boolean h0;
    final boolean i0;
    final boolean j0;
    final String q;

    static {
        m m8;
        m m9;
        m m10;
        m m11;
        m m12;
        m m13;
        m m14;
        m m15;
        m m16;
        m m17;
        m m18;
        m m19;
        m m20;
        k0 = m20 = new m(null, -1);
        l0 = m19 = new m("{", 1);
        m0 = m18 = new m("}", 2);
        n0 = m17 = new m("[", 3);
        o0 = m16 = new m("]", 4);
        p0 = m15 = new m(null, 5);
        q0 = m14 = new m(null, 12);
        r0 = m13 = new m(null, 6);
        s0 = m12 = new m(null, 7);
        t0 = m11 = new m(null, 8);
        u0 = m10 = new m("true", 9);
        v0 = m9 = new m("false", 10);
        w0 = m8 = new m("null", 11);
        x0 = new m[]{m20, m19, m18, m17, m16, m15, m14, m13, m12, m11, m10, m9, m8};
    }

    private m(String string, int n9) {
        boolean bl = false;
        if (string == null) {
            this.q = null;
            this.c0 = null;
            this.d0 = null;
        } else {
            this.q = string;
            object = string.toCharArray();
            this.c0 = (char[])object;
            int n10 = ((Object)object).length;
            this.d0 = new byte[n10];
            for (n8 = 0; n8 < n10; ++n8) {
                this.d0[n8] = (byte)this.c0[n8];
            }
        }
        this.e0 = n9;
        boolean bl2 = n9 == 10 || n9 == 9;
        this.i0 = bl2;
        bl2 = n9 == 7 || n9 == 8;
        this.h0 = bl2;
        bl2 = n9 == 1 || n9 == 3;
        this.f0 = bl2;
        boolean bl3 = n9 == 2 || n9 == 4;
        this.g0 = bl3;
        boolean bl4 = bl;
        if (!bl2) {
            bl4 = bl;
            if (!bl3) {
                bl4 = bl;
                if (n9 != 5) {
                    bl4 = bl;
                    if (n9 != -1) {
                        bl4 = true;
                    }
                }
            }
        }
        this.j0 = bl4;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])x0.clone();
    }

    public final String d() {
        return this.q;
    }

    public final int h() {
        return this.e0;
    }

    public final boolean j() {
        return this.j0;
    }

    public final boolean l() {
        return this.g0;
    }

    public final boolean n() {
        return this.f0;
    }
}

