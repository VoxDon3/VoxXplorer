/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.a;
import ax.T0.k;
import ax.X1.F;
import ax.X1.L;
import ax.q1.U;
import ax.q1.g;
import ax.q1.t;
import java.util.List;

public final class G {
    private final List<v> a;
    private final String b;
    private final U[] c;
    private final k d;

    public G(List<v> list, String string) {
        this.a = list;
        this.b = string;
        this.c = new U[list.size()];
        this.d = new k(new F(this));
    }

    public static /* synthetic */ void a(G g8, long l8, ax.S0.G g9) {
        g.a(l8, g9, g8.c);
    }

    public void b() {
        this.d.d();
    }

    public void c(long l8, ax.S0.G g8) {
        this.d.a(l8, g8);
    }

    public void d(t t8, L.d d8) {
        for (int i8 = 0; i8 < this.c.length; ++i8) {
            d8.a();
            U u8 = t8.u(d8.c(), 3);
            v v8 = this.a.get(i8);
            String string = v8.o;
            boolean bl = "application/cea-608".equals(string) || "application/cea-708".equals(string);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("Invalid closed caption MIME type provided: ");
            charSequence.append(string);
            ax.S0.a.b(bl, charSequence.toString());
            charSequence = v8.a;
            if (charSequence == null) {
                charSequence = d8.b();
            }
            u8.e(new v.b().j0((String)charSequence).W(this.b).y0(string).A0(v8.e).n0(v8.d).Q(v8.L).k0(v8.r).P());
            this.c[i8] = u8;
        }
    }

    public void e() {
        this.d.d();
    }

    public void f(int n8) {
        this.d.g(n8);
    }
}

