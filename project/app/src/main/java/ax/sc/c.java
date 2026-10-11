/*
 * Decompiled with CFR 0.152.
 */
package ax.sc;

import ax.oc.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c c0;
    public static final /* enum */ c d0;
    public static final /* enum */ c e0;
    private static final c[] f0;
    private int q;

    static {
        c c8;
        c c9;
        c c10;
        c0 = c10 = new c(0);
        d0 = c9 = new c(8);
        e0 = c8 = new c(99);
        f0 = new c[]{c10, c9, c8};
    }

    private c(int n9) {
        this.q = n9;
    }

    public static c h(int n8) throws a {
        for (c c8 : c.values()) {
            if (c8.d() != n8) continue;
            return c8;
        }
        throw new a("Unknown compression method", a.a.e0);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])f0.clone();
    }

    public int d() {
        return this.q;
    }
}

