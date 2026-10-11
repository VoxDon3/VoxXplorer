/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import ax.zb.a;
import ax.zb.b;

public final class g
extends Enum<g> {
    public static final /* enum */ g c0 = new g("oauth2:");
    public static final /* enum */ g d0 = new g("oauth2code:");
    private static final g[] e0;
    private static final a f0;
    private final String q;

    static {
        Enum[] enumArray = g.d();
        e0 = enumArray;
        f0 = b.a((Enum[])enumArray);
    }

    private g(String string2) {
        this.q = string2;
    }

    private static final /* synthetic */ g[] d() {
        return new g[]{c0, d0};
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])e0.clone();
    }

    public String toString() {
        return this.q;
    }
}

