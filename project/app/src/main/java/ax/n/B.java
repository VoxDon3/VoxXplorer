/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class B {
    private final Deque<WeakReference<XmlPullParser>> a = new ArrayDeque<WeakReference<XmlPullParser>>();

    B() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) return true;
        try {
            if (xmlPullParser.getEventType() == 3) return true;
            int n8 = xmlPullParser.getEventType();
            if (n8 != 1) return false;
            return true;
        }
        catch (XmlPullParserException xmlPullParserException) {
            return true;
        }
    }

    private static XmlPullParser c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser)deque.peek().get();
            if (B.b(xmlPullParser)) {
                deque.pop();
                continue;
            }
            return xmlPullParser;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null) return false;
        if (xmlPullParser == xmlPullParser2) return false;
        try {
            if (xmlPullParser2.getEventType() != 2) return false;
            return "include".equals(xmlPullParser2.getName());
        }
        catch (XmlPullParserException xmlPullParserException) {
            return false;
        }
    }

    boolean a(AttributeSet attributeSet) {
        XmlPullParser xmlPullParser;
        if (attributeSet instanceof XmlPullParser && (xmlPullParser = (XmlPullParser)attributeSet).getDepth() == 1) {
            attributeSet = B.c(this.a);
            this.a.push(new WeakReference<XmlPullParser>(xmlPullParser));
            if (B.d(xmlPullParser, (XmlPullParser)attributeSet)) {
                return true;
            }
        }
        return false;
    }
}

