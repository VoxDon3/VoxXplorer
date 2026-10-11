package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.AbstractC1599k4.b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: ax.b6.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1599k4<MessageType extends AbstractC1599k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC1647q3<MessageType, BuilderType> {
    private static Map<Object, AbstractC1599k4<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected F5 zzb = F5.k();

    /* renamed from: ax.b6.k4$a */
    protected static class a<T extends AbstractC1599k4<T, ?>> extends C1654r3<T> {
        public a(T t) {
        }
    }

    /* renamed from: ax.b6.k4$b */
    public static abstract class b<MessageType extends AbstractC1599k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC1639p3<MessageType, BuilderType> {
        protected MessageType c0;
        private final MessageType q;

        protected b(MessageType messagetype) {
            this.q = messagetype;
            if (messagetype.H()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.c0 = (MessageType) messagetype.B();
        }

        private static <MessageType> void n(MessageType messagetype, MessageType messagetype2) {
            C1582i5.a().c(messagetype).g(messagetype, messagetype2);
        }

        private final BuilderType v(byte[] bArr, int i, int i2, W3 w3) throws C1663s4 {
            if (!this.c0.H()) {
                t();
            }
            try {
                C1582i5.a().c(this.c0).h(this.c0, bArr, 0, i2, new C1686v3(w3));
                return this;
            } catch (C1663s4 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw C1663s4.f();
            }
        }

        @Override // ax.b6.W4
        public final boolean c() {
            return AbstractC1599k4.x(this.c0, false);
        }

        @Override // ax.b6.AbstractC1639p3
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.q.t(e.e, null, null);
            bVar.c0 = (MessageType) p();
            return bVar;
        }

        @Override // ax.b6.AbstractC1639p3
        public final /* synthetic */ AbstractC1639p3 k(byte[] bArr, int i, int i2) throws C1663s4 {
            return v(bArr, 0, i2, W3.c);
        }

        @Override // ax.b6.AbstractC1639p3
        public final /* synthetic */ AbstractC1639p3 l(byte[] bArr, int i, int i2, W3 w3) throws C1663s4 {
            return v(bArr, 0, i2, w3);
        }

        public final BuilderType m(MessageType messagetype) {
            if (this.q.equals(messagetype)) {
                return this;
            }
            if (!this.c0.H()) {
                t();
            }
            n(this.c0, messagetype);
            return this;
        }

        @Override // ax.b6.T4
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final MessageType q() {
            MessageType messagetype = (MessageType) p();
            if (AbstractC1599k4.x(messagetype, true)) {
                return messagetype;
            }
            throw new D5(messagetype);
        }

        @Override // ax.b6.T4
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType p() {
            if (!this.c0.H()) {
                return this.c0;
            }
            this.c0.F();
            return this.c0;
        }

        protected final void s() {
            if (this.c0.H()) {
                return;
            }
            t();
        }

        protected void t() {
            MessageType messagetype = (MessageType) this.q.B();
            n(messagetype, this.c0);
            this.c0 = messagetype;
        }
    }

    /* renamed from: ax.b6.k4$c */
    static final class c implements InterfaceC1554f4<c> {
        @Override // ax.b6.InterfaceC1554f4
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final O5 b() {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final Y5 c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final boolean e() {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final T4 o(T4 t4, U4 u4) {
            throw new NoSuchMethodError();
        }

        @Override // ax.b6.InterfaceC1554f4
        public final Y4 v(Y4 y4, Y4 y42) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: ax.b6.k4$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC1599k4<MessageType, BuilderType> implements W4 {
        protected C1536d4<c> zzc = C1536d4.i();

        final C1536d4<c> I() {
            if (this.zzc.r()) {
                this.zzc = (C1536d4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: ax.b6.k4$e */
    public enum e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* renamed from: ax.b6.k4$f */
    public static class f<ContainingType extends U4, Type> extends X3<ContainingType, Type> {
    }

    protected static InterfaceC1655r4 C() {
        return C1624n4.h();
    }

    protected static InterfaceC1648q4 D() {
        return F4.h();
    }

    protected static <E> InterfaceC1671t4<E> E() {
        return C1573h5.i();
    }

    private final int n() {
        return C1582i5.a().c(this).f(this);
    }

    static <T extends AbstractC1599k4<?, ?>> T o(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC1599k4) H5.b(cls)).t(e.f, null, null);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, t2);
        return t2;
    }

    protected static InterfaceC1648q4 r(InterfaceC1648q4 interfaceC1648q4) {
        int size = interfaceC1648q4.size();
        return interfaceC1648q4.d(size == 0 ? 10 : size << 1);
    }

    protected static <E> InterfaceC1671t4<E> s(InterfaceC1671t4<E> interfaceC1671t4) {
        int size = interfaceC1671t4.size();
        return interfaceC1671t4.d(size == 0 ? 10 : size << 1);
    }

    protected static Object u(U4 u4, String str, Object[] objArr) {
        return new C1591j5(u4, str, objArr);
    }

    static Object v(Method method, Object obj, Object... objArr) {
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

    protected static <T extends AbstractC1599k4<?, ?>> void w(Class<T> cls, T t) {
        t.G();
        zzc.put(cls, t);
    }

    protected static final <T extends AbstractC1599k4<T, ?>> boolean x(T t, boolean z) {
        byte byteValue = ((Byte) t.t(e.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = C1582i5.a().c(t).d(t);
        if (z) {
            t.t(e.b, d2 ? t : null, null);
        }
        return d2;
    }

    private final int y(InterfaceC1609l5<?> interfaceC1609l5) {
        return interfaceC1609l5 == null ? C1582i5.a().c(this).b(this) : interfaceC1609l5.b(this);
    }

    public final BuilderType A() {
        return (BuilderType) ((b) t(e.e, null, null)).m(this);
    }

    final MessageType B() {
        return (MessageType) t(e.d, null, null);
    }

    protected final void F() {
        C1582i5.a().c(this).e(this);
        G();
    }

    final void G() {
        this.zzd &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    final boolean H() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // ax.b6.W4
    public final boolean c() {
        return x(this, true);
    }

    @Override // ax.b6.U4
    public final int d() {
        return e(null);
    }

    @Override // ax.b6.AbstractC1647q3
    final int e(InterfaceC1609l5 interfaceC1609l5) {
        if (!H()) {
            if (k() != Integer.MAX_VALUE) {
                return k();
            }
            int y = y(interfaceC1609l5);
            m(y);
            return y;
        }
        int y2 = y(interfaceC1609l5);
        if (y2 >= 0) {
            return y2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + y2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1582i5.a().c(this).i(this, (AbstractC1599k4) obj);
        }
        return false;
    }

    @Override // ax.b6.U4
    public final /* synthetic */ T4 f() {
        return ((b) t(e.e, null, null)).m(this);
    }

    @Override // ax.b6.W4
    public final /* synthetic */ U4 h() {
        return (AbstractC1599k4) t(e.f, null, null);
    }

    public int hashCode() {
        if (H()) {
            return n();
        }
        if (this.zza == 0) {
            this.zza = n();
        }
        return this.zza;
    }

    @Override // ax.b6.U4
    public final void i(S3 s3) throws IOException {
        C1582i5.a().c(this).c(this, V3.P(s3));
    }

    @Override // ax.b6.U4
    public final /* synthetic */ T4 j() {
        return (b) t(e.e, null, null);
    }

    @Override // ax.b6.AbstractC1647q3
    final int k() {
        return this.zzd & SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    @Override // ax.b6.AbstractC1647q3
    final void m(int i) {
        if (i >= 0) {
            this.zzd = (i & SubsamplingScaleImageView.TILE_SIZE_AUTO) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    protected abstract Object t(int i, Object obj, Object obj2);

    public String toString() {
        return V4.a(this, super.toString());
    }

    protected final <MessageType extends AbstractC1599k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType z() {
        return (BuilderType) t(e.e, null, null);
    }
}
