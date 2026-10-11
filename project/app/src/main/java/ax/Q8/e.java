/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class e
extends Enum<e>
implements c<e> {
    public static final /* enum */ e c0 = new e(1L);
    public static final /* enum */ e d0 = new e(2L);
    public static final /* enum */ e e0 = new e(4L);
    public static final /* enum */ e f0 = new e(8L);
    @Deprecated
    public static final /* enum */ e g0 = new e(16L);
    @Deprecated
    public static final /* enum */ e h0 = new e(32L);
    public static final /* enum */ e i0 = new e(64L);
    @Deprecated
    public static final /* enum */ e j0 = new e(256L);
    public static final /* enum */ e k0 = new e(512L);
    public static final /* enum */ e l0 = new e(2048L);
    public static final /* enum */ e m0 = new e(4096L);
    @Deprecated
    public static final /* enum */ e n0 = new e(8192L);
    public static final /* enum */ e o0 = new e(16384L);
    public static final /* enum */ e p0 = new e(32768L);
    @Deprecated
    public static final /* enum */ e q0 = new e(1024L);
    @Deprecated
    public static final /* enum */ e r0 = new e(65536L);
    @Deprecated
    public static final /* enum */ e s0 = new e(131072L);
    @Deprecated
    public static final /* enum */ e t0 = new e(0x100000L);
    public static final /* enum */ e u0 = new e(0x200000L);
    public static final /* enum */ e v0 = new e(0x400000L);
    @Deprecated
    public static final /* enum */ e w0 = new e(0x800000L);
    private static final e[] x0 = e.d();
    private long q;

    private e(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ e[] d() {
        return new e[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])x0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

