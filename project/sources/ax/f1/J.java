package ax.f1;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
final class J {
    private static Boolean a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            F.a();
            int c = c(supportedPerformancePoints, E.a(i, i2, (int) d));
            if (c == 1 && J.a == null) {
                Boolean unused = J.a = Boolean.valueOf(d());
                if (J.a.booleanValue()) {
                    return 0;
                }
            }
            return c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            r2 = r2.getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int b(boolean r4) {
            /*
                r0 = 0
                ax.P0.v$b r1 = new ax.P0.v$b     // Catch: ax.f1.a0.c -> L5a
                r1.<init>()     // Catch: ax.f1.a0.c -> L5a
                java.lang.String r2 = "video/avc"
                ax.P0.v$b r1 = r1.y0(r2)     // Catch: ax.f1.a0.c -> L5a
                ax.P0.v r1 = r1.P()     // Catch: ax.f1.a0.c -> L5a
                java.lang.String r2 = r1.o     // Catch: ax.f1.a0.c -> L5a
                if (r2 == 0) goto L5a
                ax.f1.Q r2 = ax.f1.Q.a     // Catch: ax.f1.a0.c -> L5a
                java.util.List r4 = ax.f1.a0.n(r2, r1, r4, r0)     // Catch: ax.f1.a0.c -> L5a
                r1 = 0
            L1b:
                int r2 = r4.size()     // Catch: ax.f1.a0.c -> L5a
                if (r1 >= r2) goto L5a
                java.lang.Object r2 = r4.get(r1)     // Catch: ax.f1.a0.c -> L5a
                ax.f1.D r2 = (ax.f1.C2006D) r2     // Catch: ax.f1.a0.c -> L5a
                android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: ax.f1.a0.c -> L5a
                if (r2 == 0) goto L57
                java.lang.Object r2 = r4.get(r1)     // Catch: ax.f1.a0.c -> L5a
                ax.f1.D r2 = (ax.f1.C2006D) r2     // Catch: ax.f1.a0.c -> L5a
                android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: ax.f1.a0.c -> L5a
                android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: ax.f1.a0.c -> L5a
                if (r2 == 0) goto L57
                java.util.List r2 = ax.f1.G.a(r2)     // Catch: ax.f1.a0.c -> L5a
                if (r2 == 0) goto L57
                boolean r3 = r2.isEmpty()     // Catch: ax.f1.a0.c -> L5a
                if (r3 != 0) goto L57
                ax.f1.F.a()     // Catch: ax.f1.a0.c -> L5a
                r4 = 720(0x2d0, float:1.009E-42)
                r1 = 60
                r3 = 1280(0x500, float:1.794E-42)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = ax.f1.E.a(r3, r4, r1)     // Catch: ax.f1.a0.c -> L5a
                int r4 = c(r2, r4)     // Catch: ax.f1.a0.c -> L5a
                return r4
            L57:
                int r1 = r1 + 1
                goto L1b
            L5a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.f1.J.a.b(boolean):int");
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i = 0; i < list.size(); i++) {
                covers = H.a(list.get(i)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int b = b(false);
            int b2 = b(true);
            if (b == 0) {
                return true;
            }
            return b2 == 0 ? b != 2 : (b == 2 && b2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
