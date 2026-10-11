package androidx.media3.exoplayer;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.g1.C2104c;
import ax.i1.InterfaceC2209F;
import ax.k1.C2366i;
import ax.l1.InterfaceC2445D;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes.dex */
class O0 {
    private final M0 a;
    private final int b;
    private final M0 c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;

    public O0(M0 m0, M0 m02, int i) {
        this.a = m0;
        this.b = i;
        this.c = m02;
    }

    private boolean A() {
        return this.d == 3;
    }

    private void C(M0 m0, ax.i1.e0 e0Var, C0607k c0607k, long j, boolean z) throws C0622s {
        if (z(m0)) {
            if (e0Var != m0.j()) {
                d(m0, c0607k);
            } else if (z) {
                m0.F(j);
            }
        }
    }

    private void E(boolean z) {
        if (z) {
            if (this.e) {
                this.a.a();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            ((M0) C0968a.e(this.c)).a();
            this.f = false;
        }
    }

    private int K(M0 m0, C0620q0 c0620q0, ax.l1.K k, C0607k c0607k) throws C0622s {
        if (m0 == null || !z(m0) || ((m0 == this.a && w()) || (m0 == this.c && A()))) {
            return 1;
        }
        ax.i1.e0 j = m0.j();
        ax.i1.e0[] e0VarArr = c0620q0.c;
        int i = this.b;
        boolean z = j != e0VarArr[i];
        boolean c = k.c(i);
        if (c && !z) {
            return 1;
        }
        if (!m0.G()) {
            m0.t(i(k.c[this.b]), (ax.i1.e0) C0968a.e(c0620q0.c[this.b]), c0620q0.n(), c0620q0.m(), c0620q0.h.a);
            return 3;
        }
        if (!m0.c()) {
            return 0;
        }
        d(m0, c0607k);
        if (!c || u()) {
            E(m0 == this.a);
        }
        return 1;
    }

    private void P(M0 m0, long j) {
        m0.q();
        if (m0 instanceof C2366i) {
            ((C2366i) m0).y0(j);
        }
    }

    private void Z(boolean z) throws C0622s {
        if (z) {
            ((M0) C0968a.e(this.c)).B(17, this.a);
        } else {
            this.a.B(17, C0968a.e(this.c));
        }
    }

    private void d(M0 m0, C0607k c0607k) {
        C0968a.g(this.a == m0 || this.c == m0);
        if (z(m0)) {
            c0607k.a(m0);
            g(m0);
            m0.f();
        }
    }

    private void g(M0 m0) {
        if (m0.getState() == 2) {
            m0.stop();
        }
    }

    private static C0912v[] i(InterfaceC2445D interfaceC2445D) {
        int length = interfaceC2445D != null ? interfaceC2445D.length() : 0;
        C0912v[] c0912vArr = new C0912v[length];
        for (int i = 0; i < length; i++) {
            c0912vArr[i] = ((InterfaceC2445D) C0968a.e(interfaceC2445D)).h(i);
        }
        return c0912vArr;
    }

    private M0 l(C0620q0 c0620q0) {
        if (c0620q0 != null && c0620q0.c[this.b] != null) {
            if (this.a.j() == c0620q0.c[this.b]) {
                return this.a;
            }
            M0 m0 = this.c;
            if (m0 != null && m0.j() == c0620q0.c[this.b]) {
                return this.c;
            }
        }
        return null;
    }

    private boolean p(C0620q0 c0620q0, M0 m0) {
        if (m0 == null) {
            return true;
        }
        ax.i1.e0 e0Var = c0620q0.c[this.b];
        if (m0.j() == null || (m0.j() == e0Var && (e0Var == null || m0.n() || q(m0, c0620q0)))) {
            return true;
        }
        C0620q0 k = c0620q0.k();
        return k != null && k.c[this.b] == m0.j();
    }

    private boolean q(M0 m0, C0620q0 c0620q0) {
        C0620q0 k = c0620q0.k();
        if (c0620q0.h.g && k != null && k.f) {
            return (m0 instanceof C2366i) || (m0 instanceof C2104c) || m0.D() >= k.n();
        }
        return false;
    }

    private boolean w() {
        int i = this.d;
        return i == 2 || i == 4;
    }

    private static boolean z(M0 m0) {
        return m0.getState() != 0;
    }

    public void B(ax.i1.e0 e0Var, C0607k c0607k, long j, boolean z) throws C0622s {
        C(this.a, e0Var, c0607k, j, z);
        M0 m0 = this.c;
        if (m0 != null) {
            C(m0, e0Var, c0607k, j, z);
        }
    }

    public void D() throws C0622s {
        int i = this.d;
        if (i == 3 || i == 4) {
            Z(i == 4);
            this.d = this.d != 4 ? 1 : 0;
        } else if (i == 2) {
            this.d = 0;
        }
    }

    public void F(ax.l1.K k, ax.l1.K k2, long j) {
        int i;
        boolean c = k.c(this.b);
        boolean c2 = k2.c(this.b);
        M0 m0 = (this.c == null || (i = this.d) == 3 || (i == 0 && z(this.a))) ? this.a : (M0) C0968a.e(this.c);
        if (!c || m0.G()) {
            return;
        }
        boolean z = m() == -2;
        ax.Y0.W[] wArr = k.b;
        int i2 = this.b;
        ax.Y0.W w = wArr[i2];
        ax.Y0.W w2 = k2.b[i2];
        if (!c2 || !Objects.equals(w2, w) || z || u()) {
            P(m0, j);
        }
    }

    public void G(C0620q0 c0620q0) throws IOException {
        ((M0) C0968a.e(l(c0620q0))).C();
    }

    public void H() {
        this.a.d();
        this.e = false;
        M0 m0 = this.c;
        if (m0 != null) {
            m0.d();
            this.f = false;
        }
    }

    public void I(long j, long j2) throws C0622s {
        if (z(this.a)) {
            this.a.i(j, j2);
        }
        M0 m0 = this.c;
        if (m0 == null || !z(m0)) {
            return;
        }
        this.c.i(j, j2);
    }

    public int J(C0620q0 c0620q0, ax.l1.K k, C0607k c0607k) throws C0622s {
        int K = K(this.a, c0620q0, k, c0607k);
        return K == 1 ? K(this.c, c0620q0, k, c0607k) : K;
    }

    public void L() {
        if (!z(this.a)) {
            E(true);
        }
        M0 m0 = this.c;
        if (m0 == null || z(m0)) {
            return;
        }
        E(false);
    }

    public void M(C0620q0 c0620q0, long j) throws C0622s {
        M0 l = l(c0620q0);
        if (l != null) {
            l.F(j);
        }
    }

    public void N(long j) {
        int i;
        if (z(this.a) && (i = this.d) != 4 && i != 2) {
            P(this.a, j);
        }
        M0 m0 = this.c;
        if (m0 == null || !z(m0) || this.d == 3) {
            return;
        }
        P(this.c, j);
    }

    public void O(C0620q0 c0620q0, long j) {
        P((M0) C0968a.e(l(c0620q0)), j);
    }

    public void Q(float f, float f2) throws C0622s {
        this.a.x(f, f2);
        M0 m0 = this.c;
        if (m0 != null) {
            m0.x(f, f2);
        }
    }

    public void R(ax.Y0.Y y) throws C0622s {
        this.a.B(18, y);
        M0 m0 = this.c;
        if (m0 != null) {
            m0.B(18, y);
        }
    }

    public void S(ax.P0.N n) {
        this.a.r(n);
        M0 m0 = this.c;
        if (m0 != null) {
            m0.r(n);
        }
    }

    public void T(ax.o1.z zVar) throws C0622s {
        if (m() != 2) {
            return;
        }
        this.a.B(7, zVar);
        M0 m0 = this.c;
        if (m0 != null) {
            m0.B(7, zVar);
        }
    }

    public void U(Object obj) throws C0622s {
        if (m() != 2) {
            return;
        }
        int i = this.d;
        if (i == 4 || i == 1) {
            ((M0) C0968a.e(this.c)).B(1, obj);
        } else {
            this.a.B(1, obj);
        }
    }

    public void V(float f) throws C0622s {
        if (m() != 1) {
            return;
        }
        this.a.B(2, Float.valueOf(f));
        M0 m0 = this.c;
        if (m0 != null) {
            m0.B(2, Float.valueOf(f));
        }
    }

    public void W() throws C0622s {
        if (this.a.getState() == 1 && this.d != 4) {
            this.a.start();
            return;
        }
        M0 m0 = this.c;
        if (m0 == null || m0.getState() != 1 || this.d == 3) {
            return;
        }
        this.c.start();
    }

    public void X() {
        int i;
        C0968a.g(!u());
        if (z(this.a)) {
            i = 3;
        } else {
            M0 m0 = this.c;
            i = (m0 == null || !z(m0)) ? 2 : 4;
        }
        this.d = i;
    }

    public void Y() {
        if (z(this.a)) {
            g(this.a);
        }
        M0 m0 = this.c;
        if (m0 == null || !z(m0)) {
            return;
        }
        g(this.c);
    }

    public boolean a(C0620q0 c0620q0) {
        M0 l = l(c0620q0);
        return l == null || l.n() || l.isReady() || l.c();
    }

    public void b(C0607k c0607k) throws C0622s {
        d(this.a, c0607k);
        M0 m0 = this.c;
        if (m0 != null) {
            boolean z = z(m0) && this.d != 3;
            d(this.c, c0607k);
            E(false);
            if (z) {
                Z(true);
            }
        }
        this.d = 0;
    }

    public void c(C0607k c0607k) {
        if (u()) {
            int i = this.d;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            d(z ? this.a : (M0) C0968a.e(this.c), c0607k);
            E(z);
            this.d = i2;
        }
    }

    public void e(ax.Y0.W w, InterfaceC2445D interfaceC2445D, ax.i1.e0 e0Var, long j, boolean z, boolean z2, long j2, long j3, InterfaceC2209F.b bVar, C0607k c0607k) throws C0622s {
        C0912v[] i = i(interfaceC2445D);
        int i2 = this.d;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.e = true;
            this.a.s(w, i, e0Var, j, z, z2, j2, j3, bVar);
            c0607k.b(this.a);
        } else {
            this.f = true;
            ((M0) C0968a.e(this.c)).s(w, i, e0Var, j, z, z2, j2, j3, bVar);
            c0607k.b(this.c);
        }
    }

