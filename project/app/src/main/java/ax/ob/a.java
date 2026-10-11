/*
 * Decompiled with CFR 0.152.
 */
package ax.ob;

public abstract class a {
    protected static final byte[] b = new byte[]{78, 84, 76, 77, 83, 83, 80, 0};
    private static final String c = ax.jb.a.c;
    private int a;

    static String b() {
        return c;
    }

    static byte[] c(byte[] byArray, int n8) {
        int n9 = ax.ob.a.e(byArray, n8);
        n8 = ax.ob.a.d(byArray, n8 + 4);
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        return byArray2;
    }

    static int d(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    static int e(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF;
    }

    static void g(byte[] byArray, int n8, int n9, byte[] byArray2) {
        int n10 = byArray2 != null ? byArray2.length : 0;
        if (n10 == 0) {
            return;
        }
        ax.ob.a.i(byArray, n8, n10);
        ax.ob.a.i(byArray, n8 + 2, n10);
        ax.ob.a.h(byArray, n8 + 4, n9);
        System.arraycopy(byArray2, 0, byArray, n9, n10);
    }

    static void h(byte[] byArray, int n8, int n9) {
        byArray[n8] = (byte)(n9 & 0xFF);
        byArray[n8 + 1] = (byte)(n9 >> 8 & 0xFF);
        byArray[n8 + 2] = (byte)(n9 >> 16 & 0xFF);
        byArray[n8 + 3] = (byte)(n9 >> 24 & 0xFF);
    }

    static void i(byte[] byArray, int n8, int n9) {
        byArray[n8] = (byte)(n9 & 0xFF);
        byArray[n8 + 1] = (byte)(n9 >> 8 & 0xFF);
    }

    public int a() {
        return this.a;
    }

    public void f(int n8) {
        this.a = n8;
    }
}

