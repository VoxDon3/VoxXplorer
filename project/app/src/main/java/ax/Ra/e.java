/*
 * Decompiled with CFR 0.152.
 */
package ax.Ra;

import ax.r8.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e
extends JsonReader {
    final g c0;
    private final h<j> d0 = new h<j>(new f<j>(this){
        final e a;
        {
            this.a = e8;
        }

        public j b() {
            return new j();
        }
    });
    private final h<k> e0 = new h<k>(new f<k>(this){
        final e a;
        {
            this.a = e8;
        }

        public k b() {
            return new k();
        }
    });
    private j f0;
    private j g0;
    private k h0;
    private k i0;
    private JsonToken j0;
    private boolean k0;
    private boolean l0 = true;
    private boolean m0 = false;
    private String n0;
    private final ax.Ra.c<i> o0 = new ax.Ra.c();
    private final ax.Ra.c<e> p0 = new ax.Ra.c();
    private final XmlPullParser q;
    private JsonToken q0;
    private int r0 = 0;
    private boolean s0;
    private final l t0;
    private final d u0;

    public e(Reader reader, ax.Ra.d d8, g g8) {
        super(reader);
        l l8;
        this.t0 = l8 = new l(this);
        this.u0 = new d(this, 10);
        d8 = d8.a();
        this.q = d8;
        this.c0 = g8;
        l8.a = -1;
        try {
            d8.setInput(reader);
            d8.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", g8.d);
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new ax.r8.j(xmlPullParserException);
        }
    }

    private void A(l object) throws IOException, XmlPullParserException {
        switch (this.o0.g().ordinal()) {
            default: {
                break;
            }
            case 6: {
                if (this.m0) {
                    this.b("", true);
                }
                this.m();
                break;
            }
            case 5: {
                this.o0.c();
                break;
            }
            case 2: 
            case 3: {
                this.d(JsonToken.END_ARRAY);
                this.d(JsonToken.END_OBJECT);
                this.m();
                this.m();
                break;
            }
            case 1: 
            case 4: {
                this.d(JsonToken.END_ARRAY);
                this.m();
                break;
            }
            case 0: {
                this.d(JsonToken.END_OBJECT);
                this.r0 = 0;
                this.m();
            }
        }
        if (this.c0.c) {
            int n8 = this.q.getDepth();
            object = this.c0.d ? ((l)object).b(this.q) : ((l)object).b;
            ax.Ra.c<e> c8 = this.p0;
            while (c8.j() > 0 && c8.g().a > n8) {
                c8.c();
            }
            if (c8.j() != 0 && c8.g().a >= n8) {
                c8.g().b = object;
                return;
            }
            c8.h(new e(n8, (String)object));
        }
    }

    private void F(l object) throws IOException, XmlPullParserException {
        if (!this.c0.b) {
            this.d(this.j0);
            this.o0.h(i.c0);
            this.H((l)object);
            return;
        }
        if (((l)object).e != null) {
            this.d(JsonToken.BEGIN_OBJECT);
            this.o0.h(i.c0);
            this.c(((l)object).e);
            return;
        }
        int n8 = c.a[this.j0.ordinal()];
        if (n8 != 1) {
            if (n8 == 3) {
                this.d(JsonToken.BEGIN_ARRAY);
                ax.Ra.c<i> c8 = this.o0;
                object = this.c0.e ? i.g0 : i.d0;
                c8.h((i)((Object)object));
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("First expectedToken=");
            ((StringBuilder)object).append((Object)this.j0);
            ((StringBuilder)object).append(" (not begin_object/begin_array)");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        this.d(JsonToken.BEGIN_OBJECT);
        this.o0.h(i.c0);
    }

    private void H(l l8) throws IOException, XmlPullParserException {
        boolean bl;
        Object object;
        block13: {
            block10: {
                boolean bl2;
                block11: {
                    block12: {
                        boolean bl3;
                        i i8;
                        i i9 = i8 = this.o0.g();
                        if (this.c0.c) {
                            i9 = i8;
                            if (i8.q) {
                                i9 = i8;
                                if (this.p0.j() > 0) {
                                    e e8 = this.p0.g();
                                    i9 = i8;
                                    if (e8.a == this.q.getDepth()) {
                                        object = this.c0.d ? l8.b(this.q) : l8.b;
                                        i9 = i8;
                                        if (!((String)object).equals(e8.b)) {
                                            this.d(JsonToken.END_ARRAY);
                                            this.m();
                                            i9 = this.o0.g();
                                        }
                                    }
                                }
                            }
                        }
                        int n8 = i9.ordinal();
                        bl2 = false;
                        bl = bl3 = false;
                        if (n8 == 1) break block10;
                        bl = bl3;
                        if (n8 == 2) break block10;
                        if (n8 == 3 || n8 == 4) break block11;
                        if (n8 == 6) break block12;
                        bl = true;
                        break block13;
                    }
                    bl = true;
                    break block10;
                }
                this.o0.h(i.h0);
                bl = bl2;
                break block13;
            }
            this.d(JsonToken.BEGIN_OBJECT);
            this.o0.h(i.c0);
        }
        this.n0 = l8.b(this.q);
        if (bl) {
            this.o0.h(i.i0);
            this.d(JsonToken.NAME);
            this.e(l8.b(this.q));
            this.m0 = true;
        }
        if (l8.e != null) {
            object = this.c0;
            if (!((g)object).j || !((g)object).i.contains(this.n0)) {
                object = this.o0.g();
                if (object != i.h0) {
                    if (object == i.i0) {
                        this.d(JsonToken.BEGIN_OBJECT);
                        this.o0.h(i.c0);
                    }
                    this.c(l8.e);
                    return;
                }
                throw new IllegalStateException("Attributes data in primitive scope");
            }
        }
    }

    private boolean L(l l8) {
        int n8 = this.o0.g().ordinal();
        if (n8 != 0) {
            if (n8 != 5) {
                if (n8 == 6) {
                    this.b(l8.c, true);
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot process text '");
                stringBuilder.append(l8.c);
                stringBuilder.append("' inside scope ");
                stringBuilder.append((Object)this.o0.g());
                throw new r(stringBuilder.toString());
            }
            this.b(l8.c, false);
            return false;
        }
        n8 = this.r0;
        CharSequence charSequence = "$";
        if (n8 > 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("$");
            ((StringBuilder)charSequence).append(this.r0);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        ++this.r0;
        this.d(JsonToken.NAME);
        this.e((String)charSequence);
        this.b(l8.c, false);
        return false;
    }

    private void W(JsonToken object) {
        j j8 = this.d0.a();
        j8.a = object;
        j8.b = null;
        object = this.g0;
        if (object == null) {
            this.g0 = j8;
            this.f0 = j8;
            return;
        }
        j8.b = object;
        this.g0 = j8;
    }

    private void a() throws XmlPullParserException, IOException {
        Object object = this.q0;
        JsonToken jsonToken = this.j0;
        if (object != jsonToken) {
            Object object2 = JsonToken.BEGIN_OBJECT;
            if (jsonToken == object2 && object == (jsonToken = JsonToken.STRING) && "".equals(this.h0.a)) {
                this.q0 = object2;
                object2 = this.q().a;
                this.W(JsonToken.END_OBJECT);
                this.W(jsonToken);
                this.W(JsonToken.NAME);
                this.d0((String)object2);
                this.d0("$");
                return;
            }
            jsonToken = this.j0;
            object = JsonToken.BEGIN_ARRAY;
            if (jsonToken == object) {
                int n8 = c.a[this.q0.ordinal()];
                if (n8 != 1) {
                    if (n8 == 2) {
                        this.q0 = object;
                        object = this.c0;
                        if (((g)object).c) {
                            if (((g)object).a && ((object = ((g)object).h) == null || object != null && object.contains(this.n0))) {
                                this.W(JsonToken.STRING);
                                this.o0.h(i.f0);
                                return;
                            }
                            object = this.q().a;
                            this.W(JsonToken.END_OBJECT);
                            this.W(JsonToken.STRING);
                            this.W(JsonToken.NAME);
                            this.W((JsonToken)((Object)object2));
                            this.d0((String)object);
                            this.d0("$");
                            this.o0.h(i.e0);
                            return;
                        }
                        this.W(JsonToken.END_ARRAY);
                        if (this.i0 != null) {
                            this.q();
                            return;
                        }
                    }
                } else {
                    this.q0 = object;
                    object = this.o0.g();
                    if (this.v() == JsonToken.NAME) {
                        if (this.c0.c) {
                            this.o0.a(2);
                            this.W((JsonToken)((Object)object2));
                            this.o0.h(i.e0);
                            this.o0.h(i.c0);
                            object2 = i.i0;
                            if (object == object2) {
                                this.o0.h((i)((Object)object2));
                                return;
                            }
                        } else {
                            this.p();
                            this.q();
                            n8 = this.o0.j();
                            if (this.c0.a && this.v() == null) {
                                this.j(true);
                            }
                            int n9 = this.o0.b(3, n8);
                            if (this.c0.a && this.v() == JsonToken.STRING) {
                                this.o0.i(n9, i.g0);
                                return;
                            }
                            this.o0.i(n9, i.d0);
                            n8 = this.o0.j();
                            if (n8 <= ++n9 || this.o0.f(n9) != i.c0) {
                                this.o0.i(n9, i.c0);
                            }
                            if (this.v() != object2) {
                                this.W((JsonToken)((Object)object2));
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(String string, boolean bl) {
        Object object;
        if (bl && (object = this.f0) != null && ((j)object).a == JsonToken.STRING) {
            if (string.length() > 0) {
                object = new StringBuilder();
                k k8 = this.h0;
                ((StringBuilder)object).append(k8.a);
                ((StringBuilder)object).append(" ");
                ((StringBuilder)object).append(string);
                k8.a = ((StringBuilder)object).toString();
            }
            return;
        }
        this.d(JsonToken.STRING);
        this.e(string);
    }

    private void c(d d8) throws IOException, XmlPullParserException {
        int n8 = d8.d;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.d(JsonToken.NAME);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("@");
            stringBuilder.append(d8.c(i8));
            this.e(stringBuilder.toString());
            this.d(JsonToken.STRING);
            this.e(d8.b[i8]);
        }
    }

    private void d(JsonToken object) {
        j j8 = this.d0.a();
        j8.a = object;
        j8.b = null;
        object = this.f0;
        if (object == null) {
            this.f0 = j8;
            this.g0 = j8;
            return;
        }
        ((j)object).b = j8;
        this.f0 = j8;
    }

    private void d0(String object) {
        k k8 = this.e0.a();
        k8.a = object;
        k8.b = null;
        object = this.i0;
        if (object == null) {
            this.h0 = k8;
            this.i0 = k8;
            return;
        }
        k8.b = object;
        this.i0 = k8;
    }

    private void e(String object) {
        k k8 = this.e0.a();
        k8.a = ((String)object).trim();
        k8.b = null;
        object = this.h0;
        if (object == null) {
            this.h0 = k8;
            this.i0 = k8;
            return;
        }
        ((k)object).b = k8;
        this.h0 = k8;
    }

    private CharSequence f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scopes: ");
        stringBuilder.append(this.o0);
        stringBuilder.append('\n');
        stringBuilder.append("Closed tags: ");
        stringBuilder.append(this.p0);
        stringBuilder.append('\n');
        stringBuilder.append("Token: ");
        stringBuilder.append((Object)this.q0);
        stringBuilder.append('\n');
        stringBuilder.append("Tokens queue: ");
        stringBuilder.append(this.g0);
        stringBuilder.append('\n');
        stringBuilder.append("Values queue: ");
        stringBuilder.append(this.i0);
        stringBuilder.append('\n');
        return stringBuilder;
    }

    private void g(JsonToken jsonToken) throws IOException {
        JsonToken jsonToken2 = this.peek();
        this.q0 = null;
        if (jsonToken2 == jsonToken) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)jsonToken);
        stringBuilder.append(" expected, but met ");
        stringBuilder.append((Object)jsonToken2);
        stringBuilder.append("\n");
        stringBuilder.append((Object)this.f());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void j(boolean bl) throws IOException, XmlPullParserException {
        boolean bl2 = bl;
        while (this.f0 == null && !this.k0 || bl2) {
            block7: {
                block6: {
                    l l8;
                    block4: {
                        block5: {
                            l8 = this.u();
                            if (this.k0) {
                                if (this.c0.b) break;
                                this.d(JsonToken.END_OBJECT);
                                return;
                            }
                            int n8 = l8.a;
                            if (n8 == -1) continue;
                            if (n8 == 1) break block4;
                            if (n8 == 2) break block5;
                            if (n8 != 3) break block6;
                            bl = this.L(l8);
                            break block7;
                        }
                        this.A(l8);
                        break block6;
                    }
                    if (this.l0) {
                        this.l0 = false;
                        this.F(l8);
                    } else {
                        this.H(l8);
                    }
                }
                bl = false;
            }
            bl2 = bl;
            if (bl) continue;
            bl2 = bl;
            if (!this.s0) continue;
        }
    }

    private void m() {
        this.o0.e(i.i0);
    }

    private JsonToken p() {
        j j8 = this.g0;
        if (j8 == null) {
            return JsonToken.END_DOCUMENT;
        }
        this.g0 = j8.b;
        if (j8 == this.f0) {
            this.f0 = null;
        }
        this.d0.b(j8);
        return j8.a;
    }

    private k q() {
        k k8 = this.i0;
        if (k8 != null) {
            if (k8 == this.h0) {
                this.h0 = null;
            }
            this.e0.b(k8);
            this.i0 = k8.b;
            return k8;
        }
        throw new IllegalStateException("No value can be given");
    }

    /*
     * Enabled aggressive block sorting
     */
    private l u() throws IOException, XmlPullParserException {
        l l8;
        block7: {
            int n8 = this.q.next();
            l8 = this.t0;
            l8.a();
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        l8.a = 2;
                        l8.b = this.q.getName();
                        l8.d = this.q.getNamespace();
                        return l8;
                    }
                    if (n8 == 4) {
                        String string = this.q.getText().trim();
                        if (string.length() == 0) {
                            this.m0 = true;
                            l8.a = -1;
                            return l8;
                        }
                        this.m0 = false;
                        l8.a = 3;
                        l8.c = string;
                        return l8;
                    }
                    break block7;
                } else {
                    l8.a = 1;
                    l8.b = this.q.getName();
                    l8.d = this.q.getNamespace();
                    if (this.q.getAttributeCount() > 0) {
                        this.u0.b(this.q);
                        l8.e = this.u0;
                    }
                    return l8;
                }
            }
            this.k0 = true;
        }
        l8.a = -1;
        return l8;
    }

    private JsonToken v() {
        j j8 = this.g0;
        if (j8 != null) {
            return j8.a;
        }
        return null;
    }

    @Override
    public void beginArray() throws IOException {
        JsonToken jsonToken;
        this.j0 = jsonToken = JsonToken.BEGIN_ARRAY;
        this.g(jsonToken);
    }

    @Override
    public void beginObject() throws IOException {
        JsonToken jsonToken;
        this.j0 = jsonToken = JsonToken.BEGIN_OBJECT;
        this.g(jsonToken);
    }

    @Override
    public void endArray() throws IOException {
        JsonToken jsonToken;
        this.j0 = jsonToken = JsonToken.END_ARRAY;
        this.g(jsonToken);
    }

    @Override
    public void endObject() throws IOException {
        JsonToken jsonToken;
        this.j0 = jsonToken = JsonToken.END_OBJECT;
        this.g(jsonToken);
    }

    @Override
    public boolean hasNext() throws IOException {
        this.peek();
        JsonToken jsonToken = this.q0;
        return jsonToken != JsonToken.END_OBJECT && jsonToken != JsonToken.END_ARRAY;
    }

    @Override
    public boolean nextBoolean() throws IOException {
        this.g(JsonToken.BOOLEAN);
        String string = this.q().a;
        if ("true".equalsIgnoreCase(string)) {
            return true;
        }
        if ("false".equalsIgnoreCase(string)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot parse <");
        stringBuilder.append(string);
        stringBuilder.append("> to boolean");
        throw new IOException(stringBuilder.toString());
    }

    @Override
    public double nextDouble() throws IOException {
        this.g(JsonToken.STRING);
        return Double.parseDouble(this.q().a);
    }

    @Override
    public int nextInt() throws IOException {
        this.g(JsonToken.STRING);
        return Integer.parseInt(this.q().a);
    }

    @Override
    public long nextLong() throws IOException {
        this.g(JsonToken.STRING);
        return Long.parseLong(this.q().a);
    }

    @Override
    public String nextName() throws IOException {
        JsonToken jsonToken;
        this.j0 = jsonToken = JsonToken.NAME;
        this.g(jsonToken);
        return this.q().a;
    }

    @Override
    public String nextString() throws IOException {
        this.g(JsonToken.STRING);
        return this.q().a;
    }

    String o(String string, String charSequence, XmlPullParser xmlPullParser) throws XmlPullParserException {
        Map<String, String> map = string;
        if (!this.c0.f) {
            map = string;
            if (charSequence != null) {
                map = string;
                if (((String)charSequence).length() > 0) {
                    map = this.c0.g;
                    if (map != null && map.containsKey(charSequence)) {
                        map = this.c0.g.get(charSequence);
                    } else {
                        map = charSequence;
                        if (xmlPullParser != null) {
                            int n8 = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
                            int n9 = 0;
                            while (true) {
                                map = charSequence;
                                if (n9 >= n8) break;
                                if (((String)charSequence).equals(xmlPullParser.getNamespaceUri(n9))) {
                                    map = xmlPullParser.getNamespacePrefix(n9);
                                    break;
                                }
                                ++n9;
                            }
                        }
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("<");
                    ((StringBuilder)charSequence).append((String)((Object)map));
                    ((StringBuilder)charSequence).append(">");
                    ((StringBuilder)charSequence).append(string);
                    map = ((StringBuilder)charSequence).toString();
                }
            }
        }
        return map;
    }

    @Override
    public JsonToken peek() throws IOException {
        if (this.j0 == null && this.l0) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (this.q0 != null) {
            try {
                this.a();
                this.j0 = null;
                return this.q0;
            }
            catch (XmlPullParserException xmlPullParserException) {
                throw new r("XML parsing exception", xmlPullParserException);
            }
        }
        try {
            JsonToken jsonToken;
            this.j(false);
            this.j0 = null;
            this.q0 = jsonToken = this.p();
            return jsonToken;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new r("XML parsing exception", xmlPullParserException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void skipValue() throws IOException {
        this.s0 = true;
        int n8 = 0;
        try {
            int n9;
            do {
                block8: {
                    block7: {
                        JsonToken jsonToken;
                        if ((jsonToken = this.peek()) == JsonToken.BEGIN_ARRAY || jsonToken == JsonToken.BEGIN_OBJECT) break block7;
                        if (jsonToken != JsonToken.END_ARRAY && jsonToken != JsonToken.END_OBJECT) {
                            n9 = n8;
                            if (this.h0 != null) {
                                this.q();
                                n9 = n8;
                            }
                            break block8;
                        } else {
                            n9 = n8 - 1;
                        }
                        break block8;
                    }
                    n9 = n8 + 1;
                }
                this.q0 = null;
                n8 = n9;
            } while (n9 != 0);
            this.s0 = false;
            return;
        }
        catch (Throwable throwable) {}
        this.s0 = false;
        throw throwable;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--- XmlReader ---\n");
        stringBuilder.append((Object)this.f());
        return stringBuilder.toString();
    }

    private final class d {
        String[] a;
        String[] b;
        String[] c;
        int d;
        final e e;

        public d(e e8, int n8) {
            this.e = e8;
            this.d = 0;
            this.a(n8);
        }

        private void a(int n8) {
            this.a = new String[n8];
            this.b = new String[n8];
            this.c = new String[n8];
        }

        public void b(XmlPullParser xmlPullParser) {
            int n8 = xmlPullParser.getAttributeCount();
            if (n8 > this.a.length) {
                this.a(n8);
            }
            this.d = n8;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a[i8] = xmlPullParser.getAttributeName(i8);
                if (this.e.c0.d) {
                    this.c[i8] = xmlPullParser.getAttributePrefix(i8);
                }
                this.b[i8] = xmlPullParser.getAttributeValue(i8);
            }
        }

        public String c(int n8) throws IOException, XmlPullParserException {
            return this.e.o(this.a[n8], this.c[n8], null);
        }
    }

    private static class e {
        int a;
        String b;

        public e(int n8, String string) {
            this.a = n8;
            this.b = string;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("'");
            stringBuilder.append(this.b);
            stringBuilder.append("'/");
            stringBuilder.append(this.a);
            return stringBuilder.toString();
        }
    }

    private static interface f<T> {
        public T a();
    }

    public static class g {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        Map<String, String> g;
        Set<String> h;
        Set<String> i;
        boolean j;
    }

    private static final class h<T> {
        private final f<T> a;
        private final Object[] b = new Object[32];
        private int c = 0;

        public h(f<T> f8) {
            this.a = f8;
        }

        public T a() {
            int n8 = this.c;
            if (n8 == 0) {
                return this.a.a();
            }
            Object[] objectArray = this.b;
            this.c = --n8;
            return (T)objectArray[n8];
        }

        public void b(T t8) {
            int n8 = this.c;
            if (n8 < 32) {
                Object[] objectArray = this.b;
                this.c = n8 + 1;
                objectArray[n8] = t8;
            }
        }
    }

    private static final class i
    extends Enum<i> {
        public static final /* enum */ i c0 = new i(false);
        public static final /* enum */ i d0 = new i(true);
        public static final /* enum */ i e0 = new i(true);
        public static final /* enum */ i f0 = new i(true);
        public static final /* enum */ i g0 = new i(true);
        public static final /* enum */ i h0 = new i(false);
        public static final /* enum */ i i0 = new i(false);
        private static final i[] j0 = i.d();
        final boolean q;

        private i(boolean bl) {
            this.q = bl;
        }

        private static /* synthetic */ i[] d() {
            return new i[]{c0, d0, e0, f0, g0, h0, i0};
        }

        public static i valueOf(String string) {
            return Enum.valueOf(i.class, string);
        }

        public static i[] values() {
            return (i[])j0.clone();
        }
    }

    private static final class j {
        JsonToken a;
        j b;

        private j() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    private static final class k {
        String a;
        k b;

        private k() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(", ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    private final class l {
        int a;
        String b;
        String c;
        String d;
        d e;
        final e f;

        private l(e e8) {
            this.f = e8;
        }

        public void a() {
            this.a = -1;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public String b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
            return this.f.o(this.b, this.d, xmlPullParser);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("xml ");
            int n8 = this.a;
            CharSequence charSequence = n8 == 1 ? "start" : (n8 == 2 ? "end" : "value");
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" <");
            stringBuilder.append(this.d);
            stringBuilder.append(":");
            stringBuilder.append(this.b);
            stringBuilder.append(">=");
            stringBuilder.append(this.c);
            if (this.e != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(", ");
                ((StringBuilder)charSequence).append(this.e);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = "";
            }
            stringBuilder.append((String)charSequence);
            return stringBuilder.toString();
        }
    }
}

