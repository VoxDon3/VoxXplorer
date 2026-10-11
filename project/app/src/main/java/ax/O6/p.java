/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import ax.O6.a;
import ax.O6.d;
import ax.O6.l;
import ax.k6.c;
import ax.k6.m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class p {
    int a;
    private d b;
    int[][] c = new int[10][];
    d[] d = new d[10];

    private void a(int[] nArray, d d8) {
        int n8 = this.a;
        if (n8 == 0 || nArray.length == 0) {
            this.b = d8;
        }
        if (n8 >= this.c.length) {
            this.f(n8, n8 + 10);
        }
        int[][] nArray2 = this.c;
        n8 = this.a;
        nArray2[n8] = nArray;
        this.d[n8] = d8;
        this.a = n8 + 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p b(Context object, TypedArray typedArray, int n8, d d8) {
        Throwable throwable2;
        block12: {
            p p8;
            block13: {
                int n9 = typedArray.getResourceId(n8, 0);
                if (n9 == 0) {
                    return p.c(l.m(typedArray, n8, d8));
                }
                if (!object.getResources().getResourceTypeName(n9).equals("xml")) {
                    return p.c(l.m(typedArray, n8, d8));
                }
                typedArray = object.getResources().getXml(n9);
                try {
                    p8 = new p();
                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)typedArray);
                    while ((n8 = typedArray.next()) != 2 && n8 != 1) {
                    }
                    if (n8 != 2) break block12;
                    if (!typedArray.getName().equals("selector")) break block13;
                    p8.i((Context)object, (XmlPullParser)typedArray, attributeSet, object.getTheme());
                }
                catch (Throwable throwable2) {}
            }
            typedArray.close();
            return p8;
        }
        object = new XmlPullParserException("No start tag found");
        throw object;
        if (typedArray == null) throw throwable2;
        try {
            typedArray.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            try {
                throwable2.addSuppressed(throwable3);
                throw throwable2;
            }
            catch (Resources.NotFoundException | IOException | XmlPullParserException throwable4) {
                return p.c(d8);
            }
        }
    }

    public static p c(d d8) {
        p p8 = new p();
        p8.a(StateSet.WILD_CARD, d8);
        return p8;
    }

    private void f(int n8, int n9) {
        Object object = new int[n9][];
        System.arraycopy(this.c, 0, object, 0, n8);
        this.c = object;
        object = new d[n9];
        System.arraycopy(this.d, 0, object, 0, n8);
        this.d = (d[])object;
    }

    private int g(int[] nArray) {
        int[][] nArray2 = this.c;
        for (int i8 = 0; i8 < this.a; ++i8) {
            if (!StateSet.stateSetMatches((int[])nArray2[i8], (int[])nArray)) continue;
            return i8;
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        while ((n9 = xmlPullParser.next()) != 1 && ((n8 = xmlPullParser.getDepth()) >= n10 || n9 != 3)) {
            if (n9 != 2 || n8 > n10 || !xmlPullParser.getName().equals("item")) continue;
            Object object = context.getResources();
            object = theme == null ? object.obtainAttributes(attributeSet, m.D4) : theme.obtainStyledAttributes(attributeSet, m.D4, 0, 0);
            d d8 = l.m((TypedArray)object, m.J4, new a(0.0f));
            object.recycle();
            int n11 = attributeSet.getAttributeCount();
            object = new int[n11];
            n8 = 0;
            for (n9 = 0; n9 < n11; ++n9) {
                int n12 = attributeSet.getAttributeNameResource(n9);
                int n13 = n8;
                if (n12 != ax.k6.c.j) {
                    n13 = attributeSet.getAttributeBooleanValue(n9, false) ? n12 : -n12;
                    object[n8] = (Resources)n13;
                    n13 = n8 + 1;
                }
                n8 = n13;
            }
            this.a(StateSet.trimStateSet((int[])object, (int)n8), d8);
        }
    }

    public d d(int[] nArray) {
        int n8;
        int n9 = n8 = this.g(nArray);
        if (n8 < 0) {
            n9 = this.g(StateSet.WILD_CARD);
        }
        if (n9 < 0) {
            return this.b;
        }
        return this.d[n9];
    }

    public d e() {
        return this.b;
    }

    public boolean h() {
        return this.a > 1;
    }
}

