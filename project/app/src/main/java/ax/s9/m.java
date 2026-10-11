/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.J8.a;
import ax.Q8.F;
import ax.Q8.d;
import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.l;
import ax.Q8.t;
import ax.R8.A;
import ax.R8.c;
import ax.R8.h;
import ax.R8.n;
import ax.R8.p;
import ax.R8.q;
import ax.R8.r;
import ax.R8.s;
import ax.R8.u;
import ax.R8.z;
import ax.c9.e;
import ax.r9.b;
import ax.s9.n;
import ax.s9.o;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class m
implements AutoCloseable {
    private static final i o0 = new i(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
    private static final n p0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.c0.getValue() || l8 == ax.K8.a.k0.getValue();
            {
            }
        }
    };
    private static final n q0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.c0.getValue() || l8 == ax.K8.a.j0.getValue() || l8 == ax.K8.a.o0.getValue();
            {
            }
        }
    };
    private static final n r0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.c0.getValue() || l8 == ax.K8.a.q0.getValue();
            {
            }
        }
    };
    private static final n s0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.c0.getValue() || l8 == ax.K8.a.i1.getValue();
            {
            }
        }
    };
    private static final ax.o9.d t0 = new ax.o9.d(0L);
    protected final o c0;
    private final long d0;
    protected b e0;
    private final g f0;
    private final int g0;
    private final long h0;
    private final int i0;
    private final long j0;
    private final int k0;
    private final long l0;
    private final long m0;
    private final AtomicBoolean n0 = new AtomicBoolean(false);
    protected final ax.k9.e q;

    m(ax.k9.e object, o o8) {
        this.q = object;
        this.c0 = o8;
        this.e0 = o8.d();
        ax.l9.c c8 = o8.c();
        this.f0 = c8.a();
        object = o8.b();
        this.g0 = Math.min(((ax.i9.d)object).I(), c8.b());
        this.h0 = ((ax.i9.d)object).J();
        this.i0 = Math.min(((ax.i9.d)object).S(), c8.d());
        this.j0 = ((ax.i9.d)object).T();
        this.k0 = Math.min(((ax.i9.d)object).P(), c8.c());
        this.l0 = ((ax.i9.d)object).Q();
        this.m0 = this.e0.p();
        this.d0 = o8.f();
    }

    private <T extends ax.Q8.q> Future<T> W(ax.Q8.q future) {
        if (this.q()) {
            try {
                future = this.e0.H((ax.Q8.q)((Object)future));
                return future;
            }
            catch (e e8) {
                throw new ax.k9.d(e8);
            }
        }
        future = new StringBuilder();
        ((StringBuilder)((Object)future)).append(this.getClass().getSimpleName());
        ((StringBuilder)((Object)future)).append(" has already been closed");
        throw new ax.k9.d(((StringBuilder)((Object)future)).toString());
    }

    private <T extends ax.Q8.q> T d0(ax.Q8.q q8, String string, Object object, n n8, long l8) {
        return this.L(this.W(q8), string, object, n8, l8);
    }

    s A(i i8, long l8, int n8) {
        return this.L(this.F(i8, l8, n8), "Read", i8, r0, this.h0);
    }

    Future<s> F(i i8, long l8, int n8) {
        return this.W(new r(this.f0, i8, this.m0, this.d0, l8, Math.min(n8, this.g0)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <T extends ax.Q8.q> T H(Future<T> object, long l8) {
        if (l8 > 0L) {
            try {
                return (T)((ax.Q8.q)ax.a9.d.a(object, l8, TimeUnit.MILLISECONDS, e.q));
            }
            catch (e e8) {
                throw new ax.k9.d(e8);
            }
        }
        object = (ax.Q8.q)ax.a9.d.b(object, e.q);
        return (T)object;
    }

    <T extends ax.Q8.q> T L(Future<T> object, String string, Object object2, n object3, long l8) {
        if (object3.a(((t)((ax.h9.d)(object = this.H((Future<T>)object, l8))).c()).m())) {
            return (T)object;
        }
        object = (t)((ax.h9.d)object).c();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append(string);
        ((StringBuilder)object3).append(" failed for ");
        ((StringBuilder)object3).append(object2);
        throw new F((t)object, ((StringBuilder)object3).toString());
    }

    void a(i i8) throws F {
        this.d0(new c(this.f0, this.m0, this.d0, i8), "Close", i8, s0, this.l0);
    }

    ax.R8.e b(ax.k9.e e8, l l8, Set<a> set, Set<ax.L8.a> set2, Set<ax.Q8.u> set3, d d8, Set<ax.Q8.e> set4) {
        return (ax.R8.e)this.d0(new ax.R8.d(this.f0, this.m0, this.d0, l8, set, set2, set3, d8, set4, e8), "Create", e8, this.c(), this.l0);
    }

    protected n c() {
        return p0;
    }

    @Override
    public void close() throws IOException {
        if (!this.n0.getAndSet(true)) {
            this.c0.a();
        }
    }

    int d() {
        return this.g0;
    }

    long e() {
        return this.h0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        m m8 = (m)object;
        object = this.q;
        return !(object == null ? m8.q != null : !((ax.k9.e)object).equals(m8.q));
    }

    public ax.k9.e f() {
        return this.q;
    }

    public o g() {
        return this.c0;
    }

    public int hashCode() {
        ax.k9.e e8 = this.q;
        int n8 = e8 == null ? 0 : e8.hashCode();
        return 31 + n8;
    }

    int j() {
        return this.i0;
    }

    long m() {
        return this.j0;
    }

    public Future<ax.R8.i> o(long l8, boolean bl, ax.o9.c c8) {
        return this.p(o0, l8, bl, c8, -1);
    }

    void o0(i i8, u.a a8, Set<Object> set, ax.L8.b b8, byte[] byArray) {
        this.d0(new u(this.f0, this.m0, this.d0, a8, i8, b8, set, byArray), "SetInfo", i8, n.a, this.l0);
    }

    Future<ax.R8.i> p(i object, long l8, boolean bl, ax.o9.c c8, int n8) {
        block4: {
            block7: {
                block6: {
                    int n9;
                    block5: {
                        if (c8 == null) {
                            c8 = t0;
                        }
                        c8.f(this.k0 + 1);
                        int n10 = c8.a();
                        n9 = this.k0;
                        if (n10 > n9) break block4;
                        if (n8 >= 0) break block5;
                        n8 = n9;
                        break block6;
                    }
                    if (n8 > n9) break block7;
                }
                return this.W(new h(this.f0, this.m0, this.d0, l8, (i)object, c8, bl, n8));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Output data size exceeds maximum allowed by server: ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" > ");
            ((StringBuilder)object).append(this.k0);
            throw new ax.k9.d(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Input data size exceeds maximum allowed by server: ");
        ((StringBuilder)object).append(c8.a());
        ((StringBuilder)object).append(" > ");
        ((StringBuilder)object).append(this.k0);
        throw new ax.k9.d(((StringBuilder)object).toString());
    }

    public boolean q() {
        return this.n0.get() ^ true;
    }

    A s0(i i8, ax.o9.c c8) {
        return this.L(this.u0(i8, c8), "Write", i8, n.a, this.j0);
    }

    ax.R8.o u(i i8, Set<n.a> set, ax.L8.b b8, String string) {
        return (ax.R8.o)this.d0(new ax.R8.n(this.f0, this.m0, this.d0, i8, b8, set, 0L, string, this.k0), "Query directory", i8, q0, this.l0);
    }

    Future<A> u0(i i8, ax.o9.c c8) {
        c8.f(this.i0);
        return this.W(new z(this.f0, i8, this.m0, this.d0, c8, this.i0));
    }

    public q v(i i8, p.a a8, Set<Object> set, ax.L8.b b8, ax.L8.d d8) {
        return (q)this.d0(new p(this.f0, this.m0, this.d0, i8, a8, b8, d8, null, set), "QueryInfo", i8, n.a, this.l0);
    }
}

