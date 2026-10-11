/*
 * Decompiled with CFR 0.152.
 */
package ax.w1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.T0.h;
import ax.q1.U;
import ax.q1.d;
import ax.w1.e;

final class f
extends e {
    private final G b = new G(h.a);
    private final G c = new G(4);
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public f(U u8) {
        super(u8);
    }

    @Override
    protected boolean b(G object) throws e.a {
        int n8 = ((G)object).M();
        int n9 = n8 >> 4 & 0xF;
        if ((n8 &= 0xF) == 7) {
            this.g = n9;
            return n9 != 5;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Video format not supported: ");
        ((StringBuilder)object).append(n8);
        throw new e.a(((StringBuilder)object).toString());
    }

    @Override
    protected boolean c(G object, long l8) throws E {
        int n8 = ((G)object).M();
        long l9 = ((G)object).w();
        if (n8 == 0 && !this.e) {
            G g8 = new G(new byte[((G)object).a()]);
            ((G)object).q(g8.f(), 0, ((G)object).a());
            object = ax.q1.d.b(g8);
            this.d = ((d)object).b;
            object = new v.b().W("video/x-flv").y0("video/avc").U(((d)object).l).F0(((d)object).c).h0(((d)object).d).u0(((d)object).k).k0(((d)object).a).P();
            this.a.e((v)object);
            this.e = true;
            return false;
        }
        if (n8 == 1 && this.e) {
            n8 = this.g == 1 ? 1 : 0;
            if (!this.f && n8 == 0) {
                return false;
            }
            byte[] byArray = this.c.f();
            byArray[0] = 0;
            byArray[1] = 0;
            byArray[2] = 0;
            int n9 = this.d;
            int n10 = 0;
            while (((G)object).a() > 0) {
                ((G)object).q(this.c.f(), 4 - n9, this.d);
                this.c.b0(0);
                int n11 = this.c.Q();
                this.b.b0(0);
                this.a.g(this.b, 4);
                this.a.g((G)object, n11);
                n10 = n10 + 4 + n11;
            }
            this.a.f(l8 + l9 * 1000L, n8, n10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}

