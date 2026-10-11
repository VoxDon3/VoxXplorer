package ax.L2;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    private static final String a;

    static {
        String i = ax.B2.i.i("ProcessUtils");
        ax.Gb.l.e(i, "tagWithPrefix(\"ProcessUtils\")");
        a = i;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C0784a.a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, ax.B2.s.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            ax.Gb.l.c(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            ax.B2.i.e().b(a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a aVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(aVar, "configuration");
        String a2 = a(context);
        String c = aVar.c();
        return (c == null || c.length() == 0) ? ax.Gb.l.a(a2, context.getApplicationInfo().processName) : ax.Gb.l.a(a2, aVar.c());
    }
}
