package ax.y1;

import ax.P0.E;
import ax.S0.C0987u;
import ax.S0.e0;
import ax.r7.AbstractC2991z;
import ax.y1.C3499c;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class f {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C3499c a(String str) throws IOException {
        try {
            return b(str);
        } catch (E | NumberFormatException | XmlPullParserException unused) {
            C0987u.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static C3499c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!e0.e(newPullParser, "x:xmpmeta")) {
            throw E.a("Couldn't find xmp metadata", null);
        }
        AbstractC2991z<C3499c.a> z = AbstractC2991z.z();
        long j = -9223372036854775807L;
        do {
            newPullParser.next();
            if (e0.e(newPullParser, "rdf:Description")) {
                if (!d(newPullParser)) {
                    return null;
                }
                j = e(newPullParser);
                z = c(newPullParser);
            } else if (e0.e(newPullParser, "Container:Directory")) {
                z = f(newPullParser, "Container", "Item");
            } else if (e0.e(newPullParser, "GContainer:Directory")) {
                z = f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!e0.c(newPullParser, "x:xmpmeta"));
        if (z.isEmpty()) {
            return null;
        }
        return new C3499c(j, z);
    }

    private static AbstractC2991z<C3499c.a> c(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String a2 = e0.a(xmlPullParser, str);
            if (a2 != null) {
                return AbstractC2991z.B(new C3499c.a("image/jpeg", "Primary", 0L, 0L), new C3499c.a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return AbstractC2991z.z();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : a) {
            String a2 = e0.a(xmlPullParser, str);
            if (a2 != null) {
                return Integer.parseInt(a2) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a2 = e0.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static AbstractC2991z<C3499c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC2991z.a r = AbstractC2991z.r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (e0.e(xmlPullParser, str3)) {
                String a2 = e0.a(xmlPullParser, str2 + ":Mime");
                String a3 = e0.a(xmlPullParser, str2 + ":Semantic");
                String a4 = e0.a(xmlPullParser, str2 + ":Length");
                String a5 = e0.a(xmlPullParser, str2 + ":Padding");
                if (a2 == null || a3 == null) {
                    return AbstractC2991z.z();
                }
                r.a(new C3499c.a(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!e0.c(xmlPullParser, str4));
        return r.k();
    }
}
