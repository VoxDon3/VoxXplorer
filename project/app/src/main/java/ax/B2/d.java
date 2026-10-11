/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

public final class d
extends Enum<d> {
    public static final /* enum */ d c0;
    public static final /* enum */ d d0;
    public static final /* enum */ d e0;
    private static final d[] f0;
    public static final /* enum */ d q;

    static {
        q = new d();
        c0 = new d();
        d0 = new d();
        e0 = new d();
        f0 = d.d();
    }

    private static final /* synthetic */ d[] d() {
        return new d[]{q, c0, d0, e0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])f0.clone();
    }
}

