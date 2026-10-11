package ax.G4;

import ax.G4.B0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
class x0 {
    protected final B0 a;
    protected final boolean b;
    protected final String c;

    static class a extends ax.v4.e<x0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public x0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Boolean bool = Boolean.FALSE;
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("cursor".equals(g)) {
                    b0 = B0.a.b.a(jVar);
                } else if ("close".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("content_hash".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (b0 == null) {
                throw new ax.T4.i(jVar, "Required field \"cursor\" missing.");
            }
            x0 x0Var = new x0(b0, bool.booleanValue(), str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(x0Var, x0Var.a());
            return x0Var;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(x0 x0Var, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("cursor");
            B0.a.b.k(x0Var.a, gVar);
            gVar.o("close");
            C3277d.a().k(Boolean.valueOf(x0Var.b), gVar);
            if (x0Var.c != null) {
                gVar.o("content_hash");
                C3277d.d(C3277d.f()).k(x0Var.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public x0(B0 b0, boolean z, String str) {
        if (b0 == null) {
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        this.a = b0;
        this.b = z;
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
        x0 x0Var;
        B0 b0;
        B0 b02;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((b0 = this.a) == (b02 = (x0Var = (x0) obj).a) || b0.equals(b02)) && this.b == x0Var.b && ((str = this.c) == (str2 = x0Var.c) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public x0(B0 b0) {
        this(b0, false, null);
    }
}
