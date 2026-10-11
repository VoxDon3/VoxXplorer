/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.text.TextUtils;

final class i {
    public static void a(Object object, String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            if (object != null) {
                return;
            }
            throw new NullPointerException(String.format("Input parameter '%1$s' is invalid. '%1$s' cannot be null.", string));
        }
        throw new AssertionError();
    }

    public static void b(String string, String string2) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            i.a(string, string2);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                return;
            }
            throw new IllegalArgumentException(String.format("Input parameter '%1$s' is invalid. '%1$s' cannot be empty.", string2));
        }
        throw new AssertionError();
    }
}

