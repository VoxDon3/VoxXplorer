package ax.G4;

import ax.G4.C0735x;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0701e extends C0732u {
    protected final C0735x a;

    /* renamed from: ax.G4.e$a */
    static class a extends ax.v4.e<C0701e> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0701e s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            C0735x c0735x = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("metadata".equals(g)) {
                    c0735x = C0735x.a.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (c0735x == null) {
                throw new ax.T4.i(jVar, "Required field \"metadata\" missing.");
            }
            C0701e c0701e = new C0701e(c0735x);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0701e, c0701e.b());
            return c0701e;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0701e c0701e, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("metadata");
            C0735x.a.b.k(c0701e.a, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0701e(C0735x c0735x) {
        if (c0735x == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.a = c0735x;
    }

    public C0735x a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0735x c0735x = this.a;
        C0735x c0735x2 = ((C0701e) obj).a;
        return c0735x == c0735x2 || c0735x.equals(c0735x2);
    }

    @Override // ax.G4.C0732u
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
