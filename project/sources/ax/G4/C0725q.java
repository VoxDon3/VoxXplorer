package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.G4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0725q {
    protected final String a;
    protected final List<String> b;

    /* renamed from: ax.G4.q$a */
    static class a extends ax.v4.e<C0725q> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0725q s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            List list = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("export_as".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("export_options".equals(g)) {
                    list = (List) C3277d.d(C3277d.c(C3277d.f())).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            C0725q c0725q = new C0725q(str2, list);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0725q, c0725q.a());
            return c0725q;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0725q c0725q, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            if (c0725q.a != null) {
                gVar.o("export_as");
                C3277d.d(C3277d.f()).k(c0725q.a, gVar);
            }
            if (c0725q.b != null) {
                gVar.o("export_options");
                C3277d.d(C3277d.c(C3277d.f())).k(c0725q.b, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0725q(String str, List<String> list) {
        this.a = str;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'exportOptions' is null");
                }
            }
        }
        this.b = list;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0725q c0725q = (C0725q) obj;
        String str = this.a;
        String str2 = c0725q.a;
        return (str == str2 || (str != null && str.equals(str2))) && ((list = this.b) == (list2 = c0725q.b) || (list != null && list.equals(list2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public C0725q() {
        this(null, null);
    }
}
