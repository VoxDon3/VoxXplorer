/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

public final class A0 {
    public static Object a(Object object) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void b(Object object, Class clazz) {
        if (object != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(clazz.getCanonicalName()).concat(" must be set"));
    }
}

