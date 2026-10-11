/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import android.text.TextUtils;
import java.util.Collection;

public final class h {
    public static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static String b(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> T c(T t8) {
        if (!t8.isEmpty()) {
            return t8;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static <T> T d(T t8) {
        return h.e(t8, "Argument must not be null");
    }

    public static <T> T e(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }
}

