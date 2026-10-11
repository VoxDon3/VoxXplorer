package ax.s1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.InterfaceC2858s;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class e {
    private final d a;
    private final U b;
    private final int c;
    private final int d;
    private final long e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;
    private long[] m;
    private int[] n;

    public e(int i, d dVar, U u) {
        this.a = dVar;
        int c = dVar.c();
        boolean z = true;
        if (c != 1 && c != 2) {
            z = false;
        }
        C0968a.a(z);
        this.c = d(i, c == 2 ? 1667497984 : 1651965952);
        this.e = dVar.b();
        this.b = u;
        this.d = c == 2 ? d(i, 1650720768) : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = dVar.e;
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private long e(int i) {
        return (this.e * i) / this.f;
    }

    private O h(int i) {
        return new O(this.n[i] * g(), this.m[i]);
    }

    public void a() {
        this.i++;
    }

    public void b(long j, boolean z) {
        if (this.l == -1) {
            this.l = j;
        }
        if (z) {
            if (this.k == this.n.length) {
                long[] jArr = this.m;
                this.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.n;
                this.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.m;
            int i = this.k;
            jArr2[i] = j;
            this.n[i] = this.j;
            this.k = i + 1;
        }
        this.j++;
    }

    public void c() {
        int i;
        this.m = Arrays.copyOf(this.m, this.k);
        this.n = Arrays.copyOf(this.n, this.k);
        if (!k() || this.a.g == 0 || (i = this.k) <= 0) {
            return;
        }
        this.f = i;
    }

    public long f() {
        return e(this.i);
    }

    public long g() {
        return e(1);
    }

    public N.a i(long j) {
        if (this.k == 0) {
            return new N.a(new O(0L, this.l));
        }
        int g = (int) (j / g());
        int g2 = d0.g(this.n, g, true, true);
        if (this.n[g2] == g) {
            return new N.a(h(g2));
        }
        O h = h(g2);
        int i = g2 + 1;
        return i < this.m.length ? new N.a(h, h(i)) : new N.a(h);
    }

    public boolean j(int i) {
        return this.c == i || this.d == i;
    }

    public boolean k() {
        return (this.c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.n, this.i) >= 0;
    }

    public boolean m(InterfaceC2858s interfaceC2858s) throws IOException {
        int i = this.h;
        int a = i - this.b.a(interfaceC2858s, i, false);
        this.h = a;
        boolean z = a == 0;
        if (z) {
            if (this.g > 0) {
                this.b.f(f(), l() ? 1 : 0, this.g, 0, null);
            }
            a();
        }
        return z;
    }

    public void n(int i) {
        this.g = i;
        this.h = i;
    }

    public void o(long j) {
        if (this.k == 0) {
            this.i = 0;
        } else {
            this.i = this.n[d0.h(this.m, j, true, true)];
        }
    }
}
