/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.b;
import ax.L1.c;
import ax.L1.f;
import ax.L1.h;
import ax.L1.i;
import ax.L1.j;
import ax.P0.E;
import ax.S0.G;
import ax.S0.a;
import ax.q1.M;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.IOException;
import java.util.List;

public class d
implements r {
    public static final x d = new c();
    private t a;
    private i b;
    private boolean c;

    public static /* synthetic */ r[] g() {
        return new r[]{new d()};
    }

    private static G h(G g8) {
        g8.b0(0);
        return g8;
    }

    private boolean i(s s8) throws IOException {
        block2: {
            block4: {
                Object object;
                block5: {
                    block3: {
                        object = new f();
                        if (!((f)object).a(s8, true) || (((f)object).b & 2) != 2) break block2;
                        int n8 = Math.min(((f)object).i, 8);
                        object = new G(n8);
                        s8.p(((G)object).f(), 0, n8);
                        if (!ax.L1.b.p(ax.L1.d.h((G)object))) break block3;
                        this.b = new b();
                        break block4;
                    }
                    if (!j.r(ax.L1.d.h((G)object))) break block5;
                    this.b = new j();
                    break block4;
                }
                if (!h.o(ax.L1.d.h((G)object))) break block2;
                this.b = new h();
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(t t8) {
        this.a = t8;
    }

    @Override
    public void b(long l8, long l9) {
        i i8 = this.b;
        if (i8 != null) {
            i8.m(l8, l9);
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        try {
            boolean bl = this.i(s8);
            return bl;
        }
        catch (E e8) {
            return false;
        }
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
        ax.S0.a.i(this.a);
        if (this.b == null) {
            if (this.i(s8)) {
                s8.m();
            } else {
                throw E.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            U u8 = this.a.u(0, 1);
            this.a.o();
            this.b.d(this.a, u8);
            this.c = true;
        }
        return this.b.g(s8, m8);
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

