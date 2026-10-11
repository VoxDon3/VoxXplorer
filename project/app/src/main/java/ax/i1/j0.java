/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import ax.P0.N;
import ax.P0.v;
import ax.P0.y;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import ax.i1.C;
import ax.i1.F;
import ax.i1.N;
import ax.i1.a;
import ax.i1.h0;
import ax.i1.i0;
import ax.m1.m;
import ax.n1.c;
import ax.q7.h;
import ax.q7.u;

@Deprecated
public final class j0
extends a {
    private final k h;
    private final g.a i;
    private final v j;
    private final long k;
    private final m l;
    private final boolean m;
    private final N n;
    private final y o;
    private final u<c> p;
    private z q;

    private j0(String object, y.k k8, g.a object2, long l8, m object3, boolean bl, Object object4, u<c> u8) {
        this.i = object2;
        this.k = l8;
        this.l = object3;
        this.m = bl;
        this.o = object4 = new y.c().f(Uri.EMPTY).c(k8.a.toString()).d(ax.r7.z.A(k8)).e(object4).a();
        object3 = new v.b().y0(ax.q7.h.a(k8.b, "text/x-unknown")).n0(k8.c).A0(k8.d).w0(k8.e).l0(k8.f);
        object2 = k8.g;
        if (object2 != null) {
            object = object2;
        }
        this.j = ((v.b)object3).j0((String)object).P();
        this.h = new k.b().i(k8.a).b(1).a();
        this.n = new h0(l8, true, false, false, null, (y)object4);
        this.p = u8;
    }

    @Override
    protected void A(z z8) {
        this.q = z8;
        this.B(this.n);
    }

    @Override
    protected void C() {
    }

    @Override
    public void e(C c8) {
        ((i0)c8).w();
    }

    @Override
    public C i(F.b u8, ax.m1.b object, long l8) {
        k k8 = this.h;
        g.a a8 = this.i;
        z z8 = this.q;
        v v8 = this.j;
        l8 = this.k;
        object = this.l;
        N.a a9 = this.u((F.b)((Object)u8));
        boolean bl = this.m;
        u8 = this.p;
        u8 = u8 != null ? (c)u8.get() : null;
        return new i0(k8, a8, z8, v8, l8, (m)object, a9, bl, (c)((Object)u8));
    }

    @Override
    public y j() {
        return this.o;
    }

    @Override
    public void k() {
    }

    public static final class b {
        private final g.a a;
        private m b;
        private boolean c;
        private Object d;
        private String e;
        private u<c> f;

        public b(g.a a8) {
            this.a = ax.S0.a.e(a8);
            this.b = new ax.m1.k();
            this.c = true;
        }

        public j0 a(y.k k8, long l8) {
            return new j0(this.e, k8, this.a, l8, this.b, this.c, this.d, this.f);
        }

        public b b(m m8) {
            if (m8 == null) {
                m8 = new ax.m1.k();
            }
            this.b = m8;
            return this;
        }
    }
}

