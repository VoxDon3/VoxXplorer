package ax.i1;

import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.InterfaceC0902k;
import ax.S0.C0968a;
import ax.S0.InterfaceC0979l;
import ax.b1.InterfaceC1465n;
import ax.b1.InterfaceC1471u;
import ax.b1.w;
import ax.i1.d0;
import ax.q1.U;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes.dex */
public class d0 implements ax.q1.U {
    private C0912v A;
    private C0912v B;
    private long C;
    private boolean E;
    private long F;
    private boolean G;
    private final b0 a;
    private final ax.b1.w d;
    private final InterfaceC1471u.a e;
    private d f;
    private C0912v g;
    private InterfaceC1465n h;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean w;
    private boolean z;
    private final b b = new b();
    private int i = 1000;
    private long[] j = new long[1000];
    private long[] k = new long[1000];
    private long[] n = new long[1000];
    private int[] m = new int[1000];
    private int[] l = new int[1000];
    private U.a[] o = new U.a[1000];
    private final k0<c> c = new k0<>(new InterfaceC0979l() { // from class: ax.i1.c0
        @Override // ax.S0.InterfaceC0979l
        public final void accept(Object obj) {
            ((d0.c) obj).b.d();
        }
    });
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private boolean y = true;
    private boolean x = true;
    private boolean D = true;

    static final class b {
        public int a;
        public long b;
        public U.a c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        public final C0912v a;
        public final w.b b;

        private c(C0912v c0912v, w.b bVar) {
            this.a = c0912v;
            this.b = bVar;
        }
    }

    public interface d {
        void i(C0912v c0912v);
    }

    protected d0(ax.m1.b bVar, ax.b1.w wVar, InterfaceC1471u.a aVar) {
        this.d = wVar;
        this.e = aVar;
        this.a = new b0(bVar);
    }

