/*
 * Decompiled with CFR 0.152.
 */
package ax.L8;

import ax.Y8.c;

public final class d
extends Enum<d>
implements c<d> {
    public static final /* enum */ d c0 = new d(1L);
    public static final /* enum */ d d0 = new d(2L);
    public static final /* enum */ d e0 = new d(3L);
    public static final /* enum */ d f0 = new d(4L);
    public static final /* enum */ d g0 = new d(5L);
    public static final /* enum */ d h0 = new d(6L);
    public static final /* enum */ d i0 = new d(7L);
    public static final /* enum */ d j0 = new d(8L);
    public static final /* enum */ d k0 = new d(9L);
    public static final /* enum */ d l0 = new d(10L);
    public static final /* enum */ d m0 = new d(11L);
    private static final d[] n0 = d.d();
    private long q;

    private d(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])n0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

