package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.S0.C0968a;
import ax.i1.InterfaceC2206C;
import ax.l1.InterfaceC2445D;
import java.io.IOException;

/* loaded from: classes.dex */
final class l0 implements InterfaceC2206C, InterfaceC2206C.a {
    private final long c0;
    private InterfaceC2206C.a d0;
    private final InterfaceC2206C q;

    private static final class a implements e0 {
        private final e0 a;
        private final long b;

        public a(e0 e0Var, long j) {
            this.a = e0Var;
            this.b = j;
        }

        @Override // ax.i1.e0
        public int a(ax.Y0.O o, ax.V0.i iVar, int i) {
            int a = this.a.a(o, iVar, i);
            if (a == -4) {
                iVar.g0 += this.b;
            }
            return a;
        }

        @Override // ax.i1.e0
        public void b() throws IOException {
            this.a.b();
        }

        @Override // ax.i1.e0
        public int c(long j) {
            return this.a.c(j - this.b);
        }

        public e0 d() {
            return this.a;
        }

        @Override // ax.i1.e0
        public boolean isReady() {
            return this.a.isReady();
        }
    }

    public l0(InterfaceC2206C interfaceC2206C, long j) {
        this.q = interfaceC2206C;
        this.c0 = j;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        return this.q.a(c0618p0.a().f(c0618p0.a - this.c0).d());
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        long b = this.q.b();
        if (b == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b + this.c0;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.q.c();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        long d = this.q.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.c0;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
        this.q.e(j - this.c0);
    }

    @Override // ax.i1.InterfaceC2206C.a
    public void f(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) C0968a.e(this.d0)).f(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        e0[] e0VarArr2 = new e0[e0VarArr.length];
        int i = 0;
        while (true) {
            e0 e0Var = null;
            if (i >= e0VarArr.length) {
                break;
            }
            a aVar = (a) e0VarArr[i];
            if (aVar != null) {
                e0Var = aVar.d();
            }
            e0VarArr2[i] = e0Var;
            i++;
        }
        long g = this.q.g(interfaceC2445DArr, zArr, e0VarArr2, zArr2, j - this.c0);
        for (int i2 = 0; i2 < e0VarArr.length; i2++) {
            e0 e0Var2 = e0VarArr2[i2];
            if (e0Var2 == null) {
                e0VarArr[i2] = null;
            } else {
                e0 e0Var3 = e0VarArr[i2];
                if (e0Var3 == null || ((a) e0Var3).d() != e0Var2) {
                    e0VarArr[i2] = new a(e0Var2, this.c0);
                }
            }
        }
        return g + this.c0;
    }

    public InterfaceC2206C j() {
        return this.q;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        this.q.l();
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        return this.q.m(j - this.c0) + this.c0;
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.d0 = aVar;
        this.q.n(this, j - this.c0);
    }

    @Override // ax.i1.f0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) C0968a.e(this.d0)).i(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        return this.q.q(j - this.c0, z) + this.c0;
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        long s = this.q.s();
        if (s == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return s + this.c0;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return this.q.t();
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        this.q.v(j - this.c0, z);
    }
}
