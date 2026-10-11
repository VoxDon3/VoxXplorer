/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import android.util.Log;

public final class d {
    private static volatile boolean a = false;
    private static volatile boolean b = true;

    public static void a(String string, Object ... objectArray) {
        if (a) {
            d.e(3, null, string, objectArray);
        }
    }

    public static void b(String string, Object ... objectArray) {
        d.e(6, null, string, objectArray);
    }

    public static void c(Throwable throwable) {
        d.e(6, throwable, null, new Object[0]);
    }

    public static void d(String string, Object ... objectArray) {
        d.e(4, null, string, objectArray);
    }

    private static void e(int n8, Throwable throwable, String string, Object ... objectArray) {
        if (!b) {
            return;
        }
        String string2 = string;
        if (objectArray.length > 0) {
            string2 = String.format(string, objectArray);
        }
        if (throwable != null) {
            string = string2;
            if (string2 == null) {
                string = throwable.getMessage();
            }
            string2 = String.format("%1$s\n%2$s", string, Log.getStackTraceString((Throwable)throwable));
        }
        Log.println((int)n8, (String)ax.ba.d.d, (String)string2);
    }

    public static void f(String string, Object ... objectArray) {
        d.e(5, null, string, objectArray);
    }

    public static void g(boolean bl) {
        a = bl;
    }
}

