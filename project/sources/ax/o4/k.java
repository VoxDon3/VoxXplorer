package ax.o4;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import ax.o4.C2690b;
import ax.o4.C2693e;
import ax.o4.C2695g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class k {
    private int d;
    private C2695g a = null;
    private C2695g.J b = null;
    private boolean c = false;
    private boolean e = false;
    private h f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {
        private static final Map<String, C2693e.a> a;

        static {
            HashMap hashMap = new HashMap(10);
            a = hashMap;
            hashMap.put("none", C2693e.a.none);
            hashMap.put("xMinYMin", C2693e.a.xMinYMin);
            hashMap.put("xMidYMin", C2693e.a.xMidYMin);
            hashMap.put("xMaxYMin", C2693e.a.xMaxYMin);
            hashMap.put("xMinYMid", C2693e.a.xMinYMid);
            hashMap.put("xMidYMid", C2693e.a.xMidYMid);
            hashMap.put("xMaxYMid", C2693e.a.xMaxYMid);
            hashMap.put("xMinYMax", C2693e.a.xMinYMax);
            hashMap.put("xMidYMax", C2693e.a.xMidYMax);
            hashMap.put("xMaxYMax", C2693e.a.xMaxYMax);
        }

        static C2693e.a a(String str) {
            return a.get(str);
        }
    }

    private static class c {
        private static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
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
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
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
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
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
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        static Integer a(String str) {
            return a.get(str);
        }
    }

    private static class d {
        private static final Map<String, C2695g.C2710p> a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            C2695g.d0 d0Var = C2695g.d0.pt;
            hashMap.put("xx-small", new C2695g.C2710p(0.694f, d0Var));
            hashMap.put("x-small", new C2695g.C2710p(0.833f, d0Var));
            hashMap.put("small", new C2695g.C2710p(10.0f, d0Var));
            hashMap.put("medium", new C2695g.C2710p(12.0f, d0Var));
            hashMap.put("large", new C2695g.C2710p(14.4f, d0Var));
            hashMap.put("x-large", new C2695g.C2710p(17.3f, d0Var));
            hashMap.put("xx-large", new C2695g.C2710p(20.7f, d0Var));
            C2695g.d0 d0Var2 = C2695g.d0.percent;
            hashMap.put("smaller", new C2695g.C2710p(83.33f, d0Var2));
            hashMap.put("larger", new C2695g.C2710p(120.0f, d0Var2));
        }

        static C2695g.C2710p a(String str) {
            return a.get(str);
        }
    }

    private static class e {
        private static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(13);
            a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        static Integer a(String str) {
            return a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            k.this.c1(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, g> P1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    P1.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    P1.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g d(String str) {
            g gVar = P1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, h> H0 = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    H0.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    H0.put(hVar.name(), hVar);
                }
            }
        }

        public static h d(String str) {
            h hVar = H0.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {
        String a;
        int c;
        int b = 0;
        private C2692d d = new C2692d();

        i(String str) {
            this.c = 0;
            String trim = str.trim();
            this.a = trim;
            this.c = trim.length();
        }

        void A() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !k(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        String b() {
            int i = this.b;
            while (!h() && !k(this.a.charAt(this.b))) {
                this.b++;
            }
            String substring = this.a.substring(i, this.b);
            this.b = i;
            return substring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        boolean g(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        boolean h() {
            return this.b == this.c;
        }

        boolean i() {
            int i = this.b;
            if (i == this.c) {
                return false;
            }
            char charAt = this.a.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                return charAt >= 'A' && charAt <= 'Z';
            }
            return true;
        }

        boolean j(int i) {
            return i == 10 || i == 13;
        }

        boolean k(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        Integer l() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            String str = this.a;
            this.b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        Boolean m() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(charAt == '1');
        }

        float n() {
            float b = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(b)) {
                this.b = this.d.a();
            }
            return b;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int charAt = this.a.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = a();
            }
            int i2 = this.b;
            while (k(charAt)) {
                charAt = a();
            }
            if (charAt == 40) {
                this.b++;
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        C2695g.C2710p p() {
            float n = n();
            if (Float.isNaN(n)) {
                return null;
            }
            C2695g.d0 v = v();
            return v == null ? new C2695g.C2710p(n, C2695g.d0.px) : new C2695g.C2710p(n, v);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char charAt = this.a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a = a();
            while (a != -1 && a != charAt) {
                a = a();
            }
            if (a == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return this.a.substring(i + 1, i2);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c) {
            return t(c, false);
        }

        String t(char c, boolean z) {
            if (h()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if ((!z && k(charAt)) || charAt == c) {
                return null;
            }
            int i = this.b;
            int a = a();
            while (a != -1 && a != c && (z || !k(a))) {
                a = a();
            }
            return this.a.substring(i, this.b);
        }

        String u(char c) {
            return t(c, true);
        }

        C2695g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                this.b++;
                return C2695g.d0.percent;
            }
            int i = this.b;
            if (i > this.c - 2) {
                return null;
            }
            try {
                C2695g.d0 valueOf = C2695g.d0.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char charAt = this.a.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.b = i;
                return null;
            }
            int a = a();
            while (true) {
                if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                    break;
                }
                a = a();
            }
            return this.a.substring(i, this.b);
        }

        float x() {
            z();
            float b = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(b)) {
                this.b = this.d.a();
            }
            return b;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i = this.b;
            this.b = this.c;
            return this.a.substring(i);
        }

        boolean z() {
            A();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {
        private XmlPullParser a;

        public j(XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.a.getAttributeName(i);
            if (this.a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.a.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(C2695g.C2699d c2699d, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 12:
                    c2699d.o = o0(trim);
                    break;
                case 13:
                    c2699d.p = o0(trim);
                    break;
                case 14:
                    C2695g.C2710p o0 = o0(trim);
                    c2699d.q = o0;
                    if (o0.j()) {
                        throw new ax.o4.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static Set<String> A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(C2695g.C2700e c2700e, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (a.b[g.d(attributes.getLocalName(i2)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    c2700e.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new ax.o4.j("Invalid value for attribute clipPathUnits");
                    }
                    c2700e.p = Boolean.TRUE;
                }
            }
        }
    }

    private static C2695g.C2710p[] B0(String str) {
        C2695g.C2710p p;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (p = iVar.p()) == null || p.j()) {
            return null;
        }
        float b2 = p.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(p);
        while (!iVar.h()) {
            iVar.z();
            C2695g.C2710p p2 = iVar.p();
            if (p2 == null || p2.j()) {
                return null;
            }
            arrayList.add(p2);
            b2 += p2.b();
        }
        if (b2 == 0.0f) {
            return null;
        }
        return (C2695g.C2710p[]) arrayList.toArray(new C2695g.C2710p[arrayList.size()]);
    }

    private void C(C2695g.G g2, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 21:
                    g2.g(z0(trim));
                    break;
                case 22:
                    g2.i(trim);
                    break;
                case 23:
                    g2.k(F0(trim));
                    break;
                case 24:
                    g2.c(A0(trim));
                    break;
                case 25:
                    List<String> i0 = i0(trim);
                    g2.e(i0 != null ? new HashSet(i0) : new HashSet(0));
                    break;
            }
        }
    }

    private static C2695g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return C2695g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return C2695g.E.c.Round;
        }
        if ("square".equals(str)) {
            return C2695g.E.c.Square;
        }
        return null;
    }

    private void D(C2695g.L l, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l.c = attributes.getValue(i2).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if ("default".equals(trim)) {
                    l.d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        l.d = Boolean.TRUE;
                        return;
                    }
                    throw new ax.o4.j("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private static C2695g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return C2695g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return C2695g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return C2695g.E.d.Bevel;
        }
        return null;
    }

    private void E(C2695g.C2703i c2703i, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 10:
                    C2695g.C2710p o0 = o0(trim);
                    c2703i.q = o0;
                    if (o0.j()) {
                        throw new ax.o4.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    C2695g.C2710p o02 = o0(trim);
                    c2703i.r = o02;
                    if (o02.j()) {
                        throw new ax.o4.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c2703i.o = o0(trim);
                    break;
                case 13:
                    c2703i.p = o0(trim);
                    break;
            }
        }
    }

    private static void E0(C2695g.L l, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", HttpUrl.FRAGMENT_ENCODE_SET));
        while (true) {
            String s = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String u = iVar.u(';');
            if (u == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l.f == null) {
                    l.f = new C2695g.E();
                }
                S0(l.f, s, u);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F(ax.o4.C2695g.AbstractC2704j r5, org.xml.sax.Attributes r6) throws ax.o4.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = ax.o4.k.a.b
            java.lang.String r3 = r6.getLocalName(r0)
            ax.o4.k$g r3 = ax.o4.k.g.d(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            ax.o4.g$k r2 = ax.o4.C2695g.EnumC2705k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            ax.o4.j r5 = new ax.o4.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.J0(r1)
            r5.j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.i = r1
            goto L8c
        L6a:
            ax.o4.j r5 = new ax.o4.j
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.k.F(ax.o4.g$j, org.xml.sax.Attributes):void");
    }

    private static Set<String> F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r = iVar.r();
            int indexOf = r.indexOf(45);
            if (indexOf != -1) {
                r = r.substring(0, indexOf);
            }
            hashSet.add(new Locale(r, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET).getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(C2695g.C2709o c2709o, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                c2709o.q = o0(trim);
            } else if (i3 == 2) {
                c2709o.r = o0(trim);
            } else if (i3 == 3) {
                C2695g.C2710p o0 = o0(trim);
                c2709o.s = o0;
                if (o0.j()) {
                    throw new ax.o4.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                C2695g.C2710p o02 = o0(trim);
                c2709o.t = o02;
                if (o02.j()) {
                    throw new ax.o4.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 != 6) {
                if (i3 == 7) {
                    w0(c2709o, trim);
                }
            } else if (HttpUrl.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                c2709o.p = trim;
            }
        }
    }

    private static C2695g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return C2695g.E.f.Middle;
            case "end":
                return C2695g.E.f.End;
            case "start":
                return C2695g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(C2695g.C2711q c2711q, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    c2711q.o = o0(trim);
                    break;
                case 16:
                    c2711q.p = o0(trim);
                    break;
                case 17:
                    c2711q.q = o0(trim);
                    break;
                case 18:
                    c2711q.r = o0(trim);
                    break;
            }
        }
    }

    private static C2695g.E.EnumC0397g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return C2695g.E.EnumC0397g.LineThrough;
            case "underline":
                return C2695g.E.EnumC0397g.Underline;
            case "none":
                return C2695g.E.EnumC0397g.None;
            case "blink":
                return C2695g.E.EnumC0397g.Blink;
            case "overline":
                return C2695g.E.EnumC0397g.Overline;
            default:
                return null;
        }
    }

    private void I(C2695g.M m, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    m.m = o0(trim);
                    break;
                case 16:
                    m.n = o0(trim);
                    break;
                case 17:
                    m.o = o0(trim);
                    break;
                case 18:
                    m.p = o0(trim);
                    break;
            }
        }
    }

    private static C2695g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return C2695g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return C2695g.E.h.RTL;
        }
        return null;
    }

    private void J(C2695g.C2712r c2712r, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[g.d(attributes.getLocalName(i2)).ordinal()]) {
                case 26:
                    c2712r.r = o0(trim);
                    break;
                case 27:
                    c2712r.s = o0(trim);
                    break;
                case 28:
                    C2695g.C2710p o0 = o0(trim);
                    c2712r.t = o0;
                    if (o0.j()) {
                        throw new ax.o4.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    C2695g.C2710p o02 = o0(trim);
                    c2712r.u = o02;
                    if (o02.j()) {
                        throw new ax.o4.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(trim)) {
                        if (!"userSpaceOnUse".equals(trim)) {
                            throw new ax.o4.j("Invalid value for attribute markerUnits");
                        }
                        c2712r.q = true;
                        break;
                    } else {
                        c2712r.q = false;
                        break;
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        c2712r.v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c2712r.v = Float.valueOf(f0(trim));
                        break;
                    }
            }
        }
    }

    private Matrix J0(String str) throws ax.o4.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String o = iVar.o();
            if (o == null) {
                throw new ax.o4.j("Bad transform function encountered in transform list: " + str);
            }
            switch (o) {
                case "matrix":
                    iVar.A();
                    float n = iVar.n();
                    iVar.z();
                    float n2 = iVar.n();
                    iVar.z();
                    float n3 = iVar.n();
                    iVar.z();
                    float n4 = iVar.n();
                    iVar.z();
                    float n5 = iVar.n();
                    iVar.z();
                    float n6 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n6) && iVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{n, n3, n5, n2, n4, n6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    iVar.A();
                    float n7 = iVar.n();
                    float x = iVar.x();
                    float x2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(n7) || !iVar.f(')')) {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(x)) {
                        matrix.preRotate(n7);
                        break;
                    } else if (!Float.isNaN(x2)) {
                        matrix.preRotate(n7, x, x2);
                        break;
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                case "scale":
                    iVar.A();
                    float n8 = iVar.n();
                    float x3 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n8) && iVar.f(')')) {
                        if (!Float.isNaN(x3)) {
                            matrix.preScale(n8, x3);
                            break;
                        } else {
                            matrix.preScale(n8, n8);
                            break;
                        }
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    iVar.A();
                    float n9 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n9) && iVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(n9)), 0.0f);
                        break;
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    iVar.A();
                    float n10 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n10) && iVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(n10)));
                        break;
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                case "translate":
                    iVar.A();
                    float n11 = iVar.n();
                    float x4 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n11) && iVar.f(')')) {
                        if (!Float.isNaN(x4)) {
                            matrix.preTranslate(n11, x4);
                            break;
                        } else {
                            matrix.preTranslate(n11, 0.0f);
                            break;
                        }
                    } else {
                        throw new ax.o4.j("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new ax.o4.j("Invalid transform list fn: " + o + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(C2695g.C2713s c2713s, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                c2713s.q = o0(trim);
            } else if (i3 == 2) {
                c2713s.r = o0(trim);
            } else if (i3 == 3) {
                C2695g.C2710p o0 = o0(trim);
                c2713s.s = o0;
                if (o0.j()) {
                    throw new ax.o4.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                C2695g.C2710p o02 = o0(trim);
                c2713s.t = o02;
                if (o02.j()) {
                    throw new ax.o4.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i3 != 43) {
                if (i3 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    c2713s.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new ax.o4.j("Invalid value for attribute maskContentUnits");
                    }
                    c2713s.p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                c2713s.o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new ax.o4.j("Invalid value for attribute maskUnits");
                }
                c2713s.o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws ax.o4.j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new ax.o4.j("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new ax.o4.j("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new ax.o4.j("SVG parse error", e4);
        }
    }

    private void L(C2695g.C2716v c2716v, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 8) {
                c2716v.o = u0(trim);
            } else if (i3 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(f0(trim));
                c2716v.p = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    throw new ax.o4.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z) throws ax.o4.j {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                j jVar = new j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        i iVar = new i(newPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            X0(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            p(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            c1(newPullParser.getText());
                        }
                    } else if (z && this.a.m() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            K0(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                o();
            } catch (IOException e2) {
                throw new ax.o4.j("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new ax.o4.j("XML parser problem", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(ax.o4.C2695g.C2719y r6, org.xml.sax.Attributes r7) throws ax.o4.j {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = ax.o4.k.a.b
            java.lang.String r3 = r7.getLocalName(r0)
            ax.o4.k$g r3 = ax.o4.k.g.d(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc9
            r3 = 2
            if (r2 == r3) goto Lc2
            r3 = 3
            if (r2 == r3) goto Lad
            r3 = 4
            if (r2 == r3) goto L98
            r3 = 6
            if (r2 == r3) goto L7d
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5f;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lcf
        L37:
            android.graphics.Matrix r1 = r5.J0(r1)
            r6.s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.r = r1
            goto Lcf
        L57:
            ax.o4.j r6 = new ax.o4.j
            java.lang.String r7 = "Invalid value for attribute patternContentUnits"
            r6.<init>(r7)
            throw r6
        L5f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.q = r1
            goto Lcf
        L75:
            ax.o4.j r6 = new ax.o4.j
            java.lang.String r7 = "Invalid value for attribute patternUnits"
            r6.<init>(r7)
            throw r6
        L7d:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L95
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L95:
            r6.x = r1
            goto Lcf
        L98:
            ax.o4.g$p r1 = o0(r1)
            r6.w = r1
            boolean r1 = r1.j()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            ax.o4.j r6 = new ax.o4.j
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            throw r6
        Lad:
            ax.o4.g$p r1 = o0(r1)
            r6.v = r1
            boolean r1 = r1.j()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            ax.o4.j r6 = new ax.o4.j
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        Lc2:
            ax.o4.g$p r1 = o0(r1)
            r6.u = r1
            goto Lcf
        Lc9:
            ax.o4.g$p r1 = o0(r1)
            r6.t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.k.M(ax.o4.g$y, org.xml.sax.Attributes):void");
    }

    private static C2695g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C2695g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return C2695g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(C2695g.C2720z c2720z, Attributes attributes, String str) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.d(attributes.getLocalName(i2)) == g.points) {
                i iVar = new i(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float n = iVar.n();
                    if (Float.isNaN(n)) {
                        throw new ax.o4.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float n2 = iVar.n();
                    if (Float.isNaN(n2)) {
                        throw new ax.o4.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(n));
                    arrayList.add(Float.valueOf(n2));
                }
                c2720z.o = new float[arrayList.size()];
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    c2720z.o[i3] = ((Float) obj).floatValue();
                    i3++;
                }
            }
        }
    }

    private static C2695g.C2697b N0(String str) throws ax.o4.j {
        i iVar = new i(str);
        iVar.A();
        float n = iVar.n();
        iVar.z();
        float n2 = iVar.n();
        iVar.z();
        float n3 = iVar.n();
        iVar.z();
        float n4 = iVar.n();
        if (Float.isNaN(n) || Float.isNaN(n2) || Float.isNaN(n3) || Float.isNaN(n4)) {
            throw new ax.o4.j("Invalid viewBox definition - should have four numbers");
        }
        if (n3 < 0.0f) {
            throw new ax.o4.j("Invalid viewBox. width cannot be negative");
        }
        if (n4 >= 0.0f) {
            return new C2695g.C2697b(n, n2, n3, n4);
        }
        throw new ax.o4.j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O(ax.o4.C2695g.Q r5, org.xml.sax.Attributes r6) throws ax.o4.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = ax.o4.k.a.b
            java.lang.String r3 = r6.getLocalName(r0)
            ax.o4.k$g r3 = ax.o4.k.g.d(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            ax.o4.g$p r1 = o0(r1)
            r5.o = r1
            boolean r1 = r1.j()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            ax.o4.j r5 = new ax.o4.j
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            ax.o4.g$p r1 = o0(r1)
            r5.n = r1
            goto L5b
        L47:
            ax.o4.g$p r1 = o0(r1)
            r5.m = r1
            goto L5b
        L4e:
            ax.o4.g$p r1 = o0(r1)
            r5.q = r1
            goto L5b
        L55:
            ax.o4.g$p r1 = o0(r1)
            r5.p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.k.O(ax.o4.g$Q, org.xml.sax.Attributes):void");
    }

    private void O0(Attributes attributes) throws ax.o4.j {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2716v c2716v = new C2695g.C2716v();
        c2716v.a = this.a;
        c2716v.b = this.b;
        D(c2716v, attributes);
        S(c2716v, attributes);
        W(c2716v, attributes);
        C(c2716v, attributes);
        L(c2716v, attributes);
        this.b.m(c2716v);
    }

    private void P(C2695g.B b2, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                b2.o = o0(trim);
            } else if (i3 == 2) {
                b2.p = o0(trim);
            } else if (i3 == 3) {
                C2695g.C2710p o0 = o0(trim);
                b2.q = o0;
                if (o0.j()) {
                    throw new ax.o4.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                C2695g.C2710p o02 = o0(trim);
                b2.r = o02;
                if (o02.j()) {
                    throw new ax.o4.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i3 == 10) {
                C2695g.C2710p o03 = o0(trim);
                b2.s = o03;
                if (o03.j()) {
                    throw new ax.o4.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i3 != 11) {
                continue;
            } else {
                C2695g.C2710p o04 = o0(trim);
                b2.t = o04;
                if (o04.j()) {
                    throw new ax.o4.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws ax.o4.j {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2719y c2719y = new C2695g.C2719y();
        c2719y.a = this.a;
        c2719y.b = this.b;
        D(c2719y, attributes);
        S(c2719y, attributes);
        C(c2719y, attributes);
        Y(c2719y, attributes);
        M(c2719y, attributes);
        this.b.m(c2719y);
        this.b = c2719y;
    }

    private void Q(C2695g.F f2, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                f2.q = o0(trim);
            } else if (i3 == 2) {
                f2.r = o0(trim);
            } else if (i3 == 3) {
                C2695g.C2710p o0 = o0(trim);
                f2.s = o0;
                if (o0.j()) {
                    throw new ax.o4.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                C2695g.C2710p o02 = o0(trim);
                f2.t = o02;
                if (o02.j()) {
                    throw new ax.o4.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i3 == 5) {
                f2.u = trim;
            }
        }
    }

    private void Q0(Attributes attributes) throws ax.o4.j {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2720z a2 = new C2695g.A();
        a2.a = this.a;
        a2.b = this.b;
        D(a2, attributes);
        S(a2, attributes);
        W(a2, attributes);
        C(a2, attributes);
        N(a2, attributes, "polygon");
        this.b.m(a2);
    }

    private void R(C2695g.D d2, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (a.b[g.d(attributes.getLocalName(i2)).ordinal()] == 37) {
                d2.h = n0(trim);
            }
        }
    }

    private void R0(Attributes attributes) throws ax.o4.j {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2720z c2720z = new C2695g.C2720z();
        c2720z.a = this.a;
        c2720z.b = this.b;
        D(c2720z, attributes);
        S(c2720z, attributes);
        W(c2720z, attributes);
        C(c2720z, attributes);
        N(c2720z, attributes, "polyline");
        this.b.m(c2720z);
    }

    private void S(C2695g.L l, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
                if (i3 == 45) {
                    E0(l, trim);
                } else if (i3 != 46) {
                    if (l.e == null) {
                        l.e = new C2695g.E();
                    }
                    S0(l.e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    l.g = C2690b.f(trim);
                }
            }
        }
    }

    static void S0(C2695g.E e2, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[g.d(str).ordinal()]) {
                case 47:
                    C2695g.O t0 = t0(str2);
                    e2.c0 = t0;
                    if (t0 != null) {
                        e2.q |= 1;
                        break;
                    }
                    break;
                case 48:
                    C2695g.E.a e0 = e0(str2);
                    e2.d0 = e0;
                    if (e0 != null) {
                        e2.q |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float r0 = r0(str2);
                    e2.e0 = r0;
                    if (r0 != null) {
                        e2.q |= 4;
                        break;
                    }
                    break;
                case 50:
                    C2695g.O t02 = t0(str2);
                    e2.f0 = t02;
                    if (t02 != null) {
                        e2.q |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float r02 = r0(str2);
                    e2.g0 = r02;
                    if (r02 != null) {
                        e2.q |= 16;
                        break;
                    }
                    break;
                case 52:
                    e2.h0 = o0(str2);
                    e2.q |= 32;
                    break;
                case 53:
                    C2695g.E.c C0 = C0(str2);
                    e2.i0 = C0;
                    if (C0 != null) {
                        e2.q |= 64;
                        break;
                    }
                    break;
                case 54:
                    C2695g.E.d D0 = D0(str2);
                    e2.j0 = D0;
                    if (D0 != null) {
                        e2.q |= 128;
                        break;
                    }
                    break;
                case 55:
                    e2.k0 = Float.valueOf(f0(str2));
                    e2.q |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        C2695g.C2710p[] B0 = B0(str2);
                        e2.l0 = B0;
                        if (B0 != null) {
                            e2.q |= 512;
                            break;
                        }
                    } else {
                        e2.l0 = null;
                        e2.q |= 512;
                        break;
                    }
                    break;
                case 57:
                    e2.m0 = o0(str2);
                    e2.q |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    break;
                case 58:
                    e2.n0 = r0(str2);
                    e2.q |= 2048;
                    break;
                case 59:
                    e2.o0 = b0(str2);
                    e2.q |= 4096;
                    break;
                case 60:
                    h0(e2, str2);
                    break;
                case 61:
                    List<String> i0 = i0(str2);
                    e2.p0 = i0;
                    if (i0 != null) {
                        e2.q |= 8192;
                        break;
                    }
                    break;
                case 62:
                    C2695g.C2710p j0 = j0(str2);
                    e2.q0 = j0;
                    if (j0 != null) {
                        e2.q |= Http2Stream.EMIT_BUFFER_SIZE;
                        break;
                    }
                    break;
                case 63:
                    Integer l0 = l0(str2);
                    e2.r0 = l0;
                    if (l0 != null) {
                        e2.q |= 32768;
                        break;
                    }
                    break;
                case 64:
                    C2695g.E.b k0 = k0(str2);
                    e2.s0 = k0;
                    if (k0 != null) {
                        e2.q |= 65536;
                        break;
                    }
                    break;
                case 65:
                    C2695g.E.EnumC0397g H0 = H0(str2);
                    e2.t0 = H0;
                    if (H0 != null) {
                        e2.q |= 131072;
                        break;
                    }
                    break;
                case 66:
                    C2695g.E.h I0 = I0(str2);
                    e2.u0 = I0;
                    if (I0 != null) {
                        e2.q |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    C2695g.E.f G0 = G0(str2);
                    e2.v0 = G0;
                    if (G0 != null) {
                        e2.q |= 262144;
                        break;
                    }
                    break;
                case 68:
                    Boolean s0 = s0(str2);
                    e2.w0 = s0;
                    if (s0 != null) {
                        e2.q |= 524288;
                        break;
                    }
                    break;
                case 69:
                    String m0 = m0(str2, str);
                    e2.y0 = m0;
                    e2.z0 = m0;
                    e2.A0 = m0;
                    e2.q |= 14680064;
                    break;
                case 70:
                    e2.y0 = m0(str2, str);
                    e2.q |= 2097152;
                    break;
                case 71:
                    e2.z0 = m0(str2, str);
                    e2.q |= 4194304;
                    break;
                case 72:
                    e2.A0 = m0(str2, str);
                    e2.q |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(ax.m.j.K0) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e2.B0 = Boolean.valueOf(!str2.equals("none"));
                            e2.q |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(ax.m.j.K0) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e2.C0 = Boolean.valueOf(str2.equals("visible"));
                            e2.q |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e2.D0 = C2695g.C0398g.b();
                    } else {
                        try {
                            e2.D0 = b0(str2);
                        } catch (ax.o4.j e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                    }
                    e2.q |= 67108864;
                    break;
                case 76:
                    e2.E0 = r0(str2);
                    e2.q |= 134217728;
                    break;
                case 77:
                    C2695g.C2698c a0 = a0(str2);
                    e2.x0 = a0;
                    if (a0 != null) {
                        e2.q |= 1048576;
                        break;
                    }
                    break;
                case 78:
                    e2.F0 = m0(str2, str);
                    e2.q |= 268435456;
                    break;
                case 79:
                    e2.G0 = e0(str2);
                    e2.q |= 536870912;
                    break;
                case 80:
                    e2.H0 = m0(str2, str);
                    e2.q |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e2.I0 = C2695g.C0398g.b();
                    } else {
                        try {
                            e2.I0 = b0(str2);
                        } catch (ax.o4.j e4) {
                            Log.w("SVGParser", e4.getMessage());
                            return;
                        }
                    }
                    e2.q |= 2147483648L;
                    break;
                case 82:
                    e2.J0 = r0(str2);
                    e2.q |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e2.K0 = C2695g.C0398g.b();
                    } else {
                        try {
                            e2.K0 = b0(str2);
                        } catch (ax.o4.j e5) {
                            Log.w("SVGParser", e5.getMessage());
                            return;
                        }
                    }
                    e2.q |= 8589934592L;
                    break;
                case 84:
                    e2.L0 = r0(str2);
                    e2.q |= 17179869184L;
                    break;
                case 85:
                    C2695g.E.i M0 = M0(str2);
                    e2.M0 = M0;
                    if (M0 != null) {
                        e2.q |= 34359738368L;
                        break;
                    }
                    break;
                case 86:
                    C2695g.E.e y0 = y0(str2);
                    e2.N0 = y0;
                    if (y0 != null) {
                        e2.q |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (ax.o4.j unused) {
        }
    }

    private void T(C2695g.U u, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (a.b[g.d(attributes.getLocalName(i2)).ordinal()] == 6 && (HttpUrl.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                u.o = trim;
            }
        }
    }

    private void T0(Attributes attributes) throws ax.o4.j {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.Q q = new C2695g.Q();
        q.a = this.a;
        q.b = this.b;
        D(q, attributes);
        S(q, attributes);
        F(q, attributes);
        O(q, attributes);
        this.b.m(q);
        this.b = q;
    }

    private void U(C2695g.Z z, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 != 6) {
                if (i3 == 39) {
                    z.p = o0(trim);
                }
            } else if (HttpUrl.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                z.o = trim;
            }
        }
    }

    private void U0(Attributes attributes) throws ax.o4.j {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.B b2 = new C2695g.B();
        b2.a = this.a;
        b2.b = this.b;
        D(b2, attributes);
        S(b2, attributes);
        W(b2, attributes);
        C(b2, attributes);
        P(b2, attributes);
        this.b.m(b2);
    }

    private void V(C2695g.a0 a0Var, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                a0Var.o = p0(trim);
            } else if (i3 == 2) {
                a0Var.p = p0(trim);
            } else if (i3 == 19) {
                a0Var.q = p0(trim);
            } else if (i3 == 20) {
                a0Var.r = p0(trim);
            }
        }
    }

    private void V0(Attributes attributes) throws ax.o4.j {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C c2 = new C2695g.C();
        c2.a = this.a;
        c2.b = this.b;
        D(c2, attributes);
        S(c2, attributes);
        this.b.m(c2);
        this.b = c2;
    }

    private void W(C2695g.InterfaceC2708n interfaceC2708n, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.d(attributes.getLocalName(i2)) == g.transform) {
                interfaceC2708n.j(J0(attributes.getValue(i2)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.a = new C2695g();
    }

    private void X(C2695g.e0 e0Var, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                e0Var.q = o0(trim);
            } else if (i3 == 2) {
                e0Var.r = o0(trim);
            } else if (i3 == 3) {
                C2695g.C2710p o0 = o0(trim);
                e0Var.s = o0;
                if (o0.j()) {
                    throw new ax.o4.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                C2695g.C2710p o02 = o0(trim);
                e0Var.t = o02;
                if (o02.j()) {
                    throw new ax.o4.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 == 6 && (HttpUrl.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                e0Var.p = trim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws ax.o4.j {
        if (this.c) {
            this.d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h d2 = h.d(str2);
            switch (a.a[d2.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.e = true;
                    this.f = d2;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.c = true;
                    this.d = 1;
                    break;
            }
        }
    }

    private void Y(C2695g.R r, Attributes attributes) throws ax.o4.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 7) {
                w0(r, trim);
            } else if (i3 == 87) {
                r.p = N0(trim);
            }
        }
    }

    private void Y0(Attributes attributes) throws ax.o4.j {
        l("<stop>", new Object[0]);
        C2695g.J j2 = this.b;
        if (j2 == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof C2695g.AbstractC2704j)) {
            throw new ax.o4.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        C2695g.D d2 = new C2695g.D();
        d2.a = this.a;
        d2.b = this.b;
        D(d2, attributes);
        S(d2, attributes);
        R(d2, attributes);
        this.b.m(d2);
        this.b = d2;
    }

    private void Z(String str) {
        this.a.a(new C2690b(C2690b.f.screen, C2690b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws ax.o4.j {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z = true;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[g.d(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 88) {
                z = trim.equals("text/css");
            } else if (i3 == 89) {
                str = trim;
            }
        }
        if (z && C2690b.b(str, C2690b.f.screen)) {
            this.h = true;
        } else {
            this.c = true;
            this.d = 1;
        }
    }

    private static C2695g.C2698c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        C2695g.C2710p q0 = q0(iVar);
        iVar.z();
        C2695g.C2710p q02 = q0(iVar);
        iVar.z();
        C2695g.C2710p q03 = q0(iVar);
        iVar.z();
        C2695g.C2710p q04 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new C2695g.C2698c(q0, q02, q03, q04);
        }
        return null;
    }

    private void a1(Attributes attributes) throws ax.o4.j {
        l("<svg>", new Object[0]);
        C2695g.F f2 = new C2695g.F();
        f2.a = this.a;
        f2.b = this.b;
        D(f2, attributes);
        S(f2, attributes);
        C(f2, attributes);
        Y(f2, attributes);
        Q(f2, attributes);
        C2695g.J j2 = this.b;
        if (j2 == null) {
            this.a.t(f2);
        } else {
            j2.m(f2);
        }
        this.b = f2;
    }

    private static C2695g.C2701f b0(String str) throws ax.o4.j {
        if (str.charAt(0) == '#') {
            C2691c b2 = C2691c.b(str, 1, str.length());
            if (b2 == null) {
                throw new ax.o4.j("Bad hex colour value: " + str);
            }
            int a2 = b2.a();
            if (a2 == 4) {
                int d2 = b2.d();
                int i2 = d2 & 3840;
                int i3 = d2 & 240;
                int i4 = d2 & 15;
                return new C2695g.C2701f(i4 | (i2 << 8) | (-16777216) | (i2 << 12) | (i3 << 8) | (i3 << 4) | (i4 << 4));
            }
            if (a2 == 5) {
                int d3 = b2.d();
                int i5 = 61440 & d3;
                int i6 = d3 & 3840;
                int i7 = d3 & 240;
                int i8 = d3 & 15;
                return new C2695g.C2701f((i8 << 24) | (i8 << 28) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6 | i7 | (i7 >> 4));
            }
            if (a2 == 7) {
                return new C2695g.C2701f(b2.d() | (-16777216));
            }
            if (a2 == 9) {
                return new C2695g.C2701f((b2.d() >>> 8) | (b2.d() << 24));
            }
            throw new ax.o4.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(startsWith2 ? 5 : 4));
            iVar.A();
            float n = iVar.n();
            float d4 = iVar.d(n);
            if (!Float.isNaN(d4)) {
                iVar.f('%');
            }
            float d5 = iVar.d(d4);
            if (!Float.isNaN(d5)) {
                iVar.f('%');
            }
            if (!startsWith2) {
                iVar.A();
                if (!Float.isNaN(d5) && iVar.f(')')) {
                    return new C2695g.C2701f(s(n, d4, d5) | (-16777216));
                }
                throw new ax.o4.j("Bad hsl() colour value: " + str);
            }
            float d6 = iVar.d(d5);
            iVar.A();
            if (!Float.isNaN(d6) && iVar.f(')')) {
                return new C2695g.C2701f((j(d6 * 256.0f) << 24) | s(n, d4, d5));
            }
            throw new ax.o4.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(startsWith ? 5 : 4));
        iVar2.A();
        float n2 = iVar2.n();
        if (!Float.isNaN(n2) && iVar2.f('%')) {
            n2 = (n2 * 256.0f) / 100.0f;
        }
        float d7 = iVar2.d(n2);
        if (!Float.isNaN(d7) && iVar2.f('%')) {
            d7 = (d7 * 256.0f) / 100.0f;
        }
        float d8 = iVar2.d(d7);
        if (!Float.isNaN(d8) && iVar2.f('%')) {
            d8 = (d8 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            iVar2.A();
            if (!Float.isNaN(d8) && iVar2.f(')')) {
                return new C2695g.C2701f((j(n2) << 16) | (-16777216) | (j(d7) << 8) | j(d8));
            }
            throw new ax.o4.j("Bad rgb() colour value: " + str);
        }
        float d9 = iVar2.d(d8);
        iVar2.A();
        if (!Float.isNaN(d9) && iVar2.f(')')) {
            return new C2695g.C2701f((j(d9 * 256.0f) << 24) | (j(n2) << 16) | (j(d7) << 8) | j(d8));
        }
        throw new ax.o4.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws ax.o4.j {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.R t = new C2695g.T();
        t.a = this.a;
        t.b = this.b;
        D(t, attributes);
        S(t, attributes);
        C(t, attributes);
        Y(t, attributes);
        this.b.m(t);
        this.b = t;
    }

    private static C2695g.C2701f c0(String str) throws ax.o4.j {
        Integer a2 = c.a(str);
        if (a2 != null) {
            return new C2695g.C2701f(a2.intValue());
        }
        throw new ax.o4.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) throws ax.o4.j {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof C2695g.Y) {
            h(str);
        }
    }

    private static C2695g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C2695g.C2701f.d0;
        }
        if (str.equals("currentColor")) {
            return C2695g.C0398g.b();
        }
        try {
            return b0(str);
        } catch (ax.o4.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws ax.o4.j {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.W w = new C2695g.W();
        w.a = this.a;
        w.b = this.b;
        D(w, attributes);
        S(w, attributes);
        W(w, attributes);
        C(w, attributes);
        V(w, attributes);
        this.b.m(w);
        this.b = w;
    }

    private static C2695g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return C2695g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C2695g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i2, int i3) throws ax.o4.j {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i3);
            }
            this.g.append(cArr, i2, i3);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i3);
            }
            this.i.append(cArr, i2, i3);
        } else if (this.b instanceof C2695g.Y) {
            h(new String(cArr, i2, i3));
        }
    }

    private static float f0(String str) throws ax.o4.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new ax.o4.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws ax.o4.j {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.Z z = new C2695g.Z();
        z.a = this.a;
        z.b = this.b;
        D(z, attributes);
        S(z, attributes);
        C(z, attributes);
        U(z, attributes);
        this.b.m(z);
        this.b = z;
        C2695g.J j2 = z.b;
        if (j2 instanceof C2695g.b0) {
            z.p((C2695g.b0) j2);
        } else {
            z.p(((C2695g.X) j2).f());
        }
    }

    private static float g0(String str, int i2, int i3) throws ax.o4.j {
        float b2 = new C2692d().b(str, i2, i3);
        if (!Float.isNaN(b2)) {
            return b2;
        }
        throw new ax.o4.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws ax.o4.j {
        l("<tref>", new Object[0]);
        C2695g.J j2 = this.b;
        if (j2 == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof C2695g.Y)) {
            throw new ax.o4.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        C2695g.U u = new C2695g.U();
        u.a = this.a;
        u.b = this.b;
        D(u, attributes);
        S(u, attributes);
        C(u, attributes);
        T(u, attributes);
        this.b.m(u);
        C2695g.J j3 = u.b;
        if (j3 instanceof C2695g.b0) {
            u.p((C2695g.b0) j3);
        } else {
            u.p(((C2695g.X) j3).f());
        }
    }

    private void h(String str) throws ax.o4.j {
        C2695g.H h2 = (C2695g.H) this.b;
        int size = h2.i.size();
        C2695g.N n = size == 0 ? null : h2.i.get(size - 1);
        if (!(n instanceof C2695g.c0)) {
            this.b.m(new C2695g.c0(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        C2695g.c0 c0Var = (C2695g.c0) n;
        sb.append(c0Var.c);
        sb.append(str);
        c0Var.c = sb.toString();
    }

    private static void h0(C2695g.E e2, String str) {
        String s;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer num = null;
            C2695g.E.b bVar = null;
            String str2 = null;
            while (true) {
                s = iVar.s('/');
                iVar.A();
                if (s != null) {
                    if (num != null && bVar != null) {
                        break;
                    }
                    if (!s.equals("normal") && (num != null || (num = e.a(s)) == null)) {
                        if (bVar != null || (bVar = k0(s)) == null) {
                            if (str2 != null || !s.equals("small-caps")) {
                                break;
                            } else {
                                str2 = s;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C2695g.C2710p j0 = j0(s);
            if (iVar.f('/')) {
                iVar.A();
                String r = iVar.r();
                if (r != null) {
                    try {
                        o0(r);
                    } catch (ax.o4.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e2.p0 = i0(iVar.y());
            e2.q0 = j0;
            e2.r0 = Integer.valueOf(num == null ? 400 : num.intValue());
            if (bVar == null) {
                bVar = C2695g.E.b.Normal;
            }
            e2.s0 = bVar;
            e2.q |= 122880;
        }
    }

    private void h1(Attributes attributes) throws ax.o4.j {
        l("<tspan>", new Object[0]);
        C2695g.J j2 = this.b;
        if (j2 == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof C2695g.Y)) {
            throw new ax.o4.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        C2695g.V v = new C2695g.V();
        v.a = this.a;
        v.b = this.b;
        D(v, attributes);
        S(v, attributes);
        C(v, attributes);
        V(v, attributes);
        this.b.m(v);
        this.b = v;
        C2695g.J j3 = v.b;
        if (j3 instanceof C2695g.b0) {
            v.p((C2695g.b0) j3);
        } else {
            v.p(((C2695g.X) j3).f());
        }
    }

    private void i(Attributes attributes) throws ax.o4.j {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2699d c2699d = new C2695g.C2699d();
        c2699d.a = this.a;
        c2699d.b = this.b;
        D(c2699d, attributes);
        S(c2699d, attributes);
        W(c2699d, attributes);
        C(c2699d, attributes);
        A(c2699d, attributes);
        this.b.m(c2699d);
    }

    private static List<String> i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String q = iVar.q();
            if (q == null) {
                q = iVar.u(',');
            }
            if (q == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(q);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws ax.o4.j {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.e0 e0Var = new C2695g.e0();
        e0Var.a = this.a;
        e0Var.b = this.b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.b.m(e0Var);
        this.b = e0Var;
    }

    private static int j(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    private static C2695g.C2710p j0(String str) {
        try {
            C2695g.C2710p a2 = d.a(str);
            return a2 == null ? o0(str) : a2;
        } catch (ax.o4.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws ax.o4.j {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.R f0Var = new C2695g.f0();
        f0Var.a = this.a;
        f0Var.b = this.b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.b.m(f0Var);
        this.b = f0Var;
    }

    private void k(Attributes attributes) throws ax.o4.j {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2700e c2700e = new C2695g.C2700e();
        c2700e.a = this.a;
        c2700e.b = this.b;
        D(c2700e, attributes);
        S(c2700e, attributes);
        W(c2700e, attributes);
        C(c2700e, attributes);
        B(c2700e, attributes);
        this.b.m(c2700e);
        this.b = c2700e;
    }

    private static C2695g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return C2695g.E.b.Oblique;
            case "italic":
                return C2695g.E.b.Italic;
            case "normal":
                return C2695g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws ax.o4.j {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.S s = new C2695g.S();
        s.a = this.a;
        s.b = this.b;
        D(s, attributes);
        S(s, attributes);
        W(s, attributes);
        C(s, attributes);
        this.b.m(s);
        this.b = s;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws ax.o4.j {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2702h c2702h = new C2695g.C2702h();
        c2702h.a = this.a;
        c2702h.b = this.b;
        D(c2702h, attributes);
        S(c2702h, attributes);
        W(c2702h, attributes);
        this.b.m(c2702h);
        this.b = c2702h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws ax.o4.j {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2703i c2703i = new C2695g.C2703i();
        c2703i.a = this.a;
        c2703i.b = this.b;
        D(c2703i, attributes);
        S(c2703i, attributes);
        W(c2703i, attributes);
        C(c2703i, attributes);
        E(c2703i, attributes);
        this.b.m(c2703i);
    }

    private Float n0(String str) throws ax.o4.j {
        if (str.length() == 0) {
            throw new ax.o4.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float g0 = g0(str, 0, length);
            float f2 = 100.0f;
            if (z) {
                g0 /= 100.0f;
            }
            if (g0 < 0.0f) {
                f2 = 0.0f;
            } else if (g0 <= 100.0f) {
                f2 = g0;
            }
            return Float.valueOf(f2);
        } catch (NumberFormatException e2) {
            throw new ax.o4.j("Invalid offset value in <stop>: " + str, e2);
        }
    }

    static C2695g.C2710p o0(String str) throws ax.o4.j {
        if (str.length() == 0) {
            throw new ax.o4.j("Invalid length value (empty string)");
        }
        int length = str.length();
        C2695g.d0 d0Var = C2695g.d0.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            d0Var = C2695g.d0.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0Var = C2695g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new ax.o4.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new C2695g.C2710p(g0(str, 0, length), d0Var);
        } catch (NumberFormatException e2) {
            throw new ax.o4.j("Invalid length value: " + str, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) throws ax.o4.j {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i3 = a.a[h.d(str2).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 5 && i3 != 13 && i3 != 14) {
                switch (i3) {
                    case 22:
                    case 23:
                        this.e = false;
                        StringBuilder sb = this.g;
                        if (sb != null) {
                            h hVar = this.f;
                            if (hVar == h.title) {
                                this.a.u(sb.toString());
                            } else if (hVar == h.desc) {
                                this.a.s(sb.toString());
                            }
                            this.g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.i;
                        if (sb2 != null) {
                            this.h = false;
                            Z(sb2.toString());
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((C2695g.N) this.b).b;
        }
    }

    private static List<C2695g.C2710p> p0(String str) throws ax.o4.j {
        if (str.length() == 0) {
            throw new ax.o4.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float n = iVar.n();
            if (Float.isNaN(n)) {
                throw new ax.o4.j("Invalid length list value: " + iVar.b());
            }
            C2695g.d0 v = iVar.v();
            if (v == null) {
                v = C2695g.d0.px;
            }
            arrayList.add(new C2695g.C2710p(n, v));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws ax.o4.j {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2707m c2707m = new C2695g.C2707m();
        c2707m.a = this.a;
        c2707m.b = this.b;
        D(c2707m, attributes);
        S(c2707m, attributes);
        W(c2707m, attributes);
        C(c2707m, attributes);
        this.b.m(c2707m);
        this.b = c2707m;
    }

    private static C2695g.C2710p q0(i iVar) {
        return iVar.g("auto") ? new C2695g.C2710p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            C2695g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float f0 = f0(str);
            if (f0 < 0.0f) {
                f0 = 0.0f;
            } else if (f0 > 1.0f) {
                f0 = 1.0f;
            }
            return Float.valueOf(f0);
        } catch (ax.o4.j unused) {
            return null;
        }
    }

    private static int s(float f2, float f3, float f4) {
        float f5 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f3 / 100.0f;
        float f8 = f4 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f9 = f8 >= 0.0f ? f8 > 1.0f ? 1.0f : f8 : 0.0f;
        float f10 = f9 <= 0.5f ? (f7 + 1.0f) * f9 : (f9 + f7) - (f7 * f9);
        float f11 = (f9 * 2.0f) - f10;
        return j(t(f11, f10, f6 - 2.0f) * 256.0f) | (j(t(f11, f10, f6 + 2.0f) * 256.0f) << 16) | (j(t(f11, f10, f6) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else {
            if (f4 < 3.0f) {
                return f3;
            }
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    private static C2695g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new C2695g.C2715u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new C2695g.C2715u(trim, trim2.length() > 0 ? d0(trim2) : null);
    }

    private void u(Attributes attributes) throws ax.o4.j {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2709o c2709o = new C2695g.C2709o();
        c2709o.a = this.a;
        c2709o.b = this.b;
        D(c2709o, attributes);
        S(c2709o, attributes);
        W(c2709o, attributes);
        C(c2709o, attributes);
        G(c2709o, attributes);
        this.b.m(c2709o);
        this.b = c2709o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0282 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.o4.C2695g.C2717w u0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.k.u0(java.lang.String):ax.o4.g$w");
    }

    private void v(Attributes attributes) throws ax.o4.j {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2711q c2711q = new C2695g.C2711q();
        c2711q.a = this.a;
        c2711q.b = this.b;
        D(c2711q, attributes);
        S(c2711q, attributes);
        W(c2711q, attributes);
        C(c2711q, attributes);
        H(c2711q, attributes);
        this.b.m(c2711q);
    }

    static C2693e v0(String str) throws ax.o4.j {
        C2693e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String r = iVar.r();
        if ("defer".equals(r)) {
            iVar.A();
            r = iVar.r();
        }
        C2693e.a a2 = b.a(r);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String r2 = iVar.r();
            r2.getClass();
            if (r2.equals("meet")) {
                bVar = C2693e.b.meet;
            } else {
                if (!r2.equals("slice")) {
                    throw new ax.o4.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = C2693e.b.slice;
            }
        }
        return new C2693e(a2, bVar);
    }

    private void w(Attributes attributes) throws ax.o4.j {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.M m = new C2695g.M();
        m.a = this.a;
        m.b = this.b;
        D(m, attributes);
        S(m, attributes);
        F(m, attributes);
        I(m, attributes);
        this.b.m(m);
        this.b = m;
    }

    private static void w0(C2695g.P p, String str) throws ax.o4.j {
        p.o = v0(str);
    }

    private void x(Attributes attributes) throws ax.o4.j {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2712r c2712r = new C2695g.C2712r();
        c2712r.a = this.a;
        c2712r.b = this.b;
        D(c2712r, attributes);
        S(c2712r, attributes);
        C(c2712r, attributes);
        Y(c2712r, attributes);
        J(c2712r, attributes);
        this.b.m(c2712r);
        this.b = c2712r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> x0(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.A();
        String s = iVar.s('=');
        while (s != null) {
            iVar.f('=');
            hashMap.put(s, iVar.q());
            iVar.A();
            s = iVar.s('=');
        }
        return hashMap;
    }

    private void y(Attributes attributes) throws ax.o4.j {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new ax.o4.j("Invalid document. Root element must be <svg>");
        }
        C2695g.C2713s c2713s = new C2695g.C2713s();
        c2713s.a = this.a;
        c2713s.b = this.b;
        D(c2713s, attributes);
        S(c2713s, attributes);
        C(c2713s, attributes);
        K(c2713s, attributes);
        this.b.m(c2713s);
        this.b = c2713s;
    }

    private static C2695g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return C2695g.E.e.optimizeQuality;
            case "auto":
                return C2695g.E.e.auto;
            case "optimizeSpeed":
                return C2695g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set<String> z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r = iVar.r();
            if (r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    C2695g z(InputStream inputStream, boolean z) throws ax.o4.j {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z);
            return this.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
