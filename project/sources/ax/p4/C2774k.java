package ax.p4;

import ax.t4.AbstractC3100b;
import ax.t4.AbstractC3101c;
import ax.t4.C3099a;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.p4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2774k {
    public static final C2774k e = new C2774k("api.dropboxapi.com", "content.dropboxapi.com", "www.dropbox.com", "notify.dropboxapi.com");
    public static final AbstractC3100b<C2774k> f = new a();
    public static final AbstractC3101c<C2774k> g = new b();
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: ax.p4.k$a */
    class a extends AbstractC3100b<C2774k> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C2774k d(ax.T4.j jVar) throws IOException, C3099a {
            ax.T4.m j = jVar.j();
            if (j == ax.T4.m.VALUE_STRING) {
                String u = jVar.u();
                AbstractC3100b.c(jVar);
                return C2774k.g(u);
            }
            if (j != ax.T4.m.START_OBJECT) {
                throw new C3099a("expecting a string or an object", jVar.v());
            }
            ax.T4.h v = jVar.v();
            AbstractC3100b.c(jVar);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                try {
                    if (g.equals("api")) {
                        str = AbstractC3100b.h.f(jVar, g, str);
                    } else if (g.equals("content")) {
                        str2 = AbstractC3100b.h.f(jVar, g, str2);
                    } else if (g.equals("web")) {
                        str3 = AbstractC3100b.h.f(jVar, g, str3);
                    } else {
                        if (!g.equals("notify")) {
                            throw new C3099a("unknown field", jVar.f());
                        }
                        str4 = AbstractC3100b.h.f(jVar, g, str4);
                    }
                } catch (C3099a e) {
                    throw e.a(g);
                }
            }
            AbstractC3100b.a(jVar);
            if (str == null) {
                throw new C3099a("missing field \"api\"", v);
            }
            if (str2 == null) {
                throw new C3099a("missing field \"content\"", v);
            }
            if (str3 == null) {
                throw new C3099a("missing field \"web\"", v);
            }
            if (str4 != null) {
                return new C2774k(str, str2, str3, str4);
            }
            throw new C3099a("missing field \"notify\"", v);
        }
    }

    /* renamed from: ax.p4.k$b */
    class b extends AbstractC3101c<C2774k> {
        b() {
        }

        @Override // ax.t4.AbstractC3101c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C2774k c2774k, ax.T4.g gVar) throws IOException {
            String l = c2774k.l();
            if (l != null) {
                gVar.s0(l);
                return;
            }
            gVar.o0();
            gVar.u0("api", c2774k.a);
            gVar.u0("content", c2774k.b);
            gVar.u0("web", c2774k.c);
            gVar.u0("notify", c2774k.d);
            gVar.m();
        }
    }

    public C2774k(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2774k g(String str) {
        return new C2774k("api-" + str, "api-content-" + str, "meta-" + str, "api-notify-" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        if (!this.c.startsWith("meta-") || !this.a.startsWith("api-") || !this.b.startsWith("api-content-") || !this.d.startsWith("api-notify-")) {
            return null;
        }
        String substring = this.c.substring(5);
        String substring2 = this.a.substring(4);
        String substring3 = this.b.substring(12);
        String substring4 = this.d.substring(11);
        if (substring.equals(substring2) && substring.equals(substring3) && substring.equals(substring4)) {
            return substring;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2774k) {
            C2774k c2774k = (C2774k) obj;
            if (c2774k.a.equals(this.a) && c2774k.b.equals(this.b) && c2774k.c.equals(this.c) && c2774k.d.equals(this.d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.a, this.b, this.c, this.d});
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.d;
    }

    public String k() {
        return this.c;
    }
}
