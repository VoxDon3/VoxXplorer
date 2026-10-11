/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

import java.security.MessageDigest;

public class f
extends MessageDigest
implements Cloneable {
    private long c0;
    private byte[] d0;
    private int[] e0;
    private int[] q = new int[4];

    public f() {
        super("MD4");
        this.d0 = new byte[64];
        this.e0 = new int[16];
        this.engineReset();
    }

    private f(f f8) {
        this();
        this.q = (int[])f8.q.clone();
        this.d0 = (byte[])f8.d0.clone();
        this.c0 = f8.c0;
    }

    private int b(int n8, int n9, int n10, int n11, int n12, int n13) {
        n8 = n8 + (~n9 & n11 | n10 & n9) + n12;
        return n8 >>> 32 - n13 | n8 << n13;
    }

    private int c(int n8, int n9, int n10, int n11, int n12, int n13) {
        n8 = n8 + (n9 & (n10 | n11) | n10 & n11) + n12 + 1518500249;
        return n8 >>> 32 - n13 | n8 << n13;
    }

    private int d(int n8, int n9, int n10, int n11, int n12, int n13) {
        n8 = n8 + (n9 ^ n10 ^ n11) + n12 + 1859775393;
        return n8 >>> 32 - n13 | n8 << n13;
    }

    private void f(byte[] objectArray, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13 = 0;
        while (true) {
            n12 = n8;
            if (n13 >= 16) break;
            int[] nArray = this.e0;
            n11 = objectArray[n12];
            n10 = objectArray[n12 + 1];
            n9 = objectArray[n12 + 2];
            n8 = n12 + 4;
            nArray[n13] = (n9 & 0xFF) << 16 | ((n10 & 0xFF) << 8 | n11 & 0xFF) | (objectArray[n12 + 3] & 0xFF) << 24;
            ++n13;
        }
        objectArray = this.q;
        n13 = objectArray[0];
        n8 = objectArray[1];
        n10 = objectArray[2];
        n12 = objectArray[3];
        n13 = this.b(n13, n8, n10, n12, this.e0[0], 3);
        n12 = this.b(n12, n13, n8, n10, this.e0[1], 7);
        n11 = this.b(n10, n12, n13, n8, this.e0[2], 11);
        n8 = this.b(n8, n11, n12, n13, this.e0[3], 19);
        n10 = this.b(n13, n8, n11, n12, this.e0[4], 3);
        n9 = this.b(n12, n10, n8, n11, this.e0[5], 7);
        n13 = this.b(n11, n9, n10, n8, this.e0[6], 11);
        n12 = this.b(n8, n13, n9, n10, this.e0[7], 19);
        n8 = this.b(n10, n12, n13, n9, this.e0[8], 3);
        n10 = this.b(n9, n8, n12, n13, this.e0[9], 7);
        n13 = this.b(n13, n10, n8, n12, this.e0[10], 11);
        n12 = this.b(n12, n13, n10, n8, this.e0[11], 19);
        n9 = this.b(n8, n12, n13, n10, this.e0[12], 3);
        n8 = this.b(n10, n9, n12, n13, this.e0[13], 7);
        n13 = this.b(n13, n8, n9, n12, this.e0[14], 11);
        n12 = this.b(n12, n13, n8, n9, this.e0[15], 19);
        n10 = this.c(n9, n12, n13, n8, this.e0[0], 3);
        n8 = this.c(n8, n10, n12, n13, this.e0[4], 5);
        n9 = this.c(n13, n8, n10, n12, this.e0[8], 9);
        n13 = this.c(n12, n9, n8, n10, this.e0[12], 13);
        n10 = this.c(n10, n13, n9, n8, this.e0[1], 3);
        n8 = this.c(n8, n10, n13, n9, this.e0[5], 5);
        n12 = this.c(n9, n8, n10, n13, this.e0[9], 9);
        n9 = this.c(n13, n12, n8, n10, this.e0[13], 13);
        n11 = this.c(n10, n9, n12, n8, this.e0[2], 3);
        n13 = this.c(n8, n11, n9, n12, this.e0[6], 5);
        n8 = this.c(n12, n13, n11, n9, this.e0[10], 9);
        n10 = this.c(n9, n8, n13, n11, this.e0[14], 13);
        n9 = this.c(n11, n10, n8, n13, this.e0[3], 3);
        n12 = this.c(n13, n9, n10, n8, this.e0[7], 5);
        n11 = this.c(n8, n12, n9, n10, this.e0[11], 9);
        n13 = this.c(n10, n11, n12, n9, this.e0[15], 13);
        n8 = this.d(n9, n13, n11, n12, this.e0[0], 3);
        n10 = this.d(n12, n8, n13, n11, this.e0[8], 9);
        n12 = this.d(n11, n10, n8, n13, this.e0[4], 11);
        n13 = this.d(n13, n12, n10, n8, this.e0[12], 15);
        n8 = this.d(n8, n13, n12, n10, this.e0[2], 3);
        n10 = this.d(n10, n8, n13, n12, this.e0[10], 9);
        n12 = this.d(n12, n10, n8, n13, this.e0[6], 11);
        n13 = this.d(n13, n12, n10, n8, this.e0[14], 15);
        n8 = this.d(n8, n13, n12, n10, this.e0[1], 3);
        n10 = this.d(n10, n8, n13, n12, this.e0[9], 9);
        n12 = this.d(n12, n10, n8, n13, this.e0[5], 11);
        n13 = this.d(n13, n12, n10, n8, this.e0[13], 15);
        n8 = this.d(n8, n13, n12, n10, this.e0[3], 3);
        n10 = this.d(n10, n8, n13, n12, this.e0[11], 9);
        n12 = this.d(n12, n10, n8, n13, this.e0[7], 11);
        n13 = this.d(n13, n12, n10, n8, this.e0[15], 15);
        objectArray = this.q;
        objectArray[0] = objectArray[0] + n8;
        objectArray[1] = objectArray[1] + n13;
        objectArray[2] = objectArray[2] + n12;
        objectArray[3] = objectArray[3] + n10;
    }

    @Override
    public Object clone() {
        return new f(this);
    }

    @Override
    public byte[] engineDigest() {
        int n8;
        int n9 = (int)(this.c0 % 64L);
        n9 = n9 < 56 ? 56 - n9 : 120 - n9;
        int n10 = n9 + 8;
        byte[] byArray = new byte[n10];
        byArray[0] = -128;
        for (n8 = 0; n8 < 8; ++n8) {
            byArray[n9 + n8] = (byte)(this.c0 * 8L >>> n8 * 8);
        }
        this.engineUpdate(byArray, 0, n10);
        byArray = new byte[16];
        for (n9 = 0; n9 < 4; ++n9) {
            for (n8 = 0; n8 < 4; ++n8) {
                byArray[n9 * 4 + n8] = (byte)(this.q[n9] >>> n8 * 8);
            }
        }
        this.engineReset();
        return byArray;
    }

    @Override
    public void engineReset() {
        int[] nArray = this.q;
        nArray[0] = 1732584193;
        nArray[1] = -271733879;
        nArray[2] = -1732584194;
        nArray[3] = 271733878;
        this.c0 = 0L;
        for (int i8 = 0; i8 < 64; ++i8) {
            this.d0[i8] = 0;
        }
    }

    @Override
    public void engineUpdate(byte by) {
        long l8 = this.c0;
        int n8 = (int)(l8 % 64L);
        this.c0 = l8 + 1L;
        byte[] byArray = this.d0;
        byArray[n8] = by;
        if (n8 == 63) {
            this.f(byArray, 0);
        }
    }

    @Override
    public void engineUpdate(byte[] byArray, int n8, int n9) {
        long l8;
        long l9;
        if (n8 >= 0 && n9 >= 0 && (l9 = (long)n8) + (l8 = (long)n9) <= (long)byArray.length) {
            l9 = this.c0;
            int n10 = (int)(l9 % 64L);
            this.c0 = l9 + l8;
            int n11 = 64 - n10;
            int n12 = 0;
            int n13 = n10;
            if (n9 >= n11) {
                System.arraycopy(byArray, n8, this.d0, n10, n11);
                this.f(this.d0, 0);
                n13 = n11;
                while (n13 + 63 < n9) {
                    this.f(byArray, n13 + n8);
                    n13 += 64;
                }
                n12 = n13;
                n13 = 0;
            }
            if (n12 < n9) {
                System.arraycopy(byArray, n8 + n12, this.d0, n13, n9 - n12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}

