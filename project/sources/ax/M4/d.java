package ax.M4;

import ax.L4.b;
import ax.L4.g;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d extends i {
    protected final ax.L4.g c;
    protected final ax.L4.b d;

    static class a extends ax.v4.e<d> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public d s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            String str3 = null;
            ax.L4.g gVar = null;
            ax.L4.b bVar = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("name".equals(g)) {
                    str3 = C3277d.f().a(jVar);
                } else if ("sharing_policies".equals(g)) {
                    gVar = g.a.b.a(jVar);
                } else if ("office_addin_policy".equals(g)) {
                    bVar = b.C0120b.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"id\" missing.");
            }
            if (str3 == null) {
                throw new ax.T4.i(jVar, "Required field \"name\" missing.");
            }
            if (gVar == null) {
                throw new ax.T4.i(jVar, "Required field \"sharing_policies\" missing.");
            }
            if (bVar == null) {
                throw new ax.T4.i(jVar, "Required field \"office_addin_policy\" missing.");
            }
            d dVar = new d(str2, str3, gVar, bVar);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(dVar, dVar.a());
            return dVar;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(d dVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("id");
            C3277d.f().k(dVar.a, gVar);
            gVar.o("name");
            C3277d.f().k(dVar.b, gVar);
            gVar.o("sharing_policies");
            g.a.b.k(dVar.c, gVar);
            gVar.o("office_addin_policy");
            b.C0120b.b.k(dVar.d, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public d(String str, String str2, ax.L4.g gVar, ax.L4.b bVar) {
        super(str, str2);
        if (gVar == null) {
            throw new IllegalArgumentException("Required value for 'sharingPolicies' is null");
        }
        this.c = gVar;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value for 'officeAddinPolicy' is null");
        }
        this.d = bVar;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        ax.L4.g gVar;
        ax.L4.g gVar2;
        ax.L4.b bVar;
        ax.L4.b bVar2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        String str4 = dVar.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = dVar.b) || str.equals(str2)) && (((gVar = this.c) == (gVar2 = dVar.c) || gVar.equals(gVar2)) && ((bVar = this.d) == (bVar2 = dVar.d) || bVar.equals(bVar2)));
    }

    @Override // ax.M4.i
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.c, this.d});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
