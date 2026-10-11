/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class d
extends Enum<d>
implements c<d> {
    public static final /* enum */ d c0 = new d(0L);
    public static final /* enum */ d d0 = new d(1L);
    public static final /* enum */ d e0 = new d(2L);
    public static final /* enum */ d f0 = new d(3L);
    public static final /* enum */ d g0 = new d(4L);
    public static final /* enum */ d h0 = new d(5L);
    private static final d[] i0 = d.d();
    private long q;

    private d(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])i0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

