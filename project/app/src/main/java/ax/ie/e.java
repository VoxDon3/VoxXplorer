/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.ie.a;
import java.io.IOException;

public abstract class e
extends a {
    private static final int[] e = new int[128];
    private long a;
    private int b;
    long c;
    private byte d;

    static {
        for (int i8 = 8; i8 < 2048; i8 += 16) {
            int n8 = i8;
            int n9 = 0;
            for (int i9 = 0; i9 < 4; ++i9) {
                n8 *= n8;
                n9 <<= 1;
                while ((0xFFFF0000 & n8) != 0) {
                    n8 >>>= 1;
                    ++n9;
                }
            }
            ax.ie.e.e[i8 >> 4] = 161 - n9;
        }
    }

    public static int g(int n8, int n9) {
        return e[(n8 ^ -n9 & 0x7FF) >>> 4];
    }

    public static int h(short[] sArray, int n8) {
        int n9;
        int n10;
        n8 |= sArray.length;
        int n11 = 0;
        do {
            n10 = n8 >>> 1;
            n11 = n9 = n11 + ax.ie.e.g(sArray[n10], n8 & 1);
            n8 = n10;
        } while (n10 != 1);
        return n9;
    }

    public static int i(int n8) {
        return n8 << 4;
    }

    public static int k(short[] sArray, int n8) {
        int n9;
        int n10;
        n8 |= sArray.length;
        int n11 = 0;
        int n12 = 1;
        do {
            int n13 = n8 & 1;
            n10 = n8 >>> 1;
            n9 = n11 + ax.ie.e.g(sArray[n12], n13);
            n12 = n12 << 1 | n13;
            n11 = n9;
            n8 = n10;
        } while (n10 != 1);
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void m() throws IOException {
        long l8 = this.a;
        int n8 = (int)(l8 >>> 32);
        if (n8 != 0 || l8 < 0xFF000000L) {
            int n9 = this.d;
            while (true) {
                this.n(n9 + n8);
                this.c = l8 = this.c - 1L;
                if (l8 == 0L) {
                    this.d = (byte)(this.a >>> 24);
                    break;
                }
                n9 = 255;
            }
        }
        ++this.c;
        this.a = (this.a & 0xFFFFFFL) << 8;
    }

    public void b(short[] sArray, int n8, int n9) throws IOException {
        short s8 = sArray[n8];
        int n10 = this.b;
        int n11 = (n10 >>> 11) * s8;
        if (n9 == 0) {
            this.b = n11;
            sArray[n8] = (short)(s8 + (2048 - s8 >>> 5));
        } else {
            this.a += (long)n11 & 0xFFFFFFFFL;
            this.b = n10 - n11;
            sArray[n8] = (short)(s8 - (s8 >>> 5));
        }
        n8 = this.b;
        if ((0xFF000000 & n8) == 0) {
            this.b = n8 << 8;
            this.m();
        }
    }

    public void c(short[] sArray, int n8) throws IOException {
        int n9;
        int n10 = sArray.length;
        int n11 = 1;
        do {
            n9 = n10 >>> 1;
            int n12 = n8 & n9;
            this.b(sArray, n11, n12);
            n11 = n10 = n11 << 1;
            if (n12 != 0) {
                n11 = n10 | 1;
            }
            n10 = n9;
        } while (n9 != 1);
    }

    public void d(int n8, int n9) throws IOException {
        int n10;
        do {
            int n11;
            this.b = n11 = this.b >>> 1;
            long l8 = this.a;
            n10 = n9 - 1;
            this.a = l8 + (long)(0 - (n8 >>> n10 & 1) & n11);
            if ((0xFF000000 & n11) == 0) {
                this.b = n11 << 8;
                this.m();
            }
            n9 = n10;
        } while (n10 != 0);
    }

    public void e(short[] sArray, int n8) throws IOException {
        int n9;
        n8 |= sArray.length;
        int n10 = 1;
        do {
            int n11 = n8 & 1;
            n9 = n8 >>> 1;
            this.b(sArray, n10, n11);
            n10 = n10 << 1 | n11;
            n8 = n9;
        } while (n9 != 1);
    }

    public int f() throws IOException {
        for (int i8 = 0; i8 < 5; ++i8) {
            this.m();
        }
        return -1;
    }

    public int j() {
        throw new Error();
    }

    public void l() {
        this.a = 0L;
        this.b = -1;
        this.d = 0;
        this.c = 1L;
    }

    abstract void n(int var1) throws IOException;
}

