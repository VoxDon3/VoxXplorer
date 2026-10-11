/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class w
extends Enum<w> {
    public static final /* enum */ w c0;
    public static final /* enum */ w d0;
    public static final /* enum */ w e0;
    public static final /* enum */ w f0;
    private static final w[] g0;
    public static final /* enum */ w q;

    static {
        q = new w();
        c0 = new w();
        d0 = new w();
        e0 = new w();
        f0 = new w();
        g0 = w.d();
    }

    private static /* synthetic */ w[] d() {
        return new w[]{q, c0, d0, e0, f0};
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    public static w[] values() {
        return (w[])g0.clone();
    }
}

