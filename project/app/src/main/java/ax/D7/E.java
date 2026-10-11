/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

public final class E {
    public static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
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

    public static void d(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }
}

