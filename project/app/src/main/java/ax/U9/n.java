/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public final class n
extends Enum<n> {
    public static final /* enum */ n c0;
    public static final /* enum */ n d0;
    public static final /* enum */ n e0;
    private static final n[] f0;
    public static final /* enum */ n q;

    static {
        q = new n();
        c0 = new n();
        d0 = new n();
        e0 = new n();
        f0 = n.d();
    }

    private static /* synthetic */ n[] d() {
        return new n[]{q, c0, d0, e0};
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public static n[] values() {
        return (n[])f0.clone();
    }
}

