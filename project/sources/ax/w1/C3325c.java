package ax.w1;

import android.net.Uri;
import ax.N1.t;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.N;
import ax.q1.r;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: ax.w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3325c implements r {
    public static final InterfaceC2863x q = new InterfaceC2863x() { // from class: ax.w1.b
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return C3325c.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private InterfaceC2859t f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private C3323a o;
    private C3328f p;
    private final G a = new G(4);
    private final G b = new G(9);
    private final G c = new G(11);
    private final G d = new G();
    private final C3326d e = new C3326d();
    private int g = 1;

    public static /* synthetic */ r[] g() {
        return new r[]{new C3325c()};
    }

    private void h() {
        if (this.n) {
            return;
        }
        this.f.h(new N.b(-9223372036854775807L));
        this.n = true;
    }

    private long i() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    private G j(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.l > this.d.b()) {
            G g = this.d;
            g.Z(new byte[Math.max(g.b() * 2, this.l)], 0);
        } else {
            this.d.b0(0);
        }
        this.d.a0(this.l);
        interfaceC2858s.readFully(this.d.f(), 0, this.l);
        return this.d;
    }

    private boolean l(InterfaceC2858s interfaceC2858s) throws IOException {
        if (!interfaceC2858s.e(this.b.f(), 0, 9, true)) {
            return false;
        }
        this.b.b0(0);
        this.b.c0(4);
        int M = this.b.M();
        boolean z = (M & 4) != 0;
        boolean z2 = (M & 1) != 0;
        if (z && this.o == null) {
            this.o = new C3323a(this.f.u(8, 1));
        }
        if (z2 && this.p == null) {
            this.p = new C3328f(this.f.u(9, 2));
        }
        this.f.o();
        this.j = this.b.v() - 5;
        this.g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m(ax.q1.InterfaceC2858s r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.i()
            int r2 = r9.k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            ax.w1.a r3 = r9.o
            if (r3 == 0) goto L23
            r9.h()
            ax.w1.a r2 = r9.o
            ax.S0.G r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = 1
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            ax.w1.f r3 = r9.p
            if (r3 == 0) goto L39
            r9.h()
            ax.w1.f r2 = r9.p
            ax.S0.G r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.n
            if (r2 != 0) goto L6e
            ax.w1.d r2 = r9.e
            ax.S0.G r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            ax.w1.d r0 = r9.e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            ax.q1.t r2 = r9.f
            ax.q1.I r3 = new ax.q1.I
            ax.w1.d r7 = r9.e
            long[] r7 = r7.e()
            ax.w1.d r8 = r9.e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.h(r3)
            r9.n = r6
            goto L21
        L6e:
            int r0 = r9.l
            r10.n(r0)
            r10 = 0
            r0 = 0
        L75:
            boolean r1 = r9.h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.h = r6
            ax.w1.d r10 = r9.e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.i = r1
        L8f:
            r10 = 4
            r9.j = r10
            r10 = 2
            r9.g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w1.C3325c.m(ax.q1.s):boolean");
    }

    private boolean n(InterfaceC2858s interfaceC2858s) throws IOException {
        if (!interfaceC2858s.e(this.c.f(), 0, 11, true)) {
            return false;
        }
        this.c.b0(0);
        this.k = this.c.M();
        this.l = this.c.P();
        this.m = this.c.P();
        this.m = ((this.c.M() << 24) | this.m) * 1000;
        this.c.c0(3);
        this.g = 4;
        return true;
    }

    private void o(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.n(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.f = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.p(this.a.f(), 0, 3);
        this.a.b0(0);
        if (this.a.P() != 4607062) {
            return false;
        }
        interfaceC2858s.p(this.a.f(), 0, 2);
        this.a.b0(0);
        if ((this.a.U() & 250) != 0) {
            return false;
        }
        interfaceC2858s.p(this.a.f(), 0, 4);
        this.a.b0(0);
        int v = this.a.v();
        interfaceC2858s.m();
        interfaceC2858s.j(v);
        interfaceC2858s.p(this.a.f(), 0, 4);
        this.a.b0(0);
        return this.a.v() == 0;
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        C0968a.i(this.f);
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    o(interfaceC2858s);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (m(interfaceC2858s)) {
                        return 0;
                    }
                } else if (!n(interfaceC2858s)) {
                    return -1;
                }
            } else if (!l(interfaceC2858s)) {
                return -1;
            }
        }
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
