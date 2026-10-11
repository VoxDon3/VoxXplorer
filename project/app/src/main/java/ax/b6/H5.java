/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.J5;
import ax.b6.t3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class H5 {
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final b e;
    private static final boolean f;
    private static final boolean g;
    private static final long h;
    static final boolean i;

    /*
     * Unable to fully structure code
     */
    static {
        var2 = H5.p();
        H5.a = var2;
        H5.b = t3.a();
        H5.c = var1_1 = H5.A(Long.TYPE);
        H5.d = var0_2 = H5.A(Integer.TYPE);
        if (var2 == null) ** GOTO lbl-1000
        if (var1_1) {
            var2 = new c((Unsafe)var2);
        } else if (var0_2) {
            var2 = new a((Unsafe)var2);
        } else lbl-1000:
        // 2 sources

        {
            var2 = null;
        }
        H5.e = var2;
        var1_1 = false;
        var0_2 = var2 == null ? false : var2.j();
        H5.f = var0_2;
        var0_2 = var2 == null ? false : var2.h();
        H5.g = var0_2;
        H5.h = H5.o(byte[].class);
        H5.o(boolean[].class);
        H5.s(boolean[].class);
        H5.o(int[].class);
        H5.s(int[].class);
        H5.o(long[].class);
        H5.s(long[].class);
        H5.o(float[].class);
        H5.s(float[].class);
        H5.o(double[].class);
        H5.s(double[].class);
        H5.o(Object[].class);
        H5.s(Object[].class);
        var3_3 = H5.C();
        if (var3_3 != null && var2 != null) {
            var2.a.objectFieldOffset(var3_3);
        }
        var0_2 = var1_1;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            var0_2 = true;
        }
        H5.i = var0_2;
    }

    private H5() {
    }

    private static boolean A(Class<?> clazz) {
        try {
            Class<?> clazz2 = b;
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

    static Object B(Object object, long l8) {
        return H5.e.a.getObject(object, l8);
    }

    private static Field C() {
        Field field = H5.d(Buffer.class, "effectiveDirectAddress");
        if (field != null) {
            return field;
        }
        field = H5.d(Buffer.class, "address");
        if (field != null && field.getType() == Long.TYPE) {
            return field;
        }
        return null;
    }

    static /* synthetic */ boolean D(Object object, long l8) {
        return (byte)(H5.t(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)(((l8 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3)) != 0;
    }

    static /* synthetic */ boolean E(Object object, long l8) {
        return (byte)(H5.t(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)((l8 & 3L) << 3)) != 0;
    }

    static boolean F(Object object, long l8) {
        return e.k(object, l8);
    }

    static double a(Object object, long l8) {
        return e.a(object, l8);
    }

    static <T> T b(Class<T> object) {
        try {
            object = a.allocateInstance((Class<?>)object);
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        return (T)object;
    }

    private static Field d(Class<?> annotatedElement, String string) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string);
            return annotatedElement;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static void f(Object object, long l8, double d8) {
        e.c(object, l8, d8);
    }

    static void g(Object object, long l8, float f8) {
        e.d(object, l8, f8);
    }

    static void h(Object object, long l8, int n8) {
        e.e(object, l8, n8);
    }

    static void i(Object object, long l8, long l9) {
        e.f(object, l8, l9);
    }

    static void j(Object object, long l8, Object object2) {
        H5.e.a.putObject(object, l8, object2);
    }

    static /* synthetic */ void l(Throwable object) {
        Logger logger = Logger.getLogger(H5.class.getName());
        Level level = Level.WARNING;
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", stringBuilder.toString());
    }

    static void m(byte[] byArray, long l8, byte by) {
        e.b(byArray, h + l8, by);
    }

    static float n(Object object, long l8) {
        return e.i(object, l8);
    }

    private static int o(Class<?> clazz) {
        if (g) {
            return H5.e.a.arrayBaseOffset(clazz);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            Object object = new J5();
            object = AccessController.doPrivileged(object);
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static int s(Class<?> clazz) {
        if (g) {
            return H5.e.a.arrayIndexScale(clazz);
        }
        return -1;
    }

    static int t(Object object, long l8) {
        return e.l(object, l8);
    }

    private static void u(Object object, long l8, byte by) {
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = H5.t(object, l9);
        int n9 = (~((int)l8) & 3) << 3;
        H5.h(object, l9, (0xFF & by) << n9 | n8 & ~(255 << n9));
    }

    static void v(Object object, long l8, boolean bl) {
        e.g(object, l8, bl);
    }

    static boolean w() {
        return g;
    }

    static long x(Object object, long l8) {
        return e.m(object, l8);
    }

    private static void y(Object object, long l8, byte by) {
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = H5.t(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        H5.h(object, l9, (0xFF & by) << n9 | n8 & ~(255 << n9));
    }

    static boolean z() {
        return f;
    }

    private static final class a
    extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public final double a(Object object, long l8) {
            return Double.longBitsToDouble(this.m(object, l8));
        }

        @Override
        public final void b(Object object, long l8, byte by) {
            if (i) {
                H5.u(object, l8, by);
                return;
            }
            H5.y(object, l8, by);
        }

        @Override
        public final void c(Object object, long l8, double d8) {
            this.f(object, l8, Double.doubleToLongBits(d8));
        }

        @Override
        public final void d(Object object, long l8, float f8) {
            this.e(object, l8, Float.floatToIntBits(f8));
        }

        @Override
        public final void g(Object object, long l8, boolean bl) {
            if (i) {
                H5.u(object, l8, (byte)(bl ? 1 : 0));
                return;
            }
            H5.y(object, l8, (byte)(bl ? 1 : 0));
        }

        @Override
        public final float i(Object object, long l8) {
            return Float.intBitsToFloat(this.l(object, l8));
        }

        @Override
        public final boolean k(Object object, long l8) {
            if (i) {
                return H5.D(object, l8);
            }
            return H5.E(object, l8);
        }
    }

    private static abstract class b {
        Unsafe a;

        b(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract double a(Object var1, long var2);

        public abstract void b(Object var1, long var2, byte var4);

        public abstract void c(Object var1, long var2, double var4);

        public abstract void d(Object var1, long var2, float var4);

        public final void e(Object object, long l8, int n8) {
            this.a.putInt(object, l8, n8);
        }

        public final void f(Object object, long l8, long l9) {
            this.a.putLong(object, l8, l9);
        }

        public abstract void g(Object var1, long var2, boolean var4);

        public final boolean h() {
            Object object = this.a;
            if (object == null) {
                return false;
            }
            try {
                Class<?> clazz = object.getClass();
                clazz.getMethod("objectFieldOffset", Field.class);
                clazz.getMethod("arrayBaseOffset", Class.class);
                clazz.getMethod("arrayIndexScale", Class.class);
                object = Long.TYPE;
                clazz.getMethod("getInt", new Class[]{Object.class, object});
                clazz.getMethod("putInt", new Class[]{Object.class, object, Integer.TYPE});
                clazz.getMethod("getLong", new Class[]{Object.class, object});
                clazz.getMethod("putLong", new Class[]{Object.class, object, object});
                clazz.getMethod("getObject", new Class[]{Object.class, object});
                clazz.getMethod("putObject", new Class[]{Object.class, object, Object.class});
                return true;
            }
            catch (Throwable throwable) {
                H5.l(throwable);
                return false;
            }
        }

        public abstract float i(Object var1, long var2);

        public final boolean j() {
            Object object = this.a;
            if (object == null) {
                return false;
            }
            try {
                object = object.getClass();
                ((Class)object).getMethod("objectFieldOffset", Field.class);
                ((Class)object).getMethod("getLong", Object.class, Long.TYPE);
                object = H5.C();
                return object != null;
            }
            catch (Throwable throwable) {
                H5.l(throwable);
                return false;
            }
        }

        public abstract boolean k(Object var1, long var2);

        public final int l(Object object, long l8) {
            return this.a.getInt(object, l8);
        }

        public final long m(Object object, long l8) {
            return this.a.getLong(object, l8);
        }
    }

    private static final class c
    extends b {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public final double a(Object object, long l8) {
            return Double.longBitsToDouble(this.m(object, l8));
        }

        @Override
        public final void b(Object object, long l8, byte by) {
            if (i) {
                H5.u(object, l8, by);
                return;
            }
            H5.y(object, l8, by);
        }

        @Override
        public final void c(Object object, long l8, double d8) {
            this.f(object, l8, Double.doubleToLongBits(d8));
        }

        @Override
        public final void d(Object object, long l8, float f8) {
            this.e(object, l8, Float.floatToIntBits(f8));
        }

        @Override
        public final void g(Object object, long l8, boolean bl) {
            if (i) {
                H5.u(object, l8, (byte)(bl ? 1 : 0));
                return;
            }
            H5.y(object, l8, (byte)(bl ? 1 : 0));
        }

        @Override
        public final float i(Object object, long l8) {
            return Float.intBitsToFloat(this.l(object, l8));
        }

        @Override
        public final boolean k(Object object, long l8) {
            if (i) {
                return H5.D(object, l8);
            }
            return H5.E(object, l8);
        }
    }
}

