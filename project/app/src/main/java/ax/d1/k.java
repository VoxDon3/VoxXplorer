/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import ax.K1.p;
import ax.P0.C;
import ax.P0.D;
import ax.P0.E;
import ax.P0.o;
import ax.P0.v;
import ax.S0.O;
import ax.S0.d0;
import ax.S0.u;
import ax.c1.h;
import ax.d1.f;
import ax.d1.i;
import ax.d1.j;
import ax.m1.p;
import ax.r7.F;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k
implements p.a<j> {
    private static final Pattern A;
    private static final Pattern B;
    private static final Pattern C;
    private static final Pattern D;
    private static final Pattern E;
    private static final Pattern F;
    private static final Pattern G;
    private static final Pattern H;
    private static final Pattern I;
    private static final Pattern J;
    private static final Pattern K;
    private static final Pattern L;
    private static final Pattern M;
    private static final Pattern N;
    private static final Pattern O;
    private static final Pattern P;
    private static final Pattern Q;
    private static final Pattern R;
    private static final Pattern S;
    private static final Pattern T;
    private static final Pattern U;
    private static final Pattern V;
    private static final Pattern W;
    private static final Pattern X;
    private static final Pattern Y;
    private static final Pattern Z;
    private static final Pattern a0;
    private static final Pattern b0;
    private static final Pattern c;
    private static final Pattern c0;
    private static final Pattern d;
    private static final Pattern d0;
    private static final Pattern e;
    private static final Pattern e0;
    private static final Pattern f;
    private static final Pattern f0;
    private static final Pattern g;
    private static final Pattern g0;
    private static final Pattern h;
    private static final Pattern h0;
    private static final Pattern i;
    private static final Pattern i0;
    private static final Pattern j;
    private static final Pattern j0;
    private static final Pattern k;
    private static final Pattern k0;
    private static final Pattern l;
    private static final Pattern l0;
    private static final Pattern m;
    private static final Pattern m0;
    private static final Pattern n;
    private static final Pattern n0;
    private static final Pattern o;
    private static final Pattern o0;
    private static final Pattern p;
    private static final Pattern p0;
    private static final Pattern q;
    private static final Pattern q0;
    private static final Pattern r;
    private static final Pattern r0;
    private static final Pattern s;
    private static final Pattern s0;
    private static final Pattern t;
    private static final Pattern t0;
    private static final Pattern u;
    private static final Pattern u0;
    private static final Pattern v;
    private static final Pattern v0;
    private static final Pattern w;
    private static final Pattern x;
    private static final Pattern y;
    private static final Pattern z;
    private final i a;
    private final f b;

    static {
        c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
        d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
        e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
        f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
        g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
        h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
        i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
        j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
        k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
        l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
        m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
        n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
        o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
        p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
        q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
        r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
        s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
        t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
        u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
        v = ax.d1.k.c("CAN-SKIP-DATERANGES");
        w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
        x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
        y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
        z = ax.d1.k.c("CAN-BLOCK-RELOAD");
        A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
        B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
        C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
        D = Pattern.compile("LAST-MSN=(\\d+)\\b");
        E = Pattern.compile("LAST-PART=(\\d+)\\b");
        F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
        G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
        H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
        I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
        J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
        K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
        L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
        M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
        N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
        O = Pattern.compile("IV=([^,.*]+)");
        P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
        Q = Pattern.compile("TYPE=(PART|MAP)");
        R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
        S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
        T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
        U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
        V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
        W = ax.d1.k.c("AUTOSELECT");
        X = ax.d1.k.c("DEFAULT");
        Y = ax.d1.k.c("FORCED");
        Z = ax.d1.k.c("INDEPENDENT");
        a0 = ax.d1.k.c("GAP");
        b0 = ax.d1.k.c("PRECISE");
        c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
        d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
        e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
        f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
        g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
        h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
        i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
        j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
        k0 = ax.d1.k.c("END-ON-NEXT");
        l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
        m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
        n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
        o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
        p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
        q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
        r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
        s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
        t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
        u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
        v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");
    }

    public k() {
        this(ax.d1.i.n, null);
    }

    public k(i i8, f f8) {
        this.a = i8;
        this.b = f8;
    }

    private static f.h A(String string) {
        long l8;
        boolean bl;
        long l9;
        long l10;
        block0: {
            double d8 = ax.d1.k.t(string, u, -9.223372036854776E18);
            l10 = -9223372036854775807L;
            l9 = d8 == -9.223372036854776E18 ? -9223372036854775807L : (long)(d8 * 1000000.0);
            bl = ax.d1.k.s(string, v, false);
            d8 = ax.d1.k.t(string, x, -9.223372036854776E18);
            l8 = d8 == -9.223372036854776E18 ? -9223372036854775807L : (long)(d8 * 1000000.0);
            d8 = ax.d1.k.t(string, y, -9.223372036854776E18);
            if (d8 == -9.223372036854776E18) break block0;
            l10 = (long)(d8 * 1000000.0);
        }
        return new f.h(l9, bl, l8, l10, ax.d1.k.s(string, z, false));
    }

    private static String B(String string, Pattern pattern, Map<String, String> object) throws E {
        if ((object = ax.d1.k.x(string, pattern, object)) != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Couldn't match ");
        ((StringBuilder)object).append(pattern.pattern());
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(string);
        throw ax.P0.E.c(((StringBuilder)object).toString(), null);
    }

    private static long C(String string, Pattern pattern) throws E {
        return new BigDecimal(ax.d1.k.B(string, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String charSequence, Map<String, String> map) {
        Matcher matcher = u0.matcher(charSequence);
        charSequence = new StringBuffer();
        while (matcher.find()) {
            String string = matcher.group(1);
            if (!map.containsKey(string)) continue;
            matcher.appendReplacement((StringBuffer)charSequence, Matcher.quoteReplacement(map.get(string)));
        }
        matcher.appendTail((StringBuffer)charSequence);
        return ((StringBuffer)charSequence).toString();
    }

    private static int E(BufferedReader bufferedReader, boolean bl, int n8) throws IOException {
        while (n8 != -1 && Character.isWhitespace(n8) && (bl || !ax.S0.d0.N0(n8))) {
            n8 = bufferedReader.read();
        }
        return n8;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int n8;
        int n9 = n8 = bufferedReader.read();
        if (n8 == 239) {
            if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                n9 = bufferedReader.read();
            } else {
                return false;
            }
        }
        n8 = ax.d1.k.E(bufferedReader, true, n9);
        for (n9 = 0; n9 < 7; ++n9) {
            if (n8 != "#EXTM3U".charAt(n9)) {
                return false;
            }
            n8 = bufferedReader.read();
        }
        return ax.S0.d0.N0(ax.d1.k.E(bufferedReader, false, n8));
    }

    private static Pattern c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("=(");
        stringBuilder.append("NO");
        stringBuilder.append("|");
        stringBuilder.append("YES");
        stringBuilder.append(")");
        return Pattern.compile(stringBuilder.toString());
    }

    private static o d(String string, o.b[] bArray) {
        o.b[] bArray2 = new o.b[bArray.length];
        for (int i8 = 0; i8 < bArray.length; ++i8) {
            bArray2[i8] = bArray[i8].a(null);
        }
        return new o(string, bArray2);
    }

    private static String e(long l8, String string, String string2) {
        if (string == null) {
            return null;
        }
        if (string2 != null) {
            return string2;
        }
        return Long.toHexString(l8);
    }

    private static i.b f(ArrayList<i.b> arrayList, String string) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            i.b b8 = arrayList.get(i8);
            if (!string.equals(b8.d)) continue;
            return b8;
        }
        return null;
    }

    private static i.b g(ArrayList<i.b> arrayList, String string) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            i.b b8 = arrayList.get(i8);
            if (!string.equals(b8.e)) continue;
            return b8;
        }
        return null;
    }

    private static i.b h(ArrayList<i.b> arrayList, String string) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            i.b b8 = arrayList.get(i8);
            if (!string.equals(b8.c)) continue;
            return b8;
        }
        return null;
    }

    private static boolean i(String string, String string2, String string3, String string4) {
        if (!ax.P0.D.p(string2, string3)) {
            return false;
        }
        if (string3 == null) {
            return true;
        }
        if (string != null && string4 != null) {
            return !(string.equals("PQ") && !string4.equals("db1p") || string.equals("SDR") && !string4.equals("db2g")) && (!string.equals("HLG") || string4.startsWith("db4"));
        }
        return false;
    }

    private static f.b k(String string, String string2, Map<String, String> object) throws E {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("=");
        charSequence = ((StringBuilder)charSequence).toString();
        int n8 = string.indexOf((String)charSequence) + ((String)charSequence).length();
        int n9 = string.length() == n8 + 1 ? 1 : 2;
        charSequence = string.substring(n8, n9 + n8);
        if (((String)charSequence).startsWith("\"")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("=");
            ((StringBuilder)charSequence).append("\"((?:.|\f)+?)\"");
            return new f.b(string2, ax.d1.k.B(string, Pattern.compile(((StringBuilder)charSequence).toString()), (Map<String, String>)object), 0);
        }
        if (!((String)charSequence).equals("0x") && !((String)charSequence).equals("0X")) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("=([\\d\\.]+)\\b");
            return new f.b(string2, ax.d1.k.l(string, Pattern.compile(((StringBuilder)object).toString())));
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("=(0[xX][A-F0-9]+)");
        return new f.b(string2, ax.d1.k.B(string, Pattern.compile(((StringBuilder)charSequence).toString()), (Map<String, String>)object), 1);
    }

    private static double l(String string, Pattern pattern) throws E {
        return Double.parseDouble(ax.d1.k.B(string, pattern, Collections.EMPTY_MAP));
    }

    private static o.b m(String object, String object2, Map<String, String> map) throws E {
        String string = ax.d1.k.w((String)object, M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(object2)) {
            object = ax.d1.k.B((String)object, N, map);
            return new o.b(ax.P0.i.d, "video/mp4", Base64.decode((String)((String)object).substring(((String)object).indexOf(44)), (int)0));
        }
        if ("com.widevine".equals(object2)) {
            return new o.b(ax.P0.i.d, "hls", ax.S0.d0.x0((String)object));
        }
        if ("com.microsoft.playready".equals(object2) && "1".equals(string)) {
            object = ax.d1.k.B((String)object, N, map);
            object2 = Base64.decode((String)((String)object).substring(((String)object).indexOf(44)), (int)0);
            object = ax.P0.i.e;
            return new o.b((UUID)object, "video/mp4", ax.K1.p.a((UUID)object, (byte[])object2));
        }
        return null;
    }

    private static String n(String string) {
        if (!"SAMPLE-AES-CENC".equals(string) && !"SAMPLE-AES-CTR".equals(string)) {
            return "cbcs";
        }
        return "cenc";
    }

    private static int o(String string, Pattern pattern) throws E {
        return Integer.parseInt(ax.d1.k.B(string, pattern, Collections.EMPTY_MAP));
    }

    private static long p(String string, Pattern pattern) throws E {
        return Long.parseLong(ax.d1.k.B(string, pattern, Collections.EMPTY_MAP));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static f q(i var0, f var1_1, b var2_2, String var3_3) throws IOException {
        var77_4 /* !! */  = var0;
        var75_5 /* !! */  = var1_1 /* !! */ ;
        var55_6 = var77_4 /* !! */ .c;
        var84_7 = new HashMap<String, String>();
        var69_8 = new HashMap<o.b[], Object>();
        var68_9 = new ArrayList<f.f>();
        var73_10 /* !! */  = new ArrayList<f.d>();
        var78_11 = new ArrayList<f.e>();
        var76_12 = new ArrayList<String>();
        var72_13 = new LinkedHashMap<String, f.c.a>();
        var71_14 = new f.h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        var79_15 = new TreeMap<String[], String[]>();
        var16_16 = 0L;
        var32_22 = var22_21 = (var14_20 = (var34_19 = (var24_18 = (var20_17 = 0L))));
        var42_23 = -9223372036854775807L;
        var30_24 = -9223372036854775807L;
        var74_25 = "";
        var61_26 /* !! */  = null;
        var59_27 /* !! */  = null;
        var60_28 = null;
        var67_29 /* !! */  = null;
        var63_30 /* !! */  = null;
        var18_31 = -1L;
        var52_32 = false;
        var56_33 = false;
        var9_34 = 0;
        var53_35 = false;
        var10_36 = 0;
        var70_37 = null;
        var6_38 = 0;
        var64_39 /* !! */  = null;
        var26_40 = -1L;
        var11_41 = false;
        var40_42 = var32_22;
        var38_43 = var30_24;
        var62_44 = "";
        var8_45 = 1;
        var54_46 = false;
        var28_47 = var20_17;
        block22: while (true) {
            block110: {
                block123: {
                    block129: {
                        block128: {
                            block127: {
                                block126: {
                                    block124: {
                                        block122: {
                                            block121: {
                                                block120: {
                                                    block119: {
                                                        block118: {
                                                            block116: {
                                                                block109: {
                                                                    block117: {
                                                                        block115: {
                                                                            block114: {
                                                                                block113: {
                                                                                    var36_52 = var28_47;
                                                                                    if (!var2_2.a()) break;
                                                                                    var83_64 = var2_2.b();
                                                                                    if (var83_64.startsWith("#EXT")) {
                                                                                        var76_12.add((String)var83_64);
                                                                                    }
                                                                                    if (var83_64.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                                                                                        var65_59 = ax.d1.k.B((String)var83_64, ax.d1.k.t, var84_7);
                                                                                        if ("VOD".equals(var65_59)) {
                                                                                            var9_34 = 1;
                                                                                            var28_47 = var36_52;
                                                                                            continue;
                                                                                        }
                                                                                        var28_47 = var36_52;
                                                                                        if (!"EVENT".equals(var65_59)) continue;
                                                                                        var9_34 = 2;
                                                                                        var28_47 = var36_52;
                                                                                        continue;
                                                                                    }
                                                                                    if (var83_64.equals("#EXT-X-I-FRAMES-ONLY")) {
                                                                                        var11_41 = true;
                                                                                        var28_47 = var36_52;
                                                                                        continue;
                                                                                    }
                                                                                    if (var83_64.startsWith("#EXT-X-START")) {
                                                                                        var42_23 = (long)(ax.d1.k.l((String)var83_64, ax.d1.k.F) * 1000000.0);
                                                                                        var56_33 = ax.d1.k.s((String)var83_64, ax.d1.k.b0, false);
lbl65:
                                                                                        // 3 sources

                                                                                        while (true) {
                                                                                            var28_47 = var36_52;
                                                                                            continue block22;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!var83_64.startsWith("#EXT-X-SERVER-CONTROL")) break block113;
                                                                                    var71_14 = ax.d1.k.A((String)var83_64);
                                                                                    ** GOTO lbl65
                                                                                }
                                                                                if (var83_64.startsWith("#EXT-X-PART-INF")) {
                                                                                    var38_43 = (long)(ax.d1.k.l((String)var83_64, ax.d1.k.r) * 1000000.0);
                                                                                    ** continue;
                                                                                }
                                                                                if (var83_64.startsWith("#EXT-X-MAP")) {
                                                                                    var65_59 = ax.d1.k.B((String)var83_64, ax.d1.k.N, var84_7);
                                                                                    var66_60 = ax.d1.k.x((String)var83_64, ax.d1.k.H, var84_7);
                                                                                    var28_47 = var16_16;
                                                                                    var44_53 = var18_31;
                                                                                    if (var66_60 != null) {
                                                                                        var66_60 = ax.S0.d0.x1((String)var66_60, "@");
                                                                                        var18_31 = Long.parseLong(var66_60[0]);
                                                                                        var28_47 = var16_16;
                                                                                        var44_53 = var18_31;
                                                                                        if (((String[])var66_60).length > 1) {
                                                                                            var28_47 = Long.parseLong(var66_60[1]);
                                                                                            var44_53 = var18_31;
                                                                                        }
                                                                                    }
                                                                                    var18_31 = (var7_49 = (int)(var44_53 == var26_40 ? 0 : (var44_53 < var26_40 ? -1 : 1))) == 0 ? var20_17 : var28_47;
                                                                                    if (var64_39 /* !! */  != null && var63_30 /* !! */  == null) {
                                                                                        throw ax.P0.E.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                                                                                    }
                                                                                    var70_37 = new f.f((String)var65_59, var18_31, var44_53, (String)var64_39 /* !! */ , (String)var63_30 /* !! */ );
                                                                                    var16_16 = var18_31;
                                                                                    if (var7_49 != 0) {
                                                                                        var16_16 = var18_31 + var44_53;
                                                                                    }
                                                                                    var18_31 = var26_40;
                                                                                    var28_47 = var36_52;
                                                                                    continue;
                                                                                }
                                                                                var66_60 = var63_30 /* !! */ ;
                                                                                var65_59 = var64_39 /* !! */ ;
                                                                                if (var83_64.startsWith("#EXT-X-TARGETDURATION")) {
                                                                                    var30_24 = (long)ax.d1.k.o((String)var83_64, ax.d1.k.o) * 1000000L;
lbl102:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        var65_59 = var60_28;
lbl104:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var65_59 = var60_28;
                                                                                            var66_60 = var62_44;
                                                                                            var65_59 = var59_27 /* !! */ ;
                                                                                            var80_61 /* !! */  = var61_26 /* !! */ ;
lbl109:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var61_26 /* !! */  = var80_61 /* !! */ ;
                                                                                                var59_27 /* !! */  = var65_59;
                                                                                                var62_44 = var66_60;
                                                                                                var28_47 = var36_52;
                                                                                                continue block22;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var83_64.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                                                                    var14_20 = ax.d1.k.p((String)var83_64, ax.d1.k.A);
                                                                                    var65_59 = var60_28;
                                                                                    var40_42 = var14_20;
                                                                                    ** continue;
                                                                                }
                                                                                if (!var83_64.startsWith("#EXT-X-VERSION")) break block114;
                                                                                var8_45 = ax.d1.k.o((String)var83_64, ax.d1.k.s);
                                                                                ** GOTO lbl102
                                                                            }
                                                                            if (!var83_64.startsWith("#EXT-X-DEFINE")) break block115;
                                                                            var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.d0, var84_7);
                                                                            if (var65_59 != null) {
                                                                                var66_60 = var77_4 /* !! */ .l.get(var65_59);
                                                                                if (var66_60 != null) {
                                                                                    var84_7.put((String)var65_59, (String)var66_60);
                                                                                }
                                                                            } else {
                                                                                var84_7.put(ax.d1.k.B((String)var83_64, ax.d1.k.S, var84_7), ax.d1.k.B((String)var83_64, ax.d1.k.c0, var84_7));
                                                                            }
                                                                            var65_59 = var69_8;
                                                                            var65_59 = var68_9;
                                                                            var65_59 = var62_44;
                                                                            var65_59 = var61_26 /* !! */ ;
                                                                            var26_40 = var14_20;
                                                                            break block110;
                                                                        }
                                                                        if (var83_64.startsWith("#EXTINF")) {
                                                                            var22_21 = ax.d1.k.C((String)var83_64, ax.d1.k.B);
                                                                            var74_25 = ax.d1.k.w((String)var83_64, ax.d1.k.C, (String)var62_44, var84_7);
                                                                            ** continue;
                                                                        }
                                                                        var77_4 /* !! */  = var62_44;
                                                                        if (var83_64.startsWith("#EXT-X-SKIP")) {
                                                                            var7_49 = ax.d1.k.o((String)var83_64, ax.d1.k.w);
                                                                            var57_57 = var75_5 /* !! */  != null && var68_9.isEmpty() != false;
                                                                            ax.S0.a.g(var57_57);
                                                                            if (var12_50 >= 0 && (var7_49 += var12_50) <= var75_5 /* !! */ .r.size()) {
                                                                                var63_30 /* !! */  = var66_60;
                                                                                var64_39 /* !! */  = var65_59;
                                                                                var28_47 = var36_52;
                                                                                for (var12_50 = (int)(var40_42 - ax.S0.d0.i(var75_5 /* !! */ ).k); var12_50 < var7_49; ++var12_50) {
                                                                                    var62_44 = var75_5 /* !! */ .r.get(var12_50);
                                                                                    var59_27 /* !! */  = var62_44;
                                                                                    if (var40_42 != var75_5 /* !! */ .k) {
                                                                                        var59_27 /* !! */  = var62_44.h(var28_47, var75_5 /* !! */ .j - var10_36 + var62_44.e0);
                                                                                    }
                                                                                    var68_9.add((f.f)var59_27 /* !! */ );
                                                                                    var34_19 = var28_47 + var59_27 /* !! */ .d0;
                                                                                    var28_47 = var59_27 /* !! */ .k0;
                                                                                    if (var28_47 != var26_40) {
                                                                                        var16_16 = var59_27 /* !! */ .j0 + var28_47;
                                                                                    }
                                                                                    var6_38 = var59_27 /* !! */ .e0;
                                                                                    var70_37 = var59_27 /* !! */ .c0;
                                                                                    var62_44 = var59_27 /* !! */ .g0;
                                                                                    var64_39 /* !! */  = var59_27 /* !! */ .h0;
                                                                                    var65_59 = var59_27 /* !! */ .i0;
                                                                                    if (var65_59 == null || !var65_59.equals(Long.toHexString(var14_20))) {
                                                                                        var63_30 /* !! */  = var59_27 /* !! */ .i0;
                                                                                    }
                                                                                    ++var14_20;
                                                                                    var75_5 /* !! */  = var1_1 /* !! */ ;
                                                                                    var59_27 /* !! */  = var62_44;
                                                                                    var28_47 = var34_19;
                                                                                }
lbl177:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var75_5 /* !! */  = var1_1 /* !! */ ;
                                                                                    var65_59 = var0;
                                                                                    var62_44 = var77_4 /* !! */ ;
                                                                                    var77_4 /* !! */  = var65_59;
                                                                                    continue block22;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            throw new a();
                                                                        }
                                                                        if (!var83_64.startsWith("#EXT-X-KEY")) break block116;
                                                                        var66_60 = ax.d1.k.B((String)var83_64, ax.d1.k.K, var84_7);
                                                                        var65_59 = ax.d1.k.w((String)var83_64, ax.d1.k.L, "identity", var84_7);
                                                                        if (!"NONE".equals(var66_60)) break block117;
                                                                        var79_15.clear();
                                                                        var59_27 /* !! */  = null;
                                                                        var64_39 /* !! */  = null;
                                                                        var62_44 = var64_39 /* !! */ ;
                                                                        var63_30 /* !! */  = var61_26 /* !! */ ;
                                                                        var61_26 /* !! */  = var64_39 /* !! */ ;
                                                                        break block109;
                                                                    }
                                                                    var64_39 /* !! */  = ax.d1.k.x((String)var83_64, ax.d1.k.O, var84_7);
                                                                    if (!"identity".equals(var65_59)) ** GOTO lbl210
                                                                    var62_44 = var61_26 /* !! */ ;
                                                                    if ("AES-128".equals(var66_60)) {
                                                                        var62_44 = ax.d1.k.B((String)var83_64, ax.d1.k.N, var84_7);
                                                                        var63_30 /* !! */  = var61_26 /* !! */ ;
                                                                        var61_26 /* !! */  = var64_39 /* !! */ ;
                                                                    } else {
                                                                        while (true) {
                                                                            var61_26 /* !! */  = var64_39 /* !! */ ;
                                                                            var64_39 /* !! */  = null;
                                                                            var63_30 /* !! */  = var62_44;
                                                                            var62_44 = var64_39 /* !! */ ;
                                                                            break block109;
                                                                            break;
                                                                        }
lbl210:
                                                                        // 1 sources

                                                                        var63_30 /* !! */  = var61_26 /* !! */ ;
                                                                        if (var61_26 /* !! */  == null) {
                                                                            var63_30 /* !! */  = ax.d1.k.n((String)var66_60);
                                                                        }
                                                                        var61_26 /* !! */  = ax.d1.k.m((String)var83_64, (String)var65_59, var84_7);
                                                                        var62_44 = var63_30 /* !! */ ;
                                                                        if (var61_26 /* !! */  == null) ** continue;
                                                                        var79_15.put((String[])var65_59, var61_26 /* !! */ );
                                                                        var61_26 /* !! */  = var64_39 /* !! */ ;
                                                                        var59_27 /* !! */  = null;
                                                                        var62_44 = null;
                                                                    }
                                                                }
                                                                var64_39 /* !! */  = var61_26 /* !! */ ;
                                                                var28_47 = var16_16;
                                                                var61_26 /* !! */  = var59_27 /* !! */ ;
lbl225:
                                                                // 2 sources

                                                                while (true) {
                                                                    var59_27 /* !! */  = var64_39 /* !! */ ;
                                                                    var16_16 = var28_47;
lbl228:
                                                                    // 5 sources

                                                                    while (true) {
                                                                        var64_39 /* !! */  = var60_28;
                                                                        var75_5 /* !! */  = var1_1 /* !! */ ;
                                                                        var64_39 /* !! */  = var0;
                                                                        var66_60 = var77_4 /* !! */ ;
                                                                        var77_4 /* !! */  = var64_39 /* !! */ ;
                                                                        var80_61 /* !! */  = var63_30 /* !! */ ;
                                                                        var65_59 = var61_26 /* !! */ ;
                                                                        var63_30 /* !! */  = var59_27 /* !! */ ;
                                                                        var64_39 /* !! */  = var62_44;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            if (var83_64.startsWith("#EXT-X-BYTERANGE")) {
                                                                var62_44 = ax.S0.d0.x1(ax.d1.k.B((String)var83_64, ax.d1.k.G, var84_7), "@");
                                                                var44_53 = Long.parseLong(var62_44[0]);
                                                                var28_47 = var16_16;
                                                                var18_31 = var44_53;
                                                                var16_16 = var24_18;
                                                                var7_49 = var6_38;
                                                                if (((String[])var62_44).length > 1) {
                                                                    var28_47 = Long.parseLong(var62_44[1]);
                                                                    var7_49 = var6_38;
                                                                    var16_16 = var24_18;
                                                                    var18_31 = var44_53;
                                                                }
lbl252:
                                                                // 5 sources

                                                                while (true) {
                                                                    var64_39 /* !! */  = var66_60;
                                                                    var62_44 = var65_59;
                                                                    var63_30 /* !! */  = var61_26 /* !! */ ;
                                                                    var61_26 /* !! */  = var59_27 /* !! */ ;
                                                                    var24_18 = var16_16;
                                                                    var6_38 = var7_49;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            if (!var83_64.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) break block118;
                                                            var10_36 = Integer.parseInt(var83_64.substring(var83_64.indexOf(58) + 1));
                                                            var62_44 = var65_59;
                                                            var53_35 = true;
                                                            var63_30 /* !! */  = var61_26 /* !! */ ;
                                                            var61_26 /* !! */  = var59_27 /* !! */ ;
                                                            var59_27 /* !! */  = var66_60;
                                                            ** GOTO lbl228
                                                        }
                                                        if (!var83_64.equals("#EXT-X-DISCONTINUITY")) break block119;
                                                        var7_49 = var6_38 + 1;
                                                        var28_47 = var16_16;
                                                        var16_16 = var24_18;
                                                        ** GOTO lbl252
                                                    }
                                                    if (var83_64.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                        if (var24_18 == var20_17) {
                                                            var24_18 = ax.S0.d0.a1(ax.S0.d0.i1(var83_64.substring(var83_64.indexOf(58) + 1))) - var36_52;
                                                            var28_47 = var16_16;
                                                            var16_16 = var24_18;
                                                            var7_49 = var6_38;
                                                            ** continue;
                                                        }
lbl282:
                                                        // 3 sources

                                                        while (true) {
                                                            var65_59 = var62_44;
                                                            var65_59 = var69_8;
                                                            var65_59 = var68_9;
                                                            var26_40 = var14_20;
                                                            var65_59 = var61_26 /* !! */ ;
lbl288:
                                                            // 2 sources

                                                            while (true) {
                                                                var65_59 = var62_44;
                                                                var26_40 = var14_20;
                                                                var65_59 = var64_39 /* !! */ ;
                                                                var65_59 = var61_26 /* !! */ ;
                                                                var65_59 = var63_30 /* !! */ ;
                                                                var65_59 = var69_8;
                                                                var65_59 = var68_9;
                                                                break block110;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (!var83_64.equals("#EXT-X-GAP")) break block120;
                                                    var62_44 = var65_59;
                                                    var52_32 = true;
                                                    var63_30 /* !! */  = var61_26 /* !! */ ;
                                                    var61_26 /* !! */  = var59_27 /* !! */ ;
                                                    var59_27 /* !! */  = var66_60;
                                                    ** GOTO lbl228
                                                }
                                                if (!var83_64.equals("#EXT-X-INDEPENDENT-SEGMENTS")) break block121;
                                                var62_44 = var65_59;
                                                var55_6 = true;
                                                var63_30 /* !! */  = var61_26 /* !! */ ;
                                                var61_26 /* !! */  = var59_27 /* !! */ ;
                                                var59_27 /* !! */  = var66_60;
                                                ** GOTO lbl228
                                            }
                                            if (var83_64.equals("#EXT-X-ENDLIST")) {
                                                var62_44 = var65_59;
                                                var54_46 = true;
                                                var63_30 /* !! */  = var61_26 /* !! */ ;
                                                var61_26 /* !! */  = var59_27 /* !! */ ;
                                                var59_27 /* !! */  = var66_60;
                                                ** continue;
                                            }
                                            if (var83_64.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                var26_40 = ax.d1.k.v((String)var83_64, ax.d1.k.D, var26_40);
                                                var7_49 = ax.d1.k.u((String)var83_64, ax.d1.k.E, -1);
                                                var78_11.add(new f.e(Uri.parse((String)ax.S0.O.c(var3_3, ax.d1.k.B((String)var83_64, ax.d1.k.N, var84_7))), var26_40, var7_49));
                                                while (true) {
                                                    var65_59 = var62_44;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            if (!var83_64.startsWith("#EXT-X-PRELOAD-HINT")) break block122;
                                            if (var60_28 != null || !"PART".equals(ax.d1.k.B((String)var83_64, ax.d1.k.Q, var84_7))) ** continue;
                                            var63_30 /* !! */  = ax.d1.k.B((String)var83_64, ax.d1.k.N, var84_7);
                                            var26_40 = ax.d1.k.v((String)var83_64, ax.d1.k.I, -1L);
                                            var28_47 = ax.d1.k.v((String)var83_64, ax.d1.k.J, -1L);
                                            var64_39 /* !! */  = ax.d1.k.e(var14_20, (String)var65_59, (String)var66_60);
                                            if (var59_27 /* !! */  == null && !var79_15.isEmpty()) {
                                                var75_5 /* !! */  = var79_15.values().toArray(new o.b[0]);
                                                var59_27 /* !! */  = new o((String)var61_26 /* !! */ , var75_5 /* !! */ );
                                                var62_44 = var67_29 /* !! */ ;
                                                if (var67_29 /* !! */  == null) {
                                                    var62_44 = ax.d1.k.d((String)var61_26 /* !! */ , var75_5 /* !! */ );
                                                }
                                                var67_29 /* !! */  = var62_44;
                                            }
                                            var7_49 = (cfr_temp_0 = var26_40 - -1L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                            if (var7_49 == 0 || var28_47 != -1L) {
                                                if (var7_49 == 0) {
                                                    var26_40 = var20_17;
                                                }
                                                var60_28 = new f.d((String)var63_30 /* !! */ , var70_37, 0L, var6_38, var34_19, (o)var59_27 /* !! */ , (String)var65_59, (String)var64_39 /* !! */ , var26_40, var28_47, false, false, true);
                                            }
                                            var63_30 /* !! */  = var66_60;
                                            var64_39 /* !! */  = var65_59;
                                            var26_40 = -1L;
                                            var28_47 = var36_52;
                                            ** GOTO lbl177
                                        }
                                        if (var83_64.startsWith("#EXT-X-PART")) {
                                            var64_39 /* !! */  = ax.d1.k.e(var14_20, (String)var65_59, (String)var66_60);
                                            var63_30 /* !! */  = ax.d1.k.B((String)var83_64, ax.d1.k.N, var84_7);
                                            var28_47 = (long)(ax.d1.k.l((String)var83_64, ax.d1.k.p) * 1000000.0);
                                            var58_58 = ax.d1.k.s((String)var83_64, ax.d1.k.Z, false);
                                            var7_49 = var55_6 != false && var73_10 /* !! */ .isEmpty() != false ? 1 : 0;
                                            var57_57 = ax.d1.k.s((String)var83_64, ax.d1.k.a0, false);
                                            var62_44 = ax.d1.k.x((String)var83_64, ax.d1.k.H, var84_7);
                                            if (var62_44 != null) {
                                                var62_44 = ax.S0.d0.x1((String)var62_44, "@");
                                                var44_53 = Long.parseLong((String)var62_44[0]);
                                                if (((Object)var62_44).length > 1) {
                                                    var32_22 = Long.parseLong((String)var62_44[1]);
                                                }
                                            } else {
                                                var44_53 = -1L;
                                            }
                                            var12_50 = (cfr_temp_1 = var44_53 - -1L) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                            var26_40 = var12_50 == 0 ? var20_17 : var32_22;
                                            if (var59_27 /* !! */  == null && !var79_15.isEmpty()) {
                                                var75_5 /* !! */  = var79_15.values().toArray(new o.b[0]);
                                                var62_44 = new o((String)var61_26 /* !! */ , var75_5 /* !! */ );
                                                var59_27 /* !! */  = var67_29 /* !! */ ;
                                                if (var67_29 /* !! */  == null) {
                                                    var59_27 /* !! */  = ax.d1.k.d((String)var61_26 /* !! */ , var75_5 /* !! */ );
                                                }
                                                var67_29 /* !! */  = var59_27 /* !! */ ;
                                                var59_27 /* !! */  = var62_44;
                                            }
                                            var73_10 /* !! */ .add(new f.d((String)var63_30 /* !! */ , var70_37, var28_47, var6_38, var34_19, (o)var59_27 /* !! */ , (String)var65_59, (String)var64_39 /* !! */ , var26_40, var44_53, var57_57, (boolean)(var58_58 | var7_49), false));
                                            var34_19 += var28_47;
                                            var28_47 = var26_40;
                                            if (var12_50 != 0) {
                                                var28_47 = var26_40 + var44_53;
                                            }
                                            var32_22 = var28_47;
                                            var63_30 /* !! */  = var66_60;
                                            var64_39 /* !! */  = var65_59;
                                            var26_40 = -1L;
                                            var28_47 = var36_52;
                                            ** continue;
                                        }
                                        if (!var83_64.startsWith("#EXT-X-DATERANGE") || !ax.d1.k.w((String)var83_64, ax.d1.k.f0, (String)var77_4 /* !! */ , var84_7).equals("com.apple.hls.interstitial")) break block123;
                                        var85_65 = ax.d1.k.B((String)var83_64, ax.d1.k.e0, var84_7);
                                        var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.l0, var84_7);
                                        var75_5 /* !! */  = var65_59 != null ? Uri.parse((String)var65_59) : null;
                                        var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.m0, var84_7);
                                        var77_4 /* !! */  = var65_59 != null ? Uri.parse((String)var65_59) : null;
                                        var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.g0, var84_7);
                                        var26_40 = var65_59 != null ? ax.S0.d0.a1(ax.S0.d0.i1((String)var65_59)) : -9223372036854775807L;
                                        var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.i0, var84_7);
                                        var28_47 = var65_59 != null ? ax.S0.d0.a1(ax.S0.d0.i1((String)var65_59)) : -9223372036854775807L;
                                        var86_66 = new ArrayList<String>();
                                        var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.h0, var84_7);
                                        if (var65_59 == null) break block124;
                                        var66_60 = ax.S0.d0.x1((String)var65_59, ",");
                                        var12_50 = ((String[])var66_60).length;
                                        block36: for (var13_51 = 0; var13_51 < var12_50; ++var13_51) {
                                            block111: {
                                                block125: {
                                                    var65_59 = var66_60[var13_51].trim();
                                                    var65_59.getClass();
                                                    switch (var65_59.hashCode()) {
                                                        default: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                var7_49 = -1;
                                                                break block111;
                                                                break;
                                                            }
                                                        }
                                                        case 2461856: {
                                                            if (!var65_59.equals("POST")) break;
                                                            var7_49 = 2;
                                                            break block111;
                                                        }
                                                        case 2430593: {
                                                            if (!var65_59.equals("ONCE")) break;
                                                            var7_49 = 1;
                                                            break block111;
                                                        }
                                                        case 79491: {
                                                            if (var65_59.equals("PRE")) break block125;
                                                        }
                                                    }
                                                    ** continue;
                                                }
                                                var7_49 = 0;
                                            }
                                            switch (var7_49) {
                                                default: {
                                                    continue block36;
                                                }
                                                case 0: 
                                                case 1: 
                                                case 2: {
                                                    var86_66.add((String)var65_59);
                                                    continue block36;
                                                }
                                            }
                                        }
                                    }
                                    var44_53 = (var4_48 = ax.d1.k.t((String)var83_64, ax.d1.k.q, -1.0)) >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var4_48 = ax.d1.k.t((String)var83_64, ax.d1.k.j0, -1.0);
                                    var46_54 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var57_57 = ax.d1.k.s((String)var83_64, ax.d1.k.k0, false);
                                    var4_48 = ax.d1.k.t((String)var83_64, ax.d1.k.n0, 4.9E-324);
                                    var48_55 = var4_48 != 4.9E-324 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var4_48 = ax.d1.k.t((String)var83_64, ax.d1.k.o0, -1.0);
                                    var50_56 = var4_48 >= 0.0 ? (long)(var4_48 * 1000000.0) : -9223372036854775807L;
                                    var81_62 = new ArrayList<String>();
                                    var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.p0, var84_7);
                                    if (var65_59 != null) {
                                        var66_60 = ax.S0.d0.x1((String)var65_59, ",");
                                        var7_49 = ((String[])var66_60).length;
                                        for (var12_50 = 0; var12_50 < var7_49; ++var12_50) {
                                            var65_59 = var66_60[var12_50].trim();
                                            var65_59.getClass();
                                            if (!var65_59.equals("IN") && !var65_59.equals("OUT")) continue;
                                            var81_62.add((String)var65_59);
                                        }
                                    }
                                    var82_63 = new ArrayList<String>();
                                    var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.q0, var84_7);
                                    if (var65_59 != null) {
                                        var65_59 = ax.S0.d0.x1((String)var65_59, ",");
                                        var7_49 = ((Object)var65_59).length;
                                        for (var12_50 = 0; var12_50 < var7_49; ++var12_50) {
                                            var66_60 = var65_59[var12_50].trim();
                                            var66_60.getClass();
                                            if (!var66_60.equals("JUMP") && !var66_60.equals("SKIP")) continue;
                                            var82_63.add((String)var66_60);
                                        }
                                    }
                                    var80_61 /* !! */  = (var65_59 = ax.d1.k.x((String)var83_64, ax.d1.k.r0, var84_7)) != null ? Boolean.valueOf(var65_59.equals("NO") ^ true) : null;
                                    var66_60 = ax.d1.k.x((String)var83_64, ax.d1.k.s0, var84_7);
                                    if (var66_60 == null) break block126;
                                    var65_59 = "RANGE";
                                    if (var66_60.equals("RANGE")) break block127;
                                    var65_59 = "POINT";
                                    if (var66_60.equals("POINT")) break block127;
                                }
                                var65_59 = null;
                            }
                            var87_67 = ax.d1.k.x((String)var83_64, ax.d1.k.t0, var84_7);
                            if (var87_67 == null) break block128;
                            var66_60 = "PRIMARY";
                            if (var87_67.equals("PRIMARY")) break block129;
                            var66_60 = "HIGHLIGHT";
                            if (var87_67.equals("HIGHLIGHT")) break block129;
                        }
                        var66_60 = null;
                    }
                    var87_67 = new ArrayList<E>();
                    var88_68 = var83_64.substring(17);
                    var83_64 = ax.d1.k.v0.matcher(var88_68);
                    while (var83_64.find()) {
                        block112: {
                            block130: {
                                var89_69 = var83_64.group();
                                var89_69.getClass();
                                switch (var89_69.hashCode()) {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var7_49 = -1;
                                            break block112;
                                            break;
                                        }
                                    }
                                    case 1814205923: {
                                        if (!var89_69.equals("X-ASSET-URI=")) break;
                                        var7_49 = 8;
                                        break block112;
                                    }
                                    case 1748487807: {
                                        if (!var89_69.equals("X-RESUME-OFFSET=")) break;
                                        var7_49 = 7;
                                        break block112;
                                    }
                                    case 1472528844: {
                                        if (!var89_69.equals("X-RESTRICT=")) break;
                                        var7_49 = 6;
                                        break block112;
                                    }
                                    case 850193465: {
                                        if (!var89_69.equals("X-TIMELINE-OCCUPIES=")) break;
                                        var7_49 = 5;
                                        break block112;
                                    }
                                    case 397239341: {
                                        if (!var89_69.equals("X-ASSET-LIST=")) break;
                                        var7_49 = 4;
                                        break block112;
                                    }
                                    case -36345757: {
                                        if (!var89_69.equals("X-TIMELINE-STYLE=")) break;
                                        var7_49 = 3;
                                        break block112;
                                    }
                                    case -148960310: {
                                        if (!var89_69.equals("X-PLAYOUT-LIMIT=")) break;
                                        var7_49 = 2;
                                        break block112;
                                    }
                                    case -1843050726: {
                                        if (!var89_69.equals("X-CONTENT-MAY-VARY=")) break;
                                        var7_49 = 1;
                                        break block112;
                                    }
                                    case -2136701954: {
                                        if (var89_69.equals("X-SNAP=")) break block130;
                                    }
                                }
                                ** continue;
                            }
                            var7_49 = 0;
                        }
                        switch (var7_49) {
                            default: {
                                var87_67.add(ax.d1.k.k(var88_68, var89_69.substring(0, var89_69.length() - 1), var84_7));
                            }
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                        }
                    }
                    var83_64 = var72_13.containsKey(var85_65) != false ? (f.c.a)var72_13.get(var85_65) : new f.c.a(var85_65);
                    var72_13.put(var85_65, var83_64.c((Uri)var75_5 /* !! */ ).b(var77_4 /* !! */ ).o(var26_40).h(var28_47).g(var44_53).j(var46_54).f(var86_66).i(var57_57).m(var48_55).k(var50_56).n(var81_62).l(var82_63).d((List<f.b>)var87_67).e((Boolean)var80_61 /* !! */ ).p((String)var65_59).q((String)var66_60));
                    while (true) {
                        var65_59 = var62_44;
                        var26_40 = var14_20;
                        var65_59 = var64_39 /* !! */ ;
                        var65_59 = var68_9;
                        var65_59 = var61_26 /* !! */ ;
                        var65_59 = var69_8;
                        var65_59 = var63_30 /* !! */ ;
                        ** continue;
                        break;
                    }
                }
                if (var57_57 = var83_64.startsWith("#")) ** continue;
                var64_39 /* !! */  = ax.d1.k.e(var14_20, (String)var65_59, (String)var66_60);
                ++var14_20;
                var75_5 /* !! */  = ax.d1.k.D((String)var83_64, var84_7);
                var62_44 = (f.f)var69_8.get(var75_5 /* !! */ );
                cfr_temp_2 = var18_31 - -1L;
                var7_49 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                if (var7_49 == 0) {
                    var16_16 = var20_17;
                } else if (var11_41 && var70_37 == null && var62_44 == null) {
                    var62_44 = new f.f((String)var75_5 /* !! */ , 0L, var16_16, null, null);
                    var69_8.put(var75_5 /* !! */ , var62_44);
                }
                if (var59_27 /* !! */  == null && !var79_15.isEmpty()) {
                    var63_30 /* !! */  = var79_15.values().toArray(new o.b[0]);
                    var59_27 /* !! */  = new o((String)var61_26 /* !! */ , (o.b[])var63_30 /* !! */ );
                    var63_30 /* !! */  = var67_29 /* !! */  == null ? ax.d1.k.d((String)var61_26 /* !! */ , (o.b[])var63_30 /* !! */ ) : var67_29 /* !! */ ;
                } else {
                    var63_30 /* !! */  = var67_29 /* !! */ ;
                }
                if (var70_37 != null) {
                    var62_44 = var70_37;
                }
                var68_9.add(new f.f((String)var75_5 /* !! */ , (f.f)var62_44, (String)var74_25, var22_21, var6_38, var36_52, (o)var59_27 /* !! */ , (String)var65_59, (String)var64_39 /* !! */ , var16_16, var18_31, var52_32, var73_10 /* !! */ ));
                var34_19 = var36_52 + var22_21;
                var73_10 /* !! */  = new ArrayList<E>();
                if (var7_49 != 0) {
                    var16_16 += var18_31;
                }
                var22_21 = var20_17;
                var28_47 = var34_19;
                var74_25 = var62_44 = var77_4 /* !! */ ;
                var18_31 = -1L;
                var52_32 = false;
                var26_40 = -1L;
                var77_4 /* !! */  = var0;
                var64_39 /* !! */  = var65_59;
                var75_5 /* !! */  = var1_1 /* !! */ ;
                var67_29 /* !! */  = var63_30 /* !! */ ;
                var63_30 /* !! */  = var66_60;
                continue;
            }
            var28_47 = var36_52;
            var26_40 = -1L;
            var77_4 /* !! */  = var0;
            var75_5 /* !! */  = var1_1 /* !! */ ;
        }
        var0 = var78_11;
        var2_2 = new HashMap<K, V>();
        for (var6_38 = 0; var6_38 < var0.size(); ++var6_38) {
            var59_27 /* !! */  = (f.e)var0.get(var6_38);
            var14_20 = var16_16 = var59_27 /* !! */ .b;
            if (var16_16 == -1L) {
                var14_20 = var40_42 + (long)var68_9.size() - (long)var73_10 /* !! */ .isEmpty();
            }
            if ((var7_49 = var59_27 /* !! */ .c) == -1 && var38_43 != -9223372036854775807L) {
                var1_1 /* !! */  = var73_10 /* !! */ .isEmpty() != false ? ((f.f)ax.r7.F.e(var68_9)).n0 : var73_10 /* !! */ ;
                var7_49 = var1_1 /* !! */ .size() - 1;
            }
            var1_1 /* !! */  = var59_27 /* !! */ .a;
            var2_2.put(var1_1 /* !! */ , new f.e((Uri)var1_1 /* !! */ , var14_20, var7_49));
        }
        if (var60_28 != null) {
            var73_10 /* !! */ .add(var60_28);
        }
        var0 = new ArrayList<f.c>();
        var1_1 /* !! */  = var72_13.values().iterator();
        while (var1_1 /* !! */ .hasNext()) {
            var59_27 /* !! */  = ((f.c.a)var1_1 /* !! */ .next()).a();
            if (var59_27 /* !! */  == null) continue;
            var0.add((f.c)var59_27 /* !! */ );
        }
        var52_32 = var24_18 != var20_17;
        return new f(var9_34, var3_3, (List<String>)var76_12, var42_23, var56_33, var24_18, var53_35, var10_36, var40_42, var8_45, var30_24, var38_43, var55_6, var54_46, var52_32, (o)var67_29 /* !! */ , (List<f.f>)var68_9, (List<f.d>)var73_10 /* !! */ , var71_14, (Map<Uri, f.e>)var2_2, (List<f.c>)var0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static i r(b var0, String var1_1) throws IOException {
        var26_2 = new HashMap<K, V>();
        var23_3 = new HashMap<String, String>();
        var25_4 = new ArrayList<i.b>();
        var15_5 = new ArrayList<E>();
        var14_6 = new ArrayList<E>();
        var13_7 = new ArrayList<E>();
        var24_8 = new ArrayList<i.a>();
        var12_9 = new ArrayList<String>();
        var19_10 = new ArrayList<o>();
        var18_11 = new ArrayList<String>();
        var10_12 = false;
        var4_13 = 0;
        while (var0.a()) {
            block58: {
                block57: {
                    block56: {
                        block55: {
                            block54: {
                                var27_27 = var0.b();
                                if (var27_27.startsWith("#EXT")) {
                                    var18_11.add(var27_27);
                                }
                                var11_21 = var27_27.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                                if (var27_27.startsWith("#EXT-X-DEFINE")) {
                                    var23_3.put(ax.d1.k.B(var27_27, ax.d1.k.S, var23_3), ax.d1.k.B(var27_27, ax.d1.k.c0, var23_3));
                                    continue;
                                }
                                if (var27_27.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    var10_12 = true;
                                    continue;
                                }
                                if (var27_27.startsWith("#EXT-X-MEDIA")) {
                                    var12_9.add((v)var27_27);
                                    continue;
                                }
                                if (var27_27.startsWith("#EXT-X-SESSION-KEY")) {
                                    var16_22 /* !! */  = ax.d1.k.m(var27_27, ax.d1.k.w(var27_27, ax.d1.k.L, "identity", var23_3), var23_3);
                                    if (var16_22 /* !! */  == null) continue;
                                    var19_10.add(new o(ax.d1.k.n(ax.d1.k.B(var27_27, ax.d1.k.K, var23_3)), new o.b[]{var16_22 /* !! */ }));
                                    continue;
                                }
                                if (!var27_27.startsWith("#EXT-X-STREAM-INF") && !var11_21) continue;
                                var6_17 = var4_13 | var27_27.contains("CLOSED-CAPTIONS=NONE");
                                var3_15 = var11_21 != false ? 16384 : 0;
                                var8_19 = ax.d1.k.o(var27_27, ax.d1.k.h);
                                var9_20 = ax.d1.k.u(var27_27, ax.d1.k.c, -1);
                                var28_28 = ax.d1.k.x(var27_27, ax.d1.k.j, var23_3);
                                var21_25 = ax.d1.k.x(var27_27, ax.d1.k.k, var23_3);
                                var16_22 /* !! */  = ax.d1.k.x(var27_27, ax.d1.k.l, var23_3);
                                if (var16_22 /* !! */  == null) break block54;
                                var17_23 = ax.S0.d0.x1(ax.S0.d0.y1((String)var16_22 /* !! */ , ",")[0], "/");
                                var16_22 /* !! */  = var17_23[0];
                                if (((String[])var17_23).length <= 1) break block55;
                                var20_24 = var17_23[1];
                                break block56;
                            }
                            var16_22 /* !! */  = null;
                        }
                        var20_24 = null;
                    }
                    var22_26 = ax.S0.d0.S((String)var21_25, 2);
                    var17_23 = var21_25;
                    if (ax.d1.k.i(var28_28, (String)var22_26, (String)var16_22 /* !! */ , (String)var20_24)) {
                        if (var16_22 /* !! */  == null) {
                            var16_22 /* !! */  = var22_26;
                        }
                        var20_24 = ax.S0.d0.T((String)var21_25, 2);
                        var17_23 = var16_22 /* !! */ ;
                        if (var20_24 != null) {
                            var17_23 = new StringBuilder();
                            var17_23.append((String)var16_22 /* !! */ );
                            var17_23.append(",");
                            var17_23.append((String)var20_24);
                            var17_23 = var17_23.toString();
                        }
                    }
                    if ((var16_22 /* !! */  = ax.d1.k.x(var27_27, ax.d1.k.m, var23_3)) == null) break block57;
                    var16_22 /* !! */  = ax.S0.d0.x1((String)var16_22 /* !! */ , "x");
                    var4_13 = Integer.parseInt(var16_22 /* !! */ [0]);
                    var7_18 = Integer.parseInt(var16_22 /* !! */ [1]);
                    if (var4_13 <= 0) break block57;
                    var5_16 = var7_18;
                    if (var7_18 > 0) break block58;
                }
                var5_16 = -1;
                var4_13 = -1;
            }
            var2_14 = (var16_22 /* !! */  = ax.d1.k.x(var27_27, ax.d1.k.n, var23_3)) != null ? Float.parseFloat((String)var16_22 /* !! */ ) : -1.0f;
            var28_28 = ax.d1.k.x(var27_27, ax.d1.k.d, var23_3);
            var21_25 = ax.d1.k.x(var27_27, ax.d1.k.e, var23_3);
            var29_29 = ax.d1.k.x(var27_27, ax.d1.k.f, var23_3);
            var22_26 = ax.d1.k.x(var27_27, ax.d1.k.g, var23_3);
            if (var11_21) {
                var16_22 /* !! */  = ax.S0.O.d(var1_1, ax.d1.k.B(var27_27, ax.d1.k.N, var23_3));
            } else {
                if (!var0.a()) {
                    throw ax.P0.E.c("#EXT-X-STREAM-INF must be followed by another line", null);
                }
                var16_22 /* !! */  = ax.S0.O.d(var1_1, ax.d1.k.D(var0.b(), var23_3));
            }
            var25_4.add(new i.b(var16_22 /* !! */ , new v.b().i0(var25_4.size()).W("application/x-mpegURL").U((String)var17_23).S(var9_20).t0(var8_19).F0(var4_13).h0(var5_16).f0(var2_14).w0(var3_15).P(), var28_28, (String)var21_25, (String)var29_29, (String)var22_26));
            var17_23 = var20_24 = (ArrayList)var26_2.get(var16_22 /* !! */ );
            if (var20_24 == null) {
                var17_23 = new ArrayList<E>();
                var26_2.put(var16_22 /* !! */ , var17_23);
            }
            var17_23.add(new h.a(var9_20, var8_19, var28_28, (String)var21_25, (String)var29_29, (String)var22_26));
            var4_13 = var6_17;
        }
        var0 = var15_5;
        var22_26 = new ArrayList<i.b>();
        var15_5 = new HashSet<E>();
        for (var3_15 = 0; var3_15 < var25_4.size(); ++var3_15) {
            var16_22 /* !! */  = (i.b)var25_4.get(var3_15);
            if (!var15_5.add((Uri)var16_22 /* !! */ .a)) continue;
            var11_21 = var16_22 /* !! */ .b.l == null;
            ax.S0.a.g(var11_21);
            var17_23 = new C(new C.a[]{new h(null, null, ax.S0.a.e((ArrayList)var26_2.get(var16_22 /* !! */ .a)))});
            var22_26.add((i.b)var16_22 /* !! */ .a(var16_22 /* !! */ .b.b().r0((C)var17_23).P()));
        }
        var20_24 = null;
        var21_25 = null;
        var17_23 = var12_9;
        var15_5 = var14_6;
        var16_22 /* !! */  = var13_7;
        var13_7 = var21_25;
        var12_9 = var20_24;
        block20: for (var5_16 = 0; var5_16 < var17_23.size(); ++var5_16) {
            var21_25 = (String)var17_23.get(var5_16);
            var28_28 = ax.d1.k.B((String)var21_25, ax.d1.k.T, var23_3);
            var27_27 = ax.d1.k.B((String)var21_25, ax.d1.k.S, var23_3);
            var20_24 = new v.b();
            var14_6 = new StringBuilder();
            var14_6.append(var28_28);
            var14_6.append(":");
            var14_6.append(var27_27);
            var26_2 = var20_24.j0(var14_6.toString()).l0(var27_27).W("application/x-mpegURL").A0(ax.d1.k.z((String)var21_25)).w0(ax.d1.k.y((String)var21_25, var23_3)).n0(ax.d1.k.x((String)var21_25, ax.d1.k.R, var23_3));
            var14_6 = ax.d1.k.x((String)var21_25, ax.d1.k.N, var23_3);
            var20_24 = var14_6 == null ? null : ax.S0.O.d(var1_1, (String)var14_6);
            var29_29 = new C(new C.a[]{new h(var28_28, var27_27, Collections.EMPTY_LIST)});
            var14_6 = ax.d1.k.B((String)var21_25, ax.d1.k.P, var23_3);
            var14_6.getClass();
            tmp = -1;
            switch (var14_6.hashCode()) {
                case 81665115: {
                    if (!var14_6.equals("VIDEO")) break;
                    tmp = 1;
                    break;
                }
                case 62628790: {
                    if (!var14_6.equals("AUDIO")) break;
                    tmp = 2;
                    break;
                }
                case -333210994: {
                    if (!var14_6.equals("CLOSED-CAPTIONS")) break;
                    tmp = 3;
                    break;
                }
                case -959297733: {
                    if (!var14_6.equals("SUBTITLES")) break;
                    tmp = 4;
                    break;
                }
            }
            switch (tmp) {
                default: {
                    var3_15 = -1;
                    break;
                }
                case 1: {
                    var3_15 = 3;
                    break;
                }
                case 2: {
                    var3_15 = 2;
                    break;
                }
                case 3: {
                    var3_15 = 1;
                    break;
                }
                case 4: {
                    var3_15 = 0;
                }
            }
            switch (var3_15) {
                case 3: {
                    var14_6 = ax.d1.k.h(var25_4, var28_28);
                    if (var14_6 != null) {
                        var21_25 = var14_6.b;
                        var14_6 = ax.S0.d0.S(var21_25.k, 2);
                        var26_2.U((String)var14_6).y0(ax.P0.D.g((String)var14_6)).F0(var21_25.v).h0(var21_25.w).f0(var21_25.z);
                    }
                    if (var20_24 != null) {
                        var26_2.r0((C)var29_29);
                        var0.add(new i.a((Uri)var20_24, var26_2.P(), var28_28, var27_27));
                        ** break;
                    }
                    ** GOTO lbl222
                }
                case 2: {
                    var30_30 = ax.d1.k.f(var25_4, var28_28);
                    if (var30_30 != null) {
                        var14_6 = ax.S0.d0.S(var30_30.b.k, 1);
                        var26_2.U((String)var14_6);
                        var14_6 = ax.P0.D.g((String)var14_6);
                    } else {
                        var14_6 = null;
                    }
                    var31_31 = ax.d1.k.x((String)var21_25, ax.d1.k.i, var23_3);
                    var21_25 = var14_6;
                    if (var31_31 != null) {
                        var26_2.T(Integer.parseInt(ax.S0.d0.y1(var31_31, "/")[0]));
                        var21_25 = var14_6;
                        if ("audio/eac3".equals(var14_6)) {
                            var21_25 = var14_6;
                            if (var31_31.endsWith("/JOC")) {
                                var26_2.U("ec+3");
                                var21_25 = "audio/eac3-joc";
                            }
                        }
                    }
                    var26_2.y0((String)var21_25);
                    if (var20_24 != null) {
                        var26_2.r0((C)var29_29);
                        var15_5.add(new i.a((Uri)var20_24, var26_2.P(), var28_28, var27_27));
                        ** break;
                    }
                    if (var30_30 != null) {
                        var13_7 = var26_2.P();
                        continue block20;
                    }
                }
lbl222:
                // 6 sources

                default: {
                    continue block20;
                }
                case 1: {
                    var14_6 = ax.d1.k.B((String)var21_25, ax.d1.k.V, var23_3);
                    if (var14_6.startsWith("CC")) {
                        var3_15 = Integer.parseInt(var14_6.substring(2));
                        var14_6 = "application/cea-608";
                    } else {
                        var3_15 = Integer.parseInt(var14_6.substring(7));
                        var14_6 = "application/cea-708";
                    }
                    if (var12_9 == null) {
                        var12_9 = new ArrayList<E>();
                    }
                    var26_2.y0((String)var14_6).Q(var3_15);
                    var12_9.add(var26_2.P());
                    continue block20;
                }
                case 0: 
            }
            var14_6 = ax.d1.k.g(var25_4, var28_28);
            if (var14_6 != null) {
                var14_6 = ax.S0.d0.S(var14_6.b.k, 3);
                var26_2.U((String)var14_6);
                var14_6 = ax.P0.D.g((String)var14_6);
            } else {
                var14_6 = null;
            }
            var21_25 = var14_6;
            if (var14_6 == null) {
                var21_25 = "text/vtt";
            }
            var26_2.y0((String)var21_25).r0((C)var29_29);
            if (var20_24 != null) {
                var16_22 /* !! */ .add(new i.a((Uri)var20_24, var26_2.P(), var28_28, var27_27));
                continue;
            }
            ax.S0.u.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
        }
        if (var4_13 != 0) {
            var12_9 = Collections.EMPTY_LIST;
        }
        return new i(var1_1, (List<String>)var18_11, (List<i.b>)var22_26, (List<i.a>)var0, (List<i.a>)var15_5, (List<i.a>)var16_22 /* !! */ , (List<i.a>)var24_8, (v)var13_7, var12_9, var10_12, (Map<String, String>)var23_3, (List<o>)var19_10);
    }

    private static boolean s(String object, Pattern pattern, boolean bl) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            return "YES".equals(((Matcher)object).group(1));
        }
        return bl;
    }

    private static double t(String object, Pattern pattern, double d8) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            return Double.parseDouble(ax.S0.a.e(((Matcher)object).group(1)));
        }
        return d8;
    }

    private static int u(String object, Pattern pattern, int n8) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            return Integer.parseInt(ax.S0.a.e(((Matcher)object).group(1)));
        }
        return n8;
    }

    private static long v(String object, Pattern pattern, long l8) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            return Long.parseLong(ax.S0.a.e(((Matcher)object).group(1)));
        }
        return l8;
    }

    private static String w(String object, Pattern pattern, String string, Map<String, String> map) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            string = ax.S0.a.e(((Matcher)object).group(1));
        }
        if (!map.isEmpty() && string != null) {
            return ax.d1.k.D(string, map);
        }
        return string;
    }

    private static String x(String string, Pattern pattern, Map<String, String> map) {
        return ax.d1.k.w(string, pattern, null, map);
    }

    private static int y(String objectArray, Map<String, String> map) {
        objectArray = ax.d1.k.x((String)objectArray, U, map);
        boolean bl = TextUtils.isEmpty((CharSequence)objectArray);
        int n8 = 0;
        if (bl) {
            return 0;
        }
        if (ax.S0.d0.s(objectArray = ax.S0.d0.x1((String)objectArray, ","), "public.accessibility.describes-video")) {
            n8 = 512;
        }
        int n9 = n8;
        if (ax.S0.d0.s(objectArray, "public.accessibility.transcribes-spoken-dialog")) {
            n9 = n8 | 0x1000;
        }
        n8 = n9;
        if (ax.S0.d0.s(objectArray, "public.accessibility.describes-music-and-sound")) {
            n8 = n9 | 0x400;
        }
        if (ax.S0.d0.s(objectArray, "public.easy-to-read")) {
            return n8 | 0x2000;
        }
        return n8;
    }

    private static int z(String string) {
        int n8;
        int n9 = n8 = ax.d1.k.s(string, X, false);
        if (ax.d1.k.s(string, Y, false)) {
            n9 = n8 | 2;
        }
        if (ax.d1.k.s(string, W, false)) {
            return n9 | 4;
        }
        return n9;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j j(Uri var1_1, InputStream var2_3) throws IOException {
        block7: {
            var2_3 = new BufferedReader(new InputStreamReader((InputStream)var2_3));
            var3_4 = new ArrayDeque<String>();
            try {
                if (ax.d1.k.b((BufferedReader)var2_3)) {
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var1_2) {
                break block7;
            }
            while ((var4_5 = var2_3.readLine()) != null) {
                if ((var4_5 = var4_5.trim()).isEmpty()) continue;
                if (!var4_5.startsWith("#EXT-X-STREAM-INF")) ** GOTO lbl-1000
                var3_4.add((String)var4_5);
                var4_5 = new b(var3_4, (BufferedReader)var2_3);
                var1_1 /* !! */  = ax.d1.k.r((b)var4_5, var1_1 /* !! */ .toString());
                ax.S0.d0.n(var2_3);
                return var1_1 /* !! */ ;
lbl-1000:
                // 1 sources

                {
                    if (!(var4_5.startsWith("#EXT-X-TARGETDURATION") || var4_5.startsWith("#EXT-X-MEDIA-SEQUENCE") || var4_5.startsWith("#EXTINF") || var4_5.startsWith("#EXT-X-KEY") || var4_5.startsWith("#EXT-X-BYTERANGE") || var4_5.equals("#EXT-X-DISCONTINUITY") || var4_5.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || var4_5.equals("#EXT-X-ENDLIST"))) {
                        var3_4.add((String)var4_5);
                        continue;
                    }
                    var3_4.add((String)var4_5);
                    var5_6 = this.a;
                    var4_5 = this.b;
                    var6_7 = new b(var3_4, (BufferedReader)var2_3);
                    var1_1 /* !! */  = ax.d1.k.q(var5_6, (f)var4_5, var6_7, var1_1 /* !! */ .toString());
                }
                ax.S0.d0.n(var2_3);
                return var1_1 /* !! */ ;
            }
            ax.S0.d0.n(var2_3);
            throw ax.P0.E.c("Failed to parse the playlist, could not identify any tags.", null);
lbl-1000:
            // 1 sources

            {
                throw ax.P0.E.c("Input does not start with the #EXTM3U header.", null);
            }
        }
        ax.S0.d0.n(var2_3);
        throw var1_2;
    }

    public static final class a
    extends IOException {
    }

    private static class b {
        private final BufferedReader a;
        private final Queue<String> b;
        private String c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() throws IOException {
            block3: {
                String string;
                if (this.c != null) {
                    return true;
                }
                if (!this.b.isEmpty()) {
                    this.c = ax.S0.a.e(this.b.poll());
                    return true;
                }
                do {
                    this.c = string = this.a.readLine();
                    if (string == null) break block3;
                    this.c = string = string.trim();
                } while (string.isEmpty());
                return true;
            }
            return false;
        }

        public String b() throws IOException {
            if (this.a()) {
                String string = this.c;
                this.c = null;
                return string;
            }
            throw new NoSuchElementException();
        }
    }
}

