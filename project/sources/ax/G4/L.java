package ax.G4;

import ax.G4.P;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class L {
    protected final List<P> a;
    protected final String b;
    protected final boolean c;

    static class a extends ax.v4.e<L> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public L s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            List list = null;
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
            Boolean bool = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("entries".equals(g)) {
                    list = (List) C3277d.c(P.a.b).a(jVar);
                } else if ("cursor".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("has_more".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (list == null) {
                throw new ax.T4.i(jVar, "Required field \"entries\" missing.");
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"cursor\" missing.");
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"has_more\" missing.");
            }
            L l = new L(list, str2, bool.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(l, l.d());
            return l;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(L l, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("entries");
            C3277d.c(P.a.b).k(l.a, gVar);
            gVar.o("cursor");
            C3277d.f().k(l.b, gVar);
            gVar.o("has_more");
            C3277d.a().k(Boolean.valueOf(l.c), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public L(List<P> list, String str, boolean z) {
        if (list == null) {
            throw new IllegalArgumentException("Required value for 'entries' is null");
        }
        Iterator<P> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("An item in list 'entries' is null");
            }
        }
        this.a = list;
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        if (str.length() < 1) {
            throw new IllegalArgumentException("String 'cursor' is shorter than 1");
        }
        this.b = str;
        this.c = z;
    }

    public String a() {
        return this.b;
    }

    public List<P> b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public String d() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        L l;
        List<P> list;
        List<P> list2;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((list = this.a) == (list2 = (l = (L) obj).a) || list.equals(list2)) && (((str = this.b) == (str2 = l.b) || str.equals(str2)) && this.c == l.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
