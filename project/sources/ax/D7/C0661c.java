package ax.D7;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.D7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0661c<T> {
    private final String a;
    private final Set<F<? super T>> b;
    private final Set<r> c;
    private final int d;
    private final int e;
    private final h<T> f;
    private final Set<Class<?>> g;

    public static /* synthetic */ Object a(Object obj, InterfaceC0663e interfaceC0663e) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC0663e interfaceC0663e) {
        return obj;
    }

    public static <T> b<T> c(F<T> f) {
        return new b<>(f, new F[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(F<T> f, F<? super T>... fArr) {
        return new b<>(f, fArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> C0661c<T> l(final T t, Class<T> cls) {
        return m(cls).e(new h() { // from class: ax.D7.a
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return C0661c.b(t, interfaceC0663e);
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).f();
    }

    @SafeVarargs
    public static <T> C0661c<T> q(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).e(new h() { // from class: ax.D7.b
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return C0661c.a(t, interfaceC0663e);
            }
        }).c();
    }

    public Set<r> g() {
        return this.c;
    }

    public h<T> h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set<F<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.g;
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    public C0661c<T> r(h<T> hVar) {
        return new C0661c<>(this.a, this.b, this.c, this.d, this.e, hVar, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    /* renamed from: ax.D7.c$b */
    public static class b<T> {
        private String a;
        private final Set<F<? super T>> b;
        private final Set<r> c;
        private int d;
        private int e;
        private h<T> f;
        private final Set<Class<?>> g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.e = 1;
            return this;
        }

        private b<T> h(int i) {
            E.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        private void i(F<?> f) {
            E.a(!this.b.contains(f), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            E.c(rVar, "Null dependency");
            i(rVar.c());
            this.c.add(rVar);
            return this;
        }

        public C0661c<T> c() {
            E.d(this.f != null, "Missing required property: factory.");
            return new C0661c<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b<T> d() {
            return h(2);
        }

        public b<T> e(h<T> hVar) {
            this.f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public b<T> g(String str) {
            this.a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.b.add(F.b(cls2));
            }
        }

        @SafeVarargs
        private b(F<T> f, F<? super T>... fArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(f, "Null interface");
            hashSet.add(f);
            for (F<? super T> f2 : fArr) {
                E.c(f2, "Null interface");
            }
            Collections.addAll(this.b, fArr);
        }
    }

    private C0661c(String str, Set<F<? super T>> set, Set<r> set2, int i, int i2, h<T> hVar, Set<Class<?>> set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = hVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }
}
