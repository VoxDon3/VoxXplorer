/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import android.util.Pair;
import ax.E1.l;
import ax.J1.g;
import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;

final class c
implements g {
    private final long[] a;
    private final long[] b;
    private final long c;

    private c(long[] lArray, long[] lArray2, long l8) {
        this.a = lArray;
        this.b = lArray2;
        if (l8 == -9223372036854775807L) {
            l8 = d0.a1(lArray2[lArray2.length - 1]);
        }
        this.c = l8;
    }

    public static c a(long l8, l l9, long l10) {
        int n8 = l9.e.length;
        int n9 = n8 + 1;
        long[] lArray = new long[n9];
        long[] lArray2 = new long[n9];
        lArray[0] = l8;
        long l11 = 0L;
        lArray2[0] = 0L;
        long l12 = l8;
        l8 = l11;
        for (n9 = 1; n9 <= n8; ++n9) {
            int n10 = l9.c;
            int[] nArray = l9.e;
            int n11 = n9 - 1;
            lArray[n9] = l12 += (long)(n10 + nArray[n11]);
            lArray2[n9] = l8 += (long)(l9.d + l9.f[n11]);
        }
        return new c(lArray, lArray2, l10);
    }

    private static Pair<Long, Long> b(long l8, long[] lArray, long[] lArray2) {
        int n8 = d0.h(lArray, l8, true, true);
        long l9 = lArray[n8];
        long l10 = lArray2[n8];
        if (++n8 == lArray.length) {
            return Pair.create((Object)l9, (Object)l10);
        }
        long l11 = lArray[n8];
        long l12 = lArray2[n8];
        double d8 = l11 == l9 ? 0.0 : ((double)l8 - (double)l9) / (double)(l11 - l9);
        return Pair.create((Object)l8, (Object)((long)(d8 * (double)(l12 - l10)) + l10));
    }

    @Override
    public long g() {
        return -1L;
    }

    @Override
    public long h() {
        return 0L;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public long j(long l8) {
        return d0.a1((Long)ax.J1.c.b((long)l8, (long[])this.a, (long[])this.b).second);
    }

    @Override
    public N.a l(long l8) {
        Pair<Long, Long> pair = ax.J1.c.b(d0.E1(d0.q(l8, 0L, this.c)), this.b, this.a);
        return new N.a(new O(d0.a1((Long)pair.first), (Long)pair.second));
    }

    @Override
    public int m() {
        return -2147483647;
    }

    @Override
    public long n() {
        return this.c;
    }
}

