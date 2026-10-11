package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class L0 {
    protected final String a;

    static class a extends ax.v4.e<L0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public L0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("session_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"session_id\" missing.");
            }
            L0 l0 = new L0(str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(l0, l0.b());
            return l0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(L0 l0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("session_id");
            C3277d.f().k(l0.a, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public L0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'sessionId' is null");
        }
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        String str = this.a;
        String str2 = ((L0) obj).a;
        return str == str2 || str.equals(str2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
