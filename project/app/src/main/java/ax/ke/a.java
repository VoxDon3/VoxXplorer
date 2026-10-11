/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.E;
import ax.ke.I;
import ax.ke.i;
import ax.me.w;
import ax.sb.t;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

final class a
extends i.a {
    private boolean a = true;

    a() {
    }

    @Override
    public i<?, RequestBody> c(Type type, Annotation[] annotationArray, Annotation[] annotationArray2, E e8) {
        if (RequestBody.class.isAssignableFrom(I.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override
    public i<ResponseBody, ?> d(Type object, Annotation[] annotationArray, E e8) {
        if (object == ResponseBody.class) {
            if (I.l(annotationArray, w.class)) {
                return c.a;
            }
            return ax.ke.a$a.a;
        }
        if (object == Void.class) {
            return f.a;
        }
        if (this.a && object == t.class) {
            try {
                object = e.a;
                return object;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                this.a = false;
            }
        }
        return null;
    }

    static final class a
    implements i<ResponseBody, ResponseBody> {
        static final a a = new a();

        a() {
        }

        public ResponseBody b(ResponseBody responseBody) throws IOException {
            try {
                ResponseBody responseBody2 = I.a(responseBody);
                return responseBody2;
            }
            finally {
                responseBody.close();
            }
        }
    }

    static final class b
    implements i<RequestBody, RequestBody> {
        static final b a = new b();

        b() {
        }

        public RequestBody b(RequestBody requestBody) {
            return requestBody;
        }
    }

    static final class c
    implements i<ResponseBody, ResponseBody> {
        static final c a = new c();

        c() {
        }

        public ResponseBody b(ResponseBody responseBody) {
            return responseBody;
        }
    }

    static final class d
    implements i<Object, String> {
        static final d a = new d();

        d() {
        }

        public String b(Object object) {
            return object.toString();
        }
    }

    static final class e
    implements i<ResponseBody, t> {
        static final e a = new e();

        e() {
        }

        public t b(ResponseBody responseBody) {
            responseBody.close();
            return t.a;
        }
    }

    static final class f
    implements i<ResponseBody, Void> {
        static final f a = new f();

        f() {
        }

        public Void b(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }
}

