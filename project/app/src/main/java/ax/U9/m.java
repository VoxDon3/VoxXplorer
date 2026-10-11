/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public final class m
extends Enum<m> {
    public static final /* enum */ m c0;
    public static final /* enum */ m d0;
    public static final /* enum */ m e0;
    public static final /* enum */ m f0;
    public static final /* enum */ m g0;
    private static final m[] h0;
    public static final /* enum */ m q;

    static {
        q = new m();
        c0 = new m();
        d0 = new m();
        e0 = new m();
        f0 = new m();
        g0 = new m();
        h0 = m.d();
    }

    private static /* synthetic */ m[] d() {
        return new m[]{q, c0, d0, e0, f0, g0};
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])h0.clone();
    }
}

