package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.U0.g;
import ax.i1.InterfaceC2206C;
import ax.i1.N;
import ax.l1.InterfaceC2445D;
import ax.m1.m;
import ax.m1.o;
import ax.n1.InterfaceExecutorC2572c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class i0 implements InterfaceC2206C, o.b<c> {
    private final g.a c0;
    private final ax.U0.z d0;
    private final ax.m1.m e0;
    private final N.a f0;
    private final q0 g0;
    private final ArrayList<b> h0 = new ArrayList<>();
    private final long i0;
    final ax.m1.o j0;
    final C0912v k0;
    final boolean l0;
    boolean m0;
    byte[] n0;
    int o0;
    private final ax.U0.k q;

    private final class b implements e0 {
        private int a;
        private boolean b;

        private b() {
        }

        private void d() {
            if (this.b) {
                return;
            }
            i0.this.f0.j(ax.P0.D.k(i0.this.k0.o), i0.this.k0, 0, null, 0L);
            this.b = true;
        }

        @Override // ax.i1.e0
        public int a(ax.Y0.O o, ax.V0.i iVar, int i) {
            d();
            i0 i0Var = i0.this;
            boolean z = i0Var.m0;
            if (z && i0Var.n0 == null) {
                this.a = 2;
            }
            int i2 = this.a;
            if (i2 == 2) {
                iVar.n(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                o.b = i0Var.k0;
                this.a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            C0968a.e(i0Var.n0);
            iVar.n(1);
            iVar.g0 = 0L;
            if ((i & 4) == 0) {
                iVar.C(i0.this.o0);
                ByteBuffer byteBuffer = iVar.e0;
                i0 i0Var2 = i0.this;
                byteBuffer.put(i0Var2.n0, 0, i0Var2.o0);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }

        @Override // ax.i1.e0
        public void b() throws IOException {
            i0 i0Var = i0.this;
            if (i0Var.l0) {
                return;
            }
            i0Var.j0.j();
        }

        @Override // ax.i1.e0
        public int c(long j) {
            d();
            if (j <= 0 || this.a == 2) {
                return 0;
            }
            this.a = 2;
            return 1;
        }

        public void e() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override // ax.i1.e0
        public boolean isReady() {
            return i0.this.m0;
        }
    }

    public i0(ax.U0.k kVar, g.a aVar, ax.U0.z zVar, C0912v c0912v, long j, ax.m1.m mVar, N.a aVar2, boolean z, InterfaceExecutorC2572c interfaceExecutorC2572c) {
        this.q = kVar;
        this.c0 = aVar;
        this.d0 = zVar;
        this.k0 = c0912v;
        this.i0 = j;
        this.e0 = mVar;
        this.f0 = aVar2;
        this.l0 = z;
        this.g0 = new q0(new ax.P0.P(c0912v));
        this.j0 = interfaceExecutorC2572c != null ? new ax.m1.o(interfaceExecutorC2572c) : new ax.m1.o("SingleSampleMediaPeriod");
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        if (this.m0 || this.j0.i() || this.j0.h()) {
            return false;
        }
        ax.U0.g a2 = this.c0.a();
        ax.U0.z zVar = this.d0;
        if (zVar != null) {
            a2.d(zVar);
        }
        this.j0.n(new c(this.q, a2), this, this.e0.c(1));
        return true;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return (this.m0 || this.j0.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.j0.i();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        return this.m0 ? Long.MIN_VALUE : 0L;
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC2445DArr.length; i++) {
            e0 e0Var = e0VarArr[i];
            if (e0Var != null && (interfaceC2445DArr[i] == null || !zArr[i])) {
                this.h0.remove(e0Var);
                e0VarArr[i] = null;
            }
            if (e0VarArr[i] == null && interfaceC2445DArr[i] != null) {
                b bVar = new b();
                this.h0.add(bVar);
                e0VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // ax.m1.o.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void p(c cVar, long j, long j2, boolean z) {
        ax.U0.y yVar = cVar.c;
        C2234y c2234y = new C2234y(cVar.a, cVar.b, yVar.r(), yVar.s(), j, j2, yVar.q());
        this.e0.a(cVar.a);
        this.f0.m(c2234y, 1, -1, null, 0, null, 0L, this.i0);
    }

    @Override // ax.m1.o.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void r(c cVar, long j, long j2) {
        this.o0 = (int) cVar.c.q();
        this.n0 = (byte[]) C0968a.e(cVar.d);
        this.m0 = true;
        ax.U0.y yVar = cVar.c;
        C2234y c2234y = new C2234y(cVar.a, cVar.b, yVar.r(), yVar.s(), j, j2, this.o0);
        this.e0.a(cVar.a);
        this.f0.p(c2234y, 1, -1, this.k0, 0, null, 0L, this.i0);
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        for (int i = 0; i < this.h0.size(); i++) {
            this.h0.get(i).e();
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        aVar.f(this);
    }

    @Override // ax.m1.o.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o.c j(c cVar, long j, long j2, IOException iOException, int i) {
        o.c g;
        ax.U0.y yVar = cVar.c;
        C2234y c2234y = new C2234y(cVar.a, cVar.b, yVar.r(), yVar.s(), j, j2, yVar.q());
        long b2 = this.e0.b(new m.c(c2234y, new C2205B(1, -1, this.k0, 0, null, 0L, ax.S0.d0.E1(this.i0)), iOException, i));
        boolean z = b2 == -9223372036854775807L || i >= this.e0.c(1);
        if (this.l0 && z) {
            C0987u.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.m0 = true;
            g = ax.m1.o.f;
        } else {
            g = b2 != -9223372036854775807L ? ax.m1.o.g(false, b2) : ax.m1.o.g;
        }
        o.c cVar2 = g;
        boolean c2 = cVar2.c();
        this.f0.r(c2234y, 1, -1, this.k0, 0, null, 0L, this.i0, iOException, !c2);
        if (!c2) {
            this.e0.a(cVar.a);
        }
        return cVar2;
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        return -9223372036854775807L;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return this.g0;
    }

    @Override // ax.m1.o.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(c cVar, long j, long j2, int i) {
        ax.U0.y yVar = cVar.c;
        this.f0.v(i == 0 ? new C2234y(cVar.a, cVar.b, j) : new C2234y(cVar.a, cVar.b, yVar.r(), yVar.s(), j, j2, yVar.q()), 1, -1, this.k0, 0, null, 0L, this.i0, i);
    }

    public void w() {
        this.j0.l();
    }

    static final class c implements o.e {
        public final long a = C2234y.a();
        public final ax.U0.k b;
        private final ax.U0.y c;
        private byte[] d;

        public c(ax.U0.k kVar, ax.U0.g gVar) {
            this.b = kVar;
            this.c = new ax.U0.y(gVar);
        }

        @Override // ax.m1.o.e
        public void a() throws IOException {
            this.c.t();
            try {
                this.c.f(this.b);
                int i = 0;
                while (i != -1) {
                    int q = (int) this.c.q();
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (q == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    ax.U0.y yVar = this.c;
                    byte[] bArr2 = this.d;
                    i = yVar.c(bArr2, q, bArr2.length - q);
                }
                ax.U0.j.a(this.c);
            } catch (Throwable th) {
                ax.U0.j.a(this.c);
                throw th;
            }
        }

        @Override // ax.m1.o.e
        public void c() {
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() {
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
    }
}
