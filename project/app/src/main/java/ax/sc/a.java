/*
 * Decompiled with CFR 0.152.
 */
package ax.sc;

public final class a
extends Enum<a> {
    public static final /* enum */ a f0;
    public static final /* enum */ a g0;
    public static final /* enum */ a h0;
    private static final a[] i0;
    private int c0;
    private int d0;
    private int e0;
    private int q;

    static {
        a a8;
        a a9;
        a a10;
        f0 = a10 = new a(1, 8, 16, 16);
        g0 = a9 = new a(2, 12, 24, 24);
        h0 = a8 = new a(3, 16, 32, 32);
        i0 = new a[]{a10, a9, a8};
    }

    private a(int n9, int n10, int n11, int n12) {
        this.q = n9;
        this.c0 = n10;
        this.d0 = n11;
        this.e0 = n12;
    }

    public static a d(int n8) {
        for (a a8 : a.values()) {
            if (a8.l() != n8) continue;
            return a8;
        }
        return null;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])i0.clone();
    }

    public int h() {
        return this.e0;
    }

    public int j() {
        return this.d0;
    }

    public int l() {
        return this.q;
    }

    public int n() {
        return this.c0;
    }
}

