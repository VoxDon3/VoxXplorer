package ax.G4;

import ax.G4.A;
import ax.G4.C0;
import ax.G4.C0694a0;
import ax.G4.C0695b;
import ax.G4.C0697c;
import ax.G4.C0701e;
import ax.G4.C0705g;
import ax.G4.C0707h;
import ax.G4.C0708h0;
import ax.G4.C0711j;
import ax.G4.C0712j0;
import ax.G4.C0717m;
import ax.G4.C0720n0;
import ax.G4.C0721o;
import ax.G4.C0722o0;
import ax.G4.C0730t;
import ax.G4.C0731t0;
import ax.G4.C0737z;
import ax.G4.F;
import ax.G4.G;
import ax.G4.H;
import ax.G4.I0;
import ax.G4.J;
import ax.G4.L;
import ax.G4.P;
import ax.G4.V;
import ax.G4.W;
import ax.G4.Z;
import ax.G4.x0;
import ax.p4.C2772i;
import ax.p4.C2773j;
import ax.s4.AbstractC3046a;
import ax.x4.AbstractC3433d;
import java.util.List;

/* renamed from: ax.G4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0703f {
    private final AbstractC3433d a;

    public C0703f(AbstractC3433d abstractC3433d) {
        this.a = abstractC3433d;
    }

    public M0 A() throws C2773j {
        return B(new I0());
    }

    M0 B(I0 i0) throws C2773j {
        AbstractC3433d abstractC3433d = this.a;
        return new M0(abstractC3433d.p(abstractC3433d.g().i(), "2/files/upload_session/start", i0, false, I0.a.b), this.a.i());
    }

    Z a(V v) throws X, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (Z) abstractC3433d.n(abstractC3433d.g().h(), "2/files/copy_v2", v, false, V.a.b, Z.a.b, W.b.b);
        } catch (ax.p4.p e) {
            throw new X("2/files/copy_v2", e.e(), e.f(), (W) e.d());
        }
    }

    public Z b(String str, String str2) throws X, C2773j {
        return a(new V(str, str2));
    }

    C0701e c(C0695b c0695b) throws C0699d, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (C0701e) abstractC3433d.n(abstractC3433d.g().h(), "2/files/create_folder_v2", c0695b, false, C0695b.a.b, C0701e.a.b, C0697c.b.b);
        } catch (ax.p4.p e) {
            throw new C0699d("2/files/create_folder_v2", e.e(), e.f(), (C0697c) e.d());
        }
    }

    public C0701e d(String str, boolean z) throws C0699d, C2773j {
        return c(new C0695b(str, z));
    }

    C0711j e(C0705g c0705g) throws C0709i, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (C0711j) abstractC3433d.n(abstractC3433d.g().h(), "2/files/delete_v2", c0705g, false, C0705g.a.b, C0711j.a.b, C0707h.b.b);
        } catch (ax.p4.p e) {
            throw new C0709i("2/files/delete_v2", e.e(), e.f(), (C0707h) e.d());
        }
    }

    public C0711j f(String str) throws C0709i, C2773j {
        return e(new C0705g(str));
    }

    C2772i<C0730t> g(C0717m c0717m, List<AbstractC3046a.C0448a> list) throws C0723p, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return abstractC3433d.d(abstractC3433d.g().i(), "2/files/download", c0717m, false, list, C0717m.a.b, C0730t.a.b, C0721o.b.b);
        } catch (ax.p4.p e) {
            throw new C0723p("2/files/download", e.e(), e.f(), (C0721o) e.d());
        }
    }

    public C0719n h(String str) {
        return new C0719n(this, str);
    }

    P i(C0737z c0737z) throws B, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (P) abstractC3433d.n(abstractC3433d.g().h(), "2/files/get_metadata", c0737z, false, C0737z.a.b, P.a.b, A.b.b);
        } catch (ax.p4.p e) {
            throw new B("2/files/get_metadata", e.e(), e.f(), (A) e.d());
        }
    }

    public P j(String str) throws B, C2773j {
        return i(new C0737z(str));
    }

    C2772i<C0730t> k(C0720n0 c0720n0, List<AbstractC3046a.C0448a> list) throws C0724p0, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return abstractC3433d.d(abstractC3433d.g().i(), "2/files/get_thumbnail", c0720n0, false, list, C0720n0.b.b, C0730t.a.b, C0722o0.b.b);
        } catch (ax.p4.p e) {
            throw new C0724p0("2/files/get_thumbnail", e.e(), e.f(), (C0722o0) e.d());
        }
    }

    public C l(String str) {
        return new C(this, C0720n0.a(str));
    }

    L m(F f) throws K, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (L) abstractC3433d.n(abstractC3433d.g().h(), "2/files/list_folder", f, false, F.a.b, L.a.b, J.b.b);
        } catch (ax.p4.p e) {
            throw new K("2/files/list_folder", e.e(), e.f(), (J) e.d());
        }
    }

    public L n(String str) throws K, C2773j {
        return m(new F(str));
    }

    L o(G g) throws I, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (L) abstractC3433d.n(abstractC3433d.g().h(), "2/files/list_folder/continue", g, false, G.a.b, L.a.b, H.b.b);
        } catch (ax.p4.p e) {
            throw new I("2/files/list_folder/continue", e.e(), e.f(), (H) e.d());
        }
    }

    public L p(String str) throws I, C2773j {
        return o(new G(str));
    }

    Z q(V v) throws X, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (Z) abstractC3433d.n(abstractC3433d.g().h(), "2/files/move_v2", v, false, V.a.b, Z.a.b, W.b.b);
        } catch (ax.p4.p e) {
            throw new X("2/files/move_v2", e.e(), e.f(), (W) e.d());
        }
    }

    public Z r(String str, String str2) throws X, C2773j {
        return q(new V(str, str2));
    }

    C0712j0 s(C0708h0 c0708h0) throws C0696b0, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (C0712j0) abstractC3433d.n(abstractC3433d.g().h(), "2/files/search_v2", c0708h0, false, C0708h0.b.b, C0712j0.a.b, C0694a0.b.b);
        } catch (ax.p4.p e) {
            throw new C0696b0("2/files/search_v2", e.e(), e.f(), (C0694a0) e.d());
        }
    }

    public C0710i0 t(String str) {
        return new C0710i0(this, C0708h0.a(str));
    }

    O0 u(C0731t0 c0731t0) throws C2773j {
        AbstractC3433d abstractC3433d = this.a;
        return new O0(abstractC3433d.p(abstractC3433d.g().i(), "2/files/upload", c0731t0, false, C0731t0.b.b), this.a.i());
    }

    public u0 v(String str) {
        return new u0(this, C0731t0.c(str));
    }

    A0 w(x0 x0Var) throws C2773j {
        AbstractC3433d abstractC3433d = this.a;
        return new A0(abstractC3433d.p(abstractC3433d.g().i(), "2/files/upload_session/append_v2", x0Var, false, x0.a.b), this.a.i());
    }

    public A0 x(B0 b0) throws C2773j {
        return w(new x0(b0));
    }

    public F0 y(B0 b0, C0693a c0693a) throws C2773j {
        return z(new C0(b0, c0693a));
    }

    F0 z(C0 c0) throws C2773j {
        AbstractC3433d abstractC3433d = this.a;
        return new F0(abstractC3433d.p(abstractC3433d.g().i(), "2/files/upload_session/finish", c0, false, C0.a.b), this.a.i());
    }
}
