/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.E;
import ax.D7.F;
import ax.D7.a;
import ax.D7.e;
import ax.D7.h;
import ax.D7.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c<T> {
    private final String a;
    private final Set<F<? super T>> b;
    private final Set<r> c;
    private final int d;
    private final int e;
    private final h<T> f;
    private final Set<Class<?>> g;

    private c(String string, Set<F<? super T>> set, Set<r> set2, int n8, int n9, h<T> h8, Set<Class<?>> set3) {
        this.a = string;
        this.b = java.util.DesugarCollections.unmodifiableSet(set);
        this.c = java.util.DesugarCollections.unmodifiableSet(set2);
        this.d = n8;
        this.e = n9;
        this.f = h8;
        this.g = java.util.DesugarCollections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object object, e e8) {
        return object;
    }

    public static /* synthetic */ Object b(Object object, e e8) {
        return object;
    }

    public static <T> b<T> c(F<T> f8) {
        return new b((F)f8, new F[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(F<T> f8, F<? super T> ... fArray) {
        return new b((F)f8, (F[])fArray);
    }

    public static <T> b<T> e(Class<T> clazz) {
        return new b((Class)clazz, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> clazz, Class<? super T> ... classArray) {
        return new b((Class)clazz, (Class[])classArray);
    }

    public static <T> c<T> l(T t8, Class<T> clazz) {
        return ax.D7.c.m(clazz).e(new a(t8)).c();
    }

    public static <T> b<T> m(Class<T> clazz) {
        return ((b)ax.D7.c.e(clazz)).f();
    }

    @SafeVarargs
    public static <T> c<T> q(T t8, Class<T> clazz, Class<? super T> ... classArray) {
        return ax.D7.c.f(clazz, classArray).e(new ax.D7.b(t8)).c();
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

    public c<T> r(h<T> h8) {
        return new c<T>(this.a, this.b, this.c, this.d, this.e, h8, this.g);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString(this.b.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.d);
        stringBuilder.append(", type=");
        stringBuilder.append(this.e);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString(this.c.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static class b<T> {
        private String a = null;
        private final Set<F<? super T>> b;
        private final Set<r> c;
        private int d;
        private int e;
        private h<T> f;
        private final Set<Class<?>> g;

        @SafeVarargs
        private b(F<T> f8, F<? super T> ... fArray) {
            HashSet<F<T>> hashSet = new HashSet<F<T>>();
            this.b = hashSet;
            this.c = new HashSet<r>();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(f8, "Null interface");
            hashSet.add(f8);
            int n8 = fArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                E.c(fArray[i8], "Null interface");
            }
            Collections.addAll(this.b, fArray);
        }

        /*
         * WARNING - void declaration
         */
        @SafeVarargs
        private b(Class<T> clazz2, Class<? super T> ... classArray) {
            Object var2_4;
            HashSet<F<T>> hashSet = new HashSet<F<T>>();
            this.b = hashSet;
            this.c = new HashSet<r>();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(clazz2, "Null interface");
            hashSet.add(F.b(clazz2));
            for (void var1_3 : var2_4) {
                E.c(var1_3, "Null interface");
                this.b.add(F.b(var1_3));
            }
        }

        private b<T> f() {
            this.e = 1;
            return this;
        }

        private b<T> h(int n8) {
            boolean bl = this.d == 0;
            E.d(bl, "Instantiation type has already been set.");
            this.d = n8;
            return this;
        }

        private void i(F<?> f8) {
            E.a(this.b.contains(f8) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r r8) {
            E.c(r8, "Null dependency");
            this.i(r8.c());
            this.c.add(r8);
            return this;
        }

        public c<T> c() {
            boolean bl = this.f != null;
            E.d(bl, "Missing required property: factory.");
            return new c(this.a, new HashSet<F<? super T>>(this.b), new HashSet<r>(this.c), this.d, this.e, this.f, this.g);
        }

        public b<T> d() {
            return this.h(2);
        }

        public b<T> e(h<T> h8) {
            this.f = E.c(h8, "Null factory");
            return this;
        }

        public b<T> g(String string) {
            this.a = string;
            return this;
        }
    }
}

