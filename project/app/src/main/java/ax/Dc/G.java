/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

public final class G
extends Enum<G> {
    public static final /* enum */ G c0;
    public static final /* enum */ G d0;
    public static final /* enum */ G e0;
    private static final G[] f0;
    public static final /* enum */ G q;

    static {
        G g8;
        G g9;
        G g10;
        G g11;
        q = g11 = new G();
        c0 = g10 = new G();
        d0 = g9 = new G();
        e0 = g8 = new G();
        f0 = new G[]{g11, g10, g9, g8};
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    public static G[] values() {
        return (G[])f0.clone();
    }
}

