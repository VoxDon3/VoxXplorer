/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    public static final /* enum */ a e0;
    private static final a[] f0;
    public static final /* enum */ a q;

    static {
        q = new a();
        c0 = new a();
        d0 = new a();
        e0 = new a();
        f0 = a.d();
    }

    private static /* synthetic */ a[] d() {
        return new a[]{q, c0, d0, e0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])f0.clone();
    }
}

