/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.A;
import ax.i7.z;
import ax.m7.B;
import ax.m7.C;
import ax.m7.f;
import ax.m7.g;
import ax.m7.j;
import ax.m7.k;
import ax.m7.n;
import ax.m7.v;
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

public class m
extends k {
    @n(value="Accept")
    private List<String> accept;
    @n(value="Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList<String>(Collections.singleton("gzip"));
    @n(value="Age")
    private List<Long> age;
    @n(value="WWW-Authenticate")
    private List<String> authenticate;
    @n(value="Authorization")
    private List<String> authorization;
    @n(value="Cache-Control")
    private List<String> cacheControl;
    @n(value="Content-Encoding")
    private List<String> contentEncoding;
    @n(value="Content-Length")
    private List<Long> contentLength;
    @n(value="Content-MD5")
    private List<String> contentMD5;
    @n(value="Content-Range")
    private List<String> contentRange;
    @n(value="Content-Type")
    private List<String> contentType;
    @n(value="Cookie")
    private List<String> cookie;
    @n(value="Date")
    private List<String> date;
    @n(value="ETag")
    private List<String> etag;
    @n(value="Expires")
    private List<String> expires;
    @n(value="If-Match")
    private List<String> ifMatch;
    @n(value="If-Modified-Since")
    private List<String> ifModifiedSince;
    @n(value="If-None-Match")
    private List<String> ifNoneMatch;
    @n(value="If-Range")
    private List<String> ifRange;
    @n(value="If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @n(value="Last-Modified")
    private List<String> lastModified;
    @n(value="Location")
    private List<String> location;
    @n(value="MIME-Version")
    private List<String> mimeVersion;
    @n(value="Range")
    private List<String> range;
    @n(value="Retry-After")
    private List<String> retryAfter;
    @n(value="User-Agent")
    private List<String> userAgent;
    @n(value="Warning")
    private List<String> warning;

    public m() {
        super(EnumSet.of(k.c.q));
    }

    private static String Q(Object object) {
        if (object instanceof Enum) {
            return j.j((Enum)object).e();
        }
        return object.toString();
    }

    private static void i(Logger object, StringBuilder stringBuilder, StringBuilder stringBuilder2, z z8, String string, Object object2, Writer writer) throws IOException {
        if (object2 != null && !g.d(object2)) {
            object2 = m.Q(object2);
            object = !"Authorization".equalsIgnoreCase(string) && !"Cookie".equalsIgnoreCase(string) || object != null && ((Logger)object).isLoggable(Level.ALL) ? object2 : "<Not Logged>";
            if (stringBuilder != null) {
                stringBuilder.append(string);
                stringBuilder.append(": ");
                stringBuilder.append((String)object);
                stringBuilder.append(ax.m7.z.a);
            }
            if (stringBuilder2 != null) {
                stringBuilder2.append(" -H '");
                stringBuilder2.append(string);
                stringBuilder2.append(": ");
                stringBuilder2.append((String)object);
                stringBuilder2.append("'");
            }
            if (z8 != null) {
                z8.a(string, (String)object2);
            }
            if (writer != null) {
                writer.write(string);
                writer.write(": ");
                writer.write((String)object2);
                writer.write("\r\n");
            }
        }
    }

    private <T> List<T> m(T t8) {
        if (t8 == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(t8);
        return arrayList;
    }

    private <T> T o(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static Object w(Type type, List<Type> list, String string) {
        return g.k(g.l(list, type), string);
    }

    static void x(m m8, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, z z8) throws IOException {
        m.y(m8, stringBuilder, stringBuilder2, logger, z8, null);
    }

    static void y(m m8, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, z z8, Writer writer) throws IOException {
        HashSet<String> hashSet = new HashSet<String>();
        for (Map.Entry<String, Object> entry : m8.entrySet()) {
            String string = entry.getKey();
            v.c(hashSet.add(string), "multiple headers of the same name (headers are case insensitive): %s", string);
            Object object = entry.getValue();
            if (object == null) continue;
            Object object2 = m8.c().b(string);
            if (object2 != null) {
                string = ((j)object2).e();
            }
            object2 = object.getClass();
            if (!(object instanceof Iterable) && !((Class)object2).isArray()) {
                m.i(logger, stringBuilder, stringBuilder2, z8, string, object, writer);
                continue;
            }
            Iterator iterator = C.l(object).iterator();
            while (iterator.hasNext()) {
                m.i(logger, stringBuilder, stringBuilder2, z8, string, iterator.next(), writer);
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    public static void z(m m8, StringBuilder stringBuilder, Logger logger, Writer writer) throws IOException {
        m.y(m8, stringBuilder, null, logger, null, writer);
    }

    public m B(String string, Object object) {
        return (m)super.f(string, object);
    }

    public m C(String string) {
        this.acceptEncoding = this.m(string);
        return this;
    }

    public m D(String string) {
        return this.E(this.m(string));
    }

    public m E(List<String> list) {
        this.authorization = list;
        return this;
    }

    public m F(String string) {
        this.contentEncoding = this.m(string);
        return this;
    }

    public m G(Long l8) {
        this.contentLength = this.m(l8);
        return this;
    }

    public m H(String string) {
        this.contentRange = this.m(string);
        return this;
    }

    public m I(String string) {
        this.contentType = this.m(string);
        return this;
    }

    public m J(String string) {
        this.ifMatch = this.m(string);
        return this;
    }

    public m K(String string) {
        this.ifModifiedSince = this.m(string);
        return this;
    }

    public m L(String string) {
        this.ifNoneMatch = this.m(string);
        return this;
    }

    public m M(String string) {
        this.ifRange = this.m(string);
        return this;
    }

    public m N(String string) {
        this.ifUnmodifiedSince = this.m(string);
        return this;
    }

    public m O(String string) {
        this.range = this.m(string);
        return this;
    }

    public m P(String string) {
        this.userAgent = this.m(string);
        return this;
    }

    public m j() {
        return (m)super.b();
    }

    public final void k(m m8) {
        try {
            b b8 = new b(this, null);
            a a8 = new a(this, b8);
            m.x(m8, null, null, null, a8);
            b8.a();
            return;
        }
        catch (IOException iOException) {
            throw B.a(iOException);
        }
    }

    public final void l(A a8, StringBuilder object) throws IOException {
        this.clear();
        object = new b(this, (StringBuilder)object);
        int n8 = a8.f();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.v(a8.g(i8), a8.h(i8), (b)object);
        }
        ((b)object).a();
    }

    public final String n() {
        return this.o(this.contentType);
    }

    public final String r() {
        return this.o(this.location);
    }

    public final String s() {
        return this.o(this.range);
    }

    public final String t() {
        return this.o(this.userAgent);
    }

    void v(String collection, String string, b object) {
        Object object2;
        ArrayList arrayList = ((b)object).d;
        Object object3 = ((b)object).c;
        ax.m7.b b8 = ((b)object).a;
        object = ((b)object).b;
        if (object != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)((Object)collection));
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object).append(((StringBuilder)object2).toString());
            ((StringBuilder)object).append(ax.m7.z.a);
        }
        if ((object3 = ((f)object3).b((String)((Object)collection))) != null) {
            object2 = g.l(arrayList, ((j)object3).d());
            if (C.j((Type)object2)) {
                collection = C.f(arrayList, C.b((Type)object2));
                b8.a(((j)object3).b(), (Class<?>)((Object)collection), m.w((Type)((Object)collection), arrayList, string));
                return;
            }
            if (C.k(C.f(arrayList, (Type)object2), Iterable.class)) {
                object = (Collection)((j)object3).g(this);
                collection = object;
                if (object == null) {
                    collection = g.h((Type)object2);
                    ((j)object3).m(this, collection);
                }
                object = object2 == Object.class ? null : C.d((Type)object2);
                collection.add(m.w((Type)object, arrayList, string));
                return;
            }
            ((j)object3).m(this, m.w((Type)object2, arrayList, string));
            return;
        }
        arrayList = (ArrayList)this.get(collection);
        object = arrayList;
        if (arrayList == null) {
            object = new ArrayList<String>();
            this.B((String)((Object)collection), object);
        }
        ((ArrayList)object).add(string);
    }

    private static class a
    extends z {
        private final m e;
        private final b f;

        a(m m8, b b8) {
            this.e = m8;
            this.f = b8;
        }

        @Override
        public void a(String string, String string2) {
            this.e.v(string, string2, this.f);
        }

        @Override
        public A b() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class b {
        final ax.m7.b a;
        final StringBuilder b;
        final f c;
        final List<Type> d;

        public b(m m8, StringBuilder stringBuilder) {
            Class<?> clazz = m8.getClass();
            this.d = Arrays.asList(clazz);
            this.c = f.f(clazz, true);
            this.b = stringBuilder;
            this.a = new ax.m7.b(m8);
        }

        void a() {
            this.a.b();
        }
    }
}

