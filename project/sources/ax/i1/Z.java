package ax.i1;

import android.net.Uri;
import android.os.Looper;
import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.N;
import ax.S0.C0968a;
import ax.U0.g;
import ax.Z0.I1;
import ax.b1.C1463l;
import ax.b1.InterfaceC1471u;
import ax.i1.InterfaceC2209F;
import ax.i1.N;
import ax.i1.T;
import ax.i1.Y;
import ax.i1.Z;
import ax.m1.f;
import ax.n1.InterfaceExecutorC2572c;
import ax.q1.C2854n;
import ax.q1.InterfaceC2863x;

/* loaded from: classes.dex */
public final class Z extends AbstractC2211a implements Y.c {
    private final g.a h;
    private final T.a i;
    private final ax.b1.w j;
    private final ax.m1.m k;
    private final int l;
    private final int m;
    private final C0912v n;
    private final ax.q7.u<InterfaceExecutorC2572c> o;
    private boolean p;
    private long q;
    private boolean r;
    private boolean s;
    private ax.U0.z t;
    private C0915y u;

    class a extends AbstractC2232w {
        a(ax.P0.N n) {
            super(n);
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            super.g(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.c o(int i, N.c cVar, long j) {
            super.o(i, cVar, j);
            cVar.k = true;
            return cVar;
        }
    }

    public static final class b implements O {
        private final g.a a;
        private T.a b;
        private ax.b1.z c;
        private ax.m1.m d;
        private int e;
        private ax.q7.u<InterfaceExecutorC2572c> f;
        private int g;
        private C0912v h;

        public b(g.a aVar) {
            this(aVar, new C2854n());
        }

        public static /* synthetic */ T h(InterfaceC2863x interfaceC2863x, I1 i1) {
            return new C2214d(interfaceC2863x);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a a(t.a aVar) {
            return C2208E.d(this, aVar);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a b(int i) {
            return C2208E.b(this, i);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a c(boolean z) {
            return C2208E.a(this, z);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a d(f.a aVar) {
            return C2208E.c(this, aVar);
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Z e(C0915y c0915y) {
            C0968a.e(c0915y.b);
            return new Z(c0915y, this.a, this.b, this.c.a(c0915y), this.d, this.e, this.g, this.h, this.f, null);
        }

        b j(int i, C0912v c0912v) {
            this.g = i;
            this.h = (C0912v) C0968a.e(c0912v);
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b f(ax.b1.z zVar) {
            this.c = (ax.b1.z) C0968a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b g(ax.m1.m mVar) {
            this.d = (ax.m1.m) C0968a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(g.a aVar, final InterfaceC2863x interfaceC2863x) {
            this(aVar, new T.a() { // from class: ax.i1.a0
                @Override // ax.i1.T.a
                public final T a(I1 i1) {
                    return Z.b.h(InterfaceC2863x.this, i1);
                }
            });
        }

        public b(g.a aVar, T.a aVar2) {
            this(aVar, aVar2, new C1463l(), new ax.m1.k(), 1048576);
        }

        public b(g.a aVar, T.a aVar2, ax.b1.z zVar, ax.m1.m mVar, int i) {
            this.a = aVar;
            this.b = aVar2;
            this.c = zVar;
            this.d = mVar;
            this.e = i;
        }
    }

    /* synthetic */ Z(C0915y c0915y, g.a aVar, T.a aVar2, ax.b1.w wVar, ax.m1.m mVar, int i, int i2, C0912v c0912v, ax.q7.u uVar, a aVar3) {
        this(c0915y, aVar, aVar2, wVar, mVar, i, i2, c0912v, uVar);
    }

    private C0915y.h D() {
        return (C0915y.h) C0968a.e(j().b);
    }

    private void E() {
        ax.P0.N h0Var = new h0(this.q, this.r, false, this.s, null, j());
        if (this.p) {
            h0Var = new a(h0Var);
        }
        B(h0Var);
    }

    @Override // ax.i1.AbstractC2211a
    protected void A(ax.U0.z zVar) {
        this.t = zVar;
        this.j.c((Looper) C0968a.e(Looper.myLooper()), x());
        this.j.k();
        E();
    }

    @Override // ax.i1.AbstractC2211a
    protected void C() {
        this.j.d();
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public synchronized void a(C0915y c0915y) {
        this.u = c0915y;
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        ((Y) interfaceC2206C).f0();
    }

    @Override // ax.i1.Y.c
    public void h(long j, ax.q1.N n, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.q;
        }
        boolean i = n.i();
        if (!this.p && this.q == j && this.r == i && this.s == z) {
            return;
        }
        this.q = j;
        this.r = i;
        this.s = z;
        this.p = false;
        E();
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        ax.U0.g a2 = this.h.a();
        ax.U0.z zVar = this.t;
        if (zVar != null) {
            a2.d(zVar);
        }
        C0915y.h D = D();
        Uri uri = D.a;
        T a3 = this.i.a(x());
        ax.b1.w wVar = this.j;
        InterfaceC1471u.a s = s(bVar);
        ax.m1.m mVar = this.k;
        N.a u = u(bVar);
        String str = D.e;
        int i = this.l;
        int i2 = this.m;
        C0912v c0912v = this.n;
        long a1 = ax.S0.d0.a1(D.i);
        ax.q7.u<InterfaceExecutorC2572c> uVar = this.o;
        return new Y(uri, a2, a3, wVar, s, mVar, u, this, bVar2, str, i, i2, c0912v, a1, uVar != null ? uVar.get() : null);
    }

    @Override // ax.i1.InterfaceC2209F
    public synchronized C0915y j() {
        return this.u;
    }

    private Z(C0915y c0915y, g.a aVar, T.a aVar2, ax.b1.w wVar, ax.m1.m mVar, int i, int i2, C0912v c0912v, ax.q7.u<InterfaceExecutorC2572c> uVar) {
        this.u = c0915y;
        this.h = aVar;
        this.i = aVar2;
        this.j = wVar;
        this.k = mVar;
        this.l = i;
        this.n = c0912v;
        this.m = i2;
        this.p = true;
        this.q = -9223372036854775807L;
        this.o = uVar;
    }

    @Override // ax.i1.InterfaceC2209F
    public void k() {
    }
}
