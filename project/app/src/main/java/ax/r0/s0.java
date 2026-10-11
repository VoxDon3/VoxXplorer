/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class s0 {
    private static final Logger a;
    private static final Unsafe b;
    private static final Class<?> c;
    private static final boolean d;
    private static final boolean e;
    private static final e f;
    private static final boolean g;
    private static final boolean h;
    static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final int w;
    static final boolean x;

    static {
        long l8;
        a = Logger.getLogger(s0.class.getName());
        b = s0.B();
        c = ax.r0.d.b();
        d = s0.m(Long.TYPE);
        e = s0.m(Integer.TYPE);
        f = s0.z();
        g = s0.Q();
        h = s0.P();
        i = l8 = (long)s0.j(byte[].class);
        j = s0.j(boolean[].class);
        k = s0.k(boolean[].class);
        l = s0.j(int[].class);
        m = s0.k(int[].class);
        n = s0.j(long[].class);
        o = s0.k(long[].class);
        p = s0.j(float[].class);
        q = s0.k(float[].class);
        r = s0.j(double[].class);
        s = s0.k(double[].class);
        t = s0.j(Object[].class);
        u = s0.k(Object[].class);
        v = s0.o(s0.l());
        w = (int)(l8 & 7L);
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        x = bl;
    }

    private s0() {
    }

    static Object A(Object object, long l8) {
        return f.i(object, l8);
    }

    static Unsafe B() {
        try {
            PrivilegedExceptionAction<Unsafe> privilegedExceptionAction = new PrivilegedExceptionAction<Unsafe>(){

                public Unsafe a() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        ((AccessibleObject)field).setAccessible(true);
                        Object object = field.get(null);
                        if (!Unsafe.class.isInstance(object)) continue;
                        return (Unsafe)Unsafe.class.cast(object);
                    }
                    return null;
                }
            };
            privilegedExceptionAction = AccessController.doPrivileged(privilegedExceptionAction);
            return privilegedExceptionAction;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static boolean C() {
        return h;
    }

    static boolean D() {
        return g;
    }

    static void E(Object object, long l8, boolean bl) {
        f.k(object, l8, bl);
    }

    private static void F(Object object, long l8, boolean bl) {
        s0.I(object, l8, (byte)(bl ? 1 : 0));
    }

    private static void G(Object object, long l8, boolean bl) {
        s0.J(object, l8, (byte)(bl ? 1 : 0));
    }

    static void H(byte[] byArray, long l8, byte by) {
        f.l(byArray, i + l8, by);
    }

    private static void I(Object object, long l8, byte by) {
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = s0.x(object, l9);
        int n9 = (~((int)l8) & 3) << 3;
        s0.M(object, l9, (0xFF & by) << n9 | n8 & ~(255 << n9));
    }

    private static void J(Object object, long l8, byte by) {
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = s0.x(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        s0.M(object, l9, (0xFF & by) << n9 | n8 & ~(255 << n9));
    }

    static void K(Object object, long l8, double d8) {
        f.m(object, l8, d8);
    }

    static void L(Object object, long l8, float f8) {
        f.n(object, l8, f8);
    }

    static void M(Object object, long l8, int n8) {
        f.o(object, l8, n8);
    }

    static void N(Object object, long l8, long l9) {
        f.p(object, l8, l9);
    }

    static void O(Object object, long l8, Object object2) {
        f.q(object, l8, object2);
    }

    private static boolean P() {
        Serializable serializable;
        Object object;
        block4: {
            object = b;
            if (object == null) {
                return false;
            }
            try {
                object = object.getClass();
                ((Class)object).getMethod("objectFieldOffset", Field.class);
                ((Class)object).getMethod("arrayBaseOffset", Class.class);
                ((Class)object).getMethod("arrayIndexScale", Class.class);
                serializable = Long.TYPE;
                ((Class)object).getMethod("getInt", new Class[]{Object.class, serializable});
                ((Class)object).getMethod("putInt", new Class[]{Object.class, serializable, Integer.TYPE});
                ((Class)object).getMethod("getLong", new Class[]{Object.class, serializable});
                ((Class)object).getMethod("putLong", new Class[]{Object.class, serializable, serializable});
                ((Class)object).getMethod("getObject", new Class[]{Object.class, serializable});
                ((Class)object).getMethod("putObject", new Class[]{Object.class, serializable, Object.class});
                if (!ax.r0.d.c()) break block4;
                return true;
            }
            catch (Throwable throwable) {
                Logger logger = a;
                serializable = Level.WARNING;
                object = new StringBuilder();
                ((StringBuilder)object).append("platform method missing - proto runtime falling back to safer methods: ");
                ((StringBuilder)object).append(throwable);
                logger.log((Level)serializable, ((StringBuilder)object).toString());
                return false;
            }
        }
        ((Class)object).getMethod("getByte", new Class[]{Object.class, serializable});
        ((Class)object).getMethod("putByte", new Class[]{Object.class, serializable, Byte.TYPE});
        ((Class)object).getMethod("getBoolean", new Class[]{Object.class, serializable});
        ((Class)object).getMethod("putBoolean", new Class[]{Object.class, serializable, Boolean.TYPE});
        ((Class)object).getMethod("getFloat", new Class[]{Object.class, serializable});
        ((Class)object).getMethod("putFloat", new Class[]{Object.class, serializable, Float.TYPE});
        ((Class)object).getMethod("getDouble", new Class[]{Object.class, serializable});
        ((Class)object).getMethod("putDouble", new Class[]{Object.class, serializable, Double.TYPE});
        return true;
    }

    private static boolean Q() {
        Serializable serializable;
        Object object;
        block6: {
            block5: {
                object = b;
                if (object == null) {
                    return false;
                }
                try {
                    serializable = object.getClass();
                    ((Class)serializable).getMethod("objectFieldOffset", Field.class);
                    object = Long.TYPE;
                    ((Class)serializable).getMethod("getLong", new Class[]{Object.class, object});
                    if (s0.l() != null) break block5;
                    return false;
                }
                catch (Throwable throwable) {
                    Logger logger = a;
                    serializable = Level.WARNING;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("platform method missing - proto runtime falling back to safer methods: ");
                    ((StringBuilder)object).append(throwable);
                    logger.log((Level)serializable, ((StringBuilder)object).toString());
                    return false;
                }
            }
            if (!ax.r0.d.c()) break block6;
            return true;
        }
        ((Class)serializable).getMethod("getByte", new Class[]{object});
        ((Class)serializable).getMethod("putByte", new Class[]{object, Byte.TYPE});
        ((Class)serializable).getMethod("getInt", new Class[]{object});
        ((Class)serializable).getMethod("putInt", new Class[]{object, Integer.TYPE});
        ((Class)serializable).getMethod("getLong", new Class[]{object});
        ((Class)serializable).getMethod("putLong", new Class[]{object, object});
        ((Class)serializable).getMethod("copyMemory", new Class[]{object, object, object});
        ((Class)serializable).getMethod("copyMemory", new Class[]{Object.class, object, Object.class, object, object});
        return true;
    }

    static <T> T i(Class<T> object) {
        try {
            object = b.allocateInstance((Class<?>)object);
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        return (T)object;
    }

    private static int j(Class<?> clazz) {
        if (h) {
            return f.a(clazz);
        }
        return -1;
    }

    private static int k(Class<?> clazz) {
        if (h) {
            return f.b(clazz);
        }
        return -1;
    }

    private static Field l() {
        Field field;
        if (ax.r0.d.c() && (field = s0.n(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = s0.n(Buffer.class, "address");
        if (field != null && field.getType() == Long.TYPE) {
            return field;
        }
        return null;
    }

    private static boolean m(Class<?> clazz) {
        if (!ax.r0.d.c()) {
            return false;
        }
        try {
            Class<?> clazz2 = c;
            Class<Boolean> clazz3 = Boolean.TYPE;
            clazz2.getMethod("peekLong", clazz, clazz3);
            clazz2.getMethod("pokeLong", clazz, Long.TYPE, clazz3);
            Class<Integer> clazz4 = Integer.TYPE;
            clazz2.getMethod("pokeInt", clazz, clazz4, clazz3);
            clazz2.getMethod("peekInt", clazz, clazz3);
            clazz2.getMethod("pokeByte", clazz, Byte.TYPE);
            clazz2.getMethod("peekByte", clazz);
            clazz2.getMethod("pokeByteArray", clazz, byte[].class, clazz4, clazz4);
            clazz2.getMethod("peekByteArray", clazz, byte[].class, clazz4, clazz4);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private static Field n(Class<?> annotatedElement, String string) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string);
            return annotatedElement;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static long o(Field field) {
        e e8;
        if (field != null && (e8 = f) != null) {
            return e8.j(field);
        }
        return -1L;
    }

    static boolean p(Object object, long l8) {
        return f.c(object, l8);
    }

    private static boolean q(Object object, long l8) {
        return s0.t(object, l8) != 0;
    }

    private static boolean r(Object object, long l8) {
        return s0.u(object, l8) != 0;
    }

    static byte s(byte[] byArray, long l8) {
        return f.d(byArray, i + l8);
    }

    private static byte t(Object object, long l8) {
        return (byte)(s0.x(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)(((l8 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF);
    }

    private static byte u(Object object, long l8) {
        return (byte)(s0.x(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)((l8 & 3L) << 3) & 0xFF);
    }

    static double v(Object object, long l8) {
        return f.e(object, l8);
    }

    static float w(Object object, long l8) {
        return f.f(object, l8);
    }

    static int x(Object object, long l8) {
        return f.g(object, l8);
    }

    static long y(Object object, long l8) {
        return f.h(object, l8);
    }

    private static e z() {
        Unsafe unsafe = b;
        b b8 = null;
        if (unsafe == null) {
            return null;
        }
        if (ax.r0.d.c()) {
            if (d) {
                return new c(unsafe);
            }
            if (e) {
                b8 = new b(unsafe);
            }
            return b8;
        }
        return new d(unsafe);
    }

    private static final class b
    extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (x) {
                return s0.q(object, l8);
            }
            return s0.r(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (x) {
                return s0.t(object, l8);
            }
            return s0.u(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return Double.longBitsToDouble(this.h(object, l8));
        }

        @Override
        public float f(Object object, long l8) {
            return Float.intBitsToFloat(this.g(object, l8));
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            if (x) {
                s0.F(object, l8, bl);
                return;
            }
            s0.G(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (x) {
                s0.I(object, l8, by);
                return;
            }
            s0.J(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits(d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits(f8));
        }
    }

    private static final class c
    extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (x) {
                return s0.q(object, l8);
            }
            return s0.r(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (x) {
                return s0.t(object, l8);
            }
            return s0.u(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return Double.longBitsToDouble(this.h(object, l8));
        }

        @Override
        public float f(Object object, long l8) {
            return Float.intBitsToFloat(this.g(object, l8));
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            if (x) {
                s0.F(object, l8, bl);
                return;
            }
            s0.G(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (x) {
                s0.I(object, l8, by);
                return;
            }
            s0.J(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits(d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits(f8));
        }
    }

    private static final class d
    extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            return this.a.getBoolean(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            return this.a.getByte(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return this.a.getDouble(object, l8);
        }

        @Override
        public float f(Object object, long l8) {
            return this.a.getFloat(object, l8);
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            this.a.putBoolean(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            this.a.putByte(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.a.putDouble(object, l8, d8);
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.a.putFloat(object, l8, f8);
        }
    }

    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> clazz) {
            return this.a.arrayBaseOffset(clazz);
        }

        public final int b(Class<?> clazz) {
            return this.a.arrayIndexScale(clazz);
        }

        public abstract boolean c(Object var1, long var2);

        public abstract byte d(Object var1, long var2);

        public abstract double e(Object var1, long var2);

        public abstract float f(Object var1, long var2);

        public final int g(Object object, long l8) {
            return this.a.getInt(object, l8);
        }

        public final long h(Object object, long l8) {
            return this.a.getLong(object, l8);
        }

        public final Object i(Object object, long l8) {
            return this.a.getObject(object, l8);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object var1, long var2, boolean var4);

        public abstract void l(Object var1, long var2, byte var4);

        public abstract void m(Object var1, long var2, double var4);

        public abstract void n(Object var1, long var2, float var4);

        public final void o(Object object, long l8, int n8) {
            this.a.putInt(object, l8, n8);
        }

        public final void p(Object object, long l8, long l9) {
            this.a.putLong(object, l8, l9);
        }

        public final void q(Object object, long l8, Object object2) {
            this.a.putObject(object, l8, object2);
        }
    }
}

