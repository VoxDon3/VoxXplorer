package ax.N8;

import ax.N8.o;
import ax.Z8.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class p {
    private static final Map<Class<?>, o.b<?>> a;
    private static final Map<Class<?>, o.a<?>> b;

    class a implements o.a<ax.N8.q> {
        a() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileInternalInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.q c(ax.Z8.a<?> aVar) throws a.b {
            return p.x(aVar);
        }
    }

    class b implements o.b, o.a {
        b() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileModeInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ax.N8.s c(ax.Z8.a<?> aVar) throws a.b {
            return p.y(aVar);
        }

        @Override // ax.N8.o.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.s sVar, ax.Z8.a<?> aVar) {
            aVar.u(sVar.a() & 4294967295L);
        }
    }

    class c implements o.a<ax.N8.u> {
        c() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FilePositionInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.u c(ax.Z8.a<?> aVar) throws a.b {
            return p.B(aVar);
        }
    }

    class d implements o.a<y> {
        d() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileStandardInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y c(ax.Z8.a<?> aVar) throws a.b {
            return p.C(aVar);
        }
    }

    class e implements o.a<ax.N8.f> {
        e() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileBothDirectoryInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.f c(ax.Z8.a<?> aVar) throws a.b {
            return p.r(aVar);
        }
    }

    class f implements o.a<ax.N8.g> {
        f() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileDirectoryInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.g c(ax.Z8.a<?> aVar) throws a.b {
            return p.s(aVar);
        }
    }

    class g implements o.a<ax.N8.l> {
        g() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileFullDirectoryInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.l c(ax.Z8.a<?> aVar) throws a.b {
            return p.u(aVar);
        }
    }

    class h implements o.a<ax.N8.m> {
        h() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileIdBothDirectoryInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.m c(ax.Z8.a<?> aVar) throws a.b {
            return p.v(aVar);
        }
    }

    class i implements o.a<ax.N8.n> {
        i() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileIdFullDirectoryInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.n c(ax.Z8.a<?> aVar) throws a.b {
            return p.w(aVar);
        }
    }

    class j implements o.a<ax.N8.t> {
        j() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileNamesInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.t c(ax.Z8.a<?> aVar) throws a.b {
            return p.A(aVar);
        }
    }

    class k implements o.a<C0831a> {
        k() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileAccessInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0831a c(ax.Z8.a<?> aVar) throws a.b {
            return p.n(aVar);
        }
    }

    class l implements o.b<w> {
        l() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileRenameInformation;
        }

        @Override // ax.N8.o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(w wVar, ax.Z8.a<?> aVar) {
            p.E(wVar, aVar);
        }
    }

    class m implements o.b<ax.N8.r> {
        m() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileLinkInformation;
        }

        @Override // ax.N8.o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.r rVar, ax.Z8.a<?> aVar) {
            p.E(rVar, aVar);
        }
    }

    class n implements o.a<C0832b> {
        n() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileAlignmentInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0832b c(ax.Z8.a<?> aVar) throws a.b {
            return p.o(aVar);
        }
    }

    class o implements o.a<ax.N8.c> {
        o() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileAllInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.c c(ax.Z8.a<?> aVar) throws a.b {
            return p.p(aVar);
        }
    }

    /* renamed from: ax.N8.p$p, reason: collision with other inner class name */
    class C0155p implements o.b, o.a {
        C0155p() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileAllocationInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ax.N8.d c(ax.Z8.a<?> aVar) throws a.b {
            return new ax.N8.d(aVar.A());
        }

        @Override // ax.N8.o.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.d dVar, ax.Z8.a<?> aVar) {
            aVar.k(dVar.a());
        }
    }

    class q implements o.b, o.a {
        q() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileBasicInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ax.N8.e c(ax.Z8.a<?> aVar) throws a.b {
            return p.q(aVar);
        }

        @Override // ax.N8.o.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.e eVar, ax.Z8.a<?> aVar) {
            ax.J8.c.a(eVar.b(), aVar);
            ax.J8.c.a(eVar.d(), aVar);
            ax.J8.c.a(eVar.e(), aVar);
            ax.J8.c.a(eVar.a(), aVar);
            aVar.u(eVar.c());
            aVar.u(0L);
        }
    }

    class r implements o.b<ax.N8.i> {
        r() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileDispositionInformation;
        }

        @Override // ax.N8.o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.i iVar, ax.Z8.a<?> aVar) {
            aVar.h(iVar.a());
        }
    }

    class s implements o.a<ax.N8.j> {
        s() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileEaInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.N8.j c(ax.Z8.a<?> aVar) throws a.b {
            return p.t(aVar);
        }
    }

    class t implements o.a<z> {
        t() {
        }

        @Override // ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileStreamInformation;
        }

        @Override // ax.N8.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z c(ax.Z8.a<?> aVar) throws a.b {
            return p.D(aVar);
        }
    }

    class u implements o.b<ax.N8.k> {
        u() {
        }

        @Override // ax.N8.o.b, ax.N8.o.a
        public ax.L8.b a() {
            return ax.L8.b.FileEndOfFileInformation;
        }

        @Override // ax.N8.o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ax.N8.k kVar, ax.Z8.a<?> aVar) {
            aVar.k(kVar.a());
        }
    }

    private static class v<F extends ax.N8.h> implements Iterator<F> {
        private final o.a<F> c0;
        private int d0;
        private F e0 = c();
        private final a.c q;

        v(byte[] bArr, o.a<F> aVar, int i) {
            this.q = new a.c(bArr, ax.Z8.b.b);
            this.c0 = aVar;
            this.d0 = i;
        }

        private F c() {
            F f = null;
            while (f == null) {
                try {
                    int i = this.d0;
                    if (i == -1) {
                        break;
                    }
                    this.q.T(i);
                    f = this.c0.c(this.q);
                    int b = (int) f.b();
                    if (b == 0) {
                        this.d0 = -1;
                    } else {
                        this.d0 += b;
                    }
                } catch (a.b e) {
                    throw new ax.k9.d(e);
                }
            }
            return f;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F next() {
            F f = this.e0;
            if (f == null) {
                throw new NoSuchElementException();
            }
            this.e0 = c();
            return f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put(C0831a.class, new k());
        hashMap2.put(C0832b.class, new n());
        hashMap2.put(ax.N8.c.class, new o());
        C0155p c0155p = new C0155p();
        hashMap2.put(ax.N8.d.class, c0155p);
        hashMap.put(ax.N8.d.class, c0155p);
        q qVar = new q();
        hashMap2.put(ax.N8.e.class, qVar);
        hashMap.put(ax.N8.e.class, qVar);
        hashMap.put(ax.N8.i.class, new r());
        hashMap2.put(ax.N8.j.class, new s());
        hashMap2.put(z.class, new t());
        hashMap.put(ax.N8.k.class, new u());
        hashMap2.put(ax.N8.q.class, new a());
        b bVar = new b();
        hashMap2.put(ax.N8.s.class, bVar);
        hashMap.put(ax.N8.s.class, bVar);
        hashMap2.put(ax.N8.u.class, new c());
        hashMap2.put(y.class, new d());
        hashMap2.put(ax.N8.f.class, new e());
        hashMap2.put(ax.N8.g.class, new f());
        hashMap2.put(ax.N8.l.class, new g());
        hashMap2.put(ax.N8.m.class, new h());
        hashMap2.put(ax.N8.n.class, new i());
        hashMap2.put(ax.N8.t.class, new j());
        hashMap.put(w.class, new l());
        hashMap.put(ax.N8.r.class, new m());
    }

    public static ax.N8.t A(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.t(aVar.N(), aVar.N(), aVar.H(ax.Y8.b.c, ((int) aVar.N()) / 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.N8.u B(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.u(aVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y C(ax.Z8.a<?> aVar) throws a.b {
        long A = aVar.A();
        long Q = aVar.Q();
        long N = aVar.N();
        boolean y = aVar.y();
        boolean y2 = aVar.y();
        aVar.U(2);
        return new y(A, Q, N, y, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z D(ax.Z8.a<?> aVar) throws a.b {
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        long j3 = 0;
        do {
            j2 += j3;
            aVar.T((int) j2);
            j3 = aVar.N();
            arrayList.add(new A(aVar.A(), aVar.A(), aVar.H(ax.Y8.b.c, ((int) aVar.N()) / 2)));
        } while (j3 != 0);
        return new z(arrayList);
    }

    public static void E(w wVar, ax.Z8.a<?> aVar) {
        aVar.j(wVar.d() ? (byte) 1 : (byte) 0);
        aVar.o(new byte[]{0, 0, 0, 0, 0, 0, 0});
        aVar.w(wVar.c());
        aVar.u(wVar.b() * 2);
        aVar.o(wVar.a().getBytes(ax.Y8.b.c));
    }

    public static <F extends ax.N8.h> Iterator<F> j(byte[] bArr, o.a<F> aVar) {
        return new v(bArr, aVar, 0);
    }

    public static <F extends ax.N8.o> o.a<F> k(Class<F> cls) {
        o.a<F> aVar = (o.a) b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }

    public static <F extends ax.N8.o> o.b<F> l(F f2) {
        return m(f2.getClass());
    }

    public static <F extends ax.N8.o> o.b<F> m(Class<F> cls) {
        o.b<F> bVar = (o.b) a.get(cls);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0831a n(ax.Z8.a<?> aVar) throws a.b {
        return new C0831a((int) aVar.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0832b o(ax.Z8.a<?> aVar) throws a.b {
        return new C0832b(aVar.N());
    }

    public static ax.N8.c p(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.c(q(aVar), C(aVar), x(aVar), t(aVar), n(aVar), B(aVar), y(aVar), o(aVar), z(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.N8.e q(ax.Z8.a<?> aVar) throws a.b {
        ax.J8.b c2 = ax.J8.c.c(aVar);
        ax.J8.b c3 = ax.J8.c.c(aVar);
        ax.J8.b c4 = ax.J8.c.c(aVar);
        ax.J8.b c5 = ax.J8.c.c(aVar);
        long N = aVar.N();
        aVar.U(4);
        return new ax.N8.e(c2, c3, c4, c5, N);
    }

    public static ax.N8.f r(ax.Z8.a<?> aVar) throws a.b {
        long N = aVar.N();
        long N2 = aVar.N();
        ax.J8.b c2 = ax.J8.c.c(aVar);
        ax.J8.b c3 = ax.J8.c.c(aVar);
        ax.J8.b c4 = ax.J8.c.c(aVar);
        ax.J8.b c5 = ax.J8.c.c(aVar);
        long Q = aVar.Q();
        long Q2 = aVar.Q();
        long N3 = aVar.N();
        long N4 = aVar.N();
        long N5 = aVar.N();
        byte z = aVar.z();
        aVar.z();
        byte[] G = aVar.G(24);
        Charset charset = ax.Y8.b.c;
        return new ax.N8.f(N, N2, aVar.H(charset, ((int) N4) / 2), c2, c3, c4, c5, Q, Q2, N3, N5, new String(G, 0, z, charset));
    }

    public static ax.N8.g s(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.g(aVar.N(), aVar.N(), z(aVar), ax.J8.c.c(aVar), ax.J8.c.c(aVar), ax.J8.c.c(aVar), ax.J8.c.c(aVar), aVar.Q(), aVar.Q(), aVar.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.N8.j t(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.j(aVar.N());
    }

    public static ax.N8.l u(ax.Z8.a<?> aVar) throws a.b {
        long N = aVar.N();
        long N2 = aVar.N();
        ax.J8.b c2 = ax.J8.c.c(aVar);
        ax.J8.b c3 = ax.J8.c.c(aVar);
        ax.J8.b c4 = ax.J8.c.c(aVar);
        ax.J8.b c5 = ax.J8.c.c(aVar);
        long Q = aVar.Q();
        long Q2 = aVar.Q();
        long N3 = aVar.N();
        long N4 = aVar.N();
        return new ax.N8.l(N, N2, aVar.H(ax.Y8.b.c, ((int) N4) / 2), c2, c3, c4, c5, Q, Q2, N3, aVar.N());
    }

    public static ax.N8.m v(ax.Z8.a<?> aVar) throws a.b {
        long N = aVar.N();
        long N2 = aVar.N();
        ax.J8.b c2 = ax.J8.c.c(aVar);
        ax.J8.b c3 = ax.J8.c.c(aVar);
        ax.J8.b c4 = ax.J8.c.c(aVar);
        ax.J8.b c5 = ax.J8.c.c(aVar);
        long Q = aVar.Q();
        long Q2 = aVar.Q();
        long N3 = aVar.N();
        long N4 = aVar.N();
        long N5 = aVar.N();
        byte z = aVar.z();
        aVar.z();
        byte[] G = aVar.G(24);
        Charset charset = ax.Y8.b.c;
        String str = new String(G, 0, z, charset);
        aVar.J();
        return new ax.N8.m(N, N2, aVar.H(charset, ((int) N4) / 2), c2, c3, c4, c5, Q, Q2, N3, N5, str, aVar.A());
    }

    public static ax.N8.n w(ax.Z8.a<?> aVar) throws a.b {
        long N = aVar.N();
        long N2 = aVar.N();
        ax.J8.b c2 = ax.J8.c.c(aVar);
        ax.J8.b c3 = ax.J8.c.c(aVar);
        ax.J8.b c4 = ax.J8.c.c(aVar);
        ax.J8.b c5 = ax.J8.c.c(aVar);
        long Q = aVar.Q();
        long Q2 = aVar.Q();
        long N3 = aVar.N();
        long N4 = aVar.N();
        long N5 = aVar.N();
        aVar.U(4);
        return new ax.N8.n(N, N2, aVar.H(ax.Y8.b.c, ((int) N4) / 2), c2, c3, c4, c5, Q, Q2, N3, N5, aVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.N8.q x(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.q(aVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.N8.s y(ax.Z8.a<?> aVar) throws a.b {
        return new ax.N8.s((int) aVar.N());
    }

    private static String z(ax.Z8.a<?> aVar) throws a.b {
        return aVar.H(ax.Y8.b.c, ((int) aVar.N()) / 2);
    }
}
