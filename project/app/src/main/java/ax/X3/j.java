/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ax.M3.b;
import java.io.File;

final class j {
    private static final File c = new File("/proc/self/fd");
    private static volatile j d;
    private volatile int a;
    private volatile boolean b = true;

    private j() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static j a() {
        if (d != null) return d;
        synchronized (j.class) {
            try {
                j j8;
                if (d != null) return d;
                d = j8 = new j();
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl;
                int n8;
                try {
                    n8 = this.a;
                    bl = true;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.a = ++n8;
                if (n8 < 50) return this.b;
                this.a = 0;
                n8 = c.list().length;
                if (n8 >= 700) {
                    bl = false;
                }
                this.b = bl;
                if (this.b) return this.b;
                if (!Log.isLoggable((String)"Downsampler", (int)5)) return this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                stringBuilder.append(n8);
                stringBuilder.append(", limit ");
                stringBuilder.append(700);
                Log.w((String)"Downsampler", (String)stringBuilder.toString());
                return this.b;
            }
            throw throwable2;
        }
    }

    @TargetApi(value=26)
    boolean c(int n8, int n9, BitmapFactory.Options options, b b8, boolean bl, boolean bl2) {
        if (bl && Build.VERSION.SDK_INT >= 26 && b8 != ax.M3.b.c0 && !bl2) {
            bl = n8 >= 128 && n9 >= 128 && this.b();
            if (bl) {
                options.inPreferredConfig = ax.Q3.j.a();
                options.inMutable = false;
            }
            return bl;
        }
        return false;
    }
}

