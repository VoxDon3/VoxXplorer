/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class a1
extends Enum<a1> {
    public static final /* enum */ a1 c0;
    public static final /* enum */ a1 d0;
    public static final /* enum */ a1 e0;
    public static final /* enum */ a1 f0;
    public static final /* enum */ a1 g0;
    private static final a1[] h0;
    public static final /* enum */ a1 q;

    static {
        q = new a1();
        c0 = new a1();
        d0 = new a1();
        e0 = new a1();
        f0 = new a1();
        g0 = new a1();
        h0 = a1.d();
    }

    private static /* synthetic */ a1[] d() {
        return new a1[]{q, c0, d0, e0, f0, g0};
    }

    public static a1 valueOf(String string) {
        return Enum.valueOf(a1.class, string);
    }

    public static a1[] values() {
        return (a1[])h0.clone();
    }
}

