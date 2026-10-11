/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

public final class r
extends Enum<r> {
    public static final /* enum */ r c0;
    public static final /* enum */ r d0;
    private static final r[] e0;
    public static final /* enum */ r q;

    static {
        q = new r();
        c0 = new r();
        d0 = new r();
        e0 = r.d();
    }

    private static /* synthetic */ r[] d() {
        return new r[]{q, c0, d0};
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    public static r[] values() {
        return (r[])e0.clone();
    }
}

