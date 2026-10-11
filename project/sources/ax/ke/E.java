package ax.ke;

import ax.ke.C2429a;
import ax.ke.InterfaceC2431c;
import ax.ke.InterfaceC2437i;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
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

/* loaded from: classes3.dex */
public final class E {
    private final Map<Method, F<?>> a = new ConcurrentHashMap();
    final Call.Factory b;
    final HttpUrl c;
    final List<InterfaceC2437i.a> d;
    final List<InterfaceC2431c.a> e;
    final Executor f;
    final boolean g;

    class a implements InvocationHandler {
        private final A a = A.f();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            return this.a.h(method) ? this.a.g(method, this.c, obj, objArr) : E.this.c(method).a(objArr);
        }
    }

    E(Call.Factory factory, HttpUrl httpUrl, List<InterfaceC2437i.a> list, List<InterfaceC2431c.a> list2, Executor executor, boolean z) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = z;
    }

    private void j(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.g) {
            A f = A.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!f.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public InterfaceC2431c<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    F<?> c(Method method) {
        F<?> f;
        F<?> f2 = this.a.get(method);
        if (f2 != null) {
            return f2;
        }
        synchronized (this.a) {
            try {
                f = this.a.get(method);
                if (f == null) {
                    f = F.b(this, method);
                    this.a.put(method, f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public InterfaceC2431c<?, ?> d(InterfaceC2431c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2431c<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC2437i<T, RequestBody> e(InterfaceC2437i.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2437i<T, RequestBody> interfaceC2437i = (InterfaceC2437i<T, RequestBody>) this.d.get(i).c(type, annotationArr, annotationArr2, this);
            if (interfaceC2437i != null) {
                return interfaceC2437i;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC2437i<ResponseBody, T> f(InterfaceC2437i.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2437i<ResponseBody, T> interfaceC2437i = (InterfaceC2437i<ResponseBody, T>) this.d.get(i).d(type, annotationArr, this);
            if (interfaceC2437i != null) {
                return interfaceC2437i;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC2437i<T, RequestBody> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> InterfaceC2437i<ResponseBody, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> InterfaceC2437i<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2437i<T, String> interfaceC2437i = (InterfaceC2437i<T, String>) this.d.get(i).e(type, annotationArr, this);
            if (interfaceC2437i != null) {
                return interfaceC2437i;
            }
        }
        return C2429a.d.a;
    }

    public static final class b {
        private final A a;
        private Call.Factory b;
        private HttpUrl c;
        private final List<InterfaceC2437i.a> d;
        private final List<InterfaceC2431c.a> e;
        private Executor f;
        private boolean g;

        b(A a) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = a;
        }

        public b a(InterfaceC2437i.a aVar) {
            List<InterfaceC2437i.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return c(HttpUrl.get(str));
        }

        public b c(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if (HttpUrl.FRAGMENT_ENCODE_SET.equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                this.c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public E d() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory factory = this.b;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Call.Factory factory2 = factory;
            Executor executor = this.f;
            if (executor == null) {
                executor = this.a.b();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(this.a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.d());
            arrayList2.add(new C2429a());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.a.c());
            return new E(factory2, this.c, DesugarCollections.unmodifiableList(arrayList2), DesugarCollections.unmodifiableList(arrayList), executor2, this.g);
        }

        public b e(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.b = factory;
            return this;
        }

        public b f(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return e(okHttpClient);
        }

        public b() {
            this(A.f());
        }
    }
}
