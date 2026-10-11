/*
 * Decompiled with CFR 0.152.
 */
package ax.Wd;

public class k {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;

    public k(int n8, int n9, int n10, int n11, int[] nArray) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = (int[])nArray.clone();
    }

    public static int a(int n8, int n9) {
        return n8 | n9 << 16;
    }

    public static int b(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        return k.c(n8 | n9 << 4, n11 << 4 | n10, n13 << 4 | n12, n15 << 4 | n14);
    }

    public static int c(int n8, int n9, int n10, int n11) {
        return k.a(n8 | n9 << 8, n11 << 8 | n10);
    }

    public int d(int n8) {
        return this.e[n8 >> this.a] >> ((n8 & this.b) << this.c) & this.d;
    }
}

