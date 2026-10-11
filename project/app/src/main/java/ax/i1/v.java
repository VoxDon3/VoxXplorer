/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.N1.t;
import ax.P0.y;
import ax.b1.z;
import ax.i1.C;
import ax.i1.E;
import ax.i1.F;
import ax.i1.a;
import ax.i1.h0;
import ax.i1.t;
import ax.i1.u;
import ax.m1.f;
import ax.m1.m;

public final class v
extends a {
    private final t h;
    private final long i;
    private y j;

    private v(y y8, long l8, t t8) {
        this.j = y8;
        this.i = l8;
        this.h = t8;
    }

    @Override
    protected void A(ax.U0.z z8) {
        this.B(new h0(this.i, true, false, false, null, this.j()));
    }

    @Override
    protected void C() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(y y8) {
        synchronized (this) {
            this.j = y8;
            return;
        }
    }

    @Override
    public void e(C c8) {
        ((u)c8).k();
    }

    @Override
    public C i(F.b object, ax.m1.b b8, long l8) {
        object = this.j();
        ax.S0.a.e(((y)object).b);
        ax.S0.a.f(((y)object).b.b, "Externally loaded mediaItems require a MIME type.");
        object = ((y)object).b;
        return new u(((y.h)object).a, ((y.h)object).b, this.h);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public y j() {
        synchronized (this) {
            return this.j;
        }
    }

    @Override
    public void k() {
    }

    public static final class b
    implements F.a {
        private final long a;
        private final t b;

        public b(long l8, t t8) {
            this.a = l8;
            this.b = t8;
        }

        @Override
        public /* synthetic */ F.a a(t.a a8) {
            return E.d(this, a8);
        }

        @Override
        public /* synthetic */ F.a b(int n8) {
            return E.b(this, n8);
        }

        @Override
        public /* synthetic */ F.a c(boolean bl) {
            return E.a(this, bl);
        }

        @Override
        public /* synthetic */ F.a d(f.a a8) {
            return E.c(this, a8);
        }

        @Override
        public F.a f(z z8) {
            return this;
        }

        @Override
        public F.a g(m m8) {
            return this;
        }

        public v h(y y8) {
            return new v(y8, this.a, this.b);
        }
    }
}

