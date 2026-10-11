package ax.G4;

import ax.G4.S0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class P0 {
    protected final S0 a;
    protected final String b;

    static class a extends ax.v4.e<P0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public P0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            S0 s0 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("reason".equals(g)) {
                    s0 = S0.b.b.a(jVar);
                } else if ("upload_session_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (s0 == null) {
                throw new ax.T4.i(jVar, "Required field \"reason\" missing.");
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"upload_session_id\" missing.");
            }
            P0 p0 = new P0(s0, str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(p0, p0.b());
            return p0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(P0 p0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("reason");
            S0.b.b.k(p0.a, gVar);
            gVar.o("upload_session_id");
            C3277d.f().k(p0.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public P0(S0 s0, String str) {
        if (s0 == null) {
            throw new IllegalArgumentException("Required value for 'reason' is null");
        }
        this.a = s0;
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'uploadSessionId' is null");
        }
        this.b = str;
    }

    public S0 a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        P0 p0 = (P0) obj;
        S0 s0 = this.a;
        S0 s02 = p0.a;
        return (s0 == s02 || s0.equals(s02)) && ((str = this.b) == (str2 = p0.b) || str.equals(str2));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
