package ax.W5;

/* renamed from: ax.W5.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1082x1 {
    private static final Class a;
    private static final M1 b;
    private static final M1 c;
    public static final /* synthetic */ int d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        M1 m1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                m1 = (M1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = m1;
        c = new P1();
    }

    public static M1 a() {
        return b;
    }

    public static M1 b() {
        return c;
    }

    static Object c(Object obj, int i, int i2, Object obj2, M1 m1) {
        if (obj2 == null) {
            obj2 = m1.a(obj);
        }
        m1.d(obj2, i, i2);
        return obj2;
    }

    static void d(M1 m1, Object obj, Object obj2) {
        m1.f(obj, m1.c(m1.b(obj), m1.b(obj2)));
    }

    public static void e(Class cls) {
        Class cls2;
        if (!J0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
