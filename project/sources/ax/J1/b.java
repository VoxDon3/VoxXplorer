package ax.J1;

import ax.S0.d0;
import ax.q1.I;
import ax.q1.N;
import java.math.RoundingMode;

/* loaded from: classes.dex */
final class b implements g {
    private final long a;
    private final long b;
    private final int c;
    private final I d;

    public b(long j, long j2, long j3) {
        this.d = new I(new long[]{j2}, new long[]{0}, j);
        this.a = j2;
        this.b = j3;
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.c = -2147483647;
            return;
        }
        long r1 = d0.r1(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (r1 > 0 && r1 <= 2147483647L) {
            i = (int) r1;
        }
        this.c = i;
    }

    public boolean a(long j) {
        return this.d.b(j, 100000L);
    }

    public void b(long j, long j2) {
        if (a(j)) {
            return;
        }
        this.d.a(j, j2);
    }

    void c(long j) {
        this.d.c(j);
    }

    @Override // ax.J1.g
    public long g() {
        return this.b;
    }

    @Override // ax.J1.g
    public long h() {
        return this.a;
    }

    @Override // ax.q1.N
    public boolean i() {
        return this.d.i();
    }

    @Override // ax.J1.g
    public long j(long j) {
        return this.d.j(j);
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        return this.d.l(j);
    }

    @Override // ax.J1.g
    public int m() {
        return this.c;
    }

    @Override // ax.q1.N
    public long n() {
        return this.d.n();
    }
}
