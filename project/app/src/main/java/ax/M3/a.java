/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    public static final /* enum */ a e0;
    public static final /* enum */ a f0;
    private static final a[] g0;
    public static final /* enum */ a q;

    static {
        a a8;
        a a9;
        a a10;
        a a11;
        a a12;
        q = a12 = new a();
        c0 = a11 = new a();
        d0 = a10 = new a();
        e0 = a9 = new a();
        f0 = a8 = new a();
        g0 = new a[]{a12, a11, a10, a9, a8};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])g0.clone();
    }
}

