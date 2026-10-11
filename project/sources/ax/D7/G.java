package ax.D7;

import ax.a8.InterfaceC1430a;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class G implements InterfaceC0663e {
    private final Set<F<?>> a;
    private final Set<F<?>> b;
    private final Set<F<?>> c;
    private final Set<F<?>> d;
    private final Set<F<?>> e;
    private final Set<Class<?>> f;
    private final InterfaceC0663e g;

    private static class a implements ax.Y7.c {
        private final Set<Class<?>> a;
        private final ax.Y7.c b;

        public a(Set<Class<?>> set, ax.Y7.c cVar) {
            this.a = set;
            this.b = cVar;
        }
    }

    G(C0661c<?> c0661c, InterfaceC0663e interfaceC0663e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c0661c.g()) {
            if (rVar.e()) {
                if (rVar.g()) {
                    hashSet4.add(rVar.c());
                } else {
                    hashSet.add(rVar.c());
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else if (rVar.g()) {
                hashSet5.add(rVar.c());
            } else {
                hashSet2.add(rVar.c());
            }
        }
        if (!c0661c.k().isEmpty()) {
            hashSet.add(F.b(ax.Y7.c.class));
        }
        this.a = DesugarCollections.unmodifiableSet(hashSet);
        this.b = DesugarCollections.unmodifiableSet(hashSet2);
        this.c = DesugarCollections.unmodifiableSet(hashSet3);
        this.d = DesugarCollections.unmodifiableSet(hashSet4);
        this.e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f = c0661c.k();
        this.g = interfaceC0663e;
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> T a(Class<T> cls) {
        if (!this.a.contains(F.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.g.a(cls);
        return !cls.equals(ax.Y7.c.class) ? t : (T) new a(this.f, (ax.Y7.c) t);
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> ax.a8.b<Set<T>> b(F<T> f) {
        if (this.e.contains(f)) {
            return this.g.b(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f));
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> T c(F<T> f) {
        if (this.a.contains(f)) {
            return (T) this.g.c(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f));
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> ax.a8.b<T> d(Class<T> cls) {
        return g(F.b(cls));
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> Set<T> e(F<T> f) {
        if (this.d.contains(f)) {
            return this.g.e(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f));
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ Set f(Class cls) {
        return C0662d.f(this, cls);
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> ax.a8.b<T> g(F<T> f) {
        if (this.b.contains(f)) {
            return this.g.g(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f));
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> InterfaceC1430a<T> h(F<T> f) {
        if (this.c.contains(f)) {
            return this.g.h(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f));
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> InterfaceC1430a<T> i(Class<T> cls) {
        return h(F.b(cls));
    }
}
