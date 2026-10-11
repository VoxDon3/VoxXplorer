package ax.E4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {
    protected final String a;
    protected final String b;

    static class a extends ax.v4.e<d> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public d s(j jVar, boolean z) throws IOException, i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            String str3 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("name".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("value".equals(g)) {
                    str3 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new i(jVar, "Required field \"name\" missing.");
            }
            if (str3 == null) {
                throw new i(jVar, "Required field \"value\" missing.");
            }
            d dVar = new d(str2, str3);
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
            gVar.o("name");
            C3277d.f().k(dVar.a, gVar);
            gVar.o("value");
            C3277d.f().k(dVar.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.a = str;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'value' is null");
        }
        this.b = str2;
    }

    public String a() {
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
        d dVar = (d) obj;
        String str3 = this.a;
        String str4 = dVar.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = dVar.b) || str.equals(str2));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
