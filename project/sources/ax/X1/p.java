package ax.X1;

import android.util.SparseArray;
import ax.P0.C0901j;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.S0.d0;
import ax.T0.h;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements InterfaceC1152m {
    private final G a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private long h;
    private String j;
    private U k;
    private b l;
    private boolean m;
    private boolean o;
    private final boolean[] i = new boolean[3];
    private final w e = new w(7, 128);
    private final w f = new w(8, 128);
    private final w g = new w(6, 128);
    private long n = -9223372036854775807L;
    private final ax.S0.G p = new ax.S0.G();

    private static final class b {
        private final U a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<h.m> d = new SparseArray<>();
        private final SparseArray<h.l> e = new SparseArray<>();
        private final ax.T0.j f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m;
        private a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;
        private boolean s;

        private static final class a {
            private boolean a;
            private boolean b;
            private h.m c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.a) {
                    return false;
                }
                if (!aVar.a) {
                    return true;
                }
                h.m mVar = (h.m) C0968a.i(this.c);
                h.m mVar2 = (h.m) C0968a.i(aVar.c);
                return (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = mVar.n) != 0 || mVar2.n != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || mVar2.n != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == aVar.k && (!z || this.l == aVar.l))))) ? false : true;
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public boolean d() {
                if (!this.b) {
                    return false;
                }
                int i = this.e;
                return i == 7 || i == 2;
            }

            public void e(h.m mVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = mVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public b(U u, boolean z, boolean z2) {
            this.a = u;
            this.b = z;
            this.c = z2;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new ax.T0.j(bArr, 0, 0);
            g();
        }

        private void d(int i) {
            long j = this.q;
            if (j != -9223372036854775807L) {
                long j2 = this.j;
                long j3 = this.p;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.f(j, this.r ? 1 : 0, i2, i, null);
            }
        }

        private void h() {
            boolean d = this.b ? this.n.d() : this.s;
            boolean z = this.r;
            int i = this.i;
            boolean z2 = true;
            if (i != 5 && (!d || i != 1)) {
                z2 = false;
            }
            this.r = z | z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.X1.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j, int i, boolean z) {
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (z && this.o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            h();
            this.i = 24;
            return this.r;
        }

        public boolean c() {
            return this.c;
        }

        public void e(h.l lVar) {
            this.e.append(lVar.a, lVar);
        }

        public void f(h.m mVar) {
            this.d.append(mVar.d, mVar);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void i(long j, int i, long j2, boolean z) {
            this.i = i;
            this.l = j2;
            this.j = j;
            this.s = z;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public p(G g, boolean z, boolean z2, String str) {
        this.a = g;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    private void a() {
        C0968a.i(this.k);
        d0.i(this.l);
    }

    private void g(long j, int i, int i2, long j2) {
        if (!this.m || this.l.c()) {
            this.e.b(i2);
            this.f.b(i2);
            if (this.m) {
                if (this.e.c()) {
                    w wVar = this.e;
                    h.m C = ax.T0.h.C(wVar.d, 3, wVar.e);
                    this.a.f(C.t);
                    this.l.f(C);
                    this.e.d();
                } else if (this.f.c()) {
                    w wVar2 = this.f;
                    this.l.e(ax.T0.h.A(wVar2.d, 3, wVar2.e));
                    this.f.d();
                }
            } else if (this.e.c() && this.f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.e;
                arrayList.add(Arrays.copyOf(wVar3.d, wVar3.e));
                w wVar4 = this.f;
                arrayList.add(Arrays.copyOf(wVar4.d, wVar4.e));
                w wVar5 = this.e;
                h.m C2 = ax.T0.h.C(wVar5.d, 3, wVar5.e);
                w wVar6 = this.f;
                h.l A = ax.T0.h.A(wVar6.d, 3, wVar6.e);
                this.k.e(new C0912v.b().j0(this.j).W(this.d).y0("video/avc").U(C0976i.f(C2.a, C2.b, C2.c)).F0(C2.f).h0(C2.g).V(new C0901j.b().d(C2.q).c(C2.r).e(C2.s).g(C2.i + 8).b(C2.j + 8).a()).u0(C2.h).k0(arrayList).p0(C2.t).P());
                this.m = true;
                this.a.f(C2.t);
                this.l.f(C2);
                this.l.e(A);
                this.e.d();
                this.f.d();
            }
        }
        if (this.g.b(i2)) {
            w wVar7 = this.g;
            this.p.Z(this.g.d, ax.T0.h.L(wVar7.d, wVar7.e));
            this.p.b0(4);
            this.a.c(j2, this.p);
        }
        if (this.l.b(j, i, this.m)) {
            this.o = false;
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        if (!this.m || this.l.c()) {
            this.e.a(bArr, i, i2);
            this.f.a(bArr, i, i2);
        }
        this.g.a(bArr, i, i2);
        this.l.a(bArr, i, i2);
    }

    private void i(long j, int i, long j2) {
        if (!this.m || this.l.c()) {
            this.e.e(i);
            this.f.e(i);
        }
        this.g.e(i);
        this.l.i(j, i, j2, this.o);
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.h = 0L;
        this.o = false;
        this.n = -9223372036854775807L;
        ax.T0.h.c(this.i);
        this.e.d();
        this.f.d();
        this.g.d();
        this.a.b();
        b bVar = this.l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        int i;
        a();
        int g2 = g.g();
        int j = g.j();
        byte[] f = g.f();
        this.h += g.a();
        this.k.g(g, g.a());
        while (true) {
            int e = ax.T0.h.e(f, g2, j, this.i);
            if (e == j) {
                h(f, g2, j);
                return;
            }
            int j2 = ax.T0.h.j(f, e);
            if (e <= 0 || f[e - 1] != 0) {
                i = 3;
            } else {
                e--;
                i = 4;
            }
            int i2 = e;
            int i3 = i2 - g2;
            if (i3 > 0) {
                h(f, g2, i2);
            }
            int i4 = j - i2;
            long j3 = this.h - i4;
            g(j3, i4, i3 < 0 ? -i3 : 0, this.n);
            i(j3, j2, this.n);
            g2 = i2 + i;
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.j = dVar.b();
        U u = interfaceC2859t.u(dVar.c(), 2);
        this.k = u;
        this.l = new b(u, this.b, this.c);
        this.a.d(interfaceC2859t, dVar);
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        a();
        if (z) {
            this.a.e();
            g(this.h, 0, 0, this.n);
            i(this.h, 9, this.n);
            g(this.h, 0, 0, this.n);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.n = j;
        this.o |= (i & 2) != 0;
    }
}
