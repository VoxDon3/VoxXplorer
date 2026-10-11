package ax.G4;

import ax.G4.C0702e0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.G4.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0712j0 {
    protected final List<C0702e0> a;
    protected final boolean b;
    protected final String c;

    /* renamed from: ax.G4.j0$a */
    static class a extends ax.v4.e<C0712j0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0712j0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Boolean bool = null;
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("matches".equals(g)) {
                    list = (List) C3277d.c(C0702e0.a.b).a(jVar);
                } else if ("has_more".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("cursor".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (list == null) {
                throw new ax.T4.i(jVar, "Required field \"matches\" missing.");
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"has_more\" missing.");
            }
            C0712j0 c0712j0 = new C0712j0(list, bool.booleanValue(), str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0712j0, c0712j0.b());
            return c0712j0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0712j0 c0712j0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("matches");
            C3277d.c(C0702e0.a.b).k(c0712j0.a, gVar);
            gVar.o("has_more");
            C3277d.a().k(Boolean.valueOf(c0712j0.b), gVar);
            if (c0712j0.c != null) {
                gVar.o("cursor");
                C3277d.d(C3277d.f()).k(c0712j0.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0712j0(List<C0702e0> list, boolean z, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Required value for 'matches' is null");
        }
        Iterator<C0702e0> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("An item in list 'matches' is null");
            }
        }
        this.a = list;
        this.b = z;
        if (str != null && str.length() < 1) {
            throw new IllegalArgumentException("String 'cursor' is shorter than 1");
        }
        this.c = str;
    }

    public List<C0702e0> a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0712j0 c0712j0;
        List<C0702e0> list;
        List<C0702e0> list2;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((list = this.a) == (list2 = (c0712j0 = (C0712j0) obj).a) || list.equals(list2)) && this.b == c0712j0.b && ((str = this.c) == (str2 = c0712j0.c) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
