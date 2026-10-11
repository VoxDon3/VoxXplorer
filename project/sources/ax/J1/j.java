package ax.J1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.J;
import ax.q1.N;
import ax.q1.O;

/* loaded from: classes.dex */
final class j implements g {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    private j(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    public static j a(i iVar, long j) {
        long a = iVar.a();
        if (a == -9223372036854775807L) {
            return null;
        }
        J.a aVar = iVar.a;
        return new j(j, aVar.c, a, aVar.f, iVar.c, iVar.f);
    }

    private long b(int i) {
        return (this.c * i) / 100;
    }

    @Override // ax.J1.g
    public long g() {
        return this.f;
    }

    @Override // ax.J1.g
    public long h() {
        return this.a + this.b;
    }

    @Override // ax.q1.N
    public boolean i() {
        return this.g != null;
    }

    @Override // ax.J1.g
    public long j(long j) {
        long j2 = j - this.a;
        if (!i() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) C0968a.i(this.g);
        double d = (j2 * 256.0d) / this.e;
        int h = d0.h(jArr, (long) d, true, true);
        long b = b(h);
        long j3 = jArr[h];
        int i = h + 1;
        long b2 = b(i);
        return b + Math.round((j3 == (h == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (b2 - b));
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        if (!i()) {
            return new N.a(new O(0L, this.a + this.b));
        }
        long q = d0.q(j, 0L, this.c);
        double d = (q * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) C0968a.i(this.g))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new N.a(new O(q, this.a + d0.q(Math.round((d2 / 256.0d) * this.e), this.b, this.e - 1)));
    }

    @Override // ax.J1.g
    public int m() {
        return this.d;
    }

    @Override // ax.q1.N
    public long n() {
        return this.c;
    }
}
