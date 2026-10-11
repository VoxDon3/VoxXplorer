package ax.p9;

import ax.H8.c;
import ax.H8.d;
import ax.Q8.F;
import ax.Q8.q;
import ax.R8.i;
import ax.Xd.f;
import ax.Z8.a;
import ax.h9.C2171b;
import ax.o9.C2735b;
import ax.p9.InterfaceC2785c;
import ax.r9.C3016b;
import ax.s9.m;
import ax.s9.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.p9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2783a implements InterfaceC2785c {
    private static final ax.Xd.d g = f.k(C2783a.class);
    private final n b;
    private final InterfaceC2785c c;
    private ax.H8.d d = new ax.H8.d();
    private ax.H8.c e = new ax.H8.c();
    private long f;

    /* renamed from: ax.p9.a$a, reason: collision with other inner class name */
    class C0421a implements n {
        final /* synthetic */ InterfaceC2785c b;

        C0421a(InterfaceC2785c interfaceC2785c) {
            this.b = interfaceC2785c;
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_PATH_NOT_COVERED.getValue() || this.b.a().a(j);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.p9.a$b */
    class b<T> implements InterfaceC2785c.b<T> {
        final /* synthetic */ ax.k9.e a;
        final /* synthetic */ InterfaceC2785c.b b;

        b(ax.k9.e eVar, InterfaceC2785c.b bVar) {
            this.a = eVar;
            this.b = bVar;
        }

        @Override // ax.p9.InterfaceC2785c.b
        public T a(ax.k9.e eVar) {
            C2783a.g.C("DFS resolved {} -> {}", this.a, eVar);
            return (T) this.b.a(eVar);
        }
    }

    /* renamed from: ax.p9.a$c */
    private enum c {
        DOMAIN,
        DC,
        SYSVOL,
        ROOT,
        LINK
    }

    /* renamed from: ax.p9.a$d */
    private static class d {
        long a;
        d.a b;
        c.a c;

        /* synthetic */ d(long j, C0421a c0421a) {
            this(j);
        }

        private d(long j) {
            this.a = j;
        }
    }

    /* renamed from: ax.p9.a$e */
    private static class e<T> {
        final InterfaceC2785c.b<T> a;
        ax.H8.b b;
        boolean c = false;
        boolean d = false;
        String e = null;

        e(ax.H8.b bVar, InterfaceC2785c.b<T> bVar2) {
            this.b = bVar;
            this.a = bVar2;
        }

        public String toString() {
            return "ResolveState{path=" + this.b + ", resolvedDomainEntry=" + this.c + ", isDFSPath=" + this.d + ", hostName='" + this.e + "'}";
        }
    }

    public C2783a(InterfaceC2785c interfaceC2785c, long j) {
        this.c = interfaceC2785c;
        this.f = j;
        this.b = new C0421a(interfaceC2785c);
    }

    private d e(c cVar, m mVar, ax.H8.b bVar) throws ax.c9.e, a.b {
        ax.I8.e eVar = new ax.I8.e(bVar.h());
        C2171b c2171b = new C2171b();
        eVar.a(c2171b);
        return g(cVar, (i) ax.a9.d.a(mVar.o(393620L, true, new C2735b(c2171b)), this.f, TimeUnit.MILLISECONDS, ax.c9.e.q), bVar);
    }

    private void f(d dVar, ax.I8.f fVar) {
        if (fVar.c() < 3) {
            return;
        }
        c.a aVar = new c.a(fVar);
        this.e.b(aVar);
        dVar.c = aVar;
    }

    private d g(c cVar, i iVar, ax.H8.b bVar) throws a.b {
        d dVar = new d(iVar.c().m(), null);
        if (dVar.a != ax.K8.a.STATUS_SUCCESS.getValue()) {
            return dVar;
        }
        ax.I8.f fVar = new ax.I8.f(bVar.h());
        fVar.d(new C2171b(iVar.n()));
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            throw new UnsupportedOperationException(c.DOMAIN + " not used yet.");
        }
        if (ordinal == 1) {
            f(dVar, fVar);
            return dVar;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            h(dVar, fVar);
            return dVar;
        }
        throw new IllegalStateException("Encountered unhandled DFS RequestType: " + cVar);
    }

    private void h(d dVar, ax.I8.f fVar) {
        if (fVar.a().isEmpty()) {
            dVar.a = ax.K8.a.STATUS_OBJECT_PATH_NOT_FOUND.getValue();
            return;
        }
        d.a aVar = new d.a(fVar, this.e);
        g.a("Got DFS Referral result: {}", aVar);
        this.d.c(aVar);
        dVar.b = aVar;
    }

    private d i(c cVar, String str, C3016b c3016b, ax.H8.b bVar) throws ax.H8.a {
        if (!str.equals(c3016b.j().A0())) {
            try {
                c3016b = c3016b.j().d0().a(str).v(c3016b.g());
            } catch (IOException e2) {
                throw new ax.H8.a(e2);
            }
        }
        try {
            return e(cVar, c3016b.b("IPC$"), bVar);
        } catch (a.b | IOException e3) {
            throw new ax.H8.a(e3);
        }
    }

    private <T> T j(C3016b c3016b, ax.k9.e eVar, InterfaceC2785c.b<T> bVar) throws C2784b {
        g.a("Starting DFS resolution for {}", eVar.h());
        return (T) k(c3016b, new e<>(new ax.H8.b(eVar.h()), bVar));
    }

    private <T> T k(C3016b c3016b, e<T> eVar) throws ax.H8.a {
        g.g("DFS[1]: {}", eVar);
        return (eVar.b.b() || eVar.b.c()) ? (T) n(eVar) : (T) q(c3016b, eVar);
    }

    private <T> T l(C3016b c3016b, e<T> eVar, c.a aVar) throws ax.H8.a {
        g.g("DFS[10]: {}", eVar);
        d i = i(c.SYSVOL, aVar.a(), c3016b, eVar.b);
        return ax.K8.a.j(i.a) ? (T) r(c3016b, eVar, i.b) : (T) o(c3016b, eVar, i);
    }

    private <T> T m(C3016b c3016b, e<T> eVar, d.a aVar) throws ax.H8.a {
        g.g("DFS[11]: {}", eVar);
        eVar.b = eVar.b.e(aVar.b(), aVar.c().a());
        eVar.d = true;
        return (T) q(c3016b, eVar);
    }

    private <T> T n(e<T> eVar) {
        g.g("DFS[12]: {}", eVar);
        return eVar.a.a(ax.k9.e.f(eVar.b.h()));
    }

    private <T> T o(C3016b c3016b, e<T> eVar, d dVar) throws ax.H8.a {
        g.g("DFS[13]: {}", eVar);
        throw new ax.H8.a(dVar.a, "Cannot get DC for domain '" + eVar.b.a().get(0) + "'");
    }

    private <T> T p(C3016b c3016b, e<T> eVar, d dVar) throws ax.H8.a {
        g.g("DFS[14]: {}", eVar);
        throw new ax.H8.a(dVar.a, "DFS request failed for path " + eVar.b);
    }

    private <T> T q(C3016b c3016b, e<T> eVar) throws ax.H8.a {
        g.g("DFS[2]: {}", eVar);
        d.a b2 = this.d.b(eVar.b);
        return (b2 == null || (b2.d() && b2.g())) ? (T) t(c3016b, eVar) : b2.d() ? (T) x(c3016b, eVar, b2) : b2.f() ? (T) s(c3016b, eVar, b2) : (T) r(c3016b, eVar, b2);
    }

    private <T> T r(C3016b c3016b, e<T> eVar, d.a aVar) {
        g.g("DFS[3]: {}", eVar);
        d.c c2 = aVar.c();
        ax.H8.b bVar = eVar.b;
        F e2 = null;
        while (c2 != null) {
            try {
                eVar.b = eVar.b.e(aVar.b(), aVar.c().a());
                eVar.d = true;
                return (T) w(c3016b, eVar, aVar);
            } catch (F e3) {
                e2 = e3;
                if (e2.b() != ax.K8.a.STATUS_PATH_NOT_COVERED.getValue()) {
                    c2 = aVar.h();
                    eVar.b = bVar;
                }
            }
        }
        if (e2 != null) {
            throw e2;
        }
        throw new IllegalStateException("Unknown error resolving DFS");
    }

    private <T> T s(C3016b c3016b, e<T> eVar, d.a aVar) throws ax.H8.a {
        g.g("DFS[4]: {}", eVar);
        return eVar.b.d() ? (T) r(c3016b, eVar, aVar) : aVar.e() ? (T) m(c3016b, eVar, aVar) : (T) r(c3016b, eVar, aVar);
    }

    private <T> T t(C3016b c3016b, e<T> eVar) throws ax.H8.a {
        g.g("DFS[5]: {}", eVar);
        String str = eVar.b.a().get(0);
        c.a a = this.e.a(str);
        if (a == null) {
            eVar.e = str;
            eVar.c = false;
            return (T) u(c3016b, eVar);
        }
        if (a.a() == null || a.a().isEmpty()) {
            d i = i(c.DC, c3016b.g().a(), c3016b, eVar.b);
            if (!ax.K8.a.j(i.a)) {
                return (T) o(c3016b, eVar, i);
            }
            a = i.c;
        }
        if (eVar.b.d()) {
            return (T) l(c3016b, eVar, a);
        }
        eVar.e = a.a();
        eVar.c = true;
        return (T) u(c3016b, eVar);
    }

    private <T> T u(C3016b c3016b, e<T> eVar) throws ax.H8.a {
        g.g("DFS[6]: {}", eVar);
        d i = i(c.ROOT, eVar.b.a().get(0), c3016b, eVar.b);
        return ax.K8.a.j(i.a) ? (T) v(c3016b, eVar, i.b) : eVar.c ? (T) o(c3016b, eVar, i) : eVar.d ? (T) p(c3016b, eVar, i) : (T) n(eVar);
    }

    private <T> T v(C3016b c3016b, e<T> eVar, d.a aVar) throws ax.H8.a {
        g.g("DFS[7]: {}", eVar);
        return aVar.g() ? (T) r(c3016b, eVar, aVar) : (T) s(c3016b, eVar, aVar);
    }

    private <T> T w(C3016b c3016b, e<T> eVar, d.a aVar) {
        g.g("DFS[8]: {}", eVar);
        return eVar.a.a(ax.k9.e.f(eVar.b.h()));
    }

    private <T> T x(C3016b c3016b, e<T> eVar, d.a aVar) throws ax.H8.a {
        ax.Xd.d dVar = g;
        dVar.g("DFS[9]: {}", eVar);
        ax.H8.b bVar = new ax.H8.b(eVar.b.a().subList(0, 2));
        d.a b2 = this.d.b(bVar);
        if (b2 != null) {
            d i = i(c.LINK, b2.c().a().a().get(0), c3016b, eVar.b);
            return !ax.K8.a.j(i.a) ? (T) p(c3016b, eVar, i) : i.b.g() ? (T) r(c3016b, eVar, i.b) : (T) s(c3016b, eVar, i.b);
        }
        dVar.s("Could not find referral cache entry for {}", bVar);
        this.d.a(eVar.b);
        return (T) k(c3016b, eVar);
    }

    @Override // ax.p9.InterfaceC2785c
    public n a() {
        return this.b;
    }

    @Override // ax.p9.InterfaceC2785c
    public <T> T b(C3016b c3016b, ax.k9.e eVar, InterfaceC2785c.b<T> bVar) throws C2784b {
        T t = (T) j(c3016b, eVar, bVar);
        if (eVar.equals(t)) {
            return (T) this.c.b(c3016b, eVar, bVar);
        }
        g.C("DFS resolved {} -> {}", eVar, t);
        return t;
    }

    @Override // ax.p9.InterfaceC2785c
    public <T> T c(C3016b c3016b, q qVar, ax.k9.e eVar, InterfaceC2785c.b<T> bVar) throws C2784b {
        if (!c3016b.j().o0().q()) {
            return (T) this.c.c(c3016b, qVar, eVar, bVar);
        }
        if (eVar.b() != null && qVar.c().m() == ax.K8.a.STATUS_PATH_NOT_COVERED.getValue()) {
            g.C("DFS Share {} does not cover {}, resolve through DFS", eVar.c(), eVar);
            return (T) j(c3016b, eVar, new b(eVar, bVar));
        }
        if (eVar.b() != null || !ax.K8.a.h(qVar.c().m())) {
            return (T) this.c.c(c3016b, qVar, eVar, bVar);
        }
        g.a("Attempting to resolve {} through DFS", eVar);
        return (T) j(c3016b, eVar, bVar);
    }
}
