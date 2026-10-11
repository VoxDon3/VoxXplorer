package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class H0 {
    protected final long a;

    static class a extends ax.v4.e<H0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public H0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Long l = null;
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
                if ("correct_offset".equals(g)) {
                    l = C3277d.i().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (l == null) {
                throw new ax.T4.i(jVar, "Required field \"correct_offset\" missing.");
            }
            H0 h0 = new H0(l.longValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(h0, h0.b());
            return h0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(H0 h0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("correct_offset");
            C3277d.i().k(Long.valueOf(h0.a), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public H0(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && this.a == ((H0) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
