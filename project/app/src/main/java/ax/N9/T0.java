/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class T0
extends Enum<T0> {
    public static final /* enum */ T0 c0;
    public static final /* enum */ T0 d0;
    public static final /* enum */ T0 e0;
    public static final /* enum */ T0 f0;
    private static final T0[] g0;
    public static final /* enum */ T0 q;

    static {
        q = new T0();
        c0 = new T0();
        d0 = new T0();
        e0 = new T0();
        f0 = new T0();
        g0 = T0.d();
    }

    private static /* synthetic */ T0[] d() {
        return new T0[]{q, c0, d0, e0, f0};
    }

    public static T0 valueOf(String string) {
        return Enum.valueOf(T0.class, string);
    }

    public static T0[] values() {
        return (T0[])g0.clone();
    }
}

