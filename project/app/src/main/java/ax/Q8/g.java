/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import java.util.Set;

public final class g
extends Enum<g> {
    public static final /* enum */ g c0 = new g(0);
    public static final /* enum */ g d0 = new g(514);
    public static final /* enum */ g e0 = new g(528);
    public static final /* enum */ g f0 = new g(767);
    public static final /* enum */ g g0 = new g(768);
    public static final /* enum */ g h0 = new g(770);
    public static final /* enum */ g i0 = new g(785);
    private static final g[] j0 = g.d();
    private int q;

    private g(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ g[] d() {
        return new g[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static g l(int n8) {
        for (g g8 : g.values()) {
            if (g8.h() != n8) continue;
            return g8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown SMB2 Dialect: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static boolean n(Set<g> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (!((g)((Object)object.next())).j()) continue;
            return true;
        }
        return false;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])j0.clone();
    }

    public int h() {
        return this.q;
    }

    public boolean j() {
        return this == g0 || this == h0 || this == i0;
        {
        }
    }
}

