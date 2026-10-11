/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import ax.R.t;
import ax.W5.m;

public class H2 {
    private static UserManager a;
    private static volatile boolean b;

    static {
        b = H2.a() ^ true;
    }

    private H2() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return H2.a() && !H2.d(context);
    }

    public static boolean c(Context context) {
        return !H2.a() || H2.d(context);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=24)
    private static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (H2.class) {
            Throwable throwable2;
            block6: {
                try {
                    if (b) {
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                boolean bl = H2.e(context);
                if (bl) {
                    b = bl;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    @TargetApi(value=24)
    private static boolean e(Context context) {
        boolean bl;
        boolean bl2 = true;
        int n8 = 1;
        while (true) {
            UserManager userManager;
            bl = false;
            if (n8 > 2) break;
            if (a == null) {
                a = (UserManager)t.a(context, UserManager.class);
            }
            if ((userManager = a) == null) {
                return true;
            }
            bl = bl2;
            try {
                if (m.a(userManager)) break;
                bl = userManager.isUserRunning(Process.myUserHandle());
                if (!bl) {
                    bl = bl2;
                    break;
                }
                bl = false;
            }
            catch (NullPointerException nullPointerException) {
                Log.w((String)"DirectBootUtils", (String)"Failed to check if user is unlocked.", (Throwable)nullPointerException);
                a = null;
                ++n8;
                continue;
            }
            break;
        }
        if (bl) {
            a = null;
        }
        return bl;
    }
}

