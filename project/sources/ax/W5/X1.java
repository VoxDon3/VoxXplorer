package ax.W5;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class X1 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final W1 d;
    private static final boolean e;
    private static final boolean f;
    static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W5.X1.<clinit>():void");
    }

    private X1() {
    }

    static double a(Object obj, long j) {
        return d.a(obj, j);
    }

    static float b(Object obj, long j) {
        return d.b(obj, j);
    }

    static int c(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    static long d(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    static Object e(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object f(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new T1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th) {
        Logger.getLogger(X1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void i(Object obj, long j, boolean z) {
        W1 w1 = d;
        long j2 = (-4) & j;
        int i = w1.a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        w1.a.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    static /* synthetic */ void j(Object obj, long j, boolean z) {
        W1 w1 = d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        w1.a.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & w1.a.getInt(obj, j2)));
    }

    static void k(Object obj, long j, boolean z) {
        d.c(obj, j, z);
    }

    static void l(Object obj, long j, double d2) {
        d.d(obj, j, d2);
    }

    static void m(Object obj, long j, float f2) {
        d.e(obj, j, f2);
    }

    static void n(Object obj, long j, int i) {
        d.a.putInt(obj, j, i);
    }

    static void o(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    static void p(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean s(Class cls) {
        int i = C1028f0.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    static boolean t(Object obj, long j) {
        return d.f(obj, j);
    }

    static boolean u() {
        return f;
    }

    static boolean v() {
        return e;
    }

    private static int w(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f) {
            return d.a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i = C1028f0.a;
        Field z = z(Buffer.class, "effectiveDirectAddress");
        if (z != null) {
            return z;
        }
        Field z2 = z(Buffer.class, "address");
        if (z2 == null || z2.getType() != Long.TYPE) {
            return null;
        }
        return z2;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
