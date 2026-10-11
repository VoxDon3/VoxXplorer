/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.D5;
import ax.b6.F4;
import ax.b6.F5;
import ax.b6.H5;
import ax.b6.O5;
import ax.b6.S3;
import ax.b6.T4;
import ax.b6.U4;
import ax.b6.V3;
import ax.b6.V4;
import ax.b6.W3;
import ax.b6.W4;
import ax.b6.X3;
import ax.b6.Y4;
import ax.b6.Y5;
import ax.b6.d4;
import ax.b6.f4;
import ax.b6.h5;
import ax.b6.i5;
import ax.b6.j5;
import ax.b6.l5;
import ax.b6.n4;
import ax.b6.p3;
import ax.b6.q3;
import ax.b6.q4;
import ax.b6.r3;
import ax.b6.r4;
import ax.b6.s4;
import ax.b6.t4;
import ax.b6.v3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class k4<MessageType extends k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>>
extends q3<MessageType, BuilderType> {
    private static Map<Object, k4<?, ?>> zzc = new j.ConcurrentHashMap();
    protected F5 zzb = F5.k();
    private int zzd = -1;

    protected static r4 C() {
        return n4.h();
    }

    protected static q4 D() {
        return F4.h();
    }

    protected static <E> t4<E> E() {
        return h5.i();
    }

    private final int n() {
        return i5.a().c(this).f(this);
    }

    static <T extends k4<?, ?>> T o(Class<T> clazz) {
        k4<?, ?> k42;
        k4<?, ?> k43 = k42 = zzc.get(clazz);
        if (k42 == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                k43 = zzc.get(clazz);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
            }
        }
        if (k43 == null) {
            k43 = (k4<?, ?>)((k4)H5.b(clazz)).t(e.f, null, null);
            if (k43 != null) {
                zzc.put(clazz, k43);
                return (T)k43;
            }
            throw new IllegalStateException();
        }
        return (T)k43;
    }

    protected static q4 r(q4 q42) {
        int n8 = q42.size();
        n8 = n8 == 0 ? 10 : (n8 <<= 1);
        return q42.o(n8);
    }

    protected static <E> t4<E> s(t4<E> t42) {
        int n8 = t42.size();
        n8 = n8 == 0 ? 10 : (n8 <<= 1);
        return t42.d(n8);
    }

    protected static Object u(U4 u42, String string, Object[] objectArray) {
        return new j5(u42, string, objectArray);
    }

    static Object v(Method object, Object object2, Object ... objectArray) {
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

    protected static <T extends k4<?, ?>> void w(Class<T> clazz, T t8) {
        t8.G();
        zzc.put(clazz, t8);
    }

    protected static final <T extends k4<T, ?>> boolean x(T t8, boolean bl) {
        int n8 = ((Byte)t8.t(e.a, null, null)).byteValue();
        if (n8 == 1) {
            return true;
        }
        if (n8 == 0) {
            return false;
        }
        boolean bl2 = i5.a().c(t8).d(t8);
        if (bl) {
            n8 = e.b;
            Object object = bl2 ? t8 : null;
            t8.t(n8, object, null);
        }
        return bl2;
    }

    private final int y(l5<?> l52) {
        if (l52 == null) {
            return i5.a().c(this).b(this);
        }
        return l52.b(this);
    }

    public final BuilderType A() {
        return ((b)this.t(e.e, null, null)).m(this);
    }

    final MessageType B() {
        return (MessageType)((k4)this.t(e.d, null, null));
    }

    protected final void F() {
        i5.a().c(this).e(this);
        this.G();
    }

    final void G() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean H() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override
    public final boolean c() {
        return k4.x(this, true);
    }

    @Override
    public final int d() {
        return ((q3)this).e(null);
    }

    @Override
    final int e(l5 object) {
        if (this.H()) {
            int n8 = this.y((l5<?>)object);
            if (n8 >= 0) {
                return n8;
            }
            object = new StringBuilder("serialized size must be non-negative, was ");
            ((StringBuilder)object).append(n8);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        if (((q3)this).k() != Integer.MAX_VALUE) {
            return ((q3)this).k();
        }
        int n9 = this.y((l5<?>)object);
        ((q3)this).m(n9);
        return n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return i5.a().c(this).i(this, (k4)object);
    }

    @Override
    public final /* synthetic */ T4 f() {
        return ((b)this.t(e.e, null, null)).m(this);
    }

    @Override
    public final /* synthetic */ U4 h() {
        return (k4)this.t(e.f, null, null);
    }

    public int hashCode() {
        if (this.H()) {
            return this.n();
        }
        if (this.zza == 0) {
            this.zza = this.n();
        }
        return this.zza;
    }

    @Override
    public final void i(S3 s32) throws IOException {
        i5.a().c(this).c(this, V3.P(s32));
    }

    @Override
    public final /* synthetic */ T4 j() {
        return (b)this.t(e.e, null, null);
    }

    @Override
    final int k() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override
    final void m(int n8) {
        if (n8 >= 0) {
            this.zzd = n8 & Integer.MAX_VALUE | this.zzd & Integer.MIN_VALUE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("serialized size must be non-negative, was ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    protected abstract Object t(int var1, Object var2, Object var3);

    public String toString() {
        return V4.a(this, super.toString());
    }

    protected final <MessageType extends k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType z() {
        return (BuilderType)((b)this.t(e.e, null, null));
    }

    protected static final class a<T extends k4<T, ?>>
    extends r3<T> {
        public a(T t8) {
        }
    }

    public static class b<MessageType extends k4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>>
    extends p3<MessageType, BuilderType> {
        protected MessageType c0;
        private final MessageType q;

        protected b(MessageType MessageType) {
            this.q = MessageType;
            if (!((k4)MessageType).H()) {
                this.c0 = ((k4)MessageType).B();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void n(MessageType MessageType, MessageType MessageType2) {
            i5.a().c(MessageType).g(MessageType, MessageType2);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private final BuilderType v(byte[] byArray, int n8, int n9, W3 w32) throws s4 {
            if (!((k4)this.c0).H()) {
                this.t();
            }
            try {
                l5<MessageType> l52 = i5.a().c(this.c0);
                MessageType MessageType = this.c0;
                v3 v32 = new v3(w32);
                l52.h(MessageType, byArray, 0, n9, v32);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException);
            }
            catch (s4 s42) {
                throw s42;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw s4.f();
            }
            return (BuilderType)this;
        }

        @Override
        public final boolean c() {
            return k4.x(this.c0, false);
        }

        @Override
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b b8 = (b)((k4)this.q).t(e.e, null, null);
            b8.c0 = (k4)this.p();
            return b8;
        }

        @Override
        public final /* synthetic */ p3 k(byte[] byArray, int n8, int n9) throws s4 {
            return this.v(byArray, 0, n9, W3.c);
        }

        @Override
        public final /* synthetic */ p3 l(byte[] byArray, int n8, int n9, W3 w32) throws s4 {
            return this.v(byArray, 0, n9, w32);
        }

        public final BuilderType m(MessageType MessageType) {
            if (((k4)this.q).equals(MessageType)) {
                return (BuilderType)this;
            }
            if (!((k4)this.c0).H()) {
                this.t();
            }
            b.n(this.c0, MessageType);
            return (BuilderType)this;
        }

        public final MessageType o() {
            k4 k42 = (k4)this.p();
            if (k4.x(k42, true)) {
                return (MessageType)k42;
            }
            throw new D5(k42);
        }

        @Override
        public /* synthetic */ U4 p() {
            return this.r();
        }

        @Override
        public /* synthetic */ U4 q() {
            return this.o();
        }

        public MessageType r() {
            if (!((k4)this.c0).H()) {
                return this.c0;
            }
            ((k4)this.c0).F();
            return this.c0;
        }

        protected final void s() {
            if (!((k4)this.c0).H()) {
                this.t();
            }
        }

        protected void t() {
            Object MessageType = ((k4)this.q).B();
            b.n(MessageType, this.c0);
            this.c0 = MessageType;
        }
    }

    static final class c
    implements f4<c> {
        @Override
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override
        public final O5 b() {
            throw new NoSuchMethodError();
        }

        @Override
        public final Y5 c() {
            throw new NoSuchMethodError();
        }

        @Override
        public final /* synthetic */ int compareTo(Object object) {
            throw new NoSuchMethodError();
        }

        @Override
        public final boolean e() {
            throw new NoSuchMethodError();
        }

        @Override
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override
        public final T4 o(T4 t42, U4 u42) {
            throw new NoSuchMethodError();
        }

        @Override
        public final Y4 v(Y4 y42, Y4 y43) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType>
    extends k4<MessageType, BuilderType>
    implements W4 {
        protected d4<c> zzc = d4.i();

        final d4<c> I() {
            if (this.zzc.r()) {
                this.zzc = (d4)this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final class e {
        public static final /* enum */ int a = 1;
        public static final /* enum */ int b = 2;
        public static final /* enum */ int c = 3;
        public static final /* enum */ int d = 4;
        public static final /* enum */ int e = 5;
        public static final /* enum */ int f = 6;
        public static final /* enum */ int g = 7;
        private static final int[] h = new int[]{1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[])h.clone();
        }
    }

    public static final class f<ContainingType extends U4, Type>
    extends X3<ContainingType, Type> {
    }
}

