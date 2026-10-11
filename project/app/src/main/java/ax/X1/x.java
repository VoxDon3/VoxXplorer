/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.M;
import ax.S0.a;
import ax.S0.d0;
import ax.X1.D;
import ax.X1.L;
import ax.q1.U;
import ax.q1.t;

public final class x
implements D {
    private v a;
    private M b;
    private U c;

    public x(String string, String string2) {
        this.a = new v.b().W(string2).y0(string).P();
    }

    private void b() {
        ax.S0.a.i(this.b);
        d0.i(this.c);
    }

    @Override
    public void a(M object, t t8, L.d d8) {
        this.b = object;
        d8.a();
        this.c = object = t8.u(d8.c(), 5);
        object.e(this.a);
    }

    @Override
    public void c(G g8) {
        this.b();
        long l8 = this.b.e();
        long l9 = this.b.f();
        if (l8 != -9223372036854775807L && l9 != -9223372036854775807L) {
            v v8 = this.a;
            if (l9 != v8.t) {
                this.a = v8 = v8.b().C0(l9).P();
                this.c.e(v8);
            }
            int n8 = g8.a();
            this.c.g(g8, n8);
            this.c.f(l8, 1, n8, 0, null);
        }
    }
}

