/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.u;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.t;

public final class r
implements m {
    private final String a;
    private final G b;
    private U c;
    private boolean d;
    private long e;
    private int f;
    private int g;

    public r(String string) {
        this.a = string;
        this.b = new G(10);
        this.e = -9223372036854775807L;
    }

    @Override
    public void b() {
        this.d = false;
        this.e = -9223372036854775807L;
    }

    @Override
    public void c(G g8) {
        ax.S0.a.i(this.c);
        if (!this.d) {
            return;
        }
        int n8 = g8.a();
        int n9 = this.g;
        if (n9 < 10) {
            n9 = Math.min(n8, 10 - n9);
            System.arraycopy(g8.f(), g8.g(), this.b.f(), this.g, n9);
            if (this.g + n9 == 10) {
                this.b.b0(0);
                if (73 == this.b.M() && 68 == this.b.M() && 51 == this.b.M()) {
                    this.b.c0(3);
                    this.f = this.b.L() + 10;
                } else {
                    u.h("Id3Reader", "Discarding invalid ID3 tag");
                    this.d = false;
                    return;
                }
            }
        }
        n8 = Math.min(n8, this.f - this.g);
        this.c.g(g8, n8);
        this.g += n8;
    }

    @Override
    public void d(t object, L.d d8) {
        d8.a();
        this.c = object = object.u(d8.c(), 5);
        object.e(new v.b().j0(d8.b()).W(this.a).y0("application/id3").P());
    }

    @Override
    public void e(boolean bl) {
        int n8;
        ax.S0.a.i(this.c);
        if (this.d && (n8 = this.f) != 0 && this.g == n8) {
            bl = this.e != -9223372036854775807L;
            ax.S0.a.g(bl);
            this.c.f(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override
    public void f(long l8, int n8) {
        if ((n8 & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = l8;
        this.f = 0;
        this.g = 0;
    }
}

