/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.a;
import ax.L1.e;
import ax.L1.f;
import ax.L1.g;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.s;
import ax.q1.t;
import java.io.IOException;

abstract class i {
    private final e a = new e();
    private U b;
    private t c;
    private g d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private b j = new b();
    private long k;
    private boolean l;
    private boolean m;

    private void a() {
        ax.S0.a.i(this.b);
        d0.i(this.c);
    }

    private boolean i(s s8) throws IOException {
        while (true) {
            if (!this.a.d(s8)) {
                this.h = 3;
                return false;
            }
            this.k = s8.getPosition() - this.f;
            if (!this.h(this.a.c(), this.f, this.j)) break;
            this.f = s8.getPosition();
        }
        return true;
    }

    private int j(s s8) throws IOException {
        if (!this.i(s8)) {
            return -1;
        }
        Object object = this.j.a;
        this.i = ((v)object).H;
        if (!this.m) {
            this.b.e((v)object);
            this.m = true;
        }
        if ((object = this.j.b) != null) {
            this.d = object;
        } else if (s8.getLength() == -1L) {
            this.d = new c();
        } else {
            object = this.a.b();
            boolean bl = (((f)object).b & 4) != 0;
            this.d = new a(this, this.f, s8.getLength(), ((f)object).h + ((f)object).i, ((f)object).c, bl);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    private int k(s object, M object2) throws IOException {
        long l8;
        long l9 = this.d.b((s)object);
        if (l9 >= 0L) {
            ((M)object2).a = l9;
            return 1;
        }
        if (l9 < -1L) {
            this.e(-(l9 + 2L));
        }
        if (!this.l) {
            object2 = ax.S0.a.i(this.d.a());
            this.c.h((N)object2);
            this.b.d(object2.n());
            this.l = true;
        }
        if (this.k <= 0L && !this.a.d((s)object)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        object = this.a.c();
        l9 = this.f((G)object);
        if (l9 >= 0L && (l8 = this.g) + l9 >= this.e) {
            l8 = this.b(l8);
            this.b.g((G)object, ((G)object).j());
            this.b.f(l8, 1, ((G)object).j(), 0, null);
            this.e = -1L;
        }
        this.g += l9;
        return 0;
    }

    protected long b(long l8) {
        return l8 * 1000000L / (long)this.i;
    }

    protected long c(long l8) {
        return (long)this.i * l8 / 1000000L;
    }

    void d(t t8, U u8) {
        this.c = t8;
        this.b = u8;
        this.l(true);
    }

    protected void e(long l8) {
        this.g = l8;
    }

    protected abstract long f(G var1);

    final int g(s s8, M m8) throws IOException {
        this.a();
        int n8 = this.h;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                d0.i(this.d);
                return this.k(s8, m8);
            }
            s8.n((int)this.f);
            this.h = 2;
            return 0;
        }
        return this.j(s8);
    }

    protected abstract boolean h(G var1, long var2, b var4) throws IOException;

    protected void l(boolean bl) {
        if (bl) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void m(long l8, long l9) {
        this.a.e();
        if (l8 == 0L) {
            this.l(this.l ^ true);
            return;
        }
        if (this.h != 0) {
            this.e = this.c(l9);
            d0.i(this.d).c(this.e);
            this.h = 2;
        }
    }

    static class b {
        v a;
        g b;

        b() {
        }
    }

    private static final class c
    implements g {
        private c() {
        }

        @Override
        public N a() {
            return new N.b(-9223372036854775807L);
        }

        @Override
        public long b(s s8) {
            return -1L;
        }

        @Override
        public void c(long l8) {
        }
    }
}

