package ax.p4;

import ax.t4.AbstractC3100b;
import ax.t4.C3099a;
import ax.w4.C3346f;
import java.io.IOException;

/* renamed from: ax.p4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2771h {
    public static final AbstractC3100b<C2771h> j = new a();
    public static final AbstractC3100b<String> k = new b();
    public static final AbstractC3100b<String> l = new c();
    private final String a;
    private final Long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private long h = System.currentTimeMillis();
    private final String i;

    /* renamed from: ax.p4.h$a */
    class a extends AbstractC3100b<C2771h> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C2771h d(ax.T4.j jVar) throws IOException, C3099a {
            ax.T4.h b = AbstractC3100b.b(jVar);
            String str = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                AbstractC3100b.c(jVar);
                try {
                    if (g.equals("token_type")) {
                        str = C2771h.k.f(jVar, g, str);
                    } else if (g.equals("access_token")) {
                        str2 = C2771h.l.f(jVar, g, str2);
                    } else if (g.equals("expires_in")) {
                        l = AbstractC3100b.d.f(jVar, g, l);
                    } else if (g.equals("refresh_token")) {
                        str3 = AbstractC3100b.h.f(jVar, g, str3);
                    } else if (g.equals("uid")) {
                        str4 = AbstractC3100b.h.f(jVar, g, str4);
                    } else if (g.equals("account_id")) {
                        str6 = AbstractC3100b.h.f(jVar, g, str6);
                    } else if (g.equals("team_id")) {
                        str5 = AbstractC3100b.h.f(jVar, g, str5);
                    } else if (g.equals("state")) {
                        str7 = AbstractC3100b.h.f(jVar, g, str7);
                    } else if (g.equals("scope")) {
                        str8 = AbstractC3100b.h.f(jVar, g, str8);
                    } else {
                        AbstractC3100b.k(jVar);
                    }
                } catch (C3099a e) {
                    throw e.a(g);
                }
            }
            AbstractC3100b.a(jVar);
            if (str == null) {
                throw new C3099a("missing field \"token_type\"", b);
            }
            if (str2 == null) {
                throw new C3099a("missing field \"access_token\"", b);
            }
            if (str4 == null) {
                throw new C3099a("missing field \"uid\"", b);
            }
            if (str6 == null && str5 == null) {
                throw new C3099a("missing field \"account_id\" and missing field \"team_id\"", b);
            }
            if (str3 == null || l != null) {
                return new C2771h(str2, l, str3, str4, str5, str6, str7, str8);
            }
            throw new C3099a("missing field \"expires_in\"", b);
        }
    }

    /* renamed from: ax.p4.h$b */
    class b extends AbstractC3100b<String> {
        b() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                String u = jVar.u();
                if (!u.equals("Bearer") && !u.equals("bearer")) {
                    throw new C3099a("expecting \"Bearer\": got " + C3346f.f(u), jVar.v());
                }
                jVar.H();
                return u;
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    /* renamed from: ax.p4.h$c */
    class c extends AbstractC3100b<String> {
        c() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                String u = jVar.u();
                String g = C2770g.g(u);
                if (g != null) {
                    throw new C3099a(g, jVar.v());
                }
                jVar.H();
                return u;
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    public C2771h(String str, Long l2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = l2;
        this.c = str2;
        this.d = str3;
        this.e = str5;
        this.f = str4;
        this.g = str6;
        this.i = str7;
    }

    public String a() {
        return this.a;
    }

    public Long b() {
        Long l2 = this.b;
        if (l2 == null) {
            return null;
        }
        return Long.valueOf(this.h + (l2.longValue() * 1000));
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.i;
    }

    public String e() {
        return this.d;
    }
}
