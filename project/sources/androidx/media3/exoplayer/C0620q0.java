package androidx.media3.exoplayer;

import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.i1.C2215e;
import ax.i1.C2228s;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.l1.AbstractC2451J;
import ax.l1.InterfaceC2445D;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0620q0 {
    public final InterfaceC2206C a;
    public final Object b;
    public final ax.i1.e0[] c;
    public final long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public C0621r0 h;
    public boolean i;
    private final boolean[] j;
    private final N0[] k;
    private final AbstractC2451J l;
    private final I0 m;
    private C0620q0 n;
    private ax.i1.q0 o;
    private ax.l1.K p;
    private long q;

    /* renamed from: androidx.media3.exoplayer.q0$a */
    interface a {
        C0620q0 a(C0621r0 c0621r0, long j);
    }

    public C0620q0(N0[] n0Arr, long j, AbstractC2451J abstractC2451J, ax.m1.b bVar, I0 i0, C0621r0 c0621r0, ax.l1.K k, long j2) {
        this.k = n0Arr;
        this.q = j;
        this.l = abstractC2451J;
        this.m = i0;
        InterfaceC2209F.b bVar2 = c0621r0.a;
        this.b = bVar2.a;
        this.h = c0621r0;
        this.d = j2;
        this.o = ax.i1.q0.d;
        this.p = k;
        this.c = new ax.i1.e0[n0Arr.length];
        this.j = new boolean[n0Arr.length];
        this.a = f(bVar2, i0, bVar, c0621r0.b, c0621r0.d, c0621r0.f);
    }

    private void c(ax.i1.e0[] e0VarArr) {
        int i = 0;
        while (true) {
            N0[] n0Arr = this.k;
            if (i >= n0Arr.length) {
                return;
            }
            if (n0Arr[i].k() == -2 && this.p.c(i)) {
                e0VarArr[i] = new C2228s();
            }
            i++;
        }
    }

    private static InterfaceC2206C f(InterfaceC2209F.b bVar, I0 i0, ax.m1.b bVar2, long j, long j2, boolean z) {
        InterfaceC2206C h = i0.h(bVar, bVar2, j);
        return j2 != -9223372036854775807L ? new C2215e(h, !z, 0L, j2) : h;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            ax.l1.K k = this.p;
            if (i >= k.a) {
                return;
            }
            boolean c = k.c(i);
            InterfaceC2445D interfaceC2445D = this.p.c[i];
            if (c && interfaceC2445D != null) {
                interfaceC2445D.f();
            }
            i++;
        }
    }

    private void h(ax.i1.e0[] e0VarArr) {
        int i = 0;
        while (true) {
            N0[] n0Arr = this.k;
            if (i >= n0Arr.length) {
                return;
            }
            if (n0Arr[i].k() == -2) {
                e0VarArr[i] = null;
            }
            i++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            ax.l1.K k = this.p;
            if (i >= k.a) {
                return;
            }
            boolean c = k.c(i);
            InterfaceC2445D interfaceC2445D = this.p.c[i];
            if (c && interfaceC2445D != null) {
                interfaceC2445D.i();
            }
            i++;
        }
    }

    private boolean u() {
        return this.n == null;
    }

    private static void y(I0 i0, InterfaceC2206C interfaceC2206C) {
        try {
            if (interfaceC2206C instanceof C2215e) {
                i0.z(((C2215e) interfaceC2206C).q);
            } else {
                i0.z(interfaceC2206C);
            }
        } catch (RuntimeException e) {
            C0987u.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void A(C0620q0 c0620q0) {
        if (c0620q0 == this.n) {
            return;
        }
        g();
        this.n = c0620q0;
        i();
    }

    public void B(long j) {
        this.q = j;
    }

    public long C(long j) {
        return j - m();
    }

    public long D(long j) {
        return j + m();
    }

    public void E() {
        InterfaceC2206C interfaceC2206C = this.a;
        if (interfaceC2206C instanceof C2215e) {
            long j = this.h.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C2215e) interfaceC2206C).x(0L, j);
        }
    }

    public long a(ax.l1.K k, long j, boolean z) {
        return b(k, j, z, new boolean[this.k.length]);
    }

    public long b(ax.l1.K k, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= k.a) {
                break;
            }
            boolean[] zArr2 = this.j;
            if (z || !k.b(this.p, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        h(this.c);
        g();
        this.p = k;
        i();
        long g = this.a.g(k.c, this.j, this.c, zArr, j);
        c(this.c);
        this.g = false;
        int i2 = 0;
        while (true) {
            ax.i1.e0[] e0VarArr = this.c;
            if (i2 >= e0VarArr.length) {
                return g;
            }
            if (e0VarArr[i2] != null) {
                C0968a.g(k.c(i2));
                if (this.k[i2].k() != -2) {
                    this.g = true;
                }
            } else {
                C0968a.g(k.c[i2] == null);
            }
            i2++;
        }
    }

    public boolean d(C0621r0 c0621r0) {
        if (!C0625t0.e(this.h.e, c0621r0.e)) {
            return false;
        }
        C0621r0 c0621r02 = this.h;
        return c0621r02.b == c0621r0.b && c0621r02.a.equals(c0621r0.a);
    }

    public void e(C0618p0 c0618p0) {
        C0968a.g(u());
        this.a.a(c0618p0);
    }

    public long j() {
        if (!this.f) {
            return this.h.b;
        }
        long d = this.g ? this.a.d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.h.e : d;
    }

    public C0620q0 k() {
        return this.n;
    }

    public long l() {
        if (this.f) {
            return this.a.b();
        }
        return 0L;
    }

    public long m() {
        return this.q;
    }

    public long n() {
        return this.h.b + this.q;
    }

    public ax.i1.q0 o() {
        return this.o;
    }

    public ax.l1.K p() {
        return this.p;
    }

    public void q(float f, ax.P0.N n, boolean z) throws C0622s {
        this.f = true;
        this.o = this.a.t();
        ax.l1.K z2 = z(f, n, z);
        C0621r0 c0621r0 = this.h;
        long j = c0621r0.b;
        long j2 = c0621r0.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = a(z2, j, false);
        long j3 = this.q;
        C0621r0 c0621r02 = this.h;
        this.q = j3 + (c0621r02.b - a2);
        this.h = c0621r02.b(a2);
    }

    public boolean r() {
        try {
            if (this.f) {
                for (ax.i1.e0 e0Var : this.c) {
                    if (e0Var != null) {
                        e0Var.b();
                    }
                }
            } else {
                this.a.l();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f) {
            return !this.g || this.a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f) {
            return s() || j() - this.h.b >= this.d;
        }
        return false;
    }

    public void v(InterfaceC2206C.a aVar, long j) {
        this.e = true;
        this.a.n(aVar, j);
    }

    public void w(long j) {
        C0968a.g(u());
        if (this.f) {
            this.a.e(C(j));
        }
    }

    public void x() {
        g();
        y(this.m, this.a);
    }

    public ax.l1.K z(float f, ax.P0.N n, boolean z) throws C0622s {
        ax.l1.K k = this.l.k(this.k, o(), this.h.a, n);
        for (int i = 0; i < k.a; i++) {
            if (k.c(i)) {
                if (k.c[i] == null && this.k[i].k() != -2) {
                    r3 = false;
                }
                C0968a.g(r3);
            } else {
                C0968a.g(k.c[i] == null);
            }
        }
        for (InterfaceC2445D interfaceC2445D : k.c) {
            if (interfaceC2445D != null) {
                interfaceC2445D.p(f);
                interfaceC2445D.g(z);
            }
        }
        return k;
    }
}
