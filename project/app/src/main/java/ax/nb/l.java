/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

public abstract class l {
    int a;
    int b;

    static void b(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)(n8 >> 8 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 & 0xFF);
    }

    int a(byte[] byArray, int n8) {
        byArray[n8] = (byte)this.a;
        int n9 = this.b;
        if (n9 > 65535) {
            byArray[n8 + 1] = 1;
        }
        l.b(n9, byArray, n8 + 2);
        return 4;
    }

    abstract int c(byte[] var1, int var2);

    public int d(byte[] byArray, int n8) {
        this.b = this.c(byArray, n8 + 4);
        this.a(byArray, n8);
        return this.b + 4;
    }
}

