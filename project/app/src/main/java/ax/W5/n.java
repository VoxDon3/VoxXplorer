/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import ax.R.t;
import ax.W5.m;

public final class n {
    private static UserManager a;
    private static volatile boolean b;

    static {
        b = n.b() ^ true;
    }

    private n() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context) {
        int n8;
        if (!n.b()) return false;
        if (b) {
            return false;
        }
        synchronized (n.class) {
            block13: {
                int n9;
                block14: {
                    try {
                        if (b) {
                            return false;
                        }
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                    for (n9 = 1; n9 <= 2; ++n9) {
                        UserManager userManager;
                        if (a == null) {
                            a = (UserManager)t.a(context, UserManager.class);
                        }
                        if ((userManager = a) == null) {
                            n8 = 1;
                            break block13;
                        }
                        try {
                            boolean bl;
                            if (!m.a(userManager) && (bl = userManager.isUserRunning(Process.myUserHandle()))) break;
                            n9 = 1;
                            break block14;
                        }
                        catch (NullPointerException nullPointerException) {
                            Log.w((String)"DirectBootUtils", (String)"Failed to check if user is unlocked.", (Throwable)nullPointerException);
                            a = null;
                            continue;
                        }
                    }
                    n9 = 0;
                }
                n8 = n9;
                if (n9 != 0) {
                    a = null;
                    n8 = n9;
                }
            }
            if (n8 != 0) {
                b = true;
            }
        }
        if (n8 != 0) return false;
        return true;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}

