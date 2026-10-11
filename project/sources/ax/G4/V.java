package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
class V extends Y {
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;

    static class a extends ax.v4.e<V> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public V s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
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
            String str3 = null;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("from_path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("to_path".equals(g)) {
                    str3 = C3277d.f().a(jVar);
                } else if ("allow_shared_folder".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("autorename".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("allow_ownership_transfer".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"from_path\" missing.");
            }
            if (str3 == null) {
                throw new ax.T4.i(jVar, "Required field \"to_path\" missing.");
            }
            V v = new V(str2, str3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(v, v.a());
            return v;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(V v, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("from_path");
            C3277d.f().k(v.a, gVar);
            gVar.o("to_path");
            C3277d.f().k(v.b, gVar);
            gVar.o("allow_shared_folder");
            C3277d.a().k(Boolean.valueOf(v.c), gVar);
            gVar.o("autorename");
            C3277d.a().k(Boolean.valueOf(v.d), gVar);
            gVar.o("allow_ownership_transfer");
            C3277d.a().k(Boolean.valueOf(v.e), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public V(String str, String str2, boolean z, boolean z2, boolean z3) {
        super(str, str2);
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        V v;
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (v = (V) obj).a) || str.equals(str2)) && (((str3 = this.b) == (str4 = v.b) || str3.equals(str4)) && this.c == v.c && this.d == v.d && this.e == v.e);
    }

    @Override // ax.G4.Y
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public V(String str, String str2) {
        this(str, str2, false, false, false);
    }
}
