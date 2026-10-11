/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

public final class g
extends Enum<g> {
    public static final /* enum */ g c0;
    private static final g[] d0;
    public static final /* enum */ g q;

    static {
        q = new g();
        c0 = new g();
        d0 = g.d();
    }

    private static /* synthetic */ g[] d() {
        return new g[]{q, c0};
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])d0.clone();
    }
}

