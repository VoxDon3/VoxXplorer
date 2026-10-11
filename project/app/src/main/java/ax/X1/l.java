/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.t;
import java.util.Collections;
import java.util.List;

public final class l
implements m {
    private final List<L.a> a;
    private final String b;
    private final U[] c;
    private boolean d;
    private int e;
    private int f;
    private long g;

    public l(List<L.a> list, String string) {
        this.a = list;
        this.b = string;
        this.c = new U[list.size()];
        this.g = -9223372036854775807L;
    }

    private boolean a(G g8, int n8) {
        if (g8.a() == 0) {
            return false;
        }
        if (g8.M() != n8) {
            this.d = false;
        }
        --this.e;
        return this.d;
    }

    @Override
    public void b() {
        this.d = false;
        this.g = -9223372036854775807L;
    }

    @Override
    public void c(G g8) {
        if (this.d && (this.e != 2 || this.a(g8, 32))) {
            int n8 = this.e;
            if (n8 != 1 || this.a(g8, 0)) {
                int n9 = g8.g();
                n8 = g8.a();
                for (U u8 : this.c) {
                    g8.b0(n9);
                    u8.g(g8, n8);
                }
                this.f += n8;
            }
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        for (int i8 = 0; i8 < this.c.length; ++i8) {
            L.a a8 = this.a.get(i8);
            d8.a();
            U u8 = t8.u(d8.c(), 3);
            u8.e(new v.b().j0(d8.b()).W(this.b).y0("application/dvbsubs").k0(Collections.singletonList(a8.c)).n0(a8.a).P());
            this.c[i8] = u8;
        }
    }

    @Override
    public void e(boolean bl) {
        if (this.d) {
            bl = this.g != -9223372036854775807L;
            ax.S0.a.g(bl);
            U[] uArray = this.c;
            int n8 = uArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                uArray[i8].f(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override
    public void f(long l8, int n8) {
        if ((n8 & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = l8;
        this.f = 0;
        this.e = 2;
    }
}

