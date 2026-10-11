package ax.d1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import ax.P0.C0900i;
import ax.P0.C0906o;
import ax.P0.D;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.d1.f;
import ax.d1.i;
import ax.m1.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements p.a<j> {
    private final i a;
    private final f b;
    private static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern v = c("CAN-SKIP-DATERANGES");
    private static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern z = c("CAN-BLOCK-RELOAD");
    private static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern W = c("AUTOSELECT");
    private static final Pattern X = c("DEFAULT");
    private static final Pattern Y = c("FORCED");
    private static final Pattern Z = c("INDEPENDENT");
    private static final Pattern a0 = c("GAP");
    private static final Pattern b0 = c("PRECISE");
    private static final Pattern c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final Pattern d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final Pattern e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final Pattern f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final Pattern i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern k0 = c("END-ON-NEXT");
    private static final Pattern l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final Pattern m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final Pattern n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final Pattern q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final Pattern s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final Pattern u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
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
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) C0968a.e(this.b.poll());
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public k() {
        this(i.n, null);
    }

    private static f.h A(String str) {
        double t2 = t(str, u, -9.223372036854776E18d);
        long j2 = t2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (t2 * 1000000.0d);
        boolean s2 = s(str, v, false);
        double t3 = t(str, x, -9.223372036854776E18d);
        long j3 = t3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (t3 * 1000000.0d);
        double t4 = t(str, y, -9.223372036854776E18d);
        return new f.h(j2, s2, j3, t4 != -9.223372036854776E18d ? (long) (t4 * 1000000.0d) : -9223372036854775807L, s(str, z, false));
    }

    private static String B(String str, Pattern pattern, Map<String, String> map) throws E {
        String x2 = x(str, pattern, map);
        if (x2 != null) {
            return x2;
        }
        throw E.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long C(String str, Pattern pattern) throws E {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String str, Map<String, String> map) {
        Matcher matcher = u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int E(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !d0.N0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int E2 = E(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (E2 != "#EXTM3U".charAt(i2)) {
                return false;
            }
            E2 = bufferedReader.read();
        }
        return d0.N0(E(bufferedReader, false, E2));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static C0906o d(String str, C0906o.b[] bVarArr) {
        C0906o.b[] bVarArr2 = new C0906o.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = bVarArr[i2].a(null);
        }
        return new C0906o(str, bVarArr2);
    }

    private static String e(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    private static i.b f(ArrayList<i.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i.b bVar = arrayList.get(i2);
            if (str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b g(ArrayList<i.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i.b bVar = arrayList.get(i2);
            if (str.equals(bVar.e)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b h(ArrayList<i.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i.b bVar = arrayList.get(i2);
            if (str.equals(bVar.c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean i(String str, String str2, String str3, String str4) {
        if (!D.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static f.b k(String str, String str2, Map<String, String> map) throws E {
        String str3 = str2 + "=";
        int indexOf = str.indexOf(str3) + str3.length();
        String substring = str.substring(indexOf, (str.length() == indexOf + 1 ? 1 : 2) + indexOf);
        if (substring.startsWith("\"")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (substring.equals("0x") || substring.equals("0X")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double l(String str, Pattern pattern) throws E {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static C0906o.b m(String str, String str2, Map<String, String> map) throws E {
        String w2 = w(str, M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String B2 = B(str, N, map);
            return new C0906o.b(C0900i.d, "video/mp4", Base64.decode(B2.substring(B2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C0906o.b(C0900i.d, "hls", d0.x0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(w2)) {
            return null;
        }
        String B3 = B(str, N, map);
        byte[] decode = Base64.decode(B3.substring(B3.indexOf(44)), 0);
        UUID uuid = C0900i.e;
        return new C0906o.b(uuid, "video/mp4", ax.K1.p.a(uuid, decode));
    }

    private static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int o(String str, Pattern pattern) throws E {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static long p(String str, Pattern pattern) throws E {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x07f9, code lost:
    
        if (r6.equals("POINT") != false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0817, code lost:
    
        if (r6.equals("HIGHLIGHT") != false) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.d1.f q(ax.d1.i r91, ax.d1.f r92, ax.d1.k.b r93, java.lang.String r94) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d1.k.q(ax.d1.i, ax.d1.f, ax.d1.k$b, java.lang.String):ax.d1.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
    
        if (r0 > 0) goto L55;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x037a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.d1.i r(ax.d1.k.b r36, java.lang.String r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d1.k.r(ax.d1.k$b, java.lang.String):ax.d1.i");
    }

    private static boolean s(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z2;
    }

    private static double t(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) C0968a.e(matcher.group(1))) : d2;
    }

    private static int u(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) C0968a.e(matcher.group(1))) : i2;
    }

    private static long v(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) C0968a.e(matcher.group(1))) : j2;
    }

    private static String w(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C0968a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    private static String x(String str, Pattern pattern, Map<String, String> map) {
        return w(str, pattern, null, map);
    }

    private static int y(String str, Map<String, String> map) {
        String x2 = x(str, U, map);
        if (TextUtils.isEmpty(x2)) {
            return 0;
        }
        String[] x1 = d0.x1(x2, ",");
        int i2 = d0.s(x1, "public.accessibility.describes-video") ? 512 : 0;
        if (d0.s(x1, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (d0.s(x1, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return d0.s(x1, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int z(String str) {
        boolean s2 = s(str, X, false);
        ?? r02 = s2;
        if (s(str, Y, false)) {
            r02 = (s2 ? 1 : 0) | 2;
        }
        return s(str, W, false) ? r02 | 4 : r02;
    }

    @Override // ax.m1.p.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw E.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    d0.n(bufferedReader);
                    throw E.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return r(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return q(this.a, this.b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            d0.n(bufferedReader);
        }
    }

    public k(i iVar, f fVar) {
        this.a = iVar;
        this.b = fVar;
    }
}
