package ax.ke;

import ax.ke.I;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
abstract class n<ResponseT, ReturnT> extends F<ReturnT> {
    private final C a;
    private final Call.Factory b;
    private final InterfaceC2437i<ResponseBody, ResponseT> c;

    static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {
        private final InterfaceC2431c<ResponseT, ReturnT> d;

        a(C c, Call.Factory factory, InterfaceC2437i<ResponseBody, ResponseT> interfaceC2437i, InterfaceC2431c<ResponseT, ReturnT> interfaceC2431c) {
            super(c, factory, interfaceC2437i);
            this.d = interfaceC2431c;
        }

        @Override // ax.ke.n
        protected ReturnT c(InterfaceC2430b<ResponseT> interfaceC2430b, Object[] objArr) {
            return this.d.a(interfaceC2430b);
        }
    }

    static final class b<ResponseT> extends n<ResponseT, Object> {
        private final InterfaceC2431c<ResponseT, InterfaceC2430b<ResponseT>> d;
        private final boolean e;

        b(C c, Call.Factory factory, InterfaceC2437i<ResponseBody, ResponseT> interfaceC2437i, InterfaceC2431c<ResponseT, InterfaceC2430b<ResponseT>> interfaceC2431c, boolean z) {
            super(c, factory, interfaceC2437i);
            this.d = interfaceC2431c;
            this.e = z;
        }

        @Override // ax.ke.n
        protected Object c(InterfaceC2430b<ResponseT> interfaceC2430b, Object[] objArr) {
            InterfaceC2430b<ResponseT> a = this.d.a(interfaceC2430b);
            ax.wb.e eVar = (ax.wb.e) objArr[objArr.length - 1];
            try {
                return this.e ? p.b(a, eVar) : p.a(a, eVar);
            } catch (Exception e) {
                return p.d(e, eVar);
            }
        }
    }

    static final class c<ResponseT> extends n<ResponseT, Object> {
        private final InterfaceC2431c<ResponseT, InterfaceC2430b<ResponseT>> d;

        c(C c, Call.Factory factory, InterfaceC2437i<ResponseBody, ResponseT> interfaceC2437i, InterfaceC2431c<ResponseT, InterfaceC2430b<ResponseT>> interfaceC2431c) {
            super(c, factory, interfaceC2437i);
            this.d = interfaceC2431c;
        }

        @Override // ax.ke.n
        protected Object c(InterfaceC2430b<ResponseT> interfaceC2430b, Object[] objArr) {
            InterfaceC2430b<ResponseT> a = this.d.a(interfaceC2430b);
            ax.wb.e eVar = (ax.wb.e) objArr[objArr.length - 1];
            try {
                return p.c(a, eVar);
            } catch (Exception e) {
                return p.d(e, eVar);
            }
        }
    }

    n(C c2, Call.Factory factory, InterfaceC2437i<ResponseBody, ResponseT> interfaceC2437i) {
        this.a = c2;
        this.b = factory;
        this.c = interfaceC2437i;
    }

    private static <ResponseT, ReturnT> InterfaceC2431c<ResponseT, ReturnT> d(E e, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC2431c<ResponseT, ReturnT>) e.a(type, annotationArr);
        } catch (RuntimeException e2) {
            throw I.n(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> InterfaceC2437i<ResponseBody, ResponseT> e(E e, Method method, Type type) {
        try {
            return e.h(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw I.n(method, e2, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(E e, Method method, C c2) {
        Type genericReturnType;
        boolean z;
        boolean z2 = c2.k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = I.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (I.h(f) == D.class && (f instanceof ParameterizedType)) {
                f = I.g(0, (ParameterizedType) f);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new I.b(null, InterfaceC2430b.class, f);
            annotations = H.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        InterfaceC2431c d = d(e, method, genericReturnType, annotations);
        Type b2 = d.b();
        if (b2 == Response.class) {
            throw I.m(method, "'" + I.h(b2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (b2 == D.class) {
            throw I.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c2.c.equals("HEAD") && !Void.class.equals(b2)) {
            throw I.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        InterfaceC2437i e2 = e(e, method, b2);
        Call.Factory factory = e.b;
        return !z2 ? new a(c2, factory, e2, d) : z ? new c(c2, factory, e2, d) : new b(c2, factory, e2, d, false);
    }

    @Override // ax.ke.F
    final ReturnT a(Object[] objArr) {
        return c(new q(this.a, objArr, this.b, this.c), objArr);
    }

    protected abstract ReturnT c(InterfaceC2430b<ResponseT> interfaceC2430b, Object[] objArr);
}
