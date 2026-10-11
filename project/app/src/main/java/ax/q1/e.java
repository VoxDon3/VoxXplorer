/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.d0;
import ax.q1.M;
import ax.q1.N;
import ax.q1.O;
import ax.q1.s;
import java.io.IOException;

public abstract class e {
    protected final a a;
    protected final f b;
    protected c c;
    private final int d;

    protected e(d d8, f f8, long l8, long l9, long l10, long l11, long l12, long l13, int n8) {
        this.b = f8;
        this.d = n8;
        this.a = new a(d8, l8, l9, l10, l11, l12, l13);
    }

    protected c a(long l8) {
        return new c(l8, this.a.f(l8), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }

    public final N b() {
        return this.a;
    }

    public int c(s s8, M m8) throws IOException {
        long l8;
        while (true) {
            c c8 = ax.S0.a.i(this.c);
            long l9 = c8.j();
            long l10 = c8.i();
            l8 = c8.k();
            if (l10 - l9 <= (long)this.d) {
                this.e(false, l9);
                return this.g(s8, l9, m8);
            }
            if (!this.i(s8, l8)) {
                return this.g(s8, l8, m8);
            }
            s8.m();
            e e8 = this.b.a(s8, c8.m());
            int n8 = e8.a;
            if (n8 == -3) break;
            if (n8 != -2) {
                if (n8 != -1) {
                    if (n8 == 0) {
                        this.i(s8, e8.c);
                        this.e(true, e8.c);
                        return this.g(s8, e8.c, m8);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                c8.o(e8.b, e8.c);
                continue;
            }
            c8.p(e8.b, e8.c);
        }
        this.e(false, l8);
        return this.g(s8, l8, m8);
    }

    public final boolean d() {
        return this.c != null;
    }

    protected final void e(boolean bl, long l8) {
        this.c = null;
        this.b.b();
        this.f(bl, l8);
    }

    protected void f(boolean bl, long l8) {
    }

    protected final int g(s s8, long l8, M m8) {
        if (l8 == s8.getPosition()) {
            return 0;
        }
        m8.a = l8;
        return 1;
    }

    public final void h(long l8) {
        c c8 = this.c;
        if (c8 != null && c8.l() == l8) {
            return;
        }
        this.c = this.a(l8);
    }

    protected final boolean i(s s8, long l8) throws IOException {
        if ((l8 -= s8.getPosition()) >= 0L && l8 <= 262144L) {
            s8.n((int)l8);
            return true;
        }
        return false;
    }

    public static class a
    implements N {
        private final d a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public a(d d8, long l8, long l9, long l10, long l11, long l12, long l13) {
            this.a = d8;
            this.b = l8;
            this.c = l9;
            this.d = l10;
            this.e = l11;
            this.f = l12;
            this.g = l13;
        }

        public long f(long l8) {
            return this.a.a(l8);
        }

        @Override
        public boolean i() {
            return true;
        }

        @Override
        public N.a l(long l8) {
            return new N.a(new O(l8, ax.q1.e$c.h(this.a.a(l8), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override
        public long n() {
            return this.b;
        }
    }

    public static final class b
    implements d {
        @Override
        public long a(long l8) {
            return l8;
        }
    }

    protected static class c {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long l8, long l9, long l10, long l11, long l12, long l13, long l14) {
            this.a = l8;
            this.b = l9;
            this.d = l10;
            this.e = l11;
            this.f = l12;
            this.g = l13;
            this.c = l14;
            this.h = ax.q1.e$c.h(l9, l10, l11, l12, l13, l14);
        }

        protected static long h(long l8, long l9, long l10, long l11, long l12, long l13) {
            if (l11 + 1L < l12 && l9 + 1L < l10) {
                float f8 = (float)(l12 - l11) / (float)(l10 - l9);
                l8 = (long)((float)(l8 - l9) * f8);
                return d0.q(l8 + l11 - l13 - l8 / 20L, l11, l12 - 1L);
            }
            return l11;
        }

        private long i() {
            return this.g;
        }

        private long j() {
            return this.f;
        }

        private long k() {
            return this.h;
        }

        private long l() {
            return this.a;
        }

        private long m() {
            return this.b;
        }

        private void n() {
            this.h = ax.q1.e$c.h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        private void o(long l8, long l9) {
            this.e = l8;
            this.g = l9;
            this.n();
        }

        private void p(long l8, long l9) {
            this.d = l8;
            this.f = l9;
            this.n();
        }
    }

    protected static interface d {
        public long a(long var1);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1L);
        private final int a;
        private final long b;
        private final long c;

        private e(int n8, long l8, long l9) {
            this.a = n8;
            this.b = l8;
            this.c = l9;
        }

        public static e d(long l8, long l9) {
            return new e(-1, l8, l9);
        }

        public static e e(long l8) {
            return new e(0, -9223372036854775807L, l8);
        }

        public static e f(long l8, long l9) {
            return new e(-2, l8, l9);
        }
    }

    protected static interface f {
        public e a(s var1, long var2) throws IOException;

        public void b();
    }
}

