package ax.Y1;

import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;

/* loaded from: classes.dex */
final class e implements N {
    private final c a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public e(c cVar, int i, long j, long j2) {
        this.a = cVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / cVar.e;
        this.d = j3;
        this.e = a(j3);
    }

    private long a(long j) {
        return d0.p1(j * this.b, 1000000L, this.a.c);
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        long q = d0.q((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c + (this.a.e * q);
        long a = a(q);
        O o = new O(a, j2);
        if (a >= j || q == this.d - 1) {
            return new N.a(o);
        }
        long j3 = q + 1;
        return new N.a(o, new O(a(j3), this.c + (this.a.e * j3)));
    }

    @Override // ax.q1.N
    public long n() {
        return this.e;
    }
}
