/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.Y8.c;

public final class a
extends Enum<a>
implements c<a> {
    public static final /* enum */ a c0 = new a(0L);
    public static final /* enum */ a d0 = new a(1L);
    public static final /* enum */ a e0 = new a(2L);
    public static final /* enum */ a f0 = new a(3L);
    public static final /* enum */ a g0 = new a(4L);
    public static final /* enum */ a h0 = new a(5L);
    public static final /* enum */ a i0 = new a(6L);
    public static final /* enum */ a j0 = new a(7L);
    public static final /* enum */ a k0 = new a(8L);
    public static final /* enum */ a l0 = new a(9L);
    public static final /* enum */ a m0 = new a(10L);
    private static final a[] n0 = a.d();
    private final long q;

    private a(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])n0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

