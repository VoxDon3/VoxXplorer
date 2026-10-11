package ax.b6;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
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

    private static final class a extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ax.b6.H5.b
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // ax.b6.H5.b
        public final void b(Object obj, long j, byte b) {
            if (H5.i) {
                H5.u(obj, j, b);
            } else {
                H5.y(obj, j, b);
            }
        }

        @Override // ax.b6.H5.b
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // ax.b6.H5.b
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // ax.b6.H5.b
        public final void g(Object obj, long j, boolean z) {
            if (H5.i) {
                H5.k(obj, j, z);
            } else {
                H5.r(obj, j, z);
            }
        }

        @Override // ax.b6.H5.b
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // ax.b6.H5.b
        public final boolean k(Object obj, long j) {
            return H5.i ? H5.D(obj, j) : H5.E(obj, j);
        }
    }

    private static abstract class b {
        Unsafe a;

        b(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract double a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b);

        public abstract void c(Object obj, long j, double d);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public final boolean h() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                H5.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j);

        public final boolean j() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return H5.C() != null;
            } catch (Throwable th) {
                H5.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j);

        public final int l(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long m(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    private static final class c extends b {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ax.b6.H5.b
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // ax.b6.H5.b
        public final void b(Object obj, long j, byte b) {
            if (H5.i) {
                H5.u(obj, j, b);
            } else {
                H5.y(obj, j, b);
            }
        }

        @Override // ax.b6.H5.b
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // ax.b6.H5.b
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // ax.b6.H5.b
        public final void g(Object obj, long j, boolean z) {
            if (H5.i) {
                H5.k(obj, j, z);
            } else {
                H5.r(obj, j, z);
            }
        }

        @Override // ax.b6.H5.b
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // ax.b6.H5.b
        public final boolean k(Object obj, long j) {
            return H5.i ? H5.D(obj, j) : H5.E(obj, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            ax.b6.H5.a = r0
            java.lang.Class r1 = ax.b6.C1670t3.a()
            ax.b6.H5.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            ax.b6.H5.c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            ax.b6.H5.d = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            ax.b6.H5$c r1 = new ax.b6.H5$c
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            ax.b6.H5$a r1 = new ax.b6.H5$a
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            ax.b6.H5.e = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = 0
            goto L3a
        L36:
            boolean r2 = r1.j()
        L3a:
            ax.b6.H5.f = r2
            if (r1 != 0) goto L40
            r2 = 0
            goto L44
        L40:
            boolean r2 = r1.h()
        L44:
            ax.b6.H5.g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            ax.b6.H5.h = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            o(r2)
            s(r2)
            java.lang.Class<int[]> r2 = int[].class
            o(r2)
            s(r2)
            java.lang.Class<long[]> r2 = long[].class
            o(r2)
            s(r2)
            java.lang.Class<float[]> r2 = float[].class
            o(r2)
            s(r2)
            java.lang.Class<double[]> r2 = double[].class
            o(r2)
            s(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            o(r2)
            s(r2)
            java.lang.reflect.Field r2 = C()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.a
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            ax.b6.H5.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.H5.<clinit>():void");
    }

    private H5() {
    }

    private static boolean A(Class<?> cls) {
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Object B(Object obj, long j) {
        return e.a.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field C() {
        Field d2 = d(Buffer.class, "effectiveDirectAddress");
        if (d2 != null) {
            return d2;
        }
        Field d3 = d(Buffer.class, "address");
        if (d3 == null || d3.getType() != Long.TYPE) {
            return null;
        }
        return d3;
    }

    static /* synthetic */ boolean D(Object obj, long j) {
        return ((byte) (t(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j) {
        return ((byte) (t(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j) {
        return e.k(obj, j);
    }

    static double a(Object obj, long j) {
        return e.a(obj, j);
    }

    static <T> T b(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j, double d2) {
        e.c(obj, j, d2);
    }

    static void g(Object obj, long j, float f2) {
        e.d(obj, j, f2);
    }

    static void h(Object obj, long j, int i2) {
        e.e(obj, j, i2);
    }

    static void i(Object obj, long j, long j2) {
        e.f(obj, j, j2);
    }

    static void j(Object obj, long j, Object obj2) {
        e.a.putObject(obj, j, obj2);
    }

    static /* synthetic */ void k(Object obj, long j, boolean z) {
        u(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(H5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static void m(byte[] bArr, long j, byte b2) {
        e.b(bArr, h + j, b2);
    }

    static float n(Object obj, long j) {
        return e.i(obj, j);
    }

    private static int o(Class<?> cls) {
        if (g) {
            return e.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new J5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j, boolean z) {
        y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    private static int s(Class<?> cls) {
        if (g) {
            return e.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j) {
        return e.l(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int t = t(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        h(obj, j2, ((255 & b2) << i2) | (t & (~(255 << i2))));
    }

    static void v(Object obj, long j, boolean z) {
        e.g(obj, j, z);
    }

    static boolean w() {
        return g;
    }

    static long x(Object obj, long j) {
        return e.m(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        h(obj, j2, ((255 & b2) << i2) | (t(obj, j2) & (~(255 << i2))));
    }

    static boolean z() {
        return f;
    }
}
