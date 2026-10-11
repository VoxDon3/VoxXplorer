/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.T1;
import ax.W5.U1;
import ax.W5.V1;
import ax.W5.W1;
import ax.W5.f0;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class X1 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final W1 d;
    private static final boolean e;
    private static final boolean f;
    static final boolean g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        boolean bl;
        boolean bl2;
        block14: {
            Class<Integer> clazz;
            Class<Long> clazz2;
            block13: {
                block12: {
                    Unsafe unsafe;
                    bl2 = false;
                    a = unsafe = X1.g();
                    int n8 = f0.a;
                    b = Memory.class;
                    clazz2 = Long.TYPE;
                    c = bl = X1.s(clazz2);
                    clazz = Integer.TYPE;
                    boolean bl3 = X1.s(clazz);
                    object = null;
                    if (unsafe != null) {
                        if (bl) {
                            object = new V1(unsafe);
                        } else if (bl3) {
                            object = new U1(unsafe);
                        }
                    }
                    d = object;
                    if (object != null) {
                        object = ((W1)object).a;
                        try {
                            object = object.getClass();
                            ((Class)object).getMethod("objectFieldOffset", Field.class);
                            ((Class)object).getMethod("getLong", Object.class, clazz2);
                            object = X1.y();
                            if (object == null) break block12;
                            bl = true;
                            break block13;
                        }
                        catch (Throwable throwable) {
                            X1.h(throwable);
                        }
                    }
                }
                bl = false;
            }
            e = bl;
            object = d;
            if (object != null) {
                object = ((W1)object).a;
                try {
                    object = object.getClass();
                    ((Class)object).getMethod("objectFieldOffset", Field.class);
                    ((Class)object).getMethod("arrayBaseOffset", Class.class);
                    ((Class)object).getMethod("arrayIndexScale", Class.class);
                    ((Class)object).getMethod("getInt", Object.class, clazz2);
                    ((Class)object).getMethod("putInt", Object.class, clazz2, clazz);
                    ((Class)object).getMethod("getLong", Object.class, clazz2);
                    ((Class)object).getMethod("putLong", Object.class, clazz2, clazz2);
                    ((Class)object).getMethod("getObject", Object.class, clazz2);
                    ((Class)object).getMethod("putObject", Object.class, clazz2, Object.class);
                    bl = true;
                    break block14;
                }
                catch (Throwable throwable) {
                    X1.h(throwable);
                }
            }
            bl = false;
        }
        f = bl;
        X1.w(byte[].class);
        X1.w(boolean[].class);
        X1.x(boolean[].class);
        X1.w(int[].class);
        X1.x(int[].class);
        X1.w(long[].class);
        X1.x(long[].class);
        X1.w(float[].class);
        X1.x(float[].class);
        X1.w(double[].class);
        X1.x(double[].class);
        X1.w(Object[].class);
        X1.x(Object[].class);
        Field field = X1.y();
        if (field != null && (object = d) != null) {
            ((W1)object).a.objectFieldOffset(field);
        }
        bl = bl2;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            bl = true;
        }
        g = bl;
    }

    private X1() {
    }

    static double a(Object object, long l8) {
        return d.a(object, l8);
    }

    static float b(Object object, long l8) {
        return d.b(object, l8);
    }

    static int c(Object object, long l8) {
        return X1.d.a.getInt(object, l8);
    }

    static long d(Object object, long l8) {
        return X1.d.a.getLong(object, l8);
    }

    static Object e(Class object) {
        try {
            object = a.allocateInstance((Class<?>)object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
    }

    static Object f(Object object, long l8) {
        return X1.d.a.getObject(object, l8);
    }

    static Unsafe g() {
        try {
            Object object = new T1();
            object = (Unsafe)AccessController.doPrivileged(object);
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable throwable) {
        Logger.getLogger(X1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(((Object)throwable).toString()));
    }

    static /* synthetic */ void i(Object object, long l8, boolean bl) {
        W1 w12 = d;
        Unsafe unsafe = w12.a;
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = unsafe.getInt(object, l9);
        int n9 = (~((int)l8) & 3) << 3;
        w12.a.putInt(object, l9, bl << n9 | ~(255 << n9) & n8);
    }

    static /* synthetic */ void j(Object object, long l8, boolean bl) {
        W1 w12 = d;
        Unsafe unsafe = w12.a;
        long l9 = 0xFFFFFFFFFFFFFFFCL & l8;
        int n8 = unsafe.getInt(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        w12.a.putInt(object, l9, bl << n9 | ~(255 << n9) & n8);
    }

    static void k(Object object, long l8, boolean bl) {
        d.c(object, l8, bl);
    }

    static void l(Object object, long l8, double d8) {
        d.d(object, l8, d8);
    }

    static void m(Object object, long l8, float f8) {
        d.e(object, l8, f8);
    }

    static void n(Object object, long l8, int n8) {
        X1.d.a.putInt(object, l8, n8);
    }

    static void o(Object object, long l8, long l9) {
        X1.d.a.putLong(object, l8, l9);
    }

    static void p(Object object, long l8, Object object2) {
        X1.d.a.putObject(object, l8, object2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object object, long l8) {
        return (byte)(X1.d.a.getInt(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)(((l8 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object object, long l8) {
        return (byte)(X1.d.a.getInt(object, 0xFFFFFFFFFFFFFFFCL & l8) >>> (int)((l8 & 3L) << 3) & 0xFF) != 0;
    }

    static boolean s(Class clazz) {
        int n8 = f0.a;
        try {
            Class clazz2 = b;
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

    static boolean t(Object object, long l8) {
        return d.f(object, l8);
    }

    static boolean u() {
        return f;
    }

    static boolean v() {
        return e;
    }

    private static int w(Class clazz) {
        if (f) {
            return X1.d.a.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int x(Class clazz) {
        if (f) {
            return X1.d.a.arrayIndexScale(clazz);
        }
        return -1;
    }

    private static Field y() {
        Field field;
        int n8 = f0.a;
        Field field2 = field = X1.z(Buffer.class, "effectiveDirectAddress");
        if (field == null) {
            field2 = X1.z(Buffer.class, "address");
            if (field2 != null && field2.getType() == Long.TYPE) {
                return field2;
            }
            field2 = null;
        }
        return field2;
    }

    private static Field z(Class annotatedElement, String string) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string);
            return annotatedElement;
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

