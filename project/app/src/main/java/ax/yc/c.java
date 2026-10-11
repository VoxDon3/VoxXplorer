/*
 * Decompiled with CFR 0.152.
 */
package ax.yc;

import ax.Gb.l;
import ax.xc.z;

public final class c {
    public static final int a(int[] nArray, int n8, int n9, int n10) {
        l.f(nArray, "<this>");
        --n10;
        while (n9 <= n10) {
            int n11 = n9 + n10 >>> 1;
            int n12 = nArray[n11];
            if (n12 < n8) {
                n9 = n11 + 1;
                continue;
            }
            if (n12 > n8) {
                n10 = n11 - 1;
                continue;
            }
            return n11;
        }
        return -n9 - 1;
    }

    public static final int b(z z8, int n8) {
        l.f(z8, "<this>");
        n8 = c.a(z8.M(), n8 + 1, 0, z8.N().length);
        if (n8 >= 0) {
            return n8;
        }
        return ~n8;
    }
}

