package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import ax.k6.C2402c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class p {
    int a;
    private d b;
    int[][] c = new int[10][];
    d[] d = new d[10];

    private void a(int[] iArr, d dVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = dVar;
        }
        if (i >= this.c.length) {
            f(i, i + 10);
        }
        int[][] iArr2 = this.c;
        int i2 = this.a;
        iArr2[i2] = iArr;
        this.d[i2] = dVar;
        this.a = i2 + 1;
    }

    public static p b(Context context, TypedArray typedArray, int i, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return c(l.m(typedArray, i, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return c(l.m(typedArray, i, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                p pVar = new p();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    pVar.i(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return pVar;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return c(dVar);
        }
    }

    public static p c(d dVar) {
        p pVar = new p();
        pVar.a(StateSet.WILD_CARD, dVar);
        return pVar;
    }

    private void f(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.c, 0, iArr, 0, i);
        this.c = iArr;
        d[] dVarArr = new d[i2];
        System.arraycopy(this.d, 0, dVarArr, 0, i);
        this.d = dVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ax.k6.m.D4) : theme.obtainStyledAttributes(attributeSet, ax.k6.m.D4, 0, 0);
                d m = l.m(obtainAttributes, ax.k6.m.J4, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != C2402c.j) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                a(StateSet.trimStateSet(iArr, i), m);
            }
        }
    }

    public d d(int[] iArr) {
        int g = g(iArr);
        if (g < 0) {
            g = g(StateSet.WILD_CARD);
        }
        return g < 0 ? this.b : this.d[g];
    }

    public d e() {
        return this.b;
    }

    public boolean h() {
        return this.a > 1;
    }
}
