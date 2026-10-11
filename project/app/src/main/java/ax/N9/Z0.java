/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class Z0
extends Enum<Z0> {
    public static final /* enum */ Z0 c0;
    public static final /* enum */ Z0 d0;
    public static final /* enum */ Z0 e0;
    public static final /* enum */ Z0 f0;
    private static final Z0[] g0;
    public static final /* enum */ Z0 q;

    static {
        q = new Z0();
        c0 = new Z0();
        d0 = new Z0();
        e0 = new Z0();
        f0 = new Z0();
        g0 = Z0.d();
    }

    private static /* synthetic */ Z0[] d() {
        return new Z0[]{q, c0, d0, e0, f0};
    }

    public static Z0 valueOf(String string) {
        return Enum.valueOf(Z0.class, string);
    }

    public static Z0[] values() {
        return (Z0[])g0.clone();
    }
}

