/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

public final class f {
    public static int a(Context context, int n8, String string, String string2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = b.c(context);
            int n9 = b.a(appOpsManager, string, Binder.getCallingUid(), string2);
            if (n9 != 0) {
                return n9;
            }
            return b.a(appOpsManager, string, n8, b.b(context));
        }
        return f.b(context, string, string2);
    }

    public static int b(Context context, String string, String string2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.c(a.a(context, AppOpsManager.class), string, string2);
        }
        return 1;
    }

    public static String c(String string) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.d(string);
        }
        return null;
    }

    static class a {
        static <T> T a(Context context, Class<T> clazz) {
            return (T)context.getSystemService(clazz);
        }

        static int b(AppOpsManager appOpsManager, String string, String string2) {
            return appOpsManager.noteProxyOp(string, string2);
        }

        static int c(AppOpsManager appOpsManager, String string, String string2) {
            return appOpsManager.noteProxyOpNoThrow(string, string2);
        }

        static String d(String string) {
            return AppOpsManager.permissionToOp((String)string);
        }
    }

    static class b {
        static int a(AppOpsManager appOpsManager, String string, int n8, String string2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(string, n8, string2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager)context.getSystemService(AppOpsManager.class);
        }
    }
}

