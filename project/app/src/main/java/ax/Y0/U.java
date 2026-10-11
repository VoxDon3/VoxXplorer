/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.s;

public final class U {
    public static void a(M0 m02) {
    }

    public static long b(M0 m02, long l8, long l9) {
        if (m02.getState() == 1 && (m02.isReady() || m02.c())) {
            return 1000000L;
        }
        return 10000L;
    }

    public static void c(M0 m02, float f8, float f9) throws s {
    }
}

