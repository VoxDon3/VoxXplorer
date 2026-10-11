package ax.s9;

import ax.Q8.EnumC0920d;
import ax.Q8.EnumC0921e;
import ax.Q8.F;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.u;
import ax.R8.A;
import ax.R8.n;
import ax.R8.p;
import ax.R8.r;
import ax.R8.s;
import ax.R8.u;
import ax.R8.z;
import ax.i9.C2292d;
import ax.l9.C2485c;
import ax.o9.AbstractC2736c;
import ax.o9.C2737d;
import ax.r9.C3016b;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class m implements AutoCloseable {
    private static final ax.Q8.i o0 = new ax.Q8.i(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
    private static final n p0 = new a();
    private static final n q0 = new b();
    private static final n r0 = new c();
    private static final n s0 = new d();
    private static final C2737d t0 = new C2737d(0);
    protected final o c0;
    private final long d0;
    protected C3016b e0;
    private final ax.Q8.g f0;
    private final int g0;
    private final long h0;
    private final int i0;
    private final long j0;
    private final int k0;
    private final long l0;
    private final long m0;
    private final AtomicBoolean n0 = new AtomicBoolean(false);
    protected final ax.k9.e q;

    class a implements n {
        a() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_SUCCESS.getValue() || j == ax.K8.a.STATUS_STOPPED_ON_SYMLINK.getValue();
        }
    }

    class b implements n {
        b() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_SUCCESS.getValue() || j == ax.K8.a.STATUS_NO_MORE_FILES.getValue() || j == ax.K8.a.STATUS_NO_SUCH_FILE.getValue();
        }
    }

    class c implements n {
        c() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_SUCCESS.getValue() || j == ax.K8.a.STATUS_END_OF_FILE.getValue();
        }
    }

    class d implements n {
        d() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_SUCCESS.getValue() || j == ax.K8.a.STATUS_FILE_CLOSED.getValue();
        }
    }

    m(ax.k9.e eVar, o oVar) {
        this.q = eVar;
        this.c0 = oVar;
        this.e0 = oVar.d();
        C2485c c2 = oVar.c();
        this.f0 = c2.a();
        C2292d b2 = oVar.b();
        this.g0 = Math.min(b2.I(), c2.b());
        this.h0 = b2.J();
        this.i0 = Math.min(b2.S(), c2.d());
        this.j0 = b2.T();
        this.k0 = Math.min(b2.P(), c2.c());
        this.l0 = b2.Q();
        this.m0 = this.e0.p();
        this.d0 = oVar.f();
    }

    private <T extends q> Future<T> W(q qVar) {
        if (q()) {
            try {
                return this.e0.H(qVar);
            } catch (ax.c9.e e) {
                throw new ax.k9.d(e);
            }
        }
        throw new ax.k9.d(getClass().getSimpleName() + " has already been closed");
    }

    private <T extends q> T d0(q qVar, String str, Object obj, n nVar, long j) {
        return (T) L(W(qVar), str, obj, nVar, j);
    }

    s A(ax.Q8.i iVar, long j, int i) {
        return (s) L(F(iVar, j, i), "Read", iVar, r0, this.h0);
    }

    Future<s> F(ax.Q8.i iVar, long j, int i) {
        return W(new r(this.f0, iVar, this.m0, this.d0, j, Math.min(i, this.g0)));
    }

    <T extends q> T H(Future<T> future, long j) {
        try {
            return j > 0 ? (T) ax.a9.d.a(future, j, TimeUnit.MILLISECONDS, ax.c9.e.q) : (T) ax.a9.d.b(future, ax.c9.e.q);
        } catch (ax.c9.e e) {
            throw new ax.k9.d(e);
        }
    }

    <T extends q> T L(Future<T> future, String str, Object obj, n nVar, long j) {
        T t = (T) H(future, j);
        if (nVar.a(((t) t.c()).m())) {
            return t;
        }
        throw new F((t) t.c(), str + " failed for " + obj);
    }

    void a(ax.Q8.i iVar) throws F {
        d0(new ax.R8.c(this.f0, this.m0, this.d0, iVar), "Close", iVar, s0, this.l0);
    }

    ax.R8.e b(ax.k9.e eVar, ax.Q8.l lVar, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        return (ax.R8.e) d0(new ax.R8.d(this.f0, this.m0, this.d0, lVar, set, set2, set3, enumC0920d, set4, eVar), "Create", eVar, c(), this.l0);
    }

    protected n c() {
        return p0;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.n0.getAndSet(true)) {
            return;
        }
        this.c0.a();
    }

    int d() {
        return this.g0;
    }

    long e() {
        return this.h0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        ax.k9.e eVar = this.q;
        if (eVar == null) {
            if (mVar.q != null) {
                return false;
            }
        } else if (!eVar.equals(mVar.q)) {
            return false;
        }
        return true;
    }

    public ax.k9.e f() {
        return this.q;
    }

    public o g() {
        return this.c0;
    }

    public int hashCode() {
        ax.k9.e eVar = this.q;
        return 31 + (eVar == null ? 0 : eVar.hashCode());
    }

    int j() {
        return this.i0;
    }

    long m() {
        return this.j0;
    }

    public Future<ax.R8.i> o(long j, boolean z, AbstractC2736c abstractC2736c) {
        return p(o0, j, z, abstractC2736c, -1);
    }

    void o0(ax.Q8.i iVar, u.a aVar, Set<Object> set, ax.L8.b bVar, byte[] bArr) {
        d0(new ax.R8.u(this.f0, this.m0, this.d0, aVar, iVar, bVar, set, bArr), "SetInfo", iVar, n.a, this.l0);
    }

    Future<ax.R8.i> p(ax.Q8.i iVar, long j, boolean z, AbstractC2736c abstractC2736c, int i) {
        int i2;
        AbstractC2736c abstractC2736c2 = abstractC2736c == null ? t0 : abstractC2736c;
        abstractC2736c2.f(this.k0 + 1);
        int a2 = abstractC2736c2.a();
        int i3 = this.k0;
        if (a2 > i3) {
            throw new ax.k9.d("Input data size exceeds maximum allowed by server: " + abstractC2736c2.a() + " > " + this.k0);
        }
        if (i < 0) {
            i2 = i3;
        } else {
            if (i > i3) {
                throw new ax.k9.d("Output data size exceeds maximum allowed by server: " + i + " > " + this.k0);
            }
            i2 = i;
        }
        return W(new ax.R8.h(this.f0, this.m0, this.d0, j, iVar, abstractC2736c2, z, i2));
    }

    public boolean q() {
        return !this.n0.get();
    }

    A s0(ax.Q8.i iVar, AbstractC2736c abstractC2736c) {
        return (A) L(u0(iVar, abstractC2736c), "Write", iVar, n.a, this.j0);
    }

    ax.R8.o u(ax.Q8.i iVar, Set<n.a> set, ax.L8.b bVar, String str) {
        return (ax.R8.o) d0(new ax.R8.n(this.f0, this.m0, this.d0, iVar, bVar, set, 0L, str, this.k0), "Query directory", iVar, q0, this.l0);
    }

    Future<A> u0(ax.Q8.i iVar, AbstractC2736c abstractC2736c) {
        abstractC2736c.f(this.i0);
        return W(new z(this.f0, iVar, this.m0, this.d0, abstractC2736c, this.i0));
    }

    public ax.R8.q v(ax.Q8.i iVar, p.a aVar, Set<Object> set, ax.L8.b bVar, ax.L8.d dVar) {
        return (ax.R8.q) d0(new p(this.f0, this.m0, this.d0, iVar, aVar, bVar, dVar, null, set), "QueryInfo", iVar, n.a, this.l0);
    }
}
