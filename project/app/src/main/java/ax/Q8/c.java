/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

public final class c
extends Enum<c>
implements ax.Y8.c<c> {
    public static final /* enum */ c c0 = new c(0L);
    public static final /* enum */ c d0 = new c(1L);
    public static final /* enum */ c e0 = new c(2L);
    public static final /* enum */ c f0 = new c(3L);
    private static final c[] g0 = c.d();
    private long q;

    private c(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ c[] d() {
        return new c[]{c0, d0, e0, f0};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])g0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

