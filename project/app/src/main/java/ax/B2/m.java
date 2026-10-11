/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

public final class m
extends Enum<m> {
    public static final /* enum */ m c0;
    private static final m[] d0;
    public static final /* enum */ m q;

    static {
        q = new m();
        c0 = new m();
        d0 = m.d();
    }

    private static final /* synthetic */ m[] d() {
        return new m[]{q, c0};
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])d0.clone();
    }
}

