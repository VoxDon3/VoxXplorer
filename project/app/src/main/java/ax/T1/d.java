/*
 * Decompiled with CFR 0.152.
 */
package ax.T1;

import android.text.Layout;
import ax.N1.i;
import ax.N1.k;
import ax.N1.m;
import ax.N1.s;
import ax.N1.t;
import ax.S0.d0;
import ax.S0.e0;
import ax.S0.j;
import ax.S0.l;
import ax.S0.u;
import ax.T1.c;
import ax.T1.e;
import ax.T1.g;
import ax.T1.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class d
implements t {
    private static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    private static final a i = new a(30.0f, 1, 1);
    private final XmlPullParserFactory a;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactory;
            this.a = xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory.setNamespaceAware(true);
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlPullParserException);
        }
    }

    private static g e(g g8) {
        g g9 = g8;
        if (g8 == null) {
            g9 = new g();
        }
        return g9;
    }

    private static boolean f(String string) {
        return string.equals("tt") || string.equals("head") || string.equals("body") || string.equals("div") || string.equals("p") || string.equals("span") || string.equals("br") || string.equals("style") || string.equals("styling") || string.equals("layout") || string.equals("region") || string.equals("metadata") || string.equals("image") || string.equals("data") || string.equals("information");
        {
        }
    }

    private static Layout.Alignment g(String string) {
        string = ax.q7.c.e(string);
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 109757538: {
                if (!string.equals("start")) break;
                n8 = 4;
                break;
            }
            case 108511772: {
                if (!string.equals("right")) break;
                n8 = 3;
                break;
            }
            case 3317767: {
                if (!string.equals("left")) break;
                n8 = 2;
                break;
            }
            case 100571: {
                if (!string.equals("end")) break;
                n8 = 1;
                break;
            }
            case -1364013995: {
                if (!string.equals("center")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 2: 
            case 4: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: 
            case 3: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 0: 
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static int h(XmlPullParser object, int n8) {
        int n9;
        int n10;
        boolean bl;
        Object object2;
        block5: {
            if ((object = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution")) == null) {
                return n8;
            }
            object2 = h.matcher((CharSequence)object);
            if (!((Matcher)object2).matches()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Ignoring malformed cell resolution: ");
                ((StringBuilder)object2).append((String)object);
                u.h("TtmlParser", ((StringBuilder)object2).toString());
                return n8;
            }
            bl = true;
            try {
                n10 = Integer.parseInt(ax.S0.a.e(((Matcher)object2).group(1)));
                n9 = Integer.parseInt(ax.S0.a.e(((Matcher)object2).group(2)));
                if (n10 != 0 && n9 != 0) break block5;
                bl = false;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring malformed cell resolution: ");
                stringBuilder.append((String)object);
                u.h("TtmlParser", stringBuilder.toString());
                return n8;
            }
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid cell resolution ");
        ((StringBuilder)object2).append(n10);
        ((StringBuilder)object2).append(" ");
        ((StringBuilder)object2).append(n9);
        ax.S0.a.b(bl, ((StringBuilder)object2).toString());
        return n9;
    }

    private static void i(String charSequence, g object) throws m {
        Object object2;
        block16: {
            block15: {
                block14: {
                    object2 = d0.x1((String)charSequence, "\\s+");
                    if (((String[])object2).length != 1) break block14;
                    object2 = d.matcher(charSequence);
                    break block15;
                }
                if (((String[])object2).length != 2) break block16;
                object2 = d.matcher((CharSequence)object2[1]);
                u.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
            }
            if (((Matcher)object2).matches()) {
                charSequence = ax.S0.a.e(((Matcher)object2).group(3));
                charSequence.getClass();
                int n8 = -1;
                switch (((String)charSequence).hashCode()) {
                    default: {
                        break;
                    }
                    case 3592: {
                        if (!((String)charSequence).equals("px")) break;
                        n8 = 2;
                        break;
                    }
                    case 3240: {
                        if (!((String)charSequence).equals("em")) break;
                        n8 = 1;
                        break;
                    }
                    case 37: {
                        if (!((String)charSequence).equals("%")) break;
                        n8 = 0;
                    }
                }
                switch (n8) {
                    default: {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid unit for fontSize: '");
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append("'.");
                        throw new m(((StringBuilder)object).toString());
                    }
                    case 2: {
                        ((g)object).C(1);
                        break;
                    }
                    case 1: {
                        ((g)object).C(2);
                        break;
                    }
                    case 0: {
                        ((g)object).C(3);
                    }
                }
                ((g)object).B(Float.parseFloat(ax.S0.a.e(((Matcher)object2).group(1))));
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid expression for fontSize: '");
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("'.");
            throw new m(((StringBuilder)object).toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Invalid number of entries for fontSize: ");
        ((StringBuilder)charSequence).append(((Object)object2).length);
        ((StringBuilder)charSequence).append(".");
        throw new m(((StringBuilder)charSequence).toString());
    }

    private static a j(XmlPullParser object) {
        float f8;
        Object object2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int n8 = object2 != null ? Integer.parseInt((String)object2) : 30;
        object2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (object2 != null) {
            boolean bl = ((String[])(object2 = d0.x1((String)object2, " "))).length == 2;
            ax.S0.a.b(bl, "frameRateMultiplier doesn't have 2 parts");
            f8 = (float)Integer.parseInt(object2[0]) / (float)Integer.parseInt(object2[1]);
        } else {
            f8 = 1.0f;
        }
        object2 = i;
        int n9 = object2.b;
        String string = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (string != null) {
            n9 = Integer.parseInt(string);
        }
        int n10 = object2.c;
        if ((object = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate")) != null) {
            n10 = Integer.parseInt((String)object);
        }
        return new a((float)n8 * f8, n9, n10);
    }

    private static Map<String, g> k(XmlPullParser xmlPullParser, Map<String, g> map, int n8, b b8, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            Object object;
            xmlPullParser.next();
            if (e0.e(xmlPullParser, "style")) {
                Object object2 = e0.a(xmlPullParser, "style");
                object = ax.T1.d.p(xmlPullParser, new g());
                if (object2 != null) {
                    object2 = ax.T1.d.q((String)object2);
                    int n9 = ((String[])object2).length;
                    for (int i8 = 0; i8 < n9; ++i8) {
                        ((g)object).a(map.get(object2[i8]));
                    }
                }
                if ((object2 = ((g)object).h()) == null) continue;
                map.put((String)object2, (g)object);
                continue;
            }
            if (e0.e(xmlPullParser, "region")) {
                object = ax.T1.d.n(xmlPullParser, n8, b8, map);
                if (object == null) continue;
                map2.put(((e)object).a, (e)object);
                continue;
            }
            if (!e0.e(xmlPullParser, "metadata")) continue;
            ax.T1.d.l(xmlPullParser, map3);
        } while (!e0.c(xmlPullParser, "head"));
        return map;
    }

    private static void l(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        do {
            String string;
            xmlPullParser.next();
            if (!e0.e(xmlPullParser, "image") || (string = e0.a(xmlPullParser, "id")) == null) continue;
            map.put(string, xmlPullParser.nextText());
        } while (!e0.c(xmlPullParser, "metadata"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static c m(XmlPullParser xmlPullParser, c c8, Map<String, e> map, a a8) throws m {
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        int n8 = xmlPullParser.getAttributeCount();
        String[] stringArray = null;
        g g8 = ax.T1.d.p(xmlPullParser, null);
        long l13 = -9223372036854775807L;
        long l14 = l12 = (l11 = -9223372036854775807L);
        String[] stringArray2 = "";
        String string = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            String[] stringArray3;
            int n9;
            String string2 = xmlPullParser.getAttributeName(i8);
            String[] stringArray4 = xmlPullParser.getAttributeValue(i8);
            string2.getClass();
            int n10 = -1;
            switch (string2.hashCode()) {
                case 1292595405: {
                    if (!string2.equals("backgroundImage")) break;
                    n10 = 1;
                    break;
                }
                case 109780401: {
                    if (!string2.equals("style")) break;
                    n10 = 2;
                    break;
                }
                case 93616297: {
                    if (!string2.equals("begin")) break;
                    n10 = 3;
                    break;
                }
                case 100571: {
                    if (!string2.equals("end")) break;
                    n10 = 4;
                    break;
                }
                case 99841: {
                    if (!string2.equals("dur")) break;
                    n10 = 5;
                    break;
                }
                case -934795532: {
                    if (!string2.equals("region")) break;
                    n10 = 6;
                    break;
                }
            }
            switch (n10) {
                default: {
                    n9 = -1;
                    break;
                }
                case 1: {
                    n9 = 5;
                    break;
                }
                case 2: {
                    n9 = 4;
                    break;
                }
                case 3: {
                    n9 = 3;
                    break;
                }
                case 4: {
                    n9 = 2;
                    break;
                }
                case 5: {
                    n9 = 1;
                    break;
                }
                case 6: {
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    l8 = l14;
                    break;
                }
                case 5: {
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    l8 = l14;
                    if (!stringArray4.startsWith("#")) break;
                    string2 = stringArray4.substring(1);
                    l8 = l14;
                    l9 = l12;
                    l10 = l11;
                    stringArray3 = stringArray;
                    break;
                }
                case 4: {
                    stringArray4 = ax.T1.d.q((String)stringArray4);
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    l8 = l14;
                    if (stringArray4.length <= 0) break;
                    stringArray3 = stringArray4;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    l8 = l14;
                    break;
                }
                case 3: {
                    l10 = ax.T1.d.r((String)stringArray4, a8);
                    stringArray3 = stringArray;
                    string2 = string;
                    l9 = l12;
                    l8 = l14;
                    break;
                }
                case 2: {
                    l9 = ax.T1.d.r((String)stringArray4, a8);
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l8 = l14;
                    break;
                }
                case 1: {
                    l8 = ax.T1.d.r((String)stringArray4, a8);
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    break;
                }
                case 0: {
                    stringArray3 = stringArray;
                    string2 = string;
                    l10 = l11;
                    l9 = l12;
                    l8 = l14;
                    if (!map.containsKey(stringArray4)) break;
                    stringArray2 = stringArray4;
                    l8 = l14;
                    l9 = l12;
                    l10 = l11;
                    string2 = string;
                    stringArray3 = stringArray;
                }
            }
            stringArray = stringArray3;
            string = string2;
            l11 = l10;
            l12 = l9;
            l14 = l8;
        }
        l10 = l11;
        l9 = l12;
        if (c8 != null) {
            long l15 = c8.d;
            l10 = l11;
            l9 = l12;
            if (l15 != l13) {
                l8 = l11;
                if (l11 != l13) {
                    l8 = l11 + l15;
                }
                l10 = l8;
                l9 = l12;
                if (l12 != l13) {
                    l9 = l12 + l15;
                    l10 = l8;
                }
            }
        }
        l11 = l9;
        if (l9 != l13) return ax.T1.c.c(xmlPullParser.getName(), l10, l11, g8, stringArray, (String)stringArray2, string, c8);
        if (l14 != l13) {
            l11 = l10 + l14;
            return ax.T1.c.c(xmlPullParser.getName(), l10, l11, g8, stringArray, (String)stringArray2, string, c8);
        }
        l11 = l9;
        if (c8 == null) return ax.T1.c.c(xmlPullParser.getName(), l10, l11, g8, stringArray, (String)stringArray2, string, c8);
        l12 = c8.e;
        l11 = l9;
        if (l12 == l13) return ax.T1.c.c(xmlPullParser.getName(), l10, l11, g8, stringArray, (String)stringArray2, string, c8);
        l11 = l12;
        return ax.T1.c.c(xmlPullParser.getName(), l10, l11, g8, stringArray, (String)stringArray2, string, c8);
    }

    private static e n(XmlPullParser object, int n8, b object2, Map<String, g> object3) {
        float f8;
        float f9;
        float f10;
        int n9;
        float f11;
        float f12;
        String string;
        block40: {
            block39: {
                block38: {
                    block36: {
                        block37: {
                            block35: {
                                block33: {
                                    Object object4;
                                    block34: {
                                        int n10;
                                        Object object5;
                                        Object object6;
                                        block32: {
                                            block30: {
                                                block31: {
                                                    string = e0.a((XmlPullParser)object, "id");
                                                    if (string == null) {
                                                        return null;
                                                    }
                                                    object4 = object6 = e0.a((XmlPullParser)object, "origin");
                                                    if (object6 == null) {
                                                        object5 = e0.a((XmlPullParser)object, "style");
                                                        object4 = object6;
                                                        if (object5 != null) {
                                                            object5 = object3.get(object5);
                                                            object4 = object6;
                                                            if (object5 != null) {
                                                                object4 = ((g)object5).j();
                                                            }
                                                        }
                                                    }
                                                    if (object4 == null) break block30;
                                                    object5 = f.matcher((CharSequence)object4);
                                                    object6 = g.matcher((CharSequence)object4);
                                                    if (((Matcher)object5).matches()) {
                                                        try {
                                                            f12 = Float.parseFloat(ax.S0.a.e(((Matcher)object5).group(1))) / 100.0f;
                                                            f11 = Float.parseFloat(ax.S0.a.e(((Matcher)object5).group(2)));
                                                            f11 /= 100.0f;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            StringBuilder stringBuilder = new StringBuilder();
                                                            stringBuilder.append("Ignoring region with malformed origin: ");
                                                            stringBuilder.append((String)object4);
                                                            u.h("TtmlParser", stringBuilder.toString());
                                                            return null;
                                                        }
                                                    }
                                                    if (!((Matcher)object6).matches()) break block31;
                                                    if (object2 == null) {
                                                        object = new StringBuilder();
                                                        ((StringBuilder)object).append("Ignoring region with missing tts:extent: ");
                                                        ((StringBuilder)object).append((String)object4);
                                                        u.h("TtmlParser", ((StringBuilder)object).toString());
                                                        return null;
                                                    }
                                                    try {
                                                        n9 = Integer.parseInt(ax.S0.a.e(((Matcher)object6).group(1)));
                                                        n10 = Integer.parseInt(ax.S0.a.e(((Matcher)object6).group(2)));
                                                        f12 = (float)n9 / (float)((b)object2).a;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        StringBuilder stringBuilder = new StringBuilder();
                                                        stringBuilder.append("Ignoring region with malformed origin: ");
                                                        stringBuilder.append((String)object4);
                                                        u.h("TtmlParser", stringBuilder.toString());
                                                        return null;
                                                    }
                                                    f11 = n10;
                                                    n9 = ((b)object2).b;
                                                    f11 /= (float)n9;
                                                    break block32;
                                                }
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append("Ignoring region with unsupported origin: ");
                                                ((StringBuilder)object).append((String)object4);
                                                u.h("TtmlParser", ((StringBuilder)object).toString());
                                                return null;
                                            }
                                            f11 = 0.0f;
                                            f12 = 0.0f;
                                        }
                                        object6 = object5 = e0.a((XmlPullParser)object, "extent");
                                        if (object5 == null) {
                                            String string2 = e0.a((XmlPullParser)object, "style");
                                            object6 = object5;
                                            if (string2 != null) {
                                                object3 = (g)object3.get(string2);
                                                object6 = object5;
                                                if (object3 != null) {
                                                    object6 = ((g)object3).c();
                                                }
                                            }
                                        }
                                        if (object6 == null) break block33;
                                        object3 = f.matcher((CharSequence)object6);
                                        object6 = g.matcher((CharSequence)object6);
                                        if (((Matcher)object3).matches()) {
                                            try {
                                                f10 = Float.parseFloat(ax.S0.a.e(((Matcher)object3).group(1))) / 100.0f;
                                                f9 = Float.parseFloat(ax.S0.a.e(((Matcher)object3).group(2)));
                                                f9 /= 100.0f;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append("Ignoring region with malformed extent: ");
                                                stringBuilder.append((String)object4);
                                                u.h("TtmlParser", stringBuilder.toString());
                                                return null;
                                            }
                                        }
                                        if (!((Matcher)object6).matches()) break block34;
                                        if (object2 == null) {
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("Ignoring region with missing tts:extent: ");
                                            ((StringBuilder)object).append((String)object4);
                                            u.h("TtmlParser", ((StringBuilder)object).toString());
                                            return null;
                                        }
                                        try {
                                            n10 = Integer.parseInt(ax.S0.a.e(((Matcher)object6).group(1)));
                                            n9 = Integer.parseInt(ax.S0.a.e(((Matcher)object6).group(2)));
                                            f10 = (float)n10 / (float)((b)object2).a;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("Ignoring region with malformed extent: ");
                                            stringBuilder.append((String)object4);
                                            u.h("TtmlParser", stringBuilder.toString());
                                            return null;
                                        }
                                        f9 = n9;
                                        n9 = ((b)object2).b;
                                        f9 /= (float)n9;
                                        break block35;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Ignoring region with unsupported extent: ");
                                    ((StringBuilder)object).append((String)object4);
                                    u.h("TtmlParser", ((StringBuilder)object).toString());
                                    return null;
                                }
                                f9 = 1.0f;
                                f10 = 1.0f;
                            }
                            object2 = e0.a((XmlPullParser)object, "displayAlign");
                            if (object2 == null) break block36;
                            object2 = ax.q7.c.e((String)object2);
                            object2.getClass();
                            if (((String)object2).equals("center")) break block37;
                            if (!((String)object2).equals("after")) break block36;
                            f11 += f9;
                            n9 = 2;
                            break block38;
                        }
                        f11 += f9 / 2.0f;
                        n9 = 1;
                        break block38;
                    }
                    n9 = 0;
                }
                f8 = 1.0f / (float)n8;
                object = e0.a((XmlPullParser)object, "writingMode");
                if (object == null) break block39;
                object = ax.q7.c.e((String)object);
                object.getClass();
                n8 = -1;
                switch (((String)object).hashCode()) {
                    default: {
                        break;
                    }
                    case 3553576: {
                        if (!((String)object).equals("tbrl")) break;
                        n8 = 2;
                        break;
                    }
                    case 3553396: {
                        if (!((String)object).equals("tblr")) break;
                        n8 = 1;
                        break;
                    }
                    case 3694: {
                        if (!((String)object).equals("tb")) break;
                        n8 = 0;
                    }
                }
                switch (n8) {
                    default: {
                        break;
                    }
                    case 2: {
                        n8 = 1;
                        break block40;
                    }
                    case 0: 
                    case 1: {
                        n8 = 2;
                        break block40;
                    }
                }
            }
            n8 = Integer.MIN_VALUE;
        }
        return new e(string, f12, f11, 0, n9, f10, f9, 1, f8, n8);
    }

    private static float o(String string) {
        Object object = e.matcher(string);
        if (!((Matcher)object).matches()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid value for shear: ");
            ((StringBuilder)object).append(string);
            u.h("TtmlParser", ((StringBuilder)object).toString());
            return Float.MAX_VALUE;
        }
        try {
            float f8 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(ax.S0.a.e(((Matcher)object).group(1)))));
            return f8;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse shear: ");
            stringBuilder.append(string);
            u.i("TtmlParser", stringBuilder.toString(), numberFormatException);
            return Float.MAX_VALUE;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static g p(XmlPullParser xmlPullParser, g object) {
        int n8 = xmlPullParser.getAttributeCount();
        int n9 = 0;
        Object object2 = object;
        while (n9 < n8) {
            int n10;
            String string = xmlPullParser.getAttributeValue(n9);
            object = xmlPullParser.getAttributeName(n9);
            object.getClass();
            int n11 = -1;
            switch (((String)object).hashCode()) {
                case 1754920356: {
                    if (!((String)object).equals("multiRowAlign")) break;
                    n11 = 1;
                    break;
                }
                case 1287124693: {
                    if (!((String)object).equals("backgroundColor")) break;
                    n11 = 2;
                    break;
                }
                case 1115953443: {
                    if (!((String)object).equals("rubyPosition")) break;
                    n11 = 3;
                    break;
                }
                case 921125321: {
                    if (!((String)object).equals("textEmphasis")) break;
                    n11 = 4;
                    break;
                }
                case 365601008: {
                    if (!((String)object).equals("fontSize")) break;
                    n11 = 5;
                    break;
                }
                case 110138194: {
                    if (!((String)object).equals("textCombine")) break;
                    n11 = 6;
                    break;
                }
                case 109403361: {
                    if (!((String)object).equals("shear")) break;
                    n11 = 7;
                    break;
                }
                case 94842723: {
                    if (!((String)object).equals("color")) break;
                    n11 = 8;
                    break;
                }
                case 3511770: {
                    if (!((String)object).equals("ruby")) break;
                    n11 = 9;
                    break;
                }
                case 3355: {
                    if (!((String)object).equals("id")) break;
                    n11 = 10;
                    break;
                }
                case -734428249: {
                    if (!((String)object).equals("fontWeight")) break;
                    n11 = 11;
                    break;
                }
                case -879295043: {
                    if (!((String)object).equals("textDecoration")) break;
                    n11 = 12;
                    break;
                }
                case -1008619738: {
                    if (!((String)object).equals("origin")) break;
                    n11 = 13;
                    break;
                }
                case -1065511464: {
                    if (!((String)object).equals("textAlign")) break;
                    n11 = 14;
                    break;
                }
                case -1224696685: {
                    if (!((String)object).equals("fontFamily")) break;
                    n11 = 15;
                    break;
                }
                case -1289044182: {
                    if (!((String)object).equals("extent")) break;
                    n11 = 16;
                    break;
                }
                case -1550943582: {
                    if (!((String)object).equals("fontStyle")) break;
                    n11 = 17;
                    break;
                }
            }
            switch (n11) {
                default: {
                    n10 = -1;
                    break;
                }
                case 1: {
                    n10 = 16;
                    break;
                }
                case 2: {
                    n10 = 15;
                    break;
                }
                case 3: {
                    n10 = 14;
                    break;
                }
                case 4: {
                    n10 = 13;
                    break;
                }
                case 5: {
                    n10 = 12;
                    break;
                }
                case 6: {
                    n10 = 11;
                    break;
                }
                case 7: {
                    n10 = 10;
                    break;
                }
                case 8: {
                    n10 = 9;
                    break;
                }
                case 9: {
                    n10 = 8;
                    break;
                }
                case 10: {
                    n10 = 7;
                    break;
                }
                case 11: {
                    n10 = 6;
                    break;
                }
                case 12: {
                    n10 = 5;
                    break;
                }
                case 13: {
                    n10 = 4;
                    break;
                }
                case 14: {
                    n10 = 3;
                    break;
                }
                case 15: {
                    n10 = 2;
                    break;
                }
                case 16: {
                    n10 = 1;
                    break;
                }
                case 17: {
                    n10 = 0;
                }
            }
            block41 : switch (n10) {
                default: {
                    object = object2;
                    break;
                }
                case 16: {
                    object = ax.T1.d.e((g)object2).G(ax.T1.d.g(string));
                    break;
                }
                case 15: {
                    object = ax.T1.d.e((g)object2);
                    try {
                        ((g)object).w(j.c(string));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed parsing background value: ");
                        ((StringBuilder)object2).append(string);
                        u.h("TtmlParser", ((StringBuilder)object2).toString());
                    }
                    break;
                }
                case 14: {
                    object = ax.q7.c.e(string);
                    object.getClass();
                    if (!((String)object).equals("before")) {
                        if (!((String)object).equals("after")) {
                            object = object2;
                            break;
                        }
                        object = ax.T1.d.e((g)object2).I(2);
                        break;
                    }
                    object = ax.T1.d.e((g)object2).I(1);
                    break;
                }
                case 13: {
                    object = ax.T1.d.e((g)object2).N(ax.T1.b.a(string));
                    break;
                }
                case 12: {
                    object = object2;
                    try {
                        object = object2 = ax.T1.d.e((g)object2);
                        ax.T1.d.i(string, (g)object2);
                        object = object2;
                    }
                    catch (m m8) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed parsing fontSize value: ");
                        ((StringBuilder)object2).append(string);
                        u.h("TtmlParser", ((StringBuilder)object2).toString());
                    }
                    break;
                }
                case 11: {
                    object = ax.q7.c.e(string);
                    object.getClass();
                    if (!((String)object).equals("all")) {
                        if (!((String)object).equals("none")) {
                            object = object2;
                            break;
                        }
                        object = ax.T1.d.e((g)object2).M(false);
                        break;
                    }
                    object = ax.T1.d.e((g)object2).M(true);
                    break;
                }
                case 10: {
                    object = ax.T1.d.e((g)object2).K(ax.T1.d.o(string));
                    break;
                }
                case 9: {
                    object = ax.T1.d.e((g)object2);
                    try {
                        ((g)object).z(j.c(string));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed parsing color value: ");
                        ((StringBuilder)object2).append(string);
                        u.h("TtmlParser", ((StringBuilder)object2).toString());
                    }
                    break;
                }
                case 8: {
                    object = ax.q7.c.e(string);
                    object.getClass();
                    tmp = -1;
                    switch (((String)object).hashCode()) {
                        case 3556653: {
                            if (!((String)object).equals("text")) break;
                            tmp = 1;
                            break;
                        }
                        case 3016401: {
                            if (!((String)object).equals("base")) break;
                            tmp = 2;
                            break;
                        }
                        case -136074796: {
                            if (!((String)object).equals("textContainer")) break;
                            tmp = 3;
                            break;
                        }
                        case -250518009: {
                            if (!((String)object).equals("delimiter")) break;
                            tmp = 4;
                            break;
                        }
                        case -410956671: {
                            if (!((String)object).equals("container")) break;
                            tmp = 5;
                            break;
                        }
                        case -618561360: {
                            if (!((String)object).equals("baseContainer")) break;
                            tmp = 6;
                            break;
                        }
                    }
                    switch (tmp) {
                        default: {
                            n10 = -1;
                            break;
                        }
                        case 1: {
                            n10 = 5;
                            break;
                        }
                        case 2: {
                            n10 = 4;
                            break;
                        }
                        case 3: {
                            n10 = 3;
                            break;
                        }
                        case 4: {
                            n10 = 2;
                            break;
                        }
                        case 5: {
                            n10 = 1;
                            break;
                        }
                        case 6: {
                            n10 = 0;
                        }
                    }
                    switch (n10) {
                        default: {
                            object = object2;
                            break block41;
                        }
                        case 3: 
                        case 5: {
                            object = ax.T1.d.e((g)object2).J(3);
                            break block41;
                        }
                        case 2: {
                            object = ax.T1.d.e((g)object2).J(4);
                            break block41;
                        }
                        case 1: {
                            object = ax.T1.d.e((g)object2).J(1);
                            break block41;
                        }
                        case 0: 
                        case 4: 
                    }
                    object = ax.T1.d.e((g)object2).J(2);
                    break;
                }
                case 7: {
                    object = object2;
                    if (!"style".equals(xmlPullParser.getName())) break;
                    object = ax.T1.d.e((g)object2).D(string);
                    break;
                }
                case 6: {
                    object = ax.T1.d.e((g)object2).x("bold".equalsIgnoreCase(string));
                    break;
                }
                case 5: {
                    object = ax.q7.c.e(string);
                    object.getClass();
                    tmp = -1;
                    switch (((String)object).hashCode()) {
                        case 1679736913: {
                            if (!((String)object).equals("linethrough")) break;
                            tmp = 1;
                            break;
                        }
                        case 913457136: {
                            if (!((String)object).equals("nolinethrough")) break;
                            tmp = 2;
                            break;
                        }
                        case -1026963764: {
                            if (!((String)object).equals("underline")) break;
                            tmp = 3;
                            break;
                        }
                        case -1461280213: {
                            if (!((String)object).equals("nounderline")) break;
                            tmp = 4;
                            break;
                        }
                    }
                    switch (tmp) {
                        default: {
                            n10 = -1;
                            break;
                        }
                        case 1: {
                            n10 = 3;
                            break;
                        }
                        case 2: {
                            n10 = 2;
                            break;
                        }
                        case 3: {
                            n10 = 1;
                            break;
                        }
                        case 4: {
                            n10 = 0;
                        }
                    }
                    switch (n10) {
                        default: {
                            object = object2;
                            break block41;
                        }
                        case 3: {
                            object = ax.T1.d.e((g)object2).F(true);
                            break block41;
                        }
                        case 2: {
                            object = ax.T1.d.e((g)object2).F(false);
                            break block41;
                        }
                        case 1: {
                            object = ax.T1.d.e((g)object2).O(true);
                            break block41;
                        }
                        case 0: 
                    }
                    object = ax.T1.d.e((g)object2).O(false);
                    break;
                }
                case 4: {
                    object = ax.T1.d.e((g)object2).H(string);
                    break;
                }
                case 3: {
                    object = ax.T1.d.e((g)object2).L(ax.T1.d.g(string));
                    break;
                }
                case 2: {
                    object = ax.T1.d.e((g)object2).A(string);
                    break;
                }
                case 1: {
                    object = ax.T1.d.e((g)object2).y(string);
                    break;
                }
                case 0: {
                    object = ax.T1.d.e((g)object2).E("italic".equalsIgnoreCase(string));
                }
            }
            ++n9;
            object2 = object;
        }
        return object2;
    }

    private static String[] q(String string) {
        if ((string = string.trim()).isEmpty()) {
            return new String[0];
        }
        return d0.x1(string, "\\s+");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static long r(String var0, a var1_1) throws m {
        block23: {
            var14_2 = 4;
            var15_3 = ax.T1.d.b.matcher(var0);
            if (var15_3.matches()) {
                var10_4 = Long.parseLong(ax.S0.a.e(var15_3.group(1))) * 3600L;
                var8_5 = Long.parseLong(ax.S0.a.e(var15_3.group(2))) * 60L;
                var12_6 = Long.parseLong(ax.S0.a.e(var15_3.group(3)));
                var0 = var15_3.group(4);
                var6_7 = 0.0;
                var2_8 = var0 != null ? Double.parseDouble(var0) : 0.0;
                var0 = var15_3.group(5);
                var4_10 = var0 != null ? (double)((float)Long.parseLong(var0) / var1_1.a) : 0.0;
                var0 = var15_3.group(6);
                if (var0 == null) return (long)((var10_4 + var8_5 + var12_6 + var2_8 + var4_10 + var6_7) * 1000000.0);
                var6_7 = (double)Long.parseLong(var0) / (double)var1_1.b / (double)var1_1.a;
                return (long)((var10_4 + var8_5 + var12_6 + var2_8 + var4_10 + var6_7) * 1000000.0);
            }
            var15_3 = ax.T1.d.c.matcher(var0);
            if (!var15_3.matches()) {
                var1_1 = new StringBuilder();
                var1_1.append("Malformed time expression: ");
                var1_1.append(var0);
                throw new m(var1_1.toString());
            }
            var4_11 = Double.parseDouble(ax.S0.a.e(var15_3.group(1)));
            var0 = ax.S0.a.e(var15_3.group(2));
            var0.getClass();
            tmp = -1;
            switch (var0.hashCode()) {
                case 3494: {
                    if (!var0.equals("ms")) break;
                    tmp = 1;
                    break;
                }
                case 116: {
                    if (!var0.equals("t")) break;
                    tmp = 2;
                    break;
                }
                case 109: {
                    if (!var0.equals("m")) break;
                    tmp = 3;
                    break;
                }
                case 104: {
                    if (!var0.equals("h")) break;
                    tmp = 4;
                    break;
                }
                case 102: {
                    if (!var0.equals("f")) break;
                    tmp = 5;
                    break;
                }
            }
            switch (tmp) {
                default: {
                    var14_2 = -1;
                    break;
                }
                case 2: {
                    var14_2 = 3;
                    break;
                }
                case 3: {
                    var14_2 = 2;
                    break;
                }
                case 4: {
                    var14_2 = 1;
                    break;
                }
                case 5: {
                    var14_2 = 0;
                    break;
                }
                case 1: 
            }
            switch (var14_2) {
                default: {
                    var2_9 = var4_11;
                    return (long)(var2_9 * 1000000.0);
                }
                case 4: {
                    var2_9 = 1000.0;
                    break block23;
                }
                case 3: {
                    var2_9 = var1_1.c;
                    break block23;
                }
                case 2: {
                    var2_9 = 60.0;
                    ** GOTO lbl82
                }
                case 1: {
                    var2_9 = 3600.0;
lbl82:
                    // 2 sources

                    var2_9 = var4_11 * var2_9;
                    return (long)(var2_9 * 1000000.0);
                }
                case 0: 
            }
            var2_9 = var1_1.a;
        }
        var2_9 = var4_11 / var2_9;
        return (long)(var2_9 * 1000000.0);
    }

    private static b s(XmlPullParser object) {
        if ((object = e0.a(object, "extent")) == null) {
            return null;
        }
        Object object2 = g.matcher((CharSequence)object);
        if (!((Matcher)object2).matches()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Ignoring non-pixel tts extent: ");
            ((StringBuilder)object2).append((String)object);
            u.h("TtmlParser", ((StringBuilder)object2).toString());
            return null;
        }
        try {
            object2 = new b(Integer.parseInt(ax.S0.a.e(((Matcher)object2).group(1))), Integer.parseInt(ax.S0.a.e(((Matcher)object2).group(2))));
            return object2;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed tts extent: ");
            stringBuilder.append((String)object);
            u.h("TtmlParser", stringBuilder.toString());
            return null;
        }
    }

    @Override
    public /* synthetic */ void a() {
        s.b(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public k b(byte[] var1_1, int var2_4, int var3_5) {
        try {
            var15_6 = this.a.newPullParser();
            var16_7 = new HashMap<String, g>();
            var14_8 = new HashMap<String, e>();
            var13_9 = new HashMap<String, String>();
            var8_10 = new e("");
            var14_8.put("", (e)var8_10);
            var8_10 = new ByteArrayInputStream(var1_1 /* !! */ , var2_4, var3_5);
            var1_1 /* !! */  = null;
            var15_6.setInput((InputStream)var8_10, null);
            var17_11 = new ArrayDeque<Object>();
            var6_12 = var15_6.getEventType();
            var8_10 = ax.T1.d.i;
            var2_4 = 0;
            var3_5 = 15;
            var9_13 = null;
            while (var6_12 != 1) {
                block22: {
                    block19: {
                        block20: {
                            block18: {
                                block21: {
                                    var10_17 = (c)var17_11.peek();
                                    if (var2_4 != 0) break block19;
                                    var11_19 = var15_6.getName();
                                    if (var6_12 != 2) break block20;
                                    if ("tt".equals(var11_19)) {
                                        var8_10 = ax.T1.d.j(var15_6);
                                        var3_5 = ax.T1.d.h(var15_6, 15);
                                        var9_13 = ax.T1.d.s(var15_6);
                                    }
                                    if (var7_16 = ax.T1.d.f((String)var11_19)) break block21;
                                    var10_17 = new StringBuilder();
                                    var10_17.append("Ignoring unsupported tag: ");
                                    var10_17.append(var15_6.getName());
                                    u.f("TtmlParser", var10_17.toString());
                                    ** GOTO lbl51
                                }
                                if ("head".equals(var11_19)) {
                                    ax.T1.d.k(var15_6, var16_7, var3_5, (b)var9_13, var14_8, var13_9);
                                    var4_14 = var2_4;
                                } else {
                                    try {
                                        var11_19 = ax.T1.d.m(var15_6, (c)var10_17, var14_8, (a)var8_10);
                                        var17_11.push(var11_19);
                                        var4_14 = var2_4;
                                        if (var10_17 != null) {
                                            var10_17.a((c)var11_19);
                                            var4_14 = var2_4;
                                        }
                                        break block18;
                                    }
                                    catch (m var10_18) {
                                        u.i("TtmlParser", "Suppressing parser error", var10_18);
                                    }
lbl51:
                                    // 2 sources

                                    var4_14 = var2_4 + 1;
                                }
                            }
                            var12_20 /* !! */  = var1_1 /* !! */ ;
                            var11_19 = var9_13;
                            var10_17 = var8_10;
                            var5_15 = var3_5;
                            break block22;
                        }
                        if (var6_12 == 4) {
                            ((c)ax.S0.a.e(var10_17)).a(ax.T1.c.d(var15_6.getText()));
                            var12_20 /* !! */  = var1_1 /* !! */ ;
                            var11_19 = var9_13;
                            var10_17 = var8_10;
                            var4_14 = var2_4;
                            var5_15 = var3_5;
                            break block22;
                        } else {
                            var12_20 /* !! */  = var1_1 /* !! */ ;
                            var11_19 = var9_13;
                            var10_17 = var8_10;
                            var4_14 = var2_4;
                            var5_15 = var3_5;
                            if (var6_12 == 3) {
                                if (var15_6.getName().equals("tt")) {
                                    var1_1 /* !! */  = (byte[])new h;
                                    var1_1 /* !! */ (ax.S0.a.e((c)var17_11.peek()), var16_7, var14_8, var13_9);
                                }
                                var17_11.pop();
                                var5_15 = var3_5;
                                var4_14 = var2_4;
                                var10_17 = var8_10;
                                var11_19 = var9_13;
                                var12_20 /* !! */  = var1_1 /* !! */ ;
                            }
                        }
                        break block22;
                    }
                    if (var6_12 == 2) {
                        var4_14 = var2_4 + 1;
                        var12_20 /* !! */  = var1_1 /* !! */ ;
                        var11_19 = var9_13;
                        var10_17 = var8_10;
                        var5_15 = var3_5;
                    } else {
                        var12_20 /* !! */  = var1_1 /* !! */ ;
                        var11_19 = var9_13;
                        var10_17 = var8_10;
                        var4_14 = var2_4;
                        var5_15 = var3_5;
                        if (var6_12 == 3) {
                            var4_14 = var2_4 - 1;
                            var5_15 = var3_5;
                            var10_17 = var8_10;
                            var11_19 = var9_13;
                            var12_20 /* !! */  = var1_1 /* !! */ ;
                        }
                    }
                }
                var15_6.next();
                var6_12 = var15_6.getEventType();
                var1_1 /* !! */  = var12_20 /* !! */ ;
                var9_13 = var11_19;
                var8_10 = var10_17;
                var2_4 = var4_14;
                var3_5 = var5_15;
            }
            return (byte[])((k)ax.S0.a.e(var1_1 /* !! */ ));
        }
        catch (IOException var1_2) {
            throw new IllegalStateException("Unexpected error when reading input.", var1_2);
        }
        catch (XmlPullParserException var1_3) {
            throw new IllegalStateException("Unable to decode source", var1_3);
        }
    }

    @Override
    public void c(byte[] byArray, int n8, int n9, t.b b8, l<ax.N1.e> l8) {
        ax.N1.i.c(this.b(byArray, n8, n9), b8, l8);
    }

    @Override
    public int d() {
        return 1;
    }

    private static final class a {
        final float a;
        final int b;
        final int c;

        a(float f8, int n8, int n9) {
            this.a = f8;
            this.b = n8;
            this.c = n9;
        }
    }

    private static final class b {
        final int a;
        final int b;

        b(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }
}

