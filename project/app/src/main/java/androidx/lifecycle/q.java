/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import ax.G0.t;
import ax.G0.u;
import ax.G0.v;
import ax.Gb.g;
import ax.Gb.l;
import ax.I0.a;
import java.lang.reflect.InvocationTargetException;

public class q {
    private final r a;
    private final b b;
    private final ax.I0.a c;

    public q(r r8, b b8) {
        l.f(r8, "store");
        l.f(b8, "factory");
        this(r8, b8, null, 4, null);
    }

    public q(r r8, b b8, ax.I0.a a8) {
        l.f(r8, "store");
        l.f(b8, "factory");
        l.f(a8, "defaultCreationExtras");
        this.a = r8;
        this.b = b8;
        this.c = a8;
    }

    public /* synthetic */ q(r r8, b b8, ax.I0.a a8, int n8, g g8) {
        if ((n8 & 4) != 0) {
            a8 = a.a.b;
        }
        this(r8, b8, a8);
    }

    public q(v v8, b b8) {
        l.f(v8, "owner");
        l.f(b8, "factory");
        this(v8.getViewModelStore(), b8, u.a(v8));
    }

    public <T extends p> T a(Class<T> clazz) {
        l.f(clazz, "modelClass");
        String string = clazz.getCanonicalName();
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(string);
            return this.b(stringBuilder.toString(), clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends p> T b(String object, Class<T> object2) {
        l.f(object, "key");
        l.f(object2, "modelClass");
        Object object3 = this.a.b((String)object);
        if (((Class)object2).isInstance(object3)) {
            object = this.b;
            object = object instanceof d ? (d)object : null;
            if (object != null) {
                l.c(object3);
                ((d)object).c((p)object3);
            }
            l.d(object3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return (T)object3;
        }
        object3 = new ax.I0.d(this.c);
        ((ax.I0.d)object3).c(androidx.lifecycle.q$c.c, object);
        try {
            object2 = object3 = this.b.b(object2, (ax.I0.a)object3);
        }
        catch (AbstractMethodError abstractMethodError) {
            object2 = this.b.a(object2);
        }
        this.a.d((String)object, (p)object2);
        return (T)object2;
    }

    public static class androidx.lifecycle.q$a
    extends c {
        public static final a e = new a(null);
        private static androidx.lifecycle.q$a f;
        public static final a.b<Application> g;
        private final Application d;

        static {
            g = a.a.a;
        }

        public androidx.lifecycle.q$a() {
            this(null, 0);
        }

        public androidx.lifecycle.q$a(Application application) {
            l.f(application, "application");
            this(application, 0);
        }

        private androidx.lifecycle.q$a(Application application, int n8) {
            this.d = application;
        }

        private final <T extends p> T g(Class<T> clazz, Application object) {
            if (ax.G0.a.class.isAssignableFrom(clazz)) {
                NoSuchMethodException noSuchMethodException2;
                block8: {
                    IllegalAccessException illegalAccessException2;
                    block7: {
                        InstantiationException instantiationException2;
                        block6: {
                            try {
                                object = (p)clazz.getConstructor(Application.class).newInstance(object);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                            }
                            catch (InstantiationException instantiationException2) {
                                break block6;
                            }
                            catch (IllegalAccessException illegalAccessException2) {
                                break block7;
                            }
                            catch (NoSuchMethodException noSuchMethodException2) {
                                break block8;
                            }
                            l.e(object, "{\n                try {\n\u2026          }\n            }");
                            return (T)object;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Cannot create an instance of ");
                            stringBuilder.append(clazz);
                            throw new RuntimeException(stringBuilder.toString(), invocationTargetException);
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot create an instance of ");
                        stringBuilder.append(clazz);
                        throw new RuntimeException(stringBuilder.toString(), instantiationException2);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot create an instance of ");
                    stringBuilder.append(clazz);
                    throw new RuntimeException(stringBuilder.toString(), illegalAccessException2);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Cannot create an instance of ");
                ((StringBuilder)object).append(clazz);
                throw new RuntimeException(((StringBuilder)object).toString(), noSuchMethodException2);
            }
            return super.a(clazz);
        }

        @Override
        public <T extends p> T a(Class<T> clazz) {
            l.f(clazz, "modelClass");
            Application application = this.d;
            if (application != null) {
                return this.g(clazz, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override
        public <T extends p> T b(Class<T> clazz, ax.I0.a a8) {
            l.f(clazz, "modelClass");
            l.f(a8, "extras");
            if (this.d != null) {
                return this.a(clazz);
            }
            if ((a8 = a8.a(g)) != null) {
                return this.g(clazz, (Application)a8);
            }
            if (!ax.G0.a.class.isAssignableFrom(clazz)) {
                return super.a(clazz);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public static final class androidx.lifecycle.q$a$a {
            private androidx.lifecycle.q$a$a() {
            }

            public /* synthetic */ androidx.lifecycle.q$a$a(g g8) {
                this();
            }

            public final androidx.lifecycle.q$a a(Application object) {
                l.f(object, "application");
                if (f == null) {
                    f = new androidx.lifecycle.q$a((Application)object);
                }
                object = f;
                l.c(object);
                return object;
            }

            private static final class a
            implements a.b<Application> {
                public static final a a = new a();

                private a() {
                }
            }
        }
    }

    public static interface b {
        public <T extends p> T a(Class<T> var1);

        public <T extends p> T b(Class<T> var1, ax.I0.a var2);
    }

    public static class c
    implements b {
        public static final a a = new a(null);
        private static c b;
        public static final a.b<String> c;

        static {
            c = a.a.a;
        }

        @Override
        public <T extends p> T a(Class<T> clazz) {
            NoSuchMethodException noSuchMethodException2;
            block5: {
                InstantiationException instantiationException2;
                block4: {
                    Object object;
                    l.f(clazz, "modelClass");
                    try {
                        object = clazz.getDeclaredConstructor(null).newInstance(null);
                        l.e(object, "{\n                modelC\u2026wInstance()\n            }");
                        object = (p)object;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                    }
                    catch (InstantiationException instantiationException2) {
                        break block4;
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block5;
                    }
                    return object;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot create an instance of ");
                    stringBuilder.append(clazz);
                    throw new RuntimeException(stringBuilder.toString(), illegalAccessException);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot create an instance of ");
                stringBuilder.append(clazz);
                throw new RuntimeException(stringBuilder.toString(), instantiationException2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot create an instance of ");
            stringBuilder.append(clazz);
            throw new RuntimeException(stringBuilder.toString(), noSuchMethodException2);
        }

        public /* synthetic */ p b(Class clazz, ax.I0.a a8) {
            return t.b(this, clazz, a8);
        }

        public static final class androidx.lifecycle.q$c$a {
            private androidx.lifecycle.q$c$a() {
            }

            public /* synthetic */ androidx.lifecycle.q$c$a(g g8) {
                this();
            }

            public final c a() {
                if (b == null) {
                    b = new c();
                }
                c c8 = b;
                l.c(c8);
                return c8;
            }

            private static final class a
            implements a.b<String> {
                public static final a a = new a();

                private a() {
                }
            }
        }
    }

    public static class d {
        public void c(p p8) {
            l.f(p8, "viewModel");
        }
    }
}

