/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.J1.g;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.q1.J;
import ax.q1.N;
import ax.q1.O;

final class h
implements g {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;

    private h(long[] lArray, long[] lArray2, long l8, long l9, long l10, int n8) {
        this.a = lArray;
        this.b = lArray2;
        this.c = l8;
        this.d = l9;
        this.e = l10;
        this.f = n8;
    }

    public static h a(long l8, long l9, J.a a8, G object) {
        ((G)object).c0(6);
        int n8 = ((G)object).v();
        long l10 = l9 + (long)a8.c;
        long l11 = (long)n8 + l10;
        int n9 = ((G)object).v();
        if (n9 <= 0) {
            return null;
        }
        n8 = a8.d;
        long l12 = d0.o1((long)n9 * (long)a8.g - 1L, n8);
        n9 = ((G)object).U();
        int n10 = ((G)object).U();
        int n11 = ((G)object).U();
        ((G)object).c0(2);
        n8 = a8.c;
        long l13 = n8;
        long[] lArray = new long[n9];
        long[] lArray2 = new long[n9];
        l9 += l13;
        for (int i8 = 0; i8 < n9; ++i8) {
            lArray[i8] = (long)i8 * l12 / (long)n9;
            lArray2[i8] = l9;
            if (n11 != 1) {
                if (n11 != 2) {
                    if (n11 != 3) {
                        if (n11 != 4) {
                            return null;
                        }
                        n8 = ((G)object).Q();
                    } else {
                        n8 = ((G)object).P();
                    }
                } else {
                    n8 = ((G)object).U();
                }
            } else {
                n8 = ((G)object).M();
            }
            l9 += (long)n8 * (long)n10;
        }
        if (l8 != -1L && l8 != l11) {
            object = new StringBuilder();
            ((StringBuilder)object).append("VBRI data size mismatch: ");
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(l11);
            u.h("VbriSeeker", ((StringBuilder)object).toString());
        }
        l8 = l11;
        if (l11 != l9) {
            object = new StringBuilder();
            ((StringBuilder)object).append("VBRI bytes and ToC mismatch (using max): ");
            ((StringBuilder)object).append(l11);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(l9);
            ((StringBuilder)object).append("\nSeeking will be inaccurate.");
            u.h("VbriSeeker", ((StringBuilder)object).toString());
            l8 = Math.max(l11, l9);
        }
        return new h(lArray, lArray2, l12, l10, l8, a8.f);
    }

    @Override
    public long g() {
        return this.e;
    }

    @Override
    public long h() {
        return this.d;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public long j(long l8) {
        return this.a[d0.h(this.b, l8, true, true)];
    }

    @Override
    public N.a l(long l8) {
        int n8 = d0.h(this.a, l8, true, true);
        O o8 = new O(this.a[n8], this.b[n8]);
        if (o8.a < l8 && n8 != this.a.length - 1) {
            long[] lArray = this.a;
            return new N.a(o8, new O(lArray[++n8], this.b[n8]));
        }
        return new N.a(o8);
    }

    @Override
    public int m() {
        return this.f;
    }

    @Override
    public long n() {
        return this.c;
    }
}

