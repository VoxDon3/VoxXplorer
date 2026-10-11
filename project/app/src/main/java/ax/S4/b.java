/*
 * Decompiled with CFR 0.152.
 */
package ax.S4;

import android.util.Log;

public class b {
    private static final int a = 5;

    public static void a(String string, Object ... objectArray) {
    }

    public static void b(String string, Throwable throwable, Object ... objectArray) {
        b.e(string, 6, throwable, objectArray);
    }

    public static void c(String string, Object ... objectArray) {
        b.e(string, 6, null, objectArray);
    }

    public static void d(String string, Object ... objectArray) {
        b.e(string, 4, null, objectArray);
    }

    public static void e(String string, int n8, Throwable object, Object ... objectArray) {
        if (Log.isLoggable((String)string, (int)n8)) {
            if (object == null && objectArray != null && objectArray.length == 1) {
                object = objectArray[0].toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                if (objectArray != null) {
                    int n9 = objectArray.length;
                    for (int i8 = 0; i8 < n9; ++i8) {
                        stringBuilder.append(objectArray[i8]);
                    }
                }
                if (object != null) {
                    stringBuilder.append("\n");
                    stringBuilder.append(Log.getStackTraceString((Throwable)object));
                }
                object = stringBuilder.toString();
            }
            Log.println((int)n8, (String)string, (String)object);
        }
    }

    public static String f(Class clazz) {
        return b.g(clazz.getSimpleName());
    }

    public static String g(String string) {
        int n8;
        int n9 = string.length();
        if (n9 > 23 - (n8 = a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("uamp_");
            stringBuilder.append(string.substring(0, 22 - n8));
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("uamp_");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static void h(String string, Object ... objectArray) {
    }

    public static void i(String string, Throwable throwable, Object ... objectArray) {
        b.e(string, 5, throwable, objectArray);
    }

    public static void j(String string, Object ... objectArray) {
        b.e(string, 5, null, objectArray);
    }
}

