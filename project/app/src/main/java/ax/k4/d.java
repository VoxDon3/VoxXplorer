/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import android.annotation.TargetApi;
import android.os.SystemClock;

public final class d {
    private static final double a = 1.0 / Math.pow(10.0, 6.0);

    public static double a(long l8) {
        return (double)(d.b() - l8) * a;
    }

    @TargetApi(value=17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

