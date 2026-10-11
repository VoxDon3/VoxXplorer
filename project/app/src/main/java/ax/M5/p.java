/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ax.R5.r;

public final class p {
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

    public static void c(boolean bl, String string, Object ... objectArray) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.format(string, objectArray));
    }

    public static void d(Handler object) {
        Object object2 = Looper.myLooper();
        if (object2 != object.getLooper()) {
            object2 = object2 != null ? object2.getThread().getName() : "null current looper";
            object = object.getLooper().getThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Must be called on ");
            stringBuilder.append((String)object);
            stringBuilder.append(" thread, but got ");
            stringBuilder.append((String)object2);
            stringBuilder.append(".");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static void e(String string) {
        if (r.a()) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static String f(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String g(String string, Object object) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }

    public static void h() {
        p.i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(String string) {
        Object object = Looper.myLooper();
        if (object != null && ((object = object.getThread().getName()) == "GoogleApiHandler" || object != null && object.equals("GoogleApiHandler"))) {
            throw new IllegalStateException(string);
        }
    }

    public static void j() {
        p.k("Must not be called on the main application thread");
    }

    public static void k(String string) {
        if (!r.a()) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static <T> T l(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T m(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static int n(int n8) {
        if (n8 != 0) {
            return n8;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void o(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void p(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }
}

