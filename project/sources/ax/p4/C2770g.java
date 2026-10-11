package ax.p4;

import ax.t4.AbstractC3100b;
import ax.t4.C3099a;
import ax.w4.AbstractC3341a;
import ax.w4.AbstractC3342b;
import ax.w4.C3346f;
import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: ax.p4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2770g extends AbstractC3342b {
    public static final AbstractC3100b<C2770g> d = new a();
    public static final AbstractC3100b<String> e = new b();
    public static final AbstractC3100b<String> f = new c();
    private final String a;
    private final String b;
    private final C2774k c;

    /* renamed from: ax.p4.g$a */
    class a extends AbstractC3100b<C2770g> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final C2770g d(ax.T4.j jVar) throws IOException, C3099a {
            ax.T4.h b = AbstractC3100b.b(jVar);
            String str = null;
            C2774k c2774k = null;
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                try {
                    if (g.equals("key")) {
                        str = C2770g.e.f(jVar, g, str);
                    } else if (g.equals("secret")) {
                        str2 = C2770g.f.f(jVar, g, str2);
                    } else if (g.equals("host")) {
                        c2774k = C2774k.f.f(jVar, g, c2774k);
                    } else {
                        AbstractC3100b.k(jVar);
                    }
                } catch (C3099a e) {
                    throw e.a(g);
                }
            }
            AbstractC3100b.a(jVar);
            if (str == null) {
                throw new C3099a("missing field \"key\"", b);
            }
            if (c2774k == null) {
                c2774k = C2774k.e;
            }
            return new C2770g(str, str2, c2774k);
        }
    }

    /* renamed from: ax.p4.g$b */
    class b extends AbstractC3100b<String> {
        b() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                String u = jVar.u();
                String f = C2770g.f(u);
                if (f == null) {
                    jVar.H();
                    return u;
                }
                throw new C3099a("bad format for app key: " + f, jVar.v());
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    /* renamed from: ax.p4.g$c */
    class c extends AbstractC3100b<String> {
        c() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                String u = jVar.u();
                String f = C2770g.f(u);
                if (f == null) {
                    jVar.H();
                    return u;
                }
                throw new C3099a("bad format for app secret: " + f, jVar.v());
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    public C2770g(String str, String str2, C2774k c2774k) {
        d(str);
        e(str2);
        this.a = str;
        this.b = str2;
        this.c = c2774k;
    }

    public static void d(String str) {
        String g = str == null ? "can't be null" : g(str);
        if (g == null) {
            return;
        }
        throw new IllegalArgumentException("Bad 'key': " + g);
    }

    public static void e(String str) {
        String g = g(str);
        if (g == null) {
            return;
        }
        throw new IllegalArgumentException("Bad 'secret': " + g);
    }

    public static String f(String str) {
        return g(str);
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "can't be empty";
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                return "invalid character at index " + i + ": " + C3346f.f(HttpUrl.FRAGMENT_ENCODE_SET + charAt);
            }
        }
        return null;
    }

    @Override // ax.w4.AbstractC3342b
    protected void a(AbstractC3341a abstractC3341a) {
        abstractC3341a.a("key").e(this.a);
        abstractC3341a.a("secret").e(this.b);
    }
}
