/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.c;
import ax.K1.u;
import ax.S0.G;
import ax.q1.s;
import java.io.IOException;

final class v {
    public c a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public long[] j = new long[0];
    public boolean[] k = new boolean[0];
    public boolean l;
    public boolean[] m = new boolean[0];
    public u n;
    public final G o = new G();
    public boolean p;
    public long q;
    public boolean r;

    public void a(G g8) {
        g8.q(this.o.f(), 0, this.o.j());
        this.o.b0(0);
        this.p = false;
    }

    public void b(s s8) throws IOException {
        s8.readFully(this.o.f(), 0, this.o.j());
        this.o.b0(0);
        this.p = false;
    }

    public long c(int n8) {
        return this.j[n8];
    }

    public void d(int n8) {
        this.o.X(n8);
        this.l = true;
        this.p = true;
    }

    public void e(int n8, int n9) {
        this.e = n8;
        this.f = n9;
        if (this.h.length < n8) {
            this.g = new long[n8];
            this.h = new int[n8];
        }
        if (this.i.length < n9) {
            n8 = n9 * 125 / 100;
            this.i = new int[n8];
            this.j = new long[n8];
            this.k = new boolean[n8];
            this.m = new boolean[n8];
        }
    }

    public void f() {
        this.e = 0;
        this.q = 0L;
        this.r = false;
        this.l = false;
        this.p = false;
        this.n = null;
    }

    public boolean g(int n8) {
        return this.l && this.m[n8];
    }
}

