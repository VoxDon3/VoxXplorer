/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.A;
import ax.D7.B;
import ax.D7.C;
import ax.a8.a;
import ax.a8.b;

class D<T>
implements b<T>,
a<T> {
    private static final a.a<Object> c = new A();
    private static final b<Object> d = new B();
    private a.a<T> a;
    private volatile b<T> b;

    private D(a.a<T> a8, b<T> b8) {
        this.a = a8;
        this.b = b8;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(a.a a8, a.a a9, b b8) {
        a8.a(b8);
        a9.a(b8);
    }

    public static /* synthetic */ void d(b b8) {
    }

    static <T> D<T> e() {
        return new D<Object>(c, d);
    }

    static <T> D<T> f(b<T> b8) {
        return new D<T>(null, b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a.a<T> a8) {
        b<T> b8 = this.b;
        b<Object> b9 = d;
        if (b8 != b9) {
            a8.a(b8);
            return;
        }
        synchronized (this) {
            b8 = this.b;
            if (b8 == b9) {
                C c8;
                b9 = this.a;
                this.a = c8 = new C((a.a)((Object)b9), a8);
                return;
            }
            b9 = b8;
        }
        if (b9 == null) return;
        a8.a(b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g(b<T> b8) {
        if (this.b == d) {
            a.a<T> a8;
            synchronized (this) {
                a8 = this.a;
                this.a = null;
                this.b = b8;
            }
            a8.a(b8);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public T get() {
        return this.b.get();
    }
}

