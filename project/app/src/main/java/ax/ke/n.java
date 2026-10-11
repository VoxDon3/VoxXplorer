/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.C;
import ax.ke.D;
import ax.ke.E;
import ax.ke.F;
import ax.ke.H;
import ax.ke.I;
import ax.ke.i;
import ax.ke.p;
import ax.ke.q;
import ax.wb.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

abstract class n<ResponseT, ReturnT>
extends F<ReturnT> {
    private final C a;
    private final Call.Factory b;
    private final i<ResponseBody, ResponseT> c;

    n(C c8, Call.Factory factory2, i<ResponseBody, ResponseT> i8) {
        this.a = c8;
        this.b = factory2;
        this.c = i8;
    }

    private static <ResponseT, ReturnT> ax.ke.c<ResponseT, ReturnT> d(E object, Method method, Type type, Annotation[] annotationArray) {
        try {
            object = ((E)object).a(type, annotationArray);
            return object;
        }
        catch (RuntimeException runtimeException) {
            throw I.n(method, runtimeException, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> i<ResponseBody, ResponseT> e(E object, Method method, Type type) {
        Annotation[] annotationArray = method.getAnnotations();
        try {
            object = ((E)object).h(type, annotationArray);
            return object;
        }
        catch (RuntimeException runtimeException) {
            throw I.n(method, runtimeException, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(E object, Method object2, C c8) {
        boolean bl;
        Object object3;
        boolean bl2 = c8.k;
        Annotation[] annotationArray = ((AccessibleObject)object2).getAnnotations();
        if (bl2) {
            object3 = ((Method)object2).getGenericParameterTypes();
            if (I.h((Type)(object3 = I.f(0, (ParameterizedType)object3[((Type[])object3).length - 1]))) == D.class && object3 instanceof ParameterizedType) {
                object3 = I.g(0, (ParameterizedType)object3);
                bl = true;
            } else {
                bl = false;
            }
            object3 = new I.b(null, (Type)((Object)ax.ke.b.class), new Type[]{object3});
            annotationArray = H.a(annotationArray);
        } else {
            object3 = ((Method)object2).getGenericReturnType();
            bl = false;
        }
        object3 = n.d((E)object, (Method)object2, (Type)object3, annotationArray);
        annotationArray = object3.b();
        if (annotationArray != Response.class) {
            if (annotationArray != D.class) {
                if (c8.c.equals("HEAD") && !Void.class.equals((Object)annotationArray)) {
                    throw I.m((Method)object2, "HEAD method must use Void as response type.", new Object[0]);
                }
                object2 = n.e((E)object, (Method)object2, (Type)annotationArray);
                object = ((E)object).b;
                if (!bl2) {
                    return new a(c8, (Call.Factory)object, object2, object3);
                }
                if (bl) {
                    return new c(c8, (Call.Factory)object, object2, object3);
                }
                return new b(c8, (Call.Factory)object, object2, object3, false);
            }
            throw I.m((Method)object2, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("'");
        ((StringBuilder)object).append(I.h((Type)annotationArray).getName());
        ((StringBuilder)object).append("' is not a valid response body type. Did you mean ResponseBody?");
        throw I.m((Method)object2, ((StringBuilder)object).toString(), new Object[0]);
    }

    @Override
    final ReturnT a(Object[] objectArray) {
        return this.c(new q<ResponseT>(this.a, objectArray, this.b, this.c), objectArray);
    }

    protected abstract ReturnT c(ax.ke.b<ResponseT> var1, Object[] var2);

    static final class a<ResponseT, ReturnT>
    extends n<ResponseT, ReturnT> {
        private final ax.ke.c<ResponseT, ReturnT> d;

        a(C c8, Call.Factory factory2, i<ResponseBody, ResponseT> i8, ax.ke.c<ResponseT, ReturnT> c9) {
            super(c8, factory2, i8);
            this.d = c9;
        }

        @Override
        protected ReturnT c(ax.ke.b<ResponseT> b8, Object[] objectArray) {
            return this.d.a(b8);
        }
    }

    static final class b<ResponseT>
    extends n<ResponseT, Object> {
        private final ax.ke.c<ResponseT, ax.ke.b<ResponseT>> d;
        private final boolean e;

        b(C c8, Call.Factory factory2, i<ResponseBody, ResponseT> i8, ax.ke.c<ResponseT, ax.ke.b<ResponseT>> c9, boolean bl) {
            super(c8, factory2, i8);
            this.d = c9;
            this.e = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected Object c(ax.ke.b<ResponseT> object, Object[] object2) {
            ax.ke.b<ResponseT> b8 = this.d.a((ax.ke.b<ResponseT>)object);
            object = (e)object2[((Object[])object2).length - 1];
            try {
                if (!this.e) return p.a(b8, object);
                return p.b(b8, object);
            }
            catch (Exception exception) {
                return p.d(exception, object);
            }
        }
    }

    static final class c<ResponseT>
    extends n<ResponseT, Object> {
        private final ax.ke.c<ResponseT, ax.ke.b<ResponseT>> d;

        c(C c8, Call.Factory factory2, i<ResponseBody, ResponseT> i8, ax.ke.c<ResponseT, ax.ke.b<ResponseT>> c9) {
            super(c8, factory2, i8);
            this.d = c9;
        }

        @Override
        protected Object c(ax.ke.b<ResponseT> object, Object[] object2) {
            ax.ke.b<ResponseT> b8 = this.d.a((ax.ke.b<ResponseT>)object);
            object = (e)object2[((Object[])object2).length - 1];
            try {
                object2 = p.c(b8, object);
                return object2;
            }
            catch (Exception exception) {
                return p.d(exception, object);
            }
        }
    }
}

