package ax.r9;

import ax.Q8.F;
import ax.Q8.g;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.v;
import ax.R8.k;
import ax.R8.w;
import ax.R8.x;
import ax.Xd.f;
import ax.i9.C2292d;
import ax.j9.C2339b;
import ax.k9.e;
import ax.l9.C2483a;
import ax.l9.C2488f;
import ax.l9.n;
import ax.n9.C2626c;
import ax.n9.C2628e;
import ax.n9.C2629f;
import ax.p9.C2784b;
import ax.p9.InterfaceC2785c;
import ax.s9.C3066c;
import ax.s9.i;
import ax.s9.j;
import ax.s9.m;
import ax.s9.o;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;

/* renamed from: ax.r9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3016b implements AutoCloseable {
    private static final ax.Xd.d p0 = f.k(C3016b.class);
    private C2483a c0;
    private final C2292d d0;
    private C2626c e0;
    private final InterfaceC2785c f0;
    private n g0;
    private C2488f h0;
    private C2339b l0;
    private boolean n0;
    private long o0;
    private long q;
    private d i0 = new d();
    private Map<String, C3016b> j0 = new HashMap();
    private ReentrantReadWriteLock k0 = new ReentrantReadWriteLock();
    private c m0 = new c();

    /* renamed from: ax.r9.b$a */
    class a implements InterfaceC2785c.b<m> {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // ax.p9.InterfaceC2785c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(e eVar) {
            C3016b c3016b = C3016b.this;
            if (!eVar.d(this.a)) {
                C3016b.p0.a("Re-routing the connection to host {}", eVar.a());
                c3016b = C3016b.this.m(eVar);
            }
            if (eVar.e(this.a)) {
                return null;
            }
            return c3016b.b(eVar.c());
        }
    }

    public C3016b(C2483a c2483a, C2292d c2292d, C2339b c2339b, C2626c c2626c, InterfaceC2785c interfaceC2785c, n nVar, C2488f c2488f) {
        this.c0 = c2483a;
        this.d0 = c2292d;
        this.l0 = c2339b;
        this.e0 = c2626c;
        this.f0 = interfaceC2785c;
        this.g0 = nVar;
        this.h0 = c2488f;
        if (c2626c != null) {
            c2626c.c(this);
        }
        this.n0 = false;
        L();
    }

    private void L() {
        this.o0 = System.currentTimeMillis() + 35000;
    }

    private m c(String str) {
        ax.c9.e eVar;
        x xVar;
        m jVar;
        e eVar2 = new e(this.c0.A0(), str);
        p0.C("Connecting to {} on session {}", eVar2, Long.valueOf(this.q));
        try {
            w wVar = new w(this.c0.s0().a(), eVar2, this.q);
            wVar.c().s(256);
            xVar = (x) ax.a9.d.a(H(wVar), this.d0.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q);
        } catch (ax.c9.e e) {
            e = e;
        }
        try {
            m mVar = (m) this.f0.c(this, xVar, eVar2, new a(eVar2));
            if (mVar != null) {
                return mVar;
            }
        } catch (ax.c9.e e2) {
            eVar = e2;
            throw new ax.k9.d(eVar);
        } catch (C2784b unused) {
        }
        try {
            if (ax.K8.a.h(xVar.c().m())) {
                p0.n(xVar.c().toString());
                throw new F(xVar.c(), "Could not connect to " + eVar2);
            }
            if (xVar.n().contains(v.SMB2_SHARE_CAP_ASYMMETRIC)) {
                throw new ax.k9.d("ASYMMETRIC capability unsupported");
            }
            o oVar = new o(xVar.c().n(), eVar2, this, xVar.n(), this.d0, this.c0.o0(), this.e0, xVar.o(), xVar.p());
            if (xVar.q()) {
                jVar = new C3066c(eVar2, oVar, this.f0);
            } else if (xVar.r()) {
                jVar = new i(eVar2, oVar);
            } else {
                if (!xVar.s()) {
                    throw new ax.k9.d("Unknown ShareType returned in the TREE_CONNECT Response");
                }
                jVar = new j(eVar2, oVar);
            }
            this.i0.d(jVar);
            return jVar;
        } catch (ax.c9.e e3) {
            e = e3;
            eVar = e;
            throw new ax.k9.d(eVar);
        }
    }

    private C3016b d(e eVar) {
        try {
            return j().d0().a(eVar.a()).v(g());
        } catch (IOException e) {
            throw new F(ax.K8.a.STATUS_OTHER.getValue(), ax.Q8.m.SMB2_NEGOTIATE, "Could not connect to DFS root " + eVar, e);
        }
    }

    @ax.jc.c
    private void e(C2629f c2629f) {
        if (c2629f.a() == this.q) {
            p0.s("Notified of TreeDisconnected <<{}>>", Long.valueOf(c2629f.b()));
            this.i0.a(c2629f.b());
        }
    }

    public boolean A() {
        return this.m0.i();
    }

    public void F() throws ax.c9.e {
        try {
            p0.C("Logging off session {} from host {}", Long.valueOf(this.q), this.c0.A0());
            for (m mVar : this.i0.b()) {
                try {
                    mVar.close();
                } catch (ax.k9.d | IOException e) {
                    p0.p("Caught exception while closing TreeConnect with id: {}", Long.valueOf(mVar.g().f()), e);
                }
            }
            this.k0.writeLock().lock();
            try {
                for (C3016b c3016b : this.j0.values()) {
                    p0.C("Logging off nested session {} for session {}", Long.valueOf(c3016b.p()), Long.valueOf(this.q));
                    try {
                        c3016b.F();
                    } catch (ax.c9.e unused) {
                        p0.t("Caught exception while logging off nested session {}", Long.valueOf(c3016b.p()));
                    }
                }
                this.k0.writeLock().unlock();
                k kVar = (k) ax.a9.d.a(H(new k(this.c0.s0().a(), this.q)), this.d0.D(), TimeUnit.MILLISECONDS, ax.c9.e.q);
                if (ax.K8.a.j(kVar.c().m())) {
                    return;
                }
                throw new F(kVar.c(), "Could not logoff session <<" + this.q + ">>");
            } catch (Throwable th) {
                this.k0.writeLock().unlock();
                throw th;
            }
        } finally {
            this.e0.b(new C2628e(this.q));
            this.n0 = true;
        }
    }

    public <T extends q> Future<T> H(q qVar) throws ax.c9.e {
        SecretKey q = q(qVar.c(), true);
        if (this.m0.i() && q == null) {
            throw new ax.c9.e("Message signing is required, but no signing key is negotiated");
        }
        L();
        return d0() ? this.c0.L0(this.h0.g(qVar, this.m0.c())) : A() ? this.c0.L0(this.g0.b(qVar, q)) : (this.c0.s0().a() == g.SMB_3_1_1 && this.c0.o0().l() && q != null) ? this.c0.L0(this.g0.b(qVar, q)) : this.c0.L0(qVar);
    }

    public void W(long j) {
        this.q = j;
    }

    public m b(String str) {
        if (str.contains("\\")) {
            throw new IllegalArgumentException(String.format("Share name (%s) cannot contain '\\' characters.", str));
        }
        m c = this.i0.c(str);
        if (c == null) {
            return c(str);
        }
        p0.d("Returning cached Share {} for {}", c, str);
        return c;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        F();
    }

    public boolean d0() throws ax.c9.e {
        if (this.m0.g() && this.m0.c() == null) {
            throw new ax.c9.e("Message encryption is required, but no encryption key is negotiated");
        }
        return this.m0.g() | (this.m0.c() != null && this.c0.o0().a());
    }

    public void f() {
        this.o0 = 0L;
    }

    public C2339b g() {
        return this.l0;
    }

    public boolean isClosed() {
        return this.n0;
    }

    public C2483a j() {
        return this.c0;
    }

    public C3016b m(e eVar) {
        this.k0.readLock().lock();
        try {
            C3016b c3016b = this.j0.get(eVar.a());
            if (c3016b != null) {
                return c3016b;
            }
            this.k0.readLock().unlock();
            this.k0.writeLock().lock();
            try {
                C3016b c3016b2 = this.j0.get(eVar.a());
                if (c3016b2 == null) {
                    c3016b2 = d(eVar);
                    this.j0.put(eVar.a(), c3016b2);
                }
                this.k0.readLock().lock();
                this.k0.writeLock().unlock();
                return c3016b2;
            } catch (Throwable th) {
                this.k0.writeLock().unlock();
                throw th;
            }
        } finally {
            this.k0.readLock().unlock();
        }
    }

    public c o() {
        return this.m0;
    }

    public long p() {
        return this.q;
    }

    public SecretKey q(t tVar, boolean z) {
        if (!this.c0.s0().a().j()) {
            return this.m0.e();
        }
        if (tVar.h() == ax.Q8.m.SMB2_SESSION_SETUP) {
            if (z) {
                return this.m0.f();
            }
            if (tVar.m() != ax.K8.a.STATUS_SUCCESS.getValue()) {
                return this.m0.f();
            }
        }
        return this.m0.f();
    }

    public boolean u() {
        return this.o0 < System.currentTimeMillis();
    }

    public boolean v() {
        return this.m0.h();
    }
}
