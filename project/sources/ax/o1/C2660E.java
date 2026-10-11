package ax.o1;

import androidx.media3.exoplayer.C0622s;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.C0989w;
import ax.S0.InterfaceC0975h;
import ax.o1.C2656A;

/* renamed from: ax.o1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2660E {
    private final a a;
    private final C2656A b;
    private long k;
    private final C2656A.a c = new C2656A.a();
    private final ax.S0.L<a0> d = new ax.S0.L<>();
    private final ax.S0.L<Long> e = new ax.S0.L<>();
    private final C0989w f = new C0989w();
    private long g = -9223372036854775807L;
    private a0 j = a0.e;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;

    /* renamed from: ax.o1.E$a */
    interface a {
        void a(a0 a0Var);

        void b();

        void c(long j, long j2, boolean z);
    }

    public C2660E(a aVar, C2656A c2656a) {
        this.a = aVar;
        this.b = c2656a;
    }

    private void a() {
        this.f.f();
        this.a.b();
    }

    private static <T> T c(ax.S0.L<T> l) {
        C0968a.a(l.l() > 0);
        while (l.l() > 1) {
            l.i();
        }
        return (T) C0968a.e(l.i());
    }

    private boolean e(long j) {
        Long j2 = this.e.j(j);
        if (j2 == null || j2.longValue() == this.k) {
            return false;
        }
        this.k = j2.longValue();
        return true;
    }

    private boolean f(long j) {
        a0 j2 = this.d.j(j);
        if (j2 == null || j2.equals(a0.e) || j2.equals(this.j)) {
            return false;
        }
        this.j = j2;
        return true;
    }

    private void k(boolean z) {
        long f = this.f.f();
        if (f(f)) {
            this.a.a(this.j);
        }
        this.a.c(z ? InterfaceC0975h.a.nanoTime() : this.c.g(), f, this.b.g());
    }

    public void b() {
        this.f.b();
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        if (this.e.l() > 0) {
            this.k = ((Long) c(this.e)).longValue();
        }
        if (this.d.l() > 0) {
            this.d.a(0L, (a0) c(this.d));
        }
    }

    public boolean d() {
        long j = this.i;
        return j != -9223372036854775807L && this.h == j;
    }

    public void g(long j) {
        this.f.a(j);
        this.g = j;
        this.i = -9223372036854775807L;
    }

    public void h(int i, long j) {
        if (this.f.e()) {
            this.b.j(i);
            this.k = j;
        } else {
            ax.S0.L<Long> l = this.e;
            long j2 = this.g;
            l.a(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public void i(int i, int i2) {
        ax.S0.L<a0> l = this.d;
        long j = this.g;
        l.a(j == -9223372036854775807L ? 0L : j + 1, new a0(i, i2));
    }

    public void j(long j, long j2) throws C0622s {
        while (!this.f.e()) {
            long d = this.f.d();
            if (e(d)) {
                this.b.j(2);
            }
            int c = this.b.c(d, j, j2, this.k, false, false, this.c);
            if (c == 0 || c == 1) {
                this.h = d;
                k(c == 0);
            } else if (c == 2 || c == 3) {
                this.h = d;
                a();
            } else {
                if (c != 4) {
                    if (c != 5) {
                        throw new IllegalStateException(String.valueOf(c));
                    }
                    return;
                }
                this.h = d;
            }
        }
    }

    public void l() {
        if (this.g == -9223372036854775807L) {
            this.g = Long.MIN_VALUE;
            this.h = Long.MIN_VALUE;
        }
        this.i = this.g;
    }
}
