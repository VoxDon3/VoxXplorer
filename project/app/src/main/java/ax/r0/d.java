/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

final class d {
    private static final Class<?> a = d.a("libcore.io.Memory");
    private static final boolean b;

    static {
        boolean bl = d.a("org.robolectric.Robolectric") != null;
        b = bl;
    }

    private static <T> Class<T> a(String object) {
        try {
            object = Class.forName((String)object);
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static Class<?> b() {
        return a;
    }

    static boolean c() {
        return a != null && !b;
    }
}

