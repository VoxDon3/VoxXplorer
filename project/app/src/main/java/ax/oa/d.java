/*
 * Decompiled with CFR 0.152.
 */
package ax.oa;

import ax.Y8.c;

public final class d
extends Enum<d>
implements c<d> {
    public static final /* enum */ d c0 = new d(0);
    public static final /* enum */ d d0 = new d(1);
    public static final /* enum */ d e0 = new d(2);
    public static final /* enum */ d f0 = new d(3);
    public static final /* enum */ d g0 = new d(4);
    public static final /* enum */ d h0 = new d(5);
    public static final /* enum */ d i0 = new d(6);
    public static final /* enum */ d j0 = new d(7);
    public static final /* enum */ d k0 = new d(8);
    public static final /* enum */ d l0 = new d(9);
    public static final /* enum */ d m0 = new d(10);
    public static final /* enum */ d n0 = new d(11);
    public static final /* enum */ d o0 = new d(12);
    public static final /* enum */ d p0 = new d(13);
    public static final /* enum */ d q0 = new d(14);
    public static final /* enum */ d r0 = new d(15);
    public static final /* enum */ d s0 = new d(17);
    public static final /* enum */ d t0 = new d(18);
    public static final /* enum */ d u0 = new d(19);
    private static final d[] v0 = d.d();
    private final int q;

    private d(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])v0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

