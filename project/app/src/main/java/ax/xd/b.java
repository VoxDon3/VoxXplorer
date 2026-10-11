/*
 * Decompiled with CFR 0.152.
 */
package ax.xd;

import ax.Nd.d;
import ax.Nd.h;
import ax.xd.e;

public class b
extends e {
    public static void n(int n8, int[] nArray, int[] nArray2) {
        if (nArray.length == 16) {
            if (nArray2.length == 16) {
                if (n8 % 2 == 0) {
                    int n9 = nArray[0];
                    int n10 = nArray[1];
                    int n11 = nArray[2];
                    int n12 = nArray[3];
                    int n13 = nArray[4];
                    int n14 = nArray[5];
                    int n15 = nArray[6];
                    int n16 = nArray[7];
                    int n17 = nArray[8];
                    int n18 = nArray[9];
                    int n19 = nArray[10];
                    int n20 = nArray[11];
                    int n21 = nArray[12];
                    int n22 = nArray[13];
                    int n23 = nArray[14];
                    int n24 = nArray[15];
                    while (n8 > 0) {
                        n21 = ax.Nd.d.c(n21 ^ (n9 += n13), 16);
                        n13 = ax.Nd.d.c(n13 ^ (n17 += n21), 12);
                        n21 = ax.Nd.d.c(n21 ^ (n9 += n13), 8);
                        n13 = ax.Nd.d.c(n13 ^ (n17 += n21), 7);
                        n22 = ax.Nd.d.c(n22 ^ (n10 += n14), 16);
                        n14 = ax.Nd.d.c(n14 ^ (n18 += n22), 12);
                        n22 = ax.Nd.d.c(n22 ^ (n10 += n14), 8);
                        n14 = ax.Nd.d.c(n14 ^ (n18 += n22), 7);
                        n23 = ax.Nd.d.c(n23 ^ (n11 += n15), 16);
                        n15 = ax.Nd.d.c(n15 ^ (n19 += n23), 12);
                        n23 = ax.Nd.d.c(n23 ^ (n11 += n15), 8);
                        n15 = ax.Nd.d.c(n15 ^ (n19 += n23), 7);
                        n24 = ax.Nd.d.c(n24 ^ (n12 += n16), 16);
                        n16 = ax.Nd.d.c(n16 ^ (n20 += n24), 12);
                        n24 = ax.Nd.d.c(n24 ^ (n12 += n16), 8);
                        n16 = ax.Nd.d.c(n16 ^ (n20 += n24), 7);
                        n24 = ax.Nd.d.c(n24 ^ (n9 += n14), 16);
                        n14 = ax.Nd.d.c(n14 ^ (n19 += n24), 12);
                        n24 = ax.Nd.d.c(n24 ^ (n9 += n14), 8);
                        n14 = ax.Nd.d.c(n14 ^ (n19 += n24), 7);
                        n21 = ax.Nd.d.c(n21 ^ (n10 += n15), 16);
                        n15 = ax.Nd.d.c(n15 ^ (n20 += n21), 12);
                        n21 = ax.Nd.d.c(n21 ^ (n10 += n15), 8);
                        n15 = ax.Nd.d.c(n15 ^ (n20 += n21), 7);
                        n22 = ax.Nd.d.c(n22 ^ (n11 += n16), 16);
                        n16 = ax.Nd.d.c(n16 ^ (n17 += n22), 12);
                        n22 = ax.Nd.d.c(n22 ^ (n11 += n16), 8);
                        n16 = ax.Nd.d.c(n16 ^ (n17 += n22), 7);
                        n23 = ax.Nd.d.c(n23 ^ (n12 += n13), 16);
                        n13 = ax.Nd.d.c(n13 ^ (n18 += n23), 12);
                        n23 = ax.Nd.d.c(n23 ^ (n12 += n13), 8);
                        n13 = ax.Nd.d.c(n13 ^ (n18 += n23), 7);
                        n8 -= 2;
                    }
                    nArray2[0] = n9 + nArray[0];
                    nArray2[1] = n10 + nArray[1];
                    nArray2[2] = n11 + nArray[2];
                    nArray2[3] = n12 + nArray[3];
                    nArray2[4] = n13 + nArray[4];
                    nArray2[5] = n14 + nArray[5];
                    nArray2[6] = n15 + nArray[6];
                    nArray2[7] = n16 + nArray[7];
                    nArray2[8] = n17 + nArray[8];
                    nArray2[9] = n18 + nArray[9];
                    nArray2[10] = n19 + nArray[10];
                    nArray2[11] = n20 + nArray[11];
                    nArray2[12] = n21 + nArray[12];
                    nArray2[13] = n22 + nArray[13];
                    nArray2[14] = n23 + nArray[14];
                    nArray2[15] = n24 + nArray[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override
    protected void b() {
        int n8;
        int[] nArray = this.c;
        nArray[12] = n8 = nArray[12] + 1;
        if (n8 == 0) {
            nArray[13] = nArray[13] + 1;
        }
    }

    @Override
    protected void c(byte[] byArray) {
        b.n(this.a, this.c, this.d);
        h.g(this.d, byArray, 0);
    }

    @Override
    public String d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChaCha");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    @Override
    protected void j() {
        int[] nArray = this.c;
        nArray[13] = 0;
        nArray[12] = 0;
    }

    @Override
    protected void m(byte[] object, byte[] byArray) {
        if (object != null) {
            if (((byte[])object).length != 16 && ((byte[])object).length != 32) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.d());
                ((StringBuilder)object).append(" requires 128 bit or 256 bit key");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            this.i(((byte[])object).length, this.c, 0);
            h.j((byte[])object, 0, this.c, 4, 4);
            h.j((byte[])object, ((Object)object).length - 16, this.c, 8, 4);
        }
        h.j(byArray, 0, this.c, 14, 2);
    }
}

