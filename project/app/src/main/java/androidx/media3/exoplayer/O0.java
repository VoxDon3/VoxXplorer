/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.P0.v;
import ax.S0.a;
import ax.Y0.W;
import ax.Y0.Y;
import ax.g1.c;
import ax.i1.F;
import ax.i1.e0;
import ax.k1.i;
import ax.l1.D;
import ax.l1.K;
import ax.o1.z;
import java.io.IOException;

class O0 {
    private final M0 a;
    private final int b;
    private final M0 c;
    private int d;
    private boolean e;
    private boolean f;

    public O0(M0 m02, M0 m03, int n8) {
        this.a = m02;
        this.b = n8;
        this.c = m03;
        this.d = 0;
        this.e = false;
        this.f = false;
    }

    private boolean A() {
        return this.d == 3;
    }

    private void C(M0 m02, e0 e02, k k8, long l8, boolean bl) throws s {
        if (O0.z(m02)) {
            if (e02 != m02.j()) {
                this.d(m02, k8);
                return;
            }
            if (bl) {
                m02.F(l8);
            }
        }
    }

    private void E(boolean bl) {
        if (bl) {
            if (this.e) {
                this.a.a();
                this.e = false;
                return;
            }
        } else if (this.f) {
            ax.S0.a.e(this.c).a();
            this.f = false;
        }
    }

    private int K(M0 m02, q0 q02, K k8, k k9) throws s {
        if (!(m02 == null || !O0.z(m02) || m02 == this.a && this.w() || m02 == this.c && this.A())) {
            e0 e02 = m02.j();
            Object object = q02.c;
            int n8 = this.b;
            object = object[n8];
            boolean bl = false;
            boolean bl2 = e02 != object;
            boolean bl3 = k8.c(n8);
            if (bl3 && !bl2) {
                return 1;
            }
            if (!m02.G()) {
                m02.t(O0.i(k8.c[this.b]), ax.S0.a.e(q02.c[this.b]), q02.n(), q02.m(), q02.h.a);
                return 3;
            }
            if (m02.c()) {
                this.d(m02, k9);
                if (!bl3 || this.u()) {
                    if (m02 == this.a) {
                        bl = true;
                    }
                    this.E(bl);
                }
                return 1;
            }
            return 0;
        }
        return 1;
    }

    private void P(M0 m02, long l8) {
        m02.q();
        if (m02 instanceof i) {
            ((i)m02).y0(l8);
        }
    }

    private void Z(boolean bl) throws s {
        if (bl) {
            ax.S0.a.e(this.c).B(17, this.a);
            return;
        }
        this.a.B(17, ax.S0.a.e(this.c));
    }

    private void d(M0 m02, k k8) {
        boolean bl = this.a == m02 || this.c == m02;
        ax.S0.a.g(bl);
        if (!O0.z(m02)) {
            return;
        }
        k8.a(m02);
        this.g(m02);
        m02.f();
    }

    private void g(M0 m02) {
        if (m02.getState() == 2) {
            m02.stop();
        }
    }

    private static v[] i(D d8) {
        int n8 = d8 != null ? d8.length() : 0;
        v[] vArray = new v[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            vArray[i8] = ax.S0.a.e(d8).h(i8);
        }
        return vArray;
    }

    private M0 l(q0 q02) {
        if (q02 != null && q02.c[this.b] != null) {
            if (this.a.j() == q02.c[this.b]) {
                return this.a;
            }
            M0 m02 = this.c;
            if (m02 != null && m02.j() == q02.c[this.b]) {
                return this.c;
            }
        }
        return null;
    }

    private boolean p(q0 q02, M0 m02) {
        if (m02 == null) {
            return true;
        }
        e0 e02 = q02.c[this.b];
        if (m02.j() != null && (m02.j() != e02 || e02 != null && !m02.n() && !this.q(m02, q02))) {
            return (q02 = q02.k()) != null && q02.c[this.b] == m02.j();
        }
        return true;
    }

    private boolean q(M0 m02, q0 q02) {
        q0 q03 = q02.k();
        return q02.h.g && q03 != null && q03.f && (m02 instanceof i || m02 instanceof c || m02.D() >= q03.n());
    }

    private boolean w() {
        int n8 = this.d;
        return n8 == 2 || n8 == 4;
        {
        }
    }

    private static boolean z(M0 m02) {
        return m02.getState() != 0;
    }