    public void f() {
        if (z(this.a)) {
            this.a.p();
            return;
        }
        M0 m0 = this.c;
        if (m0 == null || !z(m0)) {
            return;
        }
        this.c.p();
    }

    public int h() {
        boolean z = z(this.a);
        M0 m0 = this.c;
        return (z ? 1 : 0) + ((m0 == null || !z(m0)) ? 0 : 1);
    }

    public long j(long j, long j2) {
        long o = z(this.a) ? this.a.o(j, j2) : Long.MAX_VALUE;
        M0 m0 = this.c;
        return (m0 == null || !z(m0)) ? o : Math.min(o, this.c.o(j, j2));
    }

    public long k(C0620q0 c0620q0) {
        M0 l = l(c0620q0);
        Objects.requireNonNull(l);
        return l.D();
    }

    public int m() {
        return this.a.k();
    }

    public void n(int i, Object obj, C0620q0 c0620q0) throws C0622s {
        ((M0) C0968a.e(l(c0620q0))).B(i, obj);
    }

    public boolean o(C0620q0 c0620q0) {
        return p(c0620q0, this.a) && p(c0620q0, this.c);
    }

    public boolean r(C0620q0 c0620q0) {
        return ((M0) C0968a.e(l(c0620q0))).n();
    }

    public boolean s() {
        return this.c != null;
    }

    public boolean t() {
        boolean c = z(this.a) ? this.a.c() : true;
        M0 m0 = this.c;
        return (m0 == null || !z(m0)) ? c : c & this.c.c();
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(C0620q0 c0620q0) {
        return (w() && l(c0620q0) == this.a) || (A() && l(c0620q0) == this.c);
    }

    public boolean x(C0620q0 c0620q0) {
        return l(c0620q0) != null;
    }

    public boolean y() {
        int i = this.d;
        return (i == 0 || i == 2 || i == 4) ? z(this.a) : z((M0) C0968a.e(this.c));
    }
}
