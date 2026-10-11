/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.graphics.Color;
import android.text.TextUtils;
import ax.S0.a;
import ax.q7.c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j {
    private static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map<String, Integer> d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        d = hashMap;
        hashMap.put("aliceblue", -984833);
        hashMap.put("antiquewhite", -332841);
        Integer n8 = -16711681;
        hashMap.put("aqua", n8);
        hashMap.put("aquamarine", -8388652);
        hashMap.put("azure", -983041);
        hashMap.put("beige", -657956);
        hashMap.put("bisque", -6972);
        hashMap.put("black", -16777216);
        hashMap.put("blanchedalmond", -5171);
        hashMap.put("blue", -16776961);
        hashMap.put("blueviolet", -7722014);
        hashMap.put("brown", -5952982);
        hashMap.put("burlywood", -2180985);
        hashMap.put("cadetblue", -10510688);
        hashMap.put("chartreuse", -8388864);
        hashMap.put("chocolate", -2987746);
        hashMap.put("coral", -32944);
        hashMap.put("cornflowerblue", -10185235);
        hashMap.put("cornsilk", -1828);
        hashMap.put("crimson", -2354116);
        hashMap.put("cyan", n8);
        hashMap.put("darkblue", -16777077);
        hashMap.put("darkcyan", -16741493);
        hashMap.put("darkgoldenrod", -4684277);
        n8 = -5658199;
        hashMap.put("darkgray", n8);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", n8);
        hashMap.put("darkkhaki", -4343957);
        hashMap.put("darkmagenta", -7667573);
        hashMap.put("darkolivegreen", -11179217);
        hashMap.put("darkorange", -29696);
        hashMap.put("darkorchid", -6737204);
        hashMap.put("darkred", -7667712);
        hashMap.put("darksalmon", -1468806);
        hashMap.put("darkseagreen", -7357297);
        hashMap.put("darkslateblue", -12042869);
        n8 = -13676721;
        hashMap.put("darkslategray", n8);
        hashMap.put("darkslategrey", n8);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        hashMap.put("deeppink", -60269);
        hashMap.put("deepskyblue", -16728065);
        n8 = -9868951;
        hashMap.put("dimgray", n8);
        hashMap.put("dimgrey", n8);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        hashMap.put("floralwhite", -1296);
        hashMap.put("forestgreen", -14513374);
        n8 = -65281;
        hashMap.put("fuchsia", n8);
        hashMap.put("gainsboro", -2302756);
        hashMap.put("ghostwhite", -460545);
        hashMap.put("gold", -10496);
        hashMap.put("goldenrod", -2448096);
        Integer n9 = -8355712;
        hashMap.put("gray", n9);
        hashMap.put("green", -16744448);
        hashMap.put("greenyellow", -5374161);
        hashMap.put("grey", n9);
        hashMap.put("honeydew", -983056);
        hashMap.put("hotpink", -38476);
        hashMap.put("indianred", -3318692);
        hashMap.put("indigo", -11861886);
        hashMap.put("ivory", -16);
        hashMap.put("khaki", -989556);
        hashMap.put("lavender", -1644806);
        hashMap.put("lavenderblush", -3851);
        hashMap.put("lawngreen", -8586240);
        hashMap.put("lemonchiffon", -1331);
        hashMap.put("lightblue", -5383962);
        hashMap.put("lightcoral", -1015680);
        hashMap.put("lightcyan", -2031617);
        hashMap.put("lightgoldenrodyellow", -329006);
        n9 = -2894893;
        hashMap.put("lightgray", n9);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", n9);
        hashMap.put("lightpink", -18751);
        hashMap.put("lightsalmon", -24454);
        hashMap.put("lightseagreen", -14634326);
        hashMap.put("lightskyblue", -7876870);
        n9 = -8943463;
        hashMap.put("lightslategray", n9);
        hashMap.put("lightslategrey", n9);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        hashMap.put("lime", -16711936);
        hashMap.put("limegreen", -13447886);
        hashMap.put("linen", -331546);
        hashMap.put("magenta", n8);
        hashMap.put("maroon", -8388608);
        hashMap.put("mediumaquamarine", -10039894);
        hashMap.put("mediumblue", -16777011);
        hashMap.put("mediumorchid", -4565549);
        hashMap.put("mediumpurple", -7114533);
        hashMap.put("mediumseagreen", -12799119);
        hashMap.put("mediumslateblue", -8689426);
        hashMap.put("mediumspringgreen", -16713062);
        hashMap.put("mediumturquoise", -12004916);
        hashMap.put("mediumvioletred", -3730043);
        hashMap.put("midnightblue", -15132304);
        hashMap.put("mintcream", -655366);
        hashMap.put("mistyrose", -6943);
        hashMap.put("moccasin", -6987);
        hashMap.put("navajowhite", -8531);
        hashMap.put("navy", -16777088);
        hashMap.put("oldlace", -133658);
        hashMap.put("olive", -8355840);
        hashMap.put("olivedrab", -9728477);
        hashMap.put("orange", -23296);
        hashMap.put("orangered", -47872);
        hashMap.put("orchid", -2461482);
        hashMap.put("palegoldenrod", -1120086);
        hashMap.put("palegreen", -6751336);
        hashMap.put("paleturquoise", -5247250);
        hashMap.put("palevioletred", -2396013);
        hashMap.put("papayawhip", -4139);
        hashMap.put("peachpuff", -9543);
        hashMap.put("peru", -3308225);
        hashMap.put("pink", -16181);
        hashMap.put("plum", -2252579);
        hashMap.put("powderblue", -5185306);
        hashMap.put("purple", -8388480);
        hashMap.put("rebeccapurple", -10079335);
        hashMap.put("red", -65536);
        hashMap.put("rosybrown", -4419697);
        hashMap.put("royalblue", -12490271);
        hashMap.put("saddlebrown", -7650029);
        hashMap.put("salmon", -360334);
        hashMap.put("sandybrown", -744352);
        hashMap.put("seagreen", -13726889);
        hashMap.put("seashell", -2578);
        hashMap.put("sienna", -6270419);
        hashMap.put("silver", -4144960);
        hashMap.put("skyblue", -7876885);
        hashMap.put("slateblue", -9807155);
        n8 = -9404272;
        hashMap.put("slategray", n8);
        hashMap.put("slategrey", n8);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        hashMap.put("steelblue", -12156236);
        hashMap.put("tan", -2968436);
        hashMap.put("teal", -16744320);
        hashMap.put("thistle", -2572328);
        hashMap.put("tomato", -40121);
        hashMap.put("transparent", 0);
        hashMap.put("turquoise", -12525360);
        hashMap.put("violet", -1146130);
        hashMap.put("wheat", -663885);
        hashMap.put("white", -1);
        hashMap.put("whitesmoke", -657931);
        hashMap.put("yellow", -256);
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String object, boolean bl) {
        ax.S0.a.a(TextUtils.isEmpty((CharSequence)object) ^ true);
        String string = ((String)object).replace(" ", "");
        if (string.charAt(0) == '#') {
            int n8 = (int)Long.parseLong(string.substring(1), 16);
            if (string.length() == 7) {
                return 0xFF000000 | n8;
            }
            if (string.length() == 9) {
                return (n8 & 0xFF) << 24 | n8 >>> 8;
            }
            throw new IllegalArgumentException();
        }
        if (string.startsWith("rgba")) {
            object = bl ? c : b;
            if (((Matcher)(object = ((Pattern)object).matcher(string))).matches()) {
                int n9 = bl ? (int)(Float.parseFloat(ax.S0.a.e(((Matcher)object).group(4))) * 255.0f) : Integer.parseInt(ax.S0.a.e(((Matcher)object).group(4)), 10);
                return Color.argb((int)n9, (int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(1)), 10), (int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(2)), 10), (int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(3)), 10));
            }
        } else if (string.startsWith("rgb")) {
            object = a.matcher(string);
            if (((Matcher)object).matches()) {
                return Color.rgb((int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(1)), 10), (int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(2)), 10), (int)Integer.parseInt(ax.S0.a.e(((Matcher)object).group(3)), 10));
            }
        } else {
            object = d.get(ax.q7.c.e(string));
            if (object != null) {
                return (Integer)object;
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String string) {
        return j.a(string, true);
    }

    public static int c(String string) {
        return j.a(string, false);
    }
}