    private int B(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private boolean F() {
        return this.s != this.p;
    }

    private boolean J(int i) {
        InterfaceC1465n interfaceC1465n = this.h;
        if (interfaceC1465n == null || interfaceC1465n.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.d();
    }

    private void L(C0912v c0912v, ax.Y0.O o) {
        C0912v c0912v2 = this.g;
        boolean z = c0912v2 == null;
        C0906o c0906o = c0912v2 == null ? null : c0912v2.s;
        this.g = c0912v;
        C0906o c0906o2 = c0912v.s;
        ax.b1.w wVar = this.d;
        o.b = wVar != null ? c0912v.c(wVar.a(c0912v)) : c0912v;
        o.a = this.h;
        if (this.d == null) {
            return;
        }
        if (z || !Objects.equals(c0906o, c0906o2)) {
            InterfaceC1465n interfaceC1465n = this.h;
            InterfaceC1465n b2 = this.d.b(this.e, c0912v);
            this.h = b2;
            o.a = b2;
            if (interfaceC1465n != null) {
                interfaceC1465n.a(this.e);
            }
        }
    }

    private synchronized int M(ax.Y0.O o, ax.V0.i iVar, boolean z, boolean z2, b bVar) {
        try {
            iVar.f0 = false;
            if (!F()) {
                if (!z2 && !this.w) {
                    C0912v c0912v = this.B;
                    if (c0912v == null || (!z && c0912v == this.g)) {
                        return -3;
                    }
                    L((C0912v) C0968a.e(c0912v), o);
                    return -5;
                }
                iVar.A(4);
                iVar.g0 = Long.MIN_VALUE;
                return -4;
            }
            C0912v c0912v2 = this.c.e(A()).a;
            if (!z && c0912v2 == this.g) {
                int B = B(this.s);
                if (!J(B)) {
                    iVar.f0 = true;
                    return -3;
                }
                iVar.A(this.m[B]);
                if (this.s == this.p - 1 && (z2 || this.w)) {
                    iVar.n(536870912);
                }
                iVar.g0 = this.n[B];
                bVar.a = this.l[B];
                bVar.b = this.k[B];
                bVar.c = this.o[B];
                return -4;
            }
            L(c0912v2, o);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void R() {
        InterfaceC1465n interfaceC1465n = this.h;
        if (interfaceC1465n != null) {
            interfaceC1465n.a(this.e);
            this.h = null;
            this.g = null;
        }
    }

    private synchronized void U() {
        this.s = 0;
        this.a.o();
    }

    private synchronized boolean Z(C0912v c0912v) {
        try {
            this.y = false;
            if (Objects.equals(c0912v, this.B)) {
                return false;
            }
            if (this.c.g() || !this.c.f().a.equals(c0912v)) {
                this.B = c0912v;
            } else {
                this.B = this.c.f().a;
            }
            boolean z = this.D;
            C0912v c0912v2 = this.B;
            this.D = z & ax.P0.D.a(c0912v2.o, c0912v2.k);
            this.E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean i(long j) {
        if (this.p == 0) {
            return j > this.u;
        }
        if (y() >= j) {
            return false;
        }
        r(this.q + k(j));
        return true;
    }

    private synchronized void j(long j, int i, long j2, int i2, U.a aVar) {
        try {
            int i3 = this.p;
            if (i3 > 0) {
                int B = B(i3 - 1);
                C0968a.a(this.k[B] + ((long) this.l[B]) <= j2);
            }
            this.w = (536870912 & i) != 0;
            this.v = Math.max(this.v, j);
            int B2 = B(this.p);
            this.n[B2] = j;
            this.k[B2] = j2;
            this.l[B2] = i2;
            this.m[B2] = i;
            this.o[B2] = aVar;
            this.j[B2] = this.C;
            if (this.c.g() || !this.c.f().a.equals(this.B)) {
                C0912v c0912v = (C0912v) C0968a.e(this.B);
                ax.b1.w wVar = this.d;
                this.c.a(E(), new c(c0912v, wVar != null ? wVar.e(this.e, c0912v) : w.b.a));
            }
            int i4 = this.p + 1;
            this.p = i4;
            int i5 = this.i;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                U.a[] aVarArr = new U.a[i6];
                int i7 = this.r;
                int i8 = i5 - i7;
                System.arraycopy(this.k, i7, jArr2, 0, i8);
                System.arraycopy(this.n, this.r, jArr3, 0, i8);
                System.arraycopy(this.m, this.r, iArr, 0, i8);
                System.arraycopy(this.l, this.r, iArr2, 0, i8);
                System.arraycopy(this.o, this.r, aVarArr, 0, i8);
                System.arraycopy(this.j, this.r, jArr, 0, i8);
                int i9 = this.r;
                System.arraycopy(this.k, 0, jArr2, i8, i9);
                System.arraycopy(this.n, 0, jArr3, i8, i9);
                System.arraycopy(this.m, 0, iArr, i8, i9);
                System.arraycopy(this.l, 0, iArr2, i8, i9);
                System.arraycopy(this.o, 0, aVarArr, i8, i9);
                System.arraycopy(this.j, 0, jArr, i8, i9);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = aVarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int k(long j) {
        int i = this.p;
        int B = B(i - 1);
        while (i > this.s && this.n[B] >= j) {
            i--;
            B--;
            if (B == -1) {
                B = this.i - 1;
            }
        }
        return i;
    }

    public static d0 l(ax.m1.b bVar, ax.b1.w wVar, InterfaceC1471u.a aVar) {
        return new d0(bVar, (ax.b1.w) C0968a.e(wVar), (InterfaceC1471u.a) C0968a.e(aVar));
    }

    private synchronized long m(long j, boolean z, boolean z2) {
        Throwable th;
        try {
            try {
                int i = this.p;
                if (i != 0) {
                    long[] jArr = this.n;
                    int i2 = this.r;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.s;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int u = u(i2, i, j, z);
                        if (u == -1) {
                            return -1L;
                        }
                        return o(u);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized long n() {
        int i = this.p;
        if (i == 0) {
            return -1L;
        }
        return o(i);
    }

    private long o(int i) {
        this.u = Math.max(this.u, z(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        if (i5 < 0) {
            this.s = 0;
        }
        this.c.d(i2);
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i6 = this.r;
        if (i6 == 0) {
            i6 = this.i;
        }
        return this.k[i6 - 1] + this.l[r6];
    }

    private long r(int i) {
        int E = E() - i;
        boolean z = false;
        C0968a.a(E >= 0 && E <= this.p - this.s);
        int i2 = this.p - E;
        this.p = i2;
        this.v = Math.max(this.u, z(i2));
        if (E == 0 && this.w) {
            z = true;
        }
        this.w = z;
        this.c.c(i);
        int i3 = this.p;
        if (i3 == 0) {
            return 0L;
        }
        return this.k[B(i3 - 1)] + this.l[r9];
    }

    private int t(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    private int u(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    private long z(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int B = B(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[B]);
            if ((this.m[B] & 1) != 0) {
                return j;
            }
            B--;
            if (B == -1) {
                B = this.i - 1;
            }
        }
        return j;
    }

    public final int A() {
        return this.q + this.s;
    }

    public final synchronized int C(long j, boolean z) {
        Throwable th;
        try {
            try {
                int B = B(this.s);
                if (!F() || j < this.n[B]) {
                    return 0;
                }
                if (j <= this.v || !z) {
                    int u = u(B, this.p - this.s, j, true);
                    if (u == -1) {
                        return 0;
                    }
                    return u;
                }
                try {
                    return this.p - this.s;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized C0912v D() {
        return this.y ? null : this.B;
    }

    public final int E() {
        return this.q + this.p;
    }

    protected final void G() {
        this.z = true;
    }

    public final synchronized boolean H() {
        return this.w;
    }

    public synchronized boolean I(boolean z) {
        C0912v c0912v;
        boolean z2 = true;
        if (F()) {
            if (this.c.e(A()).a != this.g) {
                return true;
            }
            return J(B(this.s));
        }
        if (!z && !this.w && ((c0912v = this.B) == null || c0912v == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public void K() throws IOException {
        InterfaceC1465n interfaceC1465n = this.h;
        if (interfaceC1465n != null && interfaceC1465n.getState() == 1) {
            throw ((InterfaceC1465n.a) C0968a.e(this.h.g()));
        }
    }

    public final synchronized long N() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return F() ? this.j[B(this.s)] : this.C;
    }

    public void O() {
        q();
        R();
    }

    public int P(ax.Y0.O o, ax.V0.i iVar, int i, boolean z) {
        int M = M(o, iVar, (i & 2) != 0, z, this.b);
        if (M == -4 && !iVar.s()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.a.f(iVar, this.b);
                } else {
                    this.a.m(iVar, this.b);
                }
            }
            if (!z2) {
                this.s++;
            }
        }
        return M;
    }

    public void Q() {
        T(true);
        R();
    }

    public final void S() {
        T(false);
    }

    public void T(boolean z) {
        this.a.n();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.b();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean V(int i) {
        U();
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean W(long j, boolean z) {
        d0 d0Var;
        long j2;
        int u;
        try {
            try {
                U();
                int B = B(this.s);
                if (!F() || j < this.n[B] || (j > this.v && !z)) {
                    return false;
                }
                if (this.D) {
                    d0Var = this;
                    j2 = j;
                    u = d0Var.t(B, this.p - this.s, j2, z);
                } else {
                    d0Var = this;
                    j2 = j;
                    u = d0Var.u(B, d0Var.p - d0Var.s, j2, true);
                }
                if (u == -1) {
                    return false;
                }
                d0Var.t = j2;
                d0Var.s += u;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void X(long j) {
        if (this.F != j) {
            this.F = j;
            G();
        }
    }

    public final void Y(long j) {
        this.t = j;
    }

    @Override // ax.q1.U
    public /* synthetic */ int a(InterfaceC0902k interfaceC0902k, int i, boolean z) {
        return ax.q1.T.b(this, interfaceC0902k, i, z);
    }

    public final void a0(d dVar) {
        this.f = dVar;
    }

    @Override // ax.q1.U
    public final void b(ax.S0.G g, int i, int i2) {
        this.a.q(g, i);
    }

    public final synchronized void b0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    C0968a.a(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C0968a.a(z);
        this.s += i;
    }

    @Override // ax.q1.U
    public final int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException {
        return this.a.p(interfaceC0902k, i, z);
    }

    public final void c0(long j) {
        this.C = j;
    }

    @Override // ax.q1.U
    public /* synthetic */ void d(long j) {
        ax.q1.T.a(this, j);
    }

    public final void d0() {
        this.G = true;
    }

    @Override // ax.q1.U
    public final void e(C0912v c0912v) {
        C0912v v = v(c0912v);
        this.z = false;
        this.A = c0912v;
        boolean Z = Z(v);
        d dVar = this.f;
        if (dVar == null || !Z) {
            return;
        }
        dVar.i(v);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // ax.q1.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r13, int r15, int r16, int r17, ax.q1.U.a r18) {
        /*
            r12 = this;
            boolean r1 = r12.z
            if (r1 == 0) goto Lf
            ax.P0.v r1 = r12.A
            java.lang.Object r1 = ax.S0.C0968a.i(r1)
            ax.P0.v r1 = (ax.P0.C0912v) r1
            r12.e(r1)
        Lf:
            r1 = r15 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r5 = r12.x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r12.x = r2
        L21:
            long r5 = r12.F
            long r5 = r5 + r13
            boolean r7 = r12.D
            if (r7 == 0) goto L53
            long r7 = r12.t
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r12.E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            ax.P0.v r7 = r12.B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            ax.S0.C0987u.h(r7, r1)
            r12.E = r3
        L4f:
            r1 = r15 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r15
        L54:
            boolean r1 = r12.G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r12.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r12.G = r2
            goto L65
        L64:
            return
        L65:
            ax.i1.b0 r1 = r12.a
            long r1 = r1.e()
            r4 = r16
            long r7 = (long) r4
            long r1 = r1 - r7
            r7 = r17
            long r7 = (long) r7
            long r1 = r1 - r7
            r10 = r5
            r6 = r4
            r4 = r1
            r1 = r10
            r0 = r12
            r7 = r18
            r0.j(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i1.d0.f(long, int, int, int, ax.q1.U$a):void");
    }

    @Override // ax.q1.U
    public /* synthetic */ void g(ax.S0.G g, int i) {
        ax.q1.T.c(this, g, i);
    }

    public final void p(long j, boolean z, boolean z2) {
        this.a.b(m(j, z, z2));
    }

    public final void q() {
        this.a.b(n());
    }

    public final void s(int i) {
        this.a.c(r(i));
    }

    protected C0912v v(C0912v c0912v) {
        return (this.F == 0 || c0912v.t == Long.MAX_VALUE) ? c0912v : c0912v.b().C0(c0912v.t + this.F).P();
    }

    public final int w() {
        return this.q;
    }

    public final synchronized long x() {
        return this.v;
    }

    public final synchronized long y() {
        return Math.max(this.u, z(this.s));
    }
}
