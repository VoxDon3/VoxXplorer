/*
 * Decompiled with CFR 0.152.
 */
package ax.Lc;

import ax.Lc.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c d0 = new c("Sensitive", true);
    public static final /* enum */ c e0 = new c("Insensitive", false);
    public static final /* enum */ c f0 = new c("System", a.j().p());
    private static final c[] g0 = c.d();
    private final transient boolean c0;
    private final String q;

    private c(String string2, boolean bl) {
        this.q = string2;
        this.c0 = bl;
    }

    private static /* synthetic */ c[] d() {
        return new c[]{d0, e0, f0};
    }

    public static c l(c c8, c c9) {
        if (c8 != null) {
            return c8;
        }
        return c9;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])g0.clone();
    }

    public int h(String string, int n8, String string2) {
        int n9;
        if (string != null && string2 != null && (n9 = string.length() - string2.length()) >= n8) {
            while (n8 <= n9) {
                if (this.j(string, n8, string2)) {
                    return n8;
                }
                ++n8;
            }
        }
        return -1;
    }

    public boolean j(String string, int n8, String string2) {
        return string != null && string2 != null && string.regionMatches(this.c0 ^ true, n8, string2, 0, string2.length());
    }

    public String toString() {
        return this.q;
    }
}

