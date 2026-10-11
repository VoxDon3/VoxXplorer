/*
 * Decompiled with CFR 0.152.
 */
package ax.L8;

public final class c
extends Enum<c>
implements ax.Y8.c<c> {
    public static final /* enum */ c c0 = new c(1L);
    public static final /* enum */ c d0 = new c(2L);
    public static final /* enum */ c e0 = new c(3L);
    public static final /* enum */ c f0 = new c(4L);
    public static final /* enum */ c g0 = new c(5L);
    public static final /* enum */ c h0 = new c(6L);
    public static final /* enum */ c i0 = new c(7L);
    public static final /* enum */ c j0 = new c(8L);
    public static final /* enum */ c k0 = new c(9L);
    public static final /* enum */ c l0 = new c(10L);
    public static final /* enum */ c m0 = new c(11L);
    private static final c[] n0 = c.d();
    private long q;

    private c(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ c[] d() {
        return new c[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])n0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

