/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.N;
import ax.P0.y;
import ax.i1.C;
import ax.i1.F;
import ax.i1.m0;
import ax.i1.s0;
import ax.i1.w;
import ax.i1.z;

public final class A
extends s0 {
    private final boolean m;
    private final N.c n;
    private final N.b o;
    private a p;
    private z q;
    private boolean r;
    private boolean s;
    private boolean t;

    public A(F f8, boolean bl) {
        super(f8);
        bl = bl && f8.m();
        this.m = bl;
        this.n = new N.c();
        this.o = new N.b();
        N n8 = f8.o();
        if (n8 != null) {
            this.p = a.v(n8, null, null);
            this.t = true;
            return;
        }
        this.p = a.u(f8.j());
    }

    private Object U(Object object) {
        Object object2 = object;
        if (this.p.g != null) {
            object2 = object;
            if (this.p.g.equals(object)) {
                object2 = a.h;
            }
        }
        return object2;
    }

    private Object V(Object object) {
        Object object2 = object;
        if (this.p.g != null) {
            object2 = object;
            if (object.equals(a.h)) {
                object2 = this.p.g;
            }
        }
        return object2;
    }

    private boolean X(long l8) {
        z z8 = this.q;
        int n8 = this.p.b(z8.q.a);
        if (n8 == -1) {
            return false;
        }
        long l9 = this.p.f((int)n8, (N.b)this.o).d;
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8;
            if (l8 >= l9) {
                l10 = Math.max(0L, l9 - 1L);
            }
        }
        z8.w(l10);
        return true;
    }

    @Override
    public void C() {
        this.s = false;
        this.r = false;
        super.C();
    }

    @Override
    protected F.b J(F.b b8) {
        return b8.a(this.U(b8.a));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void P(N var1_1) {
        block7: {
            block6: {
                if (!this.s) break block6;
                this.p = this.p.t((N)var1_1);
                var1_1 = this.q;
                if (var1_1 != null) {
                    this.X(var1_1.o());
                }
                ** GOTO lbl-1000
            }
            if (!var1_1.q()) break block7;
            var1_1 = this.t != false ? this.p.t((N)var1_1) : a.v((N)var1_1, N.c.q, a.h);
            this.p = var1_1;
            ** GOTO lbl-1000
        }
        var1_1.n(0, this.n);
        var2_2 = this.n.c();
        var6_3 = this.n.a;
        var7_4 = this.q;
        if (var7_4 != null) {
            var4_5 = var7_4.p();
            this.p.h(this.q.q.a, this.o);
            var4_5 = this.o.o() + var4_5;
            if (var4_5 != this.p.n(0, this.n).c()) {
                var2_2 = var4_5;
            }
        }
        var7_4 = var1_1.j(this.n, this.o, 0, var2_2);
        var8_6 = var7_4.first;
        var2_2 = (Long)var7_4.second;
        var1_1 = this.t != false ? this.p.t((N)var1_1) : a.v((N)var1_1, var6_3, var8_6);
        this.p = var1_1;
        var1_1 = this.q;
        if (var1_1 != null && this.X(var2_2)) {
            var1_1 = var1_1.q;
            var1_1 = var1_1.a(this.V(var1_1.a));
        } else lbl-1000:
        // 3 sources

        {
            var1_1 = null;
        }
        this.t = true;
        this.s = true;
        this.B(this.p);
        if (var1_1 != null) {
            ax.S0.a.e(this.q).j((F.b)var1_1);
        }
    }

    @Override
    public void S() {
        if (!this.m) {
            this.r = true;
            this.R();
        }
    }

    public z T(F.b b8, ax.m1.b object, long l8) {
        object = new z(b8, (ax.m1.b)object, l8);
        ((z)object).y(this.k);
        if (this.s) {
            ((z)object).j(b8.a(this.V(b8.a)));
            return object;
        }
        this.q = object;
        if (!this.r) {
            this.r = true;
            this.R();
        }
        return object;
    }

    public N W() {
        return this.p;
    }

    @Override
    public void a(y y8) {
        this.p = this.t ? this.p.t(new m0(this.p.e, y8)) : a.u(y8);
        this.k.a(y8);
    }

    @Override
    public void e(C c8) {
        ((z)c8).x();
        if (c8 == this.q) {
            this.q = null;
        }
    }

    private static final class a
    extends w {
        public static final Object h = new Object();
        private final Object f;
        private final Object g;

        private a(N n8, Object object, Object object2) {
            super(n8);
            this.f = object;
            this.g = object2;
        }

        public static a u(y y8) {
            return new a(new b(y8), N.c.q, h);
        }

        public static a v(N n8, Object object, Object object2) {
            return new a(n8, object, object2);
        }

        @Override
        public int b(Object object) {
            N n8 = this.e;
            Object object2 = object;
            if (h.equals(object)) {
                Object object3 = this.g;
                object2 = object;
                if (object3 != null) {
                    object2 = object3;
                }
            }
            return n8.b(object2);
        }

        @Override
        public N.b g(int n8, N.b b8, boolean bl) {
            this.e.g(n8, b8, bl);
            if (j.Objects.equals((Object)b8.b, (Object)this.g) && bl) {
                b8.b = h;
            }
            return b8;
        }

        @Override
        public Object m(int n8) {
            Object object;
            Object object2 = object = this.e.m(n8);
            if (j.Objects.equals((Object)object, (Object)this.g)) {
                object2 = h;
            }
            return object2;
        }

        @Override
        public N.c o(int n8, N.c c8, long l8) {
            this.e.o(n8, c8, l8);
            if (j.Objects.equals((Object)c8.a, (Object)this.f)) {
                c8.a = N.c.q;
            }
            return c8;
        }

        public a t(N n8) {
            return new a(n8, this.f, this.g);
        }
    }

    public static final class b
    extends N {
        private final y e;

        public b(y y8) {
            this.e = y8;
        }

        @Override
        public int b(Object object) {
            if (object == a.h) {
                return 0;
            }
            return -1;
        }

        @Override
        public N.b g(int n8, N.b b8, boolean bl) {
            Object object = null;
            Integer n9 = bl ? Integer.valueOf(0) : null;
            if (bl) {
                object = a.h;
            }
            b8.u(n9, object, 0, -9223372036854775807L, 0L, ax.P0.b.g, true);
            return b8;
        }

        @Override
        public int i() {
            return 1;
        }

        @Override
        public Object m(int n8) {
            return a.h;
        }

        @Override
        public N.c o(int n8, N.c c8, long l8) {
            c8.g(N.c.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c8.k = true;
            return c8;
        }

        @Override
        public int p() {
            return 1;
        }
    }
}

