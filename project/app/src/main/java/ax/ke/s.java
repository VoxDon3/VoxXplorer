/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.B;
import ax.ke.I;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

abstract class s<T> {
    s() {
    }

    abstract void a(B var1, T var2) throws IOException;

    final s<Object> b() {
        return new s<Object>(this){
            final s a;
            {
                this.a = s8;
            }

            @Override
            void a(B b8, Object object) throws IOException {
                if (object != null) {
                    int n8 = Array.getLength(object);
                    for (int i8 = 0; i8 < n8; ++i8) {
                        this.a.a(b8, Array.get(object, i8));
                    }
                }
            }
        };
    }

    final s<Iterable<T>> c() {
        return new s<Iterable<T>>(this){
            final s a;
            {
                this.a = s8;
            }

            void d(B b8, Iterable<T> object) throws IOException {
                if (object != null) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        Object e8 = object.next();
                        this.a.a(b8, e8);
                    }
                }
            }
        };
    }

    static final class c<T>
    extends s<T> {
        private final Method a;
        private final int b;
        private final ax.ke.i<T, RequestBody> c;

        c(Method method, int n8, ax.ke.i<T, RequestBody> i8) {
            this.a = method;
            this.b = n8;
            this.c = i8;
        }

        @Override
        void a(B object, T t8) {
            if (t8 != null) {
                try {
                    RequestBody requestBody = this.c.a(t8);
                    ((B)object).l(requestBody);
                    return;
                }
                catch (IOException iOException) {
                    Method method = this.a;
                    int n8 = this.b;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unable to convert ");
                    ((StringBuilder)object).append(t8);
                    ((StringBuilder)object).append(" to RequestBody");
                    throw I.p(method, iOException, n8, ((StringBuilder)object).toString(), new Object[0]);
                }
            }
            throw I.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    static final class d<T>
    extends s<T> {
        private final String a;
        private final ax.ke.i<T, String> b;
        private final boolean c;

        d(String string, ax.ke.i<T, String> i8, boolean bl) {
            j.Objects.requireNonNull((Object)string, (String)"name == null");
            this.a = string;
            this.b = i8;
            this.c = bl;
        }

        @Override
        void a(B b8, T object) throws IOException {
            if (object == null || (object = this.b.a(object)) == null) {
                return;
            }
            b8.a(this.a, (String)object, this.c);
        }
    }

    static final class e<T>
    extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ax.ke.i<T, String> c;
        private final boolean d;

        e(Method method, int n8, ax.ke.i<T, String> i8, boolean bl) {
            this.a = method;
            this.b = n8;
            this.c = i8;
            this.d = bl;
        }

        void d(B object, Map<String, T> object2) throws IOException {
            if (object2 != null) {
                Object object3 = object2.entrySet().iterator();
                while (object3.hasNext()) {
                    Map.Entry<String, T> entry = object3.next();
                    object2 = entry.getKey();
                    if (object2 != null) {
                        if ((entry = entry.getValue()) != null) {
                            String string = this.c.a(entry);
                            if (string != null) {
                                ((B)object).a((String)object2, string, this.d);
                                continue;
                            }
                            object3 = this.a;
                            int n8 = this.b;
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Field map value '");
                            ((StringBuilder)object).append(entry);
                            ((StringBuilder)object).append("' converted to null by ");
                            ((StringBuilder)object).append(this.c.getClass().getName());
                            ((StringBuilder)object).append(" for key '");
                            ((StringBuilder)object).append((String)object2);
                            ((StringBuilder)object).append("'.");
                            throw I.o((Method)object3, n8, ((StringBuilder)object).toString(), new Object[0]);
                        }
                        entry = this.a;
                        int n9 = this.b;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Field map contained null value for key '");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("'.");
                        throw I.o((Method)((Object)entry), n9, ((StringBuilder)object).toString(), new Object[0]);
                    }
                    throw I.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                return;
            }
            throw I.o(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    static final class f<T>
    extends s<T> {
        private final String a;
        private final ax.ke.i<T, String> b;

        f(String string, ax.ke.i<T, String> i8) {
            j.Objects.requireNonNull((Object)string, (String)"name == null");
            this.a = string;
            this.b = i8;
        }

        @Override
        void a(B b8, T object) throws IOException {
            if (object == null || (object = this.b.a(object)) == null) {
                return;
            }
            b8.b(this.a, (String)object);
        }
    }

    static final class g<T>
    extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ax.ke.i<T, String> c;

        g(Method method, int n8, ax.ke.i<T, String> i8) {
            this.a = method;
            this.b = n8;
            this.c = i8;
        }

        void d(B object, Map<String, T> object2) throws IOException {
            if (object2 != null) {
                Object object3 = object2.entrySet().iterator();
                while (object3.hasNext()) {
                    Map.Entry<String, Object> entry = object3.next();
                    object2 = entry.getKey();
                    if (object2 != null) {
                        if ((entry = entry.getValue()) != null) {
                            ((B)object).b((String)object2, this.c.a(entry));
                            continue;
                        }
                        object3 = this.a;
                        int n8 = this.b;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Header map contained null value for key '");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("'.");
                        throw I.o((Method)object3, n8, ((StringBuilder)object).toString(), new Object[0]);
                    }
                    throw I.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                return;
            }
            throw I.o(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    static final class h
    extends s<Headers> {
        private final Method a;
        private final int b;

        h(Method method, int n8) {
            this.a = method;
            this.b = n8;
        }

        void d(B b8, Headers headers) {
            if (headers != null) {
                b8.c(headers);
                return;
            }
            throw I.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class i<T>
    extends s<T> {
        private final Method a;
        private final int b;
        private final Headers c;
        private final ax.ke.i<T, RequestBody> d;

        i(Method method, int n8, Headers headers, ax.ke.i<T, RequestBody> i8) {
            this.a = method;
            this.b = n8;
            this.c = headers;
            this.d = i8;
        }

        @Override
        void a(B b8, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                RequestBody requestBody = this.d.a(t8);
                b8.d(this.c, requestBody);
                return;
            }
            catch (IOException iOException) {
                Method method = this.a;
                int n8 = this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert ");
                stringBuilder.append(t8);
                stringBuilder.append(" to RequestBody");
                throw I.o(method, n8, stringBuilder.toString(), iOException);
            }
        }
    }

    static final class j<T>
    extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ax.ke.i<T, RequestBody> c;
        private final String d;

        j(Method method, int n8, ax.ke.i<T, RequestBody> i8, String string) {
            this.a = method;
            this.b = n8;
            this.c = i8;
            this.d = string;
        }

        void d(B object, Map<String, T> object2) throws IOException {
            if (object2 != null) {
                Object object3 = object2.entrySet().iterator();
                while (object3.hasNext()) {
                    Map.Entry<String, Object> entry = object3.next();
                    object2 = entry.getKey();
                    if (object2 != null) {
                        if ((entry = entry.getValue()) != null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("form-data; name=\"");
                            stringBuilder.append((String)object2);
                            stringBuilder.append("\"");
                            ((B)object).d(Headers.of("Content-Disposition", stringBuilder.toString(), "Content-Transfer-Encoding", this.d), this.c.a(entry));
                            continue;
                        }
                        object3 = this.a;
                        int n8 = this.b;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Part map contained null value for key '");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("'.");
                        throw I.o((Method)object3, n8, ((StringBuilder)object).toString(), new Object[0]);
                    }
                    throw I.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                return;
            }
            throw I.o(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    static final class k<T>
    extends s<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final ax.ke.i<T, String> d;
        private final boolean e;

        k(Method method, int n8, String string, ax.ke.i<T, String> i8, boolean bl) {
            this.a = method;
            this.b = n8;
            j.Objects.requireNonNull((Object)string, (String)"name == null");
            this.c = string;
            this.d = i8;
            this.e = bl;
        }

        @Override
        void a(B object, T object2) throws IOException {
            if (object2 != null) {
                ((B)object).f(this.c, this.d.a(object2), this.e);
                return;
            }
            object2 = this.a;
            int n8 = this.b;
            object = new StringBuilder();
            ((StringBuilder)object).append("Path parameter \"");
            ((StringBuilder)object).append(this.c);
            ((StringBuilder)object).append("\" value must not be null.");
            throw I.o(object2, n8, ((StringBuilder)object).toString(), new Object[0]);
        }
    }

    static final class l<T>
    extends s<T> {
        private final String a;
        private final ax.ke.i<T, String> b;
        private final boolean c;

        l(String string, ax.ke.i<T, String> i8, boolean bl) {
            j.Objects.requireNonNull((Object)string, (String)"name == null");
            this.a = string;
            this.b = i8;
            this.c = bl;
        }

        @Override
        void a(B b8, T object) throws IOException {
            if (object == null || (object = this.b.a(object)) == null) {
                return;
            }
            b8.g(this.a, (String)object, this.c);
        }
    }

    static final class m<T>
    extends s<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ax.ke.i<T, String> c;
        private final boolean d;

        m(Method method, int n8, ax.ke.i<T, String> i8, boolean bl) {
            this.a = method;
            this.b = n8;
            this.c = i8;
            this.d = bl;
        }

        void d(B object, Map<String, T> object2) throws IOException {
            if (object2 != null) {
                Object object3 = object2.entrySet().iterator();
                while (object3.hasNext()) {
                    Map.Entry<String, T> entry = object3.next();
                    object2 = entry.getKey();
                    if (object2 != null) {
                        if ((entry = entry.getValue()) != null) {
                            String string = this.c.a(entry);
                            if (string != null) {
                                ((B)object).g((String)object2, string, this.d);
                                continue;
                            }
                            object = this.a;
                            int n8 = this.b;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Query map value '");
                            ((StringBuilder)object3).append(entry);
                            ((StringBuilder)object3).append("' converted to null by ");
                            ((StringBuilder)object3).append(this.c.getClass().getName());
                            ((StringBuilder)object3).append(" for key '");
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append("'.");
                            throw I.o((Method)object, n8, ((StringBuilder)object3).toString(), new Object[0]);
                        }
                        object = this.a;
                        int n9 = this.b;
                        entry = new StringBuilder();
                        ((StringBuilder)((Object)entry)).append("Query map contained null value for key '");
                        ((StringBuilder)((Object)entry)).append((String)object2);
                        ((StringBuilder)((Object)entry)).append("'.");
                        throw I.o((Method)object, n9, ((StringBuilder)((Object)entry)).toString(), new Object[0]);
                    }
                    throw I.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                return;
            }
            throw I.o(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    static final class n<T>
    extends s<T> {
        private final ax.ke.i<T, String> a;
        private final boolean b;

        n(ax.ke.i<T, String> i8, boolean bl) {
            this.a = i8;
            this.b = bl;
        }

        @Override
        void a(B b8, T t8) throws IOException {
            if (t8 == null) {
                return;
            }
            b8.g(this.a.a(t8), null, this.b);
        }
    }

    static final class o
    extends s<MultipartBody.Part> {
        static final o a = new o();

        private o() {
        }

        void d(B b8, MultipartBody.Part part) {
            if (part != null) {
                b8.e(part);
            }
        }
    }

    static final class p
    extends s<Object> {
        private final Method a;
        private final int b;

        p(Method method, int n8) {
            this.a = method;
            this.b = n8;
        }

        @Override
        void a(B b8, Object object) {
            if (object != null) {
                b8.m(object);
                return;
            }
            throw I.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class q<T>
    extends s<T> {
        final Class<T> a;

        q(Class<T> clazz) {
            this.a = clazz;
        }

        @Override
        void a(B b8, T t8) {
            b8.h(this.a, t8);
        }
    }
}

