package ax.u4;

import ax.T4.g;
import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.p4.C2773j;
import ax.p4.C2774k;
import ax.p4.n;
import ax.s4.AbstractC3046a;
import ax.t4.AbstractC3100b;
import ax.t4.AbstractC3101c;
import ax.t4.C3099a;
import ax.w4.C3346f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: ax.u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3206a {
    public static final AbstractC3100b<C3206a> f = new b();
    public static final AbstractC3101c<C3206a> g = new c();
    private String a;
    private Long b;
    private final String c;
    private final String d;
    private final String e;

    /* renamed from: ax.u4.a$a, reason: collision with other inner class name */
    class C0470a extends n.c<d> {
        C0470a() {
        }

        @Override // ax.p4.n.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(AbstractC3046a.b bVar) throws C2773j {
            if (bVar.d() == 200) {
                return (d) n.u(d.e, bVar);
            }
            throw new C3208c(n.q(bVar), (C3207b) n.u(C3207b.d, bVar));
        }
    }

    /* renamed from: ax.u4.a$b */
    class b extends AbstractC3100b<C3206a> {
        b() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final C3206a d(j jVar) throws IOException, C3099a {
            h b = AbstractC3100b.b(jVar);
            String str = null;
            Long l = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                try {
                    if (g.equals("access_token")) {
                        str = AbstractC3100b.h.f(jVar, g, str);
                    } else if (g.equals("expires_at")) {
                        l = AbstractC3100b.b.f(jVar, g, l);
                    } else if (g.equals("refresh_token")) {
                        str2 = AbstractC3100b.h.f(jVar, g, str2);
                    } else if (g.equals("app_key")) {
                        str3 = AbstractC3100b.h.f(jVar, g, str3);
                    } else if (g.equals("app_secret")) {
                        str4 = AbstractC3100b.h.f(jVar, g, str4);
                    } else {
                        AbstractC3100b.k(jVar);
                    }
                } catch (C3099a e) {
                    throw e.a(g);
                }
            }
            AbstractC3100b.a(jVar);
            if (str != null) {
                return new C3206a(str, l, str2, str3, str4);
            }
            throw new C3099a("missing field \"access_token\"", b);
        }
    }

    /* renamed from: ax.u4.a$c */
    class c extends AbstractC3101c<C3206a> {
        c() {
        }

        @Override // ax.t4.AbstractC3101c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C3206a c3206a, g gVar) throws IOException {
            gVar.o0();
            gVar.u0("access_token", c3206a.a);
            if (c3206a.b != null) {
                gVar.v("expires_at", c3206a.b.longValue());
            }
            if (c3206a.c != null) {
                gVar.u0("refresh_token", c3206a.c);
            }
            if (c3206a.d != null) {
                gVar.u0("app_key", c3206a.d);
            }
            if (c3206a.e != null) {
                gVar.u0("app_secret", c3206a.e);
            }
            gVar.m();
        }
    }

    public C3206a(String str) {
        this(str, null, null, null, null);
    }

    public boolean a() {
        return h() != null && System.currentTimeMillis() + 300000 > h().longValue();
    }

    public String g() {
        return this.a;
    }

    public Long h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public d j(ax.p4.m mVar) throws C2773j {
        return k(mVar, C2774k.e, null);
    }

    public d k(ax.p4.m mVar, C2774k c2774k, Collection<String> collection) throws C2773j {
        if (this.c == null) {
            throw new C3208c(null, new C3207b("invalid_request", "Cannot refresh becasue there is no refresh token"));
        }
        if (this.d == null) {
            throw new IllegalStateException("DbxCredential's constructor should always guarantee appKey is not null if refreshToken is not null.");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("refresh_token", this.c);
        hashMap.put("locale", mVar.d());
        ArrayList arrayList = new ArrayList();
        String str = this.e;
        if (str == null) {
            hashMap.put("client_id", this.d);
        } else {
            n.b(arrayList, this.d, str);
        }
        if (collection != null) {
            hashMap.put("scope", C3346f.e(collection, " "));
        }
        d dVar = (d) n.j(mVar, "OfficialDropboxJavaSDKv2", c2774k.h(), "oauth2/token", n.z(hashMap), arrayList, new C0470a());
        synchronized (this) {
            this.a = dVar.a();
            this.b = dVar.b();
        }
        return dVar;
    }

    public String toString() {
        return g.b(this);
    }

    public C3206a(String str, Long l, String str2, String str3) {
        this(str, l, str2, str3, null);
    }

    public C3206a(String str, Long l, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException("Missing access token.");
        }
        if (str2 != null && str3 == null) {
            throw new IllegalArgumentException("Can't refresh without app Key.");
        }
        if (str2 != null && l == null) {
            throw new IllegalArgumentException("Missing expireAt.");
        }
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
