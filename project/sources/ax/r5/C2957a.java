package ax.r5;

import ax.ib.InterfaceC2296a;

/* renamed from: ax.r5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2957a<T> implements InterfaceC2296a<T> {
    private static final Object c = new Object();
    private volatile InterfaceC2296a<T> a;
    private volatile Object b = c;

    private C2957a(InterfaceC2296a<T> interfaceC2296a) {
        this.a = interfaceC2296a;
    }

    public static <P extends InterfaceC2296a<T>, T> InterfaceC2296a<T> a(P p) {
        C2960d.b(p);
        return p instanceof C2957a ? p : new C2957a(p);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == c) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ax.ib.InterfaceC2296a
    public T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    this.b = b(this.b, t);
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