    public void B(e0 e02, k k8, long l8, boolean bl) throws s {
        this.C(this.a, e02, k8, l8, bl);
        M0 m02 = this.c;
        if (m02 != null) {
            this.C(m02, e02, k8, l8, bl);
        }
    }

    public void D() throws s {
        int n8 = this.d;
        int n9 = 0;
        if (n8 != 3 && n8 != 4) {
            if (n8 == 2) {
                this.d = 0;
            }
            return;
        }
        boolean bl = n8 == 4;
        this.Z(bl);
        if (this.d != 4) {
            n9 = 1;
        }
        this.d = n9;
    }

    public void F(K object, K object2, long l8) {
        int n8;
        boolean bl = object.c(this.b);
        boolean bl2 = ((K)object2).c(this.b);
        M0 m02 = !(this.c == null || (n8 = this.d) == 3 || n8 == 0 && O0.z(this.a)) ? ax.S0.a.e(this.c) : this.a;
        if (bl && !m02.G()) {
            n8 = this.m() == -2 ? 1 : 0;
            object = object.b;
            int n9 = this.b;
            object = object[n9];
            object2 = ((K)object2).b[n9];
            if (!bl2 || !j.Objects.equals((Object)object2, (Object)object) || n8 != 0 || this.u()) {
                this.P(m02, l8);
            }
        }
    }

    public void G(q0 q02) throws IOException {
        ax.S0.a.e(this.l(q02)).C();
    }

    public void H() {
        this.a.d();
        this.e = false;
        M0 m02 = this.c;
        if (m02 != null) {
            m02.d();
            this.f = false;
        }
    }

    public void I(long l8, long l9) throws s {
        M0 m02;
        if (O0.z(this.a)) {
            this.a.i(l8, l9);
        }
        if ((m02 = this.c) != null && O0.z(m02)) {
            this.c.i(l8, l9);
        }
    }

    public int J(q0 q02, K k8, k k9) throws s {
        int n8 = this.K(this.a, q02, k8, k9);
        int n9 = this.K(this.c, q02, k8, k9);
        if (n8 == 1) {
            return n9;
        }
        return n8;
    }

    public void L() {
        M0 m02;
        if (!O0.z(this.a)) {
            this.E(true);
        }
        if ((m02 = this.c) != null && !O0.z(m02)) {
            this.E(false);
        }
    }

    public void M(q0 object, long l8) throws s {
        if ((object = this.l((q0)object)) != null) {
            object.F(l8);
        }
    }

    public void N(long l8) {
        M0 m02;
        int n8;
        if (O0.z(this.a) && (n8 = this.d) != 4 && n8 != 2) {
            this.P(this.a, l8);
        }
        if ((m02 = this.c) != null && O0.z(m02) && this.d != 3) {
            this.P(this.c, l8);
        }
    }

    public void O(q0 q02, long l8) {
        this.P(ax.S0.a.e(this.l(q02)), l8);
    }

    public void Q(float f8, float f9) throws s {
        this.a.x(f8, f9);
        M0 m02 = this.c;
        if (m02 != null) {
            m02.x(f8, f9);
        }
    }

    public void R(Y y8) throws s {
        this.a.B(18, y8);
        M0 m02 = this.c;
        if (m02 != null) {
            m02.B(18, y8);
        }
    }

    public void S(N n8) {
        this.a.r(n8);
        M0 m02 = this.c;
        if (m02 != null) {
            m02.r(n8);
        }
    }

    public void T(z z8) throws s {
        if (this.m() == 2) {
            this.a.B(7, z8);
            M0 m02 = this.c;
            if (m02 != null) {
                m02.B(7, z8);
            }
        }
    }

    public void U(Object object) throws s {
        if (this.m() != 2) {
            return;
        }
        int n8 = this.d;
        if (n8 != 4 && n8 != 1) {
            this.a.B(1, object);
            return;
        }
        ax.S0.a.e(this.c).B(1, object);
    }

    public void V(float f8) throws s {
        if (this.m() == 1) {
            this.a.B(2, Float.valueOf(f8));
            M0 m02 = this.c;
            if (m02 != null) {
                m02.B(2, Float.valueOf(f8));
            }
        }
    }

    public void W() throws s {
        if (this.a.getState() == 1 && this.d != 4) {
            this.a.start();
            return;
        }
        M0 m02 = this.c;
        if (m02 != null && m02.getState() == 1 && this.d != 3) {
            this.c.start();
        }
    }

