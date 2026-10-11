package ax.Z0;

import android.util.SparseArray;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.H;
import ax.S0.C0968a;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.a1.InterfaceC1276B;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.InterfaceC2209F;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* renamed from: ax.Z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1206c {

    /* renamed from: ax.Z0.c$a */
    public static final class a {
        public final long a;
        public final ax.P0.N b;
        public final int c;
        public final InterfaceC2209F.b d;
        public final long e;
        public final ax.P0.N f;
        public final int g;
        public final InterfaceC2209F.b h;
        public final long i;
        public final long j;

        public a(long j, ax.P0.N n, int i, InterfaceC2209F.b bVar, long j2, ax.P0.N n2, int i2, InterfaceC2209F.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = n;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = n2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* renamed from: ax.Z0.c$b */
    public static final class b {
        private final ax.P0.r a;
        private final SparseArray<a> b;

        public b(ax.P0.r rVar, SparseArray<a> sparseArray) {
            this.a = rVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(rVar.d());
            for (int i = 0; i < rVar.d(); i++) {
                int c = rVar.c(i);
                sparseArray2.append(c, (a) C0968a.e(sparseArray.get(c)));
            }
            this.b = sparseArray2;
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public int b(int i) {
            return this.a.c(i);
        }

        public a c(int i) {
            return (a) C0968a.e(this.b.get(i));
        }

        public int d() {
            return this.a.d();
        }
    }

    void A(a aVar);

    void B(a aVar, int i);

    void C(a aVar, long j);

    void D(a aVar, ax.P0.V v);

    void E(a aVar, C1176b c1176b);

    void F(a aVar, C2234y c2234y, C2205B c2205b, IOException iOException, boolean z);

    void G(a aVar, C0915y c0915y, int i);

    void I(a aVar, int i);

    void K(a aVar);

    void L(a aVar, ax.R0.c cVar);

    @Deprecated
    void M(a aVar);

    void N(a aVar, C2234y c2234y, C2205B c2205b, int i);

    void O(a aVar, int i);

    void P(a aVar, boolean z);

    void Q(a aVar, int i, long j, long j2);

    @Deprecated
    void R(a aVar, C2234y c2234y, C2205B c2205b);

    void S(a aVar, C2234y c2234y, C2205B c2205b);

    void T(a aVar, int i);

    void U(a aVar, C2234y c2234y, C2205B c2205b);

    void V(a aVar, String str, long j, long j2);

    void W(a aVar, ax.P0.T t);

    void X(a aVar, InterfaceC1276B.a aVar2);

    void Y(a aVar, int i, boolean z);

    void Z(a aVar, long j, int i);

    void a(a aVar, C2205B c2205b);

    void a0(a aVar, ax.P0.a0 a0Var);

    void b(a aVar, String str);

    void b0(a aVar, H.e eVar, H.e eVar2, int i);

    @Deprecated
    void c(a aVar);

    void c0(a aVar, ax.P0.G g);

    void d(a aVar, C0905n c0905n);

    void d0(ax.P0.H h, b bVar);

    void e(a aVar, Exception exc);

    void e0(a aVar, InterfaceC1276B.a aVar2);

    void f(a aVar, int i, int i2);

    void f0(a aVar, ax.P0.A a2);

    void g(a aVar);

    void g0(a aVar, Object obj, long j);

    void h(a aVar, C2205B c2205b);

    void h0(a aVar, float f);

    void i(a aVar);

    @Deprecated
    void i0(a aVar, String str, long j);

    void j(a aVar, C0894c c0894c);

    void j0(a aVar, ax.P0.F f);

    @Deprecated
    void k(a aVar, List<ax.R0.a> list);

    void k0(a aVar, C0912v c0912v, C1177c c1177c);

    @Deprecated
    void l(a aVar, String str, long j);

    void l0(a aVar, int i, int i2, boolean z);

    void m(a aVar, C0912v c0912v, C1177c c1177c);

    @Deprecated
    void m0(a aVar, boolean z, int i);

    void n(a aVar, boolean z);

    @Deprecated
    void n0(a aVar, boolean z);

    void o0(a aVar, boolean z);

    void p(a aVar, ax.P0.F f);

    void p0(a aVar, String str, long j, long j2);

    void q(a aVar, Exception exc);

    void q0(a aVar, ax.P0.C c);

    void r(a aVar, C1176b c1176b);

    @Deprecated
    void r0(a aVar, int i);

    @Deprecated
    void s(a aVar, int i, int i2, int i3, float f);

    void s0(a aVar, H.b bVar);

    void t(a aVar, Exception exc);

    void t0(a aVar, String str);

    void u(a aVar, C1176b c1176b);

    void u0(a aVar, Exception exc);

    void v(a aVar, boolean z, int i);

    void v0(a aVar, C1176b c1176b);

    void w(a aVar, int i);

    void w0(a aVar, int i, long j, long j2);

    void x(a aVar, boolean z);

    void x0(a aVar, int i);

    void y0(a aVar);

    void z(a aVar, int i, long j);
}
