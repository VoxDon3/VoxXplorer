package ax.q1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.B;
import ax.q1.N;

/* renamed from: ax.q1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2840A implements N {
    private final B a;
    private final long b;

    public C2840A(B b, long j) {
        this.a = b;
        this.b = j;
    }

    private O a(long j, long j2) {
        return new O((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        C0968a.i(this.a.k);
        B b = this.a;
        B.a aVar = b.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int h = d0.h(jArr, b.i(j), true, false);
        O a = a(h == -1 ? 0L : jArr[h], h != -1 ? jArr2[h] : 0L);
        if (a.a == j || h == jArr.length - 1) {
            return new N.a(a);
        }
        int i = h + 1;
        return new N.a(a, a(jArr[i], jArr2[i]));
    }

    @Override // ax.q1.N
    public long n() {
        return this.a.f();
    }
}
