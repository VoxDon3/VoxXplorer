package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0698c0 {
    protected final boolean a;

    /* renamed from: ax.G4.c0$a */
    static class a extends ax.v4.e<C0698c0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0698c0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("include_highlights".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            C0698c0 c0698c0 = new C0698c0(bool.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0698c0, c0698c0.a());
            return c0698c0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0698c0 c0698c0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("include_highlights");
            C3277d.a().k(Boolean.valueOf(c0698c0.a), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0698c0(boolean z) {
        this.a = z;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && this.a == ((C0698c0) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public C0698c0() {
        this(false);
    }
}
