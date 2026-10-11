package androidx.lifecycle;

import android.app.Application;
import ax.G0.t;
import ax.G0.u;
import ax.G0.v;
import ax.I0.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class q {
    private final r a;
    private final b b;
    private final ax.I0.a c;

    public interface b {
        <T extends p> T a(Class<T> cls);

        <T extends p> T b(Class<T> cls, ax.I0.a aVar);
    }

    public static class c implements b {
        private static c b;
        public static final a a = new a(null);
        public static final a.b<String> c = a.C0025a.a;

        public static final class a {

            /* renamed from: androidx.lifecycle.q$c$a$a, reason: collision with other inner class name */
            private static final class C0025a implements a.b<String> {
                public static final C0025a a = new C0025a();

                private C0025a() {
                }
            }

            public /* synthetic */ a(ax.Gb.g gVar) {
                this();
            }

            public final c a() {
                if (c.b == null) {
                    c.b = new c();
                }
                c cVar = c.b;
                ax.Gb.l.c(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.q.b
        public <T extends p> T a(Class<T> cls) {
            ax.Gb.l.f(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                ax.Gb.l.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }

        @Override // androidx.lifecycle.q.b
        public /* synthetic */ p b(Class cls, ax.I0.a aVar) {
            return t.b(this, cls, aVar);
        }
    }

    public static class d {
        public void c(p pVar) {
            ax.Gb.l.f(pVar, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(r rVar, b bVar) {
        this(rVar, bVar, null, 4, null);
        ax.Gb.l.f(rVar, "store");
        ax.Gb.l.f(bVar, "factory");
    }

    public <T extends p> T a(Class<T> cls) {
        ax.Gb.l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends p> T b(String str, Class<T> cls) {
        T t;
        ax.Gb.l.f(str, "key");
        ax.Gb.l.f(cls, "modelClass");
        T t2 = (T) this.a.b(str);
        if (!cls.isInstance(t2)) {
            ax.I0.d dVar = new ax.I0.d(this.c);
            dVar.c(c.c, str);
            try {
                t = (T) this.b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                t = (T) this.b.a(cls);
            }
            this.a.d(str, t);
            return t;
        }
        Object obj = this.b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            ax.Gb.l.c(t2);
            dVar2.c(t2);
        }
        ax.Gb.l.d(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t2;
    }

    public static class a extends c {
        private static a f;
        private final Application d;
        public static final C0023a e = new C0023a(null);
        public static final a.b<Application> g = C0023a.C0024a.a;

        /* renamed from: androidx.lifecycle.q$a$a, reason: collision with other inner class name */
        public static final class C0023a {

            /* renamed from: androidx.lifecycle.q$a$a$a, reason: collision with other inner class name */
            private static final class C0024a implements a.b<Application> {
                public static final C0024a a = new C0024a();

                private C0024a() {
                }
            }

            public /* synthetic */ C0023a(ax.Gb.g gVar) {
                this();
            }

            public final a a(Application application) {
                ax.Gb.l.f(application, "application");
                if (a.f == null) {
                    a.f = new a(application);
                }
                a aVar = a.f;
                ax.Gb.l.c(aVar);
                return aVar;
            }

            private C0023a() {
            }
        }

        private a(Application application, int i) {
            this.d = application;
        }

        private final <T extends p> T g(Class<T> cls, Application application) {
            if (!ax.G0.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                ax.Gb.l.e(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }

        @Override // androidx.lifecycle.q.c, androidx.lifecycle.q.b
        public <T extends p> T a(Class<T> cls) {
            ax.Gb.l.f(cls, "modelClass");
            Application application = this.d;
            if (application != null) {
                return (T) g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.q.c, androidx.lifecycle.q.b
        public <T extends p> T b(Class<T> cls, ax.I0.a aVar) {
            ax.Gb.l.f(cls, "modelClass");
            ax.Gb.l.f(aVar, "extras");
            if (this.d != null) {
                return (T) a(cls);
            }
            Application application = (Application) aVar.a(g);
            if (application != null) {
                return (T) g(cls, application);
            }
            if (ax.G0.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            ax.Gb.l.f(application, "application");
        }
    }

    public q(r rVar, b bVar, ax.I0.a aVar) {
        ax.Gb.l.f(rVar, "store");
        ax.Gb.l.f(bVar, "factory");
        ax.Gb.l.f(aVar, "defaultCreationExtras");
        this.a = rVar;
        this.b = bVar;
        this.c = aVar;
    }

    public /* synthetic */ q(r rVar, b bVar, ax.I0.a aVar, int i, ax.Gb.g gVar) {
        this(rVar, bVar, (i & 4) != 0 ? a.C0090a.b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(v vVar, b bVar) {
        this(vVar.getViewModelStore(), bVar, u.a(vVar));
        ax.Gb.l.f(vVar, "owner");
        ax.Gb.l.f(bVar, "factory");
    }
}
