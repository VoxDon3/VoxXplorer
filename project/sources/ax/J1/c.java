package ax.J1;

import android.util.Pair;
import ax.E1.l;
import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;

/* loaded from: classes.dex */
final class c implements g {
    private final long[] a;
    private final long[] b;
    private final long c;

    private c(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? d0.a1(jArr2[jArr2.length - 1]) : j;
    }

    public static c a(long j, l lVar, long j2) {
        int length = lVar.e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += lVar.c + lVar.e[i3];
            j3 += lVar.d + lVar.f[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new c(jArr, jArr2, j2);
    }

    private static Pair<Long, Long> b(long j, long[] jArr, long[] jArr2) {
        int h = d0.h(jArr, j, true, true);
        long j2 = jArr[h];
        long j3 = jArr2[h];
        int i = h + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // ax.J1.g
    public long g() {
        return -1L;
    }

    @Override // ax.J1.g
    public long h() {
        return 0L;
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.J1.g
    public long j(long j) {
        return d0.a1(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        Pair<Long, Long> b = b(d0.E1(d0.q(j, 0L, this.c)), this.b, this.a);
        return new N.a(new O(d0.a1(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    @Override // ax.J1.g
    public int m() {
        return -2147483647;
    }

    @Override // ax.q1.N
    public long n() {
        return this.c;
    }
}
