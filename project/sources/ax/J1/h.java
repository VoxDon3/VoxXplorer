package ax.J1;

import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.J;
import ax.q1.N;
import ax.q1.O;

/* loaded from: classes.dex */
final class h implements g {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;

    private h(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
    }

    public static h a(long j, long j2, J.a aVar, G g) {
        int M;
        g.c0(6);
        long j3 = j2 + aVar.c;
        long v = g.v() + j3;
        int v2 = g.v();
        if (v2 <= 0) {
            return null;
        }
        long o1 = d0.o1((v2 * aVar.g) - 1, aVar.d);
        int U = g.U();
        int U2 = g.U();
        int U3 = g.U();
        g.c0(2);
        int i = U2;
        long[] jArr = new long[U];
        long[] jArr2 = new long[U];
        long j4 = j2 + aVar.c;
        int i2 = 0;
        while (i2 < U) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i2] = (i2 * o1) / U;
            jArr3[i2] = j4;
            if (U3 == 1) {
                M = g.M();
            } else if (U3 == 2) {
                M = g.U();
            } else if (U3 == 3) {
                M = g.P();
            } else {
                if (U3 != 4) {
                    return null;
                }
                M = g.Q();
            }
            int i3 = i2;
            int i4 = i;
            j4 += M * i4;
            i = i4;
            i2 = i3 + 1;
            U = U;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j != -1 && j != v) {
            C0987u.h("VbriSeeker", "VBRI data size mismatch: " + j + ", " + v);
        }
        if (v != j4) {
            C0987u.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + v + ", " + j4 + "\nSeeking will be inaccurate.");
            v = Math.max(v, j4);
        }
        return new h(jArr6, jArr5, o1, j3, v, aVar.f);
    }

    @Override // ax.J1.g
    public long g() {
        return this.e;
    }

    @Override // ax.J1.g
    public long h() {
        return this.d;
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.J1.g
    public long j(long j) {
        return this.a[d0.h(this.b, j, true, true)];
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        int h = d0.h(this.a, j, true, true);
        O o = new O(this.a[h], this.b[h]);
        if (o.a >= j || h == this.a.length - 1) {
            return new N.a(o);
        }
        int i = h + 1;
        return new N.a(o, new O(this.a[i], this.b[i]));
    }

    @Override // ax.J1.g
    public int m() {
        return this.f;
    }

    @Override // ax.q1.N
    public long n() {
        return this.c;
    }
}
