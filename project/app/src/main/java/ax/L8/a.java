/*
 * Decompiled with CFR 0.152.
 */
package ax.L8;

import ax.Y8.c;

public final class a
extends Enum<a>
implements c<a> {
    public static final /* enum */ a c0 = new a(32L);
    public static final /* enum */ a d0 = new a(2048L);
    public static final /* enum */ a e0 = new a(16L);
    public static final /* enum */ a f0 = new a(16384L);
    public static final /* enum */ a g0 = new a(2L);
    public static final /* enum */ a h0 = new a(128L);
    public static final /* enum */ a i0 = new a(8192L);
    public static final /* enum */ a j0 = new a(4096L);
    public static final /* enum */ a k0 = new a(1L);
    public static final /* enum */ a l0 = new a(1024L);
    public static final /* enum */ a m0 = new a(512L);
    public static final /* enum */ a n0 = new a(4L);
    public static final /* enum */ a o0 = new a(256L);
    public static final /* enum */ a p0 = new a(32768L);
    public static final /* enum */ a q0 = new a(131072L);
    private static final a[] r0 = a.d();
    private long q;

    private a(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])r0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

