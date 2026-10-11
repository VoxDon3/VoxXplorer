/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import ax.P0.E;
import ax.S0.e0;
import ax.S0.u;
import ax.r7.z;
import ax.y1.c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class f {
    private static final String[] a = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String object) throws IOException {
        try {
            object = f.b((String)object);
            return object;
        }
        catch (E | NumberFormatException | XmlPullParserException throwable) {
            u.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String z8) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParser.setInput((Reader)new StringReader((String)((Object)z8)));
        xmlPullParser.next();
        if (e0.e(xmlPullParser, "x:xmpmeta")) {
            long l8;
            z<Object> z9 = z.z();
            long l9 = -9223372036854775807L;
            do {
                xmlPullParser.next();
                if (e0.e(xmlPullParser, "rdf:Description")) {
                    if (!f.d(xmlPullParser)) {
                        return null;
                    }
                    l8 = f.e(xmlPullParser);
                    z8 = f.c(xmlPullParser);
                } else if (e0.e(xmlPullParser, "Container:Directory")) {
                    z8 = f.f(xmlPullParser, "Container", "Item");
                    l8 = l9;
                } else {
                    z8 = z9;
                    l8 = l9;
                    if (e0.e(xmlPullParser, "GContainer:Directory")) {
                        z8 = f.f(xmlPullParser, "GContainer", "GContainerItem");
                        l8 = l9;
                    }
                }
                z9 = z8;
                l9 = l8;
            } while (!e0.c(xmlPullParser, "x:xmpmeta"));
            if (z8.isEmpty()) {
                return null;
            }
            return new c(l8, z8);
        }
        throw E.a("Couldn't find xmp metadata", null);
    }

    private static z<c.a> c(XmlPullParser xmlPullParser) {
        String[] stringArray = c;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = e0.a(xmlPullParser, stringArray[i8]);
            if (string == null) continue;
            long l8 = Long.parseLong(string);
            return z.B(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", l8, 0L));
        }
        return z.z();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        String[] stringArray = a;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = e0.a(xmlPullParser, stringArray[i8]);
            if (string == null) continue;
            return Integer.parseInt(string) == 1;
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        String[] stringArray = b;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = e0.a(xmlPullParser, stringArray[i8]);
            if (string == null) continue;
            long l8 = Long.parseLong(string);
            if (l8 == -1L) {
                return -9223372036854775807L;
            }
            return l8;
        }
        return -9223372036854775807L;
    }

    private static z<c.a> f(XmlPullParser xmlPullParser, String string, String string2) throws XmlPullParserException, IOException {
        z.a<c.a> a8 = z.r();
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string);
        charSequence.append(":Item");
        charSequence = charSequence.toString();
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(string);
        charSequence2.append(":Directory");
        string = charSequence2.toString();
        do {
            xmlPullParser.next();
            if (!e0.e(xmlPullParser, (String)charSequence)) continue;
            charSequence2 = new StringBuilder();
            charSequence2.append(string2);
            charSequence2.append(":Mime");
            charSequence2 = charSequence2.toString();
            CharSequence charSequence3 = new StringBuilder();
            charSequence3.append(string2);
            charSequence3.append(":Semantic");
            String string3 = charSequence3.toString();
            charSequence3 = new StringBuilder();
            charSequence3.append(string2);
            charSequence3.append(":Length");
            String string4 = charSequence3.toString();
            charSequence3 = new StringBuilder();
            charSequence3.append(string2);
            charSequence3.append(":Padding");
            charSequence3 = charSequence3.toString();
            charSequence2 = e0.a(xmlPullParser, (String)charSequence2);
            string3 = e0.a(xmlPullParser, string3);
            string4 = e0.a(xmlPullParser, string4);
            charSequence3 = e0.a(xmlPullParser, (String)charSequence3);
            if (charSequence2 != null && string3 != null) {
                long l8 = 0L;
                long l9 = string4 != null ? Long.parseLong(string4) : 0L;
                if (charSequence3 != null) {
                    l8 = Long.parseLong((String)charSequence3);
                }
                a8.h(new c.a((String)charSequence2, string3, l9, l8));
                continue;
            }
            return z.z();
        } while (!e0.c(xmlPullParser, string));
        return a8.k();
    }
}

