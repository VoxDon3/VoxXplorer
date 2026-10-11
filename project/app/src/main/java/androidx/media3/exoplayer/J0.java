/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.exoplayer.s;
import ax.P0.C;
import ax.P0.G;
import ax.P0.N;
import ax.S0.d0;
import ax.i1.F;
import ax.i1.q0;
import ax.l1.K;
import ax.r7.z;
import java.util.List;

final class J0 {
    private static final F.b u = new F.b(new Object());
    public final N a;
    public final F.b b;
    public final long c;
    public final long d;
    public final int e;
    public final s f;
    public final boolean g;
    public final q0 h;
    public final K i;
    public final List<C> j;
    public final F.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final G o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public J0(N n8, F.b b8, long l8, long l9, int n9, s s8, boolean bl, q0 q02, K k8, List<C> list, F.b b9, boolean bl2, int n10, int n11, G g8, long l10, long l11, long l12, long l13, boolean bl3) {
        this.a = n8;
        this.b = b8;
        this.c = l8;
        this.d = l9;
        this.e = n9;
        this.f = s8;
        this.g = bl;
        this.h = q02;
        this.i = k8;
        this.j = list;
        this.k = b9;
        this.l = bl2;
        this.m = n10;
        this.n = n11;
        this.o = g8;
        this.q = l10;
        this.r = l11;
        this.s = l12;
        this.t = l13;
        this.p = bl3;
    }

    public static J0 k(K k8) {
        N n8 = N.a;
        F.b b8 = u;
        return new J0(n8, b8, -9223372036854775807L, 0L, 1, null, false, q0.d, k8, z.<C>z(), b8, false, 1, 0, G.d, 0L, 0L, 0L, 0L, false);
    }

    public static F.b l() {
        return u;
    }

    public J0 a() {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.m(), SystemClock.elapsedRealtime(), this.p);
    }

    public J0 b(boolean bl) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, bl, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 c(F.b b8) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, b8, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 d(F.b b8, long l8, long l9, long l10, long l11, q0 q02, K k8, List<C> list) {
        return new J0(this.a, b8, l9, l10, this.e, this.f, this.g, q02, k8, list, this.k, this.l, this.m, this.n, this.o, this.q, l11, l8, SystemClock.elapsedRealtime(), this.p);
    }

    public J0 e(boolean bl, int n8, int n9) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, bl, n8, n9, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 f(s s8) {
        return new J0(this.a, this.b, this.c, this.d, this.e, s8, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 g(G g8) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, g8, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 h(int n8) {
        return new J0(this.a, this.b, this.c, this.d, n8, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public J0 i(boolean bl) {
        return new J0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, bl);
    }

    public J0 j(N n8) {
        return new J0(n8, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public long m() {
        long l8;
        long l9;
        if (!this.n()) {
            return this.s;
        }
        do {
            l9 = this.t;
            l8 = this.s;
        } while (l9 != this.t);
        long l10 = SystemClock.elapsedRealtime();
        return d0.a1(d0.E1(l8) + (long)((float)(l10 - l9) * this.o.a));
    }

    public boolean n() {
        return this.e == 3 && this.l && this.n == 0;
    }

    public void o(long l8) {
        this.s = l8;
        this.t = SystemClock.elapsedRealtime();
    }
}

