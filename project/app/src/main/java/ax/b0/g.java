/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

import android.text.TextUtils;
import java.util.Locale;

public final class g {
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

    public static int c(int n8, int n9, int n10, String string) {
        if (n8 >= n9) {
            if (n8 <= n10) {
                return n8;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", string, n9, n10));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", string, n9, n10));
    }

    public static int d(int n8) {
        if (n8 >= 0) {
            return n8;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int n8, String string) {
        if (n8 >= 0) {
            return n8;
        }
        throw new IllegalArgumentException(string);
    }

    public static int f(int n8, int n9) {
        if ((n8 & n9) == n8) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Requested flags 0x");
        stringBuilder.append(Integer.toHexString(n8));
        stringBuilder.append(", but only 0x");
        stringBuilder.append(Integer.toHexString(n9));
        stringBuilder.append(" are allowed");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static <T> T g(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T h(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static void i(boolean bl) {
        g.j(bl, null);
    }

    public static void j(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static <T extends CharSequence> T k(T t8, Object object) {
        if (!TextUtils.isEmpty(t8)) {
            return t8;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }
}

