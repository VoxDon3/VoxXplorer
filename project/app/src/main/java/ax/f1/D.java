/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import ax.P0.j;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.Y0.c;
import ax.f1.C;
import ax.f1.J;
import ax.f1.a0;

public final class D {
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
    private int m;
    private int n;
    private float o;

    D(String string, String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.a = ax.S0.a.e(string);
        this.b = string2;
        this.c = string3;
        this.d = codecCapabilities;
        this.h = bl;
        this.i = bl2;
        this.j = bl3;
        this.e = bl4;
        this.f = bl5;
        this.g = bl6;
        this.k = bl7;
        this.l = ax.P0.D.s(string2);
        this.o = -3.4028235E38f;
        this.m = -1;
        this.n = -1;
    }

    private static boolean A(String string) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(string);
    }

    private static boolean B() {
        String string = Build.MANUFACTURER;
        return string.equals("Xiaomi") || string.equals("OPPO") || string.equals("realme") || string.equals("motorola") || string.equals("LENOVO");
        {
        }
    }

    private static boolean C(String string) {
        String string2;
        return !(Build.VERSION.SDK_INT > 22 || !"ODROID-XU3".equals(string2 = Build.MODEL) && !"Nexus 10".equals(string2) || !"OMX.Exynos.AVC.Decoder".equals(string) && !"OMX.Exynos.AVC.Decoder.secure".equals(string));
    }

    private static boolean D(String string, int n8) {
        return "video/hevc".equals(string) && 2 == n8 && ("sailfish".equals(string = Build.DEVICE) || "marlin".equals(string));
    }

    private static boolean E(String string) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(string) || !"mcv5a".equals(Build.DEVICE);
    }

    public static D F(String string, String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        bl4 = !bl4 && codecCapabilities != null && D.j(codecCapabilities) && !D.C(string);
        boolean bl6 = codecCapabilities != null && D.v(codecCapabilities);
        bl5 = bl5 || codecCapabilities != null && D.u(codecCapabilities);
        return new D(string, string2, string3, codecCapabilities, bl, bl2, bl3, bl4, bl6, bl5, D.o(codecCapabilities));
    }

    private static int a(String string, String charSequence, int n8) {
        if (!(n8 > 1 || Build.VERSION.SDK_INT >= 26 && n8 > 0 || "audio/mpeg".equals(charSequence) || "audio/3gpp".equals(charSequence) || "audio/amr-wb".equals(charSequence) || "audio/mp4a-latm".equals(charSequence) || "audio/vorbis".equals(charSequence) || "audio/opus".equals(charSequence) || "audio/raw".equals(charSequence) || "audio/flac".equals(charSequence) || "audio/g711-alaw".equals(charSequence) || "audio/g711-mlaw".equals(charSequence) || "audio/gsm".equals(charSequence))) {
            int n9 = "audio/ac3".equals(charSequence) ? 6 : ("audio/eac3".equals(charSequence) ? 16 : 30);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("AssumedMaxChannelAdjustment: ");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(", [");
            ((StringBuilder)charSequence).append(n8);
            ((StringBuilder)charSequence).append(" to ");
            ((StringBuilder)charSequence).append(n9);
            ((StringBuilder)charSequence).append("]");
            u.h("MediaCodecInfo", ((StringBuilder)charSequence).toString());
            return n9;
        }
        return n8;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9) {
        int n10 = videoCapabilities.getWidthAlignment();
        int n11 = videoCapabilities.getHeightAlignment();
        return new Point(d0.k(n8, n10) * n10, d0.k(n9, n11) * n11);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9, double d8) {
        Point point = D.b(videoCapabilities, n8, n9);
        n8 = point.x;
        n9 = point.y;
        if (d8 != -1.0 && !(d8 < 1.0)) {
            if (!videoCapabilities.areSizeAndRateSupported(n8, n9, d8 = Math.floor(d8))) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            if ((videoCapabilities = C.a(videoCapabilities, n8, n9)) == null) {
                return true;
            }
            return d8 <= (Double)videoCapabilities.getUpper();
        }
        return videoCapabilities.isSizeSupported(n8, n9);
    }

    private float f(int n8, int n9) {
        float f8;
        float f9 = 1024.0f;
        if (this.w(n8, n9, 1024.0f)) {
            return 1024.0f;
        }
        float f10 = 0.0f;
        while (Math.abs(f8 = f9 - f10) > 5.0f) {
            if (this.w(n8, n9, f8 = f8 / 2.0f + f10)) {
                f10 = f8;
                continue;
            }
            f9 = f8;
        }
        return f10;
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int n8 = codecCapabilities != null && (codecCapabilities = codecCapabilities.getVideoCapabilities()) != null ? (Integer)codecCapabilities.getBitrateRange().getUpper() : 0;
        n8 = n8 >= 180000000 ? 1024 : (n8 >= 120000000 ? 512 : (n8 >= 60000000 ? 256 : (n8 >= 30000000 ? 128 : (n8 >= 18000000 ? 64 : (n8 >= 12000000 ? 32 : (n8 >= 0x6DDD00 ? 16 : (n8 >= 3600000 ? 8 : (n8 >= 1800000 ? 4 : (n8 >= 800000 ? 2 : 1)))))))));
        return new MediaCodecInfo.CodecProfileLevel[]{a0.f(1, n8)};
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(v v8, boolean bl) {
        int n8;
        int n9 = 2;
        Object object3 = a0.j(v8);
        String string = v8.o;
        Object object2 = object3;
        if (string != null) {
            object2 = object3;
            if (string.equals("video/mv-hevc")) {
                string = ax.P0.D.t(this.c);
                if (string.equals("video/mv-hevc")) {
                    return true;
                }
                object2 = object3;
                if (string.equals("video/hevc")) {
                    object2 = a0.r(v8);
                }
            }
        }
        if (object2 == null) {
            return true;
        }
        int n10 = (Integer)((Pair)object2).first;
        int n11 = (Integer)((Pair)object2).second;
        if ("video/dolby-vision".equals(v8.o)) {
            object2 = this.b;
            object2.getClass();
            n8 = -1;
            switch (((String)object2).hashCode()) {
                default: {
                    break;
                }
                case 1331836730: {
                    if (!((String)object2).equals("video/avc")) break;
                    n8 = 2;
                    break;
                }
                case -1662541442: {
                    if (!((String)object2).equals("video/hevc")) break;
                    n8 = 1;
                    break;
                }
                case -1662735862: {
                    if (!((String)object2).equals("video/av01")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    break;
                }
                case 2: {
                    n9 = 8;
                }
                case 0: 
                case 1: {
                    n8 = 0;
                    break;
                }
            }
        } else {
            n9 = n10;
            n8 = n11;
        }
        if (!this.l && n9 != 42) {
            return true;
        }
        object3 = this.i();
        object2 = object3;
        if (Build.VERSION.SDK_INT <= 23) {
            object2 = object3;
            if ("video/x-vnd.on2.vp9".equals(this.b)) {
                object2 = object3;
                if (((MediaCodecInfo.CodecProfileLevel[])object3).length == 0) {
                    object2 = D.g(this.d);
                }
            }
        }
        for (Object object3 : object2) {
            if (object3.profile != n9 || object3.level < n8 && bl || D.D(this.b, n9)) continue;
            return true;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("codec.profileLevel, ");
        ((StringBuilder)object2).append(v8.k);
        ((StringBuilder)object2).append(", ");
        ((StringBuilder)object2).append(this.c);
        this.y(((StringBuilder)object2).toString());
        return false;
    }

    private boolean n(v v8) {
        return !j.Objects.equals((Object)v8.o, (Object)"audio/flac") || v8.I != 22 || Build.VERSION.SDK_INT >= 34 || !this.a.equals("c2.android.flac.decoder");
        {
        }
    }

    private static boolean o(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !D.B();
    }

    private boolean s(v v8) {
        return this.b.equals(v8.o) || this.b.equals(a0.g(v8));
        {
        }
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssumedSupport [");
        stringBuilder.append(string);
        stringBuilder.append("] [");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [");
        stringBuilder.append(d0.e);
        stringBuilder.append("]");
        u.b("MediaCodecInfo", stringBuilder.toString());
    }

    private void y(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NoSupport [");
        stringBuilder.append(string);
        stringBuilder.append("] [");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [");
        stringBuilder.append(d0.e);
        stringBuilder.append("]");
        u.b("MediaCodecInfo", stringBuilder.toString());
    }

    private static boolean z(String string) {
        return "audio/opus".equals(string);
    }

    public Point c(int n8, int n9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            return null;
        }
        if ((codecCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return D.b((MediaCodecInfo.VideoCapabilities)codecCapabilities, n8, n9);
    }

    public c e(v v8, v v9) {
        int n8;
        block29: {
            int n9;
            int n10;
            block26: {
                block28: {
                    block27: {
                        boolean bl = j.Objects.equals((Object)v8.o, (Object)v9.o);
                        n10 = 0;
                        n9 = !bl ? 8 : 0;
                        if (!this.l) break block26;
                        n8 = n9;
                        if (v8.A != v9.A) {
                            n8 = n9 | 0x400;
                        }
                        if (v8.v != v9.v || v8.w != v9.w) {
                            n10 = 1;
                        }
                        n9 = n8;
                        if (!this.e) {
                            n9 = n8;
                            if (n10 != 0) {
                                n9 = n8 | 0x200;
                            }
                        }
                        if (!ax.P0.j.i(v8.E)) break block27;
                        n8 = n9;
                        if (ax.P0.j.i(v9.E)) break block28;
                    }
                    n8 = n9;
                    if (!j.Objects.equals((Object)v8.E, (Object)v9.E)) {
                        n8 = n9 | 0x800;
                    }
                }
                n9 = n8;
                if (D.A(this.a)) {
                    n9 = n8;
                    if (!v8.h(v9)) {
                        n9 = n8 | 2;
                    }
                }
                int n11 = v8.x;
                n8 = n9;
                if (n11 != -1) {
                    int n12 = v8.y;
                    n8 = n9;
                    if (n12 != -1) {
                        n8 = n9;
                        if (n11 == v9.x) {
                            n8 = n9;
                            if (n12 == v9.y) {
                                n8 = n9;
                                if (n10 != 0) {
                                    n8 = n9 | 2;
                                }
                            }
                        }
                    }
                }
                if (n8 == 0) {
                    String string = this.a;
                    n9 = v8.h(v9) ? 3 : 2;
                    return new c(string, v8, v9, n9, 0);
                }
                break block29;
            }
            n10 = n9;
            if (v8.G != v9.G) {
                n10 = n9 | 0x1000;
            }
            n8 = n10;
            if (v8.H != v9.H) {
                n8 = n10 | 0x2000;
            }
            n9 = n8;
            if (v8.I != v9.I) {
                n9 = n8 | 0x4000;
            }
            if (n9 == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> pair = a0.j(v8);
                Pair<Integer, Integer> pair2 = a0.j(v9);
                if (pair != null && pair2 != null) {
                    n8 = (Integer)pair.first;
                    n10 = (Integer)pair2.first;
                    if (n8 == 42 && n10 == 42) {
                        return new c(this.a, v8, v9, 3, 0);
                    }
                }
            }
            n8 = n9;
            if (!v8.h(v9)) {
                n8 = n9 | 0x20;
            }
            n9 = n8;
            if (D.z(this.b)) {
                n9 = n8 | 2;
            }
            n8 = n9;
            if (n9 == 0) {
                return new c(this.a, v8, v9, 1, 0);
            }
        }
        return new c(this.a, v8, v9, 0, n8);
    }

    public float h(int n8, int n9) {
        if (!this.l) {
            return -3.4028235E38f;
        }
        float f8 = this.o;
        if (f8 != -3.4028235E38f && this.m == n8 && this.n == n9) {
            return f8;
        }
        this.o = f8 = this.f(n8, n9);
        this.m = n8;
        this.n = n9;
        return f8;
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray = this.d;
        if (codecProfileLevelArray != null && (codecProfileLevelArray = codecProfileLevelArray.profileLevels) != null) {
            return codecProfileLevelArray;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    public boolean k(int n8) {
        Object object = this.d;
        if (object == null) {
            this.y("channelCount.caps");
            return false;
        }
        if ((object = object.getAudioCapabilities()) == null) {
            this.y("channelCount.aCaps");
            return false;
        }
        if (D.a(this.a, this.b, object.getMaxInputChannelCount()) < n8) {
            object = new StringBuilder();
            ((StringBuilder)object).append("channelCount.support, ");
            ((StringBuilder)object).append(n8);
            this.y(((StringBuilder)object).toString());
            return false;
        }
        return true;
    }

    public boolean l(int n8) {
        Object object = this.d;
        if (object == null) {
            this.y("sampleRate.caps");
            return false;
        }
        if ((object = object.getAudioCapabilities()) == null) {
            this.y("sampleRate.aCaps");
            return false;
        }
        if (!object.isSampleRateSupported(n8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("sampleRate.support, ");
            ((StringBuilder)object).append(n8);
            this.y(((StringBuilder)object).toString());
            return false;
        }
        return true;
    }

    public boolean p(v v8) {
        return this.s(v8) && this.m(v8, false) && this.n(v8);
    }

    public boolean q(v v8) throws a0.c {
        if (!this.s(v8)) {
            return false;
        }
        if (!this.m(v8, true)) {
            return false;
        }
        if (!this.n(v8)) {
            return false;
        }
        if (this.l) {
            int n8;
            int n9 = v8.v;
            if (n9 > 0 && (n8 = v8.w) > 0) {
                return this.w(n9, n8, v8.z);
            }
            return true;
        }
        int n10 = v8.H;
        return !(n10 != -1 && !this.l(n10) || (n10 = v8.G) != -1 && !this.k(n10));
        {
        }
    }

    public boolean r() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray = this.i();
            int n8 = codecProfileLevelArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (codecProfileLevelArray[i8].profile != 16384) continue;
                return true;
            }
        }
        return false;
    }

    public boolean t(v pair) {
        if (this.l) {
            return this.e;
        }
        return (pair = a0.j((v)pair)) != null && (Integer)pair.first == 42;
    }

    public String toString() {
        return this.a;
    }

    public boolean w(int n8, int n9, double d8) {
        Object object = this.d;
        if (object == null) {
            this.y("sizeAndRate.caps");
            return false;
        }
        if ((object = object.getVideoCapabilities()) == null) {
            this.y("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int n10 = J.c((MediaCodecInfo.VideoCapabilities)object, n8, n9, d8);
            if (n10 == 2) {
                return true;
            }
            if (n10 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("sizeAndRate.cover, ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append("x");
                ((StringBuilder)object).append(n9);
                ((StringBuilder)object).append("@");
                ((StringBuilder)object).append(d8);
                this.y(((StringBuilder)object).toString());
                return false;
            }
        }
        if (!D.d((MediaCodecInfo.VideoCapabilities)object, n8, n9, d8)) {
            if (n8 < n9 && D.E(this.a) && D.d((MediaCodecInfo.VideoCapabilities)object, n9, n8, d8)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("sizeAndRate.rotated, ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append("x");
                ((StringBuilder)object).append(n9);
                ((StringBuilder)object).append("@");
                ((StringBuilder)object).append(d8);
                this.x(((StringBuilder)object).toString());
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("sizeAndRate.support, ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append("x");
                ((StringBuilder)object).append(n9);
                ((StringBuilder)object).append("@");
                ((StringBuilder)object).append(d8);
                this.y(((StringBuilder)object).toString());
                return false;
            }
        }
        return true;
    }
}

