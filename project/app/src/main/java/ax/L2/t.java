/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ax.B2.i;
import ax.B2.s;
import ax.Gb.l;
import ax.L2.a;

public final class t {
    private static final String a;

    static {
        String string = i.i("ProcessUtils");
        l.e(string, "tagWithPrefix(\"ProcessUtils\")");
        a = string;
    }

    @SuppressLint(value={"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context object2) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            return ax.L2.a.a.a();
        }
        Object var2_1 = null;
        try {
            runningAppProcessInfo = Class.forName("android.app.ActivityThread", false, s.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            runningAppProcessInfo.setAccessible(true);
            runningAppProcessInfo = runningAppProcessInfo.invoke(null, null);
            l.c(runningAppProcessInfo);
            if (runningAppProcessInfo instanceof String) {
                runningAppProcessInfo = (String)runningAppProcessInfo;
                return runningAppProcessInfo;
            }
        }
        catch (Throwable throwable) {
            i.e().b(a, "Unable to check ActivityThread for processName", throwable);
        }
        int n8 = Process.myPid();
        object2 = object2.getSystemService("activity");
        l.d(object2, "null cannot be cast to non-null type android.app.ActivityManager");
        runningAppProcessInfo = ((ActivityManager)object2).getRunningAppProcesses();
        object2 = var2_1;
        if (runningAppProcessInfo != null) {
            block7: {
                for (Object object2 : (Iterable)runningAppProcessInfo) {
                    if (((ActivityManager.RunningAppProcessInfo)object2).pid != n8) continue;
                    break block7;
                }
                object2 = null;
            }
            runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)object2;
            object2 = var2_1;
            if (runningAppProcessInfo != null) {
                object2 = runningAppProcessInfo.processName;
            }
        }
        return object2;
    }

    public static final boolean b(Context context, androidx.work.a a8) {
        l.f(context, "context");
        l.f(a8, "configuration");
        String string = t.a(context);
        String string2 = a8.c();
        if (string2 != null && string2.length() != 0) {
            return l.a(string, a8.c());
        }
        return l.a(string, context.getApplicationInfo().processName);
    }
}

