package ax.g7;

import ax.b7.C1722a;
import ax.f7.C2079a;
import ax.f7.C2080b;
import ax.i7.AbstractC2278b;
import ax.i7.C2281e;
import ax.i7.C2282f;
import ax.i7.D;
import ax.i7.g;
import ax.i7.i;
import ax.i7.m;
import ax.i7.p;
import ax.i7.q;
import ax.i7.s;
import ax.i7.t;
import ax.i7.u;
import ax.m7.k;
import ax.m7.v;
import com.google.api.client.googleapis.GoogleUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ax.g7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2128b<T> extends k {
    private final AbstractC2127a e0;
    private final String f0;
    private final String g0;
    private final i h0;
    private m j0;
    private String l0;
    private boolean m0;
    private boolean n0;
    private Class<T> o0;
    private C2080b p0;
    private C2079a q0;
    private m i0 = new m();
    private int k0 = -1;

    /* renamed from: ax.g7.b$a */
    class a implements u {
        final /* synthetic */ u a;
        final /* synthetic */ p b;

        a(u uVar, p pVar) {
            this.a = uVar;
            this.b = pVar;
        }

        @Override // ax.i7.u
        public void a(s sVar) throws IOException {
            u uVar = this.a;
            if (uVar != null) {
                uVar.a(sVar);
            }
            if (!sVar.l() && this.b.m()) {
                throw AbstractC2128b.this.x(sVar);
            }
        }
    }

    /* renamed from: ax.g7.b$b, reason: collision with other inner class name */
    static class C0316b {
        static final String b = new C0316b().toString();
        private final String a;

        C0316b() {
            this(d(), ax.q7.s.OS_NAME.j(), ax.q7.s.OS_VERSION.j(), GoogleUtils.a);
        }

        private static String a(String str) {
            return str.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
        }

        private static String b(String str) {
            return c(str, str);
        }

        private static String c(String str, String str2) {
            if (str == null) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
            return matcher.find() ? matcher.group(1) : str2;
        }

        private static String d() {
            String property = System.getProperty("java.version");
            if (property == null) {
                return null;
            }
            String c = c(property, null);
            if (c != null) {
                return c;
            }
            Matcher matcher = Pattern.compile("^(\\d+)[^\\d]?").matcher(property);
            if (!matcher.find()) {
                return null;
            }
            return matcher.group(1) + ".0.0";
        }

        public String toString() {
            return this.a;
        }

        C0316b(String str, String str2, String str3, String str4) {
            StringBuilder sb = new StringBuilder("gl-java/");
            sb.append(b(str));
            sb.append(" gdcl/");
            sb.append(b(str4));
            if (str2 != null && str3 != null) {
                sb.append(" ");
                sb.append(a(str2));
                sb.append("/");
                sb.append(b(str3));
            }
            this.a = sb.toString();
        }
    }

    protected AbstractC2128b(AbstractC2127a abstractC2127a, String str, String str2, i iVar, Class<T> cls) {
        this.o0 = (Class) v.d(cls);
        this.e0 = (AbstractC2127a) v.d(abstractC2127a);
        this.f0 = (String) v.d(str);
        this.g0 = (String) v.d(str2);
        this.h0 = iVar;
        String a2 = abstractC2127a.a();
        if (a2 != null) {
            this.i0.P(a2 + " Google-API-Java-Client/" + GoogleUtils.a);
        } else {
            this.i0.P("Google-API-Java-Client/" + GoogleUtils.a);
        }
        this.i0.f("X-Goog-Api-Client", C0316b.b);
    }

    private p i(boolean z) throws IOException {
        v.a(this.p0 == null);
        v.a(!z || this.f0.equals("GET"));
        p c = o().e().c(z ? "HEAD" : this.f0, j(), this.h0);
        new C1722a().a(c);
        c.x(o().d());
        if (this.h0 == null && (this.f0.equals("POST") || this.f0.equals("PUT") || this.f0.equals("PATCH"))) {
            c.t(new C2281e());
        }
        c.f().putAll(this.i0);
        if (!this.m0) {
            c.u(new C2282f());
        }
        c.B(this.n0);
        c.A(new a(c.k(), c));
        return c;
    }

    private s n(boolean z) throws IOException {
        s u;
        if (this.p0 == null) {
            u = i(z).b();
        } else {
            g j = j();
            boolean m = o().e().c(this.f0, j, this.h0).m();
            u = this.p0.p(this.i0).o(this.m0).u(j);
            u.g().x(o().d());
            if (m && !u.l()) {
                throw x(u);
            }
        }
        this.j0 = u.f();
        this.k0 = u.h();
        this.l0 = u.i();
        return u;
    }

    public T execute() throws IOException {
        return (T) m().m(this.o0);
    }

    public g j() {
        return new g(D.c(this.e0.b(), this.g0, this, true));
    }

    protected s k() throws IOException {
        f("alt", "media");
        return m();
    }

    protected InputStream l() throws IOException {
        return k().c();
    }

    public s m() throws IOException {
        return n(false);
    }

    public AbstractC2127a o() {
        return this.e0;
    }

    public final C2080b r() {
        return this.p0;
    }

    public final m s() {
        return this.i0;
    }

    public final String t() {
        return this.g0;
    }

    protected final void v() {
        q e = this.e0.e();
        this.q0 = new C2079a(e.e(), e.d());
    }

    protected final void w(AbstractC2278b abstractC2278b) {
        q e = this.e0.e();
        C2080b c2080b = new C2080b(abstractC2278b, e.e(), e.d());
        this.p0 = c2080b;
        c2080b.q(this.f0);
        i iVar = this.h0;
        if (iVar != null) {
            this.p0.r(iVar);
        }
    }

    protected IOException x(s sVar) {
        return new t(sVar);
    }

    @Override // ax.m7.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC2128b<T> f(String str, Object obj) {
        return (AbstractC2128b) super.f(str, obj);
    }
}
