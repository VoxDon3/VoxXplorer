/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.S0.a;
import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;
import ax.q1.s;
import ax.s1.d;
import java.io.IOException;
import java.util.Arrays;

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

    public e(int n8, d d8, U u8) {
        boolean bl;
        this.a = d8;
        int n9 = d8.c();
        boolean bl2 = bl = true;
        if (n9 != 1) {
            bl2 = n9 == 2 ? bl : false;
        }
        ax.S0.a.a(bl2);
        int n10 = n9 == 2 ? 1667497984 : 1651965952;
        this.c = ax.s1.e.d(n8, n10);
        this.e = d8.b();
        this.b = u8;
        n8 = n9 == 2 ? ax.s1.e.d(n8, 1650720768) : -1;
        this.d = n8;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = d8.e;
    }

    private static int d(int n8, int n9) {
        return n8 % 10 + 48 << 8 | n8 / 10 + 48 | n9;
    }

    private long e(int n8) {
        return this.e * (long)n8 / (long)this.f;
    }

    private O h(int n8) {
        return new O((long)this.n[n8] * this.g(), this.m[n8]);
    }

    public void a() {
        ++this.i;
    }

    public void b(long l8, boolean bl) {
        if (this.l == -1L) {
            this.l = l8;
        }
        if (bl) {
            Object[] objectArray;
            if (this.k == this.n.length) {
                objectArray = this.m;
                this.m = Arrays.copyOf(objectArray, objectArray.length * 3 / 2);
                objectArray = this.n;
                this.n = Arrays.copyOf((int[])objectArray, objectArray.length * 3 / 2);
            }
            objectArray = this.m;
            int n8 = this.k;
            objectArray[n8] = l8;
            this.n[n8] = this.j;
            this.k = n8 + 1;
        }
        ++this.j;
    }

    public void c() {
        int n8;
        this.m = Arrays.copyOf(this.m, this.k);
        this.n = Arrays.copyOf(this.n, this.k);
        if (this.k() && this.a.g != 0 && (n8 = this.k) > 0) {
            this.f = n8;
        }
    }

    public long f() {
        return this.e(this.i);
    }

    public long g() {
        return this.e(1);
    }

    public N.a i(long l8) {
        if (this.k == 0) {
            return new N.a(new O(0L, this.l));
        }
        int n8 = (int)(l8 / this.g());
        int n9 = d0.g(this.n, n8, true, true);
        if (this.n[n9] == n8) {
            return new N.a(this.h(n9));
        }
        O o8 = this.h(n9);
        if (++n9 < this.m.length) {
            return new N.a(o8, this.h(n9));
        }
        return new N.a(o8);
    }

    public boolean j(int n8) {
        return this.c == n8 || this.d == n8;
        {
        }
    }

    public boolean k() {
        return (this.c & 0x62770000) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.n, this.i) >= 0;
    }

    public boolean m(s s8) throws IOException {
        int n8 = this.h;
        U u8 = this.b;
        boolean bl = false;
        n8 -= u8.a(s8, n8, false);
        this.h = n8;
        if (n8 == 0) {
            bl = true;
        }
        if (bl) {
            if (this.g > 0) {
                this.b.f(this.f(), this.l() ? 1 : 0, this.g, 0, null);
            }
            this.a();
        }
        return bl;
    }

    public void n(int n8) {
        this.g = n8;
        this.h = n8;
    }

    public void o(long l8) {
        if (this.k == 0) {
            this.i = 0;
            return;
        }
        int n8 = d0.h(this.m, l8, true, true);
        this.i = this.n[n8];
    }
}

