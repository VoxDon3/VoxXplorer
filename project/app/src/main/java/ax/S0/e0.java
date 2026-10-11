/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class e0 {
    public static String a(XmlPullParser xmlPullParser, String string) {
        int n8 = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!xmlPullParser.getAttributeName(i8).equals(string)) continue;
            return xmlPullParser.getAttributeValue(i8);
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean c(XmlPullParser xmlPullParser, String string) throws XmlPullParserException {
        return e0.b(xmlPullParser) && xmlPullParser.getName().equals(string);
    }

    public static boolean d(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean e(XmlPullParser xmlPullParser, String string) throws XmlPullParserException {
        return e0.d(xmlPullParser) && xmlPullParser.getName().equals(string);
    }
}

