package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import ax.k6.C2402c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class r {
    int a;
    private a b;
    int[][] c = new int[10][];
    a[] d = new a[10];

    public static class a {
        public b a;

        a(b bVar) {
            this.a = bVar;
        }
    }

    public static class b {
        c a;
        float b;

        b(c cVar, float f) {
            this.a = cVar;
            this.b = f;
        }

        public int a(int i) {
            c cVar = this.a;
            if (cVar == c.PERCENT) {
                return (int) (this.b * i);
            }
            if (cVar == c.PIXELS) {
                return (int) this.b;
            }
            return 0;
        }
    }

    public enum c {
        PERCENT,
        PIXELS
    }

    private void a(int[] iArr, a aVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = aVar;
        }
        if (i >= this.c.length) {
            f(i, i + 10);
        }
        int[][] iArr2 = this.c;
        int i2 = this.a;
        iArr2[i2] = iArr;
        this.d[i2] = aVar;
        this.a = i2 + 1;
    }

    public static r b(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                r rVar = new r();
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
                    rVar.h(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return rVar;
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
            return null;
        }
    }

    private b d(TypedArray typedArray, int i, b bVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new b(c.PERCENT, peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    private void f(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.c, 0, iArr, 0, i);
        this.c = iArr;
        a[] aVarArr = new a[i2];
        System.arraycopy(this.d, 0, aVarArr, 0, i);
        this.d = aVarArr;
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

    private void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ax.k6.m.i5) : theme.obtainStyledAttributes(attributeSet, ax.k6.m.i5, 0, 0);
                b d = d(obtainAttributes, ax.k6.m.j5, null);
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != C2402c.i0) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                a(StateSet.trimStateSet(iArr, i), new a(d));
            }
        }
    }

    public int c(int i) {
        float max;
        int i2 = -i;
        for (int i3 = 0; i3 < this.a; i3++) {
            b bVar = this.d[i3].a;
            c cVar = bVar.a;
            if (cVar == c.PIXELS) {
                max = Math.max(i2, bVar.b);
            } else if (cVar == c.PERCENT) {
                max = Math.max(i2, i * bVar.b);
            }
            i2 = (int) max;
        }
        return i2;
    }

    public a e(int[] iArr) {
        int g = g(iArr);
        if (g < 0) {
            g = g(StateSet.WILD_CARD);
        }
        return g < 0 ? this.b : this.d[g];
    }
}
