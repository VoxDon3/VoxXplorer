package ax.s9;

import ax.N8.B;
import ax.N8.o;
import ax.N8.p;
import ax.N8.v;
import ax.N8.x;
import ax.Q8.EnumC0920d;
import ax.Q8.EnumC0921e;
import ax.Q8.F;
import ax.Q8.u;
import ax.R8.p;
import ax.R8.u;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import ax.p9.C2784b;
import ax.p9.InterfaceC2785c;
import ax.r9.C3016b;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: ax.s9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3066c extends m {
    private static final n v0 = new C0453c();
    private static final n w0 = new d();
    private static n x0 = new e();
    private final InterfaceC2785c u0;

    /* renamed from: ax.s9.c$a */
    class a implements InterfaceC2785c.b<f> {
        final /* synthetic */ ax.k9.e a;
        final /* synthetic */ ax.Q8.l b;
        final /* synthetic */ Set c;
        final /* synthetic */ Set d;
        final /* synthetic */ Set e;
        final /* synthetic */ EnumC0920d f;
        final /* synthetic */ Set g;

        a(ax.k9.e eVar, ax.Q8.l lVar, Set set, Set set2, Set set3, EnumC0920d enumC0920d, Set set4) {
            this.a = eVar;
            this.b = lVar;
            this.c = set;
            this.d = set2;
            this.e = set3;
            this.f = enumC0920d;
            this.g = set4;
        }

        @Override // ax.p9.InterfaceC2785c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(ax.k9.e eVar) {
            C3066c f1 = C3066c.this.f1(this.a, eVar);
            if (this.a.equals(eVar)) {
                return null;
            }
            return f1.D0(eVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    /* renamed from: ax.s9.c$b */
    class b implements InterfaceC2785c.b<f> {
        final /* synthetic */ ax.k9.e a;
        final /* synthetic */ ax.Q8.l b;
        final /* synthetic */ Set c;
        final /* synthetic */ Set d;
        final /* synthetic */ Set e;
        final /* synthetic */ EnumC0920d f;
        final /* synthetic */ Set g;

        b(ax.k9.e eVar, ax.Q8.l lVar, Set set, Set set2, Set set3, EnumC0920d enumC0920d, Set set4) {
            this.a = eVar;
            this.b = lVar;
            this.c = set;
            this.d = set2;
            this.e = set3;
            this.f = enumC0920d;
            this.g = set4;
        }

        @Override // ax.p9.InterfaceC2785c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(ax.k9.e eVar) {
            return C3066c.this.f1(this.a, eVar).D0(eVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    /* renamed from: ax.s9.c$c, reason: collision with other inner class name */
    class C0453c implements n {
        C0453c() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_OBJECT_NAME_NOT_FOUND.getValue() || j == ax.K8.a.STATUS_OBJECT_PATH_NOT_FOUND.getValue() || j == ax.K8.a.STATUS_FILE_IS_A_DIRECTORY.getValue() || j == ax.K8.a.STATUS_DELETE_PENDING.getValue();
        }
    }

    /* renamed from: ax.s9.c$d */
    class d implements n {
        d() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_OBJECT_NAME_NOT_FOUND.getValue() || j == ax.K8.a.STATUS_OBJECT_PATH_NOT_FOUND.getValue() || j == ax.K8.a.STATUS_NOT_A_DIRECTORY.getValue() || j == ax.K8.a.STATUS_DELETE_PENDING.getValue();
        }
    }

    /* renamed from: ax.s9.c$e */
    class e implements n {
        e() {
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_DELETE_PENDING.getValue();
        }
    }

    /* renamed from: ax.s9.c$f */
    static class f {
        final ax.R8.e a;
        final C3066c b;
        final ax.k9.e c;

        public f(ax.R8.e eVar, ax.k9.e eVar2, C3066c c3066c) {
            this.a = eVar;
            this.c = eVar2;
            this.b = c3066c;
        }
    }

    public C3066c(ax.k9.e eVar, o oVar, InterfaceC2785c interfaceC2785c) {
        super(eVar, oVar);
        this.u0 = interfaceC2785c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f D0(ax.k9.e eVar, ax.Q8.l lVar, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        ax.R8.e b2 = super.b(eVar, lVar, set, set2, set3, enumC0920d, set4);
        try {
            f fVar = (f) this.u0.c(this.e0, b2, eVar, new a(eVar, lVar, set, set2, set3, enumC0920d, set4));
            return fVar != null ? fVar : new f(b2, eVar, this);
        } catch (C2784b e2) {
            throw new F(e2.b(), ax.Q8.m.SMB2_CREATE, "Cannot resolve path " + eVar, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3066c f1(ax.k9.e eVar, ax.k9.e eVar2) {
        C3016b c3016b = this.e0;
        if (!eVar.d(eVar2)) {
            c3016b = c3016b.m(eVar2);
        }
        return !eVar.e(eVar2) ? (C3066c) c3016b.b(eVar2.c()) : this;
    }

    private f g1(ax.k9.e eVar, ax.Q8.l lVar, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        try {
            return (f) this.u0.b(this.e0, eVar, new b(eVar, lVar, set, set2, set3, enumC0920d, set4));
        } catch (C2784b e2) {
            throw new F(e2.a().getValue(), ax.Q8.m.SMB2_CREATE, "Cannot resolve path " + eVar, e2);
        }
    }

    public void F0(ax.Q8.i iVar) {
        j1(iVar, new ax.N8.i(true));
    }

    protected AbstractC3065b G0(f fVar) {
        ax.R8.e eVar = fVar.a;
        eVar.n();
        return (eVar.n() == null || !eVar.n().contains(ax.L8.a.FILE_ATTRIBUTE_DIRECTORY)) ? new C3067d(eVar.o(), fVar.b, fVar.c) : new C3064a(eVar.o(), fVar.b, fVar.c);
    }

    public ax.N8.c L0(String str) throws F {
        return (ax.N8.c) T0(str, ax.N8.c.class);
    }

    public <F extends v> F M0(ax.Q8.i iVar, Class<F> cls) throws F {
        o.a k = p.k(cls);
        try {
            return (F) k.c(new a.c(v(iVar, p.a.SMB2_0_INFO_FILE, null, k.a(), null).n(), ax.Z8.b.b));
        } catch (a.b e2) {
            throw new ax.k9.d(e2);
        }
    }

    public <F extends v> F T0(String str, Class<F> cls) throws F {
        AbstractC3065b c1 = c1(str, EnumSet.of(ax.J8.a.FILE_READ_ATTRIBUTES, ax.J8.a.FILE_READ_EA), null, u.f0, EnumC0920d.FILE_OPEN, null);
        try {
            F f2 = (F) c1.u(cls);
            c1.close();
            return f2;
        } catch (Throwable th) {
            if (c1 == null) {
                throw th;
            }
            try {
                c1.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public B Y0() throws F {
        C3064a d1 = d1(HttpUrl.FRAGMENT_ENCODE_SET, EnumSet.of(ax.J8.a.FILE_READ_ATTRIBUTES), null, u.f0, EnumC0920d.FILE_OPEN, null);
        try {
            try {
                B c = B.c(new a.c(v(d1.u0(), p.a.SMB2_0_INFO_FILESYSTEM, null, null, ax.L8.d.FileFsFullSizeInformation).n(), ax.Z8.b.b));
                d1.close();
                return c;
            } catch (a.b e2) {
                throw new ax.k9.d(e2);
            }
        } finally {
        }
    }

    public List<ax.N8.m> Z0(String str) throws F {
        return a1(str, ax.N8.m.class, null, null);
    }

    public <I extends ax.N8.h> List<I> a1(String str, Class<I> cls, String str2, EnumSet<ax.J8.a> enumSet) {
        if (enumSet == null) {
            enumSet = EnumSet.of(ax.J8.a.FILE_LIST_DIRECTORY, ax.J8.a.FILE_READ_ATTRIBUTES, ax.J8.a.FILE_READ_EA);
        }
        C3064a d1 = d1(str, enumSet, null, u.f0, EnumC0920d.FILE_OPEN, null);
        try {
            List<I> M0 = d1.M0(cls, str2);
            d1.e();
            return M0;
        } finally {
        }
    }

    public void b1(String str) throws F {
        d1(str, EnumSet.of(ax.J8.a.FILE_LIST_DIRECTORY, ax.J8.a.FILE_ADD_SUBDIRECTORY), EnumSet.of(ax.L8.a.FILE_ATTRIBUTE_DIRECTORY), u.f0, EnumC0920d.FILE_CREATE, EnumSet.of(EnumC0921e.FILE_DIRECTORY_FILE)).close();
    }

    @Override // ax.s9.m
    protected n c() {
        return this.u0.a();
    }

    public AbstractC3065b c1(String str, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        return G0(g1(new ax.k9.e(this.q, str), null, set, set2, set3, enumC0920d, set4));
    }

    public C3064a d1(String str, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        EnumSet copyOf = set4 != null ? EnumSet.copyOf((Collection) set4) : EnumSet.noneOf(EnumC0921e.class);
        copyOf.add(EnumC0921e.FILE_DIRECTORY_FILE);
        copyOf.remove(EnumC0921e.FILE_NON_DIRECTORY_FILE);
        EnumSet copyOf2 = set2 != null ? EnumSet.copyOf((Collection) set2) : EnumSet.noneOf(ax.L8.a.class);
        copyOf2.add(ax.L8.a.FILE_ATTRIBUTE_DIRECTORY);
        return (C3064a) c1(str, set, copyOf2, set3, enumC0920d, copyOf);
    }

    public C3067d e1(String str, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4) {
        EnumSet copyOf = set4 != null ? EnumSet.copyOf((Collection) set4) : EnumSet.noneOf(EnumC0921e.class);
        copyOf.add(EnumC0921e.FILE_NON_DIRECTORY_FILE);
        copyOf.remove(EnumC0921e.FILE_DIRECTORY_FILE);
        EnumSet copyOf2 = set2 != null ? EnumSet.copyOf((Collection) set2) : EnumSet.noneOf(ax.L8.a.class);
        copyOf2.remove(ax.L8.a.FILE_ATTRIBUTE_DIRECTORY);
        return (C3067d) c1(str, set, copyOf2, set3, enumC0920d, copyOf);
    }

    public void h1(String str) throws F {
        try {
            AbstractC3065b c1 = c1(str, EnumSet.of(ax.J8.a.DELETE), EnumSet.of(ax.L8.a.FILE_ATTRIBUTE_NORMAL), EnumSet.of(u.FILE_SHARE_DELETE, u.FILE_SHARE_WRITE, u.FILE_SHARE_READ), EnumC0920d.FILE_OPEN, EnumSet.of(EnumC0921e.FILE_NON_DIRECTORY_FILE));
            try {
                c1.g();
                c1.close();
            } finally {
            }
        } catch (F e2) {
            if (!x0.a(e2.b())) {
                throw e2;
            }
        }
    }

    public void i1(String str, boolean z) throws F {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("rmdir: path should be non-null and non-empty");
        }
        try {
            if (z) {
                for (ax.N8.m mVar : Z0(str)) {
                    if (!mVar.a().equals(".") && !mVar.a().equals("..")) {
                        String str2 = str + "\\" + mVar.a();
                        if (c.a.c(mVar.d(), ax.L8.a.FILE_ATTRIBUTE_DIRECTORY)) {
                            i1(str2, true);
                        } else {
                            h1(str2);
                        }
                    }
                }
                i1(str, false);
                return;
            }
            AbstractC3065b c1 = c1(str, EnumSet.of(ax.J8.a.DELETE), EnumSet.of(ax.L8.a.FILE_ATTRIBUTE_DIRECTORY), EnumSet.of(u.FILE_SHARE_DELETE, u.FILE_SHARE_WRITE, u.FILE_SHARE_READ), EnumC0920d.FILE_OPEN, EnumSet.of(EnumC0921e.FILE_DIRECTORY_FILE));
            try {
                c1.g();
                c1.close();
            } finally {
            }
        } catch (F e2) {
            if (!x0.a(e2.b())) {
                throw e2;
            }
        }
    }

    public <F extends x> void j1(ax.Q8.i iVar, F f2) {
        C2171b c2171b = new C2171b();
        o.b l = ax.N8.p.l(f2);
        l.b(f2, c2171b);
        o0(iVar, u.a.SMB2_0_INFO_FILE, null, l.a(), c2171b.f());
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + f() + "]";
    }
}
