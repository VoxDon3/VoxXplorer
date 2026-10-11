/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.Context;
import android.os.PowerManager;
import android.util.SparseArray;
import ax.Ha.c;
import ax.Q2.g;
import java.util.logging.Logger;

public class C {
    private static final Logger a = g.b("filemanager.wakelockmanager");
    private static int b = 1;
    private static final SparseArray<PowerManager.WakeLock> c = new SparseArray();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(Context context, long l8, String string) {
        SparseArray<PowerManager.WakeLock> sparseArray = c;
        synchronized (sparseArray) {
            int n8 = C.c();
            C.b(context, n8, l8, string);
            return n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(Context context, int n8, long l8, String string) {
        try {
            context = (PowerManager)context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("wake:");
            stringBuilder.append(string);
            context = context.newWakeLock(1, stringBuilder.toString());
            context.setReferenceCounted(false);
            if (l8 >= 0L) {
                context.acquire(l8);
            } else {
                context.acquire();
            }
            c.put(n8, (Object)context);
            return;
        }
        catch (NullPointerException nullPointerException) {
            ax.Ha.c.h().f().b("WAKE LOCK NULL POINTER").l(nullPointerException).h();
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    private static int c() {
        int n8;
        int n9 = b;
        b = n8 = n9 + 1;
        if (n8 <= 0) {
            b = 1;
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(int n8) {
        if (n8 == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = c;
        synchronized (sparseArray) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    object = (PowerManager.WakeLock)sparseArray.get(n8);
                    if (object != null) {
                        object.release();
                        sparseArray.remove(n8);
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Logger logger = a;
                object = new StringBuilder();
                ((StringBuilder)object).append("No active wake lock id #");
                ((StringBuilder)object).append(n8);
                logger.severe(((StringBuilder)object).toString());
                return true;
            }
            throw throwable2;
        }
    }
}

