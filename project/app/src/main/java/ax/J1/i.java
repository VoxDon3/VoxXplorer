/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.S0.G;
import ax.S0.d0;
import ax.q1.J;

final class i {
    public final J.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;

    private i(J.a a8, long l8, long l9, long[] lArray, int n8, int n9) {
        this.a = new J.a(a8);
        this.b = l8;
        this.c = l9;
        this.f = lArray;
        this.d = n8;
        this.e = n9;
    }

    public static i b(J.a a8, G g8) {
        long[] lArray;
        int n8;
        int n9 = g8.v();
        int n10 = (n9 & 1) != 0 ? g8.Q() : -1;
        long l8 = (n9 & 2) != 0 ? g8.O() : -1L;
        if ((n9 & 4) == 4) {
            long[] lArray2 = new long[100];
            n8 = 0;
            while (true) {
                lArray = lArray2;
                if (n8 < 100) {
                    lArray2[n8] = g8.M();
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            lArray = null;
        }
        if ((n9 & 8) != 0) {
            g8.c0(4);
        }
        if (g8.a() >= 24) {
            g8.c0(21);
            n9 = g8.P();
            n8 = n9 & 0xFFF;
            n9 = (0xFFF000 & n9) >> 12;
        } else {
            n9 = -1;
            n8 = -1;
        }
        return new i(a8, n10, l8, lArray, n9, n8);
    }

    public long a() {
        long l8 = this.b;
        if (l8 != -1L && l8 != 0L) {
            J.a a8 = this.a;
            return d0.o1(l8 * (long)a8.g - 1L, a8.d);
        }
        return -9223372036854775807L;
    }
}

