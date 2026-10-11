package ax.G4;

import ax.G4.E;
import ax.G4.EnumC0700d0;
import ax.G4.Q;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.G4.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0702e0 {
    protected final Q a;
    protected final EnumC0700d0 b;
    protected final List<E> c;

    /* renamed from: ax.G4.e0$a */
    static class a extends ax.v4.e<C0702e0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0702e0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Q q = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            EnumC0700d0 enumC0700d0 = null;
            List list = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("metadata".equals(g)) {
                    q = Q.b.b.a(jVar);
                } else if ("match_type".equals(g)) {
                    enumC0700d0 = (EnumC0700d0) C3277d.d(EnumC0700d0.b.b).a(jVar);
                } else if ("highlight_spans".equals(g)) {
                    list = (List) C3277d.d(C3277d.c(E.a.b)).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field \"metadata\" missing.");
            }
            C0702e0 c0702e0 = new C0702e0(q, enumC0700d0, list);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0702e0, c0702e0.b());
            return c0702e0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0702e0 c0702e0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("metadata");
            Q.b.b.k(c0702e0.a, gVar);
            if (c0702e0.b != null) {
                gVar.o("match_type");
                C3277d.d(EnumC0700d0.b.b).k(c0702e0.b, gVar);
            }
            if (c0702e0.c != null) {
                gVar.o("highlight_spans");
                C3277d.d(C3277d.c(E.a.b)).k(c0702e0.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0702e0(Q q, EnumC0700d0 enumC0700d0, List<E> list) {
        if (q == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.a = q;
        this.b = enumC0700d0;
        if (list != null) {
            Iterator<E> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'highlightSpans' is null");
                }
            }
        }
        this.c = list;
    }

    public Q a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        EnumC0700d0 enumC0700d0;
        EnumC0700d0 enumC0700d02;
        List<E> list;
        List<E> list2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0702e0 c0702e0 = (C0702e0) obj;
        Q q = this.a;
        Q q2 = c0702e0.a;
        return (q == q2 || q.equals(q2)) && ((enumC0700d0 = this.b) == (enumC0700d02 = c0702e0.b) || (enumC0700d0 != null && enumC0700d0.equals(enumC0700d02))) && ((list = this.c) == (list2 = c0702e0.c) || (list != null && list.equals(list2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
