/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class X0
extends Enum<X0> {
    public static final /* enum */ X0 c0;
    public static final /* enum */ X0 d0;
    public static final /* enum */ X0 e0;
    private static final X0[] f0;
    public static final /* enum */ X0 q;

    static {
        q = new X0();
        c0 = new X0();
        d0 = new X0();
        e0 = new X0();
        f0 = X0.d();
    }

    private static /* synthetic */ X0[] d() {
        return new X0[]{q, c0, d0, e0};
    }

    public static X0 valueOf(String string) {
        return Enum.valueOf(X0.class, string);
    }

    public static X0[] values() {
        return (X0[])f0.clone();
    }
}

