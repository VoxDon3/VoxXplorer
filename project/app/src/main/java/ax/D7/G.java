/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.F;
import ax.D7.c;
import ax.D7.d;
import ax.D7.e;
import ax.D7.r;
import ax.D7.t;
import ax.a8.b;
import java.util.HashSet;
import java.util.Set;

final class G
implements e {
    private final Set<F<?>> a;
    private final Set<F<?>> b;
    private final Set<F<?>> c;
    private final Set<F<?>> d;
    private final Set<F<?>> e;
    private final Set<Class<?>> f;
    private final e g;

    G(c<?> c8, e e8) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r r8 : c8.g()) {
            if (r8.e()) {
                if (r8.g()) {
                    hashSet4.add(r8.c());
                    continue;
                }
                hashSet.add(r8.c());
                continue;
            }
            if (r8.d()) {
                hashSet3.add(r8.c());
                continue;
            }
            if (r8.g()) {
                hashSet5.add(r8.c());
                continue;
            }
            hashSet2.add(r8.c());
        }
        if (!c8.k().isEmpty()) {
            hashSet.add(F.b(ax.Y7.c.class));
        }
        this.a = java.util.DesugarCollections.unmodifiableSet(hashSet);
        this.b = java.util.DesugarCollections.unmodifiableSet(hashSet2);
        this.c = java.util.DesugarCollections.unmodifiableSet(hashSet3);
        this.d = java.util.DesugarCollections.unmodifiableSet(hashSet4);
        this.e = java.util.DesugarCollections.unmodifiableSet(hashSet5);
        this.f = c8.k();
        this.g = e8;
    }

    @Override
    public <T> T a(Class<T> clazz) {
        if (this.a.contains(F.b(clazz))) {
            T t8 = this.g.a(clazz);
            if (!clazz.equals(ax.Y7.c.class)) {
                return t8;
            }
            return (T)new a(this.f, (ax.Y7.c)t8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", clazz));
    }

    @Override
    public <T> b<Set<T>> b(F<T> f8) {
        if (this.e.contains(f8)) {
            return this.g.b(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f8));
    }

    @Override
    public <T> T c(F<T> f8) {
        if (this.a.contains(f8)) {
            return this.g.c(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f8));
    }

    @Override
    public <T> b<T> d(Class<T> clazz) {
        return this.g(F.b(clazz));
    }

    @Override
    public <T> Set<T> e(F<T> f8) {
        if (this.d.contains(f8)) {
            return this.g.e(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f8));
    }

    public /* synthetic */ Set f(Class clazz) {
        return ax.D7.d.f(this, clazz);
    }

    @Override
    public <T> b<T> g(F<T> f8) {
        if (this.b.contains(f8)) {
            return this.g.g(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f8));
    }

    @Override
    public <T> ax.a8.a<T> h(F<T> f8) {
        if (this.c.contains(f8)) {
            return this.g.h(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f8));
    }

    @Override
    public <T> ax.a8.a<T> i(Class<T> clazz) {
        return this.h(F.b(clazz));
    }

    private static class a
    implements ax.Y7.c {
        private final Set<Class<?>> a;
        private final ax.Y7.c b;

        public a(Set<Class<?>> set, ax.Y7.c c8) {
            this.a = set;
            this.b = c8;
        }
    }
}

