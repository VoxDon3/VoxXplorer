package ax.f1;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import ax.P0.C0912v;
import ax.S0.C0976i;
import ax.S0.C0987u;
import ax.f1.a0;
import ax.q7.C2876c;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class a0 {
    private static final HashMap<b, List<C2006D>> a = new HashMap<>();
    private static int b = -1;

    private static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private interface d {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {
        private e() {
        }

        @Override // ax.f1.a0.d
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // ax.f1.a0.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // ax.f1.a0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // ax.f1.a0.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // ax.f1.a0.d
        public boolean e() {
            return false;
        }
    }

    private static final class f implements d {
        private final int a;
        private MediaCodecInfo[] b;

        public f(boolean z, boolean z2, boolean z3) {
            this.a = (z || z2 || z3) ? 1 : 0;
        }

        private void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        @Override // ax.f1.a0.d
        public MediaCodecInfo a(int i) {
            f();
            return this.b[i];
        }

        @Override // ax.f1.a0.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // ax.f1.a0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // ax.f1.a0.d
        public int d() {
            f();
            return this.b.length;
        }

        @Override // ax.f1.a0.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g<T> {
        int a(T t);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    private static <T> void B(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: ax.f1.Z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a0.a(a0.g.this, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static /* synthetic */ int b(C2006D c2006d) {
        return (c2006d.i ? 2 : 0) + (!c2006d.j ? 1 : 0);
    }

    public static /* synthetic */ int c(C0912v c0912v, C2006D c2006d) {
        return c2006d.p(c0912v) ? 1 : 0;
    }

    public static /* synthetic */ int d(C2006D c2006d) {
        String str = c2006d.a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List<C2006D> list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C2006D.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            B(list, new g() { // from class: ax.f1.W
                @Override // ax.f1.a0.g
                public final int a(Object obj) {
                    return a0.d((C2006D) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel f(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String g(C0912v c0912v) {
        Pair<Integer, Integer> j;
        if ("audio/eac3-joc".equals(c0912v.o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c0912v.o) && (j = j(c0912v)) != null) {
            int intValue = ((Integer) j.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(c0912v.o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<C2006D> h(Q q, C0912v c0912v, boolean z, boolean z2) throws c {
        String g2 = g(c0912v);
        return g2 == null ? AbstractC2991z.z() : q.a(g2, z, z2);
    }

    private static String i(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> j(C0912v c0912v) {
        return C0976i.r(c0912v);
    }

    public static C2006D k(String str, boolean z, boolean z2) throws c {
        List<C2006D> l = l(str, z, z2);
        if (l.isEmpty()) {
            return null;
        }
        return l.get(0);
    }

    public static synchronized List<C2006D> l(String str, boolean z, boolean z2) throws c {
        synchronized (a0.class) {
            try {
                b bVar = new b(str, z, z2);
                HashMap<b, List<C2006D>> hashMap = a;
                List<C2006D> list = hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                ArrayList<C2006D> m = m(bVar, new f(z, z2, str.equals("video/mv-hevc")));
                if (z && m.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                    m = m(bVar, new e());
                    if (!m.isEmpty()) {
                        C0987u.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m.get(0).a);
                    }
                }
                e(str, m);
                AbstractC2991z u = AbstractC2991z.u(m);
                hashMap.put(bVar, u);
                return u;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1.b != r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r17 = r11;
        r18 = r16;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        r5.add(ax.f1.C2006D.F(r9, r7, r8, r9, r10, r11, r18, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009b, code lost:
    
        if (r1.b == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0119, B:10:0x002b, B:13:0x0036, B:48:0x00f2, B:51:0x00fa, B:53:0x0100, B:56:0x0121, B:57:0x0142), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<ax.f1.C2006D> m(ax.f1.a0.b r19, ax.f1.a0.d r20) throws ax.f1.a0.c {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.a0.m(ax.f1.a0$b, ax.f1.a0$d):java.util.ArrayList");
    }

    public static List<C2006D> n(Q q, C0912v c0912v, boolean z, boolean z2) throws c {
        List<C2006D> a2 = q.a(c0912v.o, z, z2);
        return AbstractC2991z.r().j(a2).j(h(q, c0912v, z, z2)).k();
    }

    public static List<C2006D> o(List<C2006D> list, final C0912v c0912v) {
        ArrayList arrayList = new ArrayList(list);
        B(arrayList, new g() { // from class: ax.f1.X
            @Override // ax.f1.a0.g
            public final int a(Object obj) {
                return a0.c(C0912v.this, (C2006D) obj);
            }
        });
        return arrayList;
    }

    public static List<C2006D> p(List<C2006D> list) {
        ArrayList arrayList = new ArrayList(list);
        B(arrayList, new g() { // from class: ax.f1.Y
            @Override // ax.f1.a0.g
            public final int a(Object obj) {
                return a0.b((C2006D) obj);
            }
        });
        return AbstractC2991z.u(arrayList);
    }

    public static C2006D q() throws c {
        return k("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> r(C0912v c0912v) {
        String h = ax.T0.h.h(c0912v.r);
        if (h == null) {
            return null;
        }
        return C0976i.u(h, ax.S0.d0.x1(h.trim(), "\\."), c0912v.E);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && t(mediaCodecInfo);
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? w(mediaCodecInfo) : !x(mediaCodecInfo, str);
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return y(mediaCodecInfo);
        }
        if (ax.P0.D.o(str)) {
            return true;
        }
        String e2 = C2876c.e(mediaCodecInfo.getName());
        if (e2.startsWith("arc.")) {
            return false;
        }
        return e2.startsWith("omx.google.") || e2.startsWith("omx.ffmpeg.") || (e2.startsWith("omx.sec.") && e2.contains(".sw.")) || e2.equals("omx.qcom.video.decoder.hevcswvdec") || e2.startsWith("c2.android.") || e2.startsWith("c2.google.") || !(e2.startsWith("omx.") || e2.startsWith("c2."));
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return A(mediaCodecInfo);
        }
        String e2 = C2876c.e(mediaCodecInfo.getName());
        return (e2.startsWith("omx.google.") || e2.startsWith("c2.android.") || e2.startsWith("c2.google.")) ? false : true;
    }
}
