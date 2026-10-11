package androidx.media3.exoplayer.hls;

import android.os.Looper;
import ax.N1.t;
import ax.P0.C0915y;
import ax.P0.C0916z;
import ax.P0.L;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.z;
import ax.b1.C1463l;
import ax.b1.w;
import ax.c1.C1805b;
import ax.d1.C1879a;
import ax.d1.C1881c;
import ax.d1.f;
import ax.d1.m;
import ax.i1.AbstractC2211a;
import ax.i1.C2221k;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.i1.InterfaceC2220j;
import ax.i1.N;
import ax.i1.O;
import ax.i1.h0;
import ax.m1.f;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC2211a implements m.e {
    private final ax.c1.e h;
    private final ax.c1.d i;
    private final InterfaceC2220j j;
    private final w k;
    private final ax.m1.m l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final m p;
    private final long q;
    private final long r;
    private C0915y.g s;
    private z t;
    private C0915y u;

    public static final class Factory implements O {
        private final ax.c1.d a;
        private ax.c1.e b;
        private t.a c;
        private boolean d;
        private int e;
        private ax.d1.l f;
        private m.a g;
        private InterfaceC2220j h;
        private f.a i;
        private ax.b1.z j;
        private ax.m1.m k;
        private boolean l;
        private int m;
        private boolean n;
        private long o;
        private long p;

        public Factory(g.a aVar) {
            this(new C1805b(aVar));
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource e(C0915y c0915y) {
            C0968a.e(c0915y.b);
            if (this.b == null) {
                this.b = new ax.c1.c();
            }
            t.a aVar = this.c;
            if (aVar != null) {
                this.b.a(aVar);
            }
            this.b.c(this.d);
            this.b.b(this.e);
            ax.c1.e eVar = this.b;
            ax.d1.l lVar = this.f;
            List<L> list = c0915y.b.d;
            if (!list.isEmpty()) {
                lVar = new ax.d1.e(lVar, list);
            }
            f.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.a(c0915y);
            }
            ax.c1.d dVar = this.a;
            InterfaceC2220j interfaceC2220j = this.h;
            w a = this.j.a(c0915y);
            ax.m1.m mVar = this.k;
            return new HlsMediaSource(c0915y, dVar, eVar, interfaceC2220j, null, a, mVar, this.g.a(this.a, mVar, lVar, null), this.o, this.l, this.m, this.n, this.p);
        }

        @Override // ax.i1.InterfaceC2209F.a
        @Deprecated
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(boolean z) {
            this.d = z;
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory b(int i) {
            this.e = i;
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(f.a aVar) {
            this.i = (f.a) C0968a.e(aVar);
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory f(ax.b1.z zVar) {
            this.j = (ax.b1.z) C0968a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory g(ax.m1.m mVar) {
            this.k = (ax.m1.m) C0968a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory a(t.a aVar) {
            this.c = aVar;
            return this;
        }

        public Factory(ax.c1.d dVar) {
            this.a = (ax.c1.d) C0968a.e(dVar);
            this.j = new C1463l();
            this.f = new C1879a();
            this.g = C1881c.q0;
            this.k = new ax.m1.k();
            this.h = new C2221k();
            this.m = 1;
            this.o = -9223372036854775807L;
            this.l = true;
            c(true);
        }
    }

    static {
        C0916z.a("media3.exoplayer.hls");
    }

    private h0 D(ax.d1.f fVar, long j, long j2, d dVar) {
        long e = fVar.h - this.p.e();
        long j3 = fVar.o ? e + fVar.u : -9223372036854775807L;
        long H = H(fVar);
        long j4 = this.s.a;
        K(fVar, d0.q(j4 != -9223372036854775807L ? d0.a1(j4) : J(fVar, H), H, fVar.u + H));
        return new h0(j, j2, -9223372036854775807L, j3, fVar.u, e, I(fVar, H), true, !fVar.o, fVar.d == 2 && fVar.f, dVar, j(), this.s);
    }

    private h0 E(ax.d1.f fVar, long j, long j2, d dVar) {
        long j3;
        if (fVar.e == -9223372036854775807L || fVar.r.isEmpty()) {
            j3 = 0;
        } else {
            if (!fVar.g) {
                long j4 = fVar.e;
                if (j4 != fVar.u) {
                    j3 = G(fVar.r, j4).f0;
                }
            }
            j3 = fVar.e;
        }
        long j5 = j3;
        long j6 = fVar.u;
        return new h0(j, j2, -9223372036854775807L, j6, j6, 0L, j5, true, false, true, dVar, j(), null);
    }

    private static f.d F(List<f.d> list, long j) {
        f.d dVar = null;
        for (int i = 0; i < list.size(); i++) {
            f.d dVar2 = list.get(i);
            long j2 = dVar2.f0;
            if (j2 > j || !dVar2.m0) {
                if (j2 > j) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private static f.C0275f G(List<f.C0275f> list, long j) {
        return list.get(d0.f(list, Long.valueOf(j), true, true));
    }

    private long H(ax.d1.f fVar) {
        if (fVar.p) {
            return d0.a1(d0.i0(this.q)) - fVar.e();
        }
        return 0L;
    }

    private long I(ax.d1.f fVar, long j) {
        long j2 = fVar.e;
        if (j2 == -9223372036854775807L) {
            j2 = (fVar.u + j) - d0.a1(this.s.a);
        }
        if (fVar.g) {
            return j2;
        }
        f.d F = F(fVar.s, j2);
        if (F != null) {
            return F.f0;
        }
        if (fVar.r.isEmpty()) {
            return 0L;
        }
        f.C0275f G = G(fVar.r, j2);
        f.d F2 = F(G.n0, j2);
        return F2 != null ? F2.f0 : G.f0;
    }

    private static long J(ax.d1.f fVar, long j) {
        long j2;
        f.h hVar = fVar.v;
        long j3 = fVar.e;
        if (j3 != -9223372036854775807L) {
            j2 = fVar.u - j3;
        } else {
            long j4 = hVar.d;
            if (j4 == -9223372036854775807L || fVar.n == -9223372036854775807L) {
                long j5 = hVar.c;
                j2 = j5 != -9223372036854775807L ? j5 : fVar.m * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K(ax.d1.f r6, long r7) {
        /*
            r5 = this;
            ax.P0.y r0 = r5.j()
            ax.P0.y$g r0 = r0.d
            float r1 = r0.d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            ax.d1.f$h r6 = r6.v
            long r0 = r6.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2a
            long r0 = r6.d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = 0
        L2b:
            ax.P0.y$g$a r0 = new ax.P0.y$g$a
            r0.<init>()
            long r7 = ax.S0.d0.E1(r7)
            ax.P0.y$g$a r7 = r0.k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L3f:
            ax.P0.y$g r0 = r5.s
            float r0 = r0.d
        L43:
            ax.P0.y$g$a r7 = r7.j(r0)
            if (r6 == 0) goto L4a
            goto L4e
        L4a:
            ax.P0.y$g r6 = r5.s
            float r8 = r6.e
        L4e:
            ax.P0.y$g$a r6 = r7.h(r8)
            ax.P0.y$g r6 = r6.f()
            r5.s = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.K(ax.d1.f, long):void");
    }

    @Override // ax.i1.AbstractC2211a
    protected void A(z zVar) {
        this.t = zVar;
        this.k.c((Looper) C0968a.e(Looper.myLooper()), x());
        this.k.k();
        this.p.d(((C0915y.h) C0968a.e(j().b)).a, u(null), this);
    }

    @Override // ax.i1.AbstractC2211a
    protected void C() {
        this.p.stop();
        this.k.d();
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public synchronized void a(C0915y c0915y) {
        this.u = c0915y;
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        ((g) interfaceC2206C).D();
    }

    @Override // ax.d1.m.e
    public void f(ax.d1.f fVar) {
        long E1 = fVar.p ? d0.E1(fVar.h) : -9223372036854775807L;
        int i = fVar.d;
        long j = (i == 2 || i == 1) ? E1 : -9223372036854775807L;
        d dVar = new d((ax.d1.i) C0968a.e(this.p.h()), fVar);
        B(this.p.g() ? D(fVar, j, E1, dVar) : E(fVar, j, E1, dVar));
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        N.a u = u(bVar);
        return new g(this.h, this.p, this.i, this.t, null, this.k, s(bVar), this.l, u, bVar2, this.j, this.m, this.n, this.o, x(), this.r);
    }

    @Override // ax.i1.InterfaceC2209F
    public synchronized C0915y j() {
        return this.u;
    }

    @Override // ax.i1.InterfaceC2209F
    public void k() throws IOException {
        this.p.l();
    }

    private HlsMediaSource(C0915y c0915y, ax.c1.d dVar, ax.c1.e eVar, InterfaceC2220j interfaceC2220j, ax.m1.f fVar, w wVar, ax.m1.m mVar, m mVar2, long j, boolean z, int i, boolean z2, long j2) {
        this.u = c0915y;
        this.s = c0915y.d;
        this.i = dVar;
        this.h = eVar;
        this.j = interfaceC2220j;
        this.k = wVar;
        this.l = mVar;
        this.p = mVar2;
        this.q = j;
        this.m = z;
        this.n = i;
        this.o = z2;
        this.r = j2;
    }
}
