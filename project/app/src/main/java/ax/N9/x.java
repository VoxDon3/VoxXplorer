/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class x
extends Enum<x> {
    public static final /* enum */ x c0;
    public static final /* enum */ x d0;
    public static final /* enum */ x e0;
    private static final x[] f0;
    public static final /* enum */ x q;

    static {
        q = new x();
        c0 = new x();
        d0 = new x();
        e0 = new x();
        f0 = x.d();
    }

    private static /* synthetic */ x[] d() {
        return new x[]{q, c0, d0, e0};
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    public static x[] values() {
        return (x[])f0.clone();
    }
}

