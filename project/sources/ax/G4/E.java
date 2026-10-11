package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class E {
    protected final String a;
    protected final boolean b;

    static class a extends ax.v4.e<E> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public E s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Boolean bool = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("highlight_str".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("is_highlighted".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"highlight_str\" missing.");
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"is_highlighted\" missing.");
            }
            E e = new E(str2, bool.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(e, e.a());
            return e;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(E e, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("highlight_str");
            C3277d.f().k(e.a, gVar);
            gVar.o("is_highlighted");
            C3277d.a().k(Boolean.valueOf(e.b), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public E(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'highlightStr' is null");
        }
        this.a = str;
        this.b = z;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        E e;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (e = (E) obj).a) || str.equals(str2)) && this.b == e.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
