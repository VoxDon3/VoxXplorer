/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.A;
import ax.ke.F;
import ax.ke.a;
import ax.ke.c;
import ax.ke.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class E {
    private final Map<Method, F<?>> a = new j.ConcurrentHashMap();
    final Call.Factory b;
    final HttpUrl c;
    final List<i.a> d;
    final List<c.a> e;
    final Executor f;
    final boolean g;

    E(Call.Factory factory2, HttpUrl httpUrl, List<i.a> list, List<c.a> list2, Executor executor, boolean bl) {
        this.b = factory2;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = bl;
    }

    private void j(Class<?> object4) {
        if (((Class)object4).isInterface()) {
            Object object;
            Object object2 = new ArrayDeque(1);
            object2.add(object4);
            while (!object2.isEmpty()) {
                object = (Class)object2.removeFirst();
                if (((Class)object).getTypeParameters().length != 0) {
                    object2 = new StringBuilder("Type parameters are unsupported on ");
                    ((StringBuilder)object2).append(((Class)object).getName());
                    if (object != object4) {
                        ((StringBuilder)object2).append(" which is an interface of ");
                        ((StringBuilder)object2).append(((Class)object4).getName());
                    }
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
                Collections.addAll(object2, ((Class)object).getInterfaces());
            }
            if (this.g) {
                object = A.f();
                for (Method method : ((Class)object4).getDeclaredMethods()) {
                    if (((A)object).h(method) || Modifier.isStatic(method.getModifiers())) continue;
                    this.c(method);
                }
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public c<?, ?> a(Type type, Annotation[] annotationArray) {
        return this.d(null, type, annotationArray);
    }

    public <T> T b(Class<T> clazz) {
        this.j(clazz);
        ClassLoader classLoader = clazz.getClassLoader();
        InvocationHandler invocationHandler = new InvocationHandler(){
            private final A a;
            private final Object[] b;
            final Class c;
            final E d;
            {
                this.d = e8;
                this.c = clazz;
                this.a = A.f();
                this.b = new Object[0];
            }

            @Override
            public Object invoke(Object object, Method method, Object[] objectArray) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objectArray);
                }
                if (objectArray == null) {
                    objectArray = this.b;
                }
                if (this.a.h(method)) {
                    return this.a.g(method, this.c, object, objectArray);
                }
                return this.d.c(method).a(objectArray);
            }
        };
        return (T)Proxy.newProxyInstance(classLoader, new Class[]{clazz}, invocationHandler);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    F<?> c(Method method) {
        F<Object> f8 = this.a.get(method);
        if (f8 != null) {
            return f8;
        }
        Map<Method, F<?>> map = this.a;
        synchronized (map) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        F<?> f9;
                        f8 = f9 = this.a.get(method);
                        if (f9 != null) break block4;
                        f8 = F.b(this, method);
                        this.a.put(method, f8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return f8;
            }
            throw throwable2;
        }
    }

    public c<?, ?> d(c.a a8, Type type, Annotation[] object) {
        int n8;
        j.Objects.requireNonNull((Object)type, (String)"returnType == null");
        j.Objects.requireNonNull((Object)object, (String)"annotations == null");
        int n9 = this.e.indexOf(a8) + 1;
        int n10 = this.e.size();
        for (n8 = n9; n8 < n10; ++n8) {
            c<?, ?> c8 = this.e.get(n8).a(type, (Annotation[])object, this);
            if (c8 == null) continue;
            return c8;
        }
        object = new StringBuilder("Could not locate call adapter for ");
        ((StringBuilder)object).append(type);
        ((StringBuilder)object).append(".\n");
        if (a8 != null) {
            ((StringBuilder)object).append("  Skipped:");
            for (n8 = 0; n8 < n9; ++n8) {
                ((StringBuilder)object).append("\n   * ");
                ((StringBuilder)object).append(this.e.get(n8).getClass().getName());
            }
            ((StringBuilder)object).append('\n');
        }
        ((StringBuilder)object).append("  Tried:");
        n8 = this.e.size();
        while (n9 < n8) {
            ((StringBuilder)object).append("\n   * ");
            ((StringBuilder)object).append(this.e.get(n9).getClass().getName());
            ++n9;
        }
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public <T> i<T, RequestBody> e(i.a a8, Type type, Annotation[] object, Annotation[] annotationArray) {
        int n8;
        j.Objects.requireNonNull((Object)type, (String)"type == null");
        j.Objects.requireNonNull((Object)object, (String)"parameterAnnotations == null");
        j.Objects.requireNonNull((Object)annotationArray, (String)"methodAnnotations == null");
        int n9 = this.d.indexOf(a8) + 1;
        int n10 = this.d.size();
        for (n8 = n9; n8 < n10; ++n8) {
            i<?, RequestBody> i8 = this.d.get(n8).c(type, (Annotation[])object, annotationArray, this);
            if (i8 == null) continue;
            return i8;
        }
        object = new StringBuilder("Could not locate RequestBody converter for ");
        ((StringBuilder)object).append(type);
        ((StringBuilder)object).append(".\n");
        if (a8 != null) {
            ((StringBuilder)object).append("  Skipped:");
            for (n8 = 0; n8 < n9; ++n8) {
                ((StringBuilder)object).append("\n   * ");
                ((StringBuilder)object).append(this.d.get(n8).getClass().getName());
            }
            ((StringBuilder)object).append('\n');
        }
        ((StringBuilder)object).append("  Tried:");
        n8 = this.d.size();
        while (n9 < n8) {
            ((StringBuilder)object).append("\n   * ");
            ((StringBuilder)object).append(this.d.get(n9).getClass().getName());
            ++n9;
        }
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public <T> i<ResponseBody, T> f(i.a a8, Type type, Annotation[] object) {
        int n8;
        j.Objects.requireNonNull((Object)type, (String)"type == null");
        j.Objects.requireNonNull((Object)object, (String)"annotations == null");
        int n9 = this.d.indexOf(a8) + 1;
        int n10 = this.d.size();
        for (n8 = n9; n8 < n10; ++n8) {
            i<ResponseBody, ?> i8 = this.d.get(n8).d(type, (Annotation[])object, this);
            if (i8 == null) continue;
            return i8;
        }
        object = new StringBuilder("Could not locate ResponseBody converter for ");
        ((StringBuilder)object).append(type);
        ((StringBuilder)object).append(".\n");
        if (a8 != null) {
            ((StringBuilder)object).append("  Skipped:");
            for (n8 = 0; n8 < n9; ++n8) {
                ((StringBuilder)object).append("\n   * ");
                ((StringBuilder)object).append(this.d.get(n8).getClass().getName());
            }
            ((StringBuilder)object).append('\n');
        }
        ((StringBuilder)object).append("  Tried:");
        n8 = this.d.size();
        while (n9 < n8) {
            ((StringBuilder)object).append("\n   * ");
            ((StringBuilder)object).append(this.d.get(n9).getClass().getName());
            ++n9;
        }
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public <T> i<T, RequestBody> g(Type type, Annotation[] annotationArray, Annotation[] annotationArray2) {
        return this.e(null, type, annotationArray, annotationArray2);
    }

    public <T> i<ResponseBody, T> h(Type type, Annotation[] annotationArray) {
        return this.f(null, type, annotationArray);
    }

    public <T> i<T, String> i(Type type, Annotation[] annotationArray) {
        j.Objects.requireNonNull((Object)type, (String)"type == null");
        j.Objects.requireNonNull((Object)annotationArray, (String)"annotations == null");
        int n8 = this.d.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            i<?, String> i9 = this.d.get(i8).e(type, annotationArray, this);
            if (i9 == null) continue;
            return i9;
        }
        return a.d.a;
    }

    public static final class b {
        private final A a;
        private Call.Factory b;
        private HttpUrl c;
        private final List<i.a> d = new ArrayList<i.a>();
        private final List<c.a> e = new ArrayList<c.a>();
        private Executor f;
        private boolean g;

        public b() {
            this(A.f());
        }

        b(A a8) {
            this.a = a8;
        }

        public b a(i.a a8) {
            List<i.a> list = this.d;
            j.Objects.requireNonNull((Object)a8, (String)"factory == null");
            list.add(a8);
            return this;
        }

        public b b(String string) {
            j.Objects.requireNonNull((Object)string, (String)"baseUrl == null");
            return this.c(HttpUrl.get(string));
        }

        public b c(HttpUrl httpUrl) {
            j.Objects.requireNonNull((Object)httpUrl, (String)"baseUrl == null");
            Object object = httpUrl.pathSegments();
            if ("".equals(object.get(object.size() - 1))) {
                this.c = httpUrl;
                return this;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("baseUrl must end in /: ");
            ((StringBuilder)object).append(httpUrl);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        public E d() {
            if (this.c != null) {
                Object object;
                Object object2 = this.b;
                Call.Factory factory2 = object2;
                if (object2 == null) {
                    factory2 = new OkHttpClient();
                }
                object2 = object = this.f;
                if (object == null) {
                    object2 = this.a.b();
                }
                object = new ArrayList<c.a>(this.e);
                object.addAll(this.a.a((Executor)object2));
                ArrayList<? extends i.a> arrayList = new ArrayList<i.a>(this.d.size() + 1 + this.a.d());
                arrayList.add(new a());
                arrayList.addAll(this.d);
                arrayList.addAll(this.a.c());
                return new E(factory2, this.c, java.util.DesugarCollections.unmodifiableList(arrayList), java.util.DesugarCollections.unmodifiableList((List)object), (Executor)object2, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b e(Call.Factory factory2) {
            j.Objects.requireNonNull((Object)factory2, (String)"factory == null");
            this.b = factory2;
            return this;
        }

        public b f(OkHttpClient okHttpClient) {
            j.Objects.requireNonNull((Object)okHttpClient, (String)"client == null");
            return this.e(okHttpClient);
        }
    }
}

