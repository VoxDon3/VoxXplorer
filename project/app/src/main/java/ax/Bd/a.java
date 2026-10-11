/*
 * Decompiled with CFR 0.152.
 */
package ax.Bd;

import ax.Bd.b;
import ax.Bd.d;

public class a
implements b {
    private long[] a;

    @Override
    public void a(byte[] byArray) {
        this.a = d.d(byArray);
    }

    @Override
    public void b(long l8, byte[] byArray) {
        long[] lArray = d.l();
        if (l8 > 0L) {
            long l9;
            long[] lArray2 = new long[2];
            d.f(this.a, lArray2);
            do {
                if ((1L & l8) != 0L) {
                    d.j(lArray, lArray2);
                }
                d.m(lArray2, lArray2);
                l8 = l9 = l8 >>> 1;
            } while (l9 > 0L);
        }
        d.b(lArray, byArray);
    }
}

