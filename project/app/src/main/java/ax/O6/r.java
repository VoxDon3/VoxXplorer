/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import ax.k6.m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class r {
    int a;
    private a b;
    int[][] c = new int[10][];
    a[] d = new a[10];

    private void a(int[] nArray, a a8) {
        int n8 = this.a;
        if (n8 == 0 || nArray.length == 0) {
            this.b = a8;
        }
        if (n8 >= this.c.length) {
            this.f(n8, n8 + 10);
        }
        int[][] nArray2 = this.c;
        n8 = this.a;
        nArray2[n8] = nArray;
        this.d[n8] = a8;
        this.a = n8 + 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r b(Context object, TypedArray typedArray, int n8) {
        Throwable throwable2;
        block12: {
            r r8;
            block13: {
                if ((n8 = typedArray.getResourceId(n8, 0)) == 0) {
                    return null;
                }
                if (!object.getResources().getResourceTypeName(n8).equals("xml")) {
                    return null;
                }
                typedArray = object.getResources().getXml(n8);
                try {
                    r8 = new r();
                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)typedArray);
                    while ((n8 = typedArray.next()) != 2 && n8 != 1) {
                    }
                    if (n8 != 2) break block12;
                    if (!typedArray.getName().equals("selector")) break block13;
                    r8.h((Context)object, (XmlPullParser)typedArray, attributeSet, object.getTheme());
                }
                catch (Throwable throwable2) {}
            }
            typedArray.close();
            return r8;
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
                return null;
            }
        }
    }

    private b d(TypedArray typedArray, int n8, b b8) {
        TypedValue typedValue = typedArray.peekValue(n8);
        if (typedValue != null) {
            n8 = typedValue.type;
            if (n8 == 5) {
                return new b(ax.O6.r$c.c0, TypedValue.complexToDimensionPixelSize((int)typedValue.data, (DisplayMetrics)typedArray.getResources().getDisplayMetrics()));
            }
            if (n8 == 6) {
                return new b(ax.O6.r$c.q, typedValue.getFraction(1.0f, 1.0f));
            }
        }
        return b8;
    }

    private void f(int n8, int n9) {
        Object object = new int[n9][];
        System.arraycopy(this.c, 0, object, 0, n8);
        this.c = object;
        object = new a[n9];
        System.arraycopy(this.d, 0, object, 0, n8);
        this.d = (a[])object;
    }

    private int g(int[] nArray) {
        int[][] nArray2 = this.c;
        for (int i8 = 0; i8 < this.a; ++i8) {
            if (!StateSet.stateSetMatches((int[])nArray2[i8], (int[])nArray)) continue;
            return i8;
        }
        return -1;
    }

    private void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        while ((n9 = xmlPullParser.next()) != 1 && ((n8 = xmlPullParser.getDepth()) >= n10 || n9 != 3)) {
            if (n9 != 2 || n8 > n10 || !xmlPullParser.getName().equals("item")) continue;
            Object object = context.getResources();
            object = theme == null ? object.obtainAttributes(attributeSet, m.i5) : theme.obtainStyledAttributes(attributeSet, m.i5, 0, 0);
            b b8 = this.d((TypedArray)object, m.j5, null);
            object.recycle();
            int n11 = attributeSet.getAttributeCount();
            object = new int[n11];
            n9 = 0;
            for (n8 = 0; n8 < n11; ++n8) {
                int n12 = attributeSet.getAttributeNameResource(n8);
                int n13 = n9;
                if (n12 != ax.k6.c.i0) {
                    n13 = attributeSet.getAttributeBooleanValue(n8, false) ? n12 : -n12;
                    object[n9] = (Resources)n13;
                    n13 = n9 + 1;
                }
                n9 = n13;
            }
            this.a(StateSet.trimStateSet((int[])object, (int)n9), new a(b8));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int c(int n8) {
        int n9 = -n8;
        int n10 = 0;
        while (true) {
            int n11;
            block7: {
                float f8;
                block6: {
                    c c8;
                    b b8;
                    block5: {
                        if (n10 >= this.a) {
                            return n9;
                        }
                        b8 = this.d[n10].a;
                        c8 = b8.a;
                        if (c8 != ax.O6.r$c.c0) break block5;
                        f8 = Math.max((float)n9, b8.b);
                        break block6;
                    }
                    n11 = n9;
                    if (c8 != ax.O6.r$c.q) break block7;
                    f8 = Math.max((float)n9, (float)n8 * b8.b);
                }
                n11 = (int)f8;
            }
            ++n10;
            n9 = n11;
        }
    }

    public a e(int[] nArray) {
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

    public static class a {
        public b a;

        a(b b8) {
            this.a = b8;
        }
    }

    public static class b {
        c a;
        float b;

        b(c c8, float f8) {
            this.a = c8;
            this.b = f8;
        }

        public int a(int n8) {
            c c8 = this.a;
            if (c8 == ax.O6.r$c.q) {
                return (int)(this.b * (float)n8);
            }
            if (c8 == ax.O6.r$c.c0) {
                return (int)this.b;
            }
            return 0;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = ax.O6.r$c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }
}

