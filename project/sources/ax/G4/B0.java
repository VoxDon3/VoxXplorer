package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class B0 {
    protected final String a;
    protected final long b;

    static class a extends ax.v4.e<B0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public B0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Long l = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("session_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("offset".equals(g)) {
                    l = C3277d.i().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"session_id\" missing.");
            }
            if (l == null) {
                throw new ax.T4.i(jVar, "Required field \"offset\" missing.");
            }
            B0 b0 = new B0(str2, l.longValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(b0, b0.a());
            return b0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(B0 b0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("session_id");
            C3277d.f().k(b0.a, gVar);
            gVar.o("offset");
            C3277d.i().k(Long.valueOf(b0.b), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public B0(String str, long j) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'sessionId' is null");
        }
        this.a = str;
        this.b = j;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        B0 b0;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (b0 = (B0) obj).a) || str.equals(str2)) && this.b == b0.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
