/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.B;
import ax.r0.S;
import ax.r0.T;
import ax.r0.U;
import ax.r0.a;
import ax.r0.a0;
import ax.r0.d0;
import ax.r0.e0;
import ax.r0.f0;
import ax.r0.h0;
import ax.r0.i;
import ax.r0.j;
import ax.r0.k;
import ax.r0.l;
import ax.r0.n;
import ax.r0.p;
import ax.r0.p0;
import ax.r0.s0;
import ax.r0.u;
import ax.r0.u0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
extends ax.r0.a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new j.ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected p0 unknownFields = p0.e();

    protected static final <T extends y<T, ?>> boolean A(T t8, boolean bl) {
        byte by = (Byte)t8.t(f.q);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl2 = d0.a().e(t8).c(t8);
        if (bl) {
            f f8 = f.c0;
            Object object = bl2 ? t8 : null;
            t8.u(f8, object);
        }
        return bl2;
    }

    protected static <E> A.i<E> C(A.i<E> i8) {
        int n8 = i8.size();
        n8 = n8 == 0 ? 10 : (n8 *= 2);
        return i8.L(n8);
    }

    protected static Object E(S s8, String string, Object[] objectArray) {
        return new f0(s8, string, objectArray);
    }

    protected static <T extends y<T, ?>> T F(T t8, InputStream inputStream) throws B {
        return y.r(y.G(t8, i.f(inputStream), p.b()));
    }

    static <T extends y<T, ?>> T G(T object, i i8, p p8) throws B {
        object = (y)object.t(f.e0);
        try {
            h0<T> h02 = d0.a().e(object);
            h02.h(object, j.Q(i8), p8);
            h02.b(object);
        }
        catch (IOException iOException) {
        }
        catch (RuntimeException runtimeException) {
            if (runtimeException.getCause() instanceof B) {
                throw (B)runtimeException.getCause();
            }
            throw runtimeException;
        }
        return object;
        if (iOException.getCause() instanceof B) {
            throw (B)iOException.getCause();
        }
        throw new B(iOException.getMessage()).i((S)object);
    }

    protected static <T extends y<?, ?>> void H(Class<T> clazz, T t8) {
        defaultInstanceMap.put(clazz, t8);
    }

    private static <T extends y<T, ?>> T r(T t8) throws B {
        if (t8 != null && !t8.b()) {
            throw t8.n().a().i(t8);
        }
        return t8;
    }

    protected static <E> A.i<E> w() {
        return e0.h();
    }

    static <T extends y<?, ?>> T x(Class<T> clazz) {
        y<?, ?> y8;
        y<Object, Object> y9 = y8 = defaultInstanceMap.get(clazz);
        if (y8 == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                y9 = defaultInstanceMap.get(clazz);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
            }
        }
        if (y9 == null) {
            y9 = ((y)s0.i(clazz)).y();
            if (y9 != null) {
                defaultInstanceMap.put(clazz, y9);
                return (T)y9;
            }
            throw new IllegalStateException();
        }
        return (T)y9;
    }

    static Object z(Method object, Object object2, Object ... objectArray) {
        try {
            object = ((Method)object).invoke(object2, objectArray);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
        }
    }

    protected void B() {
        d0.a().e(this).b(this);
    }

    public final BuilderType D() {
        return (BuilderType)((a)this.t(f.f0));
    }

    public final BuilderType I() {
        a a8 = (a)this.t(f.f0);
        a8.z(this);
        return (BuilderType)a8;
    }

    @Override
    public final boolean b() {
        return y.A(this, true);
    }

    @Override
    int e() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!this.y().getClass().isInstance(object)) {
            return false;
        }
        return d0.a().e(this).e(this, (y)object);
    }

    @Override
    public void f(k k8) throws IOException {
        d0.a().e(this).d(this, l.P(k8));
    }

    public int hashCode() {
        int n8 = this.memoizedHashCode;
        if (n8 != 0) {
            return n8;
        }
        this.memoizedHashCode = n8 = d0.a().e(this).i(this);
        return n8;
    }

    @Override
    public int i() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d0.a().e(this).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public final a0<MessageType> k() {
        return (a0)this.t(f.h0);
    }

    @Override
    void o(int n8) {
        this.memoizedSerializedSize = n8;
    }

    Object q() throws Exception {
        return this.t(f.d0);
    }

    protected final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType)((a)this.t(f.f0));
    }

    protected Object t(f f8) {
        return this.v(f8, null, null);
    }

    public String toString() {
        return U.e(this, super.toString());
    }

    protected Object u(f f8, Object object) {
        return this.v(f8, object, null);
    }

    protected abstract Object v(f var1, Object var2, Object var3);

    public final MessageType y() {
        return (MessageType)((y)this.t(f.g0));
    }

    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends a.a<MessageType, BuilderType> {
        protected MessageType c0;
        protected boolean d0;
        private final MessageType q;

        protected a(MessageType MessageType) {
            this.q = MessageType;
            this.c0 = (y)((y)MessageType).t(f.e0);
            this.d0 = false;
        }

        private void B(MessageType MessageType, MessageType MessageType2) {
            ax.r0.d0.a().e(MessageType).a(MessageType, MessageType2);
        }

        public final MessageType s() {
            MessageType MessageType = this.t();
            if (((y)MessageType).b()) {
                return MessageType;
            }
            throw a.a.r(MessageType);
        }

        public MessageType t() {
            if (this.d0) {
                return this.c0;
            }
            ((y)this.c0).B();
            this.d0 = true;
            return this.c0;
        }

        public BuilderType v() {
            Object BuilderType = ((y)this.x()).D();
            ((a)BuilderType).z(this.t());
            return BuilderType;
        }

        protected void w() {
            if (this.d0) {
                y y8 = (y)((y)this.c0).t(f.e0);
                this.B(y8, this.c0);
                this.c0 = y8;
                this.d0 = false;
            }
        }

        public MessageType x() {
            return this.q;
        }

        protected BuilderType y(MessageType MessageType) {
            return this.z(MessageType);
        }

        public BuilderType z(MessageType MessageType) {
            this.w();
            this.B(this.c0, MessageType);
            return (BuilderType)this;
        }
    }

    protected static class b<T extends y<T, ?>>
    extends ax.r0.b<T> {
        private final T b;

        public b(T t8) {
            this.b = t8;
        }

        public T g(i i8, p p8) throws B {
            return y.G(this.b, i8, p8);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType>
    extends y<MessageType, BuilderType>
    implements T {
        protected u<d> extensions = u.h();

        u<d> J() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.b();
            }
            return this.extensions;
        }
    }

    static final class d
    implements u.b<d> {
        final u0.b c0;
        final boolean d0;
        final boolean e0;
        final int q;

        public int d(d d8) {
            return this.q - d8.q;
        }

        @Override
        public int g() {
            return this.q;
        }

        public A.d<?> h() {
            return null;
        }

        @Override
        public S.a i(S.a a8, S s8) {
            return ((a)a8).z((y)s8);
        }

        @Override
        public boolean k() {
            return this.d0;
        }

        @Override
        public u0.b m() {
            return this.c0;
        }

        @Override
        public u0.c y() {
            return this.c0.d();
        }

        @Override
        public boolean z() {
            return this.e0;
        }
    }

    public static class e<ContainingType extends S, Type>
    extends n<ContainingType, Type> {
        final S a;
        final d b;

        public u0.b a() {
            return this.b.m();
        }

        public S b() {
            return this.a;
        }

        public int c() {
            return this.b.g();
        }

        public boolean d() {
            return this.b.d0;
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        public static final /* enum */ f d0;
        public static final /* enum */ f e0;
        public static final /* enum */ f f0;
        public static final /* enum */ f g0;
        public static final /* enum */ f h0;
        private static final f[] i0;
        public static final /* enum */ f q;

        static {
            f f8;
            f f9;
            f f10;
            f f11;
            f f12;
            f f13;
            f f14;
            q = f14 = new f();
            c0 = f13 = new f();
            d0 = f12 = new f();
            e0 = f11 = new f();
            f0 = f10 = new f();
            g0 = f9 = new f();
            h0 = f8 = new f();
            i0 = new f[]{f14, f13, f12, f11, f10, f9, f8};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])i0.clone();
        }
    }
}

