package androidx.media3.exoplayer.hls;

import ax.S0.C0968a;
import ax.Y0.O;
import ax.i1.e0;
import java.io.IOException;

/* loaded from: classes.dex */
final class h implements e0 {
    private final int a;
    private final l b;
    private int c = -1;

    public h(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    private boolean e() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // ax.i1.e0
    public int a(O o, ax.V0.i iVar, int i) {
        if (this.c == -3) {
            iVar.n(4);
            return -4;
        }
        if (e()) {
            return this.b.i0(this.c, o, iVar, i);
        }
        return -3;
    }

    @Override // ax.i1.e0
    public void b() throws IOException {
        int i = this.c;
        if (i == -2) {
            throw new ax.c1.i(this.b.t().c(this.a).b(0).o);
        }
        if (i == -1) {
            this.b.X();
        } else if (i != -3) {
            this.b.Y(i);
        }
    }

    @Override // ax.i1.e0
    public int c(long j) {
        if (e()) {
            return this.b.s0(this.c, j);
        }
        return 0;
    }

    public void d() {
        C0968a.a(this.c == -1);
        this.c = this.b.A(this.a);
    }

    public void f() {
        if (this.c != -1) {
            this.b.t0(this.a);
            this.c = -1;
        }
    }

    @Override // ax.i1.e0
    public boolean isReady() {
        if (this.c != -3) {
            return e() && this.b.S(this.c);
        }
        return true;
    }
}
