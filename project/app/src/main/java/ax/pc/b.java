/*
 * Decompiled with CFR 0.152.
 */
package ax.pc;

public final class b
extends Enum<b> {
    public static final /* enum */ b c0;
    public static final /* enum */ b d0;
    public static final /* enum */ b e0;
    public static final /* enum */ b f0;
    public static final /* enum */ b g0;
    public static final /* enum */ b h0;
    public static final /* enum */ b i0;
    public static final /* enum */ b j0;
    public static final /* enum */ b k0;
    public static final /* enum */ b l0;
    public static final /* enum */ b m0;
    public static final /* enum */ b n0;
    private static final b[] o0;
    private long q;

    static {
        b b8;
        b b9;
        b b10;
        b b11;
        b b12;
        b b13;
        b b14;
        b b15;
        b b16;
        b b17;
        b b18;
        b b19;
        c0 = b19 = new b(67324752L);
        d0 = b18 = new b(134695760L);
        e0 = b17 = new b(33639248L);
        f0 = b16 = new b(101010256L);
        g0 = b15 = new b(808471376L);
        h0 = b14 = new b(84233040L);
        i0 = b13 = new b(134630224L);
        j0 = b12 = new b(134695760L);
        k0 = b11 = new b(117853008L);
        l0 = b10 = new b(101075792L);
        m0 = b9 = new b(1L);
        n0 = b8 = new b(39169L);
        o0 = new b[]{b19, b18, b17, b16, b15, b14, b13, b12, b11, b10, b9, b8};
    }

    private b(long l8) {
        this.q = l8;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])o0.clone();
    }

    public long d() {
        return this.q;
    }
}

