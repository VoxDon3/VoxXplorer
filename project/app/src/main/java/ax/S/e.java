/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import ax.O.g;
import ax.Z.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    private static int a(TypedArray typedArray, int n8) {
        return a.a(typedArray, n8);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int n8;
        while ((n8 = xmlPullParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            return e.d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<List<byte[]>> c(Resources object, int n8) {
        Throwable throwable2;
        TypedArray typedArray;
        block9: {
            ArrayList<List<byte[]>> arrayList;
            block8: {
                block7: {
                    block6: {
                        if (n8 == 0) {
                            return Collections.EMPTY_LIST;
                        }
                        typedArray = object.obtainTypedArray(n8);
                        if (typedArray.length() != 0) break block6;
                        object = Collections.EMPTY_LIST;
                        typedArray.recycle();
                        return object;
                    }
                    try {
                        arrayList = new ArrayList<List<byte[]>>();
                        if (e.a(typedArray, 0) != 1) break block7;
                        for (n8 = 0; n8 < typedArray.length(); ++n8) {
                            int n9 = typedArray.getResourceId(n8, 0);
                            if (n9 == 0) continue;
                            arrayList.add(e.h(object.getStringArray(n9)));
                        }
                        break block8;
                    }
                    catch (Throwable throwable2) {}
                }
                arrayList.add(e.h(object.getStringArray(n8)));
                break block9;
            }
            typedArray.recycle();
            return arrayList;
        }
        typedArray.recycle();
        throw throwable2;
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e.e(xmlPullParser, resources);
        }
        e.g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), g.h);
        String string = typedArray.getString(g.i);
        String string2 = typedArray.getString(g.m);
        String string3 = typedArray.getString(g.n);
        int n8 = typedArray.getResourceId(g.j, 0);
        int n9 = typedArray.getInteger(g.k, 1);
        int n10 = typedArray.getInteger(g.l, 500);
        Object object = typedArray.getString(g.o);
        typedArray.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                e.g(xmlPullParser);
            }
            return new e(new i(string, string2, string3, e.c(resources, n8)), n9, n10, (String)object);
        }
        object = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) continue;
            if (xmlPullParser.getName().equals("font")) {
                object.add(e.f(xmlPullParser, resources));
                continue;
            }
            e.g(xmlPullParser);
        }
        if (object.isEmpty()) {
            return null;
        }
        return new c(object.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int n8;
        if (!(resources = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), g.p)).hasValue(n8 = g.y)) {
            n8 = g.r;
        }
        int n9 = resources.getInt(n8, 400);
        n8 = g.w;
        if (!resources.hasValue(n8)) {
            n8 = g.s;
        }
        boolean bl = 1 == resources.getInt(n8, 0);
        n8 = g.z;
        if (!resources.hasValue(n8)) {
            n8 = g.t;
        }
        int n10 = g.x;
        if (!resources.hasValue(n10)) {
            n10 = g.u;
        }
        String string = resources.getString(n10);
        n10 = resources.getInt(n8, 0);
        n8 = g.v;
        if (!resources.hasValue(n8)) {
            n8 = g.q;
        }
        int n11 = resources.getResourceId(n8, 0);
        String string2 = resources.getString(n8);
        resources.recycle();
        while (xmlPullParser.next() != 3) {
            e.g(xmlPullParser);
        }
        return new d(string2, n9, bl, string, n10, n11);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int n8 = 1;
        while (n8 > 0) {
            int n9 = xmlPullParser.next();
            if (n9 != 2) {
                if (n9 != 3) continue;
                --n8;
                continue;
            }
            ++n8;
        }
    }

    private static List<byte[]> h(String[] stringArray) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(Base64.decode((String)stringArray[i8], (int)0));
        }
        return arrayList;
    }

    static class a {
        static int a(TypedArray typedArray, int n8) {
            return typedArray.getType(n8);
        }
    }

    public static interface b {
    }

    public static final class c
    implements b {
        private final d[] a;

        public c(d[] dArray) {
            this.a = dArray;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        private final String a;
        private final int b;
        private final boolean c;
        private final String d;
        private final int e;
        private final int f;

        public d(String string, int n8, boolean bl, String string2, int n9, int n10) {
            this.a = string;
            this.b = n8;
            this.c = bl;
            this.d = string2;
            this.e = n9;
            this.f = n10;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e
    implements b {
        private final i a;
        private final int b;
        private final int c;
        private final String d;

        public e(i i8, int n8, int n9, String string) {
            this.a = i8;
            this.c = n8;
            this.b = n9;
            this.d = string;
        }

        public int a() {
            return this.c;
        }

        public i b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }
}

