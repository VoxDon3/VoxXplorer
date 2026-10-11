/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    private static final a[] d0;
    public static final /* enum */ a q;

    static {
        q = new a();
        c0 = new a();
        d0 = a.d();
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{q, c0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])d0.clone();
    }
}

