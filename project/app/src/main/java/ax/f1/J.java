/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodecInfo;
import android.os.Build;
import ax.P0.v;
import ax.f1.D;
import ax.f1.E;
import ax.f1.F;
import ax.f1.G;
import ax.f1.H;
import ax.f1.I;
import ax.f1.Q;
import ax.f1.a0;
import java.util.List;

final class J {
    private static Boolean a;

    static /* synthetic */ Boolean b(Boolean bl) {
        a = bl;
        return bl;
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9, double d8) {
        Boolean bl;
        if (!(Build.VERSION.SDK_INT < 29 || (bl = a) != null && bl.booleanValue())) {
            return ax.f1.J$a.a(videoCapabilities, n8, n9, d8);
        }
        return 0;
    }

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities object, int n8, int n9, double d8) {
            if ((object = G.a((MediaCodecInfo.VideoCapabilities)object)) != null && !object.isEmpty()) {
                F.a();
                n8 = ax.f1.J$a.c((List<MediaCodecInfo.VideoCapabilities.PerformancePoint>)object, E.a(n8, n9, (int)d8));
                if (n8 == 1 && a == null) {
                    J.b(ax.f1.J$a.d());
                    if (a.booleanValue()) {
                        return 0;
                    }
                }
                return n8;
            }
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static int b(boolean bl) {
            try {
                List<D> list = new List<D>();
                list = ((v.b)((Object)list)).y0("video/avc").P();
                if (((v)((Object)list)).o == null) return 0;
                list = a0.n(Q.a, (v)((Object)list), bl, false);
                int n8 = 0;
                while (n8 < list.size()) {
                    Object object;
                    if (list.get((int)n8).d != null && (object = list.get((int)n8).d.getVideoCapabilities()) != null && (object = G.a((MediaCodecInfo.VideoCapabilities)object)) != null && !object.isEmpty()) {
                        F.a();
                        return ax.f1.J$a.c((List<MediaCodecInfo.VideoCapabilities.PerformancePoint>)object, E.a(1280, 720, 60));
                    }
                    ++n8;
                }
                return 0;
            }
            catch (a0.c c8) {
                return 0;
            }
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                if (!I.a(H.a(list.get(i8)), performancePoint)) continue;
                return 2;
            }
            return 1;
        }

        private static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int n8 = ax.f1.J$a.b(false);
            int n9 = ax.f1.J$a.b(true);
            if (n8 == 0) {
                return true;
            }
            if (n9 == 0) {
                return n8 != 2;
            }
            return n8 != 2 || n9 != 2;
            {
            }
        }
    }
}

