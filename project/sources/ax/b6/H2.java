package ax.b6;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes3.dex */
public class H2 {
    private static UserManager a;
    private static volatile boolean b = !a();

    private H2() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (H2.class) {
            try {
                if (b) {
                    return true;
                }
                boolean e = e(context);
                if (e) {
                    b = e;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z;
        boolean isUserUnlocked;
        Object systemService;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                systemService = context.getSystemService((Class<Object>) UserManager.class);
                a = (UserManager) systemService;
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }
}
