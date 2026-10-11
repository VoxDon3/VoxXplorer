/*
 * Decompiled with CFR 0.152.
 */
package ax.cb;

public final class b {
    public static void a(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }

    public static <T> T b(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static void c(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }

    public static boolean d(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }
}