    public void X() {
        M0 m02;
        ax.S0.a.g(this.u() ^ true);
        int n8 = O0.z(this.a) ? 3 : ((m02 = this.c) != null && O0.z(m02) ? 4 : 2);
        this.d = n8;
    }

    public void Y() {
        M0 m02;
        if (O0.z(this.a)) {
            this.g(this.a);
        }
        if ((m02 = this.c) != null && O0.z(m02)) {
            this.g(this.c);
        }
    }

    public boolean a(q0 object) {
        return (object = this.l((q0)object)) == null || object.n() || object.isReady() || object.c();
        {
        }
    }

    public void b(k k8) throws s {
        this.d(this.a, k8);
        M0 m02 = this.c;
        if (m02 != null) {
            boolean bl = O0.z(m02) && this.d != 3;
            this.d(this.c, k8);
            this.E(false);
            if (bl) {
                this.Z(true);
            }
        }
        this.d = 0;
    }

    public void c(k k8) {
        if (!this.u()) {
            return;
        }
        int n8 = this.d;
        int n9 = 1;
        boolean bl = n8 == 4 || n8 == 2;
        if (n8 != 4) {
            n9 = 0;
        }
        M0 m02 = bl ? this.a : ax.S0.a.e(this.c);
        this.d(m02, k8);
        this.E(bl);
        this.d = n9;
    }

    public void e(W w8, D vArray, e0 e02, long l8, boolean bl, boolean bl2, long l9, long l10, F.b b8, k k8) throws s {
        vArray = O0.i((D)vArray);
        int n8 = this.d;
        if (n8 != 0 && n8 != 2 && n8 != 4) {
            this.f = true;
            ax.S0.a.e(this.c).s(w8, vArray, e02, l8, bl, bl2, l9, l10, b8);
            k8.b(this.c);
            return;
        }
        this.e = true;
        this.a.s(w8, vArray, e02, l8, bl, bl2, l9, l10, b8);
        k8.b(this.a);
    }

    public void f() {
        if (O0.z(this.a)) {
            this.a.p();
            return;
        }
        M0 m02 = this.c;
        if (m02 != null && O0.z(m02)) {
            this.c.p();
        }
    }

    public int h() {
        int n8 = O0.z(this.a);
        M0 m02 = this.c;
        int n9 = m02 != null && O0.z(m02) ? 1 : 0;
        return n8 + n9;
    }

    public long j(long l8, long l9) {
        long l10 = O0.z(this.a) ? this.a.o(l8, l9) : Long.MAX_VALUE;
        M0 m02 = this.c;
        if (m02 != null && O0.z(m02)) {
            return Math.min(l10, this.c.o(l8, l9));
        }
        return l10;
    }

    public long k(q0 object) {
        object = this.l((q0)object);
        j.Objects.requireNonNull((Object)object);
        return ((M0)object).D();
    }

    public int m() {
        return this.a.k();
    }

    public void n(int n8, Object object, q0 q02) throws s {
        ax.S0.a.e(this.l(q02)).B(n8, object);
    }

    public boolean o(q0 q02) {
        return this.p(q02, this.a) && this.p(q02, this.c);
    }

    public boolean r(q0 q02) {
        return ax.S0.a.e(this.l(q02)).n();
    }

    public boolean s() {
        return this.c != null;
    }

    public boolean t() {
        boolean bl = O0.z(this.a) ? this.a.c() : true;
        M0 m02 = this.c;
        boolean bl2 = bl;
        if (m02 != null) {
            bl2 = bl;
            if (O0.z(m02)) {
                bl2 = bl & this.c.c();
            }
        }
        return bl2;
    }

    public boolean u() {
        return this.w() || this.A();
        {
        }
    }

    public boolean v(q0 q02) {
        boolean bl = this.w() && this.l(q02) == this.a;
        boolean bl2 = this.A() && this.l(q02) == this.c;
        return bl || bl2;
        {
        }
    }

    public boolean x(q0 q02) {
        return this.l(q02) != null;
    }

    public boolean y() {
        int n8 = this.d;
        if (n8 != 0 && n8 != 2 && n8 != 4) {
            return O0.z(ax.S0.a.e(this.c));
        }
        return O0.z(this.a);
    }
}

