package ax.O6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import ax.O6.l;
import ax.k6.C2402c;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class q {
    final int a;
    final l b;
    final int[][] c;
    final l[] d;
    final p e;
    final p f;
    final p g;
    final p h;

    public static final class b {
        private int a;
        private l b;
        private int[][] c;
        private l[] d;
        private p e;
        private p f;
        private p g;
        private p h;

        private boolean k(int i, int i2) {
            return (i2 | i) == i;
        }

        private void l(int i, int i2) {
            int[][] iArr = new int[i2][];
            System.arraycopy(this.c, 0, iArr, 0, i);
            this.c = iArr;
            l[] lVarArr = new l[i2];
            System.arraycopy(this.d, 0, lVarArr, 0, i);
            this.d = lVarArr;
        }

        private void m() {
            this.b = new l();
            this.c = new int[10][];
            this.d = new l[10];
        }

        public b i(int[] iArr, l lVar) {
            int i = this.a;
            if (i == 0 || iArr.length == 0) {
                this.b = lVar;
            }
            if (i >= this.c.length) {
                l(i, i + 10);
            }
            int[][] iArr2 = this.c;
            int i2 = this.a;
            iArr2[i2] = iArr;
            this.d[i2] = lVar;
            this.a = i2 + 1;
            return this;
        }

        public q j() {
            if (this.a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p pVar, int i) {
            if (k(i, 1)) {
                this.e = pVar;
            }
            if (k(i, 2)) {
                this.f = pVar;
            }
            if (k(i, 4)) {
                this.g = pVar;
            }
            if (k(i, 8)) {
                this.h = pVar;
            }
            return this;
        }

        public b(q qVar) {
            int i = qVar.a;
            this.a = i;
            this.b = qVar.b;
            int[][] iArr = qVar.c;
            int[][] iArr2 = new int[iArr.length][];
            this.c = iArr2;
            this.d = new l[qVar.d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(qVar.d, 0, this.d, 0, this.a);
            this.e = qVar.e;
            this.f = qVar.f;
            this.g = qVar.g;
            this.h = qVar.h;
        }

        public b(l lVar) {
            m();
            i(StateSet.WILD_CARD, lVar);
        }

        private b(Context context, int i) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            q.g(this, context, xml, asAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m();
            }
        }
    }

    public static q b(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int e(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ax.k6.m.T3) : theme.obtainStyledAttributes(attributeSet, ax.k6.m.T3, 0, 0);
                l m = l.b(context, obtainAttributes.getResourceId(ax.k6.m.U3, 0), obtainAttributes.getResourceId(ax.k6.m.V3, 0)).m();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != C2402c.R && attributeNameResource != C2402c.S) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i), m);
            }
        }
    }

    public static int h(int i) {
        int i2 = i & 5;
        return ((i & 10) >> 1) | (i2 << 1);
    }

    public l c(boolean z) {
        if (!z || (this.e == null && this.f == null && this.g == null && this.h == null)) {
            return this.b;
        }
        l.b w = this.b.w();
        p pVar = this.e;
        if (pVar != null) {
            w.D(pVar.e());
        }
        p pVar2 = this.f;
        if (pVar2 != null) {
            w.H(pVar2.e());
        }
        p pVar3 = this.g;
        if (pVar3 != null) {
            w.v(pVar3.e());
        }
        p pVar4 = this.h;
        if (pVar4 != null) {
            w.z(pVar4.e());
        }
        return w.m();
    }

    protected l d(int[] iArr) {
        int e = e(iArr);
        if (e < 0) {
            e = e(StateSet.WILD_CARD);
        }
        if (this.e == null && this.f == null && this.g == null && this.h == null) {
            return this.d[e];
        }
        l.b w = this.d[e].w();
        p pVar = this.e;
        if (pVar != null) {
            w.D(pVar.d(iArr));
        }
        p pVar2 = this.f;
        if (pVar2 != null) {
            w.H(pVar2.d(iArr));
        }
        p pVar3 = this.g;
        if (pVar3 != null) {
            w.v(pVar3.d(iArr));
        }
        p pVar4 = this.h;
        if (pVar4 != null) {
            w.z(pVar4.d(iArr));
        }
        return w.m();
    }

    public boolean f() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.a > 1 || ((pVar = this.e) != null && pVar.h()) || (((pVar2 = this.f) != null && pVar2.h()) || (((pVar3 = this.g) != null && pVar3.h()) || ((pVar4 = this.h) != null && pVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    private q(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }
}
