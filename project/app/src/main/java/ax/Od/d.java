/*
 * Decompiled with CFR 0.152.
 */
package ax.Od;

import java.io.IOException;
import java.io.OutputStream;

public class d {
    protected final byte[] a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] b = new byte[128];

    public d() {
        this.d();
    }

    byte[] a(String string, int n8, int n9) throws IOException {
        if (string != null) {
            if (n8 >= 0 && n9 >= 0 && n8 <= string.length() - n9) {
                if ((n9 & 1) == 0) {
                    byte[] byArray;
                    block4: {
                        int n10 = n9 >>> 1;
                        byArray = new byte[n10];
                        n9 = 0;
                        while (true) {
                            int n11 = n8;
                            if (n9 >= n10) break block4;
                            byte by = this.b[string.charAt(n11)];
                            byte[] byArray2 = this.b;
                            n8 = n11 + 2;
                            if ((n11 = by << 4 | byArray2[string.charAt(n11 + 1)]) < 0) break;
                            byArray[n9] = (byte)n11;
                            ++n9;
                        }
                        throw new IOException("invalid characters encountered in Hex string");
                    }
                    return byArray;
                }
                throw new IOException("a hexadecimal encoding must have an even number of characters");
            }
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        throw new NullPointerException("'str' cannot be null");
    }

    public int b(byte[] byArray, int n8, int n9, OutputStream outputStream) throws IOException {
        int n10;
        if (n9 < 0) {
            return 0;
        }
        byte[] byArray2 = new byte[72];
        int n11 = n8;
        for (n8 = n9; n8 > 0; n8 -= n10) {
            n10 = Math.min(36, n8);
            outputStream.write(byArray2, 0, this.c(byArray, n11, n10, byArray2, 0));
            n11 += n10;
        }
        return n9 * 2;
    }

    public int c(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws IOException {
        int n11;
        int n12 = n10;
        int n13 = n8;
        while (true) {
            n11 = n12;
            if (n13 >= n9 + n8) break;
            byte by = byArray[n13];
            byte[] byArray3 = this.a;
            byArray2[n11] = byArray3[(by & 0xFF) >>> 4];
            n12 = n11 + 2;
            byArray2[n11 + 1] = byArray3[by & 0xF];
            ++n13;
        }
        return n11 - n10;
    }

    protected void d() {
        byte[] byArray;
        int n8 = 0;
        int n9 = 0;
        while (true) {
            byArray = this.b;
            if (n9 >= byArray.length) break;
            byArray[n9] = -1;
            ++n9;
        }
        for (int i8 = n8; i8 < (byArray = this.a).length; ++i8) {
            this.b[byArray[i8]] = (byte)i8;
        }
        byArray = this.b;
        byArray[65] = byArray[97];
        byArray[66] = byArray[98];
        byArray[67] = byArray[99];
        byArray[68] = byArray[100];
        byArray[69] = byArray[101];
        byArray[70] = byArray[102];
    }
}

