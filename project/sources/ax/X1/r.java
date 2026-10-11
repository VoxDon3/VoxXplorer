package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;

/* loaded from: classes.dex */
public final class r implements InterfaceC1152m {
    private final String a;
    private U c;
    private boolean d;
    private int f;
    private int g;
    private final ax.S0.G b = new ax.S0.G(10);
    private long e = -9223372036854775807L;

    public r(String str) {
        this.a = str;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.d = false;
        this.e = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        C0968a.i(this.c);
        if (this.d) {
            int a = g.a();
            int i = this.g;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(g.f(), g.g(), this.b.f(), this.g, min);
                if (this.g + min == 10) {
                    this.b.b0(0);
                    if (73 != this.b.M() || 68 != this.b.M() || 51 != this.b.M()) {
                        C0987u.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        this.b.c0(3);
                        this.f = this.b.L() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.f - this.g);
            this.c.g(g, min2);
            this.g += min2;
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        U u = interfaceC2859t.u(dVar.c(), 5);
        this.c = u;
        u.e(new C0912v.b().j0(dVar.b()).W(this.a).y0("application/id3").P());
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        int i;
        C0968a.i(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            C0968a.g(this.e != -9223372036854775807L);
            this.c.f(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = j;
        this.f = 0;
        this.g = 0;
    }
}
