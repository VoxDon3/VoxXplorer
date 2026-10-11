package ax.ke;

import ax.ke.InterfaceC2437i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: ax.ke.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2429a extends InterfaceC2437i.a {
    private boolean a = true;

    /* renamed from: ax.ke.a$a, reason: collision with other inner class name */
    static final class C0354a implements InterfaceC2437i<ResponseBody, ResponseBody> {
        static final C0354a a = new C0354a();

        C0354a() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) throws IOException {
            try {
                return I.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: ax.ke.a$d */
    static final class d implements InterfaceC2437i<Object, String> {
        static final d a = new d();

        d() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: ax.ke.a$e */
    static final class e implements InterfaceC2437i<ResponseBody, ax.sb.t> {
        static final e a = new e();

        e() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.sb.t a(ResponseBody responseBody) {
            responseBody.close();
            return ax.sb.t.a;
        }
    }

    /* renamed from: ax.ke.a$f */
    static final class f implements InterfaceC2437i<ResponseBody, Void> {
        static final f a = new f();

        f() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    C2429a() {
    }

    @Override // ax.ke.InterfaceC2437i.a
    public InterfaceC2437i<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, E e2) {
        if (RequestBody.class.isAssignableFrom(I.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override // ax.ke.InterfaceC2437i.a
    public InterfaceC2437i<ResponseBody, ?> d(Type type, Annotation[] annotationArr, E e2) {
        if (type == ResponseBody.class) {
            return I.l(annotationArr, ax.me.w.class) ? c.a : C0354a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != ax.sb.t.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }

    /* renamed from: ax.ke.a$b */
    static final class b implements InterfaceC2437i<RequestBody, RequestBody> {
        static final b a = new b();

        b() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: ax.ke.a$c */
    static final class c implements InterfaceC2437i<ResponseBody, ResponseBody> {
        static final c a = new c();

        c() {
        }

        @Override // ax.ke.InterfaceC2437i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }
}
