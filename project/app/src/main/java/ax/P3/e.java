/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.J3.g;
import ax.J3.h;
import ax.M3.d;
import ax.M3.j;
import ax.M3.l;
import ax.P3.f;
import ax.P3.h;
import ax.P3.q;
import ax.P3.s;
import ax.R3.a;
import ax.U3.m;
import ax.W3.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class e<Transcode> {
    private final List<m.a<?>> a = new ArrayList();
    private final List<ax.M3.h> b = new ArrayList<ax.M3.h>();
    private ax.J3.e c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private f.e h;
    private j i;
    private Map<Class<?>, ax.M3.m<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private ax.M3.h n;
    private g o;
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
            List<m.a<?>> list = this.f();
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                m.a<?> a8 = list.get(i8);
                if (!this.b.contains(a8.a)) {
                    this.b.add(a8.a);
                }
                for (int i9 = 0; i9 < a8.b.size(); ++i9) {
                    if (this.b.contains(a8.b.get(i9))) continue;
                    this.b.add(a8.b.get(i9));
                }
            }
        }
        return this.b;
    }

    a c() {
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
            List<m<Object, ?>> list = this.c.f().f(this.d);
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                m.a<?> a8 = list.get(i8).a(this.d, this.e, this.f, this.i);
                if (a8 == null) continue;
                this.a.add(a8);
            }
        }
        return this.a;
    }

    <Data> q<Data, ?, Transcode> g(Class<Data> clazz) {
        return this.c.f().e(clazz, this.g, this.k);
    }

    List<m<File, ?>> h(File file) throws h.c {
        return this.c.f().f(file);
    }

    j i() {
        return this.i;
    }

    g j() {
        return this.o;
    }

    List<Class<?>> k() {
        return this.c.f().g(this.d.getClass(), this.g, this.k);
    }

    <Z> l<Z> l(s<Z> s8) {
        return this.c.f().h(s8);
    }

    ax.M3.h m() {
        return this.n;
    }

    <X> d<X> n(X x8) throws h.e {
        return this.c.f().j(x8);
    }

    <Z> ax.M3.m<Z> o(Class<Z> clazz) {
        ax.M3.m<?> m8 = this.j.get(clazz);
        if (m8 == null) {
            if (this.j.isEmpty() && this.q) {
                m8 = new StringBuilder();
                ((StringBuilder)((Object)m8)).append("Missing transformation for ");
                ((StringBuilder)((Object)m8)).append(clazz);
                ((StringBuilder)((Object)m8)).append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
                throw new IllegalArgumentException(((StringBuilder)((Object)m8)).toString());
            }
            return ax.W3.b.c();
        }
        return m8;
    }

    int p() {
        return this.e;
    }

    boolean q(Class<?> clazz) {
        return this.g(clazz) != null;
    }

    <R> e<R> r(ax.J3.e e8, Object object, ax.M3.h h8, int n8, int n9, h h9, Class<?> clazz, Class<R> clazz2, g g8, j j8, Map<Class<?>, ax.M3.m<?>> map, boolean bl, boolean bl2, f.e e9) {
        this.c = e8;
        this.d = object;
        this.n = h8;
        this.e = n8;
        this.f = n9;
        this.p = h9;
        this.g = clazz;
        this.h = e9;
        this.k = clazz2;
        this.o = g8;
        this.i = j8;
        this.j = map;
        this.q = bl;
        this.r = bl2;
        return this;
    }

    boolean s(s<?> s8) {
        return this.c.f().k(s8);
    }

    boolean t() {
        return this.r;
    }

    boolean u(ax.M3.h h8) {
        List<m.a<?>> list = this.f();
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!list.get((int)i8).a.equals(h8)) continue;
            return true;
        }
        return false;
    }
}

