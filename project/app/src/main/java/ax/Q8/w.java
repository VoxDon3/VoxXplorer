/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class w
extends Enum<w>
implements c<w> {
    public static final /* enum */ w c0 = new w(0L);
    public static final /* enum */ w d0 = new w(16L);
    public static final /* enum */ w e0 = new w(32L);
    public static final /* enum */ w f0 = new w(48L);
    public static final /* enum */ w g0 = new w(1L);
    public static final /* enum */ w h0 = new w(2L);
    public static final /* enum */ w i0 = new w(256L);
    public static final /* enum */ w j0 = new w(512L);
    public static final /* enum */ w k0 = new w(1024L);
    public static final /* enum */ w l0 = new w(2048L);
    public static final /* enum */ w m0 = new w(4096L);
    public static final /* enum */ w n0 = new w(8192L);
    public static final /* enum */ w o0 = new w(16384L);
    public static final /* enum */ w p0 = new w(32768L);
    public static final /* enum */ w q0 = new w(262144L);
    private static final w[] r0 = w.d();
    private long q;

    private w(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ w[] d() {
        return new w[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0};
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    public static w[] values() {
        return (w[])r0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

