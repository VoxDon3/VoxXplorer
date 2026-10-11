/*
 * Decompiled with CFR 0.152.
 */
package ax.r5;

public final class d {
    public static <T> void a(T object, Class<T> clazz) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(clazz.getCanonicalName());
        ((StringBuilder)object).append(" must be set");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public static <T> T b(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T c(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }

    public static <T> T d(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

