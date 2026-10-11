/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.util.SparseArray;
import ax.P0.A;
import ax.P0.C;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.n;
import ax.P0.r;
import ax.P0.v;
import ax.P0.y;
import ax.a1.B;
import ax.i1.B;
import ax.i1.F;
import java.io.IOException;
import java.util.List;

public interface c {
    public void A(a var1);

    public void B(a var1, int var2);

    public void C(a var1, long var2);

    public void D(a var1, V var2);

    public void E(a var1, ax.Y0.b var2);

    public void F(a var1, ax.i1.y var2, B var3, IOException var4, boolean var5);

    public void G(a var1, y var2, int var3);

    public void I(a var1, int var2);

    public void K(a var1);

    public void L(a var1, ax.R0.c var2);

    @Deprecated
    public void M(a var1);

    public void N(a var1, ax.i1.y var2, B var3, int var4);

    public void O(a var1, int var2);

    public void P(a var1, boolean var2);

    public void Q(a var1, int var2, long var3, long var5);

    @Deprecated
    public void R(a var1, ax.i1.y var2, B var3);

    public void S(a var1, ax.i1.y var2, B var3);

    public void T(a var1, int var2);

    public void U(a var1, ax.i1.y var2, B var3);

    public void V(a var1, String var2, long var3, long var5);

    public void W(a var1, T var2);

    public void X(a var1, B.a var2);

    public void Y(a var1, int var2, boolean var3);

    public void Z(a var1, long var2, int var4);

    public void a(a var1, B var2);

    public void a0(a var1, a0 var2);

    public void b(a var1, String var2);

    public void b0(a var1, H.e var2, H.e var3, int var4);

    @Deprecated
    public void c(a var1);

    public void c0(a var1, G var2);

    public void d(a var1, n var2);

    public void d0(H var1, b var2);

    public void e(a var1, Exception var2);

    public void e0(a var1, B.a var2);

    public void f(a var1, int var2, int var3);

    public void f0(a var1, A var2);

    public void g(a var1);

    public void g0(a var1, Object var2, long var3);

    public void h(a var1, B var2);

    public void h0(a var1, float var2);

    public void i(a var1);

    @Deprecated
    public void i0(a var1, String var2, long var3);

    public void j(a var1, ax.P0.c var2);

    public void j0(a var1, F var2);

    @Deprecated
    public void k(a var1, List<ax.R0.a> var2);

    public void k0(a var1, v var2, ax.Y0.c var3);

    @Deprecated
    public void l(a var1, String var2, long var3);

    public void l0(a var1, int var2, int var3, boolean var4);

    public void m(a var1, v var2, ax.Y0.c var3);

    @Deprecated
    public void m0(a var1, boolean var2, int var3);

    public void n(a var1, boolean var2);

    @Deprecated
    public void n0(a var1, boolean var2);

    public void o0(a var1, boolean var2);

    public void p(a var1, F var2);

    public void p0(a var1, String var2, long var3, long var5);

    public void q(a var1, Exception var2);

    public void q0(a var1, C var2);

    public void r(a var1, ax.Y0.b var2);

    @Deprecated
    public void r0(a var1, int var2);

    @Deprecated
    public void s(a var1, int var2, int var3, int var4, float var5);

    public void s0(a var1, H.b var2);

    public void t(a var1, Exception var2);

    public void t0(a var1, String var2);

    public void u(a var1, ax.Y0.b var2);

    public void u0(a var1, Exception var2);

    public void v(a var1, boolean var2, int var3);

    public void v0(a var1, ax.Y0.b var2);

    public void w(a var1, int var2);

    public void w0(a var1, int var2, long var3, long var5);

    public void x(a var1, boolean var2);

    public void x0(a var1, int var2);

    public void y0(a var1);

    public void z(a var1, int var2, long var3);

    public static final class a {
        public final long a;
        public final N b;
        public final int c;
        public final F.b d;
        public final long e;
        public final N f;
        public final int g;
        public final F.b h;
        public final long i;
        public final long j;

        public a(long l8, N n8, int n9, F.b b8, long l9, N n10, int n11, F.b b9, long l10, long l11) {
            this.a = l8;
            this.b = n8;
            this.c = n9;
            this.d = b8;
            this.e = l9;
            this.f = n10;
            this.g = n11;
            this.h = b9;
            this.i = l10;
            this.j = l11;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a == ((a)object).a && this.c == ((a)object).c && this.e == ((a)object).e && this.g == ((a)object).g && this.i == ((a)object).i && this.j == ((a)object).j && j.Objects.equals((Object)this.b, (Object)((a)object).b) && j.Objects.equals((Object)this.d, (Object)((a)object).d) && j.Objects.equals((Object)this.f, (Object)((a)object).f) && j.Objects.equals((Object)this.h, (Object)((a)object).h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
        }
    }

    public static final class b {
        private final r a;
        private final SparseArray<a> b;

        public b(r r8, SparseArray<a> sparseArray) {
            this.a = r8;
            SparseArray sparseArray2 = new SparseArray(r8.d());
            for (int i8 = 0; i8 < r8.d(); ++i8) {
                int n8 = r8.c(i8);
                sparseArray2.append(n8, (Object)ax.S0.a.e((a)sparseArray.get(n8)));
            }
            this.b = sparseArray2;
        }

        public boolean a(int n8) {
            return this.a.a(n8);
        }

        public int b(int n8) {
            return this.a.c(n8);
        }

        public a c(int n8) {
            return ax.S0.a.e((a)this.b.get(n8));
        }

        public int d() {
            return this.a.d();
        }
    }
}

