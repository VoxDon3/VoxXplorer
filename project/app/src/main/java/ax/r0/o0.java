/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.u0;
import ax.r0.v0;
import java.io.IOException;

abstract class o0<T, B> {
    o0() {
    }

    abstract void a(B var1, int var2, int var3);

    abstract void b(B var1, int var2, long var3);

    abstract void c(B var1, int var2, T var3);

    abstract void d(B var1, int var2, h var3);

    abstract void e(B var1, int var2, long var3);

    abstract B f(Object var1);

    abstract T g(Object var1);

    abstract int h(T var1);

    abstract int i(T var1);

    abstract void j(Object var1);

    abstract T k(T var1, T var2);

    final void l(B b8, g0 g02) throws IOException {
        while (g02.D() != Integer.MAX_VALUE && this.m(b8, g02)) {
        }
    }

    final boolean m(B b8, g0 g02) throws IOException {
        int n8 = g02.l();
        int n9 = u0.a(n8);
        if ((n8 = u0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                this.a(b8, n9, g02.k());
                                return true;
                            }
                            throw B.d();
                        }
                        return false;
                    }
                    B b9 = this.n();
                    n8 = u0.c(n9, 4);
                    this.l(b9, g02);
                    if (n8 == g02.l()) {
                        this.c(b8, n9, this.r(b9));
                        return true;
                    }
                    throw B.a();
                }
                this.d(b8, n9, g02.G());
                return true;
            }
            this.b(b8, n9, g02.e());
            return true;
        }
        this.e(b8, n9, g02.N());
        return true;
    }

    abstract B n();

    abstract void o(Object var1, B var2);

    abstract void p(Object var1, T var2);

    abstract boolean q(g0 var1);

    abstract T r(B var1);

    abstract void s(T var1, v0 var2) throws IOException;

    abstract void t(T var1, v0 var2) throws IOException;
}

