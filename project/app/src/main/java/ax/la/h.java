/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

public final class h
extends Enum<h> {
    public static final /* enum */ h c0 = new h(0);
    public static final /* enum */ h d0 = new h(1);
    public static final /* enum */ h e0 = new h(2);
    public static final /* enum */ h f0 = new h(3);
    private static final h[] g0 = h.d();
    protected final int q;

    private h(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ h[] d() {
        return new h[]{c0, d0, e0, f0};
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])g0.clone();
    }
}

