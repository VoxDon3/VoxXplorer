/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import java.util.Arrays;

public final class p
extends Enum<p> {
    public static final /* enum */ p c0;
    public static final /* enum */ p d0;
    public static final /* enum */ p e0;
    public static final /* enum */ p f0;
    public static final /* enum */ p g0;
    public static final /* enum */ p h0;
    public static final /* enum */ p i0;
    public static final /* enum */ p j0;
    public static final /* enum */ p k0;
    public static final /* enum */ p l0;
    public static final /* enum */ p m0;
    public static final /* enum */ p n0;
    public static final /* enum */ p o0;
    public static final /* enum */ p p0;
    private static final p[] q0;
    private final byte[] q;

    static {
        p p8;
        p p9;
        p p10;
        p p11;
        p p12;
        p p13;
        p p14;
        p p15;
        p p16;
        p p17;
        p p18;
        p p19;
        p p20;
        p p21;
        c0 = p21 = new p(new byte[]{0});
        d0 = p20 = new p(new byte[]{3, 1, 1});
        e0 = p19 = new p(new byte[]{33});
        f0 = p18 = new p(new byte[]{4, 1, 8});
        g0 = p17 = new p(new byte[]{4, 1, 9});
        h0 = p16 = new p(new byte[]{4, 2, 2});
        i0 = p15 = new p(new byte[]{6, -15, 7, 1});
        j0 = p14 = new p(new byte[]{3, 3, 1, 3});
        k0 = p13 = new p(new byte[]{3, 3, 2, 5});
        l0 = p12 = new p(new byte[]{3, 3, 4, 1});
        m0 = p11 = new p(new byte[]{3, 3, 5, 1});
        n0 = p10 = new p(new byte[]{3, 3, 7, 1});
        o0 = p9 = new p(new byte[]{3, 3, 8, 5});
        p0 = p8 = new p(new byte[]{3});
        q0 = new p[]{p21, p20, p19, p18, p17, p16, p15, p14, p13, p12, p11, p10, p9, p8};
    }

    private p(byte[] byArray) {
        this.q = byArray;
    }

    static p d(byte[] byArray) {
        for (p p8 : (p[])p.class.getEnumConstants()) {
            if (!Arrays.equals(p8.q, byArray)) continue;
            return p8;
        }
        return null;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    public static p[] values() {
        return (p[])q0.clone();
    }

    byte[] h() {
        byte[] byArray = this.q;
        int n8 = byArray.length;
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, 0, byArray2, 0, n8);
        return byArray2;
    }
}

