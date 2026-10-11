package ax.f1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import ax.P0.C0901j;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.Y0.C1177c;
import ax.f1.a0;
import j$.util.Objects;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.f1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006D {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    private final boolean l;
    private float o = -3.4028235E38f;
    private int m = -1;
    private int n = -1;

    C2006D(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = (String) C0968a.e(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = z7;
        this.l = ax.P0.D.s(str2);
    }

    private static boolean A(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean C(String str) {
        if (Build.VERSION.SDK_INT > 22) {
            return false;
        }
        String str2 = Build.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean D(String str, int i) {
        if (!"video/hevc".equals(str) || 2 != i) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static C2006D F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C2006D(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !j(codecCapabilities) || C(str)) ? false : true, codecCapabilities != null && v(codecCapabilities), z5 || (codecCapabilities != null && u(codecCapabilities)), o(codecCapabilities));
    }

    private static int a(String str, String str2, int i) {
        if (i > 1 || ((Build.VERSION.SDK_INT >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C0987u.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ax.S0.d0.k(i, widthAlignment) * widthAlignment, ax.S0.d0.k(i2, heightAlignment) * heightAlignment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r4 = r4.getAchievableFrameRatesFor(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(android.media.MediaCodecInfo.VideoCapabilities r4, int r5, int r6, double r7) {
        /*
            android.graphics.Point r5 = b(r4, r5, r6)
            int r6 = r5.x
            int r5 = r5.y
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L40
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L40
        L15:
            double r7 = java.lang.Math.floor(r7)
            boolean r0 = r4.areSizeAndRateSupported(r6, r5, r7)
            r1 = 0
            if (r0 != 0) goto L21
            return r1
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r3 = 1
            if (r0 >= r2) goto L29
            return r3
        L29:
            android.util.Range r4 = ax.f1.C2005C.a(r4, r6, r5)
            if (r4 != 0) goto L30
            return r3
        L30:
            java.lang.Comparable r4 = r4.getUpper()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 > 0) goto L3f
            return r3
        L3f:
            return r1
        L40:
            boolean r4 = r4.isSizeSupported(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.C2006D.d(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):boolean");
    }

    private float f(int i, int i2) {
        float f = 1024.0f;
        if (w(i, i2, 1024.0f)) {
            return 1024.0f;
        }
        float f2 = 0.0f;
        while (true) {
            float f3 = f - f2;
            if (Math.abs(f3) <= 5.0f) {
                return f2;
            }
            float f4 = (f3 / 2.0f) + f2;
            if (w(i, i2, f4)) {
                f2 = f4;
            } else {
                f = f4;
            }
        }
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        return new MediaCodecInfo.CodecProfileLevel[]{a0.f(1, intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1)};
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m(ax.P0.C0912v r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.C2006D.m(ax.P0.v, boolean):boolean");
    }

    private boolean n(C0912v c0912v) {
        return (Objects.equals(c0912v.o, "audio/flac") && c0912v.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean o(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !B();
    }

    private boolean s(C0912v c0912v) {
        return this.b.equals(c0912v.o) || this.b.equals(a0.g(c0912v));
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        C0987u.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + ax.S0.d0.e + "]");
    }

    private void y(String str) {
        C0987u.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + ax.S0.d0.e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i, i2);
    }

    public C1177c e(C0912v c0912v, C0912v c0912v2) {
        C0912v c0912v3;
        C0912v c0912v4;
        int i;
        int i2 = !Objects.equals(c0912v.o, c0912v2.o) ? 8 : 0;
        if (this.l) {
            if (c0912v.A != c0912v2.A) {
                i2 |= 1024;
            }
            boolean z = (c0912v.v == c0912v2.v && c0912v.w == c0912v2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!C0901j.i(c0912v.E) || !C0901j.i(c0912v2.E)) && !Objects.equals(c0912v.E, c0912v2.E)) {
                i2 |= 2048;
            }
            if (A(this.a) && !c0912v.h(c0912v2)) {
                i2 |= 2;
            }
            int i3 = c0912v.x;
            if (i3 != -1 && (i = c0912v.y) != -1 && i3 == c0912v2.x && i == c0912v2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C1177c(this.a, c0912v, c0912v2, c0912v.h(c0912v2) ? 3 : 2, 0);
            }
            c0912v3 = c0912v;
            c0912v4 = c0912v2;
        } else {
            c0912v3 = c0912v;
            c0912v4 = c0912v2;
            if (c0912v3.G != c0912v4.G) {
                i2 |= 4096;
            }
            if (c0912v3.H != c0912v4.H) {
                i2 |= 8192;
            }
            if (c0912v3.I != c0912v4.I) {
                i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> j = a0.j(c0912v3);
                Pair<Integer, Integer> j2 = a0.j(c0912v4);
                if (j != null && j2 != null) {
                    int intValue = ((Integer) j.first).intValue();
                    int intValue2 = ((Integer) j2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C1177c(this.a, c0912v3, c0912v4, 3, 0);
                    }
                }
            }
            if (!c0912v3.h(c0912v4)) {
                i2 |= 32;
            }
            if (z(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C1177c(this.a, c0912v3, c0912v4, 1, 0);
            }
        }
        return new C1177c(this.a, c0912v3, c0912v4, 0, i2);
    }

    public float h(int i, int i2) {
        if (!this.l) {
            return -3.4028235E38f;
        }
        float f = this.o;
        if (f != -3.4028235E38f && this.m == i && this.n == i2) {
            return f;
        }
        float f2 = f(i, i2);
        this.o = f2;
        this.m = i;
        this.n = i2;
        return f2;
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        y("channelCount.support, " + i);
        return false;
    }

    public boolean l(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        y("sampleRate.support, " + i);
        return false;
    }

    public boolean p(C0912v c0912v) {
        return s(c0912v) && m(c0912v, false) && n(c0912v);
    }

    public boolean q(C0912v c0912v) throws a0.c {
        int i;
        int i2;
        if (!s(c0912v) || !m(c0912v, true) || !n(c0912v)) {
            return false;
        }
        if (!this.l) {
            int i3 = c0912v.H;
            return (i3 == -1 || l(i3)) && ((i = c0912v.G) == -1 || k(i));
        }
        int i4 = c0912v.v;
        if (i4 <= 0 || (i2 = c0912v.w) <= 0) {
            return true;
        }
        return w(i4, i2, c0912v.z);
    }

    public boolean r() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : i()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t(C0912v c0912v) {
        if (this.l) {
            return this.e;
        }
        Pair<Integer, Integer> j = a0.j(c0912v);
        return j != null && ((Integer) j.first).intValue() == 42;
    }

    public String toString() {
        return this.a;
    }

    public boolean w(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int c = J.c(videoCapabilities, i, i2, d);
            if (c == 2) {
                return true;
            }
            if (c == 1) {
                y("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!d(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !E(this.a) || !d(videoCapabilities, i2, i, d)) {
                y("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            x("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }
}
