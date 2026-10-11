package ax.q1;

import ax.q1.N;

/* renamed from: ax.q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2850j implements N {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public C2850j(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = c(j, j2, i);
        }
    }

    private long a(long j) {
        int i = this.c;
        long j2 = (((j * this.e) / 8000000) / i) * i;
        long j3 = this.d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - i);
        }
        return this.b + Math.max(j2, 0L);
    }

    private static long c(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public long b(long j) {
        return c(j, this.b, this.e);
    }

    @Override // ax.q1.N
    public boolean i() {
        return this.d != -1 || this.g;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        if (this.d == -1 && !this.g) {
            return new N.a(new O(0L, this.b));
        }
        long a = a(j);
        long b = b(a);
        O o = new O(b, a);
        if (this.d != -1 && b < j) {
            int i = this.c;
            if (i + a < this.a) {
                long j2 = a + i;
                return new N.a(o, new O(b(j2), j2));
            }
        }
        return new N.a(o);
    }

    @Override // ax.q1.N
    public long n() {
        return this.f;
    }
}
