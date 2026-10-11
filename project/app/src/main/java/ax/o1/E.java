/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import androidx.media3.exoplayer.s;
import ax.P0.a0;
import ax.S0.L;
import ax.S0.h;
import ax.S0.w;
import ax.o1.A;

final class E {
    private final a a;
    private final A b;
    private final A.a c;
    private final L<a0> d;
    private final L<Long> e;
    private final w f;
    private long g;
    private long h;
    private long i;
    private a0 j;
    private long k;

    public E(a a8, A a9) {
        this.a = a8;
        this.b = a9;
        this.c = new A.a();
        this.d = new L();
        this.e = new L();
        this.f = new w();
        this.g = -9223372036854775807L;
        this.j = a0.e;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    private void a() {
        this.f.f();
        this.a.b();
    }

    private static <T> T c(L<T> l8) {
        boolean bl = l8.l() > 0;
        ax.S0.a.a(bl);
        while (l8.l() > 1) {
            l8.i();
        }
        return ax.S0.a.e(l8.i());
    }

    private boolean e(long l8) {
        Long l9 = this.e.j(l8);
        if (l9 != null && l9 != this.k) {
            this.k = l9;
            return true;
        }
        return false;
    }

    private boolean f(long l8) {
        a0 a02 = this.d.j(l8);
        if (a02 != null && !a02.equals(a0.e) && !a02.equals(this.j)) {
            this.j = a02;
            return true;
        }
        return false;
    }

    private void k(boolean bl) {
        long l8 = this.f.f();
        if (this.f(l8)) {
            this.a.a(this.j);
        }
        long l9 = bl ? ax.S0.h.a.nanoTime() : this.c.g();
        this.a.c(l9, l8, this.b.g());
    }

    public void b() {
        this.f.b();
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        if (this.e.l() > 0) {
            this.k = E.c(this.e);
        }
        if (this.d.l() > 0) {
            a0 a02 = E.c(this.d);
            this.d.a(0L, a02);
        }
    }

    public boolean d() {
        long l8 = this.i;
        return l8 != -9223372036854775807L && this.h == l8;
    }

    public void g(long l8) {
        this.f.a(l8);
        this.g = l8;
        this.i = -9223372036854775807L;
    }

    public void h(int n8, long l8) {
        if (this.f.e()) {
            this.b.j(n8);
            this.k = l8;
            return;
        }
        L<Long> l9 = this.e;
        long l10 = this.g;
        l10 = l10 == -9223372036854775807L ? -4611686018427387904L : ++l10;
        l9.a(l10, l8);
    }

    public void i(int n8, int n9) {
        L<a0> l8 = this.d;
        long l9 = this.g;
        l9 = l9 == -9223372036854775807L ? 0L : ++l9;
        l8.a(l9, new a0(n8, n9));
    }

    public void j(long l8, long l9) throws s {
        while (!this.f.e()) {
            long l10 = this.f.d();
            if (this.e(l10)) {
                this.b.j(2);
            }
            int n8 = this.b.c(l10, l8, l9, this.k, false, false, this.c);
            boolean bl = true;
            if (n8 != 0 && n8 != 1) {
                if (n8 != 2 && n8 != 3) {
                    if (n8 != 4) {
                        if (n8 == 5) break;
                        throw new IllegalStateException(String.valueOf(n8));
                    }
                    this.h = l10;
                    continue;
                }
                this.h = l10;
                this.a();
                continue;
            }
            this.h = l10;
            if (n8 != 0) {
                bl = false;
            }
            this.k(bl);
        }
    }

    public void l() {
        if (this.g == -9223372036854775807L) {
            this.g = Long.MIN_VALUE;
            this.h = Long.MIN_VALUE;
        }
        this.i = this.g;
    }

    static interface a {
        public void a(a0 var1);

        public void b();

        public void c(long var1, long var3, boolean var5);
    }
}

