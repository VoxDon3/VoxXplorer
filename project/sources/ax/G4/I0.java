package ax.G4;

import ax.G4.N0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
class I0 {
    protected final boolean a;
    protected final N0 b;
    protected final String c;

    static class a extends ax.v4.e<I0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public I0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            N0 n0 = null;
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
                if ("close".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("session_type".equals(g)) {
                    n0 = (N0) C3277d.d(N0.b.b).a(jVar);
                } else if ("content_hash".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            I0 i0 = new I0(bool.booleanValue(), n0, str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(i0, i0.a());
            return i0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(I0 i0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("close");
            C3277d.a().k(Boolean.valueOf(i0.a), gVar);
            if (i0.b != null) {
                gVar.o("session_type");
                C3277d.d(N0.b.b).k(i0.b, gVar);
            }
            if (i0.c != null) {
                gVar.o("content_hash");
                C3277d.d(C3277d.f()).k(i0.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public I0(boolean z, N0 n0, String str) {
        this.a = z;
        this.b = n0;
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
        N0 n0;
        N0 n02;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            I0 i0 = (I0) obj;
            if (this.a == i0.a && (((n0 = this.b) == (n02 = i0.b) || (n0 != null && n0.equals(n02))) && ((str = this.c) == (str2 = i0.c) || (str != null && str.equals(str2))))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public I0() {
        this(false, null, null);
    }
}
