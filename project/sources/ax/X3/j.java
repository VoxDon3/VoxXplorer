package ax.X3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
final class j {
    private static final File c = new File("/proc/self/fd");
    private static volatile j d;
    private volatile int a;
    private volatile boolean b = true;

    private j() {
    }

    static j a() {
        if (d == null) {
            synchronized (j.class) {
                try {
                    if (d == null) {
                        d = new j();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    private synchronized boolean b() {
        try {
            boolean z = true;
            int i = this.a + 1;
            this.a = i;
            if (i >= 50) {
                this.a = 0;
                int length = c.list().length;
                if (length >= 700) {
                    z = false;
                }
                this.b = z;
                if (!this.b && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @TargetApi(26)
    boolean c(int i, int i2, BitmapFactory.Options options, ax.M3.b bVar, boolean z, boolean z2) {
        Bitmap.Config config;
        if (!z || Build.VERSION.SDK_INT < 26 || bVar == ax.M3.b.PREFER_ARGB_8888_DISALLOW_HARDWARE || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && b();
        if (z3) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return z3;
    }
}
