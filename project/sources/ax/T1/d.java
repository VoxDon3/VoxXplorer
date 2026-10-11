package ax.T1;

import android.text.Layout;
import ax.N1.i;
import ax.N1.k;
import ax.N1.m;
import ax.N1.s;
import ax.N1.t;
import ax.S0.C0968a;
import ax.S0.C0977j;
import ax.S0.C0987u;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.S0.e0;
import ax.q7.C2876c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class d implements t {
    private static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    private static final a i = new a(30.0f, 1, 1);
    private final XmlPullParserFactory a;

    private static final class a {
        final float a;
        final int b;
        final int c;

        a(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    private static final class b {
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static g e(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment g(String str) {
        String e2 = C2876c.e(str);
        e2.getClass();
        switch (e2) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int h(XmlPullParser xmlPullParser, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i2;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            C0987u.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i2;
        }
        boolean z = true;
        try {
            int parseInt = Integer.parseInt((String) C0968a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C0968a.e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            C0968a.b(z, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            C0987u.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i2;
        }
    }

    private static void i(String str, g gVar) throws m {
        Matcher matcher;
        String str2;
        String[] x1 = d0.x1(str, "\\s+");
        if (x1.length == 1) {
            matcher = d.matcher(str);
        } else {
            if (x1.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + x1.length + ".");
            }
            matcher = d.matcher(x1[1]);
            C0987u.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) C0968a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) C0968a.e(matcher.group(1))));
    }

    private static a j(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            C0968a.b(d0.x1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        a aVar = i;
        int i2 = aVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = aVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f2, i2, i3);
    }

    private static Map<String, g> k(XmlPullParser xmlPullParser, Map<String, g> map, int i2, b bVar, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (e0.e(xmlPullParser, "style")) {
                String a2 = e0.a(xmlPullParser, "style");
                g p = p(xmlPullParser, new g());
                if (a2 != null) {
                    for (String str : q(a2)) {
                        p.a(map.get(str));
                    }
                }
                String h2 = p.h();
                if (h2 != null) {
                    map.put(h2, p);
                }
            } else if (e0.e(xmlPullParser, "region")) {
                e n = n(xmlPullParser, i2, bVar, map);
                if (n != null) {
                    map2.put(n.a, n);
                }
            } else if (e0.e(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!e0.c(xmlPullParser, "head"));
        return map;
    }

    private static void l(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a2;
        do {
            xmlPullParser.next();
            if (e0.e(xmlPullParser, "image") && (a2 = e0.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!e0.c(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static c m(XmlPullParser xmlPullParser, c cVar, Map<String, e> map, a aVar) throws m {
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g p = p(xmlPullParser, null);
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        int i2 = 0;
        String str2 = null;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            long j5 = j;
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = r(attributeValue, aVar);
                    break;
                case 2:
                    j3 = r(attributeValue, aVar);
                    break;
                case 3:
                    j2 = r(attributeValue, aVar);
                    break;
                case 4:
                    String[] q = q(attributeValue);
                    if (q.length > 0) {
                        strArr = q;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str2 = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i2++;
            j = j5;
        }
        long j6 = j;
        if (cVar != null) {
            long j7 = cVar.d;
            if (j7 != j6) {
                if (j2 != j6) {
                    j2 += j7;
                }
                if (j3 != j6) {
                    j3 += j7;
                }
            }
        }
        long j8 = j2;
        if (j3 == j6) {
            if (j4 != j6) {
                j3 = j8 + j4;
            } else if (cVar != null) {
                long j9 = cVar.e;
                if (j9 != j6) {
                    j3 = j9;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j8, j3, p, strArr, str, str2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.T1.e n(org.xmlpull.v1.XmlPullParser r18, int r19, ax.T1.d.b r20, java.util.Map<java.lang.String, ax.T1.g> r21) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T1.d.n(org.xmlpull.v1.XmlPullParser, int, ax.T1.d$b, java.util.Map):ax.T1.e");
    }

    private static float o(String str) {
        Matcher matcher = e.matcher(str);
        if (!matcher.matches()) {
            C0987u.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C0968a.e(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            C0987u.i("TtmlParser", "Failed to parse shear: " + str, e2);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static g p(XmlPullParser xmlPullParser, g gVar) {
        char c2;
        char c3;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    gVar = e(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = e(gVar).y(attributeValue);
                    break;
                case 2:
                    gVar = e(gVar).A(attributeValue);
                    break;
                case 3:
                    gVar = e(gVar).L(g(attributeValue));
                    break;
                case 4:
                    gVar = e(gVar).H(attributeValue);
                    break;
                case 5:
                    String e2 = C2876c.e(attributeValue);
                    e2.getClass();
                    switch (e2.hashCode()) {
                        case -1461280213:
                            if (e2.equals("nounderline")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1026963764:
                            if (e2.equals("underline")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 913457136:
                            if (e2.equals("nolinethrough")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1679736913:
                            if (e2.equals("linethrough")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            gVar = e(gVar).O(false);
                            break;
                        case 1:
                            gVar = e(gVar).O(true);
                            break;
                        case 2:
                            gVar = e(gVar).F(false);
                            break;
                        case 3:
                            gVar = e(gVar).F(true);
                            break;
                    }
                case 6:
                    gVar = e(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = e(gVar).D(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String e3 = C2876c.e(attributeValue);
                    e3.getClass();
                    switch (e3.hashCode()) {
                        case -618561360:
                            if (e3.equals("baseContainer")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -410956671:
                            if (e3.equals("container")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -250518009:
                            if (e3.equals("delimiter")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -136074796:
                            if (e3.equals("textContainer")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3016401:
                            if (e3.equals("base")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3556653:
                            if (e3.equals("text")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                        case 4:
                            gVar = e(gVar).J(2);
                            break;
                        case 1:
                            gVar = e(gVar).J(1);
                            break;
                        case 2:
                            gVar = e(gVar).J(4);
                            break;
                        case 3:
                        case 5:
                            gVar = e(gVar).J(3);
                            break;
                    }
                case '\t':
                    gVar = e(gVar);
                    try {
                        gVar.z(C0977j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        C0987u.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\n':
                    gVar = e(gVar).K(o(attributeValue));
                    break;
                case 11:
                    String e4 = C2876c.e(attributeValue);
                    e4.getClass();
                    if (e4.equals("all")) {
                        gVar = e(gVar).M(true);
                        break;
                    } else if (e4.equals("none")) {
                        gVar = e(gVar).M(false);
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        gVar = e(gVar);
                        i(attributeValue, gVar);
                        break;
                    } catch (m unused2) {
                        C0987u.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case '\r':
                    gVar = e(gVar).N(ax.T1.b.a(attributeValue));
                    break;
                case 14:
                    String e5 = C2876c.e(attributeValue);
                    e5.getClass();
                    if (e5.equals("before")) {
                        gVar = e(gVar).I(1);
                        break;
                    } else if (e5.equals("after")) {
                        gVar = e(gVar).I(2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    gVar = e(gVar);
                    try {
                        gVar.w(C0977j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        C0987u.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 16:
                    gVar = e(gVar).G(g(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] q(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : d0.x1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long r(java.lang.String r13, ax.T1.d.a r14) throws ax.N1.m {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T1.d.r(java.lang.String, ax.T1.d$a):long");
    }

    private static b s(XmlPullParser xmlPullParser) {
        String a2 = e0.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = g.matcher(a2);
        if (!matcher.matches()) {
            C0987u.h("TtmlParser", "Ignoring non-pixel tts extent: " + a2);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) C0968a.e(matcher.group(1))), Integer.parseInt((String) C0968a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            C0987u.h("TtmlParser", "Ignoring malformed tts extent: " + a2);
            return null;
        }
    }

    @Override // ax.N1.t
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override // ax.N1.t
    public k b(byte[] bArr, int i2, int i3) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(HttpUrl.FRAGMENT_ENCODE_SET, new e(HttpUrl.FRAGMENT_ENCODE_SET));
            h hVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar = i;
            int i4 = 0;
            int i5 = 15;
            b bVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = j(newPullParser);
                            i5 = h(newPullParser, 15);
                            bVar = s(newPullParser);
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        int i6 = i5;
                        if (f(name)) {
                            if ("head".equals(name)) {
                                k(newPullParser, hashMap, i6, bVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c m = m(newPullParser, cVar, hashMap2, aVar2);
                                    arrayDeque.push(m);
                                    if (cVar != null) {
                                        cVar.a(m);
                                    }
                                } catch (m e2) {
                                    C0987u.i("TtmlParser", "Suppressing parser error", e2);
                                }
                            }
                            i5 = i6;
                            bVar = bVar2;
                            aVar = aVar2;
                        } else {
                            C0987u.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i4++;
                        i5 = i6;
                        bVar = bVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((c) C0968a.e(cVar)).a(c.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((c) C0968a.e((c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            return (k) C0968a.e(hVar);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }

    @Override // ax.N1.t
    public void c(byte[] bArr, int i2, int i3, t.b bVar, InterfaceC0979l<ax.N1.e> interfaceC0979l) {
        i.c(b(bArr, i2, i3), bVar, interfaceC0979l);
    }

    @Override // ax.N1.t
    public int d() {
        return 1;
    }
}
