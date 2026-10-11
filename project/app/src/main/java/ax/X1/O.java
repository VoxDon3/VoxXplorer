/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.T0.k;
import ax.X1.L;
import ax.X1.N;
import ax.q1.U;
import ax.q1.g;
import ax.q1.t;
import java.util.List;

final class O {
    private final List<v> a;
    private final String b;
    private final U[] c;
    private final k d;

    public O(List<v> object, String string) {
        this.a = object;
        this.b = string;
        this.c = new U[object.size()];
        this.d = object = new k(new N(this));
        ((k)object).g(3);
    }

    public static /* synthetic */ void a(O o8, long l8, G g8) {
        g.b(l8, g8, o8.c);
    }

    public void b(long l8, G g8) {
        if (g8.a() >= 9) {
            int n8 = g8.v();
            int n9 = g8.v();
            int n10 = g8.M();
            if (n8 == 434 && n9 == 1195456820 && n10 == 3) {
                this.d.a(l8, g8);
            }
        }
    }

    public void c(t t8, L.d d8) {
        for (int i8 = 0; i8 < this.c.length; ++i8) {
            d8.a();
            U u8 = t8.u(d8.c(), 3);
            v v8 = this.a.get(i8);
            String string = v8.o;
            boolean bl = "application/cea-608".equals(string) || "application/cea-708".equals(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid closed caption MIME type provided: ");
            stringBuilder.append(string);
            ax.S0.a.b(bl, stringBuilder.toString());
            u8.e(new v.b().j0(d8.b()).W(this.b).y0(string).A0(v8.e).n0(v8.d).Q(v8.L).k0(v8.r).P());
            this.c[i8] = u8;
        }
    }
}

