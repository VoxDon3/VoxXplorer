/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.S0.d0;
import ax.X1.M;
import ax.q1.s;
import java.io.IOException;

final class I {
    private final int a;
    private final ax.S0.M b;
    private final G c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private long i;

    I(int n8) {
        this.a = n8;
        this.b = new ax.S0.M(0L);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.c = new G();
    }

    private int a(s s8) {
        this.c.Y(d0.f);
        this.d = true;
        s8.m();
        return 0;
    }

    private int f(s s8, ax.q1.M m8, int n8) throws IOException {
        long l8;
        int n9 = (int)Math.min((long)this.a, s8.getLength());
        long l9 = s8.getPosition();
        if (l9 != (l8 = (long)0)) {
            m8.a = l8;
            return 1;
        }
        this.c.X(n9);
        s8.m();
        s8.p(this.c.f(), 0, n9);
        this.g = this.g(this.c, n8);
        this.e = true;
        return 0;
    }

    private long g(G g8, int n8) {
        int n9 = g8.j();
        for (int i8 = g8.g(); i8 < n9; ++i8) {
            long l8;
            if (g8.f()[i8] != 71 || (l8 = M.c(g8, i8, n8)) == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    private int h(s s8, ax.q1.M m8, int n8) throws IOException {
        long l8 = s8.getLength();
        int n9 = (int)Math.min((long)this.a, l8);
        if (s8.getPosition() != (l8 -= (long)n9)) {
            m8.a = l8;
            return 1;
        }
        this.c.X(n9);
        s8.m();
        s8.p(this.c.f(), 0, n9);
        this.h = this.i(this.c, n8);
        this.f = true;
        return 0;
    }

    private long i(G g8, int n8) {
        int n9 = g8.g();
        int n10 = g8.j();
        for (int i8 = n10 - 188; i8 >= n9; --i8) {
            long l8;
            if (!M.b(g8.f(), n9, n10, i8) || (l8 = M.c(g8, i8, n8)) == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.i;
    }

    public ax.S0.M c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(s s8, ax.q1.M m8, int n8) throws IOException {
        if (n8 <= 0) {
            return this.a(s8);
        }
        if (!this.f) {
            return this.h(s8, m8, n8);
        }
        if (this.h == -9223372036854775807L) {
            return this.a(s8);
        }
        if (!this.e) {
            return this.f(s8, m8, n8);
        }
        long l8 = this.g;
        if (l8 == -9223372036854775807L) {
            return this.a(s8);
        }
        l8 = this.b.b(l8);
        this.i = this.b.c(this.h) - l8;
        return this.a(s8);
    }
}

