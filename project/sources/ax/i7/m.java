package ax.i7;

import ax.m7.C2523B;
import ax.m7.C2524C;
import ax.m7.C2527b;
import ax.m7.C2531f;
import ax.m7.C2532g;
import ax.m7.C2535j;
import ax.m7.k;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class m extends ax.m7.k {

    @ax.m7.n("Accept")
    private List<String> accept;

    @ax.m7.n("Accept-Encoding")
    private List<String> acceptEncoding;

    @ax.m7.n("Age")
    private List<Long> age;

    @ax.m7.n("WWW-Authenticate")
    private List<String> authenticate;

    @ax.m7.n("Authorization")
    private List<String> authorization;

    @ax.m7.n("Cache-Control")
    private List<String> cacheControl;

    @ax.m7.n("Content-Encoding")
    private List<String> contentEncoding;

    @ax.m7.n("Content-Length")
    private List<Long> contentLength;

    @ax.m7.n("Content-MD5")
    private List<String> contentMD5;

    @ax.m7.n("Content-Range")
    private List<String> contentRange;

    @ax.m7.n("Content-Type")
    private List<String> contentType;

    @ax.m7.n("Cookie")
    private List<String> cookie;

    @ax.m7.n("Date")
    private List<String> date;

    @ax.m7.n("ETag")
    private List<String> etag;

    @ax.m7.n("Expires")
    private List<String> expires;

    @ax.m7.n("If-Match")
    private List<String> ifMatch;

    @ax.m7.n("If-Modified-Since")
    private List<String> ifModifiedSince;

    @ax.m7.n("If-None-Match")
    private List<String> ifNoneMatch;

    @ax.m7.n("If-Range")
    private List<String> ifRange;

    @ax.m7.n("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;

    @ax.m7.n("Last-Modified")
    private List<String> lastModified;

    @ax.m7.n("Location")
    private List<String> location;

    @ax.m7.n("MIME-Version")
    private List<String> mimeVersion;

    @ax.m7.n("Range")
    private List<String> range;

    @ax.m7.n("Retry-After")
    private List<String> retryAfter;

    @ax.m7.n("User-Agent")
    private List<String> userAgent;

    @ax.m7.n("Warning")
    private List<String> warning;

    private static class a extends z {
        private final m e;
        private final b f;

        a(m mVar, b bVar) {
            this.e = mVar;
            this.f = bVar;
        }

        @Override // ax.i7.z
        public void a(String str, String str2) {
            this.e.v(str, str2, this.f);
        }

        @Override // ax.i7.z
        public AbstractC2274A b() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class b {
        final C2527b a;
        final StringBuilder b;
        final C2531f c;
        final List<Type> d;

        public b(m mVar, StringBuilder sb) {
            Class<?> cls = mVar.getClass();
            this.d = Arrays.asList(cls);
            this.c = C2531f.f(cls, true);
            this.b = sb;
            this.a = new C2527b(mVar);
        }

        void a() {
            this.a.b();
        }
    }

    public m() {
        super(EnumSet.of(k.c.IGNORE_CASE));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    private static String Q(Object obj) {
        return obj instanceof Enum ? C2535j.j((Enum) obj).e() : obj.toString();
    }

    private static void i(Logger logger, StringBuilder sb, StringBuilder sb2, z zVar, String str, Object obj, Writer writer) throws IOException {
        if (obj == null || C2532g.d(obj)) {
            return;
        }
        String Q = Q(obj);
        String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : Q;
        if (sb != null) {
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            sb.append(ax.m7.z.a);
        }
        if (sb2 != null) {
            sb2.append(" -H '");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            sb2.append("'");
        }
        if (zVar != null) {
            zVar.a(str, Q);
        }
        if (writer != null) {
            writer.write(str);
            writer.write(": ");
            writer.write(Q);
            writer.write("\r\n");
        }
    }

    private <T> List<T> m(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    private <T> T o(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static Object w(Type type, List<Type> list, String str) {
        return C2532g.k(C2532g.l(list, type), str);
    }

    static void x(m mVar, StringBuilder sb, StringBuilder sb2, Logger logger, z zVar) throws IOException {
        y(mVar, sb, sb2, logger, zVar, null);
    }

    static void y(m mVar, StringBuilder sb, StringBuilder sb2, Logger logger, z zVar, Writer writer) throws IOException {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : mVar.entrySet()) {
            String key = entry.getKey();
            ax.m7.v.c(hashSet.add(key), "multiple headers of the same name (headers are case insensitive): %s", key);
            Object value = entry.getValue();
            if (value != null) {
                C2535j b2 = mVar.c().b(key);
                if (b2 != null) {
                    key = b2.e();
                }
                String str = key;
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    Iterator it = C2524C.l(value).iterator();
                    while (it.hasNext()) {
                        i(logger, sb, sb2, zVar, str, it.next(), writer);
                    }
                } else {
                    i(logger, sb, sb2, zVar, str, value, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    public static void z(m mVar, StringBuilder sb, Logger logger, Writer writer) throws IOException {
        y(mVar, sb, null, logger, null, writer);
    }

    @Override // ax.m7.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public m f(String str, Object obj) {
        return (m) super.f(str, obj);
    }

    public m C(String str) {
        this.acceptEncoding = m(str);
        return this;
    }

    public m D(String str) {
        return E(m(str));
    }

    public m E(List<String> list) {
        this.authorization = list;
        return this;
    }

    public m F(String str) {
        this.contentEncoding = m(str);
        return this;
    }

    public m G(Long l) {
        this.contentLength = m(l);
        return this;
    }

    public m H(String str) {
        this.contentRange = m(str);
        return this;
    }

    public m I(String str) {
        this.contentType = m(str);
        return this;
    }

    public m J(String str) {
        this.ifMatch = m(str);
        return this;
    }

    public m K(String str) {
        this.ifModifiedSince = m(str);
        return this;
    }

    public m L(String str) {
        this.ifNoneMatch = m(str);
        return this;
    }

    public m M(String str) {
        this.ifRange = m(str);
        return this;
    }

    public m N(String str) {
        this.ifUnmodifiedSince = m(str);
        return this;
    }

    public m O(String str) {
        this.range = m(str);
        return this;
    }

    public m P(String str) {
        this.userAgent = m(str);
        return this;
    }

    @Override // ax.m7.k, java.util.AbstractMap
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m clone() {
        return (m) super.clone();
    }

    public final void k(m mVar) {
        try {
            b bVar = new b(this, null);
            x(mVar, null, null, null, new a(this, bVar));
            bVar.a();
        } catch (IOException e) {
            throw C2523B.a(e);
        }
    }

    public final void l(AbstractC2274A abstractC2274A, StringBuilder sb) throws IOException {
        clear();
        b bVar = new b(this, sb);
        int f = abstractC2274A.f();
        for (int i = 0; i < f; i++) {
            v(abstractC2274A.g(i), abstractC2274A.h(i), bVar);
        }
        bVar.a();
    }

    public final String n() {
        return (String) o(this.contentType);
    }

    public final String r() {
        return (String) o(this.location);
    }

    public final String s() {
        return (String) o(this.range);
    }

    public final String t() {
        return (String) o(this.userAgent);
    }

    void v(String str, String str2, b bVar) {
        List<Type> list = bVar.d;
        C2531f c2531f = bVar.c;
        C2527b c2527b = bVar.a;
        StringBuilder sb = bVar.b;
        if (sb != null) {
            sb.append(str + ": " + str2);
            sb.append(ax.m7.z.a);
        }
        C2535j b2 = c2531f.b(str);
        if (b2 == null) {
            ArrayList arrayList = (ArrayList) get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                f(str, arrayList);
            }
            arrayList.add(str2);
            return;
        }
        Type l = C2532g.l(list, b2.d());
        if (C2524C.j(l)) {
            Class<?> f = C2524C.f(list, C2524C.b(l));
            c2527b.a(b2.b(), f, w(f, list, str2));
        } else {
            if (!C2524C.k(C2524C.f(list, l), Iterable.class)) {
                b2.m(this, w(l, list, str2));
                return;
            }
            Collection<Object> collection = (Collection) b2.g(this);
            if (collection == null) {
                collection = C2532g.h(l);
                b2.m(this, collection);
            }
            collection.add(w(l == Object.class ? null : C2524C.d(l), list, str2));
        }
    }
}
