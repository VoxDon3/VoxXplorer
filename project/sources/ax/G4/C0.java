package ax.G4;

import ax.G4.B0;
import ax.G4.C0693a;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class C0 {
    protected final B0 a;
    protected final C0693a b;
    protected final String c;

    static class a extends ax.v4.e<C0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            B0 b0 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            C0693a c0693a = null;
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("cursor".equals(g)) {
                    b0 = B0.a.b.a(jVar);
                } else if ("commit".equals(g)) {
                    c0693a = C0693a.b.b.a(jVar);
                } else if ("content_hash".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (b0 == null) {
                throw new ax.T4.i(jVar, "Required field \"cursor\" missing.");
            }
            if (c0693a == null) {
                throw new ax.T4.i(jVar, "Required field \"commit\" missing.");
            }
            C0 c0 = new C0(b0, c0693a, str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0, c0.a());
            return c0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0 c0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("cursor");
            B0.a.b.k(c0.a, gVar);
            gVar.o("commit");
            C0693a.b.b.k(c0.b, gVar);
            if (c0.c != null) {
                gVar.o("content_hash");
                C3277d.d(C3277d.f()).k(c0.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0(B0 b0, C0693a c0693a, String str) {
        if (b0 == null) {
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        this.a = b0;
        if (c0693a == null) {
            throw new IllegalArgumentException("Required value for 'commit' is null");
        }
        this.b = c0693a;
        if (str != null) {
            if (str.length() < 64) {
                throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
            }
            if (str.length() > 64) {
                throw new IllegalArgumentException("String 'contentHash' is longer than 64");
            }
        }
        this.c = str;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0693a c0693a;
        C0693a c0693a2;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0 c0 = (C0) obj;
        B0 b0 = this.a;
        B0 b02 = c0.a;
        return (b0 == b02 || b0.equals(b02)) && ((c0693a = this.b) == (c0693a2 = c0.b) || c0693a.equals(c0693a2)) && ((str = this.c) == (str2 = c0.c) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public C0(B0 b0, C0693a c0693a) {
        this(b0, c0693a, null);
    }
}
