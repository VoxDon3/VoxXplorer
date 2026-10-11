/*
 * Decompiled with CFR 0.152.
 */
package ax.S5;

import android.content.Context;
import ax.R5.l;
import ax.S5.a;

public class b {
    private static Context a;
    private static Boolean b;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context) {
        synchronized (b.class) {
            Throwable throwable2;
            block11: {
                Context context2;
                try {
                    Boolean bl;
                    context2 = context.getApplicationContext();
                    Context context3 = a;
                    if (context3 != null && (bl = b) != null) {
                        if (context3 == context2) return bl;
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                {
                    b = null;
                    if (l.h()) {
                        b = ax.S5.a.a(context2.getPackageManager());
                    } else {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            b = Boolean.TRUE;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            b = Boolean.FALSE;
                        }
                    }
                    a = context2;
                    return b;
                }
            }
            throw throwable2;
        }
    }
}

