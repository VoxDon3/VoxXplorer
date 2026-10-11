/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

final class g4
extends Enum<g4> {
    public static final /* enum */ g4 c0;
    public static final /* enum */ g4 d0;
    public static final /* enum */ g4 e0;
    private static final g4[] f0;
    public static final /* enum */ g4 q;

    static {
        g4 g42;
        g4 g43;
        g4 g44;
        g4 g45;
        q = g45 = new g4(false);
        c0 = g44 = new g4(true);
        d0 = g43 = new g4(true);
        e0 = g42 = new g4(false);
        f0 = new g4[]{g45, g44, g43, g42};
    }

    private g4(boolean bl) {
    }

    public static g4[] values() {
        return (g4[])f0.clone();
    }
}

