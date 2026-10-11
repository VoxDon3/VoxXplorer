/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

public final class m
extends Enum<m> {
    public static final /* enum */ m c0 = new m(0);
    public static final /* enum */ m d0 = new m(1);
    public static final /* enum */ m e0 = new m(2);
    public static final /* enum */ m f0 = new m(3);
    public static final /* enum */ m g0 = new m(4);
    public static final /* enum */ m h0 = new m(5);
    public static final /* enum */ m i0 = new m(6);
    public static final /* enum */ m j0 = new m(7);
    public static final /* enum */ m k0 = new m(8);
    public static final /* enum */ m l0 = new m(9);
    public static final /* enum */ m m0 = new m(10);
    public static final /* enum */ m n0 = new m(11);
    public static final /* enum */ m o0 = new m(12);
    public static final /* enum */ m p0 = new m(13);
    public static final /* enum */ m q0 = new m(14);
    public static final /* enum */ m r0 = new m(15);
    public static final /* enum */ m s0 = new m(16);
    public static final /* enum */ m t0 = new m(17);
    public static final /* enum */ m u0 = new m(18);
    private static final m[] v0;
    private static final m[] w0;
    private int q;

    static {
        w0 = m.d();
        v0 = new m[19];
        m[] mArray = m.values();
        int n8 = mArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            m m8;
            m.v0[m8.h()] = m8 = mArray[i8];
        }
    }

    private m(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ m[] d() {
        return new m[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0};
    }

    public static m j(int n8) {
        return v0[n8];
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])w0.clone();
    }

    public int h() {
        return this.q;
    }
}

