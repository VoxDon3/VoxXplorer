/*
 * Decompiled with CFR 0.152.
 */
package ax.E0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class a
extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
    private static int b = 1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Intent sparseArray) {
        int n8 = sparseArray.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (n8 == 0) {
            return false;
        }
        sparseArray = a;
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
                object = new StringBuilder();
                ((StringBuilder)object).append("No active wake lock id #");
                ((StringBuilder)object).append(n8);
                Log.w((String)"WakefulBroadcastReceiv.", (String)((StringBuilder)object).toString());
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName c(Context object, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a;
        synchronized (sparseArray) {
            Throwable throwable2;
            block5: {
                int n8;
                block4: {
                    try {
                        int n9;
                        n8 = b;
                        b = n9 = n8 + 1;
                        if (n9 > 0) break block4;
                        b = 1;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", n8);
                intent = object.startService(intent);
                if (intent == null) {
                    return null;
                }
                PowerManager powerManager = (PowerManager)object.getSystemService("power");
                object = new StringBuilder();
                ((StringBuilder)object).append("androidx.core:wake:");
                ((StringBuilder)object).append(intent.flattenToShortString());
                object = powerManager.newWakeLock(1, ((StringBuilder)object).toString());
                object.setReferenceCounted(false);
                object.acquire(60000L);
                sparseArray.put(n8, object);
                return intent;
            }
            throw throwable2;
        }
    }
}

