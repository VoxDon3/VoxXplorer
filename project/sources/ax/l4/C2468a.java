package ax.l4;

import android.util.Log;
import ax.b0.C1444e;
import ax.b0.C1445f;
import ax.b0.InterfaceC1443d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468a {
    private static final g<Object> a = new C0361a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.l4.a$b */
    static class b<T> implements d<List<T>> {
        b() {
        }

        @Override // ax.l4.C2468a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.l4.a$c */
    static class c<T> implements g<List<T>> {
        c() {
        }

        @Override // ax.l4.C2468a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: ax.l4.a$d */
    public interface d<T> {
        T a();
    }

    /* renamed from: ax.l4.a$e */
    private static final class e<T> implements InterfaceC1443d<T> {
        private final d<T> a;
        private final g<T> b;
        private final InterfaceC1443d<T> c;

        e(InterfaceC1443d<T> interfaceC1443d, d<T> dVar, g<T> gVar) {
            this.c = interfaceC1443d;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // ax.b0.InterfaceC1443d
        public boolean a(T t) {
            if (t instanceof f) {
                ((f) t).l().b(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // ax.b0.InterfaceC1443d
        public T b() {
            T b = this.c.b();
            if (b == null) {
                b = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof f) {
                b.l().b(false);
            }
            return (T) b;
        }
    }

    /* renamed from: ax.l4.a$f */
    public interface f {
        AbstractC2469b l();
    }

    /* renamed from: ax.l4.a$g */
    public interface g<T> {
        void a(T t);
    }

    private static <T extends f> InterfaceC1443d<T> a(InterfaceC1443d<T> interfaceC1443d, d<T> dVar) {
        return b(interfaceC1443d, dVar, c());
    }

    private static <T> InterfaceC1443d<T> b(InterfaceC1443d<T> interfaceC1443d, d<T> dVar, g<T> gVar) {
        return new e(interfaceC1443d, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) a;
    }

    public static <T extends f> InterfaceC1443d<T> d(int i, d<T> dVar) {
        return a(new C1444e(i), dVar);
    }

    public static <T extends f> InterfaceC1443d<T> e(int i, d<T> dVar) {
        return a(new C1445f(i), dVar);
    }

    public static <T> InterfaceC1443d<List<T>> f() {
        return g(20);
    }

    public static <T> InterfaceC1443d<List<T>> g(int i) {
        return b(new C1445f(i), new b(), new c());
    }

    /* renamed from: ax.l4.a$a, reason: collision with other inner class name */
    static class C0361a implements g<Object> {
        C0361a() {
        }

        @Override // ax.l4.C2468a.g
        public void a(Object obj) {
        }
    }
}
