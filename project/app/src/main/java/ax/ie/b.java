/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.ie.a;
import java.io.IOException;

public abstract class b
extends a {
    int a = 0;
    int b = 0;

    public int b(short[] sArray, int n8) throws IOException {
        this.f();
        short s8 = sArray[n8];
        int n9 = this.a;
        int n10 = (n9 >>> 11) * s8;
        int n11 = this.b;
        if ((n11 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ n10)) {
            this.a = n10;
            sArray[n8] = (short)(s8 + (2048 - s8 >>> 5));
            return 0;
        }
        this.a = n9 - n10;
        this.b = n11 - n10;
        sArray[n8] = (short)(s8 - (s8 >>> 5));
        return 1;
    }

    public int c(short[] sArray) throws IOException {
        int n8;
        int n9 = 1;
        do {
            n9 = n8 = this.b(sArray, n9) | n9 << 1;
        } while (n8 < sArray.length);
        return n8 - sArray.length;
    }

    public int d(int n8) throws IOException {
        int n9;
        int n10;
        int n11 = 0;
        do {
            this.f();
            this.a = n10 = this.a >>> 1;
            n9 = this.b;
            int n12 = n9 - n10 >>> 31;
            this.b = n9 - (n10 & n12 - 1);
            n9 = n11 << 1 | 1 - n12;
            n10 = n8 - 1;
            n11 = n9;
            n8 = n10;
        } while (n10 != 0);
        return n9;
    }

    public int e(short[] sArray) throws IOException {
        int n8 = 0;
        int n9 = 0;
        int n10 = 1;
        while (true) {
            int n11 = this.b(sArray, n10);
            n10 = n10 << 1 | n11;
            n8 |= n11 << n9;
            if (n10 >= sArray.length) {
                return n8;
            }
            ++n9;
        }
    }

    public abstract void f() throws IOException;
}

