/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.t;
import ax.S0.a;
import ax.S0.d0;

public final class w {
    public final t a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public w(t t8, long[] lArray, int[] nArray, int n8, long[] lArray2, int[] nArray2, long l8) {
        int n9 = nArray.length;
        int n10 = lArray2.length;
        boolean bl = false;
        boolean bl2 = n9 == n10;
        ax.S0.a.a(bl2);
        bl2 = lArray.length == lArray2.length;
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (nArray2.length == lArray2.length) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        this.a = t8;
        this.c = lArray;
        this.d = nArray;
        this.e = n8;
        this.f = lArray2;
        this.g = nArray2;
        this.h = l8;
        this.b = lArray.length;
        if (nArray2.length > 0) {
            n8 = nArray2.length - 1;
            nArray2[n8] = nArray2[n8] | 0x20000000;
        }
    }

    public int a(long l8) {
        for (int i8 = d0.h(this.f, l8, true, false); i8 >= 0; --i8) {
            if ((this.g[i8] & 1) == 0) continue;
            return i8;
        }
        return -1;
    }

    public int b(long l8) {
        for (int i8 = d0.d(this.f, l8, true, false); i8 < this.f.length; ++i8) {
            if ((this.g[i8] & 1) == 0) continue;
            return i8;
        }
        return -1;
    }
}

