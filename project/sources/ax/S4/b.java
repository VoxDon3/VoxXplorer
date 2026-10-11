package ax.S4;

import android.util.Log;

/* loaded from: classes.dex */
public class b {
    private static final int a = 5;

    public static void b(String str, Throwable th, Object... objArr) {
        e(str, 6, th, objArr);
    }

    public static void c(String str, Object... objArr) {
        e(str, 6, null, objArr);
    }

    public static void d(String str, Object... objArr) {
        e(str, 4, null, objArr);
    }

    public static void e(String str, int i, Throwable th, Object... objArr) {
        String sb;
        if (Log.isLoggable(str, i)) {
            if (th == null && objArr != null && objArr.length == 1) {
                sb = objArr[0].toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (objArr != null) {
                    for (Object obj : objArr) {
                        sb2.append(obj);
                    }
                }
                if (th != null) {
                    sb2.append("\n");
                    sb2.append(Log.getStackTraceString(th));
                }
                sb = sb2.toString();
            }
            Log.println(i, str, sb);
        }
    }

    public static String f(Class cls) {
        return g(cls.getSimpleName());
    }

    public static String g(String str) {
        int length = str.length();
        int i = a;
        if (length > 23 - i) {
            return "uamp_" + str.substring(0, 22 - i);
        }
        return "uamp_" + str;
    }

    public static void i(String str, Throwable th, Object... objArr) {
        e(str, 5, th, objArr);
    }

    public static void j(String str, Object... objArr) {
        e(str, 5, null, objArr);
    }

    public static void a(String str, Object... objArr) {
    }

    public static void h(String str, Object... objArr) {
    }
}
