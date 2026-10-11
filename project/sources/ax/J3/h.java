package ax.J3;

import ax.M3.l;
import ax.N3.c;
import ax.P3.q;
import ax.P3.s;
import ax.U3.m;
import ax.U3.n;
import ax.U3.o;
import ax.b0.InterfaceC1443d;
import ax.c4.C1842e;
import ax.c4.InterfaceC1841d;
import ax.f4.C2045a;
import ax.l4.C2468a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h {
    private final o a;
    private final C2045a b;
    private final ax.f4.e c;
    private final ax.f4.f d;
    private final ax.N3.d e;
    private final C1842e f;
    private final ax.f4.b g;
    private final ax.f4.d h = new ax.f4.d();
    private final ax.f4.c i = new ax.f4.c();
    private final InterfaceC1443d<List<Exception>> j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls);
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        InterfaceC1443d<List<Exception>> f = C2468a.f();
        this.j = f;
        this.a = new o(f);
        this.b = new C2045a();
        this.c = new ax.f4.e();
        this.d = new ax.f4.f();
        this.e = new ax.N3.d();
        this.f = new C1842e();
        this.g = new ax.f4.b();
    }

    private <Data, TResource, Transcode> List<ax.P3.g<Data, TResource, Transcode>> c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.c(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new ax.P3.g(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public <Data, TResource> h a(Class<Data> cls, Class<TResource> cls2, ax.M3.k<Data, TResource> kVar) {
        this.c.a(kVar, cls, cls2);
        return this;
    }

    public <Model, Data> h b(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
        this.a.a(cls, cls2, nVar);
        return this;
    }

    public List<ax.M3.f> d() {
        List<ax.M3.f> b2 = this.g.b();
        if (b2.isEmpty()) {
            throw new b();
        }
        return b2;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> e(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        q<Data, TResource, Transcode> b2 = this.i.b(cls, cls2, cls3);
        if (b2 == null && !this.i.a(cls, cls2, cls3)) {
            List<ax.P3.g<Data, TResource, Transcode>> c2 = c(cls, cls2, cls3);
            if (c2.isEmpty()) {
                b2 = null;
                cls4 = cls;
                cls5 = cls2;
                cls6 = cls3;
            } else {
                cls4 = cls;
                cls5 = cls2;
                cls6 = cls3;
                b2 = new q<>(cls4, cls5, cls6, c2, this.j);
            }
            this.i.d(cls4, cls5, cls6, b2);
        }
        return b2;
    }

    public <Model> List<m<Model, ?>> f(Model model) {
        List<m<Model, ?>> d2 = this.a.d(model);
        if (d2.isEmpty()) {
            throw new c(model);
        }
        return d2;
    }

    public <Model, TResource, Transcode> List<Class<?>> g(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a2 = this.h.a(cls, cls2);
        if (a2 == null) {
            a2 = new ArrayList<>();
            Iterator<Class<?>> it = this.a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.c.c(it.next(), cls2)) {
                    if (!this.f.b(cls4, cls3).isEmpty() && !a2.contains(cls4)) {
                        a2.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, DesugarCollections.unmodifiableList(a2));
        }
        return a2;
    }

    public <X> l<X> h(s<X> sVar) throws d {
        l<X> b2 = this.d.b(sVar.b());
        if (b2 != null) {
            return b2;
        }
        throw new d(sVar.b());
    }

    public <X> ax.N3.c<X> i(X x) {
        return this.e.a(x);
    }

    public <X> ax.M3.d<X> j(X x) throws e {
        ax.M3.d<X> b2 = this.b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean k(s<?> sVar) {
        return this.d.b(sVar.b()) != null;
    }

    public <Data, TResource> h l(Class<Data> cls, Class<TResource> cls2, ax.M3.k<Data, TResource> kVar) {
        this.c.d(kVar, cls, cls2);
        return this;
    }

    public h m(ax.M3.f fVar) {
        this.g.a(fVar);
        return this;
    }

    public h n(c.a aVar) {
        this.e.b(aVar);
        return this;
    }

    public <Data> h o(Class<Data> cls, ax.M3.d<Data> dVar) {
        this.b.a(cls, dVar);
        return this;
    }

    public <TResource> h p(Class<TResource> cls, l<TResource> lVar) {
        this.d.a(cls, lVar);
        return this;
    }

    public <TResource, Transcode> h q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC1841d<TResource, Transcode> interfaceC1841d) {
        this.f.c(cls, cls2, interfaceC1841d);
        return this;
    }
}
