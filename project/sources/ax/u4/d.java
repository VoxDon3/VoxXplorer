package ax.u4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.p4.C2771h;
import ax.t4.AbstractC3100b;
import ax.t4.C3099a;
import java.io.IOException;

/* loaded from: classes.dex */
public class d {
    public static final AbstractC3100b<d> e = new a();
    private final String a;
    private final long b;
    private long c;
    private String d;

    class a extends AbstractC3100b<d> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public d d(j jVar) throws IOException, C3099a {
            h b = AbstractC3100b.b(jVar);
            String str = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                AbstractC3100b.c(jVar);
                try {
                    if (g.equals("token_type")) {
                        str = C2771h.k.f(jVar, g, str);
                    } else if (g.equals("access_token")) {
                        str2 = C2771h.l.f(jVar, g, str2);
                    } else if (g.equals("expires_in")) {
                        l = AbstractC3100b.d.f(jVar, g, l);
                    } else if (g.equals("scope")) {
                        str3 = AbstractC3100b.h.f(jVar, g, str3);
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
            if (l != null) {
                return new d(str2, l.longValue(), str3);
            }
            throw new C3099a("missing field \"expires_in\"", b);
        }
    }

    public d(String str, long j) {
        this(str, j, null);
    }

    public String a() {
        return this.a;
    }

    public Long b() {
        return Long.valueOf(this.c + (this.b * 1000));
    }

    public d(String str, long j, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("access token can't be null.");
        }
        this.a = str;
        this.b = j;
        this.c = System.currentTimeMillis();
        this.d = str2;
    }
}
