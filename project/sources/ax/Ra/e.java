package ax.Ra;

import ax.r8.C3001j;
import ax.r8.C3009r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class e extends JsonReader {
    final g c0;
    private final h<j> d0;
    private final h<k> e0;
    private j f0;
    private j g0;
    private k h0;
    private k i0;
    private JsonToken j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    private String n0;
    private final ax.Ra.c<i> o0;
    private final ax.Ra.c<C0185e> p0;
    private final XmlPullParser q;
    private JsonToken q0;
    private int r0;
    private boolean s0;
    private final l t0;
    private final d u0;

    class a implements f<j> {
        a() {
        }

        @Override // ax.Ra.e.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a() {
            return new j(null);
        }
    }

    class b implements f<k> {
        b() {
        }

        @Override // ax.Ra.e.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a() {
            return new k(null);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.BEGIN_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private final class d {
        String[] a;
        String[] b;
        String[] c;
        int d = 0;

        public d(int i) {
            a(i);
        }

        private void a(int i) {
            this.a = new String[i];
            this.b = new String[i];
            this.c = new String[i];
        }

        public void b(XmlPullParser xmlPullParser) {
            int attributeCount = xmlPullParser.getAttributeCount();
            if (attributeCount > this.a.length) {
                a(attributeCount);
            }
            this.d = attributeCount;
            for (int i = 0; i < attributeCount; i++) {
                this.a[i] = xmlPullParser.getAttributeName(i);
                if (e.this.c0.d) {
                    this.c[i] = xmlPullParser.getAttributePrefix(i);
                }
                this.b[i] = xmlPullParser.getAttributeValue(i);
            }
        }

        public String c(int i) throws IOException, XmlPullParserException {
            return e.this.o(this.a[i], this.c[i], null);
        }
    }

    /* renamed from: ax.Ra.e$e, reason: collision with other inner class name */
    private static class C0185e {
        int a;
        String b;

        public C0185e(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public String toString() {
            return "'" + this.b + "'/" + this.a;
        }
    }

    private interface f<T> {
        T a();
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

        public h(f<T> fVar) {
            this.a = fVar;
        }

        public T a() {
            int i = this.c;
            if (i == 0) {
                return this.a.a();
            }
            Object[] objArr = this.b;
            int i2 = i - 1;
            this.c = i2;
            return (T) objArr[i2];
        }

        public void b(T t) {
            int i = this.c;
            if (i < 32) {
                Object[] objArr = this.b;
                this.c = i + 1;
                objArr[i] = t;
            }
        }
    }

    private enum i {
        INSIDE_OBJECT(false),
        INSIDE_ARRAY(true),
        INSIDE_EMBEDDED_ARRAY(true),
        INSIDE_PRIMITIVE_EMBEDDED_ARRAY(true),
        INSIDE_PRIMITIVE_ARRAY(true),
        PRIMITIVE_VALUE(false),
        NAME(false);

        final boolean q;

        i(boolean z) {
            this.q = z;
        }
    }

    private static final class j {
        JsonToken a;
        j b;

        private j() {
        }

        public String toString() {
            return this.a + ", " + this.b;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    private static final class k {
        String a;
        k b;

        private k() {
        }

        public String toString() {
            return this.a + ", " + this.b;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private final class l {
        int a;
        String b;
        String c;
        String d;
        d e;

        private l() {
        }

        public void a() {
            this.a = -1;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public String b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
            return e.this.o(this.b, this.d, xmlPullParser);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("xml ");
            int i = this.a;
            sb.append(i == 1 ? "start" : i == 2 ? "end" : "value");
            sb.append(" <");
            sb.append(this.d);
            sb.append(":");
            sb.append(this.b);
            sb.append(">=");
            sb.append(this.c);
            if (this.e != null) {
                str = ", " + this.e;
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb.append(str);
            return sb.toString();
        }

        /* synthetic */ l(e eVar, a aVar) {
            this();
        }
    }

    public e(Reader reader, ax.Ra.d dVar, g gVar) {
        super(reader);
        this.d0 = new h<>(new a());
        this.e0 = new h<>(new b());
        this.l0 = true;
        this.m0 = false;
        this.o0 = new ax.Ra.c<>();
        this.p0 = new ax.Ra.c<>();
        this.r0 = 0;
        l lVar = new l(this, null);
        this.t0 = lVar;
        this.u0 = new d(10);
        XmlPullParser a2 = dVar.a();
        this.q = a2;
        this.c0 = gVar;
        lVar.a = -1;
        try {
            a2.setInput(reader);
            a2.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", gVar.d);
        } catch (XmlPullParserException e) {
            throw new C3001j(e);
        }
    }

    private void A(l lVar) throws IOException, XmlPullParserException {
        switch (this.o0.g()) {
            case INSIDE_OBJECT:
                d(JsonToken.END_OBJECT);
                this.r0 = 0;
                m();
                break;
            case INSIDE_ARRAY:
            case INSIDE_PRIMITIVE_ARRAY:
                d(JsonToken.END_ARRAY);
                m();
                break;
            case INSIDE_EMBEDDED_ARRAY:
            case INSIDE_PRIMITIVE_EMBEDDED_ARRAY:
                d(JsonToken.END_ARRAY);
                d(JsonToken.END_OBJECT);
                m();
                m();
                break;
            case PRIMITIVE_VALUE:
                this.o0.c();
                break;
            case NAME:
                if (this.m0) {
                    b(HttpUrl.FRAGMENT_ENCODE_SET, true);
                }
                m();
                break;
        }
        if (this.c0.c) {
            int depth = this.q.getDepth();
            String b2 = this.c0.d ? lVar.b(this.q) : lVar.b;
            ax.Ra.c<C0185e> cVar = this.p0;
            while (cVar.j() > 0 && cVar.g().a > depth) {
                cVar.c();
            }
            if (cVar.j() == 0 || cVar.g().a < depth) {
                cVar.h(new C0185e(depth, b2));
            } else {
                cVar.g().b = b2;
            }
        }
    }

    private void F(l lVar) throws IOException, XmlPullParserException {
        if (!this.c0.b) {
            d(this.j0);
            this.o0.h(i.INSIDE_OBJECT);
            H(lVar);
            return;
        }
        if (lVar.e != null) {
            d(JsonToken.BEGIN_OBJECT);
            this.o0.h(i.INSIDE_OBJECT);
            c(lVar.e);
            return;
        }
        int i2 = c.a[this.j0.ordinal()];
        if (i2 == 1) {
            d(JsonToken.BEGIN_OBJECT);
            this.o0.h(i.INSIDE_OBJECT);
        } else if (i2 == 3) {
            d(JsonToken.BEGIN_ARRAY);
            this.o0.h(this.c0.e ? i.INSIDE_PRIMITIVE_ARRAY : i.INSIDE_ARRAY);
        } else {
            throw new IllegalStateException("First expectedToken=" + this.j0 + " (not begin_object/begin_array)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H(ax.Ra.e.l r5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Ra.e.H(ax.Ra.e$l):void");
    }

    private boolean L(l lVar) {
        int ordinal = this.o0.g().ordinal();
        if (ordinal == 0) {
            String str = "$";
            if (this.r0 > 0) {
                str = "$" + this.r0;
            }
            this.r0++;
            d(JsonToken.NAME);
            e(str);
            b(lVar.c, false);
            return false;
        }
        if (ordinal == 5) {
            b(lVar.c, false);
            return false;
        }
        if (ordinal == 6) {
            b(lVar.c, true);
            return true;
        }
        throw new C3009r("Cannot process text '" + lVar.c + "' inside scope " + this.o0.g());
    }

    private void W(JsonToken jsonToken) {
        j a2 = this.d0.a();
        a2.a = jsonToken;
        a2.b = null;
        j jVar = this.g0;
        if (jVar == null) {
            this.g0 = a2;
            this.f0 = a2;
        } else {
            a2.b = jVar;
            this.g0 = a2;
        }
    }

    private void a() throws XmlPullParserException, IOException {
        Set<String> set;
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.q0;
        JsonToken jsonToken3 = this.j0;
        if (jsonToken2 == jsonToken3) {
            return;
        }
        JsonToken jsonToken4 = JsonToken.BEGIN_OBJECT;
        if (jsonToken3 == jsonToken4 && jsonToken2 == (jsonToken = JsonToken.STRING) && HttpUrl.FRAGMENT_ENCODE_SET.equals(this.h0.a)) {
            this.q0 = jsonToken4;
            String str = q().a;
            W(JsonToken.END_OBJECT);
            W(jsonToken);
            W(JsonToken.NAME);
            d0(str);
            d0("$");
            return;
        }
        JsonToken jsonToken5 = this.j0;
        JsonToken jsonToken6 = JsonToken.BEGIN_ARRAY;
        if (jsonToken5 != jsonToken6) {
            return;
        }
        int i2 = c.a[this.q0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            this.q0 = jsonToken6;
            g gVar = this.c0;
            if (!gVar.c) {
                W(JsonToken.END_ARRAY);
                if (this.i0 != null) {
                    q();
                    return;
                }
                return;
            }
            if (gVar.a && ((set = gVar.h) == null || (set != null && set.contains(this.n0)))) {
                W(JsonToken.STRING);
                this.o0.h(i.INSIDE_PRIMITIVE_EMBEDDED_ARRAY);
                return;
            }
            String str2 = q().a;
            W(JsonToken.END_OBJECT);
            W(JsonToken.STRING);
            W(JsonToken.NAME);
            W(jsonToken4);
            d0(str2);
            d0("$");
            this.o0.h(i.INSIDE_EMBEDDED_ARRAY);
            return;
        }
        this.q0 = jsonToken6;
        i g2 = this.o0.g();
        if (v() == JsonToken.NAME) {
            if (this.c0.c) {
                this.o0.a(2);
                W(jsonToken4);
                this.o0.h(i.INSIDE_EMBEDDED_ARRAY);
                this.o0.h(i.INSIDE_OBJECT);
                i iVar = i.NAME;
                if (g2 == iVar) {
                    this.o0.h(iVar);
                    return;
                }
                return;
            }
            p();
            q();
            int j2 = this.o0.j();
            if (this.c0.a && v() == null) {
                j(true);
            }
            int b2 = this.o0.b(3, j2);
            if (this.c0.a && v() == JsonToken.STRING) {
                this.o0.i(b2, i.INSIDE_PRIMITIVE_ARRAY);
                return;
            }
            this.o0.i(b2, i.INSIDE_ARRAY);
            int i3 = b2 + 1;
            if (this.o0.j() <= i3 || this.o0.f(i3) != i.INSIDE_OBJECT) {
                this.o0.i(i3, i.INSIDE_OBJECT);
            }
            if (v() != jsonToken4) {
                W(jsonToken4);
            }
        }
    }

    private void b(String str, boolean z) {
        j jVar;
        if (!z || (jVar = this.f0) == null || jVar.a != JsonToken.STRING) {
            d(JsonToken.STRING);
            e(str);
        } else if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            k kVar = this.h0;
            sb.append(kVar.a);
            sb.append(" ");
            sb.append(str);
            kVar.a = sb.toString();
        }
    }

    private void c(d dVar) throws IOException, XmlPullParserException {
        int i2 = dVar.d;
        for (int i3 = 0; i3 < i2; i3++) {
            d(JsonToken.NAME);
            e("@" + dVar.c(i3));
            d(JsonToken.STRING);
            e(dVar.b[i3]);
        }
    }

    private void d(JsonToken jsonToken) {
        j a2 = this.d0.a();
        a2.a = jsonToken;
        a2.b = null;
        j jVar = this.f0;
        if (jVar == null) {
            this.f0 = a2;
            this.g0 = a2;
        } else {
            jVar.b = a2;
            this.f0 = a2;
        }
    }

    private void d0(String str) {
        k a2 = this.e0.a();
        a2.a = str;
        a2.b = null;
        k kVar = this.i0;
        if (kVar == null) {
            this.h0 = a2;
            this.i0 = a2;
        } else {
            a2.b = kVar;
            this.i0 = a2;
        }
    }

    private void e(String str) {
        k a2 = this.e0.a();
        a2.a = str.trim();
        a2.b = null;
        k kVar = this.h0;
        if (kVar == null) {
            this.h0 = a2;
            this.i0 = a2;
        } else {
            kVar.b = a2;
            this.h0 = a2;
        }
    }

    private CharSequence f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scopes: ");
        sb.append(this.o0);
        sb.append('\n');
        sb.append("Closed tags: ");
        sb.append(this.p0);
        sb.append('\n');
        sb.append("Token: ");
        sb.append(this.q0);
        sb.append('\n');
        sb.append("Tokens queue: ");
        sb.append(this.g0);
        sb.append('\n');
        sb.append("Values queue: ");
        sb.append(this.i0);
        sb.append('\n');
        return sb;
    }

    private void g(JsonToken jsonToken) throws IOException {
        JsonToken peek = peek();
        this.q0 = null;
        if (peek == jsonToken) {
            return;
        }
        throw new IllegalStateException(jsonToken + " expected, but met " + peek + "\n" + ((Object) f()));
    }

    private void j(boolean z) throws IOException, XmlPullParserException {
        while (true) {
            if ((this.f0 != null || this.k0) && !z) {
                return;
            }
            l u = u();
            if (this.k0) {
                if (this.c0.b) {
                    return;
                }
                d(JsonToken.END_OBJECT);
                return;
            }
            int i2 = u.a;
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        A(u);
                    } else if (i2 == 3) {
                        z = L(u);
                        if (z && this.s0) {
                            return;
                        }
                    }
                } else if (this.l0) {
                    this.l0 = false;
                    F(u);
                } else {
                    H(u);
                }
                z = false;
                if (z) {
                    continue;
                } else {
                    return;
                }
            }
        }
    }

    private void m() {
        this.o0.e(i.NAME);
    }

    private JsonToken p() {
        j jVar = this.g0;
        if (jVar == null) {
            return JsonToken.END_DOCUMENT;
        }
        this.g0 = jVar.b;
        if (jVar == this.f0) {
            this.f0 = null;
        }
        this.d0.b(jVar);
        return jVar.a;
    }

    private k q() {
        k kVar = this.i0;
        if (kVar == null) {
            throw new IllegalStateException("No value can be given");
        }
        if (kVar == this.h0) {
            this.h0 = null;
        }
        this.e0.b(kVar);
        this.i0 = kVar.b;
        return kVar;
    }

    private l u() throws IOException, XmlPullParserException {
        int next = this.q.next();
        l lVar = this.t0;
        lVar.a();
        if (next == 1) {
            this.k0 = true;
        } else {
            if (next == 2) {
                lVar.a = 1;
                lVar.b = this.q.getName();
                lVar.d = this.q.getNamespace();
                if (this.q.getAttributeCount() > 0) {
                    this.u0.b(this.q);
                    lVar.e = this.u0;
                }
                return lVar;
            }
            if (next == 3) {
                lVar.a = 2;
                lVar.b = this.q.getName();
                lVar.d = this.q.getNamespace();
                return lVar;
            }
            if (next == 4) {
                String trim = this.q.getText().trim();
                if (trim.length() == 0) {
                    this.m0 = true;
                    lVar.a = -1;
                    return lVar;
                }
                this.m0 = false;
                lVar.a = 3;
                lVar.c = trim;
                return lVar;
            }
        }
        lVar.a = -1;
        return lVar;
    }

    private JsonToken v() {
        j jVar = this.g0;
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        this.j0 = jsonToken;
        g(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
        this.j0 = jsonToken;
        g(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.j0 = jsonToken;
        g(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.j0 = jsonToken;
        g(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        peek();
        JsonToken jsonToken = this.q0;
        return (jsonToken == JsonToken.END_OBJECT || jsonToken == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        g(JsonToken.BOOLEAN);
        String str = q().a;
        if ("true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str)) {
            return true;
        }
        throw new IOException("Cannot parse <" + str + "> to boolean");
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        g(JsonToken.STRING);
        return Double.parseDouble(q().a);
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        g(JsonToken.STRING);
        return Integer.parseInt(q().a);
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        g(JsonToken.STRING);
        return Long.parseLong(q().a);
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        JsonToken jsonToken = JsonToken.NAME;
        this.j0 = jsonToken;
        g(jsonToken);
        return q().a;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        g(JsonToken.STRING);
        return q().a;
    }

    String o(String str, String str2, XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (this.c0.f || str2 == null || str2.length() <= 0) {
            return str;
        }
        Map<String, String> map = this.c0.g;
        if (map != null && map.containsKey(str2)) {
            str2 = this.c0.g.get(str2);
        } else if (xmlPullParser != null) {
            int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
            int i2 = 0;
            while (true) {
                if (i2 >= namespaceCount) {
                    break;
                }
                if (str2.equals(xmlPullParser.getNamespaceUri(i2))) {
                    str2 = xmlPullParser.getNamespacePrefix(i2);
                    break;
                }
                i2++;
            }
        }
        return "<" + str2 + ">" + str;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.j0 == null && this.l0) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (this.q0 != null) {
            try {
                a();
                this.j0 = null;
                return this.q0;
            } catch (XmlPullParserException e) {
                throw new C3009r("XML parsing exception", e);
            }
        }
        try {
            j(false);
            this.j0 = null;
            JsonToken p = p();
            this.q0 = p;
            return p;
        } catch (XmlPullParserException e2) {
            throw new C3009r("XML parsing exception", e2);
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        this.s0 = true;
        int i2 = 0;
        do {
            try {
                JsonToken peek = peek();
                if (peek != JsonToken.BEGIN_ARRAY && peek != JsonToken.BEGIN_OBJECT) {
                    if (peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT) {
                        if (this.h0 != null) {
                            q();
                        }
                        this.q0 = null;
                    }
                    i2--;
                    this.q0 = null;
                }
                i2++;
                this.q0 = null;
            } catch (Throwable th) {
                this.s0 = false;
                throw th;
            }
        } while (i2 != 0);
        this.s0 = false;
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return "--- XmlReader ---\n" + ((Object) f());
    }
}
