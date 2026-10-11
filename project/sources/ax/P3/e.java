package ax.P3;

import ax.J3.h;
import ax.P3.f;
import ax.U3.m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class e<Transcode> {
    private final List<m.a<?>> a = new ArrayList();
    private final List<ax.M3.h> b = new ArrayList();
    private ax.J3.e c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private f.e h;
    private ax.M3.j i;
    private Map<Class<?>, ax.M3.m<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private ax.M3.h n;
    private ax.J3.g o;
    private h p;
    private boolean q;
    private boolean r;

    e() {
    }

    void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    List<ax.M3.h> b() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<m.a<?>> f = f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                m.a<?> aVar = f.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    ax.R3.a c() {
        return this.h.a();
    }

    h d() {
        return this.p;
    }

    int e() {
        return this.f;
    }

    List<m.a<?>> f() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List f = this.c.f().f(this.d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                m.a<?> a = ((ax.U3.m) f.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    <Data> q<Data, ?, Transcode> g(Class<Data> cls) {
        return this.c.f().e(cls, this.g, this.k);
    }

    List<ax.U3.m<File, ?>> h(File file) throws h.c {
        return this.c.f().f(file);
    }

    ax.M3.j i() {
        return this.i;
    }

    ax.J3.g j() {
        return this.o;
    }

    List<Class<?>> k() {
        return this.c.f().g(this.d.getClass(), this.g, this.k);
    }

    <Z> ax.M3.l<Z> l(s<Z> sVar) {
        return this.c.f().h(sVar);
    }

    ax.M3.h m() {
        return this.n;
    }

    <X> ax.M3.d<X> n(X x) throws h.e {
        return this.c.f().j(x);
    }

    <Z> ax.M3.m<Z> o(Class<Z> cls) {
        ax.M3.m<Z> mVar = (ax.M3.m) this.j.get(cls);
        if (mVar != null) {
            return mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return ax.W3.b.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int p() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean q(Class<?> cls) {
        return g(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> e<R> r(ax.J3.e eVar, Object obj, ax.M3.h hVar, int i, int i2, h hVar2, Class<?> cls, Class<R> cls2, ax.J3.g gVar, ax.M3.j jVar, Map<Class<?>, ax.M3.m<?>> map, boolean z, boolean z2, f.e eVar2) {
        this.c = eVar;
        this.d = obj;
        this.n = hVar;
        this.e = i;
        this.f = i2;
        this.p = hVar2;
        this.g = cls;
        this.h = eVar2;
        this.k = cls2;
        this.o = gVar;
        this.i = jVar;
        this.j = map;
        this.q = z;
        this.r = z2;
        return this;
    }

    boolean s(s<?> sVar) {
        return this.c.f().k(sVar);
    }

    boolean t() {
        return this.r;
    }

    boolean u(ax.M3.h hVar) {
        List<m.a<?>> f = f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            if (f.get(i).a.equals(hVar)) {
                return true;
            }
        }
        return false;
    }
}
