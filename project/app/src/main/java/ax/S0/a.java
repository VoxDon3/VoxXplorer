/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.text.TextUtils;

public final class a {
    public static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }

    public static int c(int n8, int n9, int n10) {
        if (n8 >= n9 && n8 < n10) {
            return n8;
        }
        throw new IndexOutOfBoundsException();
    }

    public static String d(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T e(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T f(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static void g(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void h(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }

    public static <T> T i(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException();
    }

    public static <T> T j(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException(String.valueOf(object));
    }
}

