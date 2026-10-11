/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import ax.O6.l;
import ax.O6.p;
import ax.k6.c;
import ax.k6.m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class q {
    final int a;
    final l b;
    final int[][] c;
    final l[] d;
    final p e;
    final p f;
    final p g;
    final p h;

    private q(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
    }

    public static q b(Context context, TypedArray typedArray, int n8) {
        if ((n8 = typedArray.getResourceId(n8, 0)) == 0) {
            return null;
        }
        if (!j.Objects.equals((Object)context.getResources().getResourceTypeName(n8), (Object)"xml")) {
            return null;
        }
        return new b(context, n8).j();
    }

    private int e(int[] nArray) {
        int[][] nArray2 = this.c;
        for (int i8 = 0; i8 < this.a; ++i8) {
            if (!StateSet.stateSetMatches((int[])nArray2[i8], (int[])nArray)) continue;
            return i8;
        }
        return -1;
    }

    private static void g(b b8, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        while ((n9 = xmlPullParser.next()) != 1 && ((n8 = xmlPullParser.getDepth()) >= n10 || n9 != 3)) {
            if (n9 != 2 || n8 > n10 || !xmlPullParser.getName().equals("item")) continue;
            Object object = context.getResources();
            object = theme == null ? object.obtainAttributes(attributeSet, m.T3) : theme.obtainStyledAttributes(attributeSet, m.T3, 0, 0);
            l l8 = l.b(context, object.getResourceId(m.U3, 0), object.getResourceId(m.V3, 0)).m();
            object.recycle();
            int n11 = attributeSet.getAttributeCount();
            object = new int[n11];
            n9 = 0;
            for (n8 = 0; n8 < n11; ++n8) {
                int n12 = attributeSet.getAttributeNameResource(n8);
                int n13 = n9;
                if (n12 != ax.k6.c.R) {
                    n13 = n9;
                    if (n12 != ax.k6.c.S) {
                        n13 = attributeSet.getAttributeBooleanValue(n8, false) ? n12 : -n12;
                        object[n9] = (Resources)n13;
                        n13 = n9 + 1;
                    }
                }
                n9 = n13;
            }
            b8.i(StateSet.trimStateSet((int[])object, (int)n9), l8);
        }
    }

    public static int h(int n8) {
        return (n8 & 0xA) >> 1 | (n8 & 5) << 1;
    }

    public l c(boolean bl) {
        if (bl && (this.e != null || this.f != null || this.g != null || this.h != null)) {
            l.b b8 = this.b.w();
            p p8 = this.e;
            if (p8 != null) {
                b8.D(p8.e());
            }
            if ((p8 = this.f) != null) {
                b8.H(p8.e());
            }
            if ((p8 = this.g) != null) {
                b8.v(p8.e());
            }
            if ((p8 = this.h) != null) {
                b8.z(p8.e());
            }
            return b8.m();
        }
        return this.b;
    }

    protected l d(int[] nArray) {
        int n8;
        int n9 = n8 = this.e(nArray);
        if (n8 < 0) {
            n9 = this.e(StateSet.WILD_CARD);
        }
        if (this.e == null && this.f == null && this.g == null && this.h == null) {
            return this.d[n9];
        }
        l.b b8 = this.d[n9].w();
        p p8 = this.e;
        if (p8 != null) {
            b8.D(p8.d(nArray));
        }
        if ((p8 = this.f) != null) {
            b8.H(p8.d(nArray));
        }
        if ((p8 = this.g) != null) {
            b8.v(p8.d(nArray));
        }
        if ((p8 = this.h) != null) {
            b8.z(p8.d(nArray));
        }
        return b8.m();
    }

    public boolean f() {
        p p8;
        return this.a > 1 || (p8 = this.e) != null && p8.h() || (p8 = this.f) != null && p8.h() || (p8 = this.g) != null && p8.h() || (p8 = this.h) != null && p8.h();
        {
        }
    }

    public b i() {
        return new b(this);
    }

    public static final class b {
        private int a;
        private l b;
        private int[][] c;
        private l[] d;
        private p e;
        private p f;
        private p g;
        private p h;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private b(Context object, int n8) {
            Throwable throwable2;
            XmlResourceParser xmlResourceParser;
            block10: {
                block11: {
                    this.m();
                    xmlResourceParser = object.getResources().getXml(n8);
                    try {
                        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                        while ((n8 = xmlResourceParser.next()) != 2 && n8 != 1) {
                        }
                        if (n8 != 2) break block10;
                        if (!xmlResourceParser.getName().equals("selector")) break block11;
                        q.g(this, object, (XmlPullParser)xmlResourceParser, attributeSet, object.getTheme());
                    }
                    catch (Throwable throwable2) {}
                }
                xmlResourceParser.close();
                return;
            }
            super("No start tag found");
            throw object;
            if (xmlResourceParser == null) throw throwable2;
            try {
                xmlResourceParser.close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Resources.NotFoundException | IOException | XmlPullParserException throwable4) {
                    this.m();
                    return;
                }
            }
        }

        public b(l l8) {
            this.m();
            this.i(StateSet.WILD_CARD, l8);
        }

        public b(q q8) {
            int n8;
            this.a = n8 = q8.a;
            this.b = q8.b;
            int[][] nArray = q8.c;
            int[][] nArrayArray = new int[nArray.length][];
            this.c = nArrayArray;
            this.d = new l[q8.d.length];
            System.arraycopy(nArray, 0, nArrayArray, 0, n8);
            System.arraycopy(q8.d, 0, this.d, 0, this.a);
            this.e = q8.e;
            this.f = q8.f;
            this.g = q8.g;
            this.h = q8.h;
        }

        private boolean k(int n8, int n9) {
            return (n9 | n8) == n8;
        }

        private void l(int n8, int n9) {
            Object object = new int[n9][];
            System.arraycopy(this.c, 0, object, 0, n8);
            this.c = object;
            object = new l[n9];
            System.arraycopy(this.d, 0, object, 0, n8);
            this.d = (l[])object;
        }

        private void m() {
            this.b = new l();
            this.c = new int[10][];
            this.d = new l[10];
        }

        public b i(int[] nArray, l l8) {
            int n8 = this.a;
            if (n8 == 0 || nArray.length == 0) {
                this.b = l8;
            }
            if (n8 >= this.c.length) {
                this.l(n8, n8 + 10);
            }
            int[][] nArray2 = this.c;
            n8 = this.a;
            nArray2[n8] = nArray;
            this.d[n8] = l8;
            this.a = n8 + 1;
            return this;
        }

        public q j() {
            if (this.a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p p8, int n8) {
            if (this.k(n8, 1)) {
                this.e = p8;
            }
            if (this.k(n8, 2)) {
                this.f = p8;
            }
            if (this.k(n8, 4)) {
                this.g = p8;
            }
            if (this.k(n8, 8)) {
                this.h = p8;
            }
            return this;
        }
    }
}

