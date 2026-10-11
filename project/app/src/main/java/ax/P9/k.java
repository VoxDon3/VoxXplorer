/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

public final class k
extends Enum<k> {
    public static final /* enum */ k c0;
    public static final /* enum */ k d0;
    public static final /* enum */ k e0;
    public static final /* enum */ k f0;
    private static final k[] g0;
    public static final /* enum */ k q;

    static {
        q = new k();
        c0 = new k();
        d0 = new k();
        e0 = new k();
        f0 = new k();
        g0 = k.d();
    }

    private static /* synthetic */ k[] d() {
        return new k[]{q, c0, d0, e0, f0};
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public static k[] values() {
        return (k[])g0.clone();
    }
}

