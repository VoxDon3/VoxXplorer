/*
 * Decompiled with CFR 0.152.
 */
package ax.J8;

import ax.Y8.c;

public final class a
extends Enum<a>
implements c<a> {
    public static final /* enum */ a A0;
    public static final /* enum */ a B0;
    public static final /* enum */ a C0;
    public static final /* enum */ a D0;
    public static final /* enum */ a E0;
    public static final /* enum */ a F0;
    private static final a[] G0;
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    public static final /* enum */ a e0;
    public static final /* enum */ a f0;
    public static final /* enum */ a g0;
    public static final /* enum */ a h0;
    public static final /* enum */ a i0;
    public static final /* enum */ a j0;
    public static final /* enum */ a k0;
    public static final /* enum */ a l0;
    public static final /* enum */ a m0;
    public static final /* enum */ a n0;
    public static final /* enum */ a o0;
    public static final /* enum */ a p0;
    public static final /* enum */ a q0;
    public static final /* enum */ a r0;
    public static final /* enum */ a s0;
    public static final /* enum */ a t0;
    public static final /* enum */ a u0;
    public static final /* enum */ a v0;
    public static final /* enum */ a w0;
    public static final /* enum */ a x0;
    public static final /* enum */ a y0;
    public static final /* enum */ a z0;
    private long q;

    static {
        c0 = new a(1L);
        d0 = new a(2L);
        e0 = new a(4L);
        f0 = new a(32L);
        g0 = new a(1L);
        h0 = new a(2L);
        i0 = new a(4L);
        j0 = new a(32L);
        k0 = new a(64L);
        l0 = new a(128L);
        m0 = new a(256L);
        n0 = new a(8L);
        o0 = new a(16L);
        p0 = new a(65536L);
        q0 = new a(131072L);
        r0 = new a(262144L);
        s0 = new a(524288L);
        t0 = new a(0x100000L);
        u0 = new a(0x1000000L);
        v0 = new a(0x2000000L);
        w0 = new a(0x10000000L);
        x0 = new a(0x20000000L);
        y0 = new a(0x40000000L);
        z0 = new a(0x80000000L);
        A0 = new a(256L);
        B0 = new a(1L);
        C0 = new a(2L);
        D0 = new a(16L);
        E0 = new a(32L);
        F0 = new a(8L);
        G0 = a.d();
    }

    private a(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])G0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

