package ax.r0;

import ax.r0.AbstractC2914a;
import ax.r0.AbstractC2937y;
import ax.r0.AbstractC2937y.a;
import ax.r0.C2904A;
import ax.r0.C2933u;
import ax.r0.S;
import ax.r0.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: ax.r0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2937y<MessageType extends AbstractC2937y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2914a<MessageType, BuilderType> {
    private static Map<Object, AbstractC2937y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected p0 unknownFields = p0.e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: ax.r0.y$a */
    public static abstract class a<MessageType extends AbstractC2937y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2914a.AbstractC0432a<MessageType, BuilderType> {
        protected MessageType c0;
        protected boolean d0 = false;
        private final MessageType q;

        protected a(MessageType messagetype) {
            this.q = messagetype;
            this.c0 = (MessageType) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        private void B(MessageType messagetype, MessageType messagetype2) {
            d0.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // ax.r0.S.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final MessageType g() {
            MessageType u0 = u0();
            if (u0.b()) {
                return u0;
            }
            throw AbstractC2914a.AbstractC0432a.r(u0);
        }

        @Override // ax.r0.S.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType u0() {
            if (this.d0) {
                return this.c0;
            }
            this.c0.B();
            this.d0 = true;
            return this.c0;
        }

        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().j();
            buildertype.z(u0());
            return buildertype;
        }

        protected void w() {
            if (this.d0) {
                MessageType messagetype = (MessageType) this.c0.t(f.NEW_MUTABLE_INSTANCE);
                B(messagetype, this.c0);
                this.c0 = messagetype;
                this.d0 = false;
            }
        }

        @Override // ax.r0.T
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public MessageType c() {
            return this.q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.r0.AbstractC2914a.AbstractC0432a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public BuilderType n(MessageType messagetype) {
            return z(messagetype);
        }

        public BuilderType z(MessageType messagetype) {
            w();
            B(this.c0, messagetype);
            return this;
        }
    }

    /* renamed from: ax.r0.y$b */
    protected static class b<T extends AbstractC2937y<T, ?>> extends AbstractC2915b<T> {
        private final T b;

        public b(T t) {
            this.b = t;
        }

        @Override // ax.r0.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(AbstractC2922i abstractC2922i, C2929p c2929p) throws C2905B {
            return (T) AbstractC2937y.G(this.b, abstractC2922i, c2929p);
        }
    }

    /* renamed from: ax.r0.y$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC2937y<MessageType, BuilderType> implements T {
        protected C2933u<d> extensions = C2933u.h();

        C2933u<d> J() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // ax.r0.AbstractC2937y, ax.r0.T
        public /* bridge */ /* synthetic */ S c() {
            return super.c();
        }

        @Override // ax.r0.AbstractC2937y, ax.r0.S
        public /* bridge */ /* synthetic */ S.a d() {
            return super.d();
        }

        @Override // ax.r0.AbstractC2937y, ax.r0.S
        public /* bridge */ /* synthetic */ S.a j() {
            return super.j();
        }
    }

    /* renamed from: ax.r0.y$d */
    static final class d implements C2933u.b<d> {
        final u0.b c0;
        final boolean d0;
        final boolean e0;
        final int q;

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.q - dVar.q;
        }

        @Override // ax.r0.C2933u.b
        public int g() {
            return this.q;
        }

        public C2904A.d<?> h() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.r0.C2933u.b
        public S.a i(S.a aVar, S s) {
            return ((a) aVar).z((AbstractC2937y) s);
        }

        @Override // ax.r0.C2933u.b
        public boolean k() {
            return this.d0;
        }

        @Override // ax.r0.C2933u.b
        public u0.b m() {
            return this.c0;
        }

        @Override // ax.r0.C2933u.b
        public u0.c y() {
            return this.c0.d();
        }

        @Override // ax.r0.C2933u.b
        public boolean z() {
            return this.e0;
        }
    }

    /* renamed from: ax.r0.y$e */
    public static class e<ContainingType extends S, Type> extends AbstractC2927n<ContainingType, Type> {
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

    /* renamed from: ax.r0.y$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final <T extends AbstractC2937y<T, ?>> boolean A(T t, boolean z) {
        byte byteValue = ((Byte) t.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = d0.a().e(t).c(t);
        if (z) {
            t.u(f.SET_MEMOIZED_IS_INITIALIZED, c2 ? t : null);
        }
        return c2;
    }

    protected static <E> C2904A.i<E> C(C2904A.i<E> iVar) {
        int size = iVar.size();
        return iVar.L(size == 0 ? 10 : size * 2);
    }

    protected static Object E(S s, String str, Object[] objArr) {
        return new f0(s, str, objArr);
    }

    protected static <T extends AbstractC2937y<T, ?>> T F(T t, InputStream inputStream) throws C2905B {
        return (T) r(G(t, AbstractC2922i.f(inputStream), C2929p.b()));
    }

    static <T extends AbstractC2937y<T, ?>> T G(T t, AbstractC2922i abstractC2922i, C2929p c2929p) throws C2905B {
        T t2 = (T) t.t(f.NEW_MUTABLE_INSTANCE);
        try {
            h0 e2 = d0.a().e(t2);
            e2.h(t2, C2923j.Q(abstractC2922i), c2929p);
            e2.b(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C2905B) {
                throw ((C2905B) e3.getCause());
            }
            throw new C2905B(e3.getMessage()).i(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C2905B) {
                throw ((C2905B) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends AbstractC2937y<?, ?>> void H(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends AbstractC2937y<T, ?>> T r(T t) throws C2905B {
        if (t == null || t.b()) {
            return t;
        }
        throw t.n().a().i(t);
    }

    protected static <E> C2904A.i<E> w() {
        return e0.h();
    }

    static <T extends AbstractC2937y<?, ?>> T x(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC2937y) s0.i(cls)).c();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected void B() {
        d0.a().e(this).b(this);
    }

    @Override // ax.r0.S
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final BuilderType j() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    @Override // ax.r0.S
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        BuilderType buildertype = (BuilderType) t(f.NEW_BUILDER);
        buildertype.z(this);
        return buildertype;
    }

    @Override // ax.r0.T
    public final boolean b() {
        return A(this, true);
    }

    @Override // ax.r0.AbstractC2914a
    int e() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().getClass().isInstance(obj)) {
            return d0.a().e(this).e(this, (AbstractC2937y) obj);
        }
        return false;
    }

    @Override // ax.r0.S
    public void f(AbstractC2924k abstractC2924k) throws IOException {
        d0.a().e(this).d(this, C2925l.P(abstractC2924k));
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int i2 = d0.a().e(this).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    @Override // ax.r0.S
    public int i() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d0.a().e(this).f(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // ax.r0.S
    public final a0<MessageType> k() {
        return (a0) t(f.GET_PARSER);
    }

    @Override // ax.r0.AbstractC2914a
    void o(int i) {
        this.memoizedSerializedSize = i;
    }

    Object q() throws Exception {
        return t(f.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends AbstractC2937y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    protected Object t(f fVar) {
        return v(fVar, null, null);
    }

    public String toString() {
        return U.e(this, super.toString());
    }

    protected Object u(f fVar, Object obj) {
        return v(fVar, obj, null);
    }

    protected abstract Object v(f fVar, Object obj, Object obj2);

    @Override // ax.r0.T
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final MessageType c() {
        return (MessageType) t(f.GET_DEFAULT_INSTANCE);
    }
}
