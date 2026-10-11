package ax.Y0;

import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;

/* loaded from: classes.dex */
public final /* synthetic */ class U {
    public static long b(M0 m0, long j, long j2) {
        if (m0.getState() == 1) {
            return (m0.isReady() || m0.c()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public static void a(M0 m0) {
    }

    public static void c(M0 m0, float f, float f2) throws C0622s {
    }
}
