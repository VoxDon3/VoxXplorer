/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import ax.P0.v;
import ax.S0.d0;
import ax.S0.i;
import ax.S0.u;
import ax.T0.h;
import ax.f1.D;
import ax.f1.Q;
import ax.f1.S;
import ax.f1.T;
import ax.f1.U;
import ax.f1.V;
import ax.f1.W;
import ax.f1.X;
import ax.f1.Y;
import ax.f1.Z;
import ax.r7.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@SuppressLint(value={"InlinedApi"})
public final class a0 {
    private static final HashMap<b, List<D>> a = new HashMap();
    private static int b = -1;

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return U.a(mediaCodecInfo);
    }

    private static <T> void B(List<T> list, g<T> g8) {
        Collections.sort(list, new Z(g8));
    }

    public static /* synthetic */ int a(g g8, Object object, Object object2) {
        return g8.a(object2) - g8.a(object);
    }

    public static /* synthetic */ int b(D d8) {
        int n8 = d8.i ? 2 : 0;
        return n8 + (d8.j ^ 1);
    }

    public static /* synthetic */ int c(v v8, D d8) {
        return d8.p(v8) ? 1 : 0;
    }

    public static /* synthetic */ int d(D object) {
        object = ((D)object).a;
        if (!((String)object).startsWith("OMX.google") && !((String)object).startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && ((String)object).equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    private static void e(String string, List<D> list) {
        if ("audio/raw".equals(string)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get((int)0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(D.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            a0.B(list, new W());
        }
        if (Build.VERSION.SDK_INT < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get((int)0).a)) {
            list.add(list.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel f(int n8, int n9) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = n8;
        codecProfileLevel.level = n9;
        return codecProfileLevel;
    }

    public static String g(v v8) {
        Pair<Integer, Integer> pair;
        if ("audio/eac3-joc".equals(v8.o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(v8.o) && (pair = a0.j(v8)) != null) {
            int n8 = (Integer)pair.first;
            if (n8 != 16 && n8 != 256) {
                if (n8 == 512) {
                    return "video/avc";
                }
                if (n8 == 1024) {
                    return "video/av01";
                }
            } else {
                return "video/hevc";
            }
        }
        if ("video/mv-hevc".equals(v8.o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<D> h(Q q8, v object, boolean bl, boolean bl2) throws c {
        if ((object = a0.g((v)object)) == null) {
            return z.z();
        }
        return q8.a((String)object, bl, bl2);
    }

    private static String i(MediaCodecInfo stringArray, String string, String string2) {
        for (String string3 : stringArray.getSupportedTypes()) {
            if (!string3.equalsIgnoreCase(string2)) continue;
            return string3;
        }
        if (string2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(string)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(string) || "OMX.realtek.video.decoder.tunneled".equals(string)) {
                return "video/dv_hevc";
            }
        } else if (string2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(string) || "c2.qti.mvhevc.decoder.secure".equals(string)) {
                return "video/x-mvhevc";
            }
        } else {
            if (string2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(string)) {
                return "audio/x-lg-alac";
            }
            if (string2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(string)) {
                return "audio/x-lg-flac";
            }
            if (string2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(string)) {
                return "audio/lg-ac3";
            }
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> j(v v8) {
        return i.r(v8);
    }

    public static D k(String object, boolean bl, boolean bl2) throws c {
        if ((object = a0.l((String)object, bl, bl2)).isEmpty()) {
            return null;
        }
        return (D)object.get(0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<D> l(String object, boolean bl, boolean bl2) throws c {
        synchronized (a0.class) {
            Throwable throwable2;
            block10: {
                Serializable serializable;
                HashMap<b, List<D>> hashMap;
                b b8;
                block9: {
                    try {
                        b8 = new b((String)object, bl, bl2);
                        hashMap = a;
                        serializable = hashMap.get(b8);
                        if (serializable == null) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    return serializable;
                }
                boolean bl3 = ((String)object).equals("video/mv-hevc");
                serializable = new f(bl, bl2, bl3);
                ArrayList<D> arrayList = a0.m(b8, (d)((Object)serializable));
                serializable = arrayList;
                if (bl) {
                    serializable = arrayList;
                    if (arrayList.isEmpty()) {
                        serializable = arrayList;
                        if (Build.VERSION.SDK_INT <= 23) {
                            serializable = new e();
                            arrayList = a0.m(b8, (d)((Object)serializable));
                            serializable = arrayList;
                            if (!arrayList.isEmpty()) {
                                serializable = new StringBuilder();
                                ((StringBuilder)serializable).append("MediaCodecList API didn't list secure decoder for: ");
                                ((StringBuilder)serializable).append((String)object);
                                ((StringBuilder)serializable).append(". Assuming: ");
                                ((StringBuilder)serializable).append(arrayList.get((int)0).a);
                                u.h("MediaCodecUtil", ((StringBuilder)serializable).toString());
                                serializable = arrayList;
                            }
                        }
                    }
                }
                a0.e((String)object, serializable);
                object = z.u(serializable);
                hashMap.put(b8, (List<D>)object);
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ArrayList<D> m(b var0, d var1_2) throws c {
        block19: {
            block21: {
                block20: {
                    try {
                        var15_3 = new ArrayList<D>();
                        var13_4 = var0.a;
                        var3_5 = var1_2.d();
                        var5_6 = var1_2.e();
                        var2_7 = 0;
lbl7:
                        // 2 sources

                        while (true) {
                            if (var2_7 >= var3_5) return var15_3;
                            var16_23 = var1_2.a(var2_7);
                            if (!a0.s((MediaCodecInfo)var16_23) && a0.u((MediaCodecInfo)var16_23, var12_21 = var16_23.getName(), var5_6, var13_4) && (var14_22 = a0.i((MediaCodecInfo)var16_23, var12_21, var13_4)) != null) break;
                            break block19;
                            break;
                        }
                    }
                    catch (Exception var0_1) {
                        throw new c(var0_1);
                    }
                    try {
                        var11_14 = var16_23.getCapabilitiesForType(var14_22);
                        var7_10 = var1_2.b("tunneled-playback", var14_22, (MediaCodecInfo.CodecCapabilities)var11_14);
                        var6_9 = var1_2.c("tunneled-playback", var14_22, (MediaCodecInfo.CodecCapabilities)var11_14);
                        var8_11 = var0.c;
                        if (!var8_11 && var6_9 || var8_11 && !var7_10) break block19;
                        var6_9 = var1_2.b("secure-playback", var14_22, (MediaCodecInfo.CodecCapabilities)var11_14);
                        var8_11 = var1_2.c("secure-playback", var14_22, (MediaCodecInfo.CodecCapabilities)var11_14);
                        var7_10 = var0.b;
                        if ((var7_10 || !var8_11) && (!var7_10 || var6_9)) break block20;
                        break block19;
                    }
                    catch (Exception var11_20) {
                        // empty catch block
                        ** GOTO lbl-1000
                    }
                }
                try {
                    var7_10 = a0.v((MediaCodecInfo)var16_23, var13_4);
                }
                catch (Exception var11_19) {
                    ** GOTO lbl-1000
                }
                try {
                    var8_11 = a0.x((MediaCodecInfo)var16_23, var13_4);
                    var9_12 = a0.z((MediaCodecInfo)var16_23);
                    if (!var5_6 || (var10_13 = var0.b) != var6_9) {
                    }
                    ** GOTO lbl50
                }
                catch (Exception var11_15) {
                    ** GOTO lbl-1000
                }
                if (var5_6) break block21;
                var10_13 = var0.b;
                if (var10_13) break block21;
                {
                    catch (Exception var11_17) {
                        ** GOTO lbl-1000
                    }
lbl50:
                    // 2 sources

                    ** try [egrp 5[TRYBLOCK] [10 : 301->386)] { 
lbl51:
                    // 1 sources

                    var15_3.add(D.F(var12_21, var13_4, var14_22, (MediaCodecInfo.CodecCapabilities)var11_14, var7_10, var8_11, var9_12, false, false));
                    break block19;
                }
lbl54:
                // 1 sources

                catch (Exception var11_16) {
                    ** GOTO lbl-1000
                }
            }
            if (var5_6 || !var6_9) break block19;
            var16_23 = new StringBuilder();
            var16_23.append(var12_21);
            var16_23.append(".secure");
            var16_23 = var16_23.toString();
            try {
                var15_3.add(D.F((String)var16_23, var13_4, var14_22, (MediaCodecInfo.CodecCapabilities)var11_14, var7_10, var8_11, var9_12, false, true));
                return var15_3;
            }
            catch (Exception var11_18) {}
lbl-1000:
            // 6 sources

            {
                var4_8 = Build.VERSION.SDK_INT;
                if (var4_8 > 23 || var15_3.isEmpty()) ** GOTO lbl-1000
                var11_14 = new StringBuilder();
                var11_14.append("Skipping codec ");
                var11_14.append(var12_21);
                var11_14.append(" (failed to query capabilities)");
                u.c("MediaCodecUtil", var11_14.toString());
            }
        }
        ++var2_7;
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var0 = new StringBuilder();
            var0.append("Failed to query codec ");
            var0.append(var12_21);
            var0.append(" (");
            var0.append(var14_22);
            var0.append(")");
            u.c("MediaCodecUtil", var0.toString());
            throw var11_14;
        }
    }

    public static List<D> n(Q object, v v8, boolean bl, boolean bl2) throws c {
        List<D> list = object.a(v8.o, bl, bl2);
        object = a0.h((Q)object, v8, bl, bl2);
        return z.r().j(list).j((Iterable<D>)object).k();
    }

    public static List<D> o(List<D> list, v v8) {
        list = new ArrayList<D>(list);
        a0.B(list, new X(v8));
        return list;
    }

    public static List<D> p(List<D> list) {
        list = new ArrayList<D>(list);
        a0.B(list, new Y());
        return z.u(list);
    }

    public static D q() throws c {
        return a0.k("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> r(v v8) {
        String string = h.h(v8.r);
        if (string == null) {
            return null;
        }
        return i.u(string, d0.x1(string.trim(), "\\."), v8.E);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && a0.t(mediaCodecInfo);
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo) {
        return V.a(mediaCodecInfo);
    }

    private static boolean u(MediaCodecInfo object, String string, boolean bl, String string2) {
        if (!(object.isEncoder() || !bl && string.endsWith(".secure"))) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 < 24 && ("OMX.SEC.aac.dec".equals(string) || "OMX.Exynos.AAC.Decoder".equals(string)) && "samsung".equals(Build.MANUFACTURER) && (((String)(object = Build.DEVICE)).startsWith("zeroflte") || ((String)object).startsWith("zerolte") || ((String)object).startsWith("zenlte") || "SC-05G".equals(object) || "marinelteatt".equals(object) || "404SC".equals(object) || "SC-04G".equals(object) || "SCV31".equals(object))) {
                return false;
            }
            return n8 > 23 || !"audio/eac3-joc".equals(string2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(string);
        }
        return false;
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo, String string) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a0.w(mediaCodecInfo);
        }
        return a0.x(mediaCodecInfo, string) ^ true;
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        return T.a(mediaCodecInfo);
    }

    private static boolean x(MediaCodecInfo object, String string) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a0.y((MediaCodecInfo)object);
        }
        if (ax.P0.D.o(string)) {
            return true;
        }
        if (((String)(object = ax.q7.c.e(object.getName()))).startsWith("arc.")) {
            return false;
        }
        return ((String)object).startsWith("omx.google.") || ((String)object).startsWith("omx.ffmpeg.") || ((String)object).startsWith("omx.sec.") && ((String)object).contains(".sw.") || ((String)object).equals("omx.qcom.video.decoder.hevcswvdec") || ((String)object).startsWith("c2.android.") || ((String)object).startsWith("c2.google.") || !((String)object).startsWith("omx.") && !((String)object).startsWith("c2.");
        {
        }
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        return S.a(mediaCodecInfo);
    }

    private static boolean z(MediaCodecInfo object) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a0.A((MediaCodecInfo)object);
        }
        return !((String)(object = ax.q7.c.e(object.getName()))).startsWith("omx.google.") && !((String)object).startsWith("c2.android.") && !((String)object).startsWith("c2.google.");
    }

    private static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String string, boolean bl, boolean bl2) {
            this.a = string;
            this.b = bl;
            this.c = bl2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && object.getClass() == b.class) {
                object = (b)object;
                if (TextUtils.equals((CharSequence)this.a, (CharSequence)((b)object).a) && this.b == ((b)object).b && this.c == ((b)object).c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            boolean bl = this.b;
            int n9 = 1237;
            int n10 = bl ? 1231 : 1237;
            if (this.c) {
                n9 = 1231;
            }
            return ((n8 + 31) * 31 + n10) * 31 + n9;
        }
    }

    public static class c
    extends Exception {
        private c(Throwable throwable) {
            super("Failed to query underlying media codecs", throwable);
        }
    }

    private static interface d {
        public MediaCodecInfo a(int var1);

        public boolean b(String var1, String var2, MediaCodecInfo.CodecCapabilities var3);

        public boolean c(String var1, String var2, MediaCodecInfo.CodecCapabilities var3);

        public int d();

        public boolean e();
    }

    private static final class e
    implements d {
        private e() {
        }

        @Override
        public MediaCodecInfo a(int n8) {
            return MediaCodecList.getCodecInfoAt((int)n8);
        }

        @Override
        public boolean b(String string, String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(string) && "video/avc".equals(string2);
        }

        @Override
        public boolean c(String string, String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override
        public boolean e() {
            return false;
        }
    }

    private static final class f
    implements d {
        private final int a;
        private MediaCodecInfo[] b;

        public f(boolean bl, boolean bl2, boolean bl3) {
            int n8 = !(bl || bl2 || bl3) ? 0 : 1;
            this.a = n8;
        }

        private void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        @Override
        public MediaCodecInfo a(int n8) {
            this.f();
            return this.b[n8];
        }

        @Override
        public boolean b(String string, String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(string);
        }

        @Override
        public boolean c(String string, String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(string);
        }

        @Override
        public int d() {
            this.f();
            return this.b.length;
        }

        @Override
        public boolean e() {
            return true;
        }
    }

    private static interface g<T> {
        public int a(T var1);
    }
}

