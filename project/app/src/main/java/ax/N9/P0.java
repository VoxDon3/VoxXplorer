/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class P0
extends Enum<P0> {
    public static final /* enum */ P0 c0;
    public static final /* enum */ P0 d0;
    private static final P0[] e0;
    public static final /* enum */ P0 q;

    static {
        q = new P0();
        c0 = new P0();
        d0 = new P0();
        e0 = P0.d();
    }

    private static /* synthetic */ P0[] d() {
        return new P0[]{q, c0, d0};
    }

    public static P0 valueOf(String string) {
        return Enum.valueOf(P0.class, string);
    }

    public static P0[] values() {
        return (P0[])e0.clone();
    }
}

