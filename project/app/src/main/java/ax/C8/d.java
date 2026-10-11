/*
 * Decompiled with CFR 0.152.
 */
package ax.C8;

public final class d
extends Enum<d> {
    public static final /* enum */ d c0;
    public static final /* enum */ d d0;
    public static final /* enum */ d e0;
    public static final /* enum */ d f0;
    private static final d[] g0;
    private int q;

    static {
        d d8;
        d d9;
        d d10;
        d d11;
        c0 = d11 = new d(0);
        d0 = d10 = new d(64);
        e0 = d9 = new d(128);
        f0 = d8 = new d(192);
        g0 = new d[]{d11, d10, d9, d8};
    }

    private d(int n9) {
        this.q = n9;
    }

    public static d h(byte by) {
        for (d d8 : d.values()) {
            if (d8.q != (by & 0xC0)) continue;
            return d8;
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])g0.clone();
    }

    public int d() {
        return this.q;
    }
}

