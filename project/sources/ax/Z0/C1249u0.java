package ax.Z0;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.C0622s;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.H;
import ax.P0.N;
import ax.S0.C0968a;
import ax.S0.C0986t;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Z0.InterfaceC1206c;
import ax.a1.InterfaceC1276B;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.InterfaceC2209F;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: ax.Z0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1249u0 implements InterfaceC1200a {
    private final InterfaceC0975h a;
    private final N.b b;
    private final N.c c;
    private final a d;
    private final SparseArray<InterfaceC1206c.a> e;
    private C0986t<InterfaceC1206c> f;
    private ax.P0.H g;
    private InterfaceC0984q h;
    private boolean i;

    /* renamed from: ax.Z0.u0$a */
    private static final class a {
        private final N.b a;
        private AbstractC2991z<InterfaceC2209F.b> b = AbstractC2991z.z();
        private AbstractC2962A<InterfaceC2209F.b, ax.P0.N> c = AbstractC2962A.k();
        private InterfaceC2209F.b d;
        private InterfaceC2209F.b e;
        private InterfaceC2209F.b f;

        public a(N.b bVar) {
            this.a = bVar;
        }

        private void b(AbstractC2962A.a<InterfaceC2209F.b, ax.P0.N> aVar, InterfaceC2209F.b bVar, ax.P0.N n) {
            if (bVar == null) {
                return;
            }
            if (n.b(bVar.a) != -1) {
                aVar.f(bVar, n);
                return;
            }
            ax.P0.N n2 = this.c.get(bVar);
            if (n2 != null) {
                aVar.f(bVar, n2);
            }
        }

        private static InterfaceC2209F.b c(ax.P0.H h, AbstractC2991z<InterfaceC2209F.b> abstractC2991z, InterfaceC2209F.b bVar, N.b bVar2) {
            ax.P0.N h0 = h.h0();
            int D = h.D();
            Object m = h0.q() ? null : h0.m(D);
            int d = (h.p() || h0.q()) ? -1 : h0.f(D, bVar2).d(ax.S0.d0.a1(h.s0()) - bVar2.o());
            for (int i = 0; i < abstractC2991z.size(); i++) {
                InterfaceC2209F.b bVar3 = abstractC2991z.get(i);
                if (i(bVar3, m, h.p(), h.a0(), h.K(), d)) {
                    return bVar3;
                }
            }
            if (abstractC2991z.isEmpty() && bVar != null && i(bVar, m, h.p(), h.a0(), h.K(), d)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(InterfaceC2209F.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.a.equals(obj)) {
                return false;
            }
            if (z && bVar.b == i && bVar.c == i2) {
                return true;
            }
            return !z && bVar.b == -1 && bVar.e == i3;
        }

        private void m(ax.P0.N n) {
            AbstractC2962A.a<InterfaceC2209F.b, ax.P0.N> a = AbstractC2962A.a();
            if (this.b.isEmpty()) {
                b(a, this.e, n);
                if (!Objects.equals(this.f, this.e)) {
                    b(a, this.f, n);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    b(a, this.d, n);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    b(a, this.b.get(i), n);
                }
                if (!this.b.contains(this.d)) {
                    b(a, this.d, n);
                }
            }
            this.c = a.c();
        }

        public InterfaceC2209F.b d() {
            return this.d;
        }

        public InterfaceC2209F.b e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (InterfaceC2209F.b) ax.r7.F.e(this.b);
        }

        public ax.P0.N f(InterfaceC2209F.b bVar) {
            return this.c.get(bVar);
        }

        public InterfaceC2209F.b g() {
            return this.e;
        }

        public InterfaceC2209F.b h() {
            return this.f;
        }

        public void j(ax.P0.H h) {
            this.d = c(h, this.b, this.e, this.a);
        }

        public void k(List<InterfaceC2209F.b> list, InterfaceC2209F.b bVar, ax.P0.H h) {
            this.b = AbstractC2991z.u(list);
            if (!list.isEmpty()) {
                this.e = list.get(0);
                this.f = (InterfaceC2209F.b) C0968a.e(bVar);
            }
            if (this.d == null) {
                this.d = c(h, this.b, this.e, this.a);
            }
            m(h.h0());
        }

        public void l(ax.P0.H h) {
            this.d = c(h, this.b, this.e, this.a);
            m(h.h0());
        }
    }

    public C1249u0(InterfaceC0975h interfaceC0975h) {
        this.a = (InterfaceC0975h) C0968a.e(interfaceC0975h);
        this.f = new C0986t<>(ax.S0.d0.X(), interfaceC0975h, new C0986t.b() { // from class: ax.Z0.w
            @Override // ax.S0.C0986t.b
            public final void a(Object obj, ax.P0.r rVar) {
                C1249u0.F1((InterfaceC1206c) obj, rVar);
            }
        });
        N.b bVar = new N.b();
        this.b = bVar;
        this.c = new N.c();
        this.d = new a(bVar);
        this.e = new SparseArray<>();
    }

    public static /* synthetic */ void F1(InterfaceC1206c interfaceC1206c, ax.P0.r rVar) {
    }

    public static /* synthetic */ void G0(InterfaceC1206c.a aVar, ax.P0.a0 a0Var, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.a0(aVar, a0Var);
        interfaceC1206c.s(aVar, a0Var.a, a0Var.b, 0, a0Var.d);
    }

    public static /* synthetic */ void H0(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b, int i, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.R(aVar, c2234y, c2205b);
        interfaceC1206c.N(aVar, c2234y, c2205b, i);
    }

    private InterfaceC1206c.a M1(InterfaceC2209F.b bVar) {
        C0968a.e(this.g);
        ax.P0.N f = bVar == null ? null : this.d.f(bVar);
        if (bVar != null && f != null) {
            return L1(f, f.h(bVar.a, this.b).c, bVar);
        }
        int b0 = this.g.b0();
        ax.P0.N h0 = this.g.h0();
        if (b0 >= h0.p()) {
            h0 = ax.P0.N.a;
        }
        return L1(h0, b0, null);
    }

    private InterfaceC1206c.a N1() {
        return M1(this.d.e());
    }

    private InterfaceC1206c.a O1(int i, InterfaceC2209F.b bVar) {
        C0968a.e(this.g);
        if (bVar != null) {
            return this.d.f(bVar) != null ? M1(bVar) : L1(ax.P0.N.a, i, bVar);
        }
        ax.P0.N h0 = this.g.h0();
        if (i >= h0.p()) {
            h0 = ax.P0.N.a;
        }
        return L1(h0, i, null);
    }

    private InterfaceC1206c.a P1() {
        return M1(this.d.g());
    }

    private InterfaceC1206c.a Q1() {
        return M1(this.d.h());
    }

    public static /* synthetic */ void R0(InterfaceC1206c.a aVar, String str, long j, long j2, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.l(aVar, str, j);
        interfaceC1206c.V(aVar, str, j2, j);
    }

    private InterfaceC1206c.a R1(ax.P0.F f) {
        InterfaceC2209F.b bVar;
        return (!(f instanceof C0622s) || (bVar = ((C0622s) f).p0) == null) ? K1() : M1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 1028, new C0986t.a() { // from class: ax.Z0.U
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).g(InterfaceC1206c.a.this);
            }
        });
        this.f.i();
    }

    public static /* synthetic */ void X0(InterfaceC1206c.a aVar, boolean z, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.n0(aVar, z);
        interfaceC1206c.o0(aVar, z);
    }

    public static /* synthetic */ void g1(InterfaceC1206c.a aVar, int i, H.e eVar, H.e eVar2, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.r0(aVar, i);
        interfaceC1206c.b0(aVar, eVar, eVar2, i);
    }

    public static /* synthetic */ void x0(InterfaceC1206c.a aVar, int i, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.M(aVar);
        interfaceC1206c.T(aVar, i);
    }

    public static /* synthetic */ void z0(InterfaceC1206c.a aVar, String str, long j, long j2, InterfaceC1206c interfaceC1206c) {
        interfaceC1206c.i0(aVar, str, j);
        interfaceC1206c.p0(aVar, str, j2, j);
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void A(final int i, final long j, final long j2) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1011, new C0986t.a() { // from class: ax.Z0.m0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).Q(InterfaceC1206c.a.this, i, j, j2);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void B(final C1176b c1176b) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1015, new C0986t.a() { // from class: ax.Z0.i0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).E(InterfaceC1206c.a.this, c1176b);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void C(final long j, final int i) {
        final InterfaceC1206c.a P1 = P1();
        T1(P1, 1021, new C0986t.a() { // from class: ax.Z0.a0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).Z(InterfaceC1206c.a.this, j, i);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void D(final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 6, new C0986t.a() { // from class: ax.Z0.q
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).x0(InterfaceC1206c.a.this, i);
            }
        });
    }

    @Override // ax.b1.InterfaceC1471u
    public final void G(int i, InterfaceC2209F.b bVar) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1025, new C0986t.a() { // from class: ax.Z0.F
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).A(InterfaceC1206c.a.this);
            }
        });
    }

    @Override // ax.P0.H.d
    public void H(final ax.P0.V v) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 2, new C0986t.a() { // from class: ax.Z0.z
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).D(InterfaceC1206c.a.this, v);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void I(final boolean z) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 3, new C0986t.a() { // from class: ax.Z0.r0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.X0(InterfaceC1206c.a.this, z, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.P0.H.d
    public void J(final ax.P0.F f) {
        final InterfaceC1206c.a R1 = R1(f);
        T1(R1, 10, new C0986t.a() { // from class: ax.Z0.s
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).j0(InterfaceC1206c.a.this, f);
            }
        });
    }

    @Override // ax.i1.N
    public final void K(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new C0986t.a() { // from class: ax.Z0.E
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).S(InterfaceC1206c.a.this, c2234y, c2205b);
            }
        });
    }

    protected final InterfaceC1206c.a K1() {
        return M1(this.d.d());
    }

    @Override // ax.P0.H.d
    public final void L(final float f) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 22, new C0986t.a() { // from class: ax.Z0.g
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).h0(InterfaceC1206c.a.this, f);
            }
        });
    }

    protected final InterfaceC1206c.a L1(ax.P0.N n, int i, InterfaceC2209F.b bVar) {
        InterfaceC2209F.b bVar2 = n.q() ? null : bVar;
        long b = this.a.b();
        boolean z = n.equals(this.g.h0()) && i == this.g.b0();
        long j = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                j = this.g.V();
            } else if (!n.q()) {
                j = n.n(i, this.c).b();
            }
        } else if (z && this.g.a0() == bVar2.b && this.g.K() == bVar2.c) {
            j = this.g.s0();
        }
        return new InterfaceC1206c.a(b, n, i, bVar2, j, this.g.h0(), this.g.b0(), this.d.d(), this.g.s0(), this.g.r());
    }

    @Override // ax.b1.InterfaceC1471u
    public final void M(int i, InterfaceC2209F.b bVar) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1026, new C0986t.a() { // from class: ax.Z0.C
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).i(InterfaceC1206c.a.this);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void N(final ax.P0.F f) {
        final InterfaceC1206c.a R1 = R1(f);
        T1(R1, 10, new C0986t.a() { // from class: ax.Z0.y
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).p(InterfaceC1206c.a.this, f);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void O(final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 4, new C0986t.a() { // from class: ax.Z0.A
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).w(InterfaceC1206c.a.this, i);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void P(ax.P0.N n, final int i) {
        this.d.l((ax.P0.H) C0968a.e(this.g));
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 0, new C0986t.a() { // from class: ax.Z0.e
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).O(InterfaceC1206c.a.this, i);
            }
        });
    }

    @Override // ax.m1.e.a
    public final void Q(final int i, final long j, final long j2) {
        final InterfaceC1206c.a N1 = N1();
        T1(N1, 1006, new C0986t.a() { // from class: ax.Z0.o
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).w0(InterfaceC1206c.a.this, i, j, j2);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void R() {
        if (this.i) {
            return;
        }
        final InterfaceC1206c.a K1 = K1();
        this.i = true;
        T1(K1, -1, new C0986t.a() { // from class: ax.Z0.G
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).c(InterfaceC1206c.a.this);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void S(final boolean z) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 9, new C0986t.a() { // from class: ax.Z0.l0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).x(InterfaceC1206c.a.this, z);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public void T(final int i, final int i2, final boolean z) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1033, new C0986t.a() { // from class: ax.Z0.u
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).l0(InterfaceC1206c.a.this, i, i2, z);
            }
        });
    }

    protected final void T1(InterfaceC1206c.a aVar, int i, C0986t.a<InterfaceC1206c> aVar2) {
        this.e.put(i, aVar);
        this.f.k(i, aVar2);
    }

    @Override // ax.P0.H.d
    public void U(final ax.P0.T t) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 19, new C0986t.a() { // from class: ax.Z0.q0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).W(InterfaceC1206c.a.this, t);
            }
        });
    }

    @Override // ax.b1.InterfaceC1471u
    public final void V(int i, InterfaceC2209F.b bVar) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1027, new C0986t.a() { // from class: ax.Z0.P
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).K(InterfaceC1206c.a.this);
            }
        });
    }

    @Override // ax.P0.H.d
    public void W(final H.b bVar) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 13, new C0986t.a() { // from class: ax.Z0.t0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).s0(InterfaceC1206c.a.this, bVar);
            }
        });
    }

    @Override // ax.i1.N
    public final void X(int i, InterfaceC2209F.b bVar, final C2205B c2205b) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1004, new C0986t.a() { // from class: ax.Z0.S
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).a(InterfaceC1206c.a.this, c2205b);
            }
        });
    }

    @Override // ax.P0.H.d
    public void Y(final int i, final boolean z) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 30, new C0986t.a() { // from class: ax.Z0.Z
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).Y(InterfaceC1206c.a.this, i, z);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void Z(final boolean z, final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, -1, new C0986t.a() { // from class: ax.Z0.k
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).m0(InterfaceC1206c.a.this, z, i);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void a(final ax.P0.a0 a0Var) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 25, new C0986t.a() { // from class: ax.Z0.f0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.G0(InterfaceC1206c.a.this, a0Var, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void a0(final C0915y c0915y, final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 1, new C0986t.a() { // from class: ax.Z0.f
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).G(InterfaceC1206c.a.this, c0915y, i);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public void b(final InterfaceC1276B.a aVar) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1032, new C0986t.a() { // from class: ax.Z0.n0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).e0(InterfaceC1206c.a.this, aVar);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void c(final int i) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 21, new C0986t.a() { // from class: ax.Z0.e0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).B(InterfaceC1206c.a.this, i);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public void d() {
        ((InterfaceC0984q) C0968a.i(this.h)).c(new Runnable() { // from class: ax.Z0.I
            @Override // java.lang.Runnable
            public final void run() {
                C1249u0.this.S1();
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public void d0(final ax.P0.H h, Looper looper) {
        C0968a.g(this.g == null || this.d.b.isEmpty());
        this.g = (ax.P0.H) C0968a.e(h);
        this.h = this.a.d(looper, null);
        this.f = this.f.e(looper, new C0986t.b() { // from class: ax.Z0.j
            @Override // ax.S0.C0986t.b
            public final void a(Object obj, ax.P0.r rVar) {
                InterfaceC1206c interfaceC1206c = (InterfaceC1206c) obj;
                interfaceC1206c.d0(h, new InterfaceC1206c.b(rVar, C1249u0.this.e));
            }
        });
    }

    @Override // ax.P0.H.d
    public final void e(final boolean z) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 23, new C0986t.a() { // from class: ax.Z0.o0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).n(InterfaceC1206c.a.this, z);
            }
        });
    }

    @Override // ax.i1.N
    public final void e0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1002, new C0986t.a() { // from class: ax.Z0.x
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).U(InterfaceC1206c.a.this, c2234y, c2205b);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void f(final Exception exc) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1014, new C0986t.a() { // from class: ax.Z0.k0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).e(InterfaceC1206c.a.this, exc);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public void f0(InterfaceC1206c interfaceC1206c) {
        C0968a.e(interfaceC1206c);
        this.f.c(interfaceC1206c);
    }

    @Override // ax.Z0.InterfaceC1200a
    public void g(final InterfaceC1276B.a aVar) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1031, new C0986t.a() { // from class: ax.Z0.p0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).X(InterfaceC1206c.a.this, aVar);
            }
        });
    }

    @Override // ax.b1.InterfaceC1471u
    public final void g0(int i, InterfaceC2209F.b bVar, final int i2) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1022, new C0986t.a() { // from class: ax.Z0.B
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.x0(InterfaceC1206c.a.this, i2, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void h(final C0912v c0912v, final C1177c c1177c) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1017, new C0986t.a() { // from class: ax.Z0.d0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).k0(InterfaceC1206c.a.this, c0912v, c1177c);
            }
        });
    }

    @Override // ax.i1.N
    public final void h0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b, final IOException iOException, final boolean z) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1003, new C0986t.a() { // from class: ax.Z0.i
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).F(InterfaceC1206c.a.this, c2234y, c2205b, iOException, z);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void i(final String str) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1019, new C0986t.a() { // from class: ax.Z0.r
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).t0(InterfaceC1206c.a.this, str);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void i0(final boolean z, final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 5, new C0986t.a() { // from class: ax.Z0.t
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).v(InterfaceC1206c.a.this, z, i);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void j(final ax.P0.G g) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 12, new C0986t.a() { // from class: ax.Z0.d
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).c0(InterfaceC1206c.a.this, g);
            }
        });
    }

    @Override // ax.P0.H.d
    public void j0(final ax.P0.A a2) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 14, new C0986t.a() { // from class: ax.Z0.W
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).f0(InterfaceC1206c.a.this, a2);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void k(final String str, final long j, final long j2) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1016, new C0986t.a() { // from class: ax.Z0.N
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.R0(InterfaceC1206c.a.this, str, j2, j, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.P0.H.d
    public void k0(final C0905n c0905n) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 29, new C0986t.a() { // from class: ax.Z0.c0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).d(InterfaceC1206c.a.this, c0905n);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void l(final C0912v c0912v, final C1177c c1177c) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1009, new C0986t.a() { // from class: ax.Z0.g0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).m(InterfaceC1206c.a.this, c0912v, c1177c);
            }
        });
    }

    @Override // ax.b1.InterfaceC1471u
    public final void l0(int i, InterfaceC2209F.b bVar, final Exception exc) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1024, new C0986t.a() { // from class: ax.Z0.D
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).u0(InterfaceC1206c.a.this, exc);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void m(final C1176b c1176b) {
        final InterfaceC1206c.a P1 = P1();
        T1(P1, 1020, new C0986t.a() { // from class: ax.Z0.T
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).v0(InterfaceC1206c.a.this, c1176b);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void m0(List<InterfaceC2209F.b> list, InterfaceC2209F.b bVar) {
        this.d.k(list, bVar, (ax.P0.H) C0968a.e(this.g));
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void n(final String str) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1012, new C0986t.a() { // from class: ax.Z0.s0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).b(InterfaceC1206c.a.this, str);
            }
        });
    }

    @Override // ax.b1.InterfaceC1471u
    public final void n0(int i, InterfaceC2209F.b bVar) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1023, new C0986t.a() { // from class: ax.Z0.O
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).y0(InterfaceC1206c.a.this);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void o(final String str, final long j, final long j2) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1008, new C0986t.a() { // from class: ax.Z0.p
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.z0(InterfaceC1206c.a.this, str, j2, j, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void o0(final int i, final int i2) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 24, new C0986t.a() { // from class: ax.Z0.Q
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).f(InterfaceC1206c.a.this, i, i2);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void p(final int i, final long j) {
        final InterfaceC1206c.a P1 = P1();
        T1(P1, 1018, new C0986t.a() { // from class: ax.Z0.Y
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).z(InterfaceC1206c.a.this, i, j);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void p0(final H.e eVar, final H.e eVar2, final int i) {
        if (i == 1) {
            this.i = false;
        }
        this.d.j((ax.P0.H) C0968a.e(this.g));
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 11, new C0986t.a() { // from class: ax.Z0.H
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.g1(InterfaceC1206c.a.this, i, eVar, eVar2, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void q(final Object obj, final long j) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 26, new C0986t.a() { // from class: ax.Z0.j0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj2) {
                ((InterfaceC1206c) obj2).g0(InterfaceC1206c.a.this, obj, j);
            }
        });
    }

    @Override // ax.i1.N
    public final void q0(int i, InterfaceC2209F.b bVar, final C2205B c2205b) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new C0986t.a() { // from class: ax.Z0.L
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).h(InterfaceC1206c.a.this, c2205b);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void r(final ax.P0.C c) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 28, new C0986t.a() { // from class: ax.Z0.m
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).q0(InterfaceC1206c.a.this, c);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void r0(final C0894c c0894c) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 20, new C0986t.a() { // from class: ax.Z0.l
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).j(InterfaceC1206c.a.this, c0894c);
            }
        });
    }

    @Override // ax.P0.H.d
    public void s(final ax.R0.c cVar) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 27, new C0986t.a() { // from class: ax.Z0.K
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).L(InterfaceC1206c.a.this, cVar);
            }
        });
    }

    @Override // ax.i1.N
    public final void s0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b, final int i2) {
        final InterfaceC1206c.a O1 = O1(i, bVar);
        T1(O1, 1000, new C0986t.a() { // from class: ax.Z0.h0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                C1249u0.H0(InterfaceC1206c.a.this, c2234y, c2205b, i2, (InterfaceC1206c) obj);
            }
        });
    }

    @Override // ax.P0.H.d
    public void t(final List<ax.R0.a> list) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 27, new C0986t.a() { // from class: ax.Z0.v
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).k(InterfaceC1206c.a.this, list);
            }
        });
    }

    @Override // ax.P0.H.d
    public void t0(final boolean z) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 7, new C0986t.a() { // from class: ax.Z0.n
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).P(InterfaceC1206c.a.this, z);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void u(final C1176b c1176b) {
        final InterfaceC1206c.a P1 = P1();
        T1(P1, 1013, new C0986t.a() { // from class: ax.Z0.b0
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).u(InterfaceC1206c.a.this, c1176b);
            }
        });
    }

    @Override // ax.P0.H.d
    public final void v(final int i) {
        final InterfaceC1206c.a K1 = K1();
        T1(K1, 8, new C0986t.a() { // from class: ax.Z0.J
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).I(InterfaceC1206c.a.this, i);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void w(final C1176b c1176b) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1007, new C0986t.a() { // from class: ax.Z0.V
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).r(InterfaceC1206c.a.this, c1176b);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void x(final long j) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1010, new C0986t.a() { // from class: ax.Z0.X
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).C(InterfaceC1206c.a.this, j);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void y(final Exception exc) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1029, new C0986t.a() { // from class: ax.Z0.M
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).t(InterfaceC1206c.a.this, exc);
            }
        });
    }

    @Override // ax.Z0.InterfaceC1200a
    public final void z(final Exception exc) {
        final InterfaceC1206c.a Q1 = Q1();
        T1(Q1, 1030, new C0986t.a() { // from class: ax.Z0.h
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((InterfaceC1206c) obj).q(InterfaceC1206c.a.this, exc);
            }
        });
    }

    @Override // ax.P0.H.d
    public void b0() {
    }

    @Override // ax.P0.H.d
    public void E(boolean z) {
    }

    @Override // ax.P0.H.d
    public void F(int i) {
    }

    @Override // ax.P0.H.d
    public void c0(ax.P0.H h, H.c cVar) {
    }
}
