/*
 * Decompiled with CFR 0.152.
 */
package ax.t5;

import android.os.Build;
import android.util.Log;

public final class a {
    private static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        string = string2 = stringBuilder.toString();
        if (string2.length() > 23) {
            string = string2.substring(0, 23);
        }
        return string;
    }

    public static void b(String string, String string2, Object object) {
        if (Log.isLoggable((String)(string = a.e(string)), (int)3)) {
            Log.d((String)string, (String)String.format(string2, object));
        }
    }

    public static void c(String string, String string2, Object ... objectArray) {
        if (Log.isLoggable((String)(string = a.e(string)), (int)3)) {
            Log.d((String)string, (String)String.format(string2, objectArray));
        }
    }

    public static void d(String string, String string2, Throwable throwable) {
        if (Log.isLoggable((String)(string = a.e(string)), (int)6)) {
            Log.e((String)string, (String)string2, (Throwable)throwable);
        }
    }

    private static String e(String string) {
        if (Build.VERSION.SDK_INT < 26) {
            return a.a("TRuntime.", string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TRuntime.");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static void f(String string, String string2, Object object) {
        if (Log.isLoggable((String)(string = a.e(string)), (int)4)) {
            Log.i((String)string, (String)String.format(string2, object));
        }
    }

    public static void g(String string, String string2, Object object) {
        if (Log.isLoggable((String)(string = a.e(string)), (int)5)) {
            Log.w((String)string, (String)String.format(string2, object));
        }
    }
}

