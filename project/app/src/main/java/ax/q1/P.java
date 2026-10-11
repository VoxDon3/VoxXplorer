/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.q1.M;
import ax.q1.Q;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import java.io.IOException;
import java.util.List;

public final class P
implements r {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private t f;
    private U g;

    public P(int n8, int n9, String string) {
        this.a = n8;
        this.b = n9;
        this.c = string;
    }

    private void g(String string) {
        U u8;
        this.g = u8 = this.f.u(1024, 4);
        u8.e(new v.b().W(string).y0(string).P());
        this.f.o();
        this.f.h(new Q(-9223372036854775807L));
        this.e = 1;
    }

    private void h(s s8) throws IOException {
        int n8 = ax.S0.a.e(this.g).a(s8, 1024, true);
        if (n8 == -1) {
            this.e = 2;
            this.g.f(0L, 1, this.d, 0, null);
            this.d = 0;
            return;
        }
        this.d += n8;
    }

    @Override
    public void a(t t8) {
        this.f = t8;
        this.g(this.c);
    }

    @Override
    public void b(long l8, long l9) {
        if (l8 != 0L && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    @Override
    public boolean c(s s8) throws IOException {
        boolean bl = this.a != -1 && this.b != -1;
        ax.S0.a.g(bl);
        G g8 = new G(this.b);
        s8.p(g8.f(), 0, this.b);
        return g8.U() == this.a;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        int n8 = this.e;
        if (n8 != 1) {
            if (n8 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        this.h(s8);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

