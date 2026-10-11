/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

public final class r
extends Enum<r> {
    public static final /* enum */ r c0;
    public static final /* enum */ r d0;
    public static final /* enum */ r e0;
    public static final /* enum */ r f0;
    public static final /* enum */ r g0;
    private static final r[] h0;
    public static final /* enum */ r q;

    static {
        q = new r();
        c0 = new r();
        d0 = new r();
        e0 = new r();
        f0 = new r();
        g0 = new r();
        h0 = r.d();
    }

    private static /* synthetic */ r[] d() {
        return new r[]{q, c0, d0, e0, f0, g0};
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    public static r[] values() {
        return (r[])h0.clone();
    }

    public boolean h() {
        return this == d0 || this == e0 || this == g0;
        {
        }
    }
}

