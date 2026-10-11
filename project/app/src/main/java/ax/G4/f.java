/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.A;
import ax.G4.A0;
import ax.G4.B;
import ax.G4.B0;
import ax.G4.C;
import ax.G4.C0;
import ax.G4.F;
import ax.G4.F0;
import ax.G4.G;
import ax.G4.H;
import ax.G4.I;
import ax.G4.I0;
import ax.G4.J;
import ax.G4.K;
import ax.G4.L;
import ax.G4.M0;
import ax.G4.O0;
import ax.G4.P;
import ax.G4.V;
import ax.G4.W;
import ax.G4.X;
import ax.G4.Z;
import ax.G4.a;
import ax.G4.a0;
import ax.G4.b;
import ax.G4.b0;
import ax.G4.c;
import ax.G4.d;
import ax.G4.e;
import ax.G4.g;
import ax.G4.h;
import ax.G4.h0;
import ax.G4.i;
import ax.G4.i0;
import ax.G4.j;
import ax.G4.j0;
import ax.G4.m;
import ax.G4.n;
import ax.G4.n0;
import ax.G4.o;
import ax.G4.o0;
import ax.G4.p;
import ax.G4.p0;
import ax.G4.t;
import ax.G4.t0;
import ax.G4.u0;
import ax.G4.x0;
import ax.G4.z;
import ax.s4.a;
import java.util.List;

public class f {
    private final ax.x4.d a;

    public f(ax.x4.d d8) {
        this.a = d8;
    }

    public M0 A() throws ax.p4.j {
        return this.B(new I0());
    }

    M0 B(I0 i02) throws ax.p4.j {
        ax.x4.d d8 = this.a;
        return new M0(d8.p(d8.g().i(), "2/files/upload_session/start", i02, false, I0.a.b), this.a.i());
    }

    Z a(V object) throws X, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/copy_v2", object, false, V.a.b, Z.a.b, W.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new X("2/files/copy_v2", p8.e(), p8.f(), (W)p8.d());
        }
    }

    public Z b(String string, String string2) throws X, ax.p4.j {
        return this.a(new V(string, string2));
    }

    e c(b object) throws d, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/create_folder_v2", object, false, b.a.b, e.a.b, c.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new d("2/files/create_folder_v2", p8.e(), p8.f(), (c)p8.d());
        }
    }

    public e d(String string, boolean bl) throws d, ax.p4.j {
        return this.c(new b(string, bl));
    }

    j e(g object) throws i, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/delete_v2", object, false, g.a.b, j.a.b, h.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new i("2/files/delete_v2", p8.e(), p8.f(), (h)p8.d());
        }
    }

    public j f(String string) throws i, ax.p4.j {
        return this.e(new g(string));
    }

    ax.p4.i<t> g(m object, List<a.a> list) throws p, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.d(d8.g().i(), "2/files/download", object, false, list, m.a.b, t.a.b, o.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new p("2/files/download", p8.e(), p8.f(), (o)p8.d());
        }
    }

    public n h(String string) {
        return new n(this, string);
    }

    P i(z object) throws B, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/get_metadata", object, false, z.a.b, P.a.b, A.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new B("2/files/get_metadata", p8.e(), p8.f(), (A)p8.d());
        }
    }

    public P j(String string) throws B, ax.p4.j {
        return this.i(new z(string));
    }

    ax.p4.i<t> k(n0 object, List<a.a> list) throws p0, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.d(d8.g().i(), "2/files/get_thumbnail", object, false, list, n0.b.b, t.a.b, o0.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new p0("2/files/get_thumbnail", p8.e(), p8.f(), (o0)p8.d());
        }
    }

    public C l(String string) {
        return new C(this, n0.a(string));
    }

    L m(F object) throws K, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/list_folder", object, false, F.a.b, L.a.b, J.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new K("2/files/list_folder", p8.e(), p8.f(), (J)p8.d());
        }
    }

    public L n(String string) throws K, ax.p4.j {
        return this.m(new F(string));
    }

    L o(G object) throws I, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/list_folder/continue", object, false, G.a.b, L.a.b, H.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new I("2/files/list_folder/continue", p8.e(), p8.f(), (H)p8.d());
        }
    }

    public L p(String string) throws I, ax.p4.j {
        return this.o(new G(string));
    }

    Z q(V object) throws X, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/move_v2", object, false, V.a.b, Z.a.b, W.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new X("2/files/move_v2", p8.e(), p8.f(), (W)p8.d());
        }
    }

    public Z r(String string, String string2) throws X, ax.p4.j {
        return this.q(new V(string, string2));
    }

    j0 s(h0 object) throws b0, ax.p4.j {
        try {
            ax.x4.d d8 = this.a;
            object = d8.n(d8.g().h(), "2/files/search_v2", object, false, h0.b.b, j0.a.b, a0.b.b);
            return object;
        }
        catch (ax.p4.p p8) {
            throw new b0("2/files/search_v2", p8.e(), p8.f(), (a0)p8.d());
        }
    }

    public i0 t(String string) {
        return new i0(this, h0.a(string));
    }

    O0 u(t0 t02) throws ax.p4.j {
        ax.x4.d d8 = this.a;
        return new O0(d8.p(d8.g().i(), "2/files/upload", t02, false, t0.b.b), this.a.i());
    }

    public u0 v(String string) {
        return new u0(this, t0.c(string));
    }

    A0 w(x0 x02) throws ax.p4.j {
        ax.x4.d d8 = this.a;
        return new A0(d8.p(d8.g().i(), "2/files/upload_session/append_v2", x02, false, x0.a.b), this.a.i());
    }

    public A0 x(B0 b02) throws ax.p4.j {
        return this.w(new x0(b02));
    }

    public F0 y(B0 b02, a a8) throws ax.p4.j {
        return this.z(new C0(b02, a8));
    }

    F0 z(C0 c02) throws ax.p4.j {
        ax.x4.d d8 = this.a;
        return new F0(d8.p(d8.g().i(), "2/files/upload_session/finish", c02, false, C0.a.b), this.a.i());
    }
}

