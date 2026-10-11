package ax.u3;

import android.content.Context;
import android.os.PowerManager;
import android.util.SparseArray;
import java.util.logging.Logger;

/* renamed from: ax.u3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3181C {
    private static final Logger a = ax.Q2.g.b("filemanager.wakelockmanager");
    private static int b = 1;
    private static final SparseArray<PowerManager.WakeLock> c = new SparseArray<>();

    public static int a(Context context, long j, String str) {
        int c2;
        synchronized (c) {
            c2 = c();
            b(context, c2, j, str);
        }
        return c2;
    }

    private static void b(Context context, int i, long j, String str) {
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + str);
            newWakeLock.setReferenceCounted(false);
            if (j >= 0) {
                newWakeLock.acquire(j);
            } else {
                newWakeLock.acquire();
            }
            c.put(i, newWakeLock);
        } catch (NullPointerException e) {
            ax.Ha.c.h().f().b("WAKE LOCK NULL POINTER").l(e).h();
        } catch (SecurityException unused) {
        }
    }

    private static int c() {
        int i = b;
        int i2 = i + 1;
        b = i2;
        if (i2 <= 0) {
            b = 1;
        }
        return i;
    }

    public static boolean d(int i) {
        if (i == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = c;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(i);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(i);
                    return true;
                }
                a.severe("No active wake lock id #" + i);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
