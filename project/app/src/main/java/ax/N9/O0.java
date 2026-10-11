/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class O0
extends Enum<O0> {
    public static final /* enum */ O0 c0;
    public static final /* enum */ O0 d0;
    public static final /* enum */ O0 e0;
    private static final O0[] f0;
    public static final /* enum */ O0 q;

    static {
        q = new O0();
        c0 = new O0();
        d0 = new O0();
        e0 = new O0();
        f0 = O0.d();
    }

    private static /* synthetic */ O0[] d() {
        return new O0[]{q, c0, d0, e0};
    }

    public static O0 valueOf(String string) {
        return Enum.valueOf(O0.class, string);
    }

    public static O0[] values() {
        return (O0[])f0.clone();
    }
}

