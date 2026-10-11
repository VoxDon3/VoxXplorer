package androidx.media3.exoplayer;

import android.os.SystemClock;
import ax.i1.InterfaceC2209F;
import ax.r7.AbstractC2991z;
import java.util.List;

/* loaded from: classes.dex */
final class J0 {
    private static final InterfaceC2209F.b u = new InterfaceC2209F.b(new Object());
    public final ax.P0.N a;
    public final InterfaceC2209F.b b;
    public final long c;
    public final long d;
    public final int e;
    public final C0622s f;
    public final boolean g;
    public final ax.i1.q0 h;
    public final ax.l1.K i;
    public final List<ax.P0.C> j;
    public final InterfaceC2209F.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final ax.P0.G o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public J0(ax.P0.N n, InterfaceC2209F.b bVar, long j, long j2, int i, C0622s c0622s, boolean z, ax.i1.q0 q0Var, ax.l1.K k, List<ax.P0.C> list, InterfaceC2209F.b bVar2, boolean z2, int i2, int i3, ax.P0.G g, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = n;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = c0622s;
        this.g = z;
        this.h = q0Var;
        this.i = k;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = g;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static J0 k(ax.l1.K k) {
        ax.P0.N n = ax.P0.N.a;
        InterfaceC2209F.b bVar = u;
        return new J0(n, bVar, -9223372036854775807L, 0L, 1, null, false, ax.i1.q0.d, k, AbstractC2991z.z(), bVar, false, 1, 0, ax.P0.G.d, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC2209F.b l() {
        return u;
    }

    public J0 a() {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, m(), SystemClock.elapsedRealtime(), this.p);
    }

    public J0 b(boolean z) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 c(InterfaceC2209F.b bVar) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 d(InterfaceC2209F.b bVar, long j, long j2, long j3, long j4, ax.i1.q0 q0Var, ax.l1.K k, List<ax.P0.C> list) {
        return new J0(this.a, bVar, j2, j3, this.e, this.f, this.g, q0Var, k, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public J0 e(boolean z, int i, int i2) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 f(C0622s c0622s) {
        return new J0(this.a, this.b, this.c, this.d, this.e, c0622s, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 g(ax.P0.G g) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, g, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 h(int i) {
        return new J0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 i(boolean z) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public J0 j(ax.P0.N n) {
        return new J0(n, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public long m() {
        long j;
        long j2;
        if (!n()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return ax.S0.d0.a1(ax.S0.d0.E1(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public boolean n() {
        return this.e == 3 && this.l && this.n == 0;
    }

    public void o(long j) {
        this.s = j;
        this.t = SystemClock.elapsedRealtime();
    }
}
