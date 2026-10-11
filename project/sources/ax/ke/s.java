package ax.ke;

import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
abstract class s<T> {

    class a extends s<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                s.this.a(b, it.next());
            }
        }
    }

    class b extends s<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.ke.s
        void a(B b, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                s.this.a(b, Array.get(obj, i));
            }
        }
    }

    static final class c<T> extends s<T> {
        private final Method a;
        private final int b;
        private final InterfaceC2437i<T, RequestBody> c;

        c(Method method, int i, InterfaceC2437i<T, RequestBody> interfaceC2437i) {
            this.a = method;
            this.b = i;
            this.c = interfaceC2437i;
        }

        @Override // ax.ke.s
        void a(B b, T t) {
            if (t == null) {
                throw I.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                b.l(this.c.a(t));
            } catch (IOException e) {
                throw I.p(this.a, e, this.b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d<T> extends s<T> {
        private final String a;
        private final InterfaceC2437i<T, String> b;
        private final boolean c;

        d(String str, InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC2437i;
            this.c = z;
        }

        @Override // ax.ke.s
        void a(B b, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            b.a(this.a, a, this.c);
        }
    }

    static final class e<T> extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final InterfaceC2437i<T, String> c;
        private final boolean d;

        e(Method method, int i, InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = interfaceC2437i;
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Map<String, T> map) throws IOException {
            if (map == null) {
                throw I.o(this.a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw I.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw I.o(this.a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String a = this.c.a(value);
                if (a == null) {
                    throw I.o(this.a, this.b, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                b.a(key, a, this.d);
            }
        }
    }

    static final class f<T> extends s<T> {
        private final String a;
        private final InterfaceC2437i<T, String> b;

        f(String str, InterfaceC2437i<T, String> interfaceC2437i) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC2437i;
        }

        @Override // ax.ke.s
        void a(B b, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            b.b(this.a, a);
        }
    }

    static final class g<T> extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final InterfaceC2437i<T, String> c;

        g(Method method, int i, InterfaceC2437i<T, String> interfaceC2437i) {
            this.a = method;
            this.b = i;
            this.c = interfaceC2437i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Map<String, T> map) throws IOException {
            if (map == null) {
                throw I.o(this.a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw I.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw I.o(this.a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                b.b(key, this.c.a(value));
            }
        }
    }

    static final class h extends s<Headers> {
        private final Method a;
        private final int b;

        h(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Headers headers) {
            if (headers == null) {
                throw I.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            b.c(headers);
        }
    }

    static final class i<T> extends s<T> {
        private final Method a;
        private final int b;
        private final Headers c;
        private final InterfaceC2437i<T, RequestBody> d;

        i(Method method, int i, Headers headers, InterfaceC2437i<T, RequestBody> interfaceC2437i) {
            this.a = method;
            this.b = i;
            this.c = headers;
            this.d = interfaceC2437i;
        }

        @Override // ax.ke.s
        void a(B b, T t) {
            if (t == null) {
                return;
            }
            try {
                b.d(this.c, this.d.a(t));
            } catch (IOException e) {
                throw I.o(this.a, this.b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    static final class j<T> extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final InterfaceC2437i<T, RequestBody> c;
        private final String d;

        j(Method method, int i, InterfaceC2437i<T, RequestBody> interfaceC2437i, String str) {
            this.a = method;
            this.b = i;
            this.c = interfaceC2437i;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Map<String, T> map) throws IOException {
            if (map == null) {
                throw I.o(this.a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw I.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw I.o(this.a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                b.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.d), this.c.a(value));
            }
        }
    }

    static final class k<T> extends s<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final InterfaceC2437i<T, String> d;
        private final boolean e;

        k(Method method, int i, String str, InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = interfaceC2437i;
            this.e = z;
        }

        @Override // ax.ke.s
        void a(B b, T t) throws IOException {
            if (t != null) {
                b.f(this.c, this.d.a(t), this.e);
                return;
            }
            throw I.o(this.a, this.b, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l<T> extends s<T> {
        private final String a;
        private final InterfaceC2437i<T, String> b;
        private final boolean c;

        l(String str, InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC2437i;
            this.c = z;
        }

        @Override // ax.ke.s
        void a(B b, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            b.g(this.a, a, this.c);
        }
    }

    static final class m<T> extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final InterfaceC2437i<T, String> c;
        private final boolean d;

        m(Method method, int i, InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = interfaceC2437i;
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, Map<String, T> map) throws IOException {
            if (map == null) {
                throw I.o(this.a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw I.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw I.o(this.a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String a = this.c.a(value);
                if (a == null) {
                    throw I.o(this.a, this.b, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                b.g(key, a, this.d);
            }
        }
    }

    static final class n<T> extends s<T> {
        private final InterfaceC2437i<T, String> a;
        private final boolean b;

        n(InterfaceC2437i<T, String> interfaceC2437i, boolean z) {
            this.a = interfaceC2437i;
            this.b = z;
        }

        @Override // ax.ke.s
        void a(B b, T t) throws IOException {
            if (t == null) {
                return;
            }
            b.g(this.a.a(t), null, this.b);
        }
    }

    static final class o extends s<MultipartBody.Part> {
        static final o a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ke.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(B b, MultipartBody.Part part) {
            if (part != null) {
                b.e(part);
            }
        }
    }

    static final class p extends s<Object> {
        private final Method a;
        private final int b;

        p(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // ax.ke.s
        void a(B b, Object obj) {
            if (obj == null) {
                throw I.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
            b.m(obj);
        }
    }

    static final class q<T> extends s<T> {
        final Class<T> a;

        q(Class<T> cls) {
            this.a = cls;
        }

        @Override // ax.ke.s
        void a(B b, T t) {
            b.h(this.a, t);
        }
    }

    s() {
    }

    abstract void a(B b2, T t) throws IOException;

    final s<Object> b() {
        return new b();
    }

    final s<Iterable<T>> c() {
        return new a();
    }
}
