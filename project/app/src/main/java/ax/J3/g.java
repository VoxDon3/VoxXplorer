/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

public final class g
extends Enum<g> {
    public static final /* enum */ g c0;
    public static final /* enum */ g d0;
    public static final /* enum */ g e0;
    private static final g[] f0;
    public static final /* enum */ g q;

    static {
        g g8;
        g g9;
        g g10;
        g g11;
        q = g11 = new g();
        c0 = g10 = new g();
        d0 = g9 = new g();
        e0 = g8 = new g();
        f0 = new g[]{g11, g10, g9, g8};
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])f0.clone();
    }
}

