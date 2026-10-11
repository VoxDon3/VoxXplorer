/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.s;
import ax.S0.d0;
import ax.S0.h;
import ax.o1.D;

public final class A {
    private final b a;
    private final D b;
    private final long c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private float k;
    private h l;
    private boolean m;
    private boolean n;
    private boolean o;

    public A(Context context, b b8, long l8) {
        this.a = b8;
        this.c = l8;
        this.b = new D(context);
        this.e = 0;
        this.f = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = 1.0f;
        this.l = ax.S0.h.a;
    }

    private long b(long l8, long l9, long l10) {
        l8 = l10 = (long)((double)(l10 - l8) / (double)this.k);
        if (this.d) {
            l8 = l10 - (d0.a1(this.l.b()) - l9);
        }
        return l8;
    }

    private void f(int n8) {
        this.e = Math.min(this.e, n8);
    }

    private boolean q(long l8, long l9, long l10) {
        if (this.i != -9223372036854775807L && !this.j) {
            return false;
        }
        int n8 = this.e;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        long l11 = d0.a1(this.l.b());
                        long l12 = this.g;
                        return this.d && (this.o || (l10 = this.f) != -9223372036854775807L && l10 != l8) && this.a.E(l9, l11 - l12);
                    }
                    throw new IllegalStateException();
                }
                return l8 >= l10;
            }
            return true;
        }
        return this.d;
    }

    public void a() {
        if (this.e == 0) {
            this.e = 1;
        }
    }

    public int c(long l8, long l9, long l10, long l11, boolean bl, boolean bl2, a a8) throws s {
        a8.h();
        if (this.d && this.f == -9223372036854775807L) {
            this.f = l9;
        }
        if (this.h != l8) {
            this.b.h(l8);
            this.h = l8;
        }
        ax.o1.A$a.c(a8, this.b(l9, l10, l8));
        if (bl && !bl2) {
            return 3;
        }
        if (!this.m) {
            this.n = true;
            if (this.a.g(a8.a, l9, l10, bl2, true)) {
                return 4;
            }
            if (this.d && a8.a < 30000L) {
                return 3;
            }
            return 5;
        }
        if (this.q(l9, a8.a, l11)) {
            return 0;
        }
        if (this.d && l9 != this.f) {
            l8 = this.l.nanoTime();
            ax.o1.A$a.e(a8, this.b.b(a8.a * 1000L + l8));
            ax.o1.A$a.c(a8, (a8.b - l8) / 1000L);
            bl = this.i != -9223372036854775807L && !this.j;
            if (this.a.g(a8.a, l9, l10, bl2, bl)) {
                return 4;
            }
            if (this.a.y(a8.a, l10, bl2)) {
                if (bl) {
                    return 3;
                }
                return 2;
            }
            if (a8.a > 50000L) {
                return 5;
            }
            return 1;
        }
        return 5;
    }

    public boolean d(boolean bl) {
        if (bl && (this.e == 3 || !this.m && this.n)) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.b() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public void e(boolean bl) {
        this.j = bl;
        long l8 = this.c > 0L ? this.l.b() + this.c : -9223372036854775807L;
        this.i = l8;
    }

    public boolean g() {
        boolean bl = this.e != 3;
        this.e = 3;
        this.g = d0.a1(this.l.b());
        return bl;
    }

    public void h() {
        this.d = true;
        this.g = d0.a1(this.l.b());
        this.b.k();
    }

    public void i() {
        this.d = false;
        this.i = -9223372036854775807L;
        this.b.l();
    }

    public void j(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    this.f(2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.e = 0;
            return;
        }
        this.e = 1;
    }

    public void k() {
        this.b.j();
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.f(1);
        this.i = -9223372036854775807L;
    }

    public void l(int n8) {
        this.b.o(n8);
    }

    public void m(h h8) {
        this.l = h8;
    }

    public void n(float f8) {
        this.b.g(f8);
    }

    public void o(Surface surface) {
        boolean bl = surface != null;
        this.m = bl;
        this.n = false;
        this.b.m(surface);
        this.f(1);
    }

    public void p(float f8) {
        boolean bl = f8 > 0.0f;
        ax.S0.a.a(bl);
        if (f8 == this.k) {
            return;
        }
        this.k = f8;
        this.b.i(f8);
    }

    public static class a {
        private long a = -9223372036854775807L;
        private long b = -9223372036854775807L;

        static /* synthetic */ long c(a a8, long l8) {
            a8.a = l8;
            return l8;
        }

        static /* synthetic */ long e(a a8, long l8) {
            a8.b = l8;
            return l8;
        }

        private void h() {
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
        }

        public long f() {
            return this.a;
        }

        public long g() {
            return this.b;
        }
    }

    public static interface b {
        public boolean E(long var1, long var3);

        public boolean g(long var1, long var3, long var5, boolean var7, boolean var8) throws s;

        public boolean y(long var1, long var3, boolean var5);
    }
}

