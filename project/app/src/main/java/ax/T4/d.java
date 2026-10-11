/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

public final class d
extends Enum<d> {
    public static final /* enum */ d e0;
    public static final /* enum */ d f0;
    public static final /* enum */ d g0;
    public static final /* enum */ d h0;
    public static final /* enum */ d i0;
    private static final d[] j0;
    private final boolean c0;
    private final int d0;
    private final String q;

    static {
        d d8;
        d d9;
        d d10;
        d d11;
        d d12;
        e0 = d12 = new d("UTF-8", false, 8);
        f0 = d11 = new d("UTF-16BE", true, 16);
        g0 = d10 = new d("UTF-16LE", false, 16);
        h0 = d9 = new d("UTF-32BE", true, 32);
        i0 = d8 = new d("UTF-32LE", false, 32);
        j0 = new d[]{d12, d11, d10, d9, d8};
    }

    private d(String string2, boolean bl, int n9) {
        this.q = string2;
        this.c0 = bl;
        this.d0 = n9;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])j0.clone();
    }

    public int d() {
        return this.d0;
    }

    public String h() {
        return this.q;
    }

    public boolean j() {
        return this.c0;
    }
}

