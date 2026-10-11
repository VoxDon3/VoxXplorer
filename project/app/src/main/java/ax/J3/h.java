/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import ax.M3.k;
import ax.M3.l;
import ax.N3.c;
import ax.P3.g;
import ax.P3.q;
import ax.P3.s;
import ax.U3.m;
import ax.U3.n;
import ax.U3.o;
import ax.f4.f;
import java.util.ArrayList;
import java.util.List;

public class h {
    private final o a;
    private final ax.f4.a b;
    private final ax.f4.e c;
    private final f d;
    private final ax.N3.d e;
    private final ax.c4.e f;
    private final ax.f4.b g;
    private final ax.f4.d h = new ax.f4.d();
    private final ax.f4.c i = new ax.f4.c();
    private final ax.b0.d<List<Exception>> j;

    public h() {
        ax.b0.d<List<Exception>> d8 = ax.l4.a.f();
        this.j = d8;
        this.a = new o(d8);
        this.b = new ax.f4.a();
        this.c = new ax.f4.e();
        this.d = new f();
        this.e = new ax.N3.d();
        this.f = new ax.c4.e();
        this.g = new ax.f4.b();
    }

    /*
     * WARNING - void declaration
     */
    private <Data, TResource, Transcode> List<g<Data, TResource, Transcode>> c(Class<Data> clazz, Class<TResource> clazz22, Class<Transcode> clazz3) {
        ArrayList<g<Data, TResource, Transcode>> arrayList = new ArrayList<g<Data, TResource, Transcode>>();
        for (Class<Object> clazz2 : this.c.c(clazz, clazz22)) {
            Object var3_5;
            for (Class clazz4 : this.f.b(clazz2, var3_5)) {
                arrayList.add(new g(clazz, clazz2, clazz4, this.c.b(clazz, clazz2), this.f.a(clazz2, clazz4), this.j));
            }
        }
        return arrayList;
    }

    public <Data, TResource> h a(Class<Data> clazz, Class<TResource> clazz2, k<Data, TResource> k8) {
        this.c.a(k8, clazz, clazz2);
        return this;
    }

    public <Model, Data> h b(Class<Model> clazz, Class<Data> clazz2, n<Model, Data> n8) {
        this.a.a(clazz, clazz2, n8);
        return this;
    }

    public List<ax.M3.f> d() {
        List<ax.M3.f> list = this.g.b();
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> e(Class<Data> clazz, Class<TResource> clazz2, Class<Transcode> clazz3) {
        q<Data, TResource, Transcode> q8 = this.i.b(clazz, clazz2, clazz3);
        Object object = q8;
        if (q8 == null) {
            object = q8;
            if (!this.i.a(clazz, clazz2, clazz3)) {
                object = this.c(clazz, clazz2, clazz3);
                object = object.isEmpty() ? null : new q<Data, TResource, Transcode>(clazz, clazz2, clazz3, object, this.j);
                this.i.d(clazz, clazz2, clazz3, (q<?, ?, ?>)object);
            }
        }
        return object;
    }

    public <Model> List<m<Model, ?>> f(Model Model) {
        List<m<Model, ?>> list = this.a.d(Model);
        if (!list.isEmpty()) {
            return list;
        }
        throw new c(Model);
    }

    public <Model, TResource, Transcode> List<Class<?>> g(Class<Model> clazz, Class<TResource> clazz2, Class<Transcode> clazz3) {
        List<Class<?>> list = this.h.a(clazz, clazz2);
        List<Class<?>> list2 = list;
        if (list == null) {
            list2 = new ArrayList();
            for (Class clazz4 : this.a.c(clazz)) {
                for (Class<TResource> clazz5 : this.c.c(clazz4, clazz2)) {
                    if (this.f.b(clazz5, clazz3).isEmpty() || list2.contains(clazz5)) continue;
                    list2.add(clazz5);
                }
            }
            this.h.b(clazz, clazz2, java.util.DesugarCollections.unmodifiableList(list2));
        }
        return list2;
    }

    public <X> l<X> h(s<X> s8) throws d {
        l<X> l8 = this.d.b(s8.b());
        if (l8 != null) {
            return l8;
        }
        throw new d(s8.b());
    }

    public <X> ax.N3.c<X> i(X x8) {
        return this.e.a(x8);
    }

    public <X> ax.M3.d<X> j(X x8) throws e {
        ax.M3.d<?> d8 = this.b.b(x8.getClass());
        if (d8 != null) {
            return d8;
        }
        throw new e(x8.getClass());
    }

    public boolean k(s<?> s8) {
        return this.d.b(s8.b()) != null;
    }

    public <Data, TResource> h l(Class<Data> clazz, Class<TResource> clazz2, k<Data, TResource> k8) {
        this.c.d(k8, clazz, clazz2);
        return this;
    }

    public h m(ax.M3.f f8) {
        this.g.a(f8);
        return this;
    }

    public h n(c.a a8) {
        this.e.b(a8);
        return this;
    }

    public <Data> h o(Class<Data> clazz, ax.M3.d<Data> d8) {
        this.b.a(clazz, d8);
        return this;
    }

    public <TResource> h p(Class<TResource> clazz, l<TResource> l8) {
        this.d.a(clazz, l8);
        return this;
    }

    public <TResource, Transcode> h q(Class<TResource> clazz, Class<Transcode> clazz2, ax.c4.d<TResource, Transcode> d8) {
        this.f.c(clazz, clazz2, d8);
        return this;
    }

    public static class a
    extends RuntimeException {
        public a(String string) {
            super(string);
        }
    }

    public static final class b
    extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c
    extends a {
        public c(Class<?> clazz, Class<?> clazz2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(clazz);
            stringBuilder.append(" and data: ");
            stringBuilder.append(clazz2);
            super(stringBuilder.toString());
        }

        public c(Object object) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(object);
            super(stringBuilder.toString());
        }
    }

    public static class d
    extends a {
        public d(Class<?> clazz) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find result encoder for resource class: ");
            stringBuilder.append(clazz);
            super(stringBuilder.toString());
        }
    }

    public static class e
    extends a {
        public e(Class<?> clazz) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find source encoder for data class: ");
            stringBuilder.append(clazz);
            super(stringBuilder.toString());
        }
    }
}

