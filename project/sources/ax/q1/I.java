package ax.q1;

import ax.S0.C0968a;
import ax.S0.C0988v;
import ax.S0.d0;
import ax.q1.N;

/* loaded from: classes.dex */
public final class I implements N {
    private final C0988v a;
    private final C0988v b;
    private long c;

    public I(long[] jArr, long[] jArr2, long j) {
        C0968a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new C0988v(length);
            this.b = new C0988v(length);
        } else {
            int i = length + 1;
            C0988v c0988v = new C0988v(i);
            this.a = c0988v;
            C0988v c0988v2 = new C0988v(i);
            this.b = c0988v2;
            c0988v.a(0L);
            c0988v2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    public void a(long j, long j2) {
        if (this.b.d() == 0 && j > 0) {
            this.a.a(0L);
            this.b.a(0L);
        }
        this.a.a(j2);
        this.b.a(j);
    }

    public boolean b(long j, long j2) {
        if (this.b.d() == 0) {
            return false;
        }
        C0988v c0988v = this.b;
        return j - c0988v.c(c0988v.d() - 1) < j2;
    }

    public void c(long j) {
        this.c = j;
    }

    @Override // ax.q1.N
    public boolean i() {
        return this.b.d() > 0;
    }

    public long j(long j) {
        if (this.b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.b.c(d0.e(this.a, j, true, true));
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        if (this.b.d() == 0) {
            return new N.a(O.c);
        }
        int e = d0.e(this.b, j, true, true);
        O o = new O(this.b.c(e), this.a.c(e));
        if (o.a == j || e == this.b.d() - 1) {
            return new N.a(o);
        }
        int i = e + 1;
        return new N.a(o, new O(this.b.c(i), this.a.c(i)));
    }

    @Override // ax.q1.N
    public long n() {
        return this.c;
    }
}
