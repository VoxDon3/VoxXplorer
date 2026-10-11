/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.J1.g;
import ax.S0.d0;
import ax.q1.I;
import ax.q1.N;
import java.math.RoundingMode;

final class b
implements g {
    private final long a;
    private final long b;
    private final int c;
    private final I d;

    public b(long l8, long l9, long l10) {
        this.d = new I(new long[]{l9}, new long[]{0L}, l8);
        this.a = l9;
        this.b = l10;
        int n8 = -2147483647;
        if (l8 != -9223372036854775807L) {
            l8 = d0.r1(l9 - l10, 8L, l8, RoundingMode.HALF_UP);
            int n9 = n8;
            if (l8 > 0L) {
                n9 = n8;
                if (l8 <= Integer.MAX_VALUE) {
                    n9 = (int)l8;
                }
            }
            this.c = n9;
            return;
        }
        this.c = -2147483647;
    }

    public boolean a(long l8) {
        return this.d.b(l8, 100000L);
    }

    public void b(long l8, long l9) {
        if (this.a(l8)) {
            return;
        }
        this.d.a(l8, l9);
    }

    void c(long l8) {
        this.d.c(l8);
    }

    @Override
    public long g() {
        return this.b;
    }

    @Override
    public long h() {
        return this.a;
    }

    @Override
    public boolean i() {
        return this.d.i();
    }

    @Override
    public long j(long l8) {
        return this.d.j(l8);
    }

    @Override
    public N.a l(long l8) {
        return this.d.l(l8);
    }

    @Override
    public int m() {
        return this.c;
    }

    @Override
    public long n() {
        return this.d.n();
    }
}

