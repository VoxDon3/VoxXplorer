package ax.G4;

import ax.G4.C0698c0;
import ax.G4.C0704f0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0708h0 {
    protected final String a;
    protected final C0704f0 b;
    protected final C0698c0 c;
    protected final Boolean d;

    /* renamed from: ax.G4.h0$a */
    public static class a {
        protected final String a;
        protected C0704f0 b;
        protected C0698c0 c;
        protected Boolean d;

        protected a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Required value for 'query' is null");
            }
            if (str.length() > 1000) {
                throw new IllegalArgumentException("String 'query' is longer than 1000");
            }
            this.a = str;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public C0708h0 a() {
            return new C0708h0(this.a, this.b, this.c, this.d);
        }

        public a b(C0704f0 c0704f0) {
            this.b = c0704f0;
            return this;
        }
    }

    /* renamed from: ax.G4.h0$b */
    static class b extends ax.v4.e<C0708h0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0708h0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            C0704f0 c0704f0 = null;
            C0698c0 c0698c0 = null;
            Boolean bool = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("query".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("options".equals(g)) {
                    c0704f0 = (C0704f0) C3277d.e(C0704f0.b.b).a(jVar);
                } else if ("match_field_options".equals(g)) {
                    c0698c0 = (C0698c0) C3277d.e(C0698c0.a.b).a(jVar);
                } else if ("include_highlights".equals(g)) {
                    bool = (Boolean) C3277d.d(C3277d.a()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"query\" missing.");
            }
            C0708h0 c0708h0 = new C0708h0(str2, c0704f0, c0698c0, bool);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0708h0, c0708h0.b());
            return c0708h0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0708h0 c0708h0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("query");
            C3277d.f().k(c0708h0.a, gVar);
            if (c0708h0.b != null) {
                gVar.o("options");
                C3277d.e(C0704f0.b.b).k(c0708h0.b, gVar);
            }
            if (c0708h0.c != null) {
                gVar.o("match_field_options");
                C3277d.e(C0698c0.a.b).k(c0708h0.c, gVar);
            }
            if (c0708h0.d != null) {
                gVar.o("include_highlights");
                C3277d.d(C3277d.a()).k(c0708h0.d, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0708h0(String str, C0704f0 c0704f0, C0698c0 c0698c0, Boolean bool) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'query' is null");
        }
        if (str.length() > 1000) {
            throw new IllegalArgumentException("String 'query' is longer than 1000");
        }
        this.a = str;
        this.b = c0704f0;
        this.c = c0698c0;
        this.d = bool;
    }

    public static a a(String str) {
        return new a(str);
    }

    public String b() {
        return b.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0704f0 c0704f0;
        C0704f0 c0704f02;
        C0698c0 c0698c0;
        C0698c0 c0698c02;
        Boolean bool;
        Boolean bool2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0708h0 c0708h0 = (C0708h0) obj;
        String str = this.a;
        String str2 = c0708h0.a;
        return (str == str2 || str.equals(str2)) && ((c0704f0 = this.b) == (c0704f02 = c0708h0.b) || (c0704f0 != null && c0704f0.equals(c0704f02))) && (((c0698c0 = this.c) == (c0698c02 = c0708h0.c) || (c0698c0 != null && c0698c0.equals(c0698c02))) && ((bool = this.d) == (bool2 = c0708h0.d) || (bool != null && bool.equals(bool2))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
