package ax.U9;

import android.text.TextUtils;

/* loaded from: classes3.dex */
final class i {
    public static void a(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new AssertionError();
        }
        if (obj == null) {
            throw new NullPointerException(String.format("Input parameter '%1$s' is invalid. '%1$s' cannot be null.", str));
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new AssertionError();
        }
        a(str, str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.format("Input parameter '%1$s' is invalid. '%1$s' cannot be empty.", str2));
        }
    }
}
