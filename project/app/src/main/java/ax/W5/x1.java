/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.J0;
import ax.W5.M1;
import ax.W5.P1;

final class x1 {
    private static final Class a;
    private static final M1 b;
    private static final M1 c;
    public static final int d = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object var1 = null;
        try {
            object = Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch (Throwable throwable) {
            object = null;
        }
        a = object;
        try {
            object = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch (Throwable throwable) {
            object = null;
        }
        if (object == null) {
            object = var1;
        } else {
            try {
                object = (M1)((Class)object).getConstructor(null).newInstance(null);
            }
            catch (Throwable throwable) {
                object = var1;
            }
        }
        b = object;
        c = new P1();
    }

    public static M1 a() {
        return b;
    }

    public static M1 b() {
        return c;
    }

    static Object c(Object object, int n8, int n9, Object object2, M1 m12) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = m12.a(object);
        }
        m12.d(object3, n8, n9);
        return object3;
    }

    static void d(M1 m12, Object object, Object object2) {
        m12.f(object, m12.c(m12.b(object), m12.b(object2)));
    }

    public static void e(Class clazz) {
        Class clazz2;
        if (!J0.class.isAssignableFrom(clazz) && (clazz2 = a) != null && !clazz2.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean f(Object object, Object object2) {
        if (object != object2) {
            return object != null && object.equals(object2);
        }
        return true;
    }
}

